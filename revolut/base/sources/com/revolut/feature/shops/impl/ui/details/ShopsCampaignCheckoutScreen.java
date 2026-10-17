package com.revolut.feature.shops.impl.ui.details;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import chc.c0;
import cjd.c;
import cjd.d;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsBadgeDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.feature.shops.api.model.ShopsCampaignDetails;
import com.revolut.feature.shops.api.model.ShopsCampaignOffer;
import com.revolut.feature.shops.api.model.ShopsShortCampaignInfo;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.tracking.v3.ShopsContext;
import did.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import no.k;
import te0.w;
import vkm.q;
import whd.b;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shops/impl/ui/details/ShopsCampaignCheckoutScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "", "Lcjd/d;", "Lwhd/b;", "Lno/k;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShopsCampaignCheckoutScreen extends BaseBottomSheetRecyclerController<Object, d> implements b, k {
    public static final /* synthetic */ int W = 0;
    public AnalyticsContext Q;
    public final Object R;
    public final RowDelegate S;
    public final CellDetailsDelegate T;
    public final Object U;
    public final Object V;

    public ShopsCampaignCheckoutScreen(ShopsCampaignCheckoutScreenContract$InputData inputData) {
        AnalyticsContext analyticsContext;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        ShopsCampaignDetails shopsCampaignDetails = inputData.f87163a;
        if (shopsCampaignDetails instanceof ShopsCampaignOffer) {
            ShopsCampaignOffer shopsCampaignOffer = (ShopsCampaignOffer) shopsCampaignDetails;
            analyticsContext = new AnalyticsContext(zid.a.a(shopsCampaignOffer, shopsCampaignOffer.f87036t, null));
        } else {
            if (!(shopsCampaignDetails instanceof ShopsShortCampaignInfo)) {
                throw new NoWhenBranchMatchedException();
            }
            ShopsShortCampaignInfo shopsShortCampaignInfo = (ShopsShortCampaignInfo) shopsCampaignDetails;
            String str = shopsShortCampaignInfo.f87074c;
            Intrinsics.checkNotNullParameter(shopsShortCampaignInfo, "<this>");
            String str2 = shopsShortCampaignInfo.f87073b;
            AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
            ShopsContext.a aVarNewBuilder = ShopsContext.newBuilder();
            aVarNewBuilder.j(str2);
            if (str != null) {
                aVarNewBuilder.h(str);
            }
            w0 w0VarA = aVarNewBuilder.a();
            companion.getClass();
            analyticsContext = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
        }
        this.Q = analyticsContext;
        this.R = w.y0(new c0(4));
        this.S = new RowDelegate(null, null, 7);
        this.T = new CellDetailsDelegate();
        this.U = w.y0(new cf6.a(this, inputData, 7));
        this.V = w.y0(new bvb.a(this, 21));
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.Q = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getK() {
        return new AnalyticsProduct.Retail(super.f0());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.U.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getQ() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Activity activity = m2();
        Intrinsics.checkNotNullParameter(activity, "activity");
        View decorView = activity.getWindow().getDecorView();
        Intrinsics.i(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup parentView = (ViewGroup) decorView;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        new ArrayList();
        q.b(16, 1, ukm.f.DROP_OLDEST);
        Intrinsics.checkNotNullExpressionValue(new ihm.f(), "create(...)");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e3(), null, new cjd.a(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, d3(), null, new cjd.a(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.R.getValue()).f52371h.f121375b), null, new cjd.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.f53226s), null, new cjd.a(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.T.f), null, new c(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getR() {
        return v.k(this.S, this.T, new CellDetailsBadgeDelegate(), (FullScreenStateDelegate) this.R.getValue(), new RowLoadingDelegate(), new LargeActionButtonLoadingDelegate(), new PlainTextDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: m3, reason: merged with bridge method [inline-methods] */
    public final cjd.e R2() {
        return (cjd.e) this.V.getValue();
    }
}
