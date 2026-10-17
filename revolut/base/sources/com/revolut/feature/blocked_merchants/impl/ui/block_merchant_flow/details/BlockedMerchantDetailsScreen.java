package com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import aw0.o9;
import bnf.o;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.blocked_merchants.impl.R$id;
import com.revolut.feature.blocked_merchants.impl.R$layout;
import com.revolut.feature.blocked_merchants.impl.R$string;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.details.BlockedMerchantDetailsScreen;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import dcf.v0;
import ds2.b;
import ds2.d;
import ds2.g;
import ds2.h;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import sr2.c;
import te0.w;
import tr2.k;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/details/BlockedMerchantDetailsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lds2/h;", "Lcom/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/details/BlockedMerchantDetailsScreenContract$InputData;", "Laii/q;", "feature_blocked_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BlockedMerchantDetailsScreen extends BaseRecyclerViewScreen<h, BlockedMerchantDetailsScreenContract$InputData, q> {
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(BlockedMerchantDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/blocked_merchants/impl/databinding/ScreenBlockedMerchantDetailsBinding;", 0))};
    public final ao.h U;
    public final int V;
    public final int W;
    public final Object X;
    public final Object Y;
    public final RowDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final PlainTextWarningDelegate f64245a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f64246b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final List f64247d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f64248e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockedMerchantDetailsScreen(BlockedMerchantDetailsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = s.t(this, b.f);
        this.V = R$layout.screen_blocked_merchant_details;
        this.W = R$id.blockedMerchantDetailsScreen_recyclerView;
        this.X = w.y0(new dgg.b(this, inputData, 14));
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: ds2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BlockedMerchantDetailsScreen f117176b;

            {
                this.f117176b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BlockedMerchantDetailsScreen blockedMerchantDetailsScreen = this.f117176b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BlockedMerchantDetailsScreen.f0;
                        return (g) ((tr2.k) blockedMerchantDetailsScreen.X.getValue()).k.get();
                    default:
                        KProperty[] kPropertyArr2 = BlockedMerchantDetailsScreen.f0;
                        return (j60.a) ((tr2.k) blockedMerchantDetailsScreen.X.getValue()).f.get();
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Z = rowDelegate;
        PlainTextWarningDelegate plainTextWarningDelegate = new PlainTextWarningDelegate();
        this.f64245a0 = plainTextWarningDelegate;
        this.f64246b0 = w.y0(new dmj.b(20));
        Lazy lazyY0 = w.y0(new dmj.b(21));
        this.c0 = lazyY0;
        final int i2 = 1;
        this.f64247d0 = v.k(plainTextWarningDelegate, new ListSubheaderDelegate(), rowDelegate, new RowLoadingDelegate(), (LargeActionButtonDelegate) lazyY0.getValue());
        this.f64248e0 = w.y0(new Function0(this) { // from class: ds2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BlockedMerchantDetailsScreen f117176b;

            {
                this.f117176b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BlockedMerchantDetailsScreen blockedMerchantDetailsScreen = this.f117176b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BlockedMerchantDetailsScreen.f0;
                        return (g) ((tr2.k) blockedMerchantDetailsScreen.X.getValue()).k.get();
                    default:
                        KProperty[] kPropertyArr2 = BlockedMerchantDetailsScreen.f0;
                        return (j60.a) ((tr2.k) blockedMerchantDetailsScreen.X.getValue()).f.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (k) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.U.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        a.g2(this, e.b(((c) value).f265115b.f59410q), null, new v0(this, null, 14), 3);
        a.g2(this, e.b(this.f64245a0.d.f121375b), null, new ds2.c(this, continuation, 0), 3);
        a.g2(this, e.b(this.Z.f53218h), null, new d(this, null), 3);
        ?? r62 = this.f64246b0;
        a.g2(this, e.b(((TwinHorizontalButtonDelegate) r62.getValue()).f53572c.f121375b), null, new ds2.c(this, continuation, 1), 3);
        a.g2(this, e.b(((TwinHorizontalButtonDelegate) r62.getValue()).d.f121375b), null, new ds2.c(this, continuation, 2), 3);
        a.g2(this, e.b(((LargeActionButtonDelegate) this.c0.getValue()).d.f121375b), null, new ds2.e(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.U.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((c) value).f265115b;
        BlockedMerchantDetailsScreenContract$InputData blockedMerchantDetailsScreenContract$InputData = (BlockedMerchantDetailsScreenContract$InputData) this.G;
        String str = blockedMerchantDetailsScreenContract$InputData.f64250b.f188645c;
        if (str == null) {
            str = "";
        }
        navBarWithToolbar.setTitle(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null);
        String str2 = blockedMerchantDetailsScreenContract$InputData.f64250b.f188645c;
        navBarWithToolbar.setToolbarTitle(new TextClause(str2 == null ? "" : str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.merchants_block_details_subtitle, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        thf.d dVarD = ((k) this.X.getValue()).f273648c.i.d();
        s.j(dVarD);
        kr2.e eVar = blockedMerchantDetailsScreenContract$InputData.f64250b;
        navBarWithToolbar.setEndIconImage(((o) dVarD).q(eVar.d, eVar.f));
        ((j60.a) this.f64248e0.getValue()).d(v.k((TwinHorizontalButtonDelegate) this.f64246b0.getValue(), this.Z, (LargeActionButtonDelegate) this.c0.getValue(), new RowLoadingDelegate()));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF64247d0() {
        return this.f64247d0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.W;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final g T2() {
        return (g) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.V;
    }
}
