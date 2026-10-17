package wh3;

import ael.s;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.retail.core.navigation.NaviCommand;
import di3.w;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends qh3.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final di3.k f297378l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w f297379m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zfk.c f297380n;

    public i(di3.k checkoutHandler, w resultHandler, zfk.c planSubscriberControllerModelExtension) {
        Intrinsics.checkNotNullParameter(checkoutHandler, "checkoutHandler");
        Intrinsics.checkNotNullParameter(resultHandler, "resultHandler");
        Intrinsics.checkNotNullParameter(planSubscriberControllerModelExtension, "planSubscriberControllerModelExtension");
        this.f297378l = checkoutHandler;
        this.f297379m = resultHandler;
        this.f297380n = planSubscriberControllerModelExtension;
    }

    @Override // qh3.a
    public final void Z2(CheckoutParams params, AnalyticsProduct eventProduct, NaviCommand naviCommand, boolean z) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(eventProduct, "eventProduct");
        T2(new vq5.w(this, params, new s(this, params, eventProduct, naviCommand, z, 12), null, 29), new yi5.b(27));
    }
}
