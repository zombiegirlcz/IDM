package ag;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f4672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f4673c;

    public b(c cVar, int i, long j2) {
        this.f4673c = cVar;
        this.f4671a = i;
        this.f4672b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final c cVar = this.f4673c;
        int i = this.f4671a;
        final long j2 = this.f4672b;
        synchronized (cVar) {
            final int i2 = i - 1;
            final Task taskD = ((m) cVar.d).d(l.REALTIME, 3 - i2);
            final Task taskB = ((e) cVar.e).b();
            Tasks.whenAllComplete((Task<?>[]) new Task[]{taskD, taskB}).continueWithTask((ScheduledExecutorService) cVar.f4677g, new Continuation() { // from class: ag.a
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) throws JSONException {
                    Boolean boolValueOf;
                    c cVar2 = cVar;
                    Task task2 = taskD;
                    Task task3 = taskB;
                    long j3 = j2;
                    int i3 = i2;
                    if (!task2.isSuccessful()) {
                        return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", (Throwable) task2.getException()));
                    }
                    if (!task3.isSuccessful()) {
                        return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", (Throwable) task3.getException()));
                    }
                    k kVar = (k) task2.getResult();
                    g gVar = (g) task3.getResult();
                    g gVar2 = kVar.f4702b;
                    if (gVar2 != null) {
                        boolValueOf = Boolean.valueOf(gVar2.f >= j3);
                    } else {
                        boolValueOf = Boolean.valueOf(kVar.f4701a == 1);
                    }
                    if (!boolValueOf.booleanValue()) {
                        cVar2.a(i3, j3);
                        return Tasks.forResult(null);
                    }
                    if (kVar.f4702b == null) {
                        return Tasks.forResult(null);
                    }
                    if (gVar == null) {
                        f fVarC = g.c();
                        gVar = new g(fVarC.f4685a, fVarC.f4686b, fVarC.f4687c, fVarC.d, fVarC.e, fVarC.f);
                    }
                    g gVar3 = kVar.f4702b;
                    JSONObject jSONObject = gVar.e;
                    JSONObject jSONObject2 = gVar3.f4689a;
                    JSONObject jSONObject3 = gVar3.f4690b;
                    JSONObject jSONObject4 = gVar3.e;
                    JSONObject jSONObject5 = g.a(new JSONObject(jSONObject2.toString())).f4690b;
                    HashMap mapB = gVar.b();
                    HashMap mapB2 = gVar3.b();
                    HashSet hashSet = new HashSet();
                    JSONObject jSONObject6 = gVar.f4690b;
                    Iterator<String> itKeys = jSONObject6.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (!jSONObject3.has(next)) {
                            hashSet.add(next);
                        } else if (!jSONObject6.get(next).equals(jSONObject3.get(next))) {
                            hashSet.add(next);
                        } else if ((jSONObject.has(next) && !jSONObject4.has(next)) || (!jSONObject.has(next) && jSONObject4.has(next))) {
                            hashSet.add(next);
                        } else if (jSONObject.has(next) && jSONObject4.has(next) && !jSONObject.getJSONObject(next).toString().equals(jSONObject4.getJSONObject(next).toString())) {
                            hashSet.add(next);
                        } else if (mapB.containsKey(next) != mapB2.containsKey(next)) {
                            hashSet.add(next);
                        } else if (mapB.containsKey(next) && mapB2.containsKey(next) && !((Map) mapB.get(next)).equals(mapB2.get(next))) {
                            hashSet.add(next);
                        } else {
                            jSONObject5.remove(next);
                        }
                    }
                    Iterator<String> itKeys2 = jSONObject5.keys();
                    while (itKeys2.hasNext()) {
                        hashSet.add(itKeys2.next());
                    }
                    if (hashSet.isEmpty()) {
                        return Tasks.forResult(null);
                    }
                    synchronized (cVar2) {
                        Iterator it8 = ((LinkedHashSet) cVar2.f4675b).iterator();
                        while (it8.hasNext()) {
                            ((r) it8.next()).getClass();
                        }
                    }
                    return Tasks.forResult(null);
                }
            });
        }
    }
}
