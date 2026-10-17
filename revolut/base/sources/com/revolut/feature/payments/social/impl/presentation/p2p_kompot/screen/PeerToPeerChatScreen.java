package com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import aw0.j8;
import aw0.o9;
import cli.o;
import cli.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.ViewUtils;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.ChatTimestampBubbleDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleLoadingDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatReactionDelegate;
import com.revolut.core.ui_kit.delegates.chat.DefaultModeChatPaymentBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.TransparentModeChatPaymentBubbleDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.BackgroundWallpaperView;
import com.revolut.core.ui_kit.views.ChatInputView;
import com.revolut.core.ui_kit.views.legacy.LegacyButtonContainerConstraintLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.social.impl.R$string;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.PeerToPeerChatScreen;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.PeerToPeerChatScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.ui_kit.payments.R$id;
import com.revolut.ui_kit.payments.R$layout;
import e0a.c0;
import hx0.k;
import in0.g;
import ip0.y10;
import ix0.l1;
import java.util.List;
import k50.f2;
import koi.h;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import ms0.h4;
import te0.w;
import tw0.x;
import vc.s;
import vz9.f;
import vz9.i;
import vz9.j;
import vz9.l;
import zhm.v;
import zmj.n0;
import zul.l0;
import zz9.n;
import zz9.r;
import zz9.u;
import zz9.y;
import zz9.z;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/social/impl/presentation/p2p_kompot/screen/PeerToPeerChatScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lzz9/u;", "Ldli/a;", "Lzz9/z;", "Lin0/g;", "feature_payments_social_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PeerToPeerChatScreen extends ViewController<u> implements dli.a, g {
    public static final /* synthetic */ KProperty[] l0 = {o0.f186429a.j(new h0(PeerToPeerChatScreen.class, "binding", "getBinding()Lcom/revolut/ui_kit/payments/databinding/ScreenPeerToPeerChatBinding;", 0))};
    public final PeerToPeerChatScreenContract$InputData K;
    public final ChatBubbleDelegate L;
    public final DefaultModeChatPaymentBubbleDelegate M;
    public final TransparentModeChatPaymentBubbleDelegate N;
    public final ChatReactionDelegate O;
    public final FullScreenStateDelegate P;
    public final FullScreenStateDelegate Q;
    public final TextDelegate R;
    public final h S;
    public final RowDelegate T;
    public final LargeActionButtonDelegate U;
    public final TwinHorizontalButtonDelegate V;
    public final PlainTextWarningDelegate W;
    public final h X;
    public final int Y;
    public final Integer Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f79762a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final ao.h f79763b0;
    public boolean c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final boolean f79764d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f79765e0;
    public final f2 f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final zz9.a f79766h0;
    public final gu9.a i0;
    public final Object j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Object f79767k0;

    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, kotlin.Lazy] */
    public PeerToPeerChatScreen(PeerToPeerChatScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new ChatBubbleDelegate();
        this.M = new DefaultModeChatPaymentBubbleDelegate();
        this.N = new TransparentModeChatPaymentBubbleDelegate();
        this.O = new ChatReactionDelegate();
        this.P = new FullScreenStateDelegate();
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.Q = fullScreenStateDelegate;
        this.R = new TextDelegate();
        final int i = 2;
        final int i2 = 0;
        final int i3 = 1;
        this.S = new h(new koi.c(v.k(fullScreenStateDelegate, new ListCellDelegate())), false, false, 6);
        Integer numValueOf = null;
        this.T = new RowDelegate(null, null, 7);
        this.U = new LargeActionButtonDelegate();
        this.V = new TwinHorizontalButtonDelegate();
        PlainTextWarningDelegate plainTextWarningDelegate = new PlainTextWarningDelegate();
        this.W = plainTextWarningDelegate;
        this.X = new h(new koi.c(zhm.u.c(plainTextWarningDelegate)), false, false, 6);
        this.Y = R$layout.screen_peer_to_peer_chat;
        NavBarWithContainerBackground navBarWithContainerBackground = inputData.d;
        if (navBarWithContainerBackground != null && !(navBarWithContainerBackground instanceof NavBarWithContainerBackground.TransparentBackground)) {
            numValueOf = Integer.valueOf(R$style.UiKitTheme_TransparentNight);
        }
        this.Z = numValueOf;
        this.f79762a0 = w.y0(new Function0(this) { // from class: zz9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PeerToPeerChatScreen f326600b;

            {
                this.f326600b = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i2;
                PeerToPeerChatScreen peerToPeerChatScreen = this.f326600b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = PeerToPeerChatScreen.l0;
                        PeerToPeerChatScreen peerToPeerChatScreen2 = this.f326600b;
                        return dli.f.a(peerToPeerChatScreen2, peerToPeerChatScreen2.R2(), zhm.v.k(peerToPeerChatScreen2.L, peerToPeerChatScreen2.M, peerToPeerChatScreen2.N, new ListSubheaderDelegate(), peerToPeerChatScreen2.O, peerToPeerChatScreen2.P, new ChatBubbleLoadingDelegate(), new ChatTimestampBubbleDelegate(), new PlainTextWarningDelegate(), new ListCellDelegate(), peerToPeerChatScreen2.R), R$id.chatScreen_recyclerView, new l0(22), new koi.h(null, false, true, 1), null, 32);
                    case 1:
                        Integer num = peerToPeerChatScreen.Z;
                        return new ReactionsKeyboardView(num != null ? l1.a(peerToPeerChatScreen.m2(), peerToPeerChatScreen.m2(), num.intValue()) : peerToPeerChatScreen.m2(), null);
                    case 2:
                        KProperty[] kPropertyArr2 = PeerToPeerChatScreen.l0;
                        qji.b bVarR1 = peerToPeerChatScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.di.PeerToPeerChatScreenInjector");
                        oz9.g gVar = (oz9.g) ((a0a.c) bVarR1).b().mo3808a(peerToPeerChatScreen);
                        PeerToPeerChatScreenContract$InputData peerToPeerChatScreenContract$InputData = peerToPeerChatScreen.K;
                        switch (gVar.f231175a) {
                            case 0:
                                peerToPeerChatScreenContract$InputData.getClass();
                                gVar.d = peerToPeerChatScreenContract$InputData;
                                break;
                            default:
                                peerToPeerChatScreenContract$InputData.getClass();
                                gVar.d = peerToPeerChatScreenContract$InputData;
                                break;
                        }
                        ReactionsKeyboardView reactionsKeyboardView = (ReactionsKeyboardView) peerToPeerChatScreen.g0.getValue();
                        switch (gVar.f231175a) {
                            case 0:
                                reactionsKeyboardView.getClass();
                                gVar.e = reactionsKeyboardView;
                                break;
                            default:
                                reactionsKeyboardView.getClass();
                                gVar.e = reactionsKeyboardView;
                                break;
                        }
                        return (oz9.h) gVar.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = PeerToPeerChatScreen.l0;
                        oz9.h hVar = (oz9.h) peerToPeerChatScreen.j0.getValue();
                        switch (hVar.f231178a) {
                            case 0:
                                return (x) hVar.f231187h0.get();
                            default:
                                return (x) hVar.f231187h0.get();
                        }
                }
            }
        });
        this.f79763b0 = s.t(this, zz9.e.f);
        this.f79764d0 = ((Boolean) jo0.g.G.getValue()).booleanValue();
        this.f0 = new f2(this, WindowInsetsCompat.Type.systemBars(), WindowInsetsCompat.Type.ime(), 1);
        this.g0 = w.y0(new Function0(this) { // from class: zz9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PeerToPeerChatScreen f326600b;

            {
                this.f326600b = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i3;
                PeerToPeerChatScreen peerToPeerChatScreen = this.f326600b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = PeerToPeerChatScreen.l0;
                        PeerToPeerChatScreen peerToPeerChatScreen2 = this.f326600b;
                        return dli.f.a(peerToPeerChatScreen2, peerToPeerChatScreen2.R2(), zhm.v.k(peerToPeerChatScreen2.L, peerToPeerChatScreen2.M, peerToPeerChatScreen2.N, new ListSubheaderDelegate(), peerToPeerChatScreen2.O, peerToPeerChatScreen2.P, new ChatBubbleLoadingDelegate(), new ChatTimestampBubbleDelegate(), new PlainTextWarningDelegate(), new ListCellDelegate(), peerToPeerChatScreen2.R), R$id.chatScreen_recyclerView, new l0(22), new koi.h(null, false, true, 1), null, 32);
                    case 1:
                        Integer num = peerToPeerChatScreen.Z;
                        return new ReactionsKeyboardView(num != null ? l1.a(peerToPeerChatScreen.m2(), peerToPeerChatScreen.m2(), num.intValue()) : peerToPeerChatScreen.m2(), null);
                    case 2:
                        KProperty[] kPropertyArr2 = PeerToPeerChatScreen.l0;
                        qji.b bVarR1 = peerToPeerChatScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.di.PeerToPeerChatScreenInjector");
                        oz9.g gVar = (oz9.g) ((a0a.c) bVarR1).b().mo3808a(peerToPeerChatScreen);
                        PeerToPeerChatScreenContract$InputData peerToPeerChatScreenContract$InputData = peerToPeerChatScreen.K;
                        switch (gVar.f231175a) {
                            case 0:
                                peerToPeerChatScreenContract$InputData.getClass();
                                gVar.d = peerToPeerChatScreenContract$InputData;
                                break;
                            default:
                                peerToPeerChatScreenContract$InputData.getClass();
                                gVar.d = peerToPeerChatScreenContract$InputData;
                                break;
                        }
                        ReactionsKeyboardView reactionsKeyboardView = (ReactionsKeyboardView) peerToPeerChatScreen.g0.getValue();
                        switch (gVar.f231175a) {
                            case 0:
                                reactionsKeyboardView.getClass();
                                gVar.e = reactionsKeyboardView;
                                break;
                            default:
                                reactionsKeyboardView.getClass();
                                gVar.e = reactionsKeyboardView;
                                break;
                        }
                        return (oz9.h) gVar.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = PeerToPeerChatScreen.l0;
                        oz9.h hVar = (oz9.h) peerToPeerChatScreen.j0.getValue();
                        switch (hVar.f231178a) {
                            case 0:
                                return (x) hVar.f231187h0.get();
                            default:
                                return (x) hVar.f231187h0.get();
                        }
                }
            }
        });
        this.f79766h0 = new zz9.a(this, 2);
        this.i0 = new gu9.a();
        this.j0 = w.y0(new Function0(this) { // from class: zz9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PeerToPeerChatScreen f326600b;

            {
                this.f326600b = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i;
                PeerToPeerChatScreen peerToPeerChatScreen = this.f326600b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = PeerToPeerChatScreen.l0;
                        PeerToPeerChatScreen peerToPeerChatScreen2 = this.f326600b;
                        return dli.f.a(peerToPeerChatScreen2, peerToPeerChatScreen2.R2(), zhm.v.k(peerToPeerChatScreen2.L, peerToPeerChatScreen2.M, peerToPeerChatScreen2.N, new ListSubheaderDelegate(), peerToPeerChatScreen2.O, peerToPeerChatScreen2.P, new ChatBubbleLoadingDelegate(), new ChatTimestampBubbleDelegate(), new PlainTextWarningDelegate(), new ListCellDelegate(), peerToPeerChatScreen2.R), R$id.chatScreen_recyclerView, new l0(22), new koi.h(null, false, true, 1), null, 32);
                    case 1:
                        Integer num = peerToPeerChatScreen.Z;
                        return new ReactionsKeyboardView(num != null ? l1.a(peerToPeerChatScreen.m2(), peerToPeerChatScreen.m2(), num.intValue()) : peerToPeerChatScreen.m2(), null);
                    case 2:
                        KProperty[] kPropertyArr2 = PeerToPeerChatScreen.l0;
                        qji.b bVarR1 = peerToPeerChatScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.di.PeerToPeerChatScreenInjector");
                        oz9.g gVar = (oz9.g) ((a0a.c) bVarR1).b().mo3808a(peerToPeerChatScreen);
                        PeerToPeerChatScreenContract$InputData peerToPeerChatScreenContract$InputData = peerToPeerChatScreen.K;
                        switch (gVar.f231175a) {
                            case 0:
                                peerToPeerChatScreenContract$InputData.getClass();
                                gVar.d = peerToPeerChatScreenContract$InputData;
                                break;
                            default:
                                peerToPeerChatScreenContract$InputData.getClass();
                                gVar.d = peerToPeerChatScreenContract$InputData;
                                break;
                        }
                        ReactionsKeyboardView reactionsKeyboardView = (ReactionsKeyboardView) peerToPeerChatScreen.g0.getValue();
                        switch (gVar.f231175a) {
                            case 0:
                                reactionsKeyboardView.getClass();
                                gVar.e = reactionsKeyboardView;
                                break;
                            default:
                                reactionsKeyboardView.getClass();
                                gVar.e = reactionsKeyboardView;
                                break;
                        }
                        return (oz9.h) gVar.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = PeerToPeerChatScreen.l0;
                        oz9.h hVar = (oz9.h) peerToPeerChatScreen.j0.getValue();
                        switch (hVar.f231178a) {
                            case 0:
                                return (x) hVar.f231187h0.get();
                            default:
                                return (x) hVar.f231187h0.get();
                        }
                }
            }
        });
        final int i5 = 3;
        this.f79767k0 = w.y0(new Function0(this) { // from class: zz9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PeerToPeerChatScreen f326600b;

            {
                this.f326600b = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i59 = i5;
                PeerToPeerChatScreen peerToPeerChatScreen = this.f326600b;
                switch (i59) {
                    case 0:
                        KProperty[] kPropertyArr = PeerToPeerChatScreen.l0;
                        PeerToPeerChatScreen peerToPeerChatScreen2 = this.f326600b;
                        return dli.f.a(peerToPeerChatScreen2, peerToPeerChatScreen2.R2(), zhm.v.k(peerToPeerChatScreen2.L, peerToPeerChatScreen2.M, peerToPeerChatScreen2.N, new ListSubheaderDelegate(), peerToPeerChatScreen2.O, peerToPeerChatScreen2.P, new ChatBubbleLoadingDelegate(), new ChatTimestampBubbleDelegate(), new PlainTextWarningDelegate(), new ListCellDelegate(), peerToPeerChatScreen2.R), R$id.chatScreen_recyclerView, new l0(22), new koi.h(null, false, true, 1), null, 32);
                    case 1:
                        Integer num = peerToPeerChatScreen.Z;
                        return new ReactionsKeyboardView(num != null ? l1.a(peerToPeerChatScreen.m2(), peerToPeerChatScreen.m2(), num.intValue()) : peerToPeerChatScreen.m2(), null);
                    case 2:
                        KProperty[] kPropertyArr2 = PeerToPeerChatScreen.l0;
                        qji.b bVarR1 = peerToPeerChatScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.di.PeerToPeerChatScreenInjector");
                        oz9.g gVar = (oz9.g) ((a0a.c) bVarR1).b().mo3808a(peerToPeerChatScreen);
                        PeerToPeerChatScreenContract$InputData peerToPeerChatScreenContract$InputData = peerToPeerChatScreen.K;
                        switch (gVar.f231175a) {
                            case 0:
                                peerToPeerChatScreenContract$InputData.getClass();
                                gVar.d = peerToPeerChatScreenContract$InputData;
                                break;
                            default:
                                peerToPeerChatScreenContract$InputData.getClass();
                                gVar.d = peerToPeerChatScreenContract$InputData;
                                break;
                        }
                        ReactionsKeyboardView reactionsKeyboardView = (ReactionsKeyboardView) peerToPeerChatScreen.g0.getValue();
                        switch (gVar.f231175a) {
                            case 0:
                                reactionsKeyboardView.getClass();
                                gVar.e = reactionsKeyboardView;
                                break;
                            default:
                                reactionsKeyboardView.getClass();
                                gVar.e = reactionsKeyboardView;
                                break;
                        }
                        return (oz9.h) gVar.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = PeerToPeerChatScreen.l0;
                        oz9.h hVar = (oz9.h) peerToPeerChatScreen.j0.getValue();
                        switch (hVar.f231178a) {
                            case 0:
                                return (x) hVar.f231187h0.get();
                            default:
                                return (x) hVar.f231187h0.get();
                        }
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2, reason: from getter */
    public final Integer getZ() {
        return this.Z;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l lVar;
        n nVar;
        int i;
        PeerToPeerChatScreen peerToPeerChatScreen;
        Integer numValueOf;
        z uiState = (z) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        y yVar = qVar instanceof y ? (y) qVar : null;
        if (yVar != null) {
            d3(yVar.f326635a);
        }
        dli.a.z0(uiState);
        NavBarWithAvatar navBarWithAvatar = e3().f11264g;
        j8 j8Var = uiState.f326638c;
        NavBarWithContainerBackground navBarWithContainerBackground = uiState.f326640h;
        navBarWithAvatar.setModel(j8Var);
        n nVar2 = uiState.d;
        fu9.a aVar = uiState.e;
        oz9.h hVar = (oz9.h) this.j0.getValue();
        switch (hVar.f231178a) {
            case 0:
                lVar = (l) hVar.i0.get();
                break;
            default:
                lVar = (l) hVar.i0.get();
                break;
        }
        LegacyButtonContainerConstraintLayout container = e3().e;
        Intrinsics.checkNotNullExpressionValue(container, "chatScreenChatContentContainer");
        FrameLayout bottomButtonsContainer = e3().f11262b;
        Intrinsics.checkNotNullExpressionValue(bottomButtonsContainer, "bottomButtonsContainer");
        SmallActionButton sendButton = e3().f11267l;
        Intrinsics.checkNotNullExpressionValue(sendButton, "chatScreenSendButtonSmall");
        SmallActionButton secondaryActionButton = e3().f11266j;
        Intrinsics.checkNotNullExpressionValue(secondaryActionButton, "chatScreenSecondaryActionButtonSmall");
        SmallActionButton firstSmallButton = e3().f;
        Intrinsics.checkNotNullExpressionValue(firstSmallButton, "chatScreenFirstSmallButton");
        SmallActionButton sendAmountButton = e3().k;
        Intrinsics.checkNotNullExpressionValue(sendAmountButton, "chatScreenSendAmountButtonTiny");
        vz9.e moneyActionBarState = nVar2.f326616a;
        boolean z = nVar2.f326618c;
        boolean z3 = nVar2.f326617b;
        ConstraintLayout actionButtonsContainer = e3().f11263c;
        Intrinsics.checkNotNullExpressionValue(actionButtonsContainer, "chatScreenActionButtonsContainer");
        boolean z4 = this.f79765e0;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(bottomButtonsContainer, "bottomButtonsContainer");
        Intrinsics.checkNotNullParameter(actionButtonsContainer, "actionButtonsContainer");
        Intrinsics.checkNotNullParameter(sendButton, "sendButton");
        Intrinsics.checkNotNullParameter(secondaryActionButton, "secondaryActionButton");
        Intrinsics.checkNotNullParameter(firstSmallButton, "firstSmallButton");
        Intrinsics.checkNotNullParameter(sendAmountButton, "sendAmountButton");
        Intrinsics.checkNotNullParameter(moneyActionBarState, "moneyActionBarState");
        Intrinsics.checkNotNullParameter(sendButton, "sendButton");
        Intrinsics.checkNotNullParameter(secondaryActionButton, "secondaryActionButton");
        Intrinsics.checkNotNullParameter(firstSmallButton, "firstSmallButton");
        Intrinsics.checkNotNullParameter(sendAmountButton, "sendAmountButton");
        Intrinsics.checkNotNullParameter(moneyActionBarState, "moneyActionBarState");
        boolean z6 = moneyActionBarState instanceof vz9.c;
        vz9.b bVar = vz9.b.f293423b;
        vz9.a aVar2 = vz9.a.f293422b;
        if (z6) {
            vz9.c cVar = (vz9.c) moneyActionBarState;
            sendButton.setEnabled(cVar.f293425c);
            sendButton.setVisibility(cVar.f293424b ? 0 : 8);
            nVar = nVar2;
            secondaryActionButton.setText(new TextLocalisedClause(R$string.social_payments_chat_request_button, null, null, 14));
            secondaryActionButton.setVisibility(cVar.d ? 0 : 8);
            j firstSmallButtonState = cVar.e;
            Intrinsics.checkNotNullParameter(firstSmallButtonState, "firstSmallButtonState");
            if (Intrinsics.f(firstSmallButtonState, i.f293431a)) {
                numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_arrow_split);
            } else if (Intrinsics.f(firstSmallButtonState, vz9.g.f293429a)) {
                numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_more);
            } else if (Intrinsics.f(firstSmallButtonState, f.f293428a)) {
                numValueOf = Integer.valueOf(R$drawable.uikit_icn_20_keyboard_sticker);
            } else {
                if (!Intrinsics.f(firstSmallButtonState, vz9.h.f293430a)) {
                    throw new NoWhenBranchMatchedException();
                }
                numValueOf = null;
            }
            ResourceImage resourceImage = numValueOf != null ? new ResourceImage(numValueOf.intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null;
            firstSmallButton.setVisibility(resourceImage != null ? 0 : 8);
            if (resourceImage != null) {
                firstSmallButton.setIcon(resourceImage);
            }
        } else {
            nVar = nVar2;
            if (moneyActionBarState instanceof vz9.d) {
                Clause clause = ((vz9.d) moneyActionBarState).f293426b;
                if (clause != null) {
                    sendAmountButton.setText(clause);
                }
            } else if (!Intrinsics.f(moneyActionBarState, aVar2) && !Intrinsics.f(moneyActionBarState, bVar)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        Class<?> cls = lVar.f293432a.getClass();
        Class<?> cls2 = moneyActionBarState.getClass();
        boolean z11 = moneyActionBarState.f293427a;
        if (cls == cls2 && lVar.f293432a.f293427a == z11) {
            i = 0;
        } else {
            vz9.e eVar = lVar.f293432a;
            boolean z12 = eVar.f293427a;
            boolean z29 = z12 && !z11;
            boolean z31 = !z12 && z11;
            if ((z29 || z31) && !(eVar instanceof vz9.b)) {
                ConstraintSet constraintSet = new ConstraintSet();
                constraintSet.clone(container);
                if (z31) {
                    constraintSet.connect(R$id.bottomButtonsContainer, 3, R$id.chatScreen_recyclerView, 4);
                    constraintSet.connect(R$id.bottomButtonsContainer, 4, R$id.inputView, 3);
                    constraintSet.connect(R$id.chatScreen_recyclerView, 4, R$id.bottomButtonsContainer, 3);
                    constraintSet.setVisibility(R$id.bottomButtonsContainer, 0);
                } else {
                    constraintSet.connect(R$id.bottomButtonsContainer, 3, R$id.inputView, 3);
                    constraintSet.clear(R$id.bottomButtonsContainer, 4);
                    constraintSet.connect(R$id.chatScreen_recyclerView, 4, R$id.inputView, 3);
                    constraintSet.setVisibility(R$id.bottomButtonsContainer, 4);
                }
                TransitionSet transitionSet = new TransitionSet();
                transitionSet.addTransition(new Fade(3).addTarget(bottomButtonsContainer));
                if (!z4) {
                    transitionSet.addTransition(new ChangeBounds());
                }
                transitionSet.setDuration(150L);
                TransitionManager.beginDelayedTransition(container, transitionSet);
                constraintSet.applyTo(container);
            } else {
                bottomButtonsContainer.setVisibility(z11 ? 0 : 8);
            }
            vz9.e eVar2 = lVar.f293432a;
            if (Intrinsics.f(eVar2, moneyActionBarState) || (eVar2 instanceof vz9.a) || (moneyActionBarState instanceof vz9.a)) {
                if (z11) {
                    Context context = bottomButtonsContainer.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    float fK = kli.a.k(context, 40.0f);
                    if (moneyActionBarState instanceof vz9.c) {
                        actionButtonsContainer.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                        i = 0;
                        actionButtonsContainer.setVisibility(0);
                        sendAmountButton.setTranslationY(fK);
                        sendAmountButton.setVisibility(4);
                    } else {
                        i = 0;
                        if (moneyActionBarState instanceof vz9.d) {
                            sendAmountButton.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                            sendAmountButton.setVisibility(0);
                            actionButtonsContainer.setTranslationY(fK);
                            actionButtonsContainer.setVisibility(4);
                        } else if (!moneyActionBarState.equals(aVar2) && !moneyActionBarState.equals(bVar)) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                lVar.f293432a = moneyActionBarState;
            } else {
                boolean z41 = moneyActionBarState instanceof vz9.d;
                Context context2 = actionButtonsContainer.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                float fK2 = kli.a.k(context2, 40.0f);
                if (z41) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(sendAmountButton, "translationY", BitmapDescriptorFactory.HUE_RED);
                    Intrinsics.h(objectAnimatorOfFloat);
                    objectAnimatorOfFloat.addListener(new k(sendAmountButton, fK2, 2));
                    Unit unit = Unit.f186387a;
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionButtonsContainer, "translationY", fK2);
                    Intrinsics.h(objectAnimatorOfFloat2);
                    objectAnimatorOfFloat2.addListener(new vt0.f(actionButtonsContainer, 1));
                    animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                    animatorSet.setDuration(150L).start();
                } else {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(sendAmountButton, "translationY", fK2);
                    Intrinsics.h(objectAnimatorOfFloat3);
                    objectAnimatorOfFloat3.addListener(new k(actionButtonsContainer, fK2, 3));
                    Unit unit2 = Unit.f186387a;
                    ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(actionButtonsContainer, "translationY", BitmapDescriptorFactory.HUE_RED);
                    Intrinsics.h(objectAnimatorOfFloat4);
                    objectAnimatorOfFloat4.addListener(new vt0.f(sendAmountButton, 2));
                    animatorSet2.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
                    animatorSet2.setDuration(150L).start();
                }
            }
            i = 0;
            lVar.f293432a = moneyActionBarState;
        }
        ChatInputView chatInputView = e3().f11270p;
        chatInputView.setVisibility(z3 ? i : 8);
        chatInputView.setEnabled(z);
        if (!z) {
            m70.a.c(t0.f186434a);
            chatInputView.setInput(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        }
        chatInputView.setInputActions(v.l(aVar.a()));
        if (nVar.d) {
            peerToPeerChatScreen = this;
            if (!peerToPeerChatScreen.c0) {
                chatInputView.c0();
                peerToPeerChatScreen.c0 = true;
            }
        } else {
            peerToPeerChatScreen = this;
        }
        View chatScreenBottomBackground = peerToPeerChatScreen.e3().d;
        Intrinsics.checkNotNullExpressionValue(chatScreenBottomBackground, "chatScreenBottomBackground");
        chatScreenBottomBackground.setVisibility(z3 ? i : 8);
        List list = uiState.f326637b;
        RecyclerView chatScreenTopAlignedRecyclerView = peerToPeerChatScreen.e3().f11268m;
        Intrinsics.checkNotNullExpressionValue(chatScreenTopAlignedRecyclerView, "chatScreenTopAlignedRecyclerView");
        chatScreenTopAlignedRecyclerView.setVisibility(!list.isEmpty() ? i : 8);
        peerToPeerChatScreen.S.c(list);
        if (uiState.f) {
            ScreenContentRecyclerView chatScreenRecyclerView = peerToPeerChatScreen.e3().f11265h;
            Intrinsics.checkNotNullExpressionValue(chatScreenRecyclerView, "chatScreenRecyclerView");
            x.d(chatScreenRecyclerView);
        }
        boolean z49 = uiState.f326639g;
        if (z49) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.payments_chat_fraud_warning_label, null, null, 14);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.payments_chat_fraud_warning_description_placeholder, zhm.u.c(new TextLocalisedClause(R$string.payments_chat_fraud_warning_description_settings, null, new Click(30, (Integer) null, (Object) null, "CHAT_WARNING_UNTRUSTED_MORE_INFO_ID", false), 10)), null, 12);
            mx0.d dVar = mx0.d.SEMIACCENT;
            sa saVar = new sa("WARNING_LIST_ID", (Clause) textLocalisedClause, (Clause) textLocalisedClause2, v.k(new ActionsView.Item("WARNING_ACTION_POSITIVE", dVar, false, null, null, new TextLocalisedClause(R$string.payments_chat_fraud_warning_action_positive, null, null, 14), null, null, null, null, false, null, null, null, null, 32668), new ActionsView.Item("WARNING_ACTION_NEGATIVE", dVar, false, null, null, new TextLocalisedClause(R$string.payments_chat_fraud_warning_action_negative, null, null, 14), null, null, null, null, false, null, null, null, null, 32668)), false, (Image) new ResourceImage(R$drawable.uikit_icn_24_exclamation_triangle, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorStatusWarning), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4032);
            yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
            peerToPeerChatScreen.X.c(zhm.u.c(saVar));
        }
        ScreenContentRecyclerView chatScreenWarning = peerToPeerChatScreen.e3().o;
        Intrinsics.checkNotNullExpressionValue(chatScreenWarning, "chatScreenWarning");
        chatScreenWarning.setVisibility(z49 ? i : 8);
        BackgroundWallpaperView backgroundWallpaperView = peerToPeerChatScreen.e3().f11269n;
        backgroundWallpaperView.setBackground(navBarWithContainerBackground, null);
        backgroundWallpaperView.setVisibility(navBarWithContainerBackground != null ? i : 8);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        c0 c0Var = ((d) R2()).u;
        c0Var.T2(new dz6.o(c0Var, c0Var.f121487n.f79768a, null, 10), new yi5.b(27));
        return super.F2();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (oz9.h) this.j0.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        j60.a aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        oz9.h hVar = (oz9.h) this.j0.getValue();
        switch (hVar.f231178a) {
            case 0:
                aVar = (j60.a) hVar.f231199y.get();
                break;
            default:
                aVar = (j60.a) hVar.f231199y.get();
                break;
        }
        aVar.d(v.k(this.T, this.U, this.V));
        e3().f11264g.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        SmallActionButton smallActionButton = e3().f11267l;
        smallActionButton.i(h4.ACCENT);
        smallActionButton.setText(new TextLocalisedClause(R$string.social_payments_chat_send_button, null, null, 14));
        smallActionButton.setIcon(new ResourceImage(R$drawable.uikit_icn_24_arrow_send, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        SmallActionButton smallActionButton2 = e3().f11266j;
        h4 h4Var = h4.SEMIACCENT;
        smallActionButton2.i(h4Var);
        smallActionButton2.setIcon(new ResourceImage(R$drawable.uikit_icn_24_arrow_request, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        e3().k.i(h4Var);
        e3().f.i(h4Var);
        ChatInputView chatInputView = e3().f11270p;
        chatInputView.setHint(new TextLocalisedClause(com.revolut.feature.payments.messaging.common.api.R$string.social_payments_chat_input_hint, null, null, 14));
        chatInputView.setStartIconAttr(Integer.valueOf(R$drawable.uikit_icn_24_chevron_down));
        chatInputView.setBackground(null);
        View decorView = m2().getWindow().getDecorView();
        Intrinsics.h(decorView);
        or0.u.a(decorView, this.f79766h0);
        ViewUtils.requestApplyInsetsWhenAttached(decorView);
        e3().o.setModel(goi.i.a(e3().o.getF98530h(), false, false, 1));
        ScreenContentRecyclerView screenContentRecyclerView = e3().f11265h;
        screenContentRecyclerView.setModel(goi.i.a(screenContentRecyclerView.getF98530h(), false, false, 1));
        d3(r.REVERSED_CONTENT);
        RecyclerView recyclerView = e3().f11268m;
        recyclerView.setLayoutManager(new LinearLayoutManager(m2(), 1, false));
        recyclerView.setAdapter(this.S);
        recyclerView.setItemAnimator(null);
        recyclerView.addItemDecoration(new o31.b());
        ScreenContentRecyclerView screenContentRecyclerView2 = e3().f11265h;
        gu9.a aVar2 = this.i0;
        screenContentRecyclerView2.setItemAnimator(aVar2);
        e3().f11269n.setDefaultBackgroundColor(0);
        if (this.f79764d0) {
            BackgroundWallpaperView chatScreenWallpaperView = e3().f11269n;
            Intrinsics.checkNotNullExpressionValue(chatScreenWallpaperView, "chatScreenWallpaperView");
            ny0.i.e(chatScreenWallpaperView);
        }
        ScreenContentRecyclerView screenContentRecyclerView3 = e3().o;
        screenContentRecyclerView3.setLayoutManager(new LinearLayoutManager(m2(), 1, false));
        screenContentRecyclerView3.setAdapter(this.X);
        screenContentRecyclerView3.setItemAnimator(null);
        screenContentRecyclerView3.addItemDecoration(new o31.b());
        zz9.a listener = new zz9.a(this, 1);
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        aVar2.f146896a = listener;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        View decorView = m2().getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        or0.u.q(decorView, this.f79766h0);
    }

    /* JADX WARN: Type inference failed for: r1v46, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        int i = 1;
        int i2 = 3;
        ViewController.P2(this, rd0.e.b(e3().f11264g.f59338a), new zz9.g(this, continuation, i), 3);
        efm.r rVarMerge = efm.r.merge(e3().f11264g.f59339b, e3().f11264g.f59340c, e3().f11264g.f59343j);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        int i3 = 2;
        ViewController.P2(this, rd0.e.b(rVarMerge), new zz9.g(this, continuation, i3), 3);
        PlainTextWarningDelegate plainTextWarningDelegate = this.W;
        ViewController.P2(this, rd0.e.b(plainTextWarningDelegate.d.f121375b), new zz9.l(this, null), 3);
        int i5 = 4;
        ViewController.P2(this, rd0.e.b(plainTextWarningDelegate.s()), new zz9.g(this, continuation, i5), 3);
        int i6 = 5;
        ViewController.P2(this, rd0.e.b(e3().f.f56386h), new zz9.g(this, continuation, i6), 3);
        int i21 = 6;
        ViewController.P2(this, rd0.e.b(e3().f11266j.f56386h), new zz9.g(this, continuation, i21), 3);
        int i22 = 7;
        ViewController.P2(this, rd0.e.b(e3().f11267l.f56386h), new zz9.g(this, continuation, i22), 3);
        ViewController.P2(this, rd0.e.b(e3().k.f56386h), new zz9.g(this, continuation, 8), 3);
        ViewController.P2(this, rd0.e.b(e3().f11270p.b0()), new zz9.f(this, continuation, 13), 3);
        int i32 = 0;
        ViewController.P2(this, rd0.e.b(e3().f11270p.S), new zz9.f(this, continuation, i32), 3);
        ViewController.P2(this, rd0.e.b(e3().f11270p.M), new zz9.f(this, continuation, i), 3);
        efm.r rVarFilter = e3().f11270p.K.filter(new zx0.b(new zz9.a(this, 0), 29));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        ViewController.P2(this, rd0.e.b(rVarFilter), new zz9.g(this, continuation, i32), 3);
        ViewController.P2(this, rd0.e.b(w.a0(((ReactionsKeyboardView) this.g0.getValue()).I(), new l0(24))), new zz9.f(this, continuation, i3), 3);
        ViewController.P2(this, h30.l.y(this.P.e, this.Q.e, "merge(...)"), new zz9.h(this, null), 3);
        ChatBubbleDelegate chatBubbleDelegate = this.L;
        ihm.f fVar = chatBubbleDelegate.f53806c;
        DefaultModeChatPaymentBubbleDelegate defaultModeChatPaymentBubbleDelegate = this.M;
        ihm.f fVar2 = defaultModeChatPaymentBubbleDelegate.d;
        TransparentModeChatPaymentBubbleDelegate transparentModeChatPaymentBubbleDelegate = this.N;
        efm.r rVarMerge2 = efm.r.merge(fVar, fVar2, transparentModeChatPaymentBubbleDelegate.d);
        Intrinsics.checkNotNullExpressionValue(rVarMerge2, "merge(...)");
        ViewController.P2(this, rd0.e.b(w.a0(rVarMerge2, new l0(25))), new zz9.f(this, continuation, i2), 3);
        efm.r rVarMerge3 = efm.r.merge(chatBubbleDelegate.f, defaultModeChatPaymentBubbleDelegate.f, transparentModeChatPaymentBubbleDelegate.f);
        Intrinsics.checkNotNullExpressionValue(rVarMerge3, "merge(...)");
        ViewController.P2(this, rd0.e.b(w.a0(rVarMerge3, new l0(26))), new zz9.f(this, continuation, i5), 3);
        efm.r map = efm.r.merge(chatBubbleDelegate.e, defaultModeChatPaymentBubbleDelegate.e, transparentModeChatPaymentBubbleDelegate.e).filter(new zz9.c(new l0(27))).map(new zz9.c(new l0(28)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        ViewController.P2(this, rd0.e.b(map), new zz9.f(this, continuation, i6), 3);
        efm.r rVarMerge4 = efm.r.merge(chatBubbleDelegate.f53809j, defaultModeChatPaymentBubbleDelegate.f53864g, transparentModeChatPaymentBubbleDelegate.f53864g);
        Intrinsics.checkNotNullExpressionValue(rVarMerge4, "merge(...)");
        ViewController.P2(this, rd0.e.b(w.a0(rVarMerge4, new l0(21))), new zz9.f(this, continuation, i21), 3);
        efm.r rVarMerge5 = efm.r.merge(chatBubbleDelegate.f53812n, defaultModeChatPaymentBubbleDelegate.i, transparentModeChatPaymentBubbleDelegate.i);
        Intrinsics.checkNotNullExpressionValue(rVarMerge5, "merge(...)");
        ViewController.P2(this, rd0.e.b(w.a0(rVarMerge5, new l0(23))), new zz9.f(this, continuation, i22), 3);
        ViewController.P2(this, rd0.e.b(this.T.f53218h), new zz9.i(this, null), 3);
        ViewController.P2(this, ((d) R2()).f79780r.f121509p, new n0(this, continuation, i), 3);
        d dVar = (d) R2();
        ViewController.P2(this, vkm.q.J(new zfd.e(dVar.f79781s.u, 10), ((e0a.i) dVar.v).f121502r), new zz9.g(this, continuation, i2), 3);
        ViewController.P2(this, new zfd.e(((d) R2()).f79781s.u, 9), new zz9.f(this, continuation, 8), 3);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.V;
        ViewController.P2(this, rd0.e.b(twinHorizontalButtonDelegate.d.f121375b), new zz9.f(this, continuation, 9), 3);
        ViewController.P2(this, rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), new zz9.f(this, continuation, 10), 3);
        ViewController.P2(this, rd0.e.b(this.U.d.f121375b), new zz9.j(this, null), 3);
        TextDelegate textDelegate = this.R;
        ViewController.P2(this, rd0.e.b(textDelegate.f53530c), new zz9.k(this, null), 3);
        ViewController.P2(this, rd0.e.b(textDelegate.d), new zz9.f(this, continuation, 11), 3);
        ViewController.P2(this, rd0.e.b(chatBubbleDelegate.d.f121375b), new zz9.f(this, continuation, 12), 3);
    }

    public final void d3(r rVar) {
        dq0.b fVar;
        if (this.f79764d0) {
            Context context = e3().f11261a.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            float fL = kli.a.l(context, 30.0f);
            BackgroundWallpaperView chatScreenWallpaperView = e3().f11269n;
            Intrinsics.checkNotNullExpressionValue(chatScreenWallpaperView, "chatScreenWallpaperView");
            ViewGroup.LayoutParams layoutParams = chatScreenWallpaperView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = -((int) fL);
            chatScreenWallpaperView.setLayoutParams(layoutParams2);
            int i = zz9.d.f326605a[rVar.ordinal()];
            if (i == 1) {
                ScreenContentRecyclerView chatScreenRecyclerView = e3().f11265h;
                Intrinsics.checkNotNullExpressionValue(chatScreenRecyclerView, "chatScreenRecyclerView");
                fVar = new dq0.f(chatScreenRecyclerView, true);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                ScreenContentRecyclerView chatScreenRecyclerView2 = e3().f11265h;
                Intrinsics.checkNotNullExpressionValue(chatScreenRecyclerView2, "chatScreenRecyclerView");
                fVar = new dq0.a(chatScreenRecyclerView2, 0.33f);
            }
            FrameLayout bottomButtonsContainer = e3().f11262b;
            Intrinsics.checkNotNullExpressionValue(bottomButtonsContainer, "bottomButtonsContainer");
            dq0.f fVar2 = new dq0.f(bottomButtonsContainer, false);
            View chatScreenBottomBackground = e3().d;
            Intrinsics.checkNotNullExpressionValue(chatScreenBottomBackground, "chatScreenBottomBackground");
            dq0.f fVar3 = new dq0.f(chatScreenBottomBackground, false);
            ChatInputView inputView = e3().f11270p;
            Intrinsics.checkNotNullExpressionValue(inputView, "inputView");
            dq0.f fVar4 = new dq0.f(inputView, false);
            BackgroundWallpaperView chatScreenWallpaperView2 = e3().f11269n;
            Intrinsics.checkNotNullExpressionValue(chatScreenWallpaperView2, "chatScreenWallpaperView");
            kji.a.a(this, new dq0.b[]{fVar, fVar2, fVar3, fVar4, this.f0, new dq0.e(chatScreenWallpaperView2, fL)});
        }
    }

    public final ayl.b e3() {
        ViewBinding value = this.f79763b0.getValue(this, l0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ayl.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final zz9.x R2() {
        return (zz9.x) this.f79767k0.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.Y;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.f79762a0.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }
}
