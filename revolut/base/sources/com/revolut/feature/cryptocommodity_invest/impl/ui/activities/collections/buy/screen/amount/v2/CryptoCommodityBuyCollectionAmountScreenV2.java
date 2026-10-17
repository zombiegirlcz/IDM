package com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.amount.v2;

import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.n6;
import buf.u;
import bx5.b;
import com.google.android.gms.internal.mlkit_vision_face.a;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cryptocommodity_invest.api.R$string;
import com.revolut.feature.cryptocommodity_invest.impl.R$id;
import com.revolut.feature.cryptocommodity_invest.impl.R$layout;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.amount.CryptoCommodityBuyCollectionAmountScreenContract$InputData;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.amount.v2.CryptoCommodityBuyCollectionAmountScreenV2;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import grl.k9;
import java.util.List;
import jki.o;
import jw5.c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import ukm.f;
import vc.s;
import vkm.q;
import vkm.z1;
import yhm.j;
import yhm.k;
import zhm.v;
import zw5.d;
import zw5.e;
import zw5.g;
import zw5.n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/impl/ui/activities/collections/buy/screen/amount/v2/CryptoCommodityBuyCollectionAmountScreenV2;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lzw5/g;", "Lcom/revolut/feature/cryptocommodity_invest/impl/ui/activities/collections/buy/screen/amount/CryptoCommodityBuyCollectionAmountScreenContract$InputData;", "Lzw5/d;", "Lno/m;", "feature_cryptocommodity_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoCommodityBuyCollectionAmountScreenV2 extends BaseRecyclerViewScreen<g, CryptoCommodityBuyCollectionAmountScreenContract$InputData, d> implements m {
    public static final /* synthetic */ KProperty[] g0 = {o0.f186429a.j(new h0(CryptoCommodityBuyCollectionAmountScreenV2.class, "binding", "getBinding()Lcom/revolut/feature/cryptocommodity_invest/impl/databinding/ScreenCryptoCommodityBuyCollectionAmountV2Binding;", 0))};
    public final AnalyticsProduct.Retail U;
    public final int V;
    public final int W;
    public final h X;
    public final boolean Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f71541a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f71542b0;
    public final z1 c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Lazy f71543d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final CellDetailsActionDelegate f71544e0;
    public final List f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoCommodityBuyCollectionAmountScreenV2(CryptoCommodityBuyCollectionAmountScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        k9 k9Var = k9.Crypto;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.U = a.h(k9Var, "value", k9Var);
        this.V = R$layout.screen_crypto_commodity_buy_collection_amount_v2;
        this.W = R$id.amountScreen_recyclerView;
        this.X = s.t(this, b.f);
        final int i = 1;
        this.Y = true;
        this.Z = w.y0(new u(this, inputData, 10));
        final int i2 = 0;
        this.f71541a0 = w.y0(new Function0(this) { // from class: bx5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoCommodityBuyCollectionAmountScreenV2 f19489b;

            {
                this.f19489b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                CryptoCommodityBuyCollectionAmountScreenV2 cryptoCommodityBuyCollectionAmountScreenV2 = this.f19489b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoCommodityBuyCollectionAmountScreenV2.g0;
                        return (zw5.e) ((mw5.h) cryptoCommodityBuyCollectionAmountScreenV2.Z.getValue()).f209361l.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoCommodityBuyCollectionAmountScreenV2.g0;
                        qd0.b bVarN = ((mw5.h) cryptoCommodityBuyCollectionAmountScreenV2.Z.getValue()).f209356b.f209379l.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr3 = CryptoCommodityBuyCollectionAmountScreenV2.g0;
                        return new CenteredAmountDelegate(new bwd.a(cryptoCommodityBuyCollectionAmountScreenV2, 2));
                }
            }
        });
        this.f71542b0 = j.c(k.NONE, new Function0(this) { // from class: bx5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoCommodityBuyCollectionAmountScreenV2 f19489b;

            {
                this.f19489b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                CryptoCommodityBuyCollectionAmountScreenV2 cryptoCommodityBuyCollectionAmountScreenV2 = this.f19489b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoCommodityBuyCollectionAmountScreenV2.g0;
                        return (zw5.e) ((mw5.h) cryptoCommodityBuyCollectionAmountScreenV2.Z.getValue()).f209361l.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoCommodityBuyCollectionAmountScreenV2.g0;
                        qd0.b bVarN = ((mw5.h) cryptoCommodityBuyCollectionAmountScreenV2.Z.getValue()).f209356b.f209379l.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr3 = CryptoCommodityBuyCollectionAmountScreenV2.g0;
                        return new CenteredAmountDelegate(new bwd.a(cryptoCommodityBuyCollectionAmountScreenV2, 2));
                }
            }
        });
        this.c0 = q.b(1, 1, f.DROP_OLDEST);
        final int i3 = 2;
        Lazy lazyB = j.b(new Function0(this) { // from class: bx5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoCommodityBuyCollectionAmountScreenV2 f19489b;

            {
                this.f19489b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                CryptoCommodityBuyCollectionAmountScreenV2 cryptoCommodityBuyCollectionAmountScreenV2 = this.f19489b;
                switch (i32) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoCommodityBuyCollectionAmountScreenV2.g0;
                        return (zw5.e) ((mw5.h) cryptoCommodityBuyCollectionAmountScreenV2.Z.getValue()).f209361l.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoCommodityBuyCollectionAmountScreenV2.g0;
                        qd0.b bVarN = ((mw5.h) cryptoCommodityBuyCollectionAmountScreenV2.Z.getValue()).f209356b.f209379l.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr3 = CryptoCommodityBuyCollectionAmountScreenV2.g0;
                        return new CenteredAmountDelegate(new bwd.a(cryptoCommodityBuyCollectionAmountScreenV2, 2));
                }
            }
        });
        this.f71543d0 = lazyB;
        CellDetailsDelegate cellDetailsDelegate = new CellDetailsDelegate();
        CellDetailsActionDelegate cellDetailsActionDelegate = new CellDetailsActionDelegate();
        this.f71544e0 = cellDetailsActionDelegate;
        this.f0 = v.k(new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), cellDetailsDelegate, (CenteredAmountDelegate) lazyB.getValue(), cellDetailsActionDelegate);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getW() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (mw5.h) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void U2(int i, int i2, Intent intent) {
        String stringExtra;
        if (i2 != -1 || i != 4 || intent == null || (stringExtra = intent.getStringExtra("argCurrency")) == null) {
            return;
        }
        String stringExtra2 = intent.getStringExtra("argPocketId");
        String stringExtra3 = intent.getStringExtra("ARGS_POCKET_TYPE");
        k1j.a aVarValueOf = stringExtra3 != null ? k1j.a.valueOf(stringExtra3) : null;
        e eVarT2 = T2();
        xi0.b.Companion.getClass();
        xi0.b currency = xi0.a.a(stringExtra);
        n nVar = (n) eVarT2;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        nVar.n2(new xkl.e(stringExtra2, currency, nVar, aVarValueOf, (Continuation) null), new whi.b(6));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f178933c.f59338a), null, new bx5.d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f178932b.f), null, new bx5.d(this, continuation, 1), 3);
        Lazy lazy = this.f71543d0;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CenteredAmountDelegate) lazy.getValue()).e.f121375b), null, new bx5.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, this.c0, null, new btd.e(this, continuation, 14), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CenteredAmountDelegate) lazy.getValue()).f.f121375b), null, new bx5.f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f71544e0.d), null, new bx5.g(2, 4, e.class, T2(), "onCellActionClick", "onCellActionClick(Lcom/revolut/core/ui_kit/delegates/CellDetailsActionDelegate$Model;)V"), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f178933c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        m70.a.c(t0.f186434a);
        this.c0.k("");
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF0() {
        return this.f0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(g uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        h3().f178933c.setToolbarTitle(new TextLocalisedClause(R$string.cryptocommodity_invest_collections_amount_screen_header_title, zhm.u.c(uiState.f325733a), null, 12));
        h3().f178933c.setAvatarImage(uiState.f325734b);
        h3().f178932b.setModel(new aw0.e(true, null, null, new n6(new TextLocalisedClause(R$string.cryptocommodity_invest_collections_amount_screen_button_continue, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, uiState.f325735c && !uiState.d, null, null, 988), null, null, 54));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.V;
    }

    public final c h3() {
        ViewBinding value = this.X.getValue(this, g0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final e T2() {
        return (e) this.f71541a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.Y);
    }
}
