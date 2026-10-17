package ufm;

import efm.d0;
import efm.f0;
import efm.g0;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f279871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f279872b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f279871a = i;
        this.f279872b = obj2;
    }

    @Override // efm.d0
    public final void r(f0 f0Var) {
        switch (this.f279871a) {
            case 0:
                a aVar = new a(f0Var);
                f0Var.onSubscribe(aVar);
                try {
                    ((g0) this.f279872b).subscribe(aVar);
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    aVar.a(th10);
                    return;
                }
                break;
            default:
                f0Var.onSubscribe(lfm.e.INSTANCE);
                f0Var.onSuccess(this.f279872b);
                break;
        }
    }
}
