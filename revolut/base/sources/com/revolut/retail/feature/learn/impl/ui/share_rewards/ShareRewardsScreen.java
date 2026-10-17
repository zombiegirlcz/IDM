package com.revolut.retail.feature.learn.impl.ui.share_rewards;

import aii.q;
import android.view.View;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.feature.learn.impl.R$id;
import com.revolut.retail.feature.learn.impl.R$layout;
import frl.a;
import grl.k9;
import java.util.List;
import jki.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import sji.b;
import te0.w;
import uyj.c;
import uyj.e;
import uyj.i;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/learn/impl/ui/share_rewards/ShareRewardsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Luyj/e;", "Lcom/revolut/retail/feature/learn/impl/ui/share_rewards/ShareRewardsScreenContract$InputData;", "Laii/q;", "Lno/m;", "feature_learn_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShareRewardsScreen extends BaseRecyclerViewScreen<e, ShareRewardsScreenContract$InputData, q> implements m {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f101771b0 = {o0.f186429a.j(new h0(ShareRewardsScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/learn/impl/databinding/ScreenShareRewardsBinding;", 0))};
    public final AnalyticsProduct.Retail U;
    public final PromptContentDelegate V;
    public final int W;
    public final int X;
    public final List Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f101772a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareRewardsScreen(ShareRewardsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = a.f137503p;
        this.U = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        s.t(this, uyj.a.f);
        PromptContentDelegate promptContentDelegate = new PromptContentDelegate();
        this.V = promptContentDelegate;
        this.W = R$layout.screen_share_rewards;
        this.X = R$id.shareRewards_recyclerView;
        this.Y = u.c(promptContentDelegate);
        this.Z = w.y0(new uj7.a(this, inputData, 27));
        this.f101772a0 = w.y0(new ur2.a(this, 7));
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getQ() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (nyj.e) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final h T2() {
        return (i) this.f101772a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        PromptContentDelegate promptContentDelegate = this.V;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(promptContentDelegate.f53054h.f121375b), null, new uyj.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(promptContentDelegate.q()), null, new c(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getY() {
        return this.Y;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getX() {
        return this.X;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.FALSE;
    }
}
