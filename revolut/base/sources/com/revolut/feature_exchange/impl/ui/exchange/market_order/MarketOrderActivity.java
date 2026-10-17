package com.revolut.feature_exchange.impl.ui.exchange.market_order;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.AmountDualEditDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.trading_orders.api.invest.placement.account.selector.InvestAccountSelectorContract$Account;
import com.revolut.feature.trading_orders.api.invest.placement.account.selector.InvestAccountSelectorContract$CommodityAccount;
import com.revolut.feature.trading_orders.api.invest.placement.account.selector.InvestAccountSelectorContract$InvestAccount;
import com.revolut.feature.trading_orders.api.invest.placement.account.selector.InvestAccountSelectorContract$MainAccount;
import com.revolut.feature.trading_orders.api.invest.placement.account.selector.InvestAccountSelectorContract$OutputData;
import com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfig;
import com.revolut.uicomponent.R$id;
import efm.r;
import g1i.m0;
import hpi.c;
import hpi.d;
import hpi.g;
import ihm.f;
import j1i.b;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kx7.o0;
import m1i.i1;
import m1i.l;
import m1i.n;
import no.k;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import pri.e;
import rv0.h;
import te0.w;
import v0.a;
import wd6.i;
import yhm.j;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \b2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00032\u00020\u0005:\u0001\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/revolut/feature_exchange/impl/ui/exchange/market_order/MarketOrderActivity;", "Lhpi/d;", "Lm1i/l;", "Lm1i/n;", "Lcom/revolut/uicomponent/toolbar/app_bar/RevolutToolbar;", "Lno/k;", "<init>", "()V", "Companion", "a", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MarketOrderActivity extends d implements n, k {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public b f96868s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public AnalyticsContext f96869t0;
    public opi.b u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final RowDelegate f96870v0 = new RowDelegate(null, null, 7);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final AccountCellItemDelegate f96871w0 = new AccountCellItemDelegate();

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Object f96872x0 = w.y0(new m05.d(15));
    public final Object y0 = w.y0(new m05.d(16));
    public final Object z0 = w.y0(new m1i.b(this, 0));
    public final Object A0 = w.y0(new m05.d(17));
    public final Object B0 = j.c(yhm.k.NONE, new m1i.b(this, 1));
    public final f C0 = a.d("create(...)");
    public final f D0 = a.d("create(...)");
    public final Lazy E0 = j.b(new m05.d(18));

    /* JADX INFO: renamed from: com.revolut.feature_exchange.impl.ui.exchange.market_order.MarketOrderActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    @Override // nri.b
    public final e F0() {
        b bVar = this.f96868s0;
        if (bVar != null) {
            return (l) bVar.N.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF82699s0() {
        return (String) this.E0.getValue();
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.f96869t0 = analyticsContext;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        b bVar = this.f96868s0;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p1i.b
    public final f P1() {
        return ((TextDelegate) this.y0.getValue()).d;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getO() {
        return this.f96869t0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // h1i.b, p1i.b
    public final r S() {
        return ((LargeActionButtonDelegate) this.f96872x0.getValue()).d.f121375b;
    }

    @Override // p1i.b
    public final r W0() {
        opi.b bVar = this.u0;
        if (bVar != null) {
            return bVar.W0();
        }
        Intrinsics.r("expandableDialogActivityDelegate");
        throw null;
    }

    @Override // hpi.d
    public final c b1() {
        c cVar = new c(new hpi.k(96.0f, R$attr.uikit_colorGroupedBackground, LDSFile.EF_DG2_TAG));
        xpi.f.Companion.getClass();
        xpi.f configuration = xpi.f.f307976c;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        cVar.f = configuration;
        c.b(cVar);
        g.Companion.getClass();
        g keyboardSuggestionsConfiguration = g.f154557b;
        Intrinsics.checkNotNullParameter(keyboardSuggestionsConfiguration, "keyboardSuggestionsConfiguration");
        cVar.k = keyboardSuggestionsConfiguration;
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final AmountDualEditDelegate c1() {
        return (AmountDualEditDelegate) this.z0.getValue();
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        InvestAccountSelectorContract$OutputData investAccountSelectorContract$OutputData;
        yhm.r rVar;
        String stringExtra;
        super.onActivityResult(i, i2, intent);
        if (intent != null && (stringExtra = intent.getStringExtra("argCurrency")) != null) {
            xi0.b.Companion.getClass();
            xi0.b bVarA = xi0.a.a(stringExtra);
            l lVar = (l) this.f218652a0;
            if (lVar != null) {
                ((i1) lVar).U(bVarA, i, null, null);
            }
        }
        if (intent == null || (investAccountSelectorContract$OutputData = (InvestAccountSelectorContract$OutputData) intent.getParcelableExtra("RESULT_KEY")) == null) {
            return;
        }
        InvestAccountSelectorContract$Account investAccountSelectorContract$Account = investAccountSelectorContract$OutputData.f91715a;
        if (investAccountSelectorContract$Account instanceof InvestAccountSelectorContract$InvestAccount) {
            kel.a aVar = ((InvestAccountSelectorContract$InvestAccount) investAccountSelectorContract$Account).f91713a.f183148a;
            rVar = new yhm.r(aVar.e, i.TRADING, aVar.f183145a);
        } else if (investAccountSelectorContract$Account instanceof InvestAccountSelectorContract$MainAccount) {
            io3.d dVar = ((InvestAccountSelectorContract$MainAccount) investAccountSelectorContract$Account).f91714a;
            rVar = new yhm.r(dVar.f163147c, i.CURRENT, dVar.f163145a);
        } else {
            if (!(investAccountSelectorContract$Account instanceof InvestAccountSelectorContract$CommodityAccount)) {
                throw new NoWhenBranchMatchedException();
            }
            InvestAccountSelectorContract$CommodityAccount investAccountSelectorContract$CommodityAccount = (InvestAccountSelectorContract$CommodityAccount) investAccountSelectorContract$Account;
            String str = investAccountSelectorContract$CommodityAccount.f91703a.f306286a;
            i iVar = i.CURRENT;
            io3.d dVar2 = investAccountSelectorContract$CommodityAccount.f91704b;
            rVar = new yhm.r(str, iVar, dVar2 != null ? dVar2.f163145a : null);
        }
        String str2 = (String) rVar.f314201a;
        i iVar2 = (i) rVar.f314202b;
        String str3 = (String) rVar.f314203c;
        l lVar2 = (l) this.f218652a0;
        if (lVar2 != null) {
            xi0.b.Companion.getClass();
            ((i1) lVar2).U(xi0.a.a(str2), i, iVar2, str3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (((Boolean) jo0.g.v.getValue()).booleanValue()) {
            Window window = getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
            h.a(window);
        }
        jri.f fVarL = com.bumptech.glide.c.l(this);
        String f76394t0 = getF82699s0();
        ExchangeFeatureConfig exchangeFeatureConfig = (ExchangeFeatureConfig) G0();
        j1i.a aVar = ((j1i.a) fVarL.b(exchangeFeatureConfig instanceof ExchangeFeatureConfig.Buy ? ((ExchangeFeatureConfig.Buy) exchangeFeatureConfig).f : exchangeFeatureConfig instanceof ExchangeFeatureConfig.Sell ? ((ExchangeFeatureConfig.Sell) exchangeFeatureConfig).f96853g : AccountId.Personal.f51414a, f76394t0)).V;
        xoi.d dVarG = rd0.e.g(this, bundle, null);
        xpi.f.Companion.getClass();
        ypi.h.Companion.getClass();
        dqi.h hVar = new dqi.h(R$id.recyclerView);
        g.Companion.getClass();
        b bVar = new b(aVar, dVarG, hVar);
        this.f96868s0 = bVar;
        m0 m0Var = (m0) ((g1i.b) bVar.f170493c.f170466b0.get());
        m0Var.w0().set(G0());
        m0Var.H0().set(Boolean.FALSE);
        b bVar2 = this.f96868s0;
        if (bVar2 == null) {
            Intrinsics.r("activityComponent");
            throw null;
        }
        this.u0 = (opi.b) bVar2.v.get();
        super.onCreate(bundle);
        vyl.a.a(Z0(), (z4l.j) this.B0.getValue(), new hoi.j(null, 7), u.c(new o31.b()), null, 24);
        opi.b bVar3 = this.u0;
        if (bVar3 != null) {
            bVar3.X(new m1i.b(this, 2));
        } else {
            Intrinsics.r("expandableDialogActivityDelegate");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((z4l.j) this.B0.getValue()).c(items);
    }

    @Override // c2i.m
    public final r x0() {
        f fVar = this.f96871w0.f51551c.f53218h;
        m1i.e eVar = m1i.e.f;
        r map = fVar.map(new o0(7));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
