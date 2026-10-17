package com.revolut.feature.full_screen_prompt;

import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.kompot.navigable.ModalTransitionAnimation;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import czc.d0;
import d67.l;
import d67.n;
import d67.o;
import d67.u;
import d67.v;
import in0.g;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import no.m;
import vc.s;
import yp0.y;
import z4l.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/full_screen_prompt/PromptMarketingScreen;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Ld67/u;", "Lno/m;", "Lno/k;", "Lin0/g;", "Lwii/b;", "feature_full_screen_prompt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PromptMarketingScreen extends SimpleViewController<u> implements m, k, g, wii.b {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(PromptMarketingScreen.class, "binding", "getBinding()Lcom/revolut/feature/full_screen_prompt/databinding/ScreenFullScreenPromptBinding;", 0))};
    public final PromptMarketingScreenContract$InputData N;
    public final Boolean O;
    public final ModalTransitionAnimation.Style.POPUP P;
    public final AnalyticsProduct Q;
    public AnalyticsContext R;
    public final PromptMarketingContentDelegate S;
    public final j T;
    public final h U;
    public final Lazy V;

    public PromptMarketingScreen(PromptMarketingScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.N = inputData;
        this.O = inputData.e;
        this.P = ModalTransitionAnimation.Style.POPUP.f98391a;
        AnalyticsProduct analyticsProduct = inputData.f74502b;
        this.Q = analyticsProduct == null ? AnalyticsProduct.Shared.AppDefault.f : analyticsProduct;
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        Parcelable parcelable = inputData.f74501a.o;
        companion.getClass();
        this.R = new AnalyticsContext(AnalyticsContext.Companion.a(parcelable));
        PromptMarketingContentDelegate promptMarketingContentDelegate = new PromptMarketingContentDelegate();
        this.S = promptMarketingContentDelegate;
        this.T = new j(7, zhm.u.c(promptMarketingContentDelegate), false);
        this.U = s.t(this, d67.k.f);
        this.V = yhm.j.b(new d0(11));
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getW() {
        if (this.N.f74503c) {
            return Integer.valueOf(R$style.UiKitTheme_Mono);
        }
        return null;
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.R = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getL() {
        return this.Q;
    }

    @Override // wii.b
    /* JADX INFO: renamed from: P0, reason: from getter */
    public final Boolean getO() {
        return this.O;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getU() {
        return this.R;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        PromptMarketingScreenContract$InputData promptMarketingScreenContract$InputData = this.N;
        pd.b.p(view, promptMarketingScreenContract$InputData.f74501a.f53083b);
        KProperty[] kPropertyArr = W;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.U;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((e67.a) value).f122937b.setBackgroundType(AnimatedBackgroundType.DEFAULT.f51471a);
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        AnimatedBackgroundView animatedBackgroundView = ((e67.a) value2).f122937b;
        Intrinsics.checkNotNullExpressionValue(animatedBackgroundView, "animatedBackgroundView");
        animatedBackgroundView.setVisibility(promptMarketingScreenContract$InputData.f74503c ? 0 : 8);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R$id.recyclerView);
        Intrinsics.h(recyclerView);
        j jVar = this.T;
        y.h(recyclerView, jVar, new LinearLayoutManager(recyclerView.getContext()));
        jVar.c(zhm.u.c(promptMarketingScreenContract$InputData.f74501a));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.S;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(promptMarketingContentDelegate.f53079c), null, new l(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(promptMarketingContentDelegate.d), null, new cvi.j(this, (Continuation) null, 19), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(promptMarketingContentDelegate.f.f121375b), null, new d67.m(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(promptMarketingContentDelegate.f53080g.f121375b), null, new n(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(promptMarketingContentDelegate.e), null, new o(this, null), 3);
    }

    @Override // wii.b
    public final ModalTransitionAnimation.Style d2() {
        return this.P;
    }

    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final v R2() {
        return (v) this.V.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId */
    public final int getK() {
        return R$layout.screen_full_screen_prompt;
    }

    @Override // in0.g
    public final boolean p0() {
        return this.N.d;
    }
}
