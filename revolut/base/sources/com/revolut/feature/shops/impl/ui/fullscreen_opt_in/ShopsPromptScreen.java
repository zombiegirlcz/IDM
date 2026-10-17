package com.revolut.feature.shops.impl.ui.fullscreen_opt_in;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.shops.impl.R$id;
import com.revolut.feature.shops.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import did.o;
import e58.d;
import e58.e;
import ejd.a;
import ejd.c;
import ejd.f;
import ejd.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import whd.b;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shops/impl/ui/fullscreen_opt_in/ShopsPromptScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lejd/g;", "Lcom/revolut/feature/shops/impl/ui/fullscreen_opt_in/ShopsPromptScreenContract$InputData;", "", "Lwhd/b;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShopsPromptScreen extends BaseRecyclerViewScreen<g, ShopsPromptScreenContract$InputData, Object> implements b {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(ShopsPromptScreen.class, "binding", "getBinding()Lcom/revolut/feature/shops/impl/databinding/ScreenShopsPromptBinding;", 0))};
    public final int U;
    public final int V;
    public final Integer W;
    public final Object X;
    public final h Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final PromptMarketingContentDelegate f87175a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f87176b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopsPromptScreen(ShopsPromptScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_shops_prompt;
        this.V = R$id.shopsPrompt_recyclerView;
        this.W = Integer.valueOf(R$style.UiKitTheme_Mono);
        this.X = w.y0(new d(this, inputData, 21));
        this.Y = s.t(this, a.f);
        this.Z = w.y0(new e(this, 13));
        PromptMarketingContentDelegate promptMarketingContentDelegate = new PromptMarketingContentDelegate();
        this.f87175a0 = promptMarketingContentDelegate;
        this.f87176b0 = u.c(promptMarketingContentDelegate);
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2, reason: from getter */
    public final Integer getW() {
        return this.W;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getQ() {
        return new AnalyticsProduct.Retail(super.f0());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (o) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (f) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.f87175a0;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(promptMarketingContentDelegate.f53079c), null, new ejd.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(promptMarketingContentDelegate.d), null, new ea4.d(this, null, 21), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(promptMarketingContentDelegate.f.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(promptMarketingContentDelegate.f53080g.f121375b), null, new ejd.d(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.Y.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((xhd.c) value).f305865b.setBackgroundType(AnimatedBackgroundType.DEFAULT.f51471a);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF87176b0() {
        return this.f87176b0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.U;
    }
}
