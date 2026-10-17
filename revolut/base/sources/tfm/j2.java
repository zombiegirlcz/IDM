package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class j2 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f270561h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f270562j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j2(efm.r rVar, Object obj2, boolean z, int i) {
        super(rVar);
        this.f270561h = i;
        this.f270562j = obj2;
        this.i = z;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        switch (this.f270561h) {
            case 0:
                this.f270328g.subscribe(new i2(yVar, (kfm.o) this.f270562j, this.i));
                break;
            default:
                efm.w wVar = (efm.w) this.f270562j;
                bgm.d dVar = new bgm.d(yVar);
                boolean z = this.i;
                efm.w wVar2 = this.f270328g;
                if (!z) {
                    wVar2.subscribe(new o5(dVar, wVar));
                } else {
                    wVar2.subscribe(new n5(dVar, wVar));
                }
                break;
        }
    }
}
