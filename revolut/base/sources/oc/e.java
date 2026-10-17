package oc;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.install.InstallException;
import pc.p;

/* JADX INFO: loaded from: classes16.dex */
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f224005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f224006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f224007c;

    public e(i iVar, d dVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.f224005a = iVar;
        this.f224006b = dVar;
        this.f224007c = context;
    }

    public final Task a() {
        String packageName = this.f224007c.getPackageName();
        i iVar = this.f224005a;
        p pVar = iVar.f224013a;
        if (pVar != null) {
            i.e.e("requestUpdateInfo(%s)", packageName);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            pVar.a().post(new g(pVar, taskCompletionSource, taskCompletionSource, new g(iVar, taskCompletionSource, packageName, taskCompletionSource)));
            return taskCompletionSource.getTask();
        }
        pc.k kVar = i.e;
        Object[] objArr = {-9};
        kVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            pc.k.f(kVar.f234763a, "onError(%d)", objArr);
        }
        return Tasks.forException(new InstallException(-9));
    }

    public final synchronized void b(cq.d dVar) {
        d dVar2 = this.f224006b;
        synchronized (dVar2) {
            dVar2.f224002a.e("registerListener", new Object[0]);
            if (dVar == null) {
                throw new NullPointerException("Registered Play Core listener should not be null.");
            }
            dVar2.d.add(dVar);
            dVar2.a();
        }
    }

    public final boolean c(a aVar, int i, Activity activity) {
        k kVarA = k.a(i);
        if (aVar == null || aVar.a(kVarA) == null || aVar.f224000j) {
            return false;
        }
        aVar.f224000j = true;
        activity.startIntentSenderForResult(aVar.a(kVarA).getIntentSender(), 1933, null, 0, 0, 0, null);
        return true;
    }
}
