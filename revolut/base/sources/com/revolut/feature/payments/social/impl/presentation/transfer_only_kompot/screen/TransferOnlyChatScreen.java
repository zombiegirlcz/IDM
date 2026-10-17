package com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.screen;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.AppTipDelegate;
import com.revolut.core.ui_kit.delegates.ChatTimestampBubbleDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleLoadingDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatReactionDelegate;
import com.revolut.core.ui_kit.delegates.chat.DefaultModeChatPaymentBubbleDelegate;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.models.AppTipUIModel;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.BackgroundWallpaperView;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.social.impl.R$id;
import com.revolut.feature.payments.social.impl.R$layout;
import com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.screen.TransferOnlyChatScreen;
import com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.screen.TransferOnlyChatScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.payments.core.R$string;
import dli.a;
import efm.r;
import goi.i;
import h30.l;
import in0.g;
import ip0.l1;
import ip0.n1;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ms0.h4;
import q2j.k;
import qz8.f;
import r0a.d;
import r0a.j;
import r0a.n;
import r0a.p;
import rp0.m;
import te0.w;
import vc.s;
import wp5.y;
import xki.e;
import yp0.b;
import yz9.c;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/social/impl/presentation/transfer_only_kompot/screen/TransferOnlyChatScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lr0a/n;", "Ldli/a;", "Lr0a/p;", "Lin0/g;", "feature_payments_social_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferOnlyChatScreen extends ViewController<n> implements a, g {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f79800a0 = {o0.f186429a.j(new h0(TransferOnlyChatScreen.class, "binding", "getBinding()Lcom/revolut/feature/payments/social/impl/databinding/ScreenTransferOnlyChatBinding;", 0))};
    public final TransferOnlyChatScreenContract$InputData K;
    public final c L;
    public final int M;
    public final Integer N;
    public final h O;
    public final ChatBubbleDelegate P;
    public final DefaultModeChatPaymentBubbleDelegate Q;
    public final ChatReactionDelegate R;
    public final FullScreenStateDelegate S;
    public final ActionWidgetDelegate T;
    public final TextDelegate U;
    public final AppTipDelegate V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    public TransferOnlyChatScreen(TransferOnlyChatScreenContract$InputData inputData, c holder) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.K = inputData;
        this.L = holder;
        this.M = R$layout.screen_transfer_only_chat;
        NavBarWithContainerBackground navBarWithContainerBackground = inputData.f79802b;
        this.N = (navBarWithContainerBackground == null || (navBarWithContainerBackground instanceof NavBarWithContainerBackground.TransparentBackground)) ? null : Integer.valueOf(R$style.UiKitTheme_TransparentNight);
        this.O = s.t(this, r0a.c.f);
        this.P = new ChatBubbleDelegate();
        this.Q = new DefaultModeChatPaymentBubbleDelegate();
        this.R = new ChatReactionDelegate();
        this.S = new FullScreenStateDelegate();
        this.T = new ActionWidgetDelegate();
        this.U = new TextDelegate();
        this.V = new AppTipDelegate();
        final int i = 0;
        this.W = w.y0(new Function0(this) { // from class: r0a.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferOnlyChatScreen f250727b;

            {
                this.f250727b = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TransferOnlyChatScreen transferOnlyChatScreen = this.f250727b;
                switch (i2) {
                    case 0:
                        AppTipDelegate appTipDelegate = transferOnlyChatScreen.V;
                        FrameLayout parent = transferOnlyChatScreen.d3().f210726g;
                        Intrinsics.checkNotNullExpressionValue(parent, "transferOnlyScreenSuggestionWrapper");
                        appTipDelegate.getClass();
                        Intrinsics.checkNotNullParameter(parent, "parent");
                        n1 n1Var = new n1(kotlin.jvm.internal.s.r(parent, com.revolut.core.ui_kit.R$layout.internal_delegate_app_tip));
                        n1Var.f.f0();
                        transferOnlyChatScreen.d3().f210726g.addView(n1Var.itemView);
                        return n1Var;
                    case 1:
                        KProperty[] kPropertyArr = TransferOnlyChatScreen.f79800a0;
                        TransferOnlyChatScreen transferOnlyChatScreen2 = this.f250727b;
                        return dli.f.a(transferOnlyChatScreen2, transferOnlyChatScreen2.d(), zhm.v.k(transferOnlyChatScreen2.Q, transferOnlyChatScreen2.P, new ListSubheaderDelegate(), new ListCellDelegate(), transferOnlyChatScreen2.R, transferOnlyChatScreen2.S, transferOnlyChatScreen2.T, new ChatBubbleLoadingDelegate(), new ChatTimestampBubbleDelegate(), new PlainTextWarningDelegate(), transferOnlyChatScreen2.U), R$id.transferOnlyScreen_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    case 2:
                        KProperty[] kPropertyArr2 = TransferOnlyChatScreen.f79800a0;
                        phm.a aVar = (phm.a) ue0.e.j(transferOnlyChatScreen.m2()).a().get(oz9.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", oz9.c.class, " is not found"));
                        }
                        oz9.c cVar = ((oz9.c) aVar2.b()).R;
                        TransferOnlyChatScreenContract$InputData transferOnlyChatScreenContract$InputData = transferOnlyChatScreen.K;
                        transferOnlyChatScreenContract$InputData.getClass();
                        yz9.c cVar2 = transferOnlyChatScreen.L;
                        cVar2.getClass();
                        return new oz9.e(cVar, transferOnlyChatScreen, transferOnlyChatScreenContract$InputData, cVar2);
                    default:
                        KProperty[] kPropertyArr3 = TransferOnlyChatScreen.f79800a0;
                        return (o) ((oz9.e) transferOnlyChatScreen.Y.getValue()).f231171w.get();
                }
            }
        });
        final int i2 = 1;
        this.X = w.y0(new Function0(this) { // from class: r0a.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferOnlyChatScreen f250727b;

            {
                this.f250727b = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TransferOnlyChatScreen transferOnlyChatScreen = this.f250727b;
                switch (i22) {
                    case 0:
                        AppTipDelegate appTipDelegate = transferOnlyChatScreen.V;
                        FrameLayout parent = transferOnlyChatScreen.d3().f210726g;
                        Intrinsics.checkNotNullExpressionValue(parent, "transferOnlyScreenSuggestionWrapper");
                        appTipDelegate.getClass();
                        Intrinsics.checkNotNullParameter(parent, "parent");
                        n1 n1Var = new n1(kotlin.jvm.internal.s.r(parent, com.revolut.core.ui_kit.R$layout.internal_delegate_app_tip));
                        n1Var.f.f0();
                        transferOnlyChatScreen.d3().f210726g.addView(n1Var.itemView);
                        return n1Var;
                    case 1:
                        KProperty[] kPropertyArr = TransferOnlyChatScreen.f79800a0;
                        TransferOnlyChatScreen transferOnlyChatScreen2 = this.f250727b;
                        return dli.f.a(transferOnlyChatScreen2, transferOnlyChatScreen2.d(), zhm.v.k(transferOnlyChatScreen2.Q, transferOnlyChatScreen2.P, new ListSubheaderDelegate(), new ListCellDelegate(), transferOnlyChatScreen2.R, transferOnlyChatScreen2.S, transferOnlyChatScreen2.T, new ChatBubbleLoadingDelegate(), new ChatTimestampBubbleDelegate(), new PlainTextWarningDelegate(), transferOnlyChatScreen2.U), R$id.transferOnlyScreen_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    case 2:
                        KProperty[] kPropertyArr2 = TransferOnlyChatScreen.f79800a0;
                        phm.a aVar = (phm.a) ue0.e.j(transferOnlyChatScreen.m2()).a().get(oz9.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", oz9.c.class, " is not found"));
                        }
                        oz9.c cVar = ((oz9.c) aVar2.b()).R;
                        TransferOnlyChatScreenContract$InputData transferOnlyChatScreenContract$InputData = transferOnlyChatScreen.K;
                        transferOnlyChatScreenContract$InputData.getClass();
                        yz9.c cVar2 = transferOnlyChatScreen.L;
                        cVar2.getClass();
                        return new oz9.e(cVar, transferOnlyChatScreen, transferOnlyChatScreenContract$InputData, cVar2);
                    default:
                        KProperty[] kPropertyArr3 = TransferOnlyChatScreen.f79800a0;
                        return (o) ((oz9.e) transferOnlyChatScreen.Y.getValue()).f231171w.get();
                }
            }
        });
        final int i3 = 2;
        this.Y = w.y0(new Function0(this) { // from class: r0a.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferOnlyChatScreen f250727b;

            {
                this.f250727b = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TransferOnlyChatScreen transferOnlyChatScreen = this.f250727b;
                switch (i22) {
                    case 0:
                        AppTipDelegate appTipDelegate = transferOnlyChatScreen.V;
                        FrameLayout parent = transferOnlyChatScreen.d3().f210726g;
                        Intrinsics.checkNotNullExpressionValue(parent, "transferOnlyScreenSuggestionWrapper");
                        appTipDelegate.getClass();
                        Intrinsics.checkNotNullParameter(parent, "parent");
                        n1 n1Var = new n1(kotlin.jvm.internal.s.r(parent, com.revolut.core.ui_kit.R$layout.internal_delegate_app_tip));
                        n1Var.f.f0();
                        transferOnlyChatScreen.d3().f210726g.addView(n1Var.itemView);
                        return n1Var;
                    case 1:
                        KProperty[] kPropertyArr = TransferOnlyChatScreen.f79800a0;
                        TransferOnlyChatScreen transferOnlyChatScreen2 = this.f250727b;
                        return dli.f.a(transferOnlyChatScreen2, transferOnlyChatScreen2.d(), zhm.v.k(transferOnlyChatScreen2.Q, transferOnlyChatScreen2.P, new ListSubheaderDelegate(), new ListCellDelegate(), transferOnlyChatScreen2.R, transferOnlyChatScreen2.S, transferOnlyChatScreen2.T, new ChatBubbleLoadingDelegate(), new ChatTimestampBubbleDelegate(), new PlainTextWarningDelegate(), transferOnlyChatScreen2.U), R$id.transferOnlyScreen_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    case 2:
                        KProperty[] kPropertyArr2 = TransferOnlyChatScreen.f79800a0;
                        phm.a aVar = (phm.a) ue0.e.j(transferOnlyChatScreen.m2()).a().get(oz9.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", oz9.c.class, " is not found"));
                        }
                        oz9.c cVar = ((oz9.c) aVar2.b()).R;
                        TransferOnlyChatScreenContract$InputData transferOnlyChatScreenContract$InputData = transferOnlyChatScreen.K;
                        transferOnlyChatScreenContract$InputData.getClass();
                        yz9.c cVar2 = transferOnlyChatScreen.L;
                        cVar2.getClass();
                        return new oz9.e(cVar, transferOnlyChatScreen, transferOnlyChatScreenContract$InputData, cVar2);
                    default:
                        KProperty[] kPropertyArr3 = TransferOnlyChatScreen.f79800a0;
                        return (o) ((oz9.e) transferOnlyChatScreen.Y.getValue()).f231171w.get();
                }
            }
        });
        final int i5 = 3;
        this.Z = w.y0(new Function0(this) { // from class: r0a.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferOnlyChatScreen f250727b;

            {
                this.f250727b = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                TransferOnlyChatScreen transferOnlyChatScreen = this.f250727b;
                switch (i22) {
                    case 0:
                        AppTipDelegate appTipDelegate = transferOnlyChatScreen.V;
                        FrameLayout parent = transferOnlyChatScreen.d3().f210726g;
                        Intrinsics.checkNotNullExpressionValue(parent, "transferOnlyScreenSuggestionWrapper");
                        appTipDelegate.getClass();
                        Intrinsics.checkNotNullParameter(parent, "parent");
                        n1 n1Var = new n1(kotlin.jvm.internal.s.r(parent, com.revolut.core.ui_kit.R$layout.internal_delegate_app_tip));
                        n1Var.f.f0();
                        transferOnlyChatScreen.d3().f210726g.addView(n1Var.itemView);
                        return n1Var;
                    case 1:
                        KProperty[] kPropertyArr = TransferOnlyChatScreen.f79800a0;
                        TransferOnlyChatScreen transferOnlyChatScreen2 = this.f250727b;
                        return dli.f.a(transferOnlyChatScreen2, transferOnlyChatScreen2.d(), zhm.v.k(transferOnlyChatScreen2.Q, transferOnlyChatScreen2.P, new ListSubheaderDelegate(), new ListCellDelegate(), transferOnlyChatScreen2.R, transferOnlyChatScreen2.S, transferOnlyChatScreen2.T, new ChatBubbleLoadingDelegate(), new ChatTimestampBubbleDelegate(), new PlainTextWarningDelegate(), transferOnlyChatScreen2.U), R$id.transferOnlyScreen_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    case 2:
                        KProperty[] kPropertyArr2 = TransferOnlyChatScreen.f79800a0;
                        phm.a aVar = (phm.a) ue0.e.j(transferOnlyChatScreen.m2()).a().get(oz9.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", oz9.c.class, " is not found"));
                        }
                        oz9.c cVar = ((oz9.c) aVar2.b()).R;
                        TransferOnlyChatScreenContract$InputData transferOnlyChatScreenContract$InputData = transferOnlyChatScreen.K;
                        transferOnlyChatScreenContract$InputData.getClass();
                        yz9.c cVar2 = transferOnlyChatScreen.L;
                        cVar2.getClass();
                        return new oz9.e(cVar, transferOnlyChatScreen, transferOnlyChatScreenContract$InputData, cVar2);
                    default:
                        KProperty[] kPropertyArr3 = TransferOnlyChatScreen.f79800a0;
                        return (o) ((oz9.e) transferOnlyChatScreen.Y.getValue()).f231171w.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2, reason: from getter */
    public final Integer getK() {
        return this.N;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        int iK;
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        BackgroundWallpaperView backgroundWallpaperView = d3().f210727h;
        NavBarWithContainerBackground navBarWithContainerBackground = uiState.f;
        j jVar = uiState.d;
        r0a.g gVar = uiState.f250745c;
        backgroundWallpaperView.setBackground(navBarWithContainerBackground, null);
        backgroundWallpaperView.setVisibility(navBarWithContainerBackground != null ? 0 : 8);
        NavBarWithAvatar navBarWithAvatar = d3().f210725c;
        navBarWithAvatar.setModel(uiState.f250744b);
        navBarWithAvatar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        SmallActionButton smallActionButton = d3().f;
        h4 h4Var = h4.ACCENT;
        smallActionButton.i(h4Var);
        Clause clause = gVar.f250730b;
        boolean z = gVar.d;
        boolean z3 = gVar.f250729a;
        smallActionButton.setText(clause);
        smallActionButton.setIcon(gVar.f250731c);
        smallActionButton.setVisibility(z3 ? 0 : 8);
        SmallActionButton smallActionButton2 = d3().e;
        smallActionButton2.i(h4Var);
        smallActionButton2.setText(gVar.e);
        smallActionButton2.setVisibility(z ? 0 : 8);
        if (z3 && z) {
            Context context = d3().e.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iK = kli.a.k(context, 4.0f);
        } else {
            iK = 0;
        }
        SmallActionButton transferOnlyScreenRequestButtonSmall = d3().e;
        Intrinsics.checkNotNullExpressionValue(transferOnlyScreenRequestButtonSmall, "transferOnlyScreenRequestButtonSmall");
        ViewGroup.LayoutParams layoutParams = transferOnlyScreenRequestButtonSmall.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginEnd(iK);
        transferOnlyScreenRequestButtonSmall.setLayoutParams(layoutParams2);
        SmallActionButton transferOnlyScreenSendButtonSmall = d3().f;
        Intrinsics.checkNotNullExpressionValue(transferOnlyScreenSendButtonSmall, "transferOnlyScreenSendButtonSmall");
        ViewGroup.LayoutParams layoutParams3 = transferOnlyScreenSendButtonSmall.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.setMarginStart(iK);
        transferOnlyScreenSendButtonSmall.setLayoutParams(layoutParams4);
        FooterTextView footerTextView = d3().f210724b;
        if (jVar != null) {
            footerTextView.setTextClause(jVar.f250738a);
        }
        footerTextView.setVisibility(jVar != null ? 0 : 8);
        AppTipUIModel appTipUIModel = uiState.e;
        if (appTipUIModel != null) {
            n1 n1Var = (n1) this.W.getValue();
            l1 l1Var = new l1(appTipUIModel);
            b.l(l1Var, 0, 0, 0, 0, null, false, 63);
            this.V.q(n1Var, l1Var, 0, f0.f322471a);
        }
        FrameLayout transferOnlyScreenSuggestionWrapper = d3().f210726g;
        Intrinsics.checkNotNullExpressionValue(transferOnlyScreenSuggestionWrapper, "transferOnlyScreenSuggestionWrapper");
        transferOnlyScreenSuggestionWrapper.setVisibility(appTipUIModel != null ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (oz9.e) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r06 = this.Y;
        ((oz9.e) r06.getValue()).getClass();
        ((m) ((oz9.e) r06.getValue()).k.get()).i(new f(16));
        d3().f210727h.setDefaultBackgroundColor(0);
        ScreenContentRecyclerView screenContentRecyclerView = d3().d;
        screenContentRecyclerView.setLayoutManager(new LinearLayoutManager(screenContentRecyclerView.getContext(), 1, true));
        screenContentRecyclerView.addItemDecoration(new o31.b());
        screenContentRecyclerView.setModel(i.a(screenContentRecyclerView.getF98530h(), false, false, 1));
        ViewCompat.setOnApplyWindowInsetsListener(screenContentRecyclerView, new k(13));
        pd.b.p(view, new TextLocalisedClause(R$string.payments_descriptor_chat_non_revolut_title, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithAvatar navBarWithAvatar = d3().f210725c;
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(navBarWithAvatar.f59338a), new d(this, continuation, 0), 3);
        r rVarMerge = r.merge(navBarWithAvatar.f59339b, navBarWithAvatar.f59340c, navBarWithAvatar.f59343j);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        ViewController.P2(this, rd0.e.b(rVarMerge), new d(this, continuation, 1), 3);
        DefaultModeChatPaymentBubbleDelegate defaultModeChatPaymentBubbleDelegate = this.Q;
        ihm.f fVar = defaultModeChatPaymentBubbleDelegate.d;
        ChatBubbleDelegate chatBubbleDelegate = this.P;
        r rVarMerge2 = r.merge(fVar, chatBubbleDelegate.f53806c);
        Intrinsics.checkNotNullExpressionValue(rVarMerge2, "merge(...)");
        ViewController.P2(this, rd0.e.b(w.a0(rVarMerge2, new qz9.b(26))), new r0a.e(this, continuation, 0), 3);
        ViewController.P2(this, l.y(defaultModeChatPaymentBubbleDelegate.f53864g, chatBubbleDelegate.f53809j, "merge(...)"), new r0a.f(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f.f56386h), new d(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(d3().e.f56386h), new d(this, continuation, 3), 3);
        ViewController.P2(this, rd0.e.b(this.T.f51589c.f121375b), new r0a.e(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.U.d), new r0a.e(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(d3().f210724b.f58608l), new r0a.e(this, continuation, 3), 3);
        AppTipDelegate appTipDelegate = this.V;
        ViewController.P2(this, y.x(appTipDelegate.d, appTipDelegate.f, "mergeWith(...)"), new r0a.e(this, continuation, 4), 3);
        ViewController.P2(this, rd0.e.b(appTipDelegate.f51654g), new r0a.e(this, continuation, 5), 3);
    }

    public final mz9.a d3() {
        ViewBinding value = this.O.getValue(this, f79800a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (mz9.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final r0a.o d() {
        return (r0a.o) this.Z.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.X.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }
}
