package gu8;

import com.revolut.core.ui_kit.delegates.CellDetailsListDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.common.ui.R$string;
import cu8.g1;
import cu8.i1;
import efm.d0;
import efm.r;
import gqd.s;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfm.m;
import te0.w;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements fu8.a {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1 f146893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n8b.a f146894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i1 f146895c;
    public final q89.e d;

    public j(g1 presentationModel, n8b.a countryInteractor, i1 router, q89.e onBoardingInteractor) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(onBoardingInteractor, "onBoardingInteractor");
        this.f146893a = presentationModel;
        this.f146894b = countryInteractor;
        this.f146895c = router;
        this.d = onBoardingInteractor;
    }

    @Override // fu8.a
    public final efm.b a() {
        return ((com.revolut.feature.kyc.impl.f) this.f146895c).goBack();
    }

    @Override // fu8.a
    public final efm.b b(CellDetailsListDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        m mVar = m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }

    @Override // fu8.a
    public final efm.b c(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        m mVar = m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }

    @Override // fu8.a
    public final r d(my8.r kycScope) {
        Intrinsics.checkNotNullParameter(kycScope, "kycScope");
        com.revolut.feature.kyc.impl.b bVar = (com.revolut.feature.kyc.impl.b) this.f146893a;
        d0 d0VarFirstOrError = bVar.w3().firstOrError();
        csl.b bVar2 = new csl.b(19, new cu8.i(bVar, 6));
        d0VarFirstOrError.getClass();
        pfm.a aVar = new pfm.a(d0VarFirstOrError, bVar2, 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        sfm.b bVarG = aVar.g(w.l(bVar.w3(), bVar.s3()).map(new gqk.b(new s(this, kycScope, 12), 27)));
        Intrinsics.checkNotNullExpressionValue(bVarG, "andThen(...)");
        return bVarG;
    }

    @Override // fu8.a
    public final r e(xpi.g navbarView, my8.r kycScope) {
        Intrinsics.checkNotNullParameter(navbarView, "navbarView");
        Intrinsics.checkNotNullParameter(kycScope, "kycScope");
        r rVarJust = r.just(Unit.f186387a);
        Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
        r rVarDoOnNext = o70.a.f(rVarJust).doOnNext(new gqk.b(new g(navbarView, 0), 28));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        return rVarDoOnNext;
    }

    @Override // fu8.a
    public final void g(iqi.h twinVerticalButtonView) {
        Intrinsics.checkNotNullParameter(twinVerticalButtonView, "twinVerticalButtonView");
        ((iqi.b) twinVerticalButtonView).a0(new TextLocalisedClause(R$string.common_action_continue, null, null, 14));
    }

    @Override // fu8.a
    public final void h(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullExpressionValue(m.f235744a, "complete(...)");
    }
}
