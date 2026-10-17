package wc;

import defpackage.i0;

/* JADX INFO: loaded from: classes16.dex */
public final class b extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f296276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f296277c;

    public /* synthetic */ b(Object obj2, int i) {
        this.f296276b = i;
        this.f296277c = obj2;
    }

    @Override // wc.s
    public final void c() {
        switch (this.f296276b) {
            case 0:
                c cVar = (c) ((i0) this.f296277c).f157269b;
                cVar.f296280b.e("unlinkToDeath", new Object[0]);
                cVar.f296286m.asBinder().unlinkToDeath(cVar.f296284j, 0);
                cVar.f296286m = null;
                cVar.f296282g = false;
                return;
            default:
                synchronized (((c) this.f296277c).f) {
                    try {
                        if (((c) this.f296277c).k.get() > 0 && ((c) this.f296277c).k.decrementAndGet() > 0) {
                            ((c) this.f296277c).f296280b.e("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        c cVar2 = (c) this.f296277c;
                        if (cVar2.f296286m != null) {
                            cVar2.f296280b.e("Unbind from service.", new Object[0]);
                            c cVar3 = (c) this.f296277c;
                            cVar3.f296279a.unbindService(cVar3.f296285l);
                            c cVar4 = (c) this.f296277c;
                            cVar4.f296282g = false;
                            cVar4.f296286m = null;
                            cVar4.f296285l = null;
                        }
                        ((c) this.f296277c).d();
                        return;
                    } finally {
                    }
                }
        }
    }
}
