package gu8;

import com.revolut.core.ui_kit.delegates.CellDetailsListDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.common.ui.R$string;
import cu8.g1;
import efm.r;
import gqd.s;
import gs2.t;
import kotlin.jvm.internal.Intrinsics;
import my8.l;
import org.jetbrains.annotations.NotNull;
import pfm.m;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements fu8.a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1 f146883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n8b.a f146884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fu8.c f146885c;

    public c(g1 presentationModel, n8b.a countryInteractor, fu8.c router) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(router, "router");
        this.f146883a = presentationModel;
        this.f146884b = countryInteractor;
        this.f146885c = router;
    }

    @Override // fu8.a
    public final efm.b a() {
        m mVar = m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }

    @Override // fu8.a
    public final efm.b b(CellDetailsListDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.f;
        l lVar = obj2 instanceof l ? (l) obj2 : null;
        return lVar != null ? ((com.revolut.feature.kyc.impl.b) this.f146883a).x3(lVar) : m.f235744a;
    }

    @Override // fu8.a
    public final efm.b c(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.u;
        l lVar = obj2 instanceof l ? (l) obj2 : null;
        return lVar != null ? ((com.revolut.feature.kyc.impl.b) this.f146883a).x3(lVar) : m.f235744a;
    }

    @Override // fu8.a
    public final r d(my8.r kycScope) {
        Intrinsics.checkNotNullParameter(kycScope, "kycScope");
        r rVarSwitchMap = ((com.revolut.feature.kyc.impl.b) this.f146883a).w3().switchMap(new gqk.b(new s(this, kycScope, 10), 23));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    @Override // fu8.a
    public final r e(xpi.g navbarView, my8.r kycScope) {
        Intrinsics.checkNotNullParameter(navbarView, "navbarView");
        Intrinsics.checkNotNullParameter(kycScope, "kycScope");
        r map = o70.a.f(((com.revolut.feature.kyc.impl.b) this.f146883a).s3()).doOnNext(new gqk.b(new s(navbarView, this, 9), 21)).map(new gqk.b(new t(11), 22));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // fu8.a
    public final efm.b f() {
        return ((com.revolut.feature.kyc.impl.f) this.f146885c).l3();
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
