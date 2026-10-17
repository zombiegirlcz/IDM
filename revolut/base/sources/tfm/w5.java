package tfm;

/* JADX INFO: loaded from: classes13.dex */
public final class w5 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f270922h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w5(efm.w wVar, long j2, int i) {
        super(wVar);
        this.f270922h = i;
        this.i = j2;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        switch (this.f270922h) {
            case 0:
                this.f270328g.subscribe(new v5(yVar, this.i));
                break;
            default:
                this.f270328g.subscribe(new k6(yVar, this.i));
                break;
        }
    }
}
