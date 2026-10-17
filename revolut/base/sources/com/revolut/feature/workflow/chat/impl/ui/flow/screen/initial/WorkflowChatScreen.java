package com.revolut.feature.workflow.chat.impl.ui.flow.screen.initial;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bth.c;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.workflow.chat.impl.R$string;
import com.revolut.feature.workflow.chat.impl.ui.flow.screen.initial.WorkflowChatScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import exe.k;
import ft.d;
import fth.e;
import fth.f;
import fth.g;
import java.util.List;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import sji.b;
import te0.w;
import tx0.j0;
import vc.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/workflow/chat/impl/ui/flow/screen/initial/WorkflowChatScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lfth/g;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lfth/e;", "<init>", "()V", "feature_workflow_chat_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WorkflowChatScreen extends BaseRecyclerViewScreen<g, IOData$EmptyInput, e> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(WorkflowChatScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final h U;
    public final boolean V;
    public final int W;
    public final int X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f96390a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f96391b0;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return u.a(p0);
        }
    }

    public WorkflowChatScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = s.t(this, a.f);
        this.V = true;
        this.W = R$layout.screen_recycler_navbar_nextbutton;
        this.X = R$id.recyclerView;
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: fth.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkflowChatScreen f138020b;

            {
                this.f138020b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WorkflowChatScreen workflowChatScreen = this.f138020b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WorkflowChatScreen.c0;
                        LargeActionButton goToButton = workflowChatScreen.g3().f174564b;
                        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
                        return goToButton;
                    case 1:
                        KProperty[] kPropertyArr2 = WorkflowChatScreen.c0;
                        qji.b bVarQ2 = workflowChatScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.workflow.chat.impl.ui.flow.screen.initial.di.WorkflowChatScreenInjector");
                        bth.c cVar = new bth.c();
                        int i3 = 18;
                        cVar.f18579a = e4m.b.b(new aq1.e(cVar, 1, i3));
                        cVar.f18580b = e4m.b.b(new aq1.e(cVar, 0, i3));
                        return cVar;
                    default:
                        KProperty[] kPropertyArr3 = WorkflowChatScreen.c0;
                        return (f) ((bth.c) workflowChatScreen.Z.getValue()).f18580b.get();
                }
            }
        });
        final int i2 = 1;
        this.Z = w.y0(new Function0(this) { // from class: fth.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkflowChatScreen f138020b;

            {
                this.f138020b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WorkflowChatScreen workflowChatScreen = this.f138020b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WorkflowChatScreen.c0;
                        LargeActionButton goToButton = workflowChatScreen.g3().f174564b;
                        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
                        return goToButton;
                    case 1:
                        KProperty[] kPropertyArr2 = WorkflowChatScreen.c0;
                        qji.b bVarQ2 = workflowChatScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.workflow.chat.impl.ui.flow.screen.initial.di.WorkflowChatScreenInjector");
                        bth.c cVar = new bth.c();
                        int i3 = 18;
                        cVar.f18579a = e4m.b.b(new aq1.e(cVar, 1, i3));
                        cVar.f18580b = e4m.b.b(new aq1.e(cVar, 0, i3));
                        return cVar;
                    default:
                        KProperty[] kPropertyArr3 = WorkflowChatScreen.c0;
                        return (f) ((bth.c) workflowChatScreen.Z.getValue()).f18580b.get();
                }
            }
        });
        final int i3 = 2;
        this.f96390a0 = w.y0(new Function0(this) { // from class: fth.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkflowChatScreen f138020b;

            {
                this.f138020b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                WorkflowChatScreen workflowChatScreen = this.f138020b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WorkflowChatScreen.c0;
                        LargeActionButton goToButton = workflowChatScreen.g3().f174564b;
                        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
                        return goToButton;
                    case 1:
                        KProperty[] kPropertyArr2 = WorkflowChatScreen.c0;
                        qji.b bVarQ2 = workflowChatScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.workflow.chat.impl.ui.flow.screen.initial.di.WorkflowChatScreenInjector");
                        bth.c cVar = new bth.c();
                        int i32 = 18;
                        cVar.f18579a = e4m.b.b(new aq1.e(cVar, 1, i32));
                        cVar.f18580b = e4m.b.b(new aq1.e(cVar, 0, i32));
                        return cVar;
                    default:
                        KProperty[] kPropertyArr3 = WorkflowChatScreen.c0;
                        return (f) ((bth.c) workflowChatScreen.Z.getValue()).f18580b.get();
                }
            }
        });
        this.f96391b0 = zhm.u.c(new SimpleMediaDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (c) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (f) this.f96390a0.getValue();
    }

    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f174565c.f59410q), null, new d(this, null, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, new fo6.d(rd0.e.b(((LargeActionButton) this.Y.getValue()).o), 8), null, new k(2, (f) this.f96390a0.getValue(), f.class, "onEvent", "onEvent(Lcom/revolut/feature/workflow/chat/impl/ui/flow/screen/initial/WorkflowChatScreenContract$Event;)V", 4, 12), 3);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.workflow_chat_screen_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.workflow_chat_screen_title, null, null, 14), null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.workflow_chat_screen_description, null, null, 14));
        ((LargeActionButton) this.Y.getValue()).setText(new TextLocalisedClause(R$string.workflow_chat_action_continue, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF96391b0() {
        return this.f96391b0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getX() {
        return this.X;
    }

    public final u g3() {
        ViewBinding value = this.U.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
