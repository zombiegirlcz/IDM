package com.revolut.feature.travel.experiences.impl.ui.screen.price_breakdown.discount;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import az.i;
import b3g.b;
import b3g.c;
import b3g.d;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.impl.R$id;
import com.revolut.feature.travel.experiences.impl.R$layout;
import com.revolut.feature.travel.experiences.impl.ui.screen.price_breakdown.discount.TravelExperiencesPointsDiscountInfoScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import wp5.y;
import xki.e;
import z0g.n;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/price_breakdown/discount/TravelExperiencesPointsDiscountInfoScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lb3g/c;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelExperiencesPointsDiscountInfoScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(TravelExperiencesPointsDiscountInfoScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/experiences/impl/databinding/ScreenTravelExperiencesPointsDiscountInfoBinding;", 0))};
    public final int K;
    public final Object L;
    public final h M;
    public final Object N;
    public final Object O;

    public TravelExperiencesPointsDiscountInfoScreen(TravelExperiencesPointsDiscountInfoScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_travel_experiences_points_discount_info;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: b3g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelExperiencesPointsDiscountInfoScreen f12027b;

            {
                this.f12027b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TravelExperiencesPointsDiscountInfoScreen.P;
                        TravelExperiencesPointsDiscountInfoScreen travelExperiencesPointsDiscountInfoScreen = this.f12027b;
                        return f.a(travelExperiencesPointsDiscountInfoScreen, (d) travelExperiencesPointsDiscountInfoScreen.O.getValue(), y.w(), R$id.travelExperiencesPointsDiscountInfoScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelExperiencesPointsDiscountInfoScreen.P;
                        return (d) ((n) this.f12027b.N.getValue()).f318417c.get();
                }
            }
        });
        this.M = s.t(this, b.f);
        this.N = w.y0(new at4.b(this, inputData, 19));
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: b3g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelExperiencesPointsDiscountInfoScreen f12027b;

            {
                this.f12027b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelExperiencesPointsDiscountInfoScreen.P;
                        TravelExperiencesPointsDiscountInfoScreen travelExperiencesPointsDiscountInfoScreen = this.f12027b;
                        return f.a(travelExperiencesPointsDiscountInfoScreen, (d) travelExperiencesPointsDiscountInfoScreen.O.getValue(), y.w(), R$id.travelExperiencesPointsDiscountInfoScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelExperiencesPointsDiscountInfoScreen.P;
                        return (d) ((n) this.f12027b.N.getValue()).f318417c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((c) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (d) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f293749c.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.experiences_checkout_pricing_points_discount, null, null, 14), new TextLocalisedClause(R$string.experiences_points_discount_info_subtitle, null, null, 14), null, null, false, 28));
        d3().f293748b.setText(new TextLocalisedClause(R$string.experiences_common_action_got_it, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f293748b.o), null, new i(this, null, 4), 3);
    }

    public final w0g.w d3() {
        ViewBinding value = this.M.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (w0g.w) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.L.getValue();
    }
}
