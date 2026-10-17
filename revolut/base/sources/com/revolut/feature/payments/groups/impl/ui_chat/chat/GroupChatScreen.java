package com.revolut.feature.payments.groups.impl.ui_chat.chat;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.b2;
import aw0.o9;
import blh.g0;
import bs9.b0;
import bs9.d;
import bs9.j;
import bs9.k;
import bs9.m;
import bs9.n;
import bs9.t;
import bs9.x;
import cli.o;
import cli.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.ViewUtils;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SuspiciousWidgetDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleLoadingDelegate;
import com.revolut.core.ui_kit.delegates.chat.DefaultModeChatPaymentBubbleDelegate;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.BackgroundWallpaperView;
import com.revolut.core.ui_kit.views.ChatInputView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.groups.impl.ui_chat.chat.GroupChatScreen;
import com.revolut.feature.payments.groups.impl.ui_chat.chat.GroupChatScreenContract$InputData;
import com.revolut.feature.payments.messaging.common.api.R$string;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.recyclerkit.layoutmanager.UIKitLinearLayoutManager;
import com.revolut.ui_kit.payments.R$id;
import com.revolut.ui_kit.payments.R$layout;
import com.youTransactor.uCube.rpc.Constants;
import cs9.e;
import efm.r;
import fp0.l;
import goi.i;
import ihm.f;
import ix0.l1;
import java.util.ArrayList;
import java.util.List;
import jo0.g;
import js9.b;
import koi.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import mx0.e4;
import mx0.s2;
import mx0.x3;
import or0.u;
import te0.w;
import vc.s;
import vkm.j2;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_chat/chat/GroupChatScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbs9/t;", "Ldli/a;", "Lbs9/x;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GroupChatScreen extends ViewController<t> implements dli.a {
    public static final /* synthetic */ KProperty[] j0 = {o0.f186429a.j(new h0(GroupChatScreen.class, "binding", "getBinding()Lcom/revolut/ui_kit/payments/databinding/ScreenGroupChatConversationBinding;", 0))};
    public final GroupChatScreenContract$InputData K;
    public final int L;
    public final Integer M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final FullScreenStateDelegate R;
    public final ChatBubbleDelegate S;
    public final DefaultModeChatPaymentBubbleDelegate T;
    public final ChatBubbleLoadingDelegate U;
    public final TextDelegate V;
    public final SuspiciousWidgetDelegate W;
    public final gu9.a X;
    public final LargeActionButtonDelegate Y;
    public final FixedTabsDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final RowDelegate f79330a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final RowLoadingDelegate f79331b0;
    public final RowDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final koi.h f79332d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final boolean f79333e0;
    public final dki.h f0;
    public int g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f79334h0;
    public final d i0;

    /* JADX WARN: Type inference failed for: r4v25, types: [java.lang.Object, kotlin.Lazy] */
    public GroupChatScreen(GroupChatScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_group_chat_conversation;
        NavBarWithContainerBackground navBarWithContainerBackground = inputData.f79337c;
        this.M = (navBarWithContainerBackground == null || (navBarWithContainerBackground instanceof NavBarWithContainerBackground.TransparentBackground)) ? null : Integer.valueOf(R$style.UiKitTheme_TransparentNight);
        this.N = s.t(this, bs9.h.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: bs9.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupChatScreen f18100b;

            {
                this.f18100b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                GroupChatScreen groupChatScreen = this.f18100b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = GroupChatScreen.j0;
                        GroupChatScreen groupChatScreen2 = this.f18100b;
                        qji.b bVarR1 = groupChatScreen2.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.payments.groups.impl.ui_chat.chat.di.GroupChatScreenComponentInjector");
                        kr9.a aVar = (kr9.a) bVarR1;
                        kr9.l lVar = aVar.f188677b;
                        kr9.a aVar2 = aVar.f188678c;
                        GroupChatScreenContract$InputData groupChatScreenContract$InputData = groupChatScreen2.K;
                        groupChatScreenContract$InputData.getClass();
                        ReactionsKeyboardView reactionsKeyboardView = (ReactionsKeyboardView) groupChatScreen2.f79334h0.getValue();
                        reactionsKeyboardView.getClass();
                        return new kr9.b(lVar, aVar2, new o9i.a(), new o9i.b(), new o9i.c(), groupChatScreen2, groupChatScreenContract$InputData, reactionsKeyboardView);
                    case 1:
                        KProperty[] kPropertyArr2 = GroupChatScreen.j0;
                        return (v) ((kr9.b) groupChatScreen.O.getValue()).Q.get();
                    case 2:
                        KProperty[] kPropertyArr3 = GroupChatScreen.j0;
                        GroupChatScreen groupChatScreen3 = this.f18100b;
                        return dli.f.a(groupChatScreen3, groupChatScreen3.d(), zhm.v.k(groupChatScreen3.S, groupChatScreen3.T, groupChatScreen3.U, groupChatScreen3.R, groupChatScreen3.V, groupChatScreen3.W, new ListCellDelegate()), R$id.groupChatConversation_recyclerView, new e(8), new koi.h(null, ((o) ((j2) ((com.revolut.feature.payments.groups.impl.ui_chat.chat.a) groupChatScreen3.d()).W.f22677a).getValue()).k, true, 1), null, 32);
                    default:
                        Integer num = groupChatScreen.M;
                        return new ReactionsKeyboardView(num != null ? l1.a(groupChatScreen.m2(), groupChatScreen.m2(), num.intValue()) : groupChatScreen.m2(), null);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: bs9.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupChatScreen f18100b;

            {
                this.f18100b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                GroupChatScreen groupChatScreen = this.f18100b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GroupChatScreen.j0;
                        GroupChatScreen groupChatScreen2 = this.f18100b;
                        qji.b bVarR1 = groupChatScreen2.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.payments.groups.impl.ui_chat.chat.di.GroupChatScreenComponentInjector");
                        kr9.a aVar = (kr9.a) bVarR1;
                        kr9.l lVar = aVar.f188677b;
                        kr9.a aVar2 = aVar.f188678c;
                        GroupChatScreenContract$InputData groupChatScreenContract$InputData = groupChatScreen2.K;
                        groupChatScreenContract$InputData.getClass();
                        ReactionsKeyboardView reactionsKeyboardView = (ReactionsKeyboardView) groupChatScreen2.f79334h0.getValue();
                        reactionsKeyboardView.getClass();
                        return new kr9.b(lVar, aVar2, new o9i.a(), new o9i.b(), new o9i.c(), groupChatScreen2, groupChatScreenContract$InputData, reactionsKeyboardView);
                    case 1:
                        KProperty[] kPropertyArr2 = GroupChatScreen.j0;
                        return (v) ((kr9.b) groupChatScreen.O.getValue()).Q.get();
                    case 2:
                        KProperty[] kPropertyArr3 = GroupChatScreen.j0;
                        GroupChatScreen groupChatScreen3 = this.f18100b;
                        return dli.f.a(groupChatScreen3, groupChatScreen3.d(), zhm.v.k(groupChatScreen3.S, groupChatScreen3.T, groupChatScreen3.U, groupChatScreen3.R, groupChatScreen3.V, groupChatScreen3.W, new ListCellDelegate()), R$id.groupChatConversation_recyclerView, new e(8), new koi.h(null, ((o) ((j2) ((com.revolut.feature.payments.groups.impl.ui_chat.chat.a) groupChatScreen3.d()).W.f22677a).getValue()).k, true, 1), null, 32);
                    default:
                        Integer num = groupChatScreen.M;
                        return new ReactionsKeyboardView(num != null ? l1.a(groupChatScreen.m2(), groupChatScreen.m2(), num.intValue()) : groupChatScreen.m2(), null);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: bs9.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupChatScreen f18100b;

            {
                this.f18100b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                GroupChatScreen groupChatScreen = this.f18100b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GroupChatScreen.j0;
                        GroupChatScreen groupChatScreen2 = this.f18100b;
                        qji.b bVarR1 = groupChatScreen2.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.payments.groups.impl.ui_chat.chat.di.GroupChatScreenComponentInjector");
                        kr9.a aVar = (kr9.a) bVarR1;
                        kr9.l lVar = aVar.f188677b;
                        kr9.a aVar2 = aVar.f188678c;
                        GroupChatScreenContract$InputData groupChatScreenContract$InputData = groupChatScreen2.K;
                        groupChatScreenContract$InputData.getClass();
                        ReactionsKeyboardView reactionsKeyboardView = (ReactionsKeyboardView) groupChatScreen2.f79334h0.getValue();
                        reactionsKeyboardView.getClass();
                        return new kr9.b(lVar, aVar2, new o9i.a(), new o9i.b(), new o9i.c(), groupChatScreen2, groupChatScreenContract$InputData, reactionsKeyboardView);
                    case 1:
                        KProperty[] kPropertyArr2 = GroupChatScreen.j0;
                        return (v) ((kr9.b) groupChatScreen.O.getValue()).Q.get();
                    case 2:
                        KProperty[] kPropertyArr3 = GroupChatScreen.j0;
                        GroupChatScreen groupChatScreen3 = this.f18100b;
                        return dli.f.a(groupChatScreen3, groupChatScreen3.d(), zhm.v.k(groupChatScreen3.S, groupChatScreen3.T, groupChatScreen3.U, groupChatScreen3.R, groupChatScreen3.V, groupChatScreen3.W, new ListCellDelegate()), R$id.groupChatConversation_recyclerView, new e(8), new koi.h(null, ((o) ((j2) ((com.revolut.feature.payments.groups.impl.ui_chat.chat.a) groupChatScreen3.d()).W.f22677a).getValue()).k, true, 1), null, 32);
                    default:
                        Integer num = groupChatScreen.M;
                        return new ReactionsKeyboardView(num != null ? l1.a(groupChatScreen.m2(), groupChatScreen.m2(), num.intValue()) : groupChatScreen.m2(), null);
                }
            }
        });
        this.R = new FullScreenStateDelegate();
        this.S = new ChatBubbleDelegate();
        this.T = new DefaultModeChatPaymentBubbleDelegate();
        this.U = new ChatBubbleLoadingDelegate();
        this.V = new TextDelegate();
        this.W = new SuspiciousWidgetDelegate();
        this.X = new gu9.a();
        this.Y = new LargeActionButtonDelegate();
        this.Z = new FixedTabsDelegate();
        this.f79330a0 = new RowDelegate(null, null, 7);
        this.f79331b0 = new RowLoadingDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.c0 = rowDelegate;
        c cVar = new c(0);
        cVar.a(rowDelegate);
        koi.h hVar = new koi.h(cVar, false, false, 4);
        this.f79332d0 = hVar;
        this.f79333e0 = ((Boolean) g.G.getValue()).booleanValue();
        this.f0 = new dki.h(hVar);
        final int i5 = 3;
        this.f79334h0 = w.y0(new Function0(this) { // from class: bs9.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupChatScreen f18100b;

            {
                this.f18100b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                GroupChatScreen groupChatScreen = this.f18100b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GroupChatScreen.j0;
                        GroupChatScreen groupChatScreen2 = this.f18100b;
                        qji.b bVarR1 = groupChatScreen2.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.payments.groups.impl.ui_chat.chat.di.GroupChatScreenComponentInjector");
                        kr9.a aVar = (kr9.a) bVarR1;
                        kr9.l lVar = aVar.f188677b;
                        kr9.a aVar2 = aVar.f188678c;
                        GroupChatScreenContract$InputData groupChatScreenContract$InputData = groupChatScreen2.K;
                        groupChatScreenContract$InputData.getClass();
                        ReactionsKeyboardView reactionsKeyboardView = (ReactionsKeyboardView) groupChatScreen2.f79334h0.getValue();
                        reactionsKeyboardView.getClass();
                        return new kr9.b(lVar, aVar2, new o9i.a(), new o9i.b(), new o9i.c(), groupChatScreen2, groupChatScreenContract$InputData, reactionsKeyboardView);
                    case 1:
                        KProperty[] kPropertyArr2 = GroupChatScreen.j0;
                        return (v) ((kr9.b) groupChatScreen.O.getValue()).Q.get();
                    case 2:
                        KProperty[] kPropertyArr3 = GroupChatScreen.j0;
                        GroupChatScreen groupChatScreen3 = this.f18100b;
                        return dli.f.a(groupChatScreen3, groupChatScreen3.d(), zhm.v.k(groupChatScreen3.S, groupChatScreen3.T, groupChatScreen3.U, groupChatScreen3.R, groupChatScreen3.V, groupChatScreen3.W, new ListCellDelegate()), R$id.groupChatConversation_recyclerView, new e(8), new koi.h(null, ((o) ((j2) ((com.revolut.feature.payments.groups.impl.ui_chat.chat.a) groupChatScreen3.d()).W.f22677a).getValue()).k, true, 1), null, 32);
                    default:
                        Integer num = groupChatScreen.M;
                        return new ReactionsKeyboardView(num != null ? l1.a(groupChatScreen.m2(), groupChatScreen.m2(), num.intValue()) : groupChatScreen.m2(), null);
                }
            }
        });
        this.i0 = new d(this, 2);
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2, reason: from getter */
    public final Integer getM() {
        return this.M;
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        x uiState = (x) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        bs9.w wVar = qVar instanceof bs9.w ? (bs9.w) qVar : null;
        if (wVar != null) {
            bs9.q qVar2 = wVar.f18131a;
            RecyclerView.LayoutManager layoutManager = e3().f11259j.getLayoutManager();
            UIKitLinearLayoutManager uIKitLinearLayoutManager = layoutManager instanceof UIKitLinearLayoutManager ? (UIKitLinearLayoutManager) layoutManager : null;
            if (uIKitLinearLayoutManager != null) {
                boolean z = qVar2 == bs9.q.REVERSED_CONTENT;
                if (uIKitLinearLayoutManager.isLayoutReversed() != z) {
                    uIKitLinearLayoutManager.setReverseLayout(z);
                }
                d3(qVar2);
            }
        }
        dli.a.z0(uiState);
        Clause clause = uiState.f;
        NavBarWithContainerBackground navBarWithContainerBackground = uiState.f18136h;
        b bVar = uiState.f18133b;
        AppCompatTextView groupChatConversationDisclaimerView = e3().e;
        Intrinsics.checkNotNullExpressionValue(groupChatConversationDisclaimerView, "groupChatConversationDisclaimerView");
        if (clause != null) {
            hx7.b.d(groupChatConversationDisclaimerView, new v01.b(ty0.c.a(jh.d.f(m2()).b0(), clause, m2(), null, null, null, null, Constants.TAG_FC_SPEED_MODE), R$attr.uikit_colorGreyTone50, "R_Regular", 14, 104));
            groupChatConversationDisclaimerView.setVisibility(0);
        } else {
            groupChatConversationDisclaimerView.setVisibility(8);
        }
        SmallActionButton groupChatConversationButtonPrimary = e3().f11255b;
        Intrinsics.checkNotNullExpressionValue(groupChatConversationButtonPrimary, "groupChatConversationButtonPrimary");
        js9.a aVar = bVar.f178164a;
        groupChatConversationButtonPrimary.setVisibility(aVar != null ? 0 : 8);
        if (aVar != null) {
            groupChatConversationButtonPrimary.setText(aVar.f178163b);
            groupChatConversationButtonPrimary.setIcon(aVar.f178162a);
        }
        SmallActionButton groupChatConversationButtonSecondary = e3().f11256c;
        Intrinsics.checkNotNullExpressionValue(groupChatConversationButtonSecondary, "groupChatConversationButtonSecondary");
        js9.a aVar2 = bVar.f178165b;
        groupChatConversationButtonSecondary.setVisibility(aVar2 != null ? 0 : 8);
        if (aVar2 != null) {
            groupChatConversationButtonSecondary.setText(aVar2.f178163b);
            groupChatConversationButtonSecondary.setIcon(aVar2.f178162a);
        }
        cs9.a aVar3 = uiState.f18134c;
        ChatInputView chatInputView = e3().f11257g;
        boolean z3 = aVar3.f108456b;
        boolean z4 = aVar3.f108457c;
        chatInputView.setVisibility(z3 ? 0 : 8);
        chatInputView.setEnabled(z4);
        if (z4) {
            chatInputView.setInputState(uiState.f18137j);
        } else {
            m70.a.c(t0.f186434a);
            chatInputView.setInput(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        }
        chatInputView.setInputActions(v.l(aVar3.d));
        e eVar = aVar3.e;
        if (eVar.equals(cs9.c.f108458a)) {
            e3().f.setIcon(new ResourceImage(R$drawable.uikit_icn_20_keyboard_sticker, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
            SmallActionButton groupChatConversationFirstSmallButton = e3().f;
            Intrinsics.checkNotNullExpressionValue(groupChatConversationFirstSmallButton, "groupChatConversationFirstSmallButton");
            groupChatConversationFirstSmallButton.setVisibility(0);
        } else {
            if (!eVar.equals(cs9.d.f108459a)) {
                throw new NoWhenBranchMatchedException();
            }
            SmallActionButton groupChatConversationFirstSmallButton2 = e3().f;
            Intrinsics.checkNotNullExpressionValue(groupChatConversationFirstSmallButton2, "groupChatConversationFirstSmallButton");
            groupChatConversationFirstSmallButton2.setVisibility(8);
        }
        int i = uiState.d;
        if (i != this.g0) {
            this.g0 = i;
            ScreenContentRecyclerView groupChatConversationRecyclerView = e3().f11259j;
            Intrinsics.checkNotNullExpressionValue(groupChatConversationRecyclerView, "groupChatConversationRecyclerView");
            tw0.x.d(groupChatConversationRecyclerView);
        }
        ConstraintLayout groupChatConversationButtonsContainer = e3().d;
        Intrinsics.checkNotNullExpressionValue(groupChatConversationButtonsContainer, "groupChatConversationButtonsContainer");
        groupChatConversationButtonsContainer.setVisibility(aVar3.f108455a ? 0 : 8);
        e3().i.setModel(uiState.e);
        BackgroundWallpaperView backgroundWallpaperView = e3().f11260l;
        backgroundWallpaperView.setBackground(navBarWithContainerBackground, null);
        backgroundWallpaperView.setVisibility(navBarWithContainerBackground != null ? 0 : 8);
        ArrayList items = uiState.i;
        ScreenContentRecyclerView pickerView = e3().f11258h;
        Intrinsics.checkNotNullExpressionValue(pickerView, "groupChatConversationMentionPicker");
        dki.h hVar = this.f0;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(pickerView, "pickerView");
        Intrinsics.checkNotNullParameter(items, "items");
        boolean zIsEmpty = items.isEmpty();
        boolean z6 = !zIsEmpty;
        if (!zIsEmpty) {
            ((koi.h) hVar.f115543c).c(items);
        }
        if (z6 == hVar.f115542b) {
            return;
        }
        hVar.f115542b = z6;
        float f = pickerView.getResources().getDisplayMetrics().density * 48.0f;
        if (zIsEmpty) {
            pickerView.animate().cancel();
            pickerView.animate().alpha(BitmapDescriptorFactory.HUE_RED).translationY(f).setDuration(200L).withEndAction(new l(pickerView, 8)).start();
        } else {
            pickerView.animate().cancel();
            pickerView.setVisibility(0);
            pickerView.animate().alpha(1.0f).translationY(BitmapDescriptorFactory.HUE_RED).setDuration(200L).start();
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        a aVar = (a) d();
        aVar.A.c(aVar.J2().f18116a.f79285a);
        aVar.l2(new b0(aVar, null, 0), new yi5.b(26));
        return super.F2();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (kr9.b) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        View decorView = m2().getWindow().getDecorView();
        Intrinsics.h(decorView);
        u.a(decorView, this.i0);
        ViewUtils.requestApplyInsetsWhenAttached(decorView);
        ScreenContentRecyclerView screenContentRecyclerView = e3().f11259j;
        screenContentRecyclerView.setModel(i.a(screenContentRecyclerView.getF98530h(), false, false, 1));
        d3(bs9.q.REVERSED_CONTENT);
        ((j60.a) ((kr9.b) this.O.getValue()).k.get()).d(v.k(this.f79330a0, this.f79331b0, this.Y, this.Z));
        ChatInputView chatInputView = e3().f11257g;
        chatInputView.setHint(new TextLocalisedClause(R$string.social_payments_chat_input_hint, null, null, 14));
        chatInputView.setFixedState(e4.ONLY_TEXT);
        chatInputView.setBackground(null);
        ScreenContentRecyclerView screenContentRecyclerView2 = e3().f11259j;
        gu9.a aVar = this.X;
        screenContentRecyclerView2.setItemAnimator(aVar);
        d listener = new d(this, 0);
        aVar.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        aVar.f146896a = listener;
        e3().i.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        if (this.f79333e0) {
            BackgroundWallpaperView groupChatConversationWallpaperView = e3().f11260l;
            Intrinsics.checkNotNullExpressionValue(groupChatConversationWallpaperView, "groupChatConversationWallpaperView");
            ny0.i.e(groupChatConversationWallpaperView);
        }
        ScreenContentRecyclerView screenContentRecyclerView3 = e3().f11258h;
        Context context = screenContentRecyclerView3.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        UIKitLinearLayoutManager uIKitLinearLayoutManager = new UIKitLinearLayoutManager(context);
        uIKitLinearLayoutManager.f98539c = true;
        uIKitLinearLayoutManager.setReverseLayout(true);
        screenContentRecyclerView3.setLayoutManager(uIKitLinearLayoutManager);
        screenContentRecyclerView3.setModel(i.a(screenContentRecyclerView3.getF98530h(), false, false, 1));
        screenContentRecyclerView3.setItemAnimator(null);
        screenContentRecyclerView3.setAdapter(this.f79332d0);
        screenContentRecyclerView3.setClipToOutline(true);
        Context context2 = screenContentRecyclerView3.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        screenContentRecyclerView3.setOutlineProvider(new bs9.i(kli.a.l(context2, 20.0f)));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        View decorView = m2().getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        u.q(decorView, this.i0);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        ((a) d()).f79352x.f239841b.f189756a = null;
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(((a) d()).T), new k(this, continuation, 4), 3);
        ViewController.P2(this, rd0.e.b(((a) d()).V), new j(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(((a) d()).U), new k(this, continuation, 14), 3);
        RowDelegate rowDelegate = this.f79330a0;
        ViewController.P2(this, rd0.e.b(w.a0(rowDelegate.f53218h, new bs9.e(9))), new k(this, continuation, 15), 3);
        ViewController.P2(this, rd0.e.b(w.a0(rowDelegate.f53218h, new bs9.e(3))), new k(this, continuation, 16), 3);
        ViewController.P2(this, rd0.e.b(e3().f11255b.f56386h), new j(this, continuation, 5), 3);
        ViewController.P2(this, rd0.e.b(e3().f11256c.f56386h), new j(this, continuation, 6), 3);
        int i = 0;
        ViewController.P2(this, rd0.e.b(e3().f.f56386h), new j(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(e3().f11257g.M), new k(this, continuation, i), 3);
        r rVarFilter = e3().f11257g.K.filter(new g0(new d(this, 1), 26));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        ViewController.P2(this, rd0.e.b(rVarFilter), new j(this, continuation, 1), 3);
        ChatInputView chatInputView = e3().f11257g;
        r rVarDistinctUntilChanged = r.merge(chatInputView.getInput$ui_kit_components_release().f59127s.filter(new s2(new x3(chatInputView, 7), 9)), chatInputView.getInput$ui_kit_components_release().e()).map(new s2(chatInputView, 10)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        r rVarDistinctUntilChanged2 = rVarDistinctUntilChanged.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
        ViewController.P2(this, rd0.e.b(rVarDistinctUntilChanged2), new k(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(w.a0(((ReactionsKeyboardView) this.f79334h0.getValue()).I(), new bs9.e(4))), new k(this, continuation, 2), 3);
        DefaultModeChatPaymentBubbleDelegate defaultModeChatPaymentBubbleDelegate = this.T;
        f fVar = defaultModeChatPaymentBubbleDelegate.e;
        ChatBubbleDelegate chatBubbleDelegate = this.S;
        r map = r.merge(fVar, chatBubbleDelegate.e).filter(new g0(new bs9.e(5), 27)).map(new g0(new bs9.e(6), 28));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        ViewController.P2(this, rd0.e.b(map), new k(this, continuation, 3), 3);
        r rVarMerge = r.merge(defaultModeChatPaymentBubbleDelegate.i, chatBubbleDelegate.f53812n);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        ViewController.P2(this, rd0.e.b(w.a0(rVarMerge, new bs9.e(7))), new k(this, continuation, 5), 3);
        r rVarMerge2 = r.merge(defaultModeChatPaymentBubbleDelegate.d, chatBubbleDelegate.f53806c);
        Intrinsics.checkNotNullExpressionValue(rVarMerge2, "merge(...)");
        ViewController.P2(this, rd0.e.b(w.a0(rVarMerge2, new bs9.e(10))), new k(this, continuation, 6), 3);
        r rVarMerge3 = r.merge(defaultModeChatPaymentBubbleDelegate.f, chatBubbleDelegate.f);
        Intrinsics.checkNotNullExpressionValue(rVarMerge3, "merge(...)");
        ViewController.P2(this, rd0.e.b(w.a0(rVarMerge3, new bs9.e(11))), new k(this, continuation, 7), 3);
        r map2 = r.merge(defaultModeChatPaymentBubbleDelegate.f53864g, chatBubbleDelegate.f53809j).filter(new g0(new bs9.e(12), 23)).map(new g0(new bq5.o0(29), 24));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        ViewController.P2(this, rd0.e.b(map2), new k(this, continuation, 8), 3);
        ViewController.P2(this, rd0.e.b(chatBubbleDelegate.d.f121375b), new k(this, continuation, 9), 3);
        ViewController.P2(this, rd0.e.b(w.a0(rowDelegate.f53220l, new bs9.e(0))), new k(this, continuation, 10), 3);
        ViewController.P2(this, rd0.e.b(this.Z.f52339c.f121375b), new k(this, continuation, 11), 3);
        ViewController.P2(this, rd0.e.b(this.Y.d.f121375b), new bs9.l(this, null), 3);
        r rVarFilter2 = this.V.f53530c.filter(new g0(new bs9.e(1), 25));
        Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
        ViewController.P2(this, rd0.e.b(rVarFilter2), new m(this, null), 3);
        FullScreenStateDelegate fullScreenStateDelegate = this.R;
        ViewController.P2(this, rd0.e.b(fullScreenStateDelegate.d), new k(this, continuation, 12), 3);
        ViewController.P2(this, rd0.e.b(fullScreenStateDelegate.f52371h.f121375b), new n(this, null), 3);
        ViewController.P2(this, rd0.e.b(w.a0(this.c0.f53218h, new bs9.e(2))), new k(this, continuation, 13), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().i.f59338a), null, new j(this, continuation, 3), 3);
        NavBarWithAvatar navBarWithAvatar = e3().i;
        r rVarMerge4 = r.merge(navBarWithAvatar.f59340c, navBarWithAvatar.f59339b, navBarWithAvatar.f59343j);
        Intrinsics.checkNotNullExpressionValue(rVarMerge4, "merge(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMerge4), null, new j(this, continuation, 4), 3);
        e3().e.setOnClickListener(new b2(this, 1));
        e3().f11256c.setLoadingButtonTag("SETTLE_UP_CTA_BUTTON_TAG");
        a aVar = (a) d();
        aVar.getClass();
        aVar.l2(new b0(aVar, continuation, 1), new yi5.b(26));
    }

    public final void d3(bs9.q qVar) {
        dq0.b fVar;
        if (this.f79333e0) {
            Context context = e3().f11254a.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            float fL = kli.a.l(context, 30.0f);
            BackgroundWallpaperView groupChatConversationWallpaperView = e3().f11260l;
            Intrinsics.checkNotNullExpressionValue(groupChatConversationWallpaperView, "groupChatConversationWallpaperView");
            ViewGroup.LayoutParams layoutParams = groupChatConversationWallpaperView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = -((int) fL);
            groupChatConversationWallpaperView.setLayoutParams(layoutParams2);
            int i = bs9.g.f18101a[qVar.ordinal()];
            if (i == 1) {
                ScreenContentRecyclerView groupChatConversationRecyclerView = e3().f11259j;
                Intrinsics.checkNotNullExpressionValue(groupChatConversationRecyclerView, "groupChatConversationRecyclerView");
                fVar = new dq0.f(groupChatConversationRecyclerView, true);
            } else if (i == 2) {
                ScreenContentRecyclerView groupChatConversationRecyclerView2 = e3().f11259j;
                Intrinsics.checkNotNullExpressionValue(groupChatConversationRecyclerView2, "groupChatConversationRecyclerView");
                fVar = new dq0.a(groupChatConversationRecyclerView2, 0.33f);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                ScreenContentRecyclerView groupChatConversationRecyclerView3 = e3().f11259j;
                Intrinsics.checkNotNullExpressionValue(groupChatConversationRecyclerView3, "groupChatConversationRecyclerView");
                fVar = new dq0.a(groupChatConversationRecyclerView3, BitmapDescriptorFactory.HUE_RED);
            }
            AppCompatTextView groupChatConversationDisclaimerView = e3().e;
            Intrinsics.checkNotNullExpressionValue(groupChatConversationDisclaimerView, "groupChatConversationDisclaimerView");
            dq0.f fVar2 = new dq0.f(groupChatConversationDisclaimerView, false);
            ConstraintLayout groupChatConversationButtonsContainer = e3().d;
            Intrinsics.checkNotNullExpressionValue(groupChatConversationButtonsContainer, "groupChatConversationButtonsContainer");
            dq0.f fVar3 = new dq0.f(groupChatConversationButtonsContainer, false);
            ScreenContentRecyclerView groupChatConversationMentionPicker = e3().f11258h;
            Intrinsics.checkNotNullExpressionValue(groupChatConversationMentionPicker, "groupChatConversationMentionPicker");
            dq0.f fVar4 = new dq0.f(groupChatConversationMentionPicker, false);
            ChatInputView groupChatConversationInputView = e3().f11257g;
            Intrinsics.checkNotNullExpressionValue(groupChatConversationInputView, "groupChatConversationInputView");
            dq0.f fVar5 = new dq0.f(groupChatConversationInputView, false);
            BackgroundWallpaperView groupChatConversationWallpaperView2 = e3().f11260l;
            Intrinsics.checkNotNullExpressionValue(groupChatConversationWallpaperView2, "groupChatConversationWallpaperView");
            kji.a.a(this, new dq0.b[]{fVar, fVar2, fVar3, fVar4, fVar5, new dq0.e(groupChatConversationWallpaperView2, fL)});
        }
    }

    public final ayl.a e3() {
        ViewBinding value = this.N.getValue(this, j0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ayl.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final bs9.v d() {
        return (bs9.v) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
