package com.revolut.feature.travel.experiences.impl.ui.screen.past_and_cancelled;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListingTileDelegate;
import com.revolut.core.ui_kit.delegates.ListingTileLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.core.api.R$string;
import com.revolut.feature.travel.experiences.impl.R$id;
import com.revolut.feature.travel.experiences.impl.R$layout;
import com.revolut.feature.travel.experiences.impl.ui.screen.past_and_cancelled.TravelExperiencesPastAndCancelledScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import v2g.b;
import v2g.c;
import v2g.e;
import v2g.f;
import v2g.g;
import vc.s;
import w0g.u;
import z0g.l;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/past_and_cancelled/TravelExperiencesPastAndCancelledScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lv2g/e;", "Ldli/a;", "Lv2g/g;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelExperiencesPastAndCancelledScreen extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(TravelExperiencesPastAndCancelledScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/experiences/impl/databinding/ScreenTravelExperiencesPastAndCancelledBinding;", 0))};
    public final h K;
    public final ListingTileDelegate L;
    public final FullScreenStateDelegate M;
    public final int N;
    public final boolean O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public TravelExperiencesPastAndCancelledScreen(TravelExperiencesPastAndCancelledScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        this.L = new ListingTileDelegate();
        this.M = new FullScreenStateDelegate();
        this.N = R$layout.screen_travel_experiences_past_and_cancelled;
        this.O = true;
        this.P = w.y0(new v0c.b(this, inputData, 10));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: v2g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelExperiencesPastAndCancelledScreen f285733b;

            {
                this.f285733b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TravelExperiencesPastAndCancelledScreen.S;
                        return (f) ((l) this.f285733b.P.getValue()).f318402c.get();
                    default:
                        KProperty[] kPropertyArr2 = TravelExperiencesPastAndCancelledScreen.S;
                        TravelExperiencesPastAndCancelledScreen travelExperiencesPastAndCancelledScreen = this.f285733b;
                        return dli.f.a(travelExperiencesPastAndCancelledScreen, (f) travelExperiencesPastAndCancelledScreen.Q.getValue(), v.k(new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new ListingTileLoadingDelegate(), travelExperiencesPastAndCancelledScreen.L, travelExperiencesPastAndCancelledScreen.M), R$id.experiencesPastAndCancelled_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: v2g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelExperiencesPastAndCancelledScreen f285733b;

            {
                this.f285733b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelExperiencesPastAndCancelledScreen.S;
                        return (f) ((l) this.f285733b.P.getValue()).f318402c.get();
                    default:
                        KProperty[] kPropertyArr2 = TravelExperiencesPastAndCancelledScreen.S;
                        TravelExperiencesPastAndCancelledScreen travelExperiencesPastAndCancelledScreen = this.f285733b;
                        return dli.f.a(travelExperiencesPastAndCancelledScreen, (f) travelExperiencesPastAndCancelledScreen.Q.getValue(), v.k(new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new ListingTileLoadingDelegate(), travelExperiencesPastAndCancelledScreen.L, travelExperiencesPastAndCancelledScreen.M), R$id.experiencesPastAndCancelled_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (l) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.K.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((u) value).f293743b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_arrow_thin_left));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.travel_tab_bookings_button_past_and_cancelled, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.travel_tab_bookings_button_past_and_cancelled, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.K.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((u) value).f293743b.f59410q), null, new uwe.f(this, continuation, 5), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f52751c), null, new up2.q(this, continuation, 27), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f52371h.f121375b), null, new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.O);
    }
}
