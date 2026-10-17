package rc;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import zc.a0;

/* JADX INFO: loaded from: classes16.dex */
public final class k implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f253158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f253159b;

    public k(q qVar, u uVar) {
        this.f253158a = qVar;
        this.f253159b = uVar;
    }

    public final Task a(v vVar) {
        long j2 = vVar.f253178a;
        Object[] objArr = {Long.valueOf(j2)};
        q qVar = this.f253158a;
        qVar.f253169a.b("warmUpIntegrityToken(%s)", objArr);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m mVar = new m(qVar, taskCompletionSource, j2, taskCompletionSource);
        zc.c cVar = qVar.e;
        cVar.getClass();
        cVar.a().post(new a0(cVar, mVar.c(), taskCompletionSource, mVar));
        return taskCompletionSource.getTask().onSuccessTask(new k7i.i(this, vVar, 21));
    }
}
