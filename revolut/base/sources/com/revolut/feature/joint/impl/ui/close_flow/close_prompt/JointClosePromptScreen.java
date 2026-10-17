package com.revolut.feature.joint.impl.ui.close_flow.close_prompt;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.joint.impl.ui.close_flow.close_prompt.JointClosePromptScreen;
import com.revolut.feature.joint.impl.ui.close_flow.close_prompt.JointClosePromptScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import e48.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import q48.b;
import q48.c;
import q48.g;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/joint/impl/ui/close_flow/close_prompt/JointClosePromptScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lq48/g;", "Ldli/a;", "Lq48/h;", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JointClosePromptScreen extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(JointClosePromptScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwinVerticalButtonsBinding;", 0))};
    public final JointClosePromptScreenContract$InputData K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final int P;
    public final Object Q;
    public final Object R;

    public JointClosePromptScreen(JointClosePromptScreenContract$InputData input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        this.L = s.t(this, b.f);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: q48.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JointClosePromptScreen f242071b;

            {
                this.f242071b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JointClosePromptScreen jointClosePromptScreen = this.f242071b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = JointClosePromptScreen.S;
                        ViewBinding value = jointClosePromptScreen.L.getValue(jointClosePromptScreen, JointClosePromptScreen.S[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return ((jii.w) value).f174570b;
                    case 1:
                        KProperty[] kPropertyArr2 = JointClosePromptScreen.S;
                        ViewBinding value2 = jointClosePromptScreen.L.getValue(jointClosePromptScreen, JointClosePromptScreen.S[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return ((jii.w) value2).d;
                    case 2:
                        KProperty[] kPropertyArr3 = JointClosePromptScreen.S;
                        qji.b bVarU2 = jointClosePromptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.joint.impl.ui.close_flow.close_prompt.di.JointClosePromptScreenComponent.Injector");
                        e48.h hVar = (e48.h) bVarU2;
                        e48.g gVar = hVar.f122442b;
                        e48.h hVar2 = hVar.f122443c;
                        JointClosePromptScreenContract$InputData jointClosePromptScreenContract$InputData = jointClosePromptScreen.K;
                        jointClosePromptScreenContract$InputData.getClass();
                        return new e48.j(gVar, hVar2, jointClosePromptScreenContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = JointClosePromptScreen.S;
                        return (j) ((e48.j) jointClosePromptScreen.O.getValue()).f122449g.get();
                    default:
                        KProperty[] kPropertyArr5 = JointClosePromptScreen.S;
                        JointClosePromptScreen jointClosePromptScreen2 = this.f242071b;
                        return dli.f.a(jointClosePromptScreen2, (j) jointClosePromptScreen2.Q.getValue(), d0.E0(((fd6.a) ((e48.j) jointClosePromptScreen2.O.getValue()).d.get()).e, u.c(new SimpleMediaDelegate())), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: q48.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JointClosePromptScreen f242071b;

            {
                this.f242071b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JointClosePromptScreen jointClosePromptScreen = this.f242071b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JointClosePromptScreen.S;
                        ViewBinding value = jointClosePromptScreen.L.getValue(jointClosePromptScreen, JointClosePromptScreen.S[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return ((jii.w) value).f174570b;
                    case 1:
                        KProperty[] kPropertyArr2 = JointClosePromptScreen.S;
                        ViewBinding value2 = jointClosePromptScreen.L.getValue(jointClosePromptScreen, JointClosePromptScreen.S[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return ((jii.w) value2).d;
                    case 2:
                        KProperty[] kPropertyArr3 = JointClosePromptScreen.S;
                        qji.b bVarU2 = jointClosePromptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.joint.impl.ui.close_flow.close_prompt.di.JointClosePromptScreenComponent.Injector");
                        e48.h hVar = (e48.h) bVarU2;
                        e48.g gVar = hVar.f122442b;
                        e48.h hVar2 = hVar.f122443c;
                        JointClosePromptScreenContract$InputData jointClosePromptScreenContract$InputData = jointClosePromptScreen.K;
                        jointClosePromptScreenContract$InputData.getClass();
                        return new e48.j(gVar, hVar2, jointClosePromptScreenContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = JointClosePromptScreen.S;
                        return (j) ((e48.j) jointClosePromptScreen.O.getValue()).f122449g.get();
                    default:
                        KProperty[] kPropertyArr5 = JointClosePromptScreen.S;
                        JointClosePromptScreen jointClosePromptScreen2 = this.f242071b;
                        return dli.f.a(jointClosePromptScreen2, (j) jointClosePromptScreen2.Q.getValue(), d0.E0(((fd6.a) ((e48.j) jointClosePromptScreen2.O.getValue()).d.get()).e, u.c(new SimpleMediaDelegate())), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: q48.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JointClosePromptScreen f242071b;

            {
                this.f242071b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                JointClosePromptScreen jointClosePromptScreen = this.f242071b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JointClosePromptScreen.S;
                        ViewBinding value = jointClosePromptScreen.L.getValue(jointClosePromptScreen, JointClosePromptScreen.S[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return ((jii.w) value).f174570b;
                    case 1:
                        KProperty[] kPropertyArr2 = JointClosePromptScreen.S;
                        ViewBinding value2 = jointClosePromptScreen.L.getValue(jointClosePromptScreen, JointClosePromptScreen.S[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return ((jii.w) value2).d;
                    case 2:
                        KProperty[] kPropertyArr3 = JointClosePromptScreen.S;
                        qji.b bVarU2 = jointClosePromptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.joint.impl.ui.close_flow.close_prompt.di.JointClosePromptScreenComponent.Injector");
                        e48.h hVar = (e48.h) bVarU2;
                        e48.g gVar = hVar.f122442b;
                        e48.h hVar2 = hVar.f122443c;
                        JointClosePromptScreenContract$InputData jointClosePromptScreenContract$InputData = jointClosePromptScreen.K;
                        jointClosePromptScreenContract$InputData.getClass();
                        return new e48.j(gVar, hVar2, jointClosePromptScreenContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = JointClosePromptScreen.S;
                        return (j) ((e48.j) jointClosePromptScreen.O.getValue()).f122449g.get();
                    default:
                        KProperty[] kPropertyArr5 = JointClosePromptScreen.S;
                        JointClosePromptScreen jointClosePromptScreen2 = this.f242071b;
                        return dli.f.a(jointClosePromptScreen2, (j) jointClosePromptScreen2.Q.getValue(), d0.E0(((fd6.a) ((e48.j) jointClosePromptScreen2.O.getValue()).d.get()).e, u.c(new SimpleMediaDelegate())), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = R$layout.screen_recycler_navbar_twin_vertical_buttons;
        final int i5 = 3;
        this.Q = w.y0(new Function0(this) { // from class: q48.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JointClosePromptScreen f242071b;

            {
                this.f242071b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                JointClosePromptScreen jointClosePromptScreen = this.f242071b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JointClosePromptScreen.S;
                        ViewBinding value = jointClosePromptScreen.L.getValue(jointClosePromptScreen, JointClosePromptScreen.S[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return ((jii.w) value).f174570b;
                    case 1:
                        KProperty[] kPropertyArr2 = JointClosePromptScreen.S;
                        ViewBinding value2 = jointClosePromptScreen.L.getValue(jointClosePromptScreen, JointClosePromptScreen.S[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return ((jii.w) value2).d;
                    case 2:
                        KProperty[] kPropertyArr3 = JointClosePromptScreen.S;
                        qji.b bVarU2 = jointClosePromptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.joint.impl.ui.close_flow.close_prompt.di.JointClosePromptScreenComponent.Injector");
                        e48.h hVar = (e48.h) bVarU2;
                        e48.g gVar = hVar.f122442b;
                        e48.h hVar2 = hVar.f122443c;
                        JointClosePromptScreenContract$InputData jointClosePromptScreenContract$InputData = jointClosePromptScreen.K;
                        jointClosePromptScreenContract$InputData.getClass();
                        return new e48.j(gVar, hVar2, jointClosePromptScreenContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = JointClosePromptScreen.S;
                        return (j) ((e48.j) jointClosePromptScreen.O.getValue()).f122449g.get();
                    default:
                        KProperty[] kPropertyArr5 = JointClosePromptScreen.S;
                        JointClosePromptScreen jointClosePromptScreen2 = this.f242071b;
                        return dli.f.a(jointClosePromptScreen2, (j) jointClosePromptScreen2.Q.getValue(), d0.E0(((fd6.a) ((e48.j) jointClosePromptScreen2.O.getValue()).d.get()).e, u.c(new SimpleMediaDelegate())), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i6 = 4;
        this.R = w.y0(new Function0(this) { // from class: q48.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JointClosePromptScreen f242071b;

            {
                this.f242071b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                JointClosePromptScreen jointClosePromptScreen = this.f242071b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JointClosePromptScreen.S;
                        ViewBinding value = jointClosePromptScreen.L.getValue(jointClosePromptScreen, JointClosePromptScreen.S[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return ((jii.w) value).f174570b;
                    case 1:
                        KProperty[] kPropertyArr2 = JointClosePromptScreen.S;
                        ViewBinding value2 = jointClosePromptScreen.L.getValue(jointClosePromptScreen, JointClosePromptScreen.S[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return ((jii.w) value2).d;
                    case 2:
                        KProperty[] kPropertyArr3 = JointClosePromptScreen.S;
                        qji.b bVarU2 = jointClosePromptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.joint.impl.ui.close_flow.close_prompt.di.JointClosePromptScreenComponent.Injector");
                        e48.h hVar = (e48.h) bVarU2;
                        e48.g gVar = hVar.f122442b;
                        e48.h hVar2 = hVar.f122443c;
                        JointClosePromptScreenContract$InputData jointClosePromptScreenContract$InputData = jointClosePromptScreen.K;
                        jointClosePromptScreenContract$InputData.getClass();
                        return new e48.j(gVar, hVar2, jointClosePromptScreenContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = JointClosePromptScreen.S;
                        return (j) ((e48.j) jointClosePromptScreen.O.getValue()).f122449g.get();
                    default:
                        KProperty[] kPropertyArr5 = JointClosePromptScreen.S;
                        JointClosePromptScreen jointClosePromptScreen2 = this.f242071b;
                        return dli.f.a(jointClosePromptScreen2, (j) jointClosePromptScreen2.Q.getValue(), d0.E0(((fd6.a) ((e48.j) jointClosePromptScreen2.O.getValue()).d.get()).e, u.c(new SimpleMediaDelegate())), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        q48.h uiState = (q48.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) this.M.getValue();
        TextLocalisedClause textLocalisedClause = uiState.f242075a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setDescriptionText(uiState.f242076b);
        navBarWithToolbar.setDescriptionVisible(true);
        TwinVerticalButton twinVerticalButton = (TwinVerticalButton) this.N.getValue();
        twinVerticalButton.setMainButtonText(uiState.f242077c);
        twinVerticalButton.setMainButtonStyle(LargeActionButton.ButtonStyle.f58725a);
        twinVerticalButton.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
        Clause clause = uiState.d;
        twinVerticalButton.setSecondaryButtonText(clause);
        twinVerticalButton.setSecondaryButtonVisible(clause != null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (q48.j) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((NavBarWithToolbar) this.M.getValue()).setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((NavBarWithToolbar) this.M.getValue()).f59410q), new c(this, null, 0), 3);
        ?? r62 = this.N;
        ViewController.P2(this, rd0.e.b(((TwinVerticalButton) r62.getValue()).o0()), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(((TwinVerticalButton) r62.getValue()).p0()), new c(this, null, 2), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
