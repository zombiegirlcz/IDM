package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.smart_filters_info;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.k;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.smart_filters_info.TravelHotelsSmartFiltersInfoScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import fd2.n;
import g9g.k0;
import java.util.List;
import jii.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import se4.c;
import te0.w;
import vc.s;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/search_results/filters/smart_filters_info/TravelHotelsSmartFiltersInfoScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lcli/k;", "<init>", "()V", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsSmartFiltersInfoScreen extends BaseBottomSheetRecyclerController<q, k> {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(TravelHotelsSmartFiltersInfoScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final h Q = s.t(this, a.f);
    public final Object R;
    public final Object S;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, e.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return e.a(p0);
        }
    }

    public TravelHotelsSmartFiltersInfoScreen() {
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: seg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsSmartFiltersInfoScreen f262198b;

            {
                this.f262198b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelHotelsSmartFiltersInfoScreen travelHotelsSmartFiltersInfoScreen = this.f262198b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsSmartFiltersInfoScreen.T;
                        qji.b bVarU2 = travelHotelsSmartFiltersInfoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.smart_filters_info.di.TravelHotelsSmartFiltersInfoScreenInjector");
                        k0 k0Var = new k0();
                        k0Var.f141727a = e4m.b.b(new n(k0Var, 1, 23));
                        k0Var.f141728b = e4m.b.b(new n(k0Var, 0, 23));
                        return k0Var;
                    default:
                        KProperty[] kPropertyArr2 = TravelHotelsSmartFiltersInfoScreen.T;
                        return (b) ((k0) travelHotelsSmartFiltersInfoScreen.R.getValue()).f141728b.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: seg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsSmartFiltersInfoScreen f262198b;

            {
                this.f262198b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelHotelsSmartFiltersInfoScreen travelHotelsSmartFiltersInfoScreen = this.f262198b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsSmartFiltersInfoScreen.T;
                        qji.b bVarU2 = travelHotelsSmartFiltersInfoScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.smart_filters_info.di.TravelHotelsSmartFiltersInfoScreenInjector");
                        k0 k0Var = new k0();
                        k0Var.f141727a = e4m.b.b(new n(k0Var, 1, 23));
                        k0Var.f141728b = e4m.b.b(new n(k0Var, 0, 23));
                        return k0Var;
                    default:
                        KProperty[] kPropertyArr2 = TravelHotelsSmartFiltersInfoScreen.T;
                        return (b) ((k0) travelHotelsSmartFiltersInfoScreen.R.getValue()).f141728b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (k0) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (seg.b) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.Q.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((e) value).f174513b.f), null, new c(this, null, 2), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (seg.b) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getQ() {
        return f0.f322471a;
    }
}
