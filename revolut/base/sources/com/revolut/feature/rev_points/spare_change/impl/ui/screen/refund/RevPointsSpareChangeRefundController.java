package com.revolut.feature.rev_points.spare_change.impl.ui.screen.refund;

import aii.q;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.internal.mlkit_vision_face.a;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.refund.RevPointsSpareChangeRefundController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import grl.k9;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mta.c;
import n2c.b;
import n2c.d;
import no.m;
import te0.w;
import w1c.i;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/rev_points/spare_change/impl/ui/screen/refund/RevPointsSpareChangeRefundController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Ln2c/b;", "Lno/m;", "<init>", "()V", "feature_rev_points_spare_change_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsSpareChangeRefundController extends BaseBottomSheetRecyclerController<q, b> implements m {
    public static final /* synthetic */ int U = 0;
    public final AnalyticsProduct.Retail Q;
    public final Object R;
    public final Object S;
    public final List T;

    public RevPointsSpareChangeRefundController() {
        k9 k9Var = k9.RevPoints;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.Q = a.h(k9Var, "value", k9Var);
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: n2c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsSpareChangeRefundController f211513b;

            {
                this.f211513b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RevPointsSpareChangeRefundController revPointsSpareChangeRefundController = this.f211513b;
                switch (i2) {
                    case 0:
                        int i3 = RevPointsSpareChangeRefundController.U;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsSpareChangeRefundController.m2()).a().get(w1c.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", w1c.a.class, " is not found"));
                        }
                        w1c.a aVar3 = ((w1c.a) aVar2.b()).f293821h;
                        i iVar = new i();
                        iVar.f293841a = e4m.b.b(new vrg.a(aVar3, 9));
                        return iVar;
                    default:
                        int i5 = RevPointsSpareChangeRefundController.U;
                        return (d) ((i) revPointsSpareChangeRefundController.R.getValue()).f293841a.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: n2c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsSpareChangeRefundController f211513b;

            {
                this.f211513b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RevPointsSpareChangeRefundController revPointsSpareChangeRefundController = this.f211513b;
                switch (i22) {
                    case 0:
                        int i3 = RevPointsSpareChangeRefundController.U;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsSpareChangeRefundController.m2()).a().get(w1c.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", w1c.a.class, " is not found"));
                        }
                        w1c.a aVar3 = ((w1c.a) aVar2.b()).f293821h;
                        i iVar = new i();
                        iVar.f293841a = e4m.b.b(new vrg.a(aVar3, 9));
                        return iVar;
                    default:
                        int i5 = RevPointsSpareChangeRefundController.U;
                        return (d) ((i) revPointsSpareChangeRefundController.R.getValue()).f293841a.get();
                }
            }
        });
        this.T = v.k(new FullScreenStateDelegate(), new TextDelegate(), new CellDetailsLoadingDelegate(), new CellDetailsDelegate());
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getR() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (d) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, e3(), null, new c(this, null, 12), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (d) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getT() {
        return this.T;
    }
}
