package pc;

import defpackage.i0;

/* JADX INFO: loaded from: classes16.dex */
public final class n extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f234766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f234767c;

    public /* synthetic */ n(Object obj2, int i) {
        this.f234766b = i;
        this.f234767c = obj2;
    }

    @Override // pc.l
    public final void a() {
        switch (this.f234766b) {
            case 0:
                synchronized (((p) this.f234767c).f) {
                    try {
                        if (((p) this.f234767c).k.get() > 0 && ((p) this.f234767c).k.decrementAndGet() > 0) {
                            ((p) this.f234767c).f234772b.e("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        p pVar = (p) this.f234767c;
                        if (pVar.f234778m != null) {
                            pVar.f234772b.e("Unbind from service.", new Object[0]);
                            p pVar2 = (p) this.f234767c;
                            pVar2.f234771a.unbindService(pVar2.f234777l);
                            p pVar3 = (p) this.f234767c;
                            pVar3.f234774g = false;
                            pVar3.f234778m = null;
                            pVar3.f234777l = null;
                        }
                        ((p) this.f234767c).d();
                        return;
                    } finally {
                    }
                }
            default:
                p pVar4 = (p) ((i0) this.f234767c).f157269b;
                pVar4.f234772b.e("unlinkToDeath", new Object[0]);
                pVar4.f234778m.asBinder().unlinkToDeath(pVar4.f234776j, 0);
                pVar4.f234778m = null;
                pVar4.f234774g = false;
                return;
        }
    }
}
