package com.revolut.feature.learn.shared.impl.ui.lesson;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.SwipeableCardCoverItemDelegate;
import com.revolut.core.ui_kit.delegates.SwipeableCardFullSizeContentItemDelegate;
import com.revolut.core.ui_kit.delegates.SwipeableCardInnerRecyclerItemDelegate;
import com.revolut.core.ui_kit.delegates.SwipeableCardLoadingItemDelegate;
import com.revolut.core.ui_kit.delegates.SwipeableCardVideoItemDelegate;
import com.revolut.core.ui_kit.delegates.SwipeableCardsHeaderDelegate;
import com.revolut.feature.learn.shared.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseScreen;
import dz8.f;
import efm.r;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import myj.g;
import no.m;
import pqc.k;
import pt4.d;
import pyc.a;
import q09.c;
import q09.d0;
import q09.g0;
import q09.i;
import q09.m0;
import rd0.e;
import sji.b;
import te0.w;
import vc.s;
import vkm.q0;
import z4l.j;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/learn/shared/impl/ui/lesson/LessonScreen;", "Lcom/revolut/kompot/navigable/screen/BaseScreen;", "Lq09/g0;", "Lcom/revolut/feature/learn/shared/impl/ui/lesson/LessonScreenContract$InputData;", "Laii/q;", "Lno/m;", "feature_learn_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LessonScreen extends BaseScreen<g0, LessonScreenContract$InputData, q> implements m {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(LessonScreen.class, "binding", "getBinding()Lcom/revolut/feature/learn/shared/impl/databinding/ScreenLearnLessonBinding;", 0))};
    public final int M;
    public final int N;
    public final h O;
    public final InputChecklistDelegate P;
    public final PlainTextDelegate Q;
    public final SingleChoiceDelegate R;
    public final LargeActionButtonDelegate S;
    public final FullScreenStateDelegate T;
    public final SwipeableCardVideoItemDelegate U;
    public final SwipeableCardCoverItemDelegate V;
    public final SwipeableCardLoadingItemDelegate W;
    public final SwipeableCardFullSizeContentItemDelegate X;
    public final SwipeableCardInnerRecyclerItemDelegate Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f78014a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final j f78015b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonScreen(LessonScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.M = R$layout.screen_learn_lesson;
        this.N = R$style.ShowcaseSystemBarsMarkerTheme;
        this.O = s.t(this, q09.j.f);
        InputChecklistDelegate inputChecklistDelegate = new InputChecklistDelegate();
        this.P = inputChecklistDelegate;
        PlainTextDelegate plainTextDelegate = new PlainTextDelegate();
        this.Q = plainTextDelegate;
        this.R = new SingleChoiceDelegate();
        this.S = new LargeActionButtonDelegate();
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.T = fullScreenStateDelegate;
        SwipeableCardVideoItemDelegate swipeableCardVideoItemDelegate = new SwipeableCardVideoItemDelegate();
        this.U = swipeableCardVideoItemDelegate;
        SwipeableCardCoverItemDelegate swipeableCardCoverItemDelegate = new SwipeableCardCoverItemDelegate();
        this.V = swipeableCardCoverItemDelegate;
        SwipeableCardLoadingItemDelegate swipeableCardLoadingItemDelegate = new SwipeableCardLoadingItemDelegate();
        this.W = swipeableCardLoadingItemDelegate;
        SwipeableCardFullSizeContentItemDelegate swipeableCardFullSizeContentItemDelegate = new SwipeableCardFullSizeContentItemDelegate();
        this.X = swipeableCardFullSizeContentItemDelegate;
        SwipeableCardInnerRecyclerItemDelegate swipeableCardInnerRecyclerItemDelegate = new SwipeableCardInnerRecyclerItemDelegate(v.k(new SwipeableCardsHeaderDelegate(), inputChecklistDelegate, fullScreenStateDelegate, plainTextDelegate));
        this.Y = swipeableCardInnerRecyclerItemDelegate;
        this.Z = w.y0(new d(this, inputData, 12));
        this.f78014a0 = w.y0(new a(this, 5));
        this.f78015b0 = new j(7, v.k(swipeableCardLoadingItemDelegate, swipeableCardCoverItemDelegate, swipeableCardVideoItemDelegate, swipeableCardInnerRecyclerItemDelegate, swipeableCardFullSizeContentItemDelegate), false);
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getN() {
        return Integer.valueOf(this.N);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(jki.m mVar, o oVar) {
        g0 uiState = (g0) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        this.f78015b0.c(uiState.f241185a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getK() {
        f fVar = (f) ((f09.f) this.Z.getValue()).f131062b.f131058a.f220914j.get();
        s.j(fVar);
        return ((g) fVar).d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (f09.f) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ihm.f fVar = this.P.f52518c;
        q09.f fVar2 = q09.f.f;
        int i = 1;
        int i2 = 2;
        r rVarDoOnNext = fVar.map(new o0.a(27)).doOnNext(new c(i2, new q09.b(this, 1)));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        Continuation continuation = null;
        int i3 = 3;
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarDoOnNext), null, new pp4.h(2, T2(), d0.class, "onEvent", "onEvent(Lcom/revolut/feature/learn/shared/impl/ui/lesson/LessonScreenContract$Event;)V", 4, 14), 3);
        j60.a aVar = (j60.a) ((f09.f) this.Z.getValue()).e.get();
        int i5 = 0;
        SingleChoiceDelegate singleChoiceDelegate = this.R;
        LargeActionButtonDelegate largeActionButtonDelegate = this.S;
        aVar.d(v.k(singleChoiceDelegate, largeActionButtonDelegate));
        ihm.f fVarP = singleChoiceDelegate.p();
        q09.d dVar = q09.d.f;
        int i6 = 28;
        r map = fVarP.map(new o0.a(28));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(map), null, new pp4.h(2, T2(), d0.class, "onEvent", "onEvent(Lcom/revolut/feature/learn/shared/impl/ui/lesson/LessonScreenContract$Event;)V", 4, 12), 3);
        ihm.f fVar3 = largeActionButtonDelegate.d.f121375b;
        q09.e eVar = q09.e.f;
        r map2 = fVar3.map(new o0.a(29));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        int i21 = 4;
        int i22 = 2;
        com.revolut.kompot.navigable.a.g2(this, e.b(map2), null, new pp4.h(i22, T2(), d0.class, "onEvent", "onEvent(Lcom/revolut/feature/learn/shared/impl/ui/lesson/LessonScreenContract$Event;)V", i21, 13), 3);
        r map3 = Z2().f110334b.f0().map(new pz4.a(27, new q09.a(i3)));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(map3), null, new pp4.h(i22, T2(), d0.class, "onEvent", "onEvent(Lcom/revolut/feature/learn/shared/impl/ui/lesson/LessonScreenContract$Event;)V", i21, 9), 3);
        SwipeableCardVideoItemDelegate swipeableCardVideoItemDelegate = this.U;
        r map4 = swipeableCardVideoItemDelegate.f53514c.f121375b.map(new pz4.a(i6, new q09.a(4)));
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        int i32 = 4;
        int i33 = 2;
        com.revolut.kompot.navigable.a.g2(this, e.b(map4), null, new pp4.h(i33, T2(), d0.class, "onEvent", "onEvent(Lcom/revolut/feature/learn/shared/impl/ui/lesson/LessonScreenContract$Event;)V", i32, 16), 3);
        r map5 = swipeableCardVideoItemDelegate.d.f121375b.map(new pz4.a(29, new q09.b(this, 0)));
        Intrinsics.checkNotNullExpressionValue(map5, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(map5), null, new pp4.h(i33, T2(), d0.class, "onEvent", "onEvent(Lcom/revolut/feature/learn/shared/impl/ui/lesson/LessonScreenContract$Event;)V", i32, 17), 3);
        ihm.f fVarG0 = Z2().f110334b.g0();
        i iVar = i.f;
        r map6 = fVarG0.map(new o0.a(26));
        Intrinsics.checkNotNullExpressionValue(map6, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(map6), null, new pp4.h(i33, T2(), d0.class, "onEvent", "onEvent(Lcom/revolut/feature/learn/shared/impl/ui/lesson/LessonScreenContract$Event;)V", i32, 18), 3);
        com.revolut.kompot.navigable.a.g2(this, ((m0) T2()).z, null, new q09.h(this, null, 1), 3);
        r map7 = this.Y.e.f121375b.map(new c(i, new q09.a(5)));
        Intrinsics.checkNotNullExpressionValue(map7, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(map7), null, new pp4.h(i33, T2(), d0.class, "onEvent", "onEvent(Lcom/revolut/feature/learn/shared/impl/ui/lesson/LessonScreenContract$Event;)V", i32, 19), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(swipeableCardVideoItemDelegate.e.f121375b), null, new q09.h(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, new an9.g(vkm.q.J(e.b(this.V.d), e.b(swipeableCardVideoItemDelegate.f), e.b(this.W.d), e.b(this.X.f53511c)), 22), null, new pp4.h(2, T2(), d0.class, "onEvent", "onEvent(Lcom/revolut/feature/learn/shared/impl/ui/lesson/LessonScreenContract$Event;)V", 4, 15), 3);
        PlainTextDelegate plainTextDelegate = this.Q;
        r rVarMerge = r.merge(w.a0(plainTextDelegate.f.f121375b, new q09.a(6)).map(new c(i3, new q09.a(7))), w.a0(plainTextDelegate.d.f121375b, new q09.a(i)).map(new pz4.a(26, new q09.a(i2))));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        int i43 = 4;
        int i59 = 2;
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarMerge), null, new pp4.h(i59, T2(), d0.class, "onEvent", "onEvent(Lcom/revolut/feature/learn/shared/impl/ui/lesson/LessonScreenContract$Event;)V", i43, 10), 3);
        r map8 = this.T.f52371h.f121375b.map(new c(i5, new q09.a(i5)));
        Intrinsics.checkNotNullExpressionValue(map8, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(map8), null, new pp4.h(i59, T2(), d0.class, "onEvent", "onEvent(Lcom/revolut/feature/learn/shared/impl/ui/lesson/LessonScreenContract$Event;)V", i43, 11), 3);
        m0 m0Var = (m0) T2();
        com.revolut.kompot.navigable.a.g2(this, new q0(m0Var.f241202w.f258920q, new pnb.b(m0Var, continuation, 23), 1), null, new k(this, continuation, i6), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Z2().f110334b.setAdapter(this.f78015b0);
    }

    public final d09.c Z2() {
        ViewBinding value = this.O.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d09.c) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: a3, reason: merged with bridge method [inline-methods] */
    public final d0 T2() {
        return (d0) this.f78014a0.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }
}
