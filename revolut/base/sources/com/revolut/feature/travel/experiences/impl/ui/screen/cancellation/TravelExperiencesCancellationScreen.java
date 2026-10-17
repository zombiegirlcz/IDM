package com.revolut.feature.travel.experiences.impl.ui.screen.cancellation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.impl.R$id;
import com.revolut.feature.travel.experiences.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import grl.k9;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import rt4.o;
import rtl.y;
import rwg.e0;
import s1g.f;
import s1g.i;
import te0.w;
import vc.s;
import z0g.z;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/cancellation/TravelExperiencesCancellationScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ls1g/i;", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/cancellation/TravelExperiencesCancellationScreenContract$InputData;", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/cancellation/TravelExperiencesCancellationScreenContract$OutputData;", "Lno/m;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelExperiencesCancellationScreen extends BaseRecyclerViewScreen<i, TravelExperiencesCancellationScreenContract$InputData, TravelExperiencesCancellationScreenContract$OutputData> implements m {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f93021h0 = {o0.f186429a.j(new h0(TravelExperiencesCancellationScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/experiences/impl/databinding/ScreenExperiencesCancellationBinding;", 0))};
    public final AnalyticsProduct.Retail U;
    public final int V;
    public final int W;
    public final boolean X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f93022a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f93023b0;
    public final LargeActionButtonDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final List f93024d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f93025e0;
    public final Object f0;
    public final h g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelExperiencesCancellationScreen(TravelExperiencesCancellationScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137510y;
        this.U = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.V = R$layout.screen_experiences_cancellation;
        this.W = R$id.experiencesCancellation_recyclerView;
        this.X = true;
        Lazy lazyY0 = w.y0(new e0(28));
        this.Y = lazyY0;
        Lazy lazyY02 = w.y0(new e0(29));
        this.Z = lazyY02;
        this.f93022a0 = w.y0(new s1g.a(0));
        this.f93023b0 = w.y0(new s1g.a(1));
        this.c0 = new LargeActionButtonDelegate();
        this.f93024d0 = v.k((RowDelegate) lazyY0.getValue(), (ProgressStepVerticalDelegate) lazyY02.getValue());
        this.f93025e0 = w.y0(new rxe.b(this, inputData, 12));
        this.f0 = w.y0(new y(this, 15));
        this.g0 = s.t(this, s1g.b.f);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (z) this.f93025e0.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f293696b.f59410q), null, new s1g.c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f293697c.o), null, new s1g.c(this, continuation, 1), 3);
        ?? r62 = this.f93023b0;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((TwinHorizontalButtonDelegate) r62.getValue()).f53572c.f121375b), null, new s1g.c(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((TwinHorizontalButtonDelegate) r62.getValue()).d.f121375b), null, new o(this, continuation, 20), 3);
        ?? r64 = this.f93022a0;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsDelegate) r64.getValue()).e), null, new s1g.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsDelegate) r64.getValue()).d), null, new s1g.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.c0.d.f121375b), null, new f(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        j60.a aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f293696b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        h3().f293696b.setToolbarTitle(new TextLocalisedClause(R$string.experiences_details_cancellation_policy, null, null, 14));
        NavBarWithToolbar experiencesCancellationNavBarWithToolbar = h3().f293696b;
        Intrinsics.checkNotNullExpressionValue(experiencesCancellationNavBarWithToolbar, "experiencesCancellationNavBarWithToolbar");
        experiencesCancellationNavBarWithToolbar.setTitle(new TextLocalisedClause(R$string.experiences_details_cancellation_policy, null, null, 14), null);
        LargeActionButton largeActionButton = h3().f293697c;
        largeActionButton.setVisibility(8);
        largeActionButton.o(LargeActionButton.ButtonStyle.f58725a);
        largeActionButton.setLoadingButtonTag("CANCELLATION_LOADING_BUTTON_TAG");
        z zVar = (z) this.f93025e0.getValue();
        switch (zVar.f318472a) {
            case 0:
                aVar = (j60.a) zVar.e.get();
                break;
            default:
                aVar = (j60.a) zVar.e.get();
                break;
        }
        aVar.d(v.k((CellDetailsDelegate) this.f93022a0.getValue(), (TwinHorizontalButtonDelegate) this.f93023b0.getValue(), this.c0));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getC0() {
        return this.f93024d0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(i uiState, jki.o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        Clause clause = uiState.f259138b;
        if (clause != null) {
            h3().f293696b.setDescriptionVisible(true);
            h3().f293696b.setDescriptionText(clause);
        } else {
            h3().f293696b.setDescriptionVisible(false);
        }
        if (!uiState.f259139c) {
            h3().f293697c.setVisibility(8);
        } else {
            h3().f293697c.setVisibility(0);
            h3().f293697c.setText(new TextLocalisedClause(R$string.experiences_common_cancel, null, null, 14));
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.V;
    }

    public final w0g.d h3() {
        ViewBinding value = this.g0.getValue(this, f93021h0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (w0g.d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final s1g.h T2() {
        return (s1g.h) this.f0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
