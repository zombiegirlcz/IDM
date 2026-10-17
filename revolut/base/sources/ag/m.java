package ag;

import android.text.format.DateUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f4704j = TimeUnit.HOURS.toSeconds(12);
    public static final int[] k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final df.e f4705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cf.b f4706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f4707c;
    public final Clock d;
    public final Random e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConfigFetchHttpClient f4708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u f4709h;
    public final Map i;

    public m(df.e eVar, cf.b bVar, Executor executor, Clock clock, Random random, e eVar2, ConfigFetchHttpClient configFetchHttpClient, u uVar, HashMap map) {
        this.f4705a = eVar;
        this.f4706b = bVar;
        this.f4707c = executor;
        this.d = clock;
        this.e = random;
        this.f = eVar2;
        this.f4708g = configFetchHttpClient;
        this.f4709h = uVar;
        this.i = map;
    }

    public final Task a(long j2) {
        HashMap map = new HashMap(this.i);
        map.put("X-Firebase-RC-Fetch-Type", l.BASE.a() + "/1");
        return this.f.b().continueWithTask(this.f4707c, new h(this, j2, map));
    }

    public final k b(String str, String str2, Date date, HashMap map) throws FirebaseRemoteConfigException {
        String str3;
        ConfigFetchHttpClient configFetchHttpClient = this.f4708g;
        u uVar = this.f4709h;
        try {
            HttpURLConnection httpURLConnectionB = configFetchHttpClient.b();
            HashMap mapE = e();
            String strE = uVar.e();
            td.b bVar = (td.b) this.f4706b.get();
            k kVarFetch = configFetchHttpClient.fetch(httpURLConnectionB, str, str2, mapE, strE, map, bVar != null ? (Long) ((td.c) bVar).f269904a.getUserProperties(null, null, true).get("_fot") : null, date, uVar.b());
            g gVar = kVarFetch.f4702b;
            if (gVar != null) {
                uVar.m(gVar.f);
            }
            String str4 = kVarFetch.f4703c;
            if (str4 != null) {
                uVar.l(str4);
            }
            uVar.j();
            return kVarFetch;
        } catch (FirebaseRemoteConfigServerException e) {
            int i = e.f49613a;
            if (i == 429 || i == 502 || i == 503 || i == 504) {
                int iB = uVar.a().b() + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = k;
                long millis = timeUnit.toMillis(iArr[Math.min(iB, iArr.length) - 1]);
                uVar.k(new Date(date.getTime() + (millis / 2) + ((long) this.e.nextInt((int) millis))), iB);
            }
            t tVarA = uVar.a();
            if (tVarA.b() > 1 || i == 429) {
                tVarA.a().getTime();
                throw new FirebaseRemoteConfigFetchThrottledException();
            }
            if (i == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (i == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else {
                if (i == 429) {
                    throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
                if (i != 500) {
                    switch (i) {
                        case 502:
                        case 503:
                        case 504:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
            }
            throw new FirebaseRemoteConfigServerException(i, "Fetch failed: ".concat(str3), e);
        }
    }

    public final Task c(Task task, long j2, final HashMap map) {
        Task taskContinueWithTask;
        final Date date = new Date(this.d.currentTimeMillis());
        boolean zIsSuccessful = task.isSuccessful();
        u uVar = this.f4709h;
        if (zIsSuccessful) {
            Date dateF = uVar.f();
            if (dateF.equals(u.e) ? false : date.before(new Date(TimeUnit.SECONDS.toMillis(j2) + dateF.getTime()))) {
                return Tasks.forResult(new k(2, null, null));
            }
        }
        Date dateA = uVar.a().a();
        Date date2 = date.before(dateA) ? dateA : null;
        Executor executor = this.f4707c;
        if (date2 != null) {
            String str = "Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date2.getTime() - date.getTime()));
            date2.getTime();
            taskContinueWithTask = Tasks.forException(new FirebaseRemoteConfigFetchThrottledException(str));
        } else {
            df.d dVar = (df.d) this.f4705a;
            final Task taskC = dVar.c();
            final Task taskD = dVar.d();
            taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{taskC, taskD}).continueWithTask(executor, new Continuation() { // from class: ag.i
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    m mVar = this.f4696a;
                    Date date3 = date;
                    HashMap map2 = map;
                    Task task3 = taskC;
                    if (!task3.isSuccessful()) {
                        return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", task3.getException()));
                    }
                    Task task4 = taskD;
                    if (!task4.isSuccessful()) {
                        return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", task4.getException()));
                    }
                    try {
                        k kVarB = mVar.b((String) task3.getResult(), ((df.a) task4.getResult()).f113718a, date3, map2);
                        if (kVarB.f4701a != 0) {
                            return Tasks.forResult(kVarB);
                        }
                        e eVar = mVar.f;
                        g gVar = kVarB.f4702b;
                        Executor executor2 = eVar.f4682a;
                        return Tasks.call(executor2, new d(eVar, gVar, 0)).onSuccessTask(executor2, new ae.a(eVar, gVar, 1)).onSuccessTask(mVar.f4707c, new j(kVarB, 0));
                    } catch (FirebaseRemoteConfigException e) {
                        return Tasks.forException(e);
                    }
                }
            });
        }
        return taskContinueWithTask.continueWithTask(executor, new ae.a(this, date, 2));
    }

    public final Task d(l lVar, int i) {
        HashMap map = new HashMap(this.i);
        map.put("X-Firebase-RC-Fetch-Type", lVar.a() + "/" + i);
        return this.f.b().continueWithTask(this.f4707c, new abf.c(this, map, 1));
    }

    public final HashMap e() {
        HashMap map = new HashMap();
        td.b bVar = (td.b) this.f4706b.get();
        if (bVar != null) {
            for (Map.Entry<String, Object> entry : ((td.c) bVar).f269904a.getUserProperties(null, null, false).entrySet()) {
                map.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }
}
