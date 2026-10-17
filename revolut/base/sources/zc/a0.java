package zc;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
public final class a0 extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f320966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f320967c;
    public final /* synthetic */ c d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(c cVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, z zVar) {
        super(taskCompletionSource);
        this.f320966b = taskCompletionSource2;
        this.f320967c = zVar;
        this.d = cVar;
    }

    @Override // zc.z
    public final void b() {
        synchronized (this.d.f) {
            try {
                c cVar = this.d;
                TaskCompletionSource taskCompletionSource = this.f320966b;
                cVar.e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new rul.e(cVar, taskCompletionSource));
                if (this.d.f320976l.getAndIncrement() > 0) {
                    this.d.f320971b.b("Already connected to the service.", new Object[0]);
                }
                c.b(this.d, this.f320967c);
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
