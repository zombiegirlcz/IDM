package com.revolut.feature.pay_later.impl.ui.overdue_info;

import aii.q;
import android.view.View;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.feature.pay_later.impl.ui.overdue_info.OverdueInfoController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import no.m;
import oi9.d;
import oi9.f;
import te0.w;
import tj9.b;
import tj9.c;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/pay_later/impl/ui/overdue_info/OverdueInfoController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Ltj9/b;", "Lno/m;", "<init>", "()V", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OverdueInfoController extends BaseBottomSheetRecyclerController<q, b> implements m {
    public static final /* synthetic */ int U = 0;
    public final Object R;
    public final Object S;
    public final /* synthetic */ ij9.b Q = ij9.b.f161739a;
    public final List T = v.k(new RowLoadingDelegate(), new FullScreenStateDelegate(), new PlainTextDelegate(), new CellDetailsDelegate());

    public OverdueInfoController() {
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: tj9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OverdueInfoController f271609b;

            {
                this.f271609b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                OverdueInfoController overdueInfoController = this.f271609b;
                switch (i2) {
                    case 0:
                        int i3 = OverdueInfoController.U;
                        f fVar = s.n(overdueInfoController.m2()).v;
                        oi9.d dVar = new oi9.d();
                        dVar.f225491a = e4m.b.b(new ogf.b(fVar, 2));
                        return dVar;
                    default:
                        int i5 = OverdueInfoController.U;
                        return (c) ((oi9.d) overdueInfoController.R.getValue()).f225491a.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: tj9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OverdueInfoController f271609b;

            {
                this.f271609b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                OverdueInfoController overdueInfoController = this.f271609b;
                switch (i22) {
                    case 0:
                        int i3 = OverdueInfoController.U;
                        f fVar = s.n(overdueInfoController.m2()).v;
                        oi9.d dVar = new oi9.d();
                        dVar.f225491a = e4m.b.b(new ogf.b(fVar, 2));
                        return dVar;
                    default:
                        int i5 = OverdueInfoController.U;
                        return (c) ((oi9.d) overdueInfoController.R.getValue()).f225491a.get();
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getR() {
        this.Q.getClass();
        return ij9.b.f161740b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new t05.m(this, null, 27), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (c) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getT() {
        return this.T;
    }
}
