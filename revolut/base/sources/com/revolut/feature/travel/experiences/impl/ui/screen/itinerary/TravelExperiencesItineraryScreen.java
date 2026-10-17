package com.revolut.feature.travel.experiences.impl.ui.screen.itinerary;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.impl.R$id;
import com.revolut.feature.travel.experiences.impl.R$layout;
import com.revolut.feature.travel.experiences.impl.ui.screen.itinerary.TravelExperiencesItineraryScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nsh.e;
import nuh.j;
import o2g.b;
import o2g.d;
import te0.w;
import vc.s;
import w0g.t;
import z0g.g0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/itinerary/TravelExperiencesItineraryScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lo2g/d;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelExperiencesItineraryScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(TravelExperiencesItineraryScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/experiences/impl/databinding/ScreenTravelExperiencesItineraryBinding;", 0))};
    public final h K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public TravelExperiencesItineraryScreen(TravelExperiencesItineraryScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        this.L = R$layout.screen_travel_experiences_itinerary;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: o2g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelExperiencesItineraryScreen f221618b;

            {
                this.f221618b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TravelExperiencesItineraryScreen.P;
                        TravelExperiencesItineraryScreen travelExperiencesItineraryScreen = this.f221618b;
                        return dli.f.a(travelExperiencesItineraryScreen, (e) travelExperiencesItineraryScreen.O.getValue(), u.c(new ProgressStepVerticalDelegate()), R$id.travelExperiencesItineraryScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelExperiencesItineraryScreen.P;
                        g0 g0Var = (g0) this.f221618b.N.getValue();
                        switch (g0Var.f318370a) {
                            case 0:
                                return (e) g0Var.d.get();
                            default:
                                return (e) g0Var.d.get();
                        }
                }
            }
        });
        this.N = w.y0(new e(this, inputData, 15));
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: o2g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelExperiencesItineraryScreen f221618b;

            {
                this.f221618b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelExperiencesItineraryScreen.P;
                        TravelExperiencesItineraryScreen travelExperiencesItineraryScreen = this.f221618b;
                        return dli.f.a(travelExperiencesItineraryScreen, (e) travelExperiencesItineraryScreen.O.getValue(), u.c(new ProgressStepVerticalDelegate()), R$id.travelExperiencesItineraryScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelExperiencesItineraryScreen.P;
                        g0 g0Var = (g0) this.f221618b.N.getValue();
                        switch (g0Var.f318370a) {
                            case 0:
                                return (e) g0Var.d.get();
                            default:
                                return (e) g0Var.d.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((d) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g0) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (o2g.e) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.K.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((t) value).f293741b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.experiences_details_itinerary, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.experiences_details_itinerary, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.K.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((t) value).f293741b.f59410q), null, new j(this, null, 11), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.M.getValue();
    }
}
