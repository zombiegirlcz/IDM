package rc;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import zc.a0;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class t implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f253174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f253175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f253176c;

    public /* synthetic */ t(u uVar, long j2, long j3) {
        this.f253174a = uVar;
        this.f253175b = j2;
        this.f253176c = j3;
    }

    public final Task a(w wVar) {
        q qVar = this.f253174a.f253177a;
        long j2 = this.f253176c;
        qVar.f253169a.b("requestExpressIntegrityToken(%s)", Long.valueOf(j2));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        n nVar = new n(qVar, taskCompletionSource, wVar, this.f253175b, j2, taskCompletionSource);
        zc.c cVar = qVar.e;
        cVar.getClass();
        cVar.a().post(new a0(cVar, nVar.c(), taskCompletionSource, nVar));
        return taskCompletionSource.getTask();
    }
}
