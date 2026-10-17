package com.revolut.feature.topup_screen.impl.flows.topup.fee_bottom_sheet;

import android.view.View;
import cli.k;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.topup_screen.impl.flows.topup.fee_bottom_sheet.TopUpFeesBottomSheetScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import qve.n;
import qve.s;
import sye.d;
import sye.e;
import sye.g;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/fee_bottom_sheet/TopUpFeesBottomSheetScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "", "Lcli/k;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TopUpFeesBottomSheetScreen extends BaseBottomSheetRecyclerController<Object, k> {
    public static final /* synthetic */ int V = 0;
    public final e Q;
    public final CellDetailsDelegate R;
    public final Object S;
    public final Object T;
    public final List U;

    public TopUpFeesBottomSheetScreen(e inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        CellDetailsDelegate cellDetailsDelegate = new CellDetailsDelegate();
        this.R = cellDetailsDelegate;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: sye.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TopUpFeesBottomSheetScreen f266669b;

            {
                this.f266669b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TopUpFeesBottomSheetScreen topUpFeesBottomSheetScreen = this.f266669b;
                switch (i2) {
                    case 0:
                        int i3 = TopUpFeesBottomSheetScreen.V;
                        qji.b bVarU2 = topUpFeesBottomSheetScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.topup_screen.impl.flows.topup.fee_bottom_sheet.di.TopUpFeesBottomSheetScreenInjector");
                        }
                        n nVar = (n) bVarU2;
                        qve.k kVar = nVar.f249629b;
                        n nVar2 = nVar.f249630c;
                        e eVar = topUpFeesBottomSheetScreen.Q;
                        eVar.getClass();
                        return new s(kVar, nVar2, eVar);
                    default:
                        int i5 = TopUpFeesBottomSheetScreen.V;
                        return (d) ((s) ((tye.a) topUpFeesBottomSheetScreen.S.getValue())).f249655c.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: sye.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TopUpFeesBottomSheetScreen f266669b;

            {
                this.f266669b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TopUpFeesBottomSheetScreen topUpFeesBottomSheetScreen = this.f266669b;
                switch (i22) {
                    case 0:
                        int i3 = TopUpFeesBottomSheetScreen.V;
                        qji.b bVarU2 = topUpFeesBottomSheetScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.topup_screen.impl.flows.topup.fee_bottom_sheet.di.TopUpFeesBottomSheetScreenInjector");
                        }
                        n nVar = (n) bVarU2;
                        qve.k kVar = nVar.f249629b;
                        n nVar2 = nVar.f249630c;
                        e eVar = topUpFeesBottomSheetScreen.Q;
                        eVar.getClass();
                        return new s(kVar, nVar2, eVar);
                    default:
                        int i5 = TopUpFeesBottomSheetScreen.V;
                        return (d) ((s) ((tye.a) topUpFeesBottomSheetScreen.S.getValue())).f249655c.get();
                }
            }
        });
        this.U = u.c(cellDetailsDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (tye.a) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (d) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.R.d), new g(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (d) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }
}
