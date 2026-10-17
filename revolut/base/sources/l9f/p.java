package l9f;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.review.TransferOutReviewScreenContract$InputData;
import java.util.Set;
import z0h.s1;

/* JADX INFO: loaded from: classes8.dex */
public final class p implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f193208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferOutReviewScreenContract$InputData f193209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f193210c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public p(k kVar, o oVar, TransferOutReviewScreenContract$InputData transferOutReviewScreenContract$InputData, s1 s1Var) {
        this.f193210c = kVar;
        this.f193208a = s1Var;
        this.f193209b = transferOutReviewScreenContract$InputData;
        int i = 25;
        this.d = e4m.b.b(new kr9.m(kVar, this, 0, i));
        this.e = e4m.b.b(new kr9.m(kVar, this, 2, i));
        this.f = e4m.b.b(new kr9.m(kVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        aah.h hVar = (aah.h) this.d.get();
        a0k.b.n(hVar);
        return ImmutableSet.of(hVar);
    }

    @Override // xki.e
    public final Set g() {
        aah.i iVarD = ((u8h.b) this.f193210c.u).d();
        vc.s.j(iVarD);
        return ImmutableSet.of(a0k.b.l(iVarD, this.f193208a, (aah.h) this.d.get()));
    }
}
