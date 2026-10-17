package qfm;

/* JADX INFO: loaded from: classes4.dex */
public final class p0 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f245502c;
    public final int d;
    public final kfm.o e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(efm.i iVar, kfm.o oVar, int i, byte b4) {
        super(iVar);
        this.f245502c = i;
        this.e = oVar;
        this.d = 1;
    }

    @Override // efm.i
    public final void o(dom.a aVar) {
        switch (this.f245502c) {
            case 0:
                this.f245362b.n(new o0(aVar, this.e, this.d));
                break;
            case 1:
                this.f245362b.n(new s0(aVar, (mic.a0) this.e, this.d));
                break;
            default:
                this.f245362b.n(new s0(aVar, (mic.a0) this.e, this.d, (byte) 0));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(efm.i iVar, kfm.o oVar, int i) {
        super(iVar);
        this.f245502c = 0;
        this.e = oVar;
        this.d = i;
    }
}
