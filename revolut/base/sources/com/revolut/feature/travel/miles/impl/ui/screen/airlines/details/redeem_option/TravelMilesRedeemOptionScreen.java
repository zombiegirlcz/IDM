package com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.redeem_option;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.k;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.redeem_option.TravelMilesRedeemOptionScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.redeem_option.TravelMilesRedeemOptionScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import ufg.a0;
import ufg.z;
import vc.s;
import xki.e;
import ygg.b;
import ygg.c;
import ygg.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/screen/airlines/details/redeem_option/TravelMilesRedeemOptionScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lygg/c;", "Lcli/k;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelMilesRedeemOptionScreen extends BaseBottomSheetRecyclerController<c, k> {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(TravelMilesRedeemOptionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final TravelMilesRedeemOptionScreenContract$InputData Q;
    public final h R;
    public final Object S;
    public final Object T;

    public TravelMilesRedeemOptionScreen(TravelMilesRedeemOptionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        this.R = s.t(this, b.f);
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: ygg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesRedeemOptionScreen f313662b;

            {
                this.f313662b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelMilesRedeemOptionScreen travelMilesRedeemOptionScreen = this.f313662b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesRedeemOptionScreen.U;
                        qji.b bVarU2 = travelMilesRedeemOptionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.redeem_option.di.TravelMilesRedeemOptionScreenInjector");
                        z zVar = (z) ((zgg.a) bVarU2).c().mo3808a(travelMilesRedeemOptionScreen);
                        TravelMilesRedeemOptionScreenContract$InputData travelMilesRedeemOptionScreenContract$InputData = travelMilesRedeemOptionScreen.Q;
                        switch (zVar.f279808a) {
                            case 0:
                                travelMilesRedeemOptionScreenContract$InputData.getClass();
                                zVar.d = travelMilesRedeemOptionScreenContract$InputData;
                                break;
                            default:
                                travelMilesRedeemOptionScreenContract$InputData.getClass();
                                zVar.d = travelMilesRedeemOptionScreenContract$InputData;
                                break;
                        }
                        return (a0) zVar.mo3783build();
                    default:
                        KProperty[] kPropertyArr2 = TravelMilesRedeemOptionScreen.U;
                        a0 a0Var = (a0) travelMilesRedeemOptionScreen.S.getValue();
                        switch (a0Var.f279664a) {
                            case 0:
                                return (d) a0Var.d.get();
                            default:
                                return (d) a0Var.d.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: ygg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesRedeemOptionScreen f313662b;

            {
                this.f313662b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelMilesRedeemOptionScreen travelMilesRedeemOptionScreen = this.f313662b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesRedeemOptionScreen.U;
                        qji.b bVarU2 = travelMilesRedeemOptionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.redeem_option.di.TravelMilesRedeemOptionScreenInjector");
                        z zVar = (z) ((zgg.a) bVarU2).c().mo3808a(travelMilesRedeemOptionScreen);
                        TravelMilesRedeemOptionScreenContract$InputData travelMilesRedeemOptionScreenContract$InputData = travelMilesRedeemOptionScreen.Q;
                        switch (zVar.f279808a) {
                            case 0:
                                travelMilesRedeemOptionScreenContract$InputData.getClass();
                                zVar.d = travelMilesRedeemOptionScreenContract$InputData;
                                break;
                            default:
                                travelMilesRedeemOptionScreenContract$InputData.getClass();
                                zVar.d = travelMilesRedeemOptionScreenContract$InputData;
                                break;
                        }
                        return (a0) zVar.mo3783build();
                    default:
                        KProperty[] kPropertyArr2 = TravelMilesRedeemOptionScreen.U;
                        a0 a0Var = (a0) travelMilesRedeemOptionScreen.S.getValue();
                        switch (a0Var.f279664a) {
                            case 0:
                                return (d) a0Var.d.get();
                            default:
                                return (d) a0Var.d.get();
                        }
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a0) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (d) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.R.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        a.g2(this, rd0.e.b(((jii.e) value).f174513b.f), null, new y5g.d(this, null, 21), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (d) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getQ() {
        return m72.b.v(null, null, 7);
    }
}
