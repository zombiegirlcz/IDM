package com.revolut.feature.credit.core.ui.bottom_sheet.action;

import android.view.View;
import ay4.c;
import ay4.f;
import ay4.g;
import cli.k;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.feature.credit.core.ui.bottom_sheet.BottomSheet$InputData$Action;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import pki.b;
import te0.w;
import vkm.q;
import xki.a;
import xki.e;
import zhm.v;
import zx4.d;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u00042\u00020\u00062\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/credit/core/ui/bottom_sheet/action/ActionsBottomSheetController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lzx4/d;", "Lcli/k;", "", "Lcom/revolut/feature/credit/core/ui/bottom_sheet/BottomSheet$InputData$Action;", "Lno/m;", "Lno/k;", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ActionsBottomSheetController extends BaseBottomSheetRecyclerController<d, k> implements m, no.k {
    public static final /* synthetic */ int X = 0;
    public final AnalyticsProduct Q;
    public AnalyticsContext R;
    public final a S;
    public final ay4.a T;
    public final Object U;
    public final Object V;
    public final List W;

    public ActionsBottomSheetController(BottomSheet$InputData$Action inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData.f69830h;
        this.R = inputData.i;
        this.S = a.f306815a;
        this.T = new ay4.a(new c(inputData, new by4.a()));
        Lazy lazyY0 = w.y0(new aw1.a(13));
        this.U = lazyY0;
        Lazy lazyY02 = w.y0(new aw1.a(14));
        this.V = lazyY02;
        this.W = v.k((CellDetailsDelegate) lazyY0.getValue(), (PlainTextDelegate) lazyY02.getValue());
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.R = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getQ() {
        return this.Q;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return this.S;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getR() {
        return this.R;
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return this.T;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, new f(q.J(rd0.e.b(((CellDetailsDelegate) this.U.getValue()).f)), yx4.b.Companion, 0), null, new g(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e3(), null, new g(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, f3(), null, new g(this, null, 2), 3);
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return this.T;
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getW() {
        return this.W;
    }
}
