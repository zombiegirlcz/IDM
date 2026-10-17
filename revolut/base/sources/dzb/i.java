package dzb;

import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.rev_points.impl.ui.challenges.details.RevPointsChallengeDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$string;
import dcf.v0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import q06.l;
import skm.a2;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends oki.h implements dli.b {
    public final RevPointsChallengeDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f121308p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final nyb.k f121309q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final pyb.c f121310r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final bzb.a f121311s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a2 f121312t;
    public final y u;

    public i(k stateMapper, RevPointsChallengeDetailsScreenContract$InputData inputData, l deeplinkRouter, nyb.k revPointsInteractor, pyb.c challengeClaimDialogMapper, bzb.a activationExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(challengeClaimDialogMapper, "challengeClaimDialogMapper");
        Intrinsics.checkNotNullParameter(activationExtension, "activationExtension");
        this.o = inputData;
        this.f121308p = deeplinkRouter;
        this.f121309q = revPointsInteractor;
        this.f121310r = challengeClaimDialogMapper;
        this.f121311s = activationExtension;
        this.u = mra.d.b(this, new b(0), stateMapper, null, false, 12);
    }

    public static final void I2(i iVar) {
        yji.l.a1(iVar, iVar.X1(new y0(null, new z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(R$string.common_error_state_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5)), null, null, new v0(iVar, null, 27), 3);
    }

    @Override // yji.l
    public final void I1() {
        J2(w4l.i.f294643c);
    }

    public final void J2(w4l.k loadingStrategy) {
        a2 a2Var = this.f121312t;
        if (a2Var != null) {
            a2Var.f(null);
        }
        String challengeId = this.o.f83780a;
        nyb.k kVar = this.f121309q;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        jxb.l lVar = (jxb.l) kVar.f220804a;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        this.f121312t = yji.l.a1(this, rd0.e.b(nim.a.w(lVar.f179130l.e(Unit.f186387a, loadingStrategy), new jb8.a(challengeId, 15))), new g(this, null, 0), null, new g(this, null, 1), 2);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
