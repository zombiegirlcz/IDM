package com.revolut.retail.feature.stockdetails.impl.ui.bottom_sheet.investment_notice;

import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.stockdetails.impl.ui.bottom_sheet.investment_notice.InvestmentNoticeBottomSheet;
import java.util.List;
import jij.d;
import jsk.f;
import jsk.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import prk.g0;
import prk.n0;
import prk.z;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/bottom_sheet/investment_notice/InvestmentNoticeBottomSheet;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Ljsk/f;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvestmentNoticeBottomSheet extends BaseBottomSheetRecyclerController<q, f> {
    public static final /* synthetic */ int U = 0;
    public final Object Q;
    public final Object R;
    public final LargeActionButtonDelegate S;
    public final List T;

    public InvestmentNoticeBottomSheet() {
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: jsk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestmentNoticeBottomSheet f178184b;

            {
                this.f178184b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InvestmentNoticeBottomSheet investmentNoticeBottomSheet = this.f178184b;
                switch (i2) {
                    case 0:
                        int i3 = InvestmentNoticeBottomSheet.U;
                        phm.a aVar = (phm.a) ue0.e.j(investmentNoticeBottomSheet.m2()).a().get(n0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n0.class, " is not found"));
                        }
                        g0 g0Var = ((g0) ((n0) aVar2.b())).N;
                        z zVar = new z();
                        zVar.f239321a = e4m.b.b(new prk.q(g0Var, 2));
                        return zVar;
                    default:
                        int i5 = InvestmentNoticeBottomSheet.U;
                        return (l) ((z) investmentNoticeBottomSheet.Q.getValue()).f239321a.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: jsk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestmentNoticeBottomSheet f178184b;

            {
                this.f178184b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InvestmentNoticeBottomSheet investmentNoticeBottomSheet = this.f178184b;
                switch (i22) {
                    case 0:
                        int i3 = InvestmentNoticeBottomSheet.U;
                        phm.a aVar = (phm.a) ue0.e.j(investmentNoticeBottomSheet.m2()).a().get(n0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n0.class, " is not found"));
                        }
                        g0 g0Var = ((g0) ((n0) aVar2.b())).N;
                        z zVar = new z();
                        zVar.f239321a = e4m.b.b(new prk.q(g0Var, 2));
                        return zVar;
                    default:
                        int i5 = InvestmentNoticeBottomSheet.U;
                        return (l) ((z) investmentNoticeBottomSheet.Q.getValue()).f239321a.get();
                }
            }
        });
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.S = largeActionButtonDelegate;
        this.T = v.k(new FullScreenStateDelegate(), largeActionButtonDelegate, new LargeActionButtonLoadingDelegate(), new PlainTextLoadingDelegate(), new TextDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b k3() {
        return (l) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        LargeActionButtonDelegate largeActionButtonDelegate = this.S;
        ViewController.P2(this, new d(rd0.e.b(largeActionButtonDelegate.d.f121375b), 9), new jsk.d(this, null), 3);
        ViewController.P2(this, new d(rd0.e.b(largeActionButtonDelegate.d.f121375b), 10), new jsk.e(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (l) this.R.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getT() {
        return this.T;
    }
}
