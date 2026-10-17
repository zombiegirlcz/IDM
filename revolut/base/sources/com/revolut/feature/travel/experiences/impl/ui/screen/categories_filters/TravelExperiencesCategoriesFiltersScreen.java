package com.revolut.feature.travel.experiences.impl.ui.screen.categories_filters;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.impl.R$id;
import com.revolut.feature.travel.experiences.impl.R$layout;
import com.revolut.feature.travel.experiences.impl.ui.screen.categories_filters.TravelExperiencesCategoriesFiltersScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import v1g.b;
import v1g.c;
import v1g.d;
import v1g.f;
import v1g.g;
import vc.s;
import w0g.r;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/categories_filters/TravelExperiencesCategoriesFiltersScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lv1g/f;", "Ldli/a;", "Lv1g/h;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelExperiencesCategoriesFiltersScreen extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(TravelExperiencesCategoriesFiltersScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/experiences/impl/databinding/ScreenTravelExperiencesCategoriesFiltersBinding;", 0))};
    public final int K;
    public final InputChecklistDelegate L;
    public final Object M;
    public final h N;
    public final Object O;
    public final Object P;

    public TravelExperiencesCategoriesFiltersScreen(TravelExperiencesCategoriesFiltersScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_travel_experiences_categories_filters;
        this.L = new InputChecklistDelegate();
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: v1g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelExperiencesCategoriesFiltersScreen f285308b;

            {
                this.f285308b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TravelExperiencesCategoriesFiltersScreen.Q;
                        TravelExperiencesCategoriesFiltersScreen travelExperiencesCategoriesFiltersScreen = this.f285308b;
                        return dli.f.a(travelExperiencesCategoriesFiltersScreen, travelExperiencesCategoriesFiltersScreen.d(), u.c(travelExperiencesCategoriesFiltersScreen.L), R$id.travelExperiencesCategoriesFiltersScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelExperiencesCategoriesFiltersScreen.Q;
                        return (g) ((z0g.e) this.f285308b.O.getValue()).f318347c.get();
                }
            }
        });
        this.N = s.t(this, b.f);
        this.O = w.y0(new v0c.b(this, inputData, 7));
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: v1g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelExperiencesCategoriesFiltersScreen f285308b;

            {
                this.f285308b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelExperiencesCategoriesFiltersScreen.Q;
                        TravelExperiencesCategoriesFiltersScreen travelExperiencesCategoriesFiltersScreen = this.f285308b;
                        return dli.f.a(travelExperiencesCategoriesFiltersScreen, travelExperiencesCategoriesFiltersScreen.d(), u.c(travelExperiencesCategoriesFiltersScreen.L), R$id.travelExperiencesCategoriesFiltersScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelExperiencesCategoriesFiltersScreen.Q;
                        return (g) ((z0g.e) this.f285308b.O.getValue()).f318347c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((v1g.h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z0g.e) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.experiences_activity_types_title, null, null, 14);
        NavBarWithToolbar navBarWithToolbar = d3().f293736c;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setMenuItems(u.c(new TextNavBarMenuItem("RESET_FILTERS_ITEM_ID", new TextLocalisedClause(R$string.experiences_common_action_reset, null, null, 14), null, null, 12)));
        d3().f293735b.setText(new TextLocalisedClause(R$string.experiences_common_action_apply, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f293736c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f293736c.o.f57403b), null, new up2.q(this, null, 24), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f52518c), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f293735b.o), null, new c(this, null, 1), 3);
    }

    public final r d3() {
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (r) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g d() {
        return (g) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
