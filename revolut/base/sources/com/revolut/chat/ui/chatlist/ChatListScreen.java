package com.revolut.chat.ui.chatlist;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.chat.ui.chatlist.ChatListScreen;
import com.revolut.chat.ui.flow.anonchatlogout.LogoutFromAnonChatWarningScreen;
import com.revolut.chat_core.R$layout;
import com.revolut.chat_core.R$string;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ContainerDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LabelButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepHorizontalLoadingV2Delegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalLoadingV2Delegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import d40.a;
import ep6.n;
import h30.r;
import java.util.List;
import jh.d;
import jki.o;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.c9;
import no.m;
import ofm.q;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;
import r25.c;
import r40.a0;
import r40.b;
import r40.b0;
import r40.c0;
import r40.d0;
import r40.e0;
import r40.f0;
import r40.g;
import r40.g0;
import r40.i0;
import r40.j0;
import r40.k0;
import r40.l0;
import r40.x;
import r40.x0;
import r40.y;
import r40.z;
import rd0.e;
import vc.s;
import w01.k;
import yhm.j;
import yy0.f;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/chat/ui/chatlist/ChatListScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lr40/g;", "Lcom/revolut/chat/ui/chatlist/ChatListContract$InputData;", "Lr40/b;", "Lno/m;", "Companion", "a", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatListScreen extends BaseRecyclerViewScreen<g, ChatListContract$InputData, b> implements m {
    public final int U;
    public final h V;
    public final RowDelegate W;
    public final RowLoadingDelegate X;
    public final ActionWidgetDelegate Y;
    public final SwipeToActionDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ProgressStepVerticalV2Delegate f51144a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final LabelButtonDelegate f51145b0;
    public final FullScreenStateDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final AnalyticsProduct.Shared f51146d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final ContainerDelegate f51147e0;
    public final Lazy f0;
    public final Lazy g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Lazy f51148h0;
    public static final /* synthetic */ KProperty[] i0 = {o0.f186429a.j(new h0(ChatListScreen.class, "binding", "getBinding()Lcom/revolut/chat_core/databinding/ScreenChatListBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.chat.ui.chatlist.ChatListScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListScreen(ChatListContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_chat_list;
        this.V = s.t(this, x.f);
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.W = rowDelegate;
        this.X = new RowLoadingDelegate();
        ActionWidgetDelegate actionWidgetDelegate = new ActionWidgetDelegate();
        this.Y = actionWidgetDelegate;
        final int i = 0;
        this.Z = new SwipeToActionDelegate(actionWidgetDelegate, false);
        ProgressStepVerticalV2Delegate progressStepVerticalV2Delegate = new ProgressStepVerticalV2Delegate();
        this.f51144a0 = progressStepVerticalV2Delegate;
        LabelButtonDelegate labelButtonDelegate = new LabelButtonDelegate();
        this.f51145b0 = labelButtonDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.c0 = fullScreenStateDelegate;
        CellDetailsDelegate cellDetailsDelegate = new CellDetailsDelegate();
        this.f51146d0 = a.f111223a;
        final int i2 = 1;
        this.f51147e0 = new ContainerDelegate(v.k(new RowLoadingDelegate(), new ProgressStepHorizontalLoadingV2Delegate(), new ProgressStepVerticalLoadingV2Delegate(), fullScreenStateDelegate, rowDelegate, labelButtonDelegate, progressStepVerticalV2Delegate, cellDetailsDelegate, new CellDetailsLoadingDelegate()), null, 6);
        this.f0 = j.b(new Function0(this) { // from class: r40.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChatListScreen f251375b;

            {
                this.f251375b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                ChatListScreen chatListScreen = this.f251375b;
                switch (i3) {
                    case 0:
                        ChatListScreen.Companion companion = ChatListScreen.INSTANCE;
                        return zhm.v.k(new ListSubheaderDelegate(), chatListScreen.f51145b0, chatListScreen.f51144a0, chatListScreen.W, chatListScreen.X, chatListScreen.Z, chatListScreen.Y, chatListScreen.c0, new ProgressStepVerticalLoadingV2Delegate(), chatListScreen.f51147e0);
                    default:
                        ChatListScreen.Companion companion2 = ChatListScreen.INSTANCE;
                        return (c) ((h30.r) chatListScreen.g0.getValue()).o.get();
                }
            }
        });
        this.g0 = j.b(new qvf.a(this, inputData, 14));
        this.f51148h0 = j.b(new Function0(this) { // from class: r40.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChatListScreen f251375b;

            {
                this.f251375b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                ChatListScreen chatListScreen = this.f251375b;
                switch (i3) {
                    case 0:
                        ChatListScreen.Companion companion = ChatListScreen.INSTANCE;
                        return zhm.v.k(new ListSubheaderDelegate(), chatListScreen.f51145b0, chatListScreen.f51144a0, chatListScreen.W, chatListScreen.X, chatListScreen.Z, chatListScreen.Y, chatListScreen.c0, new ProgressStepVerticalLoadingV2Delegate(), chatListScreen.f51147e0);
                    default:
                        ChatListScreen.Companion companion2 = ChatListScreen.INSTANCE;
                        return (c) ((h30.r) chatListScreen.g0.getValue()).o.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        x0 x0Var = (x0) T2();
        if (x0Var.f251382x.b()) {
            return false;
        }
        x0Var.f2(new LogoutFromAnonChatWarningScreen(), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new l0(x0Var, 0));
        return true;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getM() {
        return this.f51146d0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (r) this.g0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        f fVarQ = d.f(m2()).Q();
        Continuation continuation = null;
        CdnImage cdnImageC = com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D109", null, null, null, 30);
        ImageView newChatBtn = h3().d;
        Intrinsics.checkNotNullExpressionValue(newChatBtn, "newChatBtn");
        f.e(fVarQ, cdnImageC, newChatBtn, null, null, 12);
        NavBarWithToolbar navBarWithToolbar = h3().f1511b;
        com.revolut.kompot.navigable.a.g2(this, e.b(navBarWithToolbar.f59410q), null, new y(this, continuation, 0), 3);
        efm.r rVarFilter = navBarWithToolbar.o.f57403b.filter(new c(27, new r2d.d(20)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarFilter), null, new y(this, continuation, 1), 3);
        RowDelegate rowDelegate = this.W;
        com.revolut.kompot.navigable.a.g2(this, e.b(rowDelegate.k), null, new c0(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(rowDelegate.f53218h), null, new d0(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f51147e0.f52124g), null, new e0(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.X.d), null, new y(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Z.f), null, new f0(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Y.f51589c.f121375b), null, new g0(this, null), 3);
        ProgressStepVerticalV2Delegate progressStepVerticalV2Delegate = this.f51144a0;
        com.revolut.kompot.navigable.a.g2(this, e.b(progressStepVerticalV2Delegate.e), null, new e0(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(progressStepVerticalV2Delegate.f.f121375b), null, new r40.h0(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(progressStepVerticalV2Delegate.f53006g.f121375b), null, new z(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f51145b0.d.f121375b), null, new a0(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.c0.f52371h.f121375b), null, new b0(this, null), 3);
        n nVar = (n) ((r) this.g0.getValue()).k.get();
        com.revolut.kompot.navigable.a.g2(this, e.b(rowDelegate.i), null, new i0(nVar, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(rowDelegate.f53219j), null, new j0(nVar, null), 3);
    }

    @Override // com.revolut.kompot.navigable.a
    public final void W() {
        ((x0) T2()).C.k(new Pair(Instant.now(), Boolean.TRUE));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f1511b.setNavigationButtonIcon(Integer.valueOf(q.k(q2())));
        h3().f1512c.setText(m2().getString(R$string.chat_new));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getZ() {
        return (List) this.f0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(g uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        RecyclerView recyclerViewH = h();
        boolean z = uiState.f251335c;
        TextLocalisedClause textLocalisedClause = uiState.f251334b;
        k.e(recyclerViewH, !z);
        Integer num = uiState.d;
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue > 0) {
                RecyclerView recyclerViewH2 = h();
                recyclerViewH2.post(new k0(recyclerViewH2, iIntValue, 0));
            }
            ((x0) T2()).x2(new r2d.d(22));
        }
        zhm.f0 f0Var = zhm.f0.f322471a;
        NavBarWithToolbar navBarWithToolbar = h3().f1511b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setMenuItems(f0Var);
        if (z) {
            h3().d.setOnClickListener(new c9(this, 13));
        }
        LinearLayout newChatContainer = h3().e;
        Intrinsics.checkNotNullExpressionValue(newChatContainer, "newChatContainer");
        k.e(newChatContainer, z);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.U;
    }

    public final a60.c h3() {
        ViewBinding value = this.V.getValue(this, i0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (a60.c) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final r40.c T2() {
        return (r40.c) this.f51148h0.getValue();
    }
}
