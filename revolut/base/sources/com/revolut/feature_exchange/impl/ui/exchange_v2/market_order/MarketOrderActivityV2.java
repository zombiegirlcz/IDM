package com.revolut.feature_exchange.impl.ui.exchange_v2.market_order;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfig;
import com.revolut.feature_exchange.impl.R$string;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.ui_kit.payments.R$id;
import com.revolut.ui_kit.payments.R$layout;
import efm.r;
import g1i.m0;
import i2i.d0;
import i2i.k;
import ihm.f;
import j1i.c;
import java.util.List;
import jo0.g;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import le.u1;
import ofm.h;
import opi.b;
import pri.e;
import te0.w;
import xoi.d;
import yhm.j;
import yp0.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature_exchange/impl/ui/exchange_v2/market_order/MarketOrderActivityV2;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesActivity;", "Li2i/j;", "Li2i/k;", "Lno/k;", "<init>", "()V", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MarketOrderActivityV2 extends BaseDelegatesActivity implements k, no.k {
    public static final /* synthetic */ KProperty[] I0;
    public nqi.a G0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public b f96937r0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public AnalyticsContext f96939t0;
    public c u0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Lazy f96938s0 = j.b(new hzl.a(14));

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final j90.a f96940v0 = u1.w(this, R$id.recyclerView);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final j90.a f96941w0 = u1.w(this, R$id.settings_button);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final RowDelegate f96942x0 = new RowDelegate(null, null, 7);
    public final AccountCellItemDelegate y0 = new AccountCellItemDelegate();
    public final Object z0 = w.y0(new hzl.a(15));
    public final Object A0 = w.y0(new hzl.a(16));
    public final Object B0 = w.y0(new hzl.a(17));
    public final Object C0 = w.y0(new hzl.a(18));
    public final CellDetailsDelegate D0 = new CellDetailsDelegate();
    public final Object E0 = j.c(yhm.k.NONE, new i2i.b(this, 0));
    public final f F0 = v0.a.d("create(...)");
    public final CenteredAmountDelegate H0 = new CenteredAmountDelegate(new hw9.b(this, 22));

    static {
        h0 h0Var = new h0(MarketOrderActivityV2.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0);
        p0 p0Var = o0.f186429a;
        I0 = new KProperty[]{p0Var.j(h0Var), p.a.y(MarketOrderActivityV2.class, "settingsButton", "getSettingsButton()Lcom/revolut/core/ui_kit/views/LargeActionButton;", 0, p0Var)};
    }

    @Override // nri.b
    public final e F0() {
        c cVar = this.u0;
        if (cVar != null) {
            return (i2i.j) cVar.R.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF85962s0() {
        return (String) this.f96938s0.getValue();
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.f96939t0 = analyticsContext;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        c cVar = this.u0;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p1i.b
    public final f P1() {
        return ((TextDelegate) this.B0.getValue()).d;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getL() {
        return this.f96939t0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // h1i.b, p1i.b
    public final r S() {
        return ((LargeActionButtonDelegate) this.z0.getValue()).d.f121375b;
    }

    @Override // p1i.b
    public final r W0() {
        b bVar = this.f96937r0;
        if (bVar != null) {
            return bVar.W0();
        }
        Intrinsics.r("expandableDialogActivityDelegate");
        throw null;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        super.onActivityResult(i, i2, intent);
        if (intent == null || (stringExtra = intent.getStringExtra("argCurrency")) == null) {
            return;
        }
        xi0.b.Companion.getClass();
        xi0.b currency = xi0.a.a(stringExtra);
        String stringExtra2 = intent.getStringExtra("argPocketId");
        i2i.j jVar = (i2i.j) this.f218652a0;
        if (jVar != null) {
            a aVar = (a) jVar;
            Intrinsics.checkNotNullParameter(currency, "currency");
            efm.b bVarU = mo3.a.u(o70.a.g(m1i.k.P(aVar.k, currency, stringExtra2, null, 8)), aVar.o, false);
            Intrinsics.checkNotNullExpressionValue(bVarU, "withProgress(...)");
            efm.b bVarL = hx7.a.L(bVarU, aVar.f96950p, false, null, 24);
            hq1.f fVar = new hq1.f(aVar, 16);
            Function1 function1K = aVar.K();
            pfm.a aVar2 = new pfm.a(bVarL, new a08.p0(19, new d0(new BreadcrumbException(), 4)), 2);
            Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
            h hVarW = aVar2.w(new a08.o0(23, function1K), new ea9.c(24, fVar));
            Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
            w.j0(aVar.f239031a, hVarW);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        setContentView(R$layout.screen_market_order_activity_v2);
        if (((Boolean) g.v.getValue()).booleanValue()) {
            Window window = getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
            rv0.h.a(window);
        }
        jri.f fVarL = com.bumptech.glide.c.l(this);
        String f89236v0 = getF85962s0();
        ExchangeFeatureConfig exchangeFeatureConfig = (ExchangeFeatureConfig) G0();
        j1i.a aVar = ((j1i.a) fVarL.b(exchangeFeatureConfig instanceof ExchangeFeatureConfig.Buy ? ((ExchangeFeatureConfig.Buy) exchangeFeatureConfig).f : exchangeFeatureConfig instanceof ExchangeFeatureConfig.Sell ? ((ExchangeFeatureConfig.Sell) exchangeFeatureConfig).f96853g : AccountId.Personal.f51414a, f89236v0)).V;
        d dVarG = rd0.e.g(this, bundle, null);
        vpi.d.Companion.getClass();
        ypi.h.Companion.getClass();
        dqi.h hVar = new dqi.h(R$id.recyclerView);
        hpi.g.Companion.getClass();
        c cVar = new c(aVar, dVarG, hVar);
        this.u0 = cVar;
        m0 m0Var = (m0) ((g1i.b) cVar.f170510c.f170466b0.get());
        m0Var.w0().set(G0());
        m0Var.H0().set(Boolean.TRUE);
        c cVar2 = this.u0;
        if (cVar2 == null) {
            Intrinsics.r("activityComponent");
            throw null;
        }
        this.f96937r0 = (b) cVar2.v.get();
        super.onCreate(bundle);
        KProperty[] kPropertyArr = I0;
        RecyclerView recyclerView = (RecyclerView) this.f96940v0.getValue(this, kPropertyArr[0]);
        y.h(recyclerView, (z4l.j) this.E0.getValue(), new LinearLayoutManager(recyclerView.getContext()));
        b bVar = this.f96937r0;
        if (bVar == null) {
            Intrinsics.r("expandableDialogActivityDelegate");
            throw null;
        }
        bVar.X(new i2i.b(this, 1));
        KProperty kProperty = kPropertyArr[1];
        j90.a aVar2 = this.f96941w0;
        ((LargeActionButton) aVar2.getValue(this, kProperty)).setIcon(new ResourceImage(R$drawable.uikit_icn_24_controls, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246));
        pd.b.p((LargeActionButton) aVar2.getValue(this, kPropertyArr[1]), new TextLocalisedClause(R$string.fx_orders_order_type_select_title, null, null, 14));
    }

    @Override // nri.b, in0.g
    public final boolean p0() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // c2i.m
    public final r r0() {
        return ((CellDetailsSwitcherDelegate) this.C0.getValue()).d;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((z4l.j) this.E0.getValue()).c(items);
    }

    @Override // c2i.m
    public final r x0() {
        f fVar = this.y0.f51551c.f53218h;
        i2i.d dVar = i2i.d.f;
        r map = fVar.map(new h35.c(10));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
