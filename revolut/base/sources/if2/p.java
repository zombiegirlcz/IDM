package if2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.upi.impl.data.network.UpiService;
import com.revolut.feature.apm.upi.impl.flow.screen.review.UpiTransferReviewScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpiTransferReviewScreenContract$InputData f160898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f160899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f160900c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f160901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f160902h;

    public p(f fVar, n nVar, ViewController viewController, UpiTransferReviewScreenContract$InputData upiTransferReviewScreenContract$InputData) {
        this.f160899b = fVar;
        this.f160898a = upiTransferReviewScreenContract$InputData;
        this.f160900c = e4m.b.b(e4m.c.a(viewController));
        int i = 10;
        this.d = e4m.b.b(new i9e.l(fVar, this, 2, i));
        this.e = e4m.b.b(new i9e.l(fVar, this, 1, i));
        this.f = e4m.b.b(new i9e.l(fVar, this, 0, i));
        this.f160901g = e4m.b.b(new i9e.l(fVar, this, 4, i));
        this.f160902h = e4m.b.b(new i9e.l(fVar, this, 3, i));
    }

    public final wf2.e b() {
        f fVar = this.f160899b;
        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) fVar.f160863s).c();
        vc.s.j(aVarC);
        bf2.c cVar = new bf2.c((UpiService) fVar.L.get(), ((nj0.d) fVar.e).i);
        xua.a aVarA = fVar.f160864t.a();
        vc.s.j(aVarA);
        yw1.b bVarK = ((lz1.m) fVar.f160852b).k();
        vc.s.j(bVarK);
        return new wf2.e(aVarC, cVar, aVarA, bVarK, new wf2.a());
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
