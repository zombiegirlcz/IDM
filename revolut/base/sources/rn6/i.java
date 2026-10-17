package rn6;

import cli.n;
import cli.y;
import com.revolut.feature.external_accounts.impl.ui.link.screens.branches.BranchesScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import xg6.j;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends oki.h implements g {
    public final BranchesScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final oe6.a f255510p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f255511q;

    public i(n stateMapper, BranchesScreenContract$InputData inputData, oe6.a externalInstitutionsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        this.o = inputData;
        this.f255510p = externalInstitutionsInteractor;
        this.f255511q = mra.d.b(this, new d("", null, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, rd0.e.b(((j) this.f255510p).c(this.o.f73047a, w4l.h.f294642c)), null, null, new rk9.d(this, null, 7), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f255511q;
    }
}
