package zc;

import defpackage.i0;

/* JADX INFO: loaded from: classes16.dex */
public final class b extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f320968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f320969c;

    public /* synthetic */ b(Object obj2, int i) {
        this.f320968b = i;
        this.f320969c = obj2;
    }

    @Override // zc.z
    public final void b() {
        switch (this.f320968b) {
            case 0:
                c cVar = (c) ((i0) this.f320969c).f157269b;
                cVar.f320971b.b("unlinkToDeath", new Object[0]);
                cVar.f320978n.asBinder().unlinkToDeath(cVar.k, 0);
                cVar.f320978n = null;
                cVar.f320973g = false;
                return;
            default:
                synchronized (((c) this.f320969c).f) {
                    try {
                        if (((c) this.f320969c).f320976l.get() > 0 && ((c) this.f320969c).f320976l.decrementAndGet() > 0) {
                            ((c) this.f320969c).f320971b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        c cVar2 = (c) this.f320969c;
                        if (cVar2.f320978n != null) {
                            cVar2.f320971b.b("Unbind from service.", new Object[0]);
                            c cVar3 = (c) this.f320969c;
                            cVar3.f320970a.unbindService(cVar3.f320977m);
                            c cVar4 = (c) this.f320969c;
                            cVar4.f320973g = false;
                            cVar4.f320978n = null;
                            cVar4.f320977m = null;
                        }
                        ((c) this.f320969c).d();
                        return;
                    } finally {
                    }
                }
        }
    }
}
