package com.revolut.feature.rev_points.giftcards.impl.ui.screen.terms_and_conditions;

import aii.q;
import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.giftcards.api.R$string;
import com.revolut.feature.rev_points.giftcards.impl.R$id;
import com.revolut.feature.rev_points.giftcards.impl.R$layout;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.terms_and_conditions.RevPointsGiftcardsTermsAndConditionsScreen;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.terms_and_conditions.RevPointsGiftcardsTermsAndConditionsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import grl.k9;
import iwb.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;
import zr4.b;
import zwb.d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/impl/ui/screen/terms_and_conditions/RevPointsGiftcardsTermsAndConditionsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lzwb/d;", "Lno/m;", "feature_rev_points_giftcards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsGiftcardsTermsAndConditionsScreen extends ViewController<q> implements a, m {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(RevPointsGiftcardsTermsAndConditionsScreen.class, "binding", "getBinding()Lcom/revolut/feature/rev_points/giftcards/impl/databinding/ScreenRevPointsGiftcardsTermsAndConditionsBinding;", 0))};
    public final RevPointsGiftcardsTermsAndConditionsScreenContract$InputData K;
    public final int L;
    public final AnalyticsProduct.Retail M;
    public final Object N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;

    public RevPointsGiftcardsTermsAndConditionsScreen(RevPointsGiftcardsTermsAndConditionsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_rev_points_giftcards_terms_and_conditions;
        k9 k9Var = k9.GiftCards;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.M = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.N = w.y0(new b(29));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: zwb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsGiftcardsTermsAndConditionsScreen f325946b;

            {
                this.f325946b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RevPointsGiftcardsTermsAndConditionsScreen revPointsGiftcardsTermsAndConditionsScreen = this.f325946b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsGiftcardsTermsAndConditionsScreen.S;
                        RevPointsGiftcardsTermsAndConditionsScreen revPointsGiftcardsTermsAndConditionsScreen2 = this.f325946b;
                        return dli.f.a(revPointsGiftcardsTermsAndConditionsScreen2, (e) revPointsGiftcardsTermsAndConditionsScreen2.R.getValue(), u.c((PlainTextDelegate) revPointsGiftcardsTermsAndConditionsScreen2.N.getValue()), R$id.revPointsGiftcardsTermsAndConditionsScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsGiftcardsTermsAndConditionsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsGiftcardsTermsAndConditionsScreen.m2()).a().get(iwb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", iwb.e.class, " is not found"));
                        }
                        iwb.e eVar = ((iwb.e) aVar2.b()).f169026r;
                        RevPointsGiftcardsTermsAndConditionsScreenContract$InputData revPointsGiftcardsTermsAndConditionsScreenContract$InputData = revPointsGiftcardsTermsAndConditionsScreen.K;
                        revPointsGiftcardsTermsAndConditionsScreenContract$InputData.getClass();
                        return new j(eVar, revPointsGiftcardsTermsAndConditionsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = RevPointsGiftcardsTermsAndConditionsScreen.S;
                        return (e) ((j) revPointsGiftcardsTermsAndConditionsScreen.Q.getValue()).f169038c.get();
                }
            }
        });
        this.P = s.t(this, zwb.b.f);
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: zwb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsGiftcardsTermsAndConditionsScreen f325946b;

            {
                this.f325946b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RevPointsGiftcardsTermsAndConditionsScreen revPointsGiftcardsTermsAndConditionsScreen = this.f325946b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsGiftcardsTermsAndConditionsScreen.S;
                        RevPointsGiftcardsTermsAndConditionsScreen revPointsGiftcardsTermsAndConditionsScreen2 = this.f325946b;
                        return dli.f.a(revPointsGiftcardsTermsAndConditionsScreen2, (e) revPointsGiftcardsTermsAndConditionsScreen2.R.getValue(), u.c((PlainTextDelegate) revPointsGiftcardsTermsAndConditionsScreen2.N.getValue()), R$id.revPointsGiftcardsTermsAndConditionsScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsGiftcardsTermsAndConditionsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsGiftcardsTermsAndConditionsScreen.m2()).a().get(iwb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", iwb.e.class, " is not found"));
                        }
                        iwb.e eVar = ((iwb.e) aVar2.b()).f169026r;
                        RevPointsGiftcardsTermsAndConditionsScreenContract$InputData revPointsGiftcardsTermsAndConditionsScreenContract$InputData = revPointsGiftcardsTermsAndConditionsScreen.K;
                        revPointsGiftcardsTermsAndConditionsScreenContract$InputData.getClass();
                        return new j(eVar, revPointsGiftcardsTermsAndConditionsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = RevPointsGiftcardsTermsAndConditionsScreen.S;
                        return (e) ((j) revPointsGiftcardsTermsAndConditionsScreen.Q.getValue()).f169038c.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: zwb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsGiftcardsTermsAndConditionsScreen f325946b;

            {
                this.f325946b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RevPointsGiftcardsTermsAndConditionsScreen revPointsGiftcardsTermsAndConditionsScreen = this.f325946b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsGiftcardsTermsAndConditionsScreen.S;
                        RevPointsGiftcardsTermsAndConditionsScreen revPointsGiftcardsTermsAndConditionsScreen2 = this.f325946b;
                        return dli.f.a(revPointsGiftcardsTermsAndConditionsScreen2, (e) revPointsGiftcardsTermsAndConditionsScreen2.R.getValue(), u.c((PlainTextDelegate) revPointsGiftcardsTermsAndConditionsScreen2.N.getValue()), R$id.revPointsGiftcardsTermsAndConditionsScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsGiftcardsTermsAndConditionsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsGiftcardsTermsAndConditionsScreen.m2()).a().get(iwb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", iwb.e.class, " is not found"));
                        }
                        iwb.e eVar = ((iwb.e) aVar2.b()).f169026r;
                        RevPointsGiftcardsTermsAndConditionsScreenContract$InputData revPointsGiftcardsTermsAndConditionsScreenContract$InputData = revPointsGiftcardsTermsAndConditionsScreen.K;
                        revPointsGiftcardsTermsAndConditionsScreenContract$InputData.getClass();
                        return new j(eVar, revPointsGiftcardsTermsAndConditionsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = RevPointsGiftcardsTermsAndConditionsScreen.S;
                        return (e) ((j) revPointsGiftcardsTermsAndConditionsScreen.Q.getValue()).f169038c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f138599b;
        String str = uiState.f325949a;
        if (str != null) {
            navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.gift_cards_terms_and_conditions_title, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12));
            navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.gift_cards_terms_and_conditions_title, u.c(new TextClause(uiState.f325949a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null);
        } else {
            navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.gift_cards_terms_and_conditions_internal_title, null, null, 14));
            navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.gift_cards_terms_and_conditions_internal_title, null, null, 14), null);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (zwb.e) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f138599b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f138599b.f59410q), null, new zub.b(this, null, 5), 3);
    }

    public final fwb.d d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (fwb.d) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.O.getValue();
    }
}
