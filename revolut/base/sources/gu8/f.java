package gu8;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsListDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.common.ui.R$string;
import cu8.g1;
import efm.d0;
import efm.r;
import gqd.s;
import gs2.t;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import my8.l;
import org.jetbrains.annotations.NotNull;
import pfm.m;
import pfm.n;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements fu8.a {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1 f146887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n8b.a f146888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q89.e f146889c;

    public f(g1 presentationModel, n8b.a countryInteractor, q89.e onBoardingInteractor) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(onBoardingInteractor, "onBoardingInteractor");
        this.f146887a = presentationModel;
        this.f146888b = countryInteractor;
        this.f146889c = onBoardingInteractor;
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
        return j(model.f);
    }

    @Override // fu8.a
    public final efm.b c(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return j(model.u);
    }

    @Override // fu8.a
    public final r d(my8.r kycScope) {
        Intrinsics.checkNotNullParameter(kycScope, "kycScope");
        com.revolut.feature.kyc.impl.b bVar = (com.revolut.feature.kyc.impl.b) this.f146887a;
        d0 d0VarFirstOrError = bVar.w3().firstOrError();
        csl.b bVar2 = new csl.b(19, new cu8.i(bVar, 6));
        d0VarFirstOrError.getClass();
        pfm.a aVar = new pfm.a(d0VarFirstOrError, bVar2, 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        r rVarSwitchMap = aVar.g(bVar.w3()).switchMap(new gqk.b(new s(this, kycScope, 11), 26));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    @Override // fu8.a
    public final r e(xpi.g navbarView, my8.r kycScope) {
        Intrinsics.checkNotNullParameter(navbarView, "navbarView");
        Intrinsics.checkNotNullParameter(kycScope, "kycScope");
        r map = o70.a.f(((com.revolut.feature.kyc.impl.b) this.f146887a).s3()).doOnNext(new gqk.b(new g31.e(navbarView, 11, this, kycScope), 24)).map(new gqk.b(new t(12), 25));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
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

    public final TextLocalisedClause i(wi0.b bVar) {
        int i = com.revolut.feature.kyc.api.R$string.kyc_select_document_right_to_remain_short_subtitle;
        String lowerCase = bVar.f297794a.toLowerCase(Locale.ROOT);
        return new TextLocalisedClause(i, u.c(new TextLocalisedClause(t61.a.p(lowerCase, "toLowerCase(...)", "country_name_with_article.", lowerCase), (List) null, (Clause) new TextClause(((o8b.c) this.f146888b).b(bVar.f297794a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, 22)), null, 12);
    }

    public final efm.b j(Object obj2) {
        l lVar = obj2 instanceof l ? (l) obj2 : null;
        List docs = obj2 instanceof List ? (List) obj2 : null;
        g1 g1Var = this.f146887a;
        if (lVar != null) {
            return ((com.revolut.feature.kyc.impl.b) g1Var).x3(lVar);
        }
        if (docs == null) {
            m mVar = m.f235744a;
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        com.revolut.feature.kyc.impl.b bVar = (com.revolut.feature.kyc.impl.b) g1Var;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(docs, "docs");
        n nVar = new n(new a09.r(bVar, docs, 18), 1);
        Intrinsics.checkNotNullExpressionValue(nVar, "fromCallable(...)");
        return nVar;
    }
}
