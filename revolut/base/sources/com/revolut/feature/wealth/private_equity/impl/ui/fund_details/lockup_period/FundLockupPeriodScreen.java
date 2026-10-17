package com.revolut.feature.wealth.private_equity.impl.ui.fund_details.lockup_period;

import aii.q;
import android.os.Parcelable;
import android.view.View;
import cli.k;
import com.google.android.gms.internal.mlkit_vision_face.a;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.lockup_period.FundLockupPeriodScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import ggh.c;
import ggh.d;
import grl.k9;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import pki.b;
import te0.w;
import ufh.f;
import ufh.i;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/lockup_period/FundLockupPeriodScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lcli/k;", "Lno/m;", "Lno/k;", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FundLockupPeriodScreen extends BaseBottomSheetRecyclerController<q, k> implements m, no.k {
    public static final /* synthetic */ int W = 0;
    public final c Q;
    public final AnalyticsProduct.Retail R;
    public AnalyticsContext S;
    public final Object T;
    public final Object U;
    public final List V;

    public FundLockupPeriodScreen(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        k9 k9Var = k9.Trading;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.R = a.h(k9Var, "value", k9Var);
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: ggh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FundLockupPeriodScreen f143683b;

            {
                this.f143683b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FundLockupPeriodScreen fundLockupPeriodScreen = this.f143683b;
                switch (i2) {
                    case 0:
                        int i3 = FundLockupPeriodScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(fundLockupPeriodScreen.m2()).a().get(i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i.class, " is not found"));
                        }
                        i iVar = ((i) aVar2.b()).f279862s;
                        c cVar = fundLockupPeriodScreen.Q;
                        cVar.getClass();
                        return new ufh.f(iVar, cVar);
                    default:
                        int i5 = FundLockupPeriodScreen.W;
                        return (d) ((ufh.f) fundLockupPeriodScreen.T.getValue()).f279840b.get();
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: ggh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FundLockupPeriodScreen f143683b;

            {
                this.f143683b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FundLockupPeriodScreen fundLockupPeriodScreen = this.f143683b;
                switch (i22) {
                    case 0:
                        int i3 = FundLockupPeriodScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(fundLockupPeriodScreen.m2()).a().get(i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i.class, " is not found"));
                        }
                        i iVar = ((i) aVar2.b()).f279862s;
                        c cVar = fundLockupPeriodScreen.Q;
                        cVar.getClass();
                        return new ufh.f(iVar, cVar);
                    default:
                        int i5 = FundLockupPeriodScreen.W;
                        return (d) ((ufh.f) fundLockupPeriodScreen.T.getValue()).f279840b.get();
                }
            }
        });
        this.V = v.k(new CellDetailsDelegate(), new ListSubheaderDelegate());
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.S = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getK() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.T.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getW() {
        return this.S;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (d) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new g85.f(this, null, 10), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (d) this.U.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.V;
    }
}
