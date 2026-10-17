package skm;

import kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public final class m1 extends i1 {
    public final /* synthetic */ int e;
    public final flm.i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r1 f263996g;

    public /* synthetic */ m1(r1 r1Var, flm.i iVar, int i) {
        this.e = i;
        this.f263996g = r1Var;
        this.f = iVar;
    }

    @Override // skm.i1
    public final boolean i() {
        switch (this.e) {
        }
        return false;
    }

    @Override // skm.i1
    public final void j(Throwable th10) {
        switch (this.e) {
            case 0:
                r1 r1Var = this.f263996g;
                r1Var.getClass();
                Object objI = r1.f264005a.get(r1Var);
                if (!(objI instanceof u)) {
                    objI = e0.I(objI);
                }
                ((flm.h) this.f).j(r1Var, objI);
                break;
            default:
                ((flm.h) this.f).j(this.f263996g, Unit.f186387a);
                break;
        }
    }
}
