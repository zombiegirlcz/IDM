package ie;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes17.dex */
public final class l implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f160530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f160531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Thread f160532c;
    public final /* synthetic */ fc.g d;
    public final /* synthetic */ n e;

    public l(n nVar, long j2, Throwable th10, Thread thread, fc.g gVar) {
        this.e = nVar;
        this.f160530a = j2;
        this.f160531b = th10;
        this.f160532c = thread;
        this.d = gVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        long j2 = this.f160530a;
        long j3 = j2 / 1000;
        n nVar = this.e;
        String sessionId = nVar.e();
        if (sessionId == null) {
            return Tasks.forResult(null);
        }
        nVar.f160539c.l();
        oe.c cVar = nVar.f160544m;
        cVar.getClass();
        "Persisting fatal event for session ".concat(sessionId);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
        }
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        cVar.j(this.f160531b, this.f160532c, "crash", new ke.c(sessionId, j3, r0.g()), true);
        try {
            oe.c cVar2 = nVar.f160540g;
            String str = ".ae" + j2;
            cVar2.getClass();
            if (!new File((File) cVar2.f224499c, str).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
        }
        fc.g gVar = this.d;
        nVar.b(false, gVar, false);
        nVar.c(new e().f160521a, Boolean.FALSE);
        return !nVar.f160538b.a() ? Tasks.forResult(null) : ((TaskCompletionSource) ((AtomicReference) gVar.i).get()).getTask().onSuccessTask(nVar.e.f173167a, new fkg.a(this, sessionId));
    }
}
