package com.revolut.feature_exchange.impl.ui.exchange.order_summary;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfig;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import efm.r;
import g1i.m0;
import hpi.c;
import hpi.d;
import hpi.k;
import j1i.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import opi.b;
import org.jmrtd.cbeff.ISO781611;
import pri.e;
import te0.w;
import z1i.a;
import z1i.b0;
import z1i.h;
import z4l.j;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature_exchange/impl/ui/exchange/order_summary/OrderSummaryActivity;", "Lhpi/d;", "Lz1i/e;", "Lz1i/h;", "Lcom/revolut/uicomponent/toolbar/app_bar/RevolutToolbar;", "<init>", "()V", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OrderSummaryActivity extends d implements h {
    public static final /* synthetic */ int G0 = 0;
    public final Object A0;
    public final ActionWidgetDelegate C0;
    public final ScrollerDelegate D0;
    public b E0;
    public final Object F0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public f f96912s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f96913t0 = "ORDER_EXCHANGE_FLOW";
    public final Object u0 = w.y0(new yui.d(24));

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Object f96914v0 = w.y0(new yui.d(25));

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Object f96915w0 = w.y0(new yui.d(26));

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Object f96916x0 = w.y0(new yui.d(27));
    public final Object y0 = w.y0(new yui.d(28));
    public final Object z0 = w.y0(new yui.d(29));
    public final Object B0 = w.y0(new a(1));

    public OrderSummaryActivity() {
        int i = 0;
        this.A0 = w.y0(new a(i));
        HeroBannerDelegate heroBannerDelegate = new HeroBannerDelegate(0);
        ActionWidgetDelegate actionWidgetDelegate = new ActionWidgetDelegate();
        this.C0 = actionWidgetDelegate;
        this.D0 = new ScrollerDelegate(v.k(heroBannerDelegate, new ActionWidgetLoadingDelegate(), actionWidgetDelegate), false);
        this.F0 = w.y0(new z1i.b(this, i));
    }

    @Override // nri.b
    public final e F0() {
        f fVar = this.f96912s0;
        if (fVar != null) {
            return (z1i.e) fVar.P.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // mkd.g
    public final r F1() {
        return this.D0.i;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF71175s0() {
        return this.f96913t0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        f fVar = this.f96912s0;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mga.j0
    public final r T() {
        return ((RowDelegate) this.u0.getValue()).f53218h;
    }

    @Override // hpi.d
    public final c b1() {
        c cVar = new c(new k(BitmapDescriptorFactory.HUE_RED, R$attr.uikit_colorGroupedBackground, ISO781611.SMT_TAG));
        xpi.f.Companion.getClass();
        xpi.f configuration = xpi.f.f307976c;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        cVar.f = configuration;
        c.b(cVar);
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final CellDetailsActionDelegate c1() {
        return (CellDetailsActionDelegate) this.f96915w0.getValue();
    }

    @Override // mga.j0
    public final View g0() {
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        return decorView;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mga.j0
    public final ihm.f o0() {
        return ((HighlightTileDelegate) this.f96914v0.getValue()).f52437c;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 17290 && i2 == 41053) {
            finish();
        }
    }

    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        OrderSummaryContract$Configuration orderSummaryContract$Configuration = (OrderSummaryContract$Configuration) I0();
        if (orderSummaryContract$Configuration == null) {
            orderSummaryContract$Configuration = new OrderSummaryContract$Configuration(false, false, 7);
        }
        ExchangeFeatureConfig exchangeFeatureConfig = orderSummaryContract$Configuration.d;
        ExchangeOrderDraft exchangeOrderDraft = orderSummaryContract$Configuration.f96919c;
        j1i.a aVar = ((j1i.a) com.bumptech.glide.c.l(this).b(null, this.f96913t0)).V;
        xoi.d dVarG = rd0.e.g(this, bundle, null);
        xpi.f.Companion.getClass();
        ypi.h.Companion.getClass();
        f fVar = new f(aVar, dVarG, orderSummaryContract$Configuration, this);
        this.f96912s0 = fVar;
        this.E0 = (b) fVar.f170565m.get();
        if (bundle == null && exchangeOrderDraft != null && exchangeFeatureConfig != null) {
            f fVar2 = this.f96912s0;
            if (fVar2 == null) {
                Intrinsics.r("activityComponent");
                throw null;
            }
            m0 m0Var = (m0) ((g1i.b) fVar2.d.f170466b0.get());
            m0Var.y0().set(exchangeOrderDraft);
            m0Var.w0().set(exchangeFeatureConfig);
        }
        super.onCreate(bundle);
        vyl.a.a(Z0(), (j) this.F0.getValue(), new hoi.j(null, 7), u.c(new o31.b()), null, 24);
        b bVar = this.E0;
        if (bVar == null) {
            Intrinsics.r("expandableDialogActivityDelegate");
            throw null;
        }
        ?? r110 = this.z0;
        PlainTextDelegate plainTextDelegate = (PlainTextDelegate) r110.getValue();
        ?? r4 = this.A0;
        int i = 1;
        bVar.Y("CRYPTO_PRICE_ORDER_DIALOG_DELEGATES_KEY", v.k(plainTextDelegate, (LargeActionButtonDelegate) r4.getValue()));
        b bVar2 = this.E0;
        if (bVar2 == null) {
            Intrinsics.r("expandableDialogActivityDelegate");
            throw null;
        }
        bVar2.Y("COMMODITY_PRICE_DESCRIPTION_DIALOG_DELEGATES_KEY", v.k((PlainTextDelegate) r110.getValue(), (LargeActionButtonDelegate) r4.getValue()));
        b bVar3 = this.E0;
        if (bVar3 != null) {
            bVar3.X(new z1i.b(this, i));
        } else {
            Intrinsics.r("expandableDialogActivityDelegate");
            throw null;
        }
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        z1i.e eVar;
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        OrderSummaryContract$Configuration orderSummaryContract$Configuration = (OrderSummaryContract$Configuration) nri.b.H0(intent);
        if (orderSummaryContract$Configuration == null || !orderSummaryContract$Configuration.f96917a || (eVar = (z1i.e) this.f218652a0) == null) {
            return;
        }
        ((b0) eVar).B.onNext(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((j) this.F0.getValue()).c(items);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mkd.g
    public final koi.c v0() {
        return ((j) this.F0.getValue()).f;
    }
}
