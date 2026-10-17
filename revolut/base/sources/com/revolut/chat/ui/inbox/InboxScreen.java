package com.revolut.chat.ui.inbox;

import a60.f;
import aii.q;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.o;
import com.revolut.chat.ui.inbox.InboxScreen;
import com.revolut.chat_core.R$id;
import com.revolut.chat_core.R$layout;
import com.revolut.chat_core.R$string;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ContainerDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LabelButtonDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepHorizontalLoadingV2Delegate;
import com.revolut.core.ui_kit.delegates.ProgressStepHorizontalV2Delegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalLoadingV2Delegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import e50.b;
import e50.d;
import e50.g;
import e50.i;
import e50.j;
import e50.k;
import e50.l;
import e50.m;
import e50.n;
import h30.e0;
import ix0.i2;
import ix0.j2;
import java.util.List;
import koi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import n30.x;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/chat/ui/inbox/InboxScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Le50/n;", "<init>", "()V", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InboxScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(InboxScreen.class, "binding", "getBinding()Lcom/revolut/chat_core/databinding/ScreenInboxBinding;", 0))};
    public RecyclerView.ItemAnimator K;
    public final ActionWidgetDelegate L;
    public final FullScreenStateDelegate M;
    public final RowDelegate N;
    public final CellDetailsDelegate O;
    public final LabelButtonDelegate P;
    public final ProgressStepHorizontalV2Delegate Q;
    public final ProgressStepVerticalV2Delegate R;
    public final SwipeToActionDelegate S;
    public final ContainerDelegate T;
    public final ScrollerDelegate U;
    public final int V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f51163a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ScreenContentRecyclerView f51164b0;
    public koi.h c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f51165d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public j2 f51166e0;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, f.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/chat_core/databinding/ScreenInboxBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.coordinatorLayout;
            ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) ViewBindings.findChildViewById(p0, i);
            if (controllerContainerCoordinatorLayout != null) {
                i = R$id.navBarWithToolbar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                if (navBarWithToolbar != null) {
                    i = R$id.recyclerView;
                    ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                    if (screenContentRecyclerView != null) {
                        ControllerContainerConstraintLayout controllerContainerConstraintLayout = (ControllerContainerConstraintLayout) p0;
                        return new f(controllerContainerConstraintLayout, controllerContainerCoordinatorLayout, navBarWithToolbar, screenContentRecyclerView, controllerContainerConstraintLayout);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public InboxScreen() {
        ActionWidgetDelegate actionWidgetDelegate = new ActionWidgetDelegate();
        this.L = actionWidgetDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.M = fullScreenStateDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.N = rowDelegate;
        CellDetailsDelegate cellDetailsDelegate = new CellDetailsDelegate();
        this.O = cellDetailsDelegate;
        LabelButtonDelegate labelButtonDelegate = new LabelButtonDelegate();
        this.P = labelButtonDelegate;
        ProgressStepHorizontalV2Delegate progressStepHorizontalV2Delegate = new ProgressStepHorizontalV2Delegate();
        this.Q = progressStepHorizontalV2Delegate;
        ProgressStepVerticalV2Delegate progressStepVerticalV2Delegate = new ProgressStepVerticalV2Delegate();
        this.R = progressStepVerticalV2Delegate;
        final int i = 0;
        this.S = new SwipeToActionDelegate(rowDelegate, false);
        final int i2 = 1;
        final int i3 = 2;
        final int i5 = 3;
        final int i6 = 4;
        ContainerDelegate containerDelegate = new ContainerDelegate(v.k(new RowLoadingDelegate(), new ProgressStepHorizontalLoadingV2Delegate(), new ProgressStepVerticalLoadingV2Delegate(), fullScreenStateDelegate, rowDelegate, labelButtonDelegate, progressStepVerticalV2Delegate, progressStepHorizontalV2Delegate, cellDetailsDelegate, new CellDetailsLoadingDelegate()), null, 6);
        this.T = containerDelegate;
        this.U = new ScrollerDelegate(v.k(actionWidgetDelegate, containerDelegate, rowDelegate), false);
        this.V = R$layout.screen_inbox;
        this.W = s.t(this, a.f);
        this.X = w.y0(new Function0(this) { // from class: e50.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InboxScreen f122684b;

            {
                this.f122684b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i21 = i;
                InboxScreen inboxScreen = this.f122684b;
                switch (i21) {
                    case 0:
                        KProperty[] kPropertyArr = InboxScreen.f0;
                        phm.a aVar = (phm.a) ue0.e.j(inboxScreen.m2()).a().get(h30.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (e0) ((f50.d) ((f50.a) aVar2.b()).j().mo3808a(inboxScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", h30.a.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = InboxScreen.f0;
                        e0 e0Var = (e0) inboxScreen.X.getValue();
                        switch (e0Var.f148881a) {
                            case 0:
                                h30.n nVar = e0Var.f148882b;
                                n30.n nVarK = nVar.k();
                                of3.f fVar = nVar.f148906b;
                                x xVarB = fVar.b();
                                vc.s.j(xVarB);
                                be7.k kVarC = nVar.o.c();
                                vc.s.j(kVarC);
                                mse.a aVar3 = (mse.a) e0Var.k.get();
                                sse.b bVar = nVar.f148927t;
                                use.d dVarB = bVar.b();
                                vc.s.j(dVarB);
                                qf3.b bVar2 = (qf3.b) fVar.B.get();
                                vc.s.j(bVar2);
                                y40.a aVar4 = (y40.a) e0Var.f148889n.get();
                                tse.l lVarD = bVar.d();
                                e40.w wVarA = nVar.A();
                                j30.c cVarF = fVar.f();
                                vc.s.j(cVarF);
                                return new u(nVarK, xVarB, kVarC, aVar3, dVarB, bVar2, aVar4, new q(lVarD, wVarA, cVarF));
                            default:
                                h30.n nVar2 = e0Var.f148882b;
                                n30.n nVarK2 = nVar2.k();
                                of3.f fVar2 = nVar2.f148906b;
                                x xVarB2 = fVar2.b();
                                vc.s.j(xVarB2);
                                be7.k kVarC2 = nVar2.o.c();
                                vc.s.j(kVarC2);
                                mse.a aVar5 = (mse.a) e0Var.k.get();
                                sse.b bVar3 = nVar2.f148927t;
                                use.d dVarB2 = bVar3.b();
                                vc.s.j(dVarB2);
                                qf3.b bVar4 = (qf3.b) fVar2.B.get();
                                vc.s.j(bVar4);
                                y40.a aVar6 = (y40.a) e0Var.f148889n.get();
                                tse.l lVarD2 = bVar3.d();
                                e40.w wVarA2 = nVar2.A();
                                j30.c cVarF2 = fVar2.f();
                                vc.s.j(cVarF2);
                                return new u(nVarK2, xVarB2, kVarC2, aVar5, dVarB2, bVar4, aVar6, new q(lVarD2, wVarA2, cVarF2));
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = InboxScreen.f0;
                        e0 e0Var2 = (e0) inboxScreen.X.getValue();
                        switch (e0Var2.f148881a) {
                            case 0:
                                return (p10.c) e0Var2.f.get();
                            default:
                                return (p10.c) e0Var2.f.get();
                        }
                    case 3:
                        KProperty[] kPropertyArr4 = InboxScreen.f0;
                        e0 e0Var3 = (e0) inboxScreen.X.getValue();
                        switch (e0Var3.f148881a) {
                            case 0:
                                return (ep6.n) e0Var3.f148886j.get();
                            default:
                                return (ep6.n) e0Var3.f148886j.get();
                        }
                    default:
                        KProperty[] kPropertyArr5 = InboxScreen.f0;
                        int i22 = com.revolut.kompot.common.R$id.recyclerView;
                        RowLoadingDelegate rowLoadingDelegate = new RowLoadingDelegate();
                        ProgressStepHorizontalLoadingV2Delegate progressStepHorizontalLoadingV2Delegate = new ProgressStepHorizontalLoadingV2Delegate();
                        ProgressStepVerticalLoadingV2Delegate progressStepVerticalLoadingV2Delegate = new ProgressStepVerticalLoadingV2Delegate();
                        InboxScreen inboxScreen2 = this.f122684b;
                        return dli.f.a(inboxScreen2, inboxScreen2.d(), v.k(rowLoadingDelegate, progressStepHorizontalLoadingV2Delegate, progressStepVerticalLoadingV2Delegate, inboxScreen2.L, inboxScreen2.M, inboxScreen2.N, inboxScreen2.P, inboxScreen2.R, inboxScreen2.Q, inboxScreen2.T, inboxScreen2.U, inboxScreen2.O, new CellDetailsLoadingDelegate(), inboxScreen2.S), i22, null, null, null, 56);
                }
            }
        });
        this.Y = w.y0(new Function0(this) { // from class: e50.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InboxScreen f122684b;

            {
                this.f122684b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i21 = i2;
                InboxScreen inboxScreen = this.f122684b;
                switch (i21) {
                    case 0:
                        KProperty[] kPropertyArr = InboxScreen.f0;
                        phm.a aVar = (phm.a) ue0.e.j(inboxScreen.m2()).a().get(h30.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (e0) ((f50.d) ((f50.a) aVar2.b()).j().mo3808a(inboxScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", h30.a.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = InboxScreen.f0;
                        e0 e0Var = (e0) inboxScreen.X.getValue();
                        switch (e0Var.f148881a) {
                            case 0:
                                h30.n nVar = e0Var.f148882b;
                                n30.n nVarK = nVar.k();
                                of3.f fVar = nVar.f148906b;
                                x xVarB = fVar.b();
                                vc.s.j(xVarB);
                                be7.k kVarC = nVar.o.c();
                                vc.s.j(kVarC);
                                mse.a aVar3 = (mse.a) e0Var.k.get();
                                sse.b bVar = nVar.f148927t;
                                use.d dVarB = bVar.b();
                                vc.s.j(dVarB);
                                qf3.b bVar2 = (qf3.b) fVar.B.get();
                                vc.s.j(bVar2);
                                y40.a aVar4 = (y40.a) e0Var.f148889n.get();
                                tse.l lVarD = bVar.d();
                                e40.w wVarA = nVar.A();
                                j30.c cVarF = fVar.f();
                                vc.s.j(cVarF);
                                return new u(nVarK, xVarB, kVarC, aVar3, dVarB, bVar2, aVar4, new q(lVarD, wVarA, cVarF));
                            default:
                                h30.n nVar2 = e0Var.f148882b;
                                n30.n nVarK2 = nVar2.k();
                                of3.f fVar2 = nVar2.f148906b;
                                x xVarB2 = fVar2.b();
                                vc.s.j(xVarB2);
                                be7.k kVarC2 = nVar2.o.c();
                                vc.s.j(kVarC2);
                                mse.a aVar5 = (mse.a) e0Var.k.get();
                                sse.b bVar3 = nVar2.f148927t;
                                use.d dVarB2 = bVar3.b();
                                vc.s.j(dVarB2);
                                qf3.b bVar4 = (qf3.b) fVar2.B.get();
                                vc.s.j(bVar4);
                                y40.a aVar6 = (y40.a) e0Var.f148889n.get();
                                tse.l lVarD2 = bVar3.d();
                                e40.w wVarA2 = nVar2.A();
                                j30.c cVarF2 = fVar2.f();
                                vc.s.j(cVarF2);
                                return new u(nVarK2, xVarB2, kVarC2, aVar5, dVarB2, bVar4, aVar6, new q(lVarD2, wVarA2, cVarF2));
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = InboxScreen.f0;
                        e0 e0Var2 = (e0) inboxScreen.X.getValue();
                        switch (e0Var2.f148881a) {
                            case 0:
                                return (p10.c) e0Var2.f.get();
                            default:
                                return (p10.c) e0Var2.f.get();
                        }
                    case 3:
                        KProperty[] kPropertyArr4 = InboxScreen.f0;
                        e0 e0Var3 = (e0) inboxScreen.X.getValue();
                        switch (e0Var3.f148881a) {
                            case 0:
                                return (ep6.n) e0Var3.f148886j.get();
                            default:
                                return (ep6.n) e0Var3.f148886j.get();
                        }
                    default:
                        KProperty[] kPropertyArr5 = InboxScreen.f0;
                        int i22 = com.revolut.kompot.common.R$id.recyclerView;
                        RowLoadingDelegate rowLoadingDelegate = new RowLoadingDelegate();
                        ProgressStepHorizontalLoadingV2Delegate progressStepHorizontalLoadingV2Delegate = new ProgressStepHorizontalLoadingV2Delegate();
                        ProgressStepVerticalLoadingV2Delegate progressStepVerticalLoadingV2Delegate = new ProgressStepVerticalLoadingV2Delegate();
                        InboxScreen inboxScreen2 = this.f122684b;
                        return dli.f.a(inboxScreen2, inboxScreen2.d(), v.k(rowLoadingDelegate, progressStepHorizontalLoadingV2Delegate, progressStepVerticalLoadingV2Delegate, inboxScreen2.L, inboxScreen2.M, inboxScreen2.N, inboxScreen2.P, inboxScreen2.R, inboxScreen2.Q, inboxScreen2.T, inboxScreen2.U, inboxScreen2.O, new CellDetailsLoadingDelegate(), inboxScreen2.S), i22, null, null, null, 56);
                }
            }
        });
        this.Z = w.y0(new Function0(this) { // from class: e50.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InboxScreen f122684b;

            {
                this.f122684b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i21 = i3;
                InboxScreen inboxScreen = this.f122684b;
                switch (i21) {
                    case 0:
                        KProperty[] kPropertyArr = InboxScreen.f0;
                        phm.a aVar = (phm.a) ue0.e.j(inboxScreen.m2()).a().get(h30.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (e0) ((f50.d) ((f50.a) aVar2.b()).j().mo3808a(inboxScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", h30.a.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = InboxScreen.f0;
                        e0 e0Var = (e0) inboxScreen.X.getValue();
                        switch (e0Var.f148881a) {
                            case 0:
                                h30.n nVar = e0Var.f148882b;
                                n30.n nVarK = nVar.k();
                                of3.f fVar = nVar.f148906b;
                                x xVarB = fVar.b();
                                vc.s.j(xVarB);
                                be7.k kVarC = nVar.o.c();
                                vc.s.j(kVarC);
                                mse.a aVar3 = (mse.a) e0Var.k.get();
                                sse.b bVar = nVar.f148927t;
                                use.d dVarB = bVar.b();
                                vc.s.j(dVarB);
                                qf3.b bVar2 = (qf3.b) fVar.B.get();
                                vc.s.j(bVar2);
                                y40.a aVar4 = (y40.a) e0Var.f148889n.get();
                                tse.l lVarD = bVar.d();
                                e40.w wVarA = nVar.A();
                                j30.c cVarF = fVar.f();
                                vc.s.j(cVarF);
                                return new u(nVarK, xVarB, kVarC, aVar3, dVarB, bVar2, aVar4, new q(lVarD, wVarA, cVarF));
                            default:
                                h30.n nVar2 = e0Var.f148882b;
                                n30.n nVarK2 = nVar2.k();
                                of3.f fVar2 = nVar2.f148906b;
                                x xVarB2 = fVar2.b();
                                vc.s.j(xVarB2);
                                be7.k kVarC2 = nVar2.o.c();
                                vc.s.j(kVarC2);
                                mse.a aVar5 = (mse.a) e0Var.k.get();
                                sse.b bVar3 = nVar2.f148927t;
                                use.d dVarB2 = bVar3.b();
                                vc.s.j(dVarB2);
                                qf3.b bVar4 = (qf3.b) fVar2.B.get();
                                vc.s.j(bVar4);
                                y40.a aVar6 = (y40.a) e0Var.f148889n.get();
                                tse.l lVarD2 = bVar3.d();
                                e40.w wVarA2 = nVar2.A();
                                j30.c cVarF2 = fVar2.f();
                                vc.s.j(cVarF2);
                                return new u(nVarK2, xVarB2, kVarC2, aVar5, dVarB2, bVar4, aVar6, new q(lVarD2, wVarA2, cVarF2));
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = InboxScreen.f0;
                        e0 e0Var2 = (e0) inboxScreen.X.getValue();
                        switch (e0Var2.f148881a) {
                            case 0:
                                return (p10.c) e0Var2.f.get();
                            default:
                                return (p10.c) e0Var2.f.get();
                        }
                    case 3:
                        KProperty[] kPropertyArr4 = InboxScreen.f0;
                        e0 e0Var3 = (e0) inboxScreen.X.getValue();
                        switch (e0Var3.f148881a) {
                            case 0:
                                return (ep6.n) e0Var3.f148886j.get();
                            default:
                                return (ep6.n) e0Var3.f148886j.get();
                        }
                    default:
                        KProperty[] kPropertyArr5 = InboxScreen.f0;
                        int i22 = com.revolut.kompot.common.R$id.recyclerView;
                        RowLoadingDelegate rowLoadingDelegate = new RowLoadingDelegate();
                        ProgressStepHorizontalLoadingV2Delegate progressStepHorizontalLoadingV2Delegate = new ProgressStepHorizontalLoadingV2Delegate();
                        ProgressStepVerticalLoadingV2Delegate progressStepVerticalLoadingV2Delegate = new ProgressStepVerticalLoadingV2Delegate();
                        InboxScreen inboxScreen2 = this.f122684b;
                        return dli.f.a(inboxScreen2, inboxScreen2.d(), v.k(rowLoadingDelegate, progressStepHorizontalLoadingV2Delegate, progressStepVerticalLoadingV2Delegate, inboxScreen2.L, inboxScreen2.M, inboxScreen2.N, inboxScreen2.P, inboxScreen2.R, inboxScreen2.Q, inboxScreen2.T, inboxScreen2.U, inboxScreen2.O, new CellDetailsLoadingDelegate(), inboxScreen2.S), i22, null, null, null, 56);
                }
            }
        });
        this.f51163a0 = w.y0(new Function0(this) { // from class: e50.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InboxScreen f122684b;

            {
                this.f122684b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i21 = i5;
                InboxScreen inboxScreen = this.f122684b;
                switch (i21) {
                    case 0:
                        KProperty[] kPropertyArr = InboxScreen.f0;
                        phm.a aVar = (phm.a) ue0.e.j(inboxScreen.m2()).a().get(h30.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (e0) ((f50.d) ((f50.a) aVar2.b()).j().mo3808a(inboxScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", h30.a.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = InboxScreen.f0;
                        e0 e0Var = (e0) inboxScreen.X.getValue();
                        switch (e0Var.f148881a) {
                            case 0:
                                h30.n nVar = e0Var.f148882b;
                                n30.n nVarK = nVar.k();
                                of3.f fVar = nVar.f148906b;
                                x xVarB = fVar.b();
                                vc.s.j(xVarB);
                                be7.k kVarC = nVar.o.c();
                                vc.s.j(kVarC);
                                mse.a aVar3 = (mse.a) e0Var.k.get();
                                sse.b bVar = nVar.f148927t;
                                use.d dVarB = bVar.b();
                                vc.s.j(dVarB);
                                qf3.b bVar2 = (qf3.b) fVar.B.get();
                                vc.s.j(bVar2);
                                y40.a aVar4 = (y40.a) e0Var.f148889n.get();
                                tse.l lVarD = bVar.d();
                                e40.w wVarA = nVar.A();
                                j30.c cVarF = fVar.f();
                                vc.s.j(cVarF);
                                return new u(nVarK, xVarB, kVarC, aVar3, dVarB, bVar2, aVar4, new q(lVarD, wVarA, cVarF));
                            default:
                                h30.n nVar2 = e0Var.f148882b;
                                n30.n nVarK2 = nVar2.k();
                                of3.f fVar2 = nVar2.f148906b;
                                x xVarB2 = fVar2.b();
                                vc.s.j(xVarB2);
                                be7.k kVarC2 = nVar2.o.c();
                                vc.s.j(kVarC2);
                                mse.a aVar5 = (mse.a) e0Var.k.get();
                                sse.b bVar3 = nVar2.f148927t;
                                use.d dVarB2 = bVar3.b();
                                vc.s.j(dVarB2);
                                qf3.b bVar4 = (qf3.b) fVar2.B.get();
                                vc.s.j(bVar4);
                                y40.a aVar6 = (y40.a) e0Var.f148889n.get();
                                tse.l lVarD2 = bVar3.d();
                                e40.w wVarA2 = nVar2.A();
                                j30.c cVarF2 = fVar2.f();
                                vc.s.j(cVarF2);
                                return new u(nVarK2, xVarB2, kVarC2, aVar5, dVarB2, bVar4, aVar6, new q(lVarD2, wVarA2, cVarF2));
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = InboxScreen.f0;
                        e0 e0Var2 = (e0) inboxScreen.X.getValue();
                        switch (e0Var2.f148881a) {
                            case 0:
                                return (p10.c) e0Var2.f.get();
                            default:
                                return (p10.c) e0Var2.f.get();
                        }
                    case 3:
                        KProperty[] kPropertyArr4 = InboxScreen.f0;
                        e0 e0Var3 = (e0) inboxScreen.X.getValue();
                        switch (e0Var3.f148881a) {
                            case 0:
                                return (ep6.n) e0Var3.f148886j.get();
                            default:
                                return (ep6.n) e0Var3.f148886j.get();
                        }
                    default:
                        KProperty[] kPropertyArr5 = InboxScreen.f0;
                        int i22 = com.revolut.kompot.common.R$id.recyclerView;
                        RowLoadingDelegate rowLoadingDelegate = new RowLoadingDelegate();
                        ProgressStepHorizontalLoadingV2Delegate progressStepHorizontalLoadingV2Delegate = new ProgressStepHorizontalLoadingV2Delegate();
                        ProgressStepVerticalLoadingV2Delegate progressStepVerticalLoadingV2Delegate = new ProgressStepVerticalLoadingV2Delegate();
                        InboxScreen inboxScreen2 = this.f122684b;
                        return dli.f.a(inboxScreen2, inboxScreen2.d(), v.k(rowLoadingDelegate, progressStepHorizontalLoadingV2Delegate, progressStepVerticalLoadingV2Delegate, inboxScreen2.L, inboxScreen2.M, inboxScreen2.N, inboxScreen2.P, inboxScreen2.R, inboxScreen2.Q, inboxScreen2.T, inboxScreen2.U, inboxScreen2.O, new CellDetailsLoadingDelegate(), inboxScreen2.S), i22, null, null, null, 56);
                }
            }
        });
        this.f51165d0 = w.y0(new Function0(this) { // from class: e50.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InboxScreen f122684b;

            {
                this.f122684b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i21 = i6;
                InboxScreen inboxScreen = this.f122684b;
                switch (i21) {
                    case 0:
                        KProperty[] kPropertyArr = InboxScreen.f0;
                        phm.a aVar = (phm.a) ue0.e.j(inboxScreen.m2()).a().get(h30.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (e0) ((f50.d) ((f50.a) aVar2.b()).j().mo3808a(inboxScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", h30.a.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = InboxScreen.f0;
                        e0 e0Var = (e0) inboxScreen.X.getValue();
                        switch (e0Var.f148881a) {
                            case 0:
                                h30.n nVar = e0Var.f148882b;
                                n30.n nVarK = nVar.k();
                                of3.f fVar = nVar.f148906b;
                                x xVarB = fVar.b();
                                vc.s.j(xVarB);
                                be7.k kVarC = nVar.o.c();
                                vc.s.j(kVarC);
                                mse.a aVar3 = (mse.a) e0Var.k.get();
                                sse.b bVar = nVar.f148927t;
                                use.d dVarB = bVar.b();
                                vc.s.j(dVarB);
                                qf3.b bVar2 = (qf3.b) fVar.B.get();
                                vc.s.j(bVar2);
                                y40.a aVar4 = (y40.a) e0Var.f148889n.get();
                                tse.l lVarD = bVar.d();
                                e40.w wVarA = nVar.A();
                                j30.c cVarF = fVar.f();
                                vc.s.j(cVarF);
                                return new u(nVarK, xVarB, kVarC, aVar3, dVarB, bVar2, aVar4, new q(lVarD, wVarA, cVarF));
                            default:
                                h30.n nVar2 = e0Var.f148882b;
                                n30.n nVarK2 = nVar2.k();
                                of3.f fVar2 = nVar2.f148906b;
                                x xVarB2 = fVar2.b();
                                vc.s.j(xVarB2);
                                be7.k kVarC2 = nVar2.o.c();
                                vc.s.j(kVarC2);
                                mse.a aVar5 = (mse.a) e0Var.k.get();
                                sse.b bVar3 = nVar2.f148927t;
                                use.d dVarB2 = bVar3.b();
                                vc.s.j(dVarB2);
                                qf3.b bVar4 = (qf3.b) fVar2.B.get();
                                vc.s.j(bVar4);
                                y40.a aVar6 = (y40.a) e0Var.f148889n.get();
                                tse.l lVarD2 = bVar3.d();
                                e40.w wVarA2 = nVar2.A();
                                j30.c cVarF2 = fVar2.f();
                                vc.s.j(cVarF2);
                                return new u(nVarK2, xVarB2, kVarC2, aVar5, dVarB2, bVar4, aVar6, new q(lVarD2, wVarA2, cVarF2));
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = InboxScreen.f0;
                        e0 e0Var2 = (e0) inboxScreen.X.getValue();
                        switch (e0Var2.f148881a) {
                            case 0:
                                return (p10.c) e0Var2.f.get();
                            default:
                                return (p10.c) e0Var2.f.get();
                        }
                    case 3:
                        KProperty[] kPropertyArr4 = InboxScreen.f0;
                        e0 e0Var3 = (e0) inboxScreen.X.getValue();
                        switch (e0Var3.f148881a) {
                            case 0:
                                return (ep6.n) e0Var3.f148886j.get();
                            default:
                                return (ep6.n) e0Var3.f148886j.get();
                        }
                    default:
                        KProperty[] kPropertyArr5 = InboxScreen.f0;
                        int i22 = com.revolut.kompot.common.R$id.recyclerView;
                        RowLoadingDelegate rowLoadingDelegate = new RowLoadingDelegate();
                        ProgressStepHorizontalLoadingV2Delegate progressStepHorizontalLoadingV2Delegate = new ProgressStepHorizontalLoadingV2Delegate();
                        ProgressStepVerticalLoadingV2Delegate progressStepVerticalLoadingV2Delegate = new ProgressStepVerticalLoadingV2Delegate();
                        InboxScreen inboxScreen2 = this.f122684b;
                        return dli.f.a(inboxScreen2, inboxScreen2.d(), v.k(rowLoadingDelegate, progressStepHorizontalLoadingV2Delegate, progressStepVerticalLoadingV2Delegate, inboxScreen2.L, inboxScreen2.M, inboxScreen2.N, inboxScreen2.P, inboxScreen2.R, inboxScreen2.Q, inboxScreen2.T, inboxScreen2.U, inboxScreen2.O, new CellDetailsLoadingDelegate(), inboxScreen2.S), i22, null, null, null, 56);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        koi.h hVar;
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f1521c.setMenuItems(uiState.f122687b);
        List list = uiState.f122688c;
        if (list.isEmpty()) {
            ScreenContentRecyclerView screenContentRecyclerView = this.f51164b0;
            if (screenContentRecyclerView != null) {
                screenContentRecyclerView.setVisibility(8);
                return;
            }
            return;
        }
        ScreenContentRecyclerView screenContentRecyclerView2 = this.f51164b0;
        if (screenContentRecyclerView2 != null) {
            screenContentRecyclerView2.setVisibility(0);
            hVar = this.c0;
            if (hVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            hVar = new koi.h(new c(((p10.c) this.Z.getValue()).f231597a), false, false, 6);
            this.c0 = hVar;
            ControllerContainerConstraintLayout rootConstraint = d3().e;
            Intrinsics.checkNotNullExpressionValue(rootConstraint, "rootConstraint");
            Context context = rootConstraint.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ScreenContentRecyclerView screenContentRecyclerView3 = new ScreenContentRecyclerView(context, null, 6, 0);
            screenContentRecyclerView3.setId(View.generateViewId());
            screenContentRecyclerView3.setLayoutManager(new LinearLayoutManager(rootConstraint.getContext()));
            screenContentRecyclerView3.setAdapter(hVar);
            screenContentRecyclerView3.setItemAnimator(null);
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
            layoutParams.bottomToBottom = 0;
            layoutParams.startToStart = 0;
            layoutParams.endToEnd = 0;
            rootConstraint.addView(screenContentRecyclerView3, layoutParams);
            ControllerContainerCoordinatorLayout coordinatorLayout = d3().f1520b;
            Intrinsics.checkNotNullExpressionValue(coordinatorLayout, "coordinatorLayout");
            ViewGroup.LayoutParams layoutParams2 = coordinatorLayout.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
            layoutParams3.bottomToBottom = -1;
            layoutParams3.bottomToTop = screenContentRecyclerView3.getId();
            coordinatorLayout.setLayoutParams(layoutParams3);
            this.f51164b0 = screenContentRecyclerView3;
        }
        hVar.c(list);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (e0) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f1521c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f1521c.setToolbarTitle(new TextLocalisedClause(R$string.chat_new_inbox_screen_title, null, null, 14));
        NavBarWithToolbar navBarWithToolbar = d3().f1521c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.chat_new_inbox_screen_title, null, null, 14), null);
        this.K = d3().d.getItemAnimator();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f1521c.f59410q), new dze.n(this, null, 9), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f1521c.o.f57403b), null, new e50.c(this, null, 1), 3);
        RowDelegate rowDelegate = this.N;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53218h), null, new e50.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53220l), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.k), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.T.f52124g), null, new e50.c(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f52371h.f121375b), null, new k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.U.q()), null, new e50.c(this, null, 3), 3);
        ProgressStepVerticalV2Delegate progressStepVerticalV2Delegate = this.R;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(progressStepVerticalV2Delegate.f.f121375b), null, new l(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(progressStepVerticalV2Delegate.f53006g.f121375b), null, new b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(progressStepVerticalV2Delegate.e), null, new e50.c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.d.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.f), null, new e50.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.i), null, new e50.f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53219j), null, new g(this, null), 3);
    }

    public final f d3() {
        ViewBinding value = this.W.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (f) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final m d() {
        return (m) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final void g1(boolean z) {
        super.g1(z);
        if (!z) {
            d3().d.setItemAnimator(null);
            j2 j2Var = this.f51166e0;
            if (j2Var != null) {
                j2Var.cancel();
            }
            this.f51166e0 = null;
            return;
        }
        j2 j2Var2 = this.f51166e0;
        if (j2Var2 != null) {
            j2Var2.cancel();
        }
        i2 i2Var = j2.Companion;
        View viewD2 = D2();
        a0.a aVar = new a0.a(this, 25);
        i2Var.getClass();
        this.f51166e0 = i2.a(viewD2, aVar);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.V;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.f51165d0.getValue();
    }
}
