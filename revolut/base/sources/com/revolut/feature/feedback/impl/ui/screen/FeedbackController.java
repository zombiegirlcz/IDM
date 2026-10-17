package com.revolut.feature.feedback.impl.ui.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.ActionsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CenteredContentTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.DialogHeaderDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RateEmojiDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.feature.feedback.impl.R$id;
import com.revolut.feature.feedback.impl.R$layout;
import com.revolut.feature.feedback.impl.ui.screen.FeedbackContract$InputData;
import com.revolut.feature.feedback.impl.ui.screen.FeedbackController;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import gp6.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pp6.c;
import pp6.e;
import pp6.f;
import pp6.g;
import pp6.i;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/feedback/impl/ui/screen/FeedbackController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Ldli/a;", "Lpp6/c;", "feature_feedback_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FeedbackController extends ViewController<Object> implements a {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(FeedbackController.class, "binding", "getBinding()Lcom/revolut/feature/feedback/impl/databinding/ScreenStandaloneFeedbackBinding;", 0))};
    public final FeedbackContract$InputData K;
    public final int L;
    public final h M;
    public final boolean N;
    public final boolean O;
    public final Object P;
    public final RateEmojiDelegate Q;
    public final ActionsDelegate R;
    public final InputTextDelegate S;
    public final LargeActionButtonDelegate T;
    public final SmallActionButtonDelegate U;
    public final Object V;
    public final Object W;

    public FeedbackController(FeedbackContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_standalone_feedback;
        this.M = s.t(this, e.f);
        this.N = true;
        this.O = true;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: pp6.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FeedbackController f238284b;

            {
                this.f238284b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FeedbackController feedbackController = this.f238284b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FeedbackController.X;
                        phm.a aVar = (phm.a) ue0.e.j(feedbackController.m2()).a().get(gp6.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gp6.e.class, " is not found"));
                        }
                        gp6.e eVar = ((gp6.e) aVar2.b()).d;
                        FeedbackContract$InputData feedbackContract$InputData = feedbackController.K;
                        feedbackContract$InputData.getClass();
                        return new gp6.d(eVar, feedbackContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FeedbackController.X;
                        gp6.d dVar = (gp6.d) feedbackController.P.getValue();
                        l lVar = new l();
                        FeedbackContract$InputData feedbackContract$InputData2 = dVar.f145268a;
                        gp6.e eVar2 = dVar.f145269b;
                        dp6.a aVarB = eVar2.f145270a.b();
                        s.j(aVarB);
                        return new k(lVar, feedbackContract$InputData2, aVarB, eVar2.f145271b.c(), eVar2.f145272c.b());
                    default:
                        KProperty[] kPropertyArr3 = FeedbackController.X;
                        FeedbackController feedbackController2 = this.f238284b;
                        return dli.f.a(feedbackController2, feedbackController2.d(), v.k(feedbackController2.Q, feedbackController2.R, feedbackController2.S, feedbackController2.T, feedbackController2.U, new ActionsLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new HeaderLoadingDelegate(), new LargeActionButtonLoadingDelegate(), new CenteredContentTileLoadingDelegate(), new DialogHeaderDelegate()), R$id.screenFeedback_recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = new RateEmojiDelegate();
        this.R = new ActionsDelegate();
        this.S = new InputTextDelegate(null);
        this.T = new LargeActionButtonDelegate();
        this.U = new SmallActionButtonDelegate();
        final int i2 = 1;
        this.V = w.y0(new Function0(this) { // from class: pp6.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FeedbackController f238284b;

            {
                this.f238284b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FeedbackController feedbackController = this.f238284b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FeedbackController.X;
                        phm.a aVar = (phm.a) ue0.e.j(feedbackController.m2()).a().get(gp6.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gp6.e.class, " is not found"));
                        }
                        gp6.e eVar = ((gp6.e) aVar2.b()).d;
                        FeedbackContract$InputData feedbackContract$InputData = feedbackController.K;
                        feedbackContract$InputData.getClass();
                        return new gp6.d(eVar, feedbackContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FeedbackController.X;
                        gp6.d dVar = (gp6.d) feedbackController.P.getValue();
                        l lVar = new l();
                        FeedbackContract$InputData feedbackContract$InputData2 = dVar.f145268a;
                        gp6.e eVar2 = dVar.f145269b;
                        dp6.a aVarB = eVar2.f145270a.b();
                        s.j(aVarB);
                        return new k(lVar, feedbackContract$InputData2, aVarB, eVar2.f145271b.c(), eVar2.f145272c.b());
                    default:
                        KProperty[] kPropertyArr3 = FeedbackController.X;
                        FeedbackController feedbackController2 = this.f238284b;
                        return dli.f.a(feedbackController2, feedbackController2.d(), v.k(feedbackController2.Q, feedbackController2.R, feedbackController2.S, feedbackController2.T, feedbackController2.U, new ActionsLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new HeaderLoadingDelegate(), new LargeActionButtonLoadingDelegate(), new CenteredContentTileLoadingDelegate(), new DialogHeaderDelegate()), R$id.screenFeedback_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.W = w.y0(new Function0(this) { // from class: pp6.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FeedbackController f238284b;

            {
                this.f238284b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FeedbackController feedbackController = this.f238284b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FeedbackController.X;
                        phm.a aVar = (phm.a) ue0.e.j(feedbackController.m2()).a().get(gp6.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gp6.e.class, " is not found"));
                        }
                        gp6.e eVar = ((gp6.e) aVar2.b()).d;
                        FeedbackContract$InputData feedbackContract$InputData = feedbackController.K;
                        feedbackContract$InputData.getClass();
                        return new gp6.d(eVar, feedbackContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = FeedbackController.X;
                        gp6.d dVar = (gp6.d) feedbackController.P.getValue();
                        l lVar = new l();
                        FeedbackContract$InputData feedbackContract$InputData2 = dVar.f145268a;
                        gp6.e eVar2 = dVar.f145269b;
                        dp6.a aVarB = eVar2.f145270a.b();
                        s.j(aVarB);
                        return new k(lVar, feedbackContract$InputData2, aVarB, eVar2.f145271b.c(), eVar2.f145272c.b());
                    default:
                        KProperty[] kPropertyArr3 = FeedbackController.X;
                        FeedbackController feedbackController2 = this.f238284b;
                        return dli.f.a(feedbackController2, feedbackController2.d(), v.k(feedbackController2.Q, feedbackController2.R, feedbackController2.S, feedbackController2.T, feedbackController2.U, new ActionsLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new HeaderLoadingDelegate(), new LargeActionButtonLoadingDelegate(), new CenteredContentTileLoadingDelegate(), new DialogHeaderDelegate()), R$id.screenFeedback_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        c uiState = (c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.M.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((fp6.a) value).f137062b.setHeaderModel(uiState.f238282b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (d) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: V2, reason: from getter */
    public final boolean getO() {
        return this.O;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(this.Q.f53143c), new f(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.R.f51611c.f121375b), new f(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.S.e.f121375b), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.T.d.f121375b), new pp6.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.U.f53336c.f121375b), new i(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final pp6.a d() {
        return (pp6.a) this.V.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.W.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
