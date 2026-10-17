package com.revolut.feature.travel.experiences.impl.ui.screen.price_breakdown;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsBadgeDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsPriceDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.impl.R$id;
import com.revolut.feature.travel.experiences.impl.R$layout;
import com.revolut.feature.travel.experiences.impl.ui.screen.price_breakdown.TravelExperiencesPriceBreakdownScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import w0g.x;
import xki.e;
import z0g.o;
import z2g.b;
import z2g.c;
import z2g.f;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/price_breakdown/TravelExperiencesPriceBreakdownScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lz2g/f;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelExperiencesPriceBreakdownScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(TravelExperiencesPriceBreakdownScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/experiences/impl/databinding/ScreenTravelExperiencesPriceBreakdownBinding;", 0))};
    public final h K;
    public final int L;
    public final CellDetailsPriceDelegate M;
    public final TextDelegate N;
    public final Object O;
    public final boolean P;
    public final Object Q;
    public final Object R;

    public TravelExperiencesPriceBreakdownScreen(TravelExperiencesPriceBreakdownScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        this.L = R$layout.screen_travel_experiences_price_breakdown;
        this.M = new CellDetailsPriceDelegate();
        this.N = new TextDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: z2g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelExperiencesPriceBreakdownScreen f319069b;

            {
                this.f319069b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TravelExperiencesPriceBreakdownScreen.S;
                        TravelExperiencesPriceBreakdownScreen travelExperiencesPriceBreakdownScreen = this.f319069b;
                        return dli.f.a(travelExperiencesPriceBreakdownScreen, (e) travelExperiencesPriceBreakdownScreen.R.getValue(), v.k(travelExperiencesPriceBreakdownScreen.M, new RowDelegate(null, null, 7), new CellDetailsDelegate(), travelExperiencesPriceBreakdownScreen.N, new CellDetailsBadgeDelegate()), R$id.experiencesPriceBreakdown_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelExperiencesPriceBreakdownScreen.S;
                        return (e) ((o) this.f319069b.Q.getValue()).f318423c.get();
                }
            }
        });
        this.P = true;
        this.Q = w.y0(new ywi.b(this, inputData, 12));
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: z2g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelExperiencesPriceBreakdownScreen f319069b;

            {
                this.f319069b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelExperiencesPriceBreakdownScreen.S;
                        TravelExperiencesPriceBreakdownScreen travelExperiencesPriceBreakdownScreen = this.f319069b;
                        return dli.f.a(travelExperiencesPriceBreakdownScreen, (e) travelExperiencesPriceBreakdownScreen.R.getValue(), v.k(travelExperiencesPriceBreakdownScreen.M, new RowDelegate(null, null, 7), new CellDetailsDelegate(), travelExperiencesPriceBreakdownScreen.N, new CellDetailsBadgeDelegate()), R$id.experiencesPriceBreakdown_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelExperiencesPriceBreakdownScreen.S;
                        return (e) ((o) this.f319069b.Q.getValue()).f318423c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(cli.o oVar, cli.q qVar) {
        dli.a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (z2g.e) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.K.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((x) value).f293751b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.experiences_price_breakdown_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.experiences_price_breakdown_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.K.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((x) value).f293751b.f59410q), null, new yl6.b(this, null, 27), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f51887c), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.d), null, new c(this, null, 1), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.P);
    }
}
