package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.child_age;

import android.view.View;
import az.i;
import bdg.a;
import bdg.b;
import bdg.d;
import com.revolut.core.ui_kit.delegates.PickerDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.child_age.TravelHotelsChildAgePickerContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.child_age.TravelHotelsChildAgePickerController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import g9g.e1;
import g9g.f1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/picker/guest/child_age/TravelHotelsChildAgePickerController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lbdg/b;", "Lbdg/a;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsChildAgePickerController extends BaseBottomSheetRecyclerController<b, a> {
    public static final /* synthetic */ int V = 0;
    public final TravelHotelsChildAgePickerContract$InputData Q;
    public final PickerDelegate R;
    public final List S;
    public final Object T;
    public final Object U;

    public TravelHotelsChildAgePickerController(TravelHotelsChildAgePickerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        PickerDelegate pickerDelegate = new PickerDelegate();
        this.R = pickerDelegate;
        this.S = u.c(pickerDelegate);
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: bdg.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsChildAgePickerController f14601b;

            {
                this.f14601b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelHotelsChildAgePickerController travelHotelsChildAgePickerController = this.f14601b;
                switch (i2) {
                    case 0:
                        int i3 = TravelHotelsChildAgePickerController.V;
                        qji.b bVarU2 = travelHotelsChildAgePickerController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.child_age.di.TravelHotelsChildAgePickerInjector");
                        e1 e1Var = (e1) ((cdg.a) bVarU2).A().mo3808a(travelHotelsChildAgePickerController);
                        TravelHotelsChildAgePickerContract$InputData travelHotelsChildAgePickerContract$InputData = travelHotelsChildAgePickerController.Q;
                        switch (e1Var.f141658a) {
                            case 0:
                                travelHotelsChildAgePickerContract$InputData.getClass();
                                e1Var.d = travelHotelsChildAgePickerContract$InputData;
                                break;
                            default:
                                travelHotelsChildAgePickerContract$InputData.getClass();
                                e1Var.d = travelHotelsChildAgePickerContract$InputData;
                                break;
                        }
                        return (f1) e1Var.mo3783build();
                    default:
                        int i5 = TravelHotelsChildAgePickerController.V;
                        f1 f1Var = (f1) travelHotelsChildAgePickerController.T.getValue();
                        switch (f1Var.f141667a) {
                            case 0:
                                return (d) f1Var.f141669c.get();
                            default:
                                return (d) f1Var.f141669c.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: bdg.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsChildAgePickerController f14601b;

            {
                this.f14601b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelHotelsChildAgePickerController travelHotelsChildAgePickerController = this.f14601b;
                switch (i22) {
                    case 0:
                        int i3 = TravelHotelsChildAgePickerController.V;
                        qji.b bVarU2 = travelHotelsChildAgePickerController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.child_age.di.TravelHotelsChildAgePickerInjector");
                        e1 e1Var = (e1) ((cdg.a) bVarU2).A().mo3808a(travelHotelsChildAgePickerController);
                        TravelHotelsChildAgePickerContract$InputData travelHotelsChildAgePickerContract$InputData = travelHotelsChildAgePickerController.Q;
                        switch (e1Var.f141658a) {
                            case 0:
                                travelHotelsChildAgePickerContract$InputData.getClass();
                                e1Var.d = travelHotelsChildAgePickerContract$InputData;
                                break;
                            default:
                                travelHotelsChildAgePickerContract$InputData.getClass();
                                e1Var.d = travelHotelsChildAgePickerContract$InputData;
                                break;
                        }
                        return (f1) e1Var.mo3783build();
                    default:
                        int i5 = TravelHotelsChildAgePickerController.V;
                        f1 f1Var = (f1) travelHotelsChildAgePickerController.T.getValue();
                        switch (f1Var.f141667a) {
                            case 0:
                                return (d) f1Var.f141669c.get();
                            default:
                                return (d) f1Var.f141669c.get();
                        }
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f1) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (d) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f52922c), null, new b74.e(this, null, 18), 3);
        com.revolut.kompot.navigable.a.g2(this, e3(), null, new i(this, null, 25), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (d) this.U.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getT() {
        return this.S;
    }
}
