package com.revolut.feature.donations.impl.ui.kompot.bottomsheet.spare_change;

import android.view.View;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.feature.donations.impl.ui.kompot.bottomsheet.spare_change.SpareChangeContract$InputData;
import com.revolut.feature.donations.impl.ui.kompot.bottomsheet.spare_change.SpareChangeScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import ib6.c;
import ib6.d;
import ib6.g;
import ib6.h;
import ib6.n;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pa6.r;
import pa6.s;
import pki.b;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/bottomsheet/spare_change/SpareChangeScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lib6/d;", "Lib6/c;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SpareChangeScreen extends BaseBottomSheetRecyclerController<d, c> {
    public static final /* synthetic */ int V = 0;
    public final SpareChangeContract$InputData Q;
    public final SuggestionsBarDelegate R;
    public final Object S;
    public final Object T;
    public final List U;

    public SpareChangeScreen(SpareChangeContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        SuggestionsBarDelegate suggestionsBarDelegate = new SuggestionsBarDelegate();
        this.R = suggestionsBarDelegate;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: ib6.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpareChangeScreen f160097b;

            {
                this.f160097b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SpareChangeScreen spareChangeScreen = this.f160097b;
                switch (i2) {
                    case 0:
                        int i3 = SpareChangeScreen.V;
                        qji.b bVarU2 = spareChangeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.donations.impl.ui.kompot.bottomsheet.spare_change.di.SpareChangeScreenComponent.Injector");
                        r rVar = (r) ((jb6.a) bVarU2).b().mo3808a(spareChangeScreen);
                        SpareChangeContract$InputData spareChangeContract$InputData = spareChangeScreen.Q;
                        switch (rVar.f234422a) {
                            case 0:
                                spareChangeContract$InputData.getClass();
                                rVar.d = spareChangeContract$InputData;
                                break;
                            default:
                                spareChangeContract$InputData.getClass();
                                rVar.d = spareChangeContract$InputData;
                                break;
                        }
                        return (s) rVar.mo3783build();
                    default:
                        int i5 = SpareChangeScreen.V;
                        s sVar = (s) spareChangeScreen.S.getValue();
                        switch (sVar.f234425a) {
                            case 0:
                                return (n) sVar.f234427c.get();
                            default:
                                return (n) sVar.f234427c.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: ib6.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpareChangeScreen f160097b;

            {
                this.f160097b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SpareChangeScreen spareChangeScreen = this.f160097b;
                switch (i22) {
                    case 0:
                        int i3 = SpareChangeScreen.V;
                        qji.b bVarU2 = spareChangeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.donations.impl.ui.kompot.bottomsheet.spare_change.di.SpareChangeScreenComponent.Injector");
                        r rVar = (r) ((jb6.a) bVarU2).b().mo3808a(spareChangeScreen);
                        SpareChangeContract$InputData spareChangeContract$InputData = spareChangeScreen.Q;
                        switch (rVar.f234422a) {
                            case 0:
                                spareChangeContract$InputData.getClass();
                                rVar.d = spareChangeContract$InputData;
                                break;
                            default:
                                spareChangeContract$InputData.getClass();
                                rVar.d = spareChangeContract$InputData;
                                break;
                        }
                        return (s) rVar.mo3783build();
                    default:
                        int i5 = SpareChangeScreen.V;
                        s sVar = (s) spareChangeScreen.S.getValue();
                        switch (sVar.f234425a) {
                            case 0:
                                return (n) sVar.f234427c.get();
                            default:
                                return (n) sVar.f234427c.get();
                        }
                }
            }
        });
        this.U = u.c(suggestionsBarDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (s) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (n) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new g(this, null, 0), 3);
        ViewController.P2(this, f3(), new g(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.R.p().d), new h(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (n) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }
}
