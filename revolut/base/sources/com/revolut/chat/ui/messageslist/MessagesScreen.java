package com.revolut.chat.ui.messageslist;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import anf.p;
import au0.x5;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.chat.domain.model.ChatEntryPoint;
import com.revolut.chat.domain.model.ChatFeed;
import com.revolut.chat.ui.messageslist.MessagesContract$InputData;
import com.revolut.chat.ui.messageslist.MessagesScreen;
import com.revolut.chat_core.R$id;
import com.revolut.chat_core.R$layout;
import com.revolut.chat_core.R$string;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.chat.background.AirChatBackgroundView;
import com.revolut.core.ui_kit.chat.prompt.ChatPromptView;
import com.revolut.core.ui_kit.chat.prompt.ChatSuggestionsBlockDelegate;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.ChatContextualChartDelegate;
import com.revolut.core.ui_kit.delegates.ChatItemsDelegate;
import com.revolut.core.ui_kit.delegates.ChatMessagesLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ChatTilesCollectionDelegate;
import com.revolut.core.ui_kit.delegates.ChatTimestampBubbleDelegate;
import com.revolut.core.ui_kit.delegates.ChatTooltipDelegate;
import com.revolut.core.ui_kit.delegates.ChatTravelPreviewDelegate;
import com.revolut.core.ui_kit.delegates.ContextualBarChartDelegate;
import com.revolut.core.ui_kit.delegates.ContextualLineChartDelegate;
import com.revolut.core.ui_kit.delegates.ContextualSegmentedBarDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RateEmojiDelegate;
import com.revolut.core.ui_kit.delegates.RateOneClickDelegate;
import com.revolut.core.ui_kit.delegates.RateOneClickLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TagDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatAttachmentBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatAttachmentGridBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatAttachmentListBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatCallBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatMessageActionsPanelDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatQuickLinkBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatTableDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatUncontainedMessageDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatVoiceMessageBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ShimmeringTextBubbleDelegate;
import com.revolut.core.ui_kit.gesture_control.VerticalSnapLayout;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ChatInputLayoutView;
import com.revolut.core.ui_kit.views.ChatInputView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.recyclerkit.layoutmanager.UIKitLinearLayoutManager;
import dli.c;
import dq0.b;
import dq0.f;
import efm.r;
import et0.z;
import goi.h;
import h30.t;
import ip0.g0;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import joe.e;
import k3k.l;
import k50.a2;
import k50.b2;
import k50.c2;
import k50.d2;
import k50.e2;
import k50.f2;
import k50.g;
import k50.g2;
import k50.h2;
import k50.j4;
import k50.l2;
import k50.r1;
import k50.s1;
import k50.s2;
import k50.u0;
import k50.u1;
import k50.v0;
import k50.w0;
import k50.w1;
import k50.x1;
import k50.y1;
import k50.z1;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import ms0.h4;
import no.k;
import no.m;
import ofm.q;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTimeZone;
import q50.o;
import te0.w;
import vc.s;
import vkm.j2;
import yhm.j;
import zab.x;
import zhm.u;
import zo0.d;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006:\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/chat/ui/messageslist/MessagesScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lk50/u0;", "Ldli/a;", "Lk50/k1;", "Lno/m;", "Lno/k;", "Companion", "k50/z1", "k50/y1", "a", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MessagesScreen extends ViewController<u0> implements dli.a, m, k {
    public h A0;
    public z B0;
    public s1 C0;
    public d D0;
    public final Lazy E0;
    public final MessagesContract$InputData K;
    public AnalyticsContext L;
    public g M;
    public final ao.h N;
    public final RowDelegate O;
    public final ChatTooltipDelegate P;
    public final ChatBubbleDelegate Q;
    public final ChatUncontainedMessageDelegate R;
    public final ChatAttachmentBubbleDelegate S;
    public final ChatAttachmentGridBubbleDelegate T;
    public final ChatAttachmentListBubbleDelegate U;
    public final ChatCallBubbleDelegate V;
    public final ChatMessageActionsPanelDelegate W;
    public final ChatContextualChartDelegate X;
    public final Lazy Y;
    public final ChatQuickLinkBubbleDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ChatItemsDelegate f51180a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final ChatTimestampBubbleDelegate f51181b0;
    public final TagDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final LargeActionButtonDelegate f51182d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final RateEmojiDelegate f51183e0;
    public final RateOneClickDelegate f0;
    public final ChatTableDelegate g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final ChatSuggestionsBlockDelegate f51184h0;
    public final ChatTravelPreviewDelegate i0;
    public final ChatTilesCollectionDelegate j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public RecyclerView f51185k0;
    public koi.h l0;
    public long m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f51186n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public y1 f51187o0;
    public boolean p0;
    public int q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f51188r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f51189s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f51190t0;
    public final AnalyticsProduct.Shared u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final int f51191v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Lazy f51192w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Lazy f51193x0;
    public final Object y0;
    public h z0;
    public static final /* synthetic */ KProperty[] F0 = {o0.f186429a.j(new h0(MessagesScreen.class, "binding", "getBinding()Lcom/revolut/chat_core/databinding/ScreenMessagesListBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.chat.ui.messageslist.MessagesScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public MessagesScreen(MessagesContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.N = s.t(this, d2.f);
        this.O = new RowDelegate(null, null, 7);
        this.P = new ChatTooltipDelegate();
        this.Q = new ChatBubbleDelegate();
        this.R = new ChatUncontainedMessageDelegate();
        this.S = new ChatAttachmentBubbleDelegate();
        this.T = new ChatAttachmentGridBubbleDelegate();
        this.U = new ChatAttachmentListBubbleDelegate();
        this.V = new ChatCallBubbleDelegate();
        this.W = new ChatMessageActionsPanelDelegate();
        this.X = new ChatContextualChartDelegate();
        final int i = 0;
        this.Y = j.b(new Function0(this) { // from class: k50.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessagesScreen f181260b;

            {
                this.f181260b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MessagesScreen messagesScreen = this.f181260b;
                switch (i2) {
                    case 0:
                        MessagesScreen.Companion companion = MessagesScreen.INSTANCE;
                        return new ChatVoiceMessageBubbleDelegate((oo0.d) messagesScreen.R1().N.get());
                    case 1:
                        MessagesScreen.Companion companion2 = MessagesScreen.INSTANCE;
                        qji.b bVarR1 = messagesScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.chat.ui.messageslist.di.MessagesInjector");
                        h30.q qVarD = ((d50.a) bVarR1).D();
                        MessagesContract$InputData messagesContract$InputData = messagesScreen.K;
                        messagesContract$InputData.getClass();
                        qVarD.e = messagesContract$InputData;
                        qVarD.d = messagesScreen;
                        return (h30.t) qVarD.mo3783build();
                    case 2:
                        MessagesScreen.Companion companion3 = MessagesScreen.INSTANCE;
                        h30.t tVarR1 = messagesScreen.R1();
                        tVarR1.getClass();
                        MessagesContract$InputData messagesContract$InputData2 = tVarR1.f148954a;
                        h30.n nVar = tVarR1.f148955b;
                        l70.e eVar = nVar.d;
                        z70.a aVarF = eVar.f();
                        vc.s.j(aVarF);
                        k30.a aVarD = nVar.d();
                        jpc.e eVarG = nVar.g();
                        of3.f fVar = nVar.f148906b;
                        j30.c cVarF = fVar.f();
                        vc.s.j(cVarF);
                        n30.n nVarK = nVar.k();
                        tf3.b bVarD = fVar.d();
                        vc.s.j(bVarD);
                        n30.v vVarM = nVar.m();
                        n30.x xVarB = fVar.b();
                        vc.s.j(xVarB);
                        w50.k kVar = (w50.k) tVarR1.F.get();
                        be7.e eVar2 = (be7.e) nVar.o.f125117l.get();
                        vc.s.j(eVar2);
                        c40.b bVar = (c40.b) nVar.f148917m.f148896c.get();
                        vc.s.j(bVar);
                        n30.z zVar = (n30.z) nVar.f148907b0.get();
                        c70.a aVarZ = eVar.z();
                        vc.s.j(aVarZ);
                        f0 f0Var = (f0) tVarR1.o.get();
                        a0 a0Var = (a0) tVarR1.C.get();
                        r70.c cVarA = eVar.A();
                        vc.s.j(cVarA);
                        n0 n0Var = (n0) tVarR1.f148970y.get();
                        v40.b bVar2 = new v40.b((rp0.g1) tVarR1.I.get());
                        l50.d.Companion.getClass();
                        AnalyticsProduct.Shared shared = d40.a.f111223a;
                        vc.s.k(shared);
                        n50.h hVar = new n50.h(shared);
                        r30.a aVarX = nVar.x();
                        q1 q1Var = new q1();
                        y20.g0 g0Var = (y20.g0) nVar.j0.get();
                        p50.e eVar3 = (p50.e) tVarR1.J.get();
                        s30.b bVar3 = new s30.b((v20.o) nVar.U.get());
                        MessagesContract$InputData messagesContract$InputData3 = tVarR1.f148954a;
                        j30.c cVarF2 = fVar.f();
                        vc.s.j(cVarF2);
                        f01.a aVarG = nVar.f148906b.g();
                        vc.s.j(aVarG);
                        n50.d dVar = new n50.d(cVarF2, new z40.c(aVarG));
                        a20.a aVarE = nVar.e();
                        j30.c cVarF3 = fVar.f();
                        vc.s.j(cVarF3);
                        n50.l lVar = new n50.l(aVarE, cVarF3);
                        z50.b bVar4 = new z50.b(new z50.g());
                        z20.u uVar = (z20.u) nVar.f148910e0.get();
                        f01.a aVarG2 = nVar.f148906b.g();
                        vc.s.j(aVarG2);
                        z40.c cVar = new z40.c(aVarG2);
                        n50.b bVar5 = new n50.b(nVar.l(), nVar.v());
                        x xVarL = nVar.l();
                        j30.c cVarF4 = fVar.f();
                        vc.s.j(cVarF4);
                        p80.a aVar = (p80.a) tVarR1.K.get();
                        z50.e eVarV = nVar.v();
                        f80.a aVarX2 = eVar.x();
                        vc.s.j(aVarX2);
                        n50.y yVar = new n50.y(bVar4, uVar, cVar, bVar5, xVarL, cVarF4, aVar, eVarV, aVarX2, (q50.o) tVarR1.E.get());
                        b0 b0Var = new b0();
                        l80.e eVarH = eVar.h();
                        vc.s.j(eVarH);
                        j30.c cVarF5 = fVar.f();
                        vc.s.j(cVarF5);
                        p1 p1Var = new p1(messagesContract$InputData3, dVar, lVar, yVar, b0Var, eVarH, cVarF5, (p80.a) tVarR1.K.get());
                        d4m.a aVarA = e4m.b.a(tVarR1.L);
                        urg.a aVar2 = (urg.a) tVarR1.u.get();
                        f01.a aVarG3 = fVar.g();
                        vc.s.j(aVarG3);
                        i90.b bVar6 = new i90.b();
                        m4 m4Var = (m4) tVarR1.B.get();
                        l40.a aVar3 = (l40.a) tVarR1.G.get();
                        df0.b bVarA = nVar.f148921p.a();
                        vc.s.j(bVarA);
                        l80.e eVarH2 = eVar.h();
                        vc.s.j(eVarH2);
                        s50.e eVar4 = new s50.e((rp0.g1) tVarR1.I.get());
                        t30.f fVar2 = (t30.f) nVar.f148920o0.get();
                        rp0.l0 l0Var = (rp0.l0) tVarR1.M.get();
                        md0.b bVarA2 = nVar.u.a();
                        vc.s.j(bVarA2);
                        l30.b bVar7 = (l30.b) nVar.p0.get();
                        q50.o oVar = (q50.o) tVarR1.E.get();
                        b0 b0Var2 = new b0();
                        n50.b bVar8 = new n50.b(nVar.l(), nVar.v());
                        j50.l lVar2 = (j50.l) tVarR1.H.get();
                        i0 i0Var = (i0) tVarR1.f148966s.get();
                        p0 p0Var = (p0) tVarR1.D.get();
                        p pVarH = nVar.h();
                        CoroutineScope coroutineScopeA = nVar.f148914j.a();
                        vc.s.j(coroutineScopeA);
                        return new j4(messagesContract$InputData2, aVarF, aVarD, eVarG, cVarF, nVarK, bVarD, vVarM, xVarB, kVar, eVar2, bVar, zVar, aVarZ, f0Var, a0Var, cVarA, n0Var, bVar2, hVar, aVarX, q1Var, g0Var, eVar3, bVar3, p1Var, aVarA, aVar2, aVarG3, bVar6, m4Var, aVar3, bVarA, eVarH2, eVar4, fVar2, l0Var, bVarA2, bVar7, oVar, b0Var2, bVar8, lVar2, i0Var, p0Var, pVarH, coroutineScopeA);
                    case 3:
                        MessagesScreen.Companion companion4 = MessagesScreen.INSTANCE;
                        int i3 = R$id.recyclerView;
                        MessagesScreen messagesScreen2 = this.f181260b;
                        return dli.f.a(messagesScreen2, messagesScreen2.R2(), zhm.v.k(new ChatMessagesLoadingDelegate(), messagesScreen2.f51181b0, messagesScreen2.c0, messagesScreen2.P, messagesScreen2.Q, messagesScreen2.R, messagesScreen2.S, messagesScreen2.T, messagesScreen2.U, messagesScreen2.V, messagesScreen2.W, messagesScreen2.X, (ChatVoiceMessageBubbleDelegate) messagesScreen2.Y.getValue(), messagesScreen2.Z, messagesScreen2.f51180a0, messagesScreen2.f51183e0, messagesScreen2.f0, new ContextualSegmentedBarDelegate(), new ContextualBarChartDelegate(), new ContextualLineChartDelegate(), messagesScreen2.g0, messagesScreen2.i0, messagesScreen2.j0, new TextDelegate(), new FullScreenStateDelegate(), new RateOneClickLoadingDelegate(), new ShimmeringTextBubbleDelegate(), messagesScreen2.f51184h0), i3, null, null, null, 56);
                    default:
                        MessagesScreen.Companion companion5 = MessagesScreen.INSTANCE;
                        return Integer.valueOf(((c90.c) messagesScreen.R1().f148956c.f.get()).f22265a.getResources().getDisplayMetrics().heightPixels);
                }
            }
        });
        this.Z = new ChatQuickLinkBubbleDelegate();
        this.f51180a0 = new ChatItemsDelegate();
        new ListSubheaderDelegate();
        new ActionsDelegate();
        this.f51181b0 = new ChatTimestampBubbleDelegate();
        this.c0 = new TagDelegate();
        this.f51182d0 = new LargeActionButtonDelegate();
        this.f51183e0 = new RateEmojiDelegate();
        this.f0 = new RateOneClickDelegate();
        this.g0 = new ChatTableDelegate();
        this.f51184h0 = new ChatSuggestionsBlockDelegate();
        this.i0 = new ChatTravelPreviewDelegate();
        this.j0 = new ChatTilesCollectionDelegate();
        this.p0 = true;
        this.q0 = -1;
        this.f51188r0 = -1;
        this.f51189s0 = 1;
        this.u0 = d40.a.f111223a;
        this.f51191v0 = R$layout.screen_messages_list;
        final int i2 = 1;
        this.f51192w0 = j.b(new Function0(this) { // from class: k50.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessagesScreen f181260b;

            {
                this.f181260b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MessagesScreen messagesScreen = this.f181260b;
                switch (i22) {
                    case 0:
                        MessagesScreen.Companion companion = MessagesScreen.INSTANCE;
                        return new ChatVoiceMessageBubbleDelegate((oo0.d) messagesScreen.R1().N.get());
                    case 1:
                        MessagesScreen.Companion companion2 = MessagesScreen.INSTANCE;
                        qji.b bVarR1 = messagesScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.chat.ui.messageslist.di.MessagesInjector");
                        h30.q qVarD = ((d50.a) bVarR1).D();
                        MessagesContract$InputData messagesContract$InputData = messagesScreen.K;
                        messagesContract$InputData.getClass();
                        qVarD.e = messagesContract$InputData;
                        qVarD.d = messagesScreen;
                        return (h30.t) qVarD.mo3783build();
                    case 2:
                        MessagesScreen.Companion companion3 = MessagesScreen.INSTANCE;
                        h30.t tVarR1 = messagesScreen.R1();
                        tVarR1.getClass();
                        MessagesContract$InputData messagesContract$InputData2 = tVarR1.f148954a;
                        h30.n nVar = tVarR1.f148955b;
                        l70.e eVar = nVar.d;
                        z70.a aVarF = eVar.f();
                        vc.s.j(aVarF);
                        k30.a aVarD = nVar.d();
                        jpc.e eVarG = nVar.g();
                        of3.f fVar = nVar.f148906b;
                        j30.c cVarF = fVar.f();
                        vc.s.j(cVarF);
                        n30.n nVarK = nVar.k();
                        tf3.b bVarD = fVar.d();
                        vc.s.j(bVarD);
                        n30.v vVarM = nVar.m();
                        n30.x xVarB = fVar.b();
                        vc.s.j(xVarB);
                        w50.k kVar = (w50.k) tVarR1.F.get();
                        be7.e eVar2 = (be7.e) nVar.o.f125117l.get();
                        vc.s.j(eVar2);
                        c40.b bVar = (c40.b) nVar.f148917m.f148896c.get();
                        vc.s.j(bVar);
                        n30.z zVar = (n30.z) nVar.f148907b0.get();
                        c70.a aVarZ = eVar.z();
                        vc.s.j(aVarZ);
                        f0 f0Var = (f0) tVarR1.o.get();
                        a0 a0Var = (a0) tVarR1.C.get();
                        r70.c cVarA = eVar.A();
                        vc.s.j(cVarA);
                        n0 n0Var = (n0) tVarR1.f148970y.get();
                        v40.b bVar2 = new v40.b((rp0.g1) tVarR1.I.get());
                        l50.d.Companion.getClass();
                        AnalyticsProduct.Shared shared = d40.a.f111223a;
                        vc.s.k(shared);
                        n50.h hVar = new n50.h(shared);
                        r30.a aVarX = nVar.x();
                        q1 q1Var = new q1();
                        y20.g0 g0Var = (y20.g0) nVar.j0.get();
                        p50.e eVar3 = (p50.e) tVarR1.J.get();
                        s30.b bVar3 = new s30.b((v20.o) nVar.U.get());
                        MessagesContract$InputData messagesContract$InputData3 = tVarR1.f148954a;
                        j30.c cVarF2 = fVar.f();
                        vc.s.j(cVarF2);
                        f01.a aVarG = nVar.f148906b.g();
                        vc.s.j(aVarG);
                        n50.d dVar = new n50.d(cVarF2, new z40.c(aVarG));
                        a20.a aVarE = nVar.e();
                        j30.c cVarF3 = fVar.f();
                        vc.s.j(cVarF3);
                        n50.l lVar = new n50.l(aVarE, cVarF3);
                        z50.b bVar4 = new z50.b(new z50.g());
                        z20.u uVar = (z20.u) nVar.f148910e0.get();
                        f01.a aVarG2 = nVar.f148906b.g();
                        vc.s.j(aVarG2);
                        z40.c cVar = new z40.c(aVarG2);
                        n50.b bVar5 = new n50.b(nVar.l(), nVar.v());
                        x xVarL = nVar.l();
                        j30.c cVarF4 = fVar.f();
                        vc.s.j(cVarF4);
                        p80.a aVar = (p80.a) tVarR1.K.get();
                        z50.e eVarV = nVar.v();
                        f80.a aVarX2 = eVar.x();
                        vc.s.j(aVarX2);
                        n50.y yVar = new n50.y(bVar4, uVar, cVar, bVar5, xVarL, cVarF4, aVar, eVarV, aVarX2, (q50.o) tVarR1.E.get());
                        b0 b0Var = new b0();
                        l80.e eVarH = eVar.h();
                        vc.s.j(eVarH);
                        j30.c cVarF5 = fVar.f();
                        vc.s.j(cVarF5);
                        p1 p1Var = new p1(messagesContract$InputData3, dVar, lVar, yVar, b0Var, eVarH, cVarF5, (p80.a) tVarR1.K.get());
                        d4m.a aVarA = e4m.b.a(tVarR1.L);
                        urg.a aVar2 = (urg.a) tVarR1.u.get();
                        f01.a aVarG3 = fVar.g();
                        vc.s.j(aVarG3);
                        i90.b bVar6 = new i90.b();
                        m4 m4Var = (m4) tVarR1.B.get();
                        l40.a aVar3 = (l40.a) tVarR1.G.get();
                        df0.b bVarA = nVar.f148921p.a();
                        vc.s.j(bVarA);
                        l80.e eVarH2 = eVar.h();
                        vc.s.j(eVarH2);
                        s50.e eVar4 = new s50.e((rp0.g1) tVarR1.I.get());
                        t30.f fVar2 = (t30.f) nVar.f148920o0.get();
                        rp0.l0 l0Var = (rp0.l0) tVarR1.M.get();
                        md0.b bVarA2 = nVar.u.a();
                        vc.s.j(bVarA2);
                        l30.b bVar7 = (l30.b) nVar.p0.get();
                        q50.o oVar = (q50.o) tVarR1.E.get();
                        b0 b0Var2 = new b0();
                        n50.b bVar8 = new n50.b(nVar.l(), nVar.v());
                        j50.l lVar2 = (j50.l) tVarR1.H.get();
                        i0 i0Var = (i0) tVarR1.f148966s.get();
                        p0 p0Var = (p0) tVarR1.D.get();
                        p pVarH = nVar.h();
                        CoroutineScope coroutineScopeA = nVar.f148914j.a();
                        vc.s.j(coroutineScopeA);
                        return new j4(messagesContract$InputData2, aVarF, aVarD, eVarG, cVarF, nVarK, bVarD, vVarM, xVarB, kVar, eVar2, bVar, zVar, aVarZ, f0Var, a0Var, cVarA, n0Var, bVar2, hVar, aVarX, q1Var, g0Var, eVar3, bVar3, p1Var, aVarA, aVar2, aVarG3, bVar6, m4Var, aVar3, bVarA, eVarH2, eVar4, fVar2, l0Var, bVarA2, bVar7, oVar, b0Var2, bVar8, lVar2, i0Var, p0Var, pVarH, coroutineScopeA);
                    case 3:
                        MessagesScreen.Companion companion4 = MessagesScreen.INSTANCE;
                        int i3 = R$id.recyclerView;
                        MessagesScreen messagesScreen2 = this.f181260b;
                        return dli.f.a(messagesScreen2, messagesScreen2.R2(), zhm.v.k(new ChatMessagesLoadingDelegate(), messagesScreen2.f51181b0, messagesScreen2.c0, messagesScreen2.P, messagesScreen2.Q, messagesScreen2.R, messagesScreen2.S, messagesScreen2.T, messagesScreen2.U, messagesScreen2.V, messagesScreen2.W, messagesScreen2.X, (ChatVoiceMessageBubbleDelegate) messagesScreen2.Y.getValue(), messagesScreen2.Z, messagesScreen2.f51180a0, messagesScreen2.f51183e0, messagesScreen2.f0, new ContextualSegmentedBarDelegate(), new ContextualBarChartDelegate(), new ContextualLineChartDelegate(), messagesScreen2.g0, messagesScreen2.i0, messagesScreen2.j0, new TextDelegate(), new FullScreenStateDelegate(), new RateOneClickLoadingDelegate(), new ShimmeringTextBubbleDelegate(), messagesScreen2.f51184h0), i3, null, null, null, 56);
                    default:
                        MessagesScreen.Companion companion5 = MessagesScreen.INSTANCE;
                        return Integer.valueOf(((c90.c) messagesScreen.R1().f148956c.f.get()).f22265a.getResources().getDisplayMetrics().heightPixels);
                }
            }
        });
        final int i3 = 2;
        this.f51193x0 = j.b(new Function0(this) { // from class: k50.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessagesScreen f181260b;

            {
                this.f181260b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                MessagesScreen messagesScreen = this.f181260b;
                switch (i22) {
                    case 0:
                        MessagesScreen.Companion companion = MessagesScreen.INSTANCE;
                        return new ChatVoiceMessageBubbleDelegate((oo0.d) messagesScreen.R1().N.get());
                    case 1:
                        MessagesScreen.Companion companion2 = MessagesScreen.INSTANCE;
                        qji.b bVarR1 = messagesScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.chat.ui.messageslist.di.MessagesInjector");
                        h30.q qVarD = ((d50.a) bVarR1).D();
                        MessagesContract$InputData messagesContract$InputData = messagesScreen.K;
                        messagesContract$InputData.getClass();
                        qVarD.e = messagesContract$InputData;
                        qVarD.d = messagesScreen;
                        return (h30.t) qVarD.mo3783build();
                    case 2:
                        MessagesScreen.Companion companion3 = MessagesScreen.INSTANCE;
                        h30.t tVarR1 = messagesScreen.R1();
                        tVarR1.getClass();
                        MessagesContract$InputData messagesContract$InputData2 = tVarR1.f148954a;
                        h30.n nVar = tVarR1.f148955b;
                        l70.e eVar = nVar.d;
                        z70.a aVarF = eVar.f();
                        vc.s.j(aVarF);
                        k30.a aVarD = nVar.d();
                        jpc.e eVarG = nVar.g();
                        of3.f fVar = nVar.f148906b;
                        j30.c cVarF = fVar.f();
                        vc.s.j(cVarF);
                        n30.n nVarK = nVar.k();
                        tf3.b bVarD = fVar.d();
                        vc.s.j(bVarD);
                        n30.v vVarM = nVar.m();
                        n30.x xVarB = fVar.b();
                        vc.s.j(xVarB);
                        w50.k kVar = (w50.k) tVarR1.F.get();
                        be7.e eVar2 = (be7.e) nVar.o.f125117l.get();
                        vc.s.j(eVar2);
                        c40.b bVar = (c40.b) nVar.f148917m.f148896c.get();
                        vc.s.j(bVar);
                        n30.z zVar = (n30.z) nVar.f148907b0.get();
                        c70.a aVarZ = eVar.z();
                        vc.s.j(aVarZ);
                        f0 f0Var = (f0) tVarR1.o.get();
                        a0 a0Var = (a0) tVarR1.C.get();
                        r70.c cVarA = eVar.A();
                        vc.s.j(cVarA);
                        n0 n0Var = (n0) tVarR1.f148970y.get();
                        v40.b bVar2 = new v40.b((rp0.g1) tVarR1.I.get());
                        l50.d.Companion.getClass();
                        AnalyticsProduct.Shared shared = d40.a.f111223a;
                        vc.s.k(shared);
                        n50.h hVar = new n50.h(shared);
                        r30.a aVarX = nVar.x();
                        q1 q1Var = new q1();
                        y20.g0 g0Var = (y20.g0) nVar.j0.get();
                        p50.e eVar3 = (p50.e) tVarR1.J.get();
                        s30.b bVar3 = new s30.b((v20.o) nVar.U.get());
                        MessagesContract$InputData messagesContract$InputData3 = tVarR1.f148954a;
                        j30.c cVarF2 = fVar.f();
                        vc.s.j(cVarF2);
                        f01.a aVarG = nVar.f148906b.g();
                        vc.s.j(aVarG);
                        n50.d dVar = new n50.d(cVarF2, new z40.c(aVarG));
                        a20.a aVarE = nVar.e();
                        j30.c cVarF3 = fVar.f();
                        vc.s.j(cVarF3);
                        n50.l lVar = new n50.l(aVarE, cVarF3);
                        z50.b bVar4 = new z50.b(new z50.g());
                        z20.u uVar = (z20.u) nVar.f148910e0.get();
                        f01.a aVarG2 = nVar.f148906b.g();
                        vc.s.j(aVarG2);
                        z40.c cVar = new z40.c(aVarG2);
                        n50.b bVar5 = new n50.b(nVar.l(), nVar.v());
                        x xVarL = nVar.l();
                        j30.c cVarF4 = fVar.f();
                        vc.s.j(cVarF4);
                        p80.a aVar = (p80.a) tVarR1.K.get();
                        z50.e eVarV = nVar.v();
                        f80.a aVarX2 = eVar.x();
                        vc.s.j(aVarX2);
                        n50.y yVar = new n50.y(bVar4, uVar, cVar, bVar5, xVarL, cVarF4, aVar, eVarV, aVarX2, (q50.o) tVarR1.E.get());
                        b0 b0Var = new b0();
                        l80.e eVarH = eVar.h();
                        vc.s.j(eVarH);
                        j30.c cVarF5 = fVar.f();
                        vc.s.j(cVarF5);
                        p1 p1Var = new p1(messagesContract$InputData3, dVar, lVar, yVar, b0Var, eVarH, cVarF5, (p80.a) tVarR1.K.get());
                        d4m.a aVarA = e4m.b.a(tVarR1.L);
                        urg.a aVar2 = (urg.a) tVarR1.u.get();
                        f01.a aVarG3 = fVar.g();
                        vc.s.j(aVarG3);
                        i90.b bVar6 = new i90.b();
                        m4 m4Var = (m4) tVarR1.B.get();
                        l40.a aVar3 = (l40.a) tVarR1.G.get();
                        df0.b bVarA = nVar.f148921p.a();
                        vc.s.j(bVarA);
                        l80.e eVarH2 = eVar.h();
                        vc.s.j(eVarH2);
                        s50.e eVar4 = new s50.e((rp0.g1) tVarR1.I.get());
                        t30.f fVar2 = (t30.f) nVar.f148920o0.get();
                        rp0.l0 l0Var = (rp0.l0) tVarR1.M.get();
                        md0.b bVarA2 = nVar.u.a();
                        vc.s.j(bVarA2);
                        l30.b bVar7 = (l30.b) nVar.p0.get();
                        q50.o oVar = (q50.o) tVarR1.E.get();
                        b0 b0Var2 = new b0();
                        n50.b bVar8 = new n50.b(nVar.l(), nVar.v());
                        j50.l lVar2 = (j50.l) tVarR1.H.get();
                        i0 i0Var = (i0) tVarR1.f148966s.get();
                        p0 p0Var = (p0) tVarR1.D.get();
                        p pVarH = nVar.h();
                        CoroutineScope coroutineScopeA = nVar.f148914j.a();
                        vc.s.j(coroutineScopeA);
                        return new j4(messagesContract$InputData2, aVarF, aVarD, eVarG, cVarF, nVarK, bVarD, vVarM, xVarB, kVar, eVar2, bVar, zVar, aVarZ, f0Var, a0Var, cVarA, n0Var, bVar2, hVar, aVarX, q1Var, g0Var, eVar3, bVar3, p1Var, aVarA, aVar2, aVarG3, bVar6, m4Var, aVar3, bVarA, eVarH2, eVar4, fVar2, l0Var, bVarA2, bVar7, oVar, b0Var2, bVar8, lVar2, i0Var, p0Var, pVarH, coroutineScopeA);
                    case 3:
                        MessagesScreen.Companion companion4 = MessagesScreen.INSTANCE;
                        int i32 = R$id.recyclerView;
                        MessagesScreen messagesScreen2 = this.f181260b;
                        return dli.f.a(messagesScreen2, messagesScreen2.R2(), zhm.v.k(new ChatMessagesLoadingDelegate(), messagesScreen2.f51181b0, messagesScreen2.c0, messagesScreen2.P, messagesScreen2.Q, messagesScreen2.R, messagesScreen2.S, messagesScreen2.T, messagesScreen2.U, messagesScreen2.V, messagesScreen2.W, messagesScreen2.X, (ChatVoiceMessageBubbleDelegate) messagesScreen2.Y.getValue(), messagesScreen2.Z, messagesScreen2.f51180a0, messagesScreen2.f51183e0, messagesScreen2.f0, new ContextualSegmentedBarDelegate(), new ContextualBarChartDelegate(), new ContextualLineChartDelegate(), messagesScreen2.g0, messagesScreen2.i0, messagesScreen2.j0, new TextDelegate(), new FullScreenStateDelegate(), new RateOneClickLoadingDelegate(), new ShimmeringTextBubbleDelegate(), messagesScreen2.f51184h0), i32, null, null, null, 56);
                    default:
                        MessagesScreen.Companion companion5 = MessagesScreen.INSTANCE;
                        return Integer.valueOf(((c90.c) messagesScreen.R1().f148956c.f.get()).f22265a.getResources().getDisplayMetrics().heightPixels);
                }
            }
        });
        final int i5 = 3;
        this.y0 = w.y0(new Function0(this) { // from class: k50.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessagesScreen f181260b;

            {
                this.f181260b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                MessagesScreen messagesScreen = this.f181260b;
                switch (i22) {
                    case 0:
                        MessagesScreen.Companion companion = MessagesScreen.INSTANCE;
                        return new ChatVoiceMessageBubbleDelegate((oo0.d) messagesScreen.R1().N.get());
                    case 1:
                        MessagesScreen.Companion companion2 = MessagesScreen.INSTANCE;
                        qji.b bVarR1 = messagesScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.chat.ui.messageslist.di.MessagesInjector");
                        h30.q qVarD = ((d50.a) bVarR1).D();
                        MessagesContract$InputData messagesContract$InputData = messagesScreen.K;
                        messagesContract$InputData.getClass();
                        qVarD.e = messagesContract$InputData;
                        qVarD.d = messagesScreen;
                        return (h30.t) qVarD.mo3783build();
                    case 2:
                        MessagesScreen.Companion companion3 = MessagesScreen.INSTANCE;
                        h30.t tVarR1 = messagesScreen.R1();
                        tVarR1.getClass();
                        MessagesContract$InputData messagesContract$InputData2 = tVarR1.f148954a;
                        h30.n nVar = tVarR1.f148955b;
                        l70.e eVar = nVar.d;
                        z70.a aVarF = eVar.f();
                        vc.s.j(aVarF);
                        k30.a aVarD = nVar.d();
                        jpc.e eVarG = nVar.g();
                        of3.f fVar = nVar.f148906b;
                        j30.c cVarF = fVar.f();
                        vc.s.j(cVarF);
                        n30.n nVarK = nVar.k();
                        tf3.b bVarD = fVar.d();
                        vc.s.j(bVarD);
                        n30.v vVarM = nVar.m();
                        n30.x xVarB = fVar.b();
                        vc.s.j(xVarB);
                        w50.k kVar = (w50.k) tVarR1.F.get();
                        be7.e eVar2 = (be7.e) nVar.o.f125117l.get();
                        vc.s.j(eVar2);
                        c40.b bVar = (c40.b) nVar.f148917m.f148896c.get();
                        vc.s.j(bVar);
                        n30.z zVar = (n30.z) nVar.f148907b0.get();
                        c70.a aVarZ = eVar.z();
                        vc.s.j(aVarZ);
                        f0 f0Var = (f0) tVarR1.o.get();
                        a0 a0Var = (a0) tVarR1.C.get();
                        r70.c cVarA = eVar.A();
                        vc.s.j(cVarA);
                        n0 n0Var = (n0) tVarR1.f148970y.get();
                        v40.b bVar2 = new v40.b((rp0.g1) tVarR1.I.get());
                        l50.d.Companion.getClass();
                        AnalyticsProduct.Shared shared = d40.a.f111223a;
                        vc.s.k(shared);
                        n50.h hVar = new n50.h(shared);
                        r30.a aVarX = nVar.x();
                        q1 q1Var = new q1();
                        y20.g0 g0Var = (y20.g0) nVar.j0.get();
                        p50.e eVar3 = (p50.e) tVarR1.J.get();
                        s30.b bVar3 = new s30.b((v20.o) nVar.U.get());
                        MessagesContract$InputData messagesContract$InputData3 = tVarR1.f148954a;
                        j30.c cVarF2 = fVar.f();
                        vc.s.j(cVarF2);
                        f01.a aVarG = nVar.f148906b.g();
                        vc.s.j(aVarG);
                        n50.d dVar = new n50.d(cVarF2, new z40.c(aVarG));
                        a20.a aVarE = nVar.e();
                        j30.c cVarF3 = fVar.f();
                        vc.s.j(cVarF3);
                        n50.l lVar = new n50.l(aVarE, cVarF3);
                        z50.b bVar4 = new z50.b(new z50.g());
                        z20.u uVar = (z20.u) nVar.f148910e0.get();
                        f01.a aVarG2 = nVar.f148906b.g();
                        vc.s.j(aVarG2);
                        z40.c cVar = new z40.c(aVarG2);
                        n50.b bVar5 = new n50.b(nVar.l(), nVar.v());
                        x xVarL = nVar.l();
                        j30.c cVarF4 = fVar.f();
                        vc.s.j(cVarF4);
                        p80.a aVar = (p80.a) tVarR1.K.get();
                        z50.e eVarV = nVar.v();
                        f80.a aVarX2 = eVar.x();
                        vc.s.j(aVarX2);
                        n50.y yVar = new n50.y(bVar4, uVar, cVar, bVar5, xVarL, cVarF4, aVar, eVarV, aVarX2, (q50.o) tVarR1.E.get());
                        b0 b0Var = new b0();
                        l80.e eVarH = eVar.h();
                        vc.s.j(eVarH);
                        j30.c cVarF5 = fVar.f();
                        vc.s.j(cVarF5);
                        p1 p1Var = new p1(messagesContract$InputData3, dVar, lVar, yVar, b0Var, eVarH, cVarF5, (p80.a) tVarR1.K.get());
                        d4m.a aVarA = e4m.b.a(tVarR1.L);
                        urg.a aVar2 = (urg.a) tVarR1.u.get();
                        f01.a aVarG3 = fVar.g();
                        vc.s.j(aVarG3);
                        i90.b bVar6 = new i90.b();
                        m4 m4Var = (m4) tVarR1.B.get();
                        l40.a aVar3 = (l40.a) tVarR1.G.get();
                        df0.b bVarA = nVar.f148921p.a();
                        vc.s.j(bVarA);
                        l80.e eVarH2 = eVar.h();
                        vc.s.j(eVarH2);
                        s50.e eVar4 = new s50.e((rp0.g1) tVarR1.I.get());
                        t30.f fVar2 = (t30.f) nVar.f148920o0.get();
                        rp0.l0 l0Var = (rp0.l0) tVarR1.M.get();
                        md0.b bVarA2 = nVar.u.a();
                        vc.s.j(bVarA2);
                        l30.b bVar7 = (l30.b) nVar.p0.get();
                        q50.o oVar = (q50.o) tVarR1.E.get();
                        b0 b0Var2 = new b0();
                        n50.b bVar8 = new n50.b(nVar.l(), nVar.v());
                        j50.l lVar2 = (j50.l) tVarR1.H.get();
                        i0 i0Var = (i0) tVarR1.f148966s.get();
                        p0 p0Var = (p0) tVarR1.D.get();
                        p pVarH = nVar.h();
                        CoroutineScope coroutineScopeA = nVar.f148914j.a();
                        vc.s.j(coroutineScopeA);
                        return new j4(messagesContract$InputData2, aVarF, aVarD, eVarG, cVarF, nVarK, bVarD, vVarM, xVarB, kVar, eVar2, bVar, zVar, aVarZ, f0Var, a0Var, cVarA, n0Var, bVar2, hVar, aVarX, q1Var, g0Var, eVar3, bVar3, p1Var, aVarA, aVar2, aVarG3, bVar6, m4Var, aVar3, bVarA, eVarH2, eVar4, fVar2, l0Var, bVarA2, bVar7, oVar, b0Var2, bVar8, lVar2, i0Var, p0Var, pVarH, coroutineScopeA);
                    case 3:
                        MessagesScreen.Companion companion4 = MessagesScreen.INSTANCE;
                        int i32 = R$id.recyclerView;
                        MessagesScreen messagesScreen2 = this.f181260b;
                        return dli.f.a(messagesScreen2, messagesScreen2.R2(), zhm.v.k(new ChatMessagesLoadingDelegate(), messagesScreen2.f51181b0, messagesScreen2.c0, messagesScreen2.P, messagesScreen2.Q, messagesScreen2.R, messagesScreen2.S, messagesScreen2.T, messagesScreen2.U, messagesScreen2.V, messagesScreen2.W, messagesScreen2.X, (ChatVoiceMessageBubbleDelegate) messagesScreen2.Y.getValue(), messagesScreen2.Z, messagesScreen2.f51180a0, messagesScreen2.f51183e0, messagesScreen2.f0, new ContextualSegmentedBarDelegate(), new ContextualBarChartDelegate(), new ContextualLineChartDelegate(), messagesScreen2.g0, messagesScreen2.i0, messagesScreen2.j0, new TextDelegate(), new FullScreenStateDelegate(), new RateOneClickLoadingDelegate(), new ShimmeringTextBubbleDelegate(), messagesScreen2.f51184h0), i32, null, null, null, 56);
                    default:
                        MessagesScreen.Companion companion5 = MessagesScreen.INSTANCE;
                        return Integer.valueOf(((c90.c) messagesScreen.R1().f148956c.f.get()).f22265a.getResources().getDisplayMetrics().heightPixels);
                }
            }
        });
        final int i6 = 4;
        this.E0 = j.b(new Function0(this) { // from class: k50.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessagesScreen f181260b;

            {
                this.f181260b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                MessagesScreen messagesScreen = this.f181260b;
                switch (i22) {
                    case 0:
                        MessagesScreen.Companion companion = MessagesScreen.INSTANCE;
                        return new ChatVoiceMessageBubbleDelegate((oo0.d) messagesScreen.R1().N.get());
                    case 1:
                        MessagesScreen.Companion companion2 = MessagesScreen.INSTANCE;
                        qji.b bVarR1 = messagesScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.chat.ui.messageslist.di.MessagesInjector");
                        h30.q qVarD = ((d50.a) bVarR1).D();
                        MessagesContract$InputData messagesContract$InputData = messagesScreen.K;
                        messagesContract$InputData.getClass();
                        qVarD.e = messagesContract$InputData;
                        qVarD.d = messagesScreen;
                        return (h30.t) qVarD.mo3783build();
                    case 2:
                        MessagesScreen.Companion companion3 = MessagesScreen.INSTANCE;
                        h30.t tVarR1 = messagesScreen.R1();
                        tVarR1.getClass();
                        MessagesContract$InputData messagesContract$InputData2 = tVarR1.f148954a;
                        h30.n nVar = tVarR1.f148955b;
                        l70.e eVar = nVar.d;
                        z70.a aVarF = eVar.f();
                        vc.s.j(aVarF);
                        k30.a aVarD = nVar.d();
                        jpc.e eVarG = nVar.g();
                        of3.f fVar = nVar.f148906b;
                        j30.c cVarF = fVar.f();
                        vc.s.j(cVarF);
                        n30.n nVarK = nVar.k();
                        tf3.b bVarD = fVar.d();
                        vc.s.j(bVarD);
                        n30.v vVarM = nVar.m();
                        n30.x xVarB = fVar.b();
                        vc.s.j(xVarB);
                        w50.k kVar = (w50.k) tVarR1.F.get();
                        be7.e eVar2 = (be7.e) nVar.o.f125117l.get();
                        vc.s.j(eVar2);
                        c40.b bVar = (c40.b) nVar.f148917m.f148896c.get();
                        vc.s.j(bVar);
                        n30.z zVar = (n30.z) nVar.f148907b0.get();
                        c70.a aVarZ = eVar.z();
                        vc.s.j(aVarZ);
                        f0 f0Var = (f0) tVarR1.o.get();
                        a0 a0Var = (a0) tVarR1.C.get();
                        r70.c cVarA = eVar.A();
                        vc.s.j(cVarA);
                        n0 n0Var = (n0) tVarR1.f148970y.get();
                        v40.b bVar2 = new v40.b((rp0.g1) tVarR1.I.get());
                        l50.d.Companion.getClass();
                        AnalyticsProduct.Shared shared = d40.a.f111223a;
                        vc.s.k(shared);
                        n50.h hVar = new n50.h(shared);
                        r30.a aVarX = nVar.x();
                        q1 q1Var = new q1();
                        y20.g0 g0Var = (y20.g0) nVar.j0.get();
                        p50.e eVar3 = (p50.e) tVarR1.J.get();
                        s30.b bVar3 = new s30.b((v20.o) nVar.U.get());
                        MessagesContract$InputData messagesContract$InputData3 = tVarR1.f148954a;
                        j30.c cVarF2 = fVar.f();
                        vc.s.j(cVarF2);
                        f01.a aVarG = nVar.f148906b.g();
                        vc.s.j(aVarG);
                        n50.d dVar = new n50.d(cVarF2, new z40.c(aVarG));
                        a20.a aVarE = nVar.e();
                        j30.c cVarF3 = fVar.f();
                        vc.s.j(cVarF3);
                        n50.l lVar = new n50.l(aVarE, cVarF3);
                        z50.b bVar4 = new z50.b(new z50.g());
                        z20.u uVar = (z20.u) nVar.f148910e0.get();
                        f01.a aVarG2 = nVar.f148906b.g();
                        vc.s.j(aVarG2);
                        z40.c cVar = new z40.c(aVarG2);
                        n50.b bVar5 = new n50.b(nVar.l(), nVar.v());
                        x xVarL = nVar.l();
                        j30.c cVarF4 = fVar.f();
                        vc.s.j(cVarF4);
                        p80.a aVar = (p80.a) tVarR1.K.get();
                        z50.e eVarV = nVar.v();
                        f80.a aVarX2 = eVar.x();
                        vc.s.j(aVarX2);
                        n50.y yVar = new n50.y(bVar4, uVar, cVar, bVar5, xVarL, cVarF4, aVar, eVarV, aVarX2, (q50.o) tVarR1.E.get());
                        b0 b0Var = new b0();
                        l80.e eVarH = eVar.h();
                        vc.s.j(eVarH);
                        j30.c cVarF5 = fVar.f();
                        vc.s.j(cVarF5);
                        p1 p1Var = new p1(messagesContract$InputData3, dVar, lVar, yVar, b0Var, eVarH, cVarF5, (p80.a) tVarR1.K.get());
                        d4m.a aVarA = e4m.b.a(tVarR1.L);
                        urg.a aVar2 = (urg.a) tVarR1.u.get();
                        f01.a aVarG3 = fVar.g();
                        vc.s.j(aVarG3);
                        i90.b bVar6 = new i90.b();
                        m4 m4Var = (m4) tVarR1.B.get();
                        l40.a aVar3 = (l40.a) tVarR1.G.get();
                        df0.b bVarA = nVar.f148921p.a();
                        vc.s.j(bVarA);
                        l80.e eVarH2 = eVar.h();
                        vc.s.j(eVarH2);
                        s50.e eVar4 = new s50.e((rp0.g1) tVarR1.I.get());
                        t30.f fVar2 = (t30.f) nVar.f148920o0.get();
                        rp0.l0 l0Var = (rp0.l0) tVarR1.M.get();
                        md0.b bVarA2 = nVar.u.a();
                        vc.s.j(bVarA2);
                        l30.b bVar7 = (l30.b) nVar.p0.get();
                        q50.o oVar = (q50.o) tVarR1.E.get();
                        b0 b0Var2 = new b0();
                        n50.b bVar8 = new n50.b(nVar.l(), nVar.v());
                        j50.l lVar2 = (j50.l) tVarR1.H.get();
                        i0 i0Var = (i0) tVarR1.f148966s.get();
                        p0 p0Var = (p0) tVarR1.D.get();
                        p pVarH = nVar.h();
                        CoroutineScope coroutineScopeA = nVar.f148914j.a();
                        vc.s.j(coroutineScopeA);
                        return new j4(messagesContract$InputData2, aVarF, aVarD, eVarG, cVarF, nVarK, bVarD, vVarM, xVarB, kVar, eVar2, bVar, zVar, aVarZ, f0Var, a0Var, cVarA, n0Var, bVar2, hVar, aVarX, q1Var, g0Var, eVar3, bVar3, p1Var, aVarA, aVar2, aVarG3, bVar6, m4Var, aVar3, bVarA, eVarH2, eVar4, fVar2, l0Var, bVarA2, bVar7, oVar, b0Var2, bVar8, lVar2, i0Var, p0Var, pVarH, coroutineScopeA);
                    case 3:
                        MessagesScreen.Companion companion4 = MessagesScreen.INSTANCE;
                        int i32 = R$id.recyclerView;
                        MessagesScreen messagesScreen2 = this.f181260b;
                        return dli.f.a(messagesScreen2, messagesScreen2.R2(), zhm.v.k(new ChatMessagesLoadingDelegate(), messagesScreen2.f51181b0, messagesScreen2.c0, messagesScreen2.P, messagesScreen2.Q, messagesScreen2.R, messagesScreen2.S, messagesScreen2.T, messagesScreen2.U, messagesScreen2.V, messagesScreen2.W, messagesScreen2.X, (ChatVoiceMessageBubbleDelegate) messagesScreen2.Y.getValue(), messagesScreen2.Z, messagesScreen2.f51180a0, messagesScreen2.f51183e0, messagesScreen2.f0, new ContextualSegmentedBarDelegate(), new ContextualBarChartDelegate(), new ContextualLineChartDelegate(), messagesScreen2.g0, messagesScreen2.i0, messagesScreen2.j0, new TextDelegate(), new FullScreenStateDelegate(), new RateOneClickLoadingDelegate(), new ShimmeringTextBubbleDelegate(), messagesScreen2.f51184h0), i32, null, null, null, 56);
                    default:
                        MessagesScreen.Companion companion5 = MessagesScreen.INSTANCE;
                        return Integer.valueOf(((c90.c) messagesScreen.R1().f148956c.f.get()).f22265a.getResources().getDisplayMetrics().heightPixels);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getN() {
        return Integer.valueOf(R$style.UiKitTheme_TransparentSlider);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0113  */
    /* JADX WARN: Type inference failed for: r12v4, types: [au0.f0, com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v2, types: [gw0.q] */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r3v20, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v27, types: [com.revolut.core.ui_kit.views.ChatInputLayoutView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v6, types: [android.view.View, androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r8v12, types: [androidx.recyclerview.widget.RecyclerView$ItemAnimator] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // cli.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(cli.o r31, cli.q r32) {
        /*
            Method dump skipped, instruction units count: 1552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.chat.ui.messageslist.MessagesScreen.B(cli.o, cli.q):void");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        j4 j4Var = (j4) R2();
        if (!((k50.h0) ((j2) j4Var.f181140w0.f22677a).getValue()).A.f181021a) {
            return j4Var.F.b3();
        }
        j2 j2Var = j4Var.f181127k0;
        s2.Companion.getClass();
        j2Var.setValue(s2.f181237c);
        j4Var.H2(j4Var.f181140w0, new l2(3));
        return true;
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.L = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getR() {
        return this.u0;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getL() {
        return this.L;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: T2 */
    public final Boolean getG() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        int iK;
        v0 v0Var;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((o) R1().E.get()).f3(((c) this.y0.getValue()).w().f);
        f3().f1528l.setInsetsAdjustmentsEnabled(false);
        RecyclerView.LayoutManager layoutManager = f3().f1528l.getLayoutManager();
        UIKitLinearLayoutManager uIKitLinearLayoutManager = layoutManager instanceof UIKitLinearLayoutManager ? (UIKitLinearLayoutManager) layoutManager : null;
        if (uIKitLinearLayoutManager != null) {
            uIKitLinearLayoutManager.d = true;
        }
        ViewCompat.setOnApplyWindowInsetsListener(f3().f1528l, new e(10));
        OneShotPreDrawListener.add(view, new x5(view, this, 22));
        aim.e eVarB = u.b();
        ScreenContentRecyclerView recyclerView = f3().f1528l;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        eVarB.add(new f(recyclerView, true));
        ChatInputLayoutView inputLayout = f3().f1526h;
        Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
        eVarB.add(new f(inputLayout, false));
        FrameLayout bottomContainer = f3().d;
        Intrinsics.checkNotNullExpressionValue(bottomContainer, "bottomContainer");
        eVarB.add(new f(bottomContainer, false));
        eVarB.add(f3().k.getKeyboardAnimationCallback());
        if (((j4) R2()).y0) {
            eVarB.add(new f2(this, WindowInsetsCompat.Type.systemBars(), WindowInsetsCompat.Type.ime(), 0));
        }
        kji.a.a(this, (b[]) u.a(eVarB).toArray(new b[0]));
        ScreenContentRecyclerView recyclerView2 = f3().f1528l;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "recyclerView");
        this.z0 = new h(recyclerView2);
        xo0.c cVar = xo0.f.Companion;
        ControllerContainerCoordinatorLayout host = f3().e;
        Intrinsics.checkNotNullExpressionValue(host, "coordinatorLayout");
        ScreenContentRecyclerView recycler = f3().f1528l;
        Intrinsics.checkNotNullExpressionValue(recycler, "recyclerView");
        ChatInputLayoutView inputLayout2 = f3().f1526h;
        Intrinsics.checkNotNullExpressionValue(inputLayout2, "inputLayout");
        h paddingController = this.z0;
        if (paddingController == null) {
            Intrinsics.r("bottomPaddingController");
            throw null;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(inputLayout2, "inputLayout");
        Intrinsics.checkNotNullParameter(paddingController, "paddingController");
        this.B0 = new z(host, recycler, inputLayout2, paddingController);
        ScreenContentRecyclerView recyclerView3 = f3().f1528l;
        Intrinsics.checkNotNullExpressionValue(recyclerView3, "recyclerView");
        this.A0 = new h(recyclerView3);
        a60.g gVarF3 = f3();
        gVarF3.i.setTag("MessagesScreen_navBarWithToolbar");
        gVarF3.f1528l.setTag("MessagesScreen_recyclerView");
        NavBarWithToolbar navBarWithToolbar = f3().i;
        MessagesContract$InputData messagesContract$InputData = this.K;
        ChatFeed chatFeed = messagesContract$InputData.f51174a;
        if (chatFeed instanceof ChatFeed.Assistant) {
            iK = ((ChatFeed.Assistant) chatFeed).f51031c ? R$drawable.uikit_icn_24_cross : q.k(q2());
        } else {
            if (!(chatFeed instanceof ChatFeed.Support) && !(chatFeed instanceof ChatFeed.PrivateBanking)) {
                throw new NoWhenBranchMatchedException();
            }
            iK = q.k(q2());
        }
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(iK));
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.chat_search_search_field_placeholder, null, null, 14));
        navBarWithToolbar.j0(false);
        ScreenContentRecyclerView screenContentRecyclerView = f3().f1528l;
        RecyclerView.LayoutManager layoutManager2 = screenContentRecyclerView.getLayoutManager();
        Intrinsics.i(layoutManager2, "null cannot be cast to non-null type com.revolut.recyclerkit.layoutmanager.UIKitLinearLayoutManager");
        RecyclerView.Adapter adapter = screenContentRecyclerView.getAdapter();
        Intrinsics.i(adapter, "null cannot be cast to non-null type com.revolut.recyclerkit.delegates.DiffAdapter");
        koi.h hVar = (koi.h) adapter;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        screenContentRecyclerView.getRecycledViewPool().setMaxRecycledViews(this.Q.f98535a, 20);
        xv0.o oVar = new xv0.o(screenContentRecyclerView, 0.8f, 0.95f, new w1(this, hVar), new u1(this, 10), 3);
        screenContentRecyclerView.addOnScrollListener(oVar);
        screenContentRecyclerView.addOnLayoutChangeListener(oVar);
        screenContentRecyclerView.addOnScrollListener(new g2(this, ref$ObjectRef, (UIKitLinearLayoutManager) layoutManager2, hVar));
        if (((j4) R2()).y0) {
            xv0.o oVar2 = new xv0.o(screenContentRecyclerView, 0.4f, 1.0f, new w1(hVar, this), null, 0);
            screenContentRecyclerView.addOnScrollListener(oVar2);
            screenContentRecyclerView.addOnLayoutChangeListener(oVar2);
        }
        y1 y1Var = new y1(hVar);
        this.f51187o0 = y1Var;
        hVar.registerAdapterDataObserver(y1Var);
        RecyclerView.LayoutManager layoutManager3 = screenContentRecyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager3 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager3 : null;
        if (linearLayoutManager != null) {
            linearLayoutManager.setStackFromEnd(true);
        }
        ChatInputView inputView = f3().f1526h.getInputView();
        urg.a recordAudioViewModel = (urg.a) R1().u.get();
        Intrinsics.checkNotNullParameter(recordAudioViewModel, "extension");
        s.k(recordAudioViewModel);
        oo0.d audioPlayer = (oo0.d) R1().N.get();
        inputView.getClass();
        Intrinsics.checkNotNullParameter(recordAudioViewModel, "recordAudioViewModel");
        Intrinsics.checkNotNullParameter(audioPlayer, "audioPlayer");
        inputView.m0 = recordAudioViewModel;
        inputView.f58460n0 = audioPlayer;
        recordAudioViewModel.g3(inputView.E0);
        SmallActionButton smallActionButton = f3().f;
        smallActionButton.i(h4.INVERTED_PRIMARY);
        smallActionButton.setIconsColorFilterEnabled(false);
        smallActionButton.setBadgeMode(new ms0.m(true));
        smallActionButton.setIcon(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246));
        Context context = smallActionButton.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(R$attr.uikit_colorBlack_20, context);
        smallActionButton.setOutlineAmbientShadowColor(iS);
        smallActionButton.setOutlineSpotShadowColor(iS);
        ChatEntryPoint chatEntryPoint = messagesContract$InputData.f51176c;
        String str = chatEntryPoint != null ? chatEntryPoint.f51028a : null;
        UUID uuidA = messagesContract$InputData.a();
        View viewD2 = D2();
        Context context2 = D2().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.M = new g(str, uuidA, this, viewD2, jh.d.f(context2).n0(), ((j4) R2()).y0);
        int i = a2.f181025b[((l30.f) ((j4) R2()).u0.getValue()).ordinal()];
        if (i == 1) {
            v0Var = v0.MESSAGES;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            v0Var = v0.PROMPT;
        }
        g gVar = this.M;
        if (gVar == null) {
            Intrinsics.r("analyticsTracker");
            throw null;
        }
        gVar.b(v0Var);
        Space fabAnchor = f3().f1525g;
        Intrinsics.checkNotNullExpressionValue(fabAnchor, "fabAnchor");
        ChatInputLayoutView inputLayout3 = f3().f1526h;
        Intrinsics.checkNotNullExpressionValue(inputLayout3, "inputLayout");
        FrameLayout bottomContainer2 = f3().d;
        Intrinsics.checkNotNullExpressionValue(bottomContainer2, "bottomContainer");
        ChatPromptView promptView = f3().k;
        Intrinsics.checkNotNullExpressionValue(promptView, "promptView");
        z1 z1Var = new z1(this, fabAnchor, inputLayout3, bottomContainer2, promptView);
        f3().f1526h.setListener(z1Var);
        view.addOnLayoutChangeListener(z1Var);
        ViewCompat.setOnApplyWindowInsetsListener(f3().d, z1Var);
        VerticalSnapLayout verticalSnapLayout = f3().f1529m;
        Intrinsics.checkNotNullExpressionValue(verticalSnapLayout, "verticalSnapLayout");
        ChatPromptView promptView2 = f3().k;
        Intrinsics.checkNotNullExpressionValue(promptView2, "promptView");
        AirChatBackgroundView airBackground = f3().f1523b;
        Intrinsics.checkNotNullExpressionValue(airBackground, "airBackground");
        ScreenContentRecyclerView recyclerView4 = f3().f1528l;
        Intrinsics.checkNotNullExpressionValue(recyclerView4, "recyclerView");
        NavBarWithToolbar navBarWithToolbar2 = f3().i;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar2, "navBarWithToolbar");
        s1 s1Var = new s1(verticalSnapLayout, promptView2, recyclerView4, airBackground, navBarWithToolbar2, new k3k.k(this, 5));
        this.C0 = s1Var;
        boolean z = ((j4) R2()).y0;
        s1Var.k = z;
        verticalSnapLayout.setScrollingEnabled(z ? false : s1Var.f181234j);
        s1Var.a();
        s1 s1Var2 = this.C0;
        if (s1Var2 == null) {
            Intrinsics.r("paneCoordinator");
            throw null;
        }
        l30.f entryPane = (l30.f) ((j4) R2()).u0.getValue();
        Intrinsics.checkNotNullParameter(entryPane, "entryPane");
        int i2 = r1.f181223a[entryPane.ordinal()];
        if (i2 == 1) {
            s1Var2.f181232g = yo0.a.TOP_GLOW;
            s1Var2.f181233h = v0.MESSAGES;
            s1Var2.i = true;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            s1Var2.f181232g = yo0.a.AIR_SPHERE;
            s1Var2.f181233h = v0.PROMPT;
            s1Var2.i = false;
            s1Var2.f181229a.setCurrent(1, false);
        }
        if (!s1Var2.i) {
            s1Var2.e.setShadowVisible(false);
        }
        s1Var2.a();
        VerticalSnapLayout verticalSnapLayout2 = f3().f1529m;
        Intrinsics.checkNotNullExpressionValue(verticalSnapLayout2, "verticalSnapLayout");
        if (!verticalSnapLayout2.isLaidOut() || verticalSnapLayout2.isLayoutRequested()) {
            verticalSnapLayout2.addOnLayoutChangeListener(new cli.u(this, 7));
        } else {
            f3().f1529m.setOnScrollChangeListener(new e2(this));
        }
        w0 w0VarR2 = R2();
        z zVar = this.B0;
        if (zVar == null) {
            Intrinsics.r("chatBubbleAnimationController");
            throw null;
        }
        h2 event = new h2(zVar);
        j4 j4Var = (j4) w0VarR2;
        j4Var.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        j4Var.l1().M0(event);
        if (((j4) R2()).z0) {
            ScreenContentRecyclerView recyclerView5 = f3().f1528l;
            Intrinsics.checkNotNullExpressionValue(recyclerView5, "recyclerView");
            ControllerContainerCoordinatorLayout coordinatorLayout = f3().e;
            Intrinsics.checkNotNullExpressionValue(coordinatorLayout, "coordinatorLayout");
            NavBarWithToolbar navBarWithToolbar3 = f3().i;
            Intrinsics.checkNotNullExpressionValue(navBarWithToolbar3, "navBarWithToolbar");
            Object value = ((j4) R2()).f181142x0.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            d dVar = new d(recyclerView5, coordinatorLayout, navBarWithToolbar3, (DateTimeZone) value, new u1(this, 12));
            dVar.b();
            this.D0 = dVar;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        f3().f.setOnClickListener(new g0(this, 9));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (koi.k kVar : ((c) this.y0.getValue()).w().f.e()) {
            if (kVar instanceof kp0.d) {
                kp0.d dVar = (kp0.d) kVar;
                ihm.f f53905c = dVar.getF53905c();
                if (f53905c != null) {
                    arrayList.add(f53905c);
                }
                ihm.f e = dVar.getE();
                if (e != null) {
                    arrayList2.add(e);
                }
                r rVarI = dVar.i();
                if (rVarI != null) {
                    arrayList3.add(rVarI);
                }
                r rVarC = dVar.c();
                if (rVarC != null) {
                    arrayList4.add(rVarC);
                }
            }
        }
        r rVarMerge = r.merge(arrayList);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(rVarMerge), new c2(this, continuation, 0), 3);
        r rVarMerge2 = r.merge(arrayList2);
        Intrinsics.checkNotNullExpressionValue(rVarMerge2, "merge(...)");
        ViewController.P2(this, rd0.e.b(rVarMerge2), new c2(this, continuation, 1), 3);
        r rVarMerge3 = r.merge(arrayList3);
        Intrinsics.checkNotNullExpressionValue(rVarMerge3, "merge(...)");
        ViewController.P2(this, rd0.e.b(rVarMerge3), new c2(this, continuation, 2), 3);
        r rVarMerge4 = r.merge(arrayList4);
        Intrinsics.checkNotNullExpressionValue(rVarMerge4, "merge(...)");
        ViewController.P2(this, rd0.e.b(rVarMerge4), new c2(this, continuation, 3), 3);
        final int i = 1;
        d3(f3().i.f59410q, new Function1(this) { // from class: k50.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessagesScreen f181246b;

            {
                this.f181246b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x04e9  */
            /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.coroutines.Continuation] */
            /* JADX WARN: Type inference failed for: r15v14 */
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
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r28) {
                /*
                    Method dump skipped, instruction units count: 2016
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: k50.t1.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final int i2 = 13;
        d3(f3().i.o.f57403b, new Function1(this) { // from class: k50.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessagesScreen f181246b;

            {
                this.f181246b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x04e9  */
            /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.coroutines.Continuation] */
            /* JADX WARN: Type inference failed for: r15v14 */
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
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r28) {
                /*
                    Method dump skipped, instruction units count: 2016
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: k50.t1.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final int i3 = 25;
        d3(f3().i.f59409p.f57336l, new Function1(this) { // from class: k50.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessagesScreen f181246b;

            {
                this.f181246b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x04e9  */
            /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.coroutines.Continuation] */
            /* JADX WARN: Type inference failed for: r15v14 */
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
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r28) {
                /*
                    Method dump skipped, instruction units count: 2016
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: k50.t1.invoke(java.lang.Object):java.lang.Object");
            }
        });
        d3(f3().i.f59409p.f57337m, new u1(this, 5));
        d3(f3().i.f59409p.o, new u1(this, 6));
        d3(f3().f1526h.searchNavigatorView.i, new u1(this, 7));
        d3(f3().f1526h.searchNavigatorView.f129108j, new u1(this, 8));
        r rVarThrottleFirst = f3().f1526h.getInputView().b0().filter(new l(new k37.s(24), 7)).throttleFirst(CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(rVarThrottleFirst, "throttleFirst(...)");
        final int i5 = 10;
        d3(rVarThrottleFirst, new Function1(this) { // from class: k50.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessagesScreen f181246b;

            {
                this.f181246b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x04e9  */
            /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.coroutines.Continuation] */
            /* JADX WARN: Type inference failed for: r15v14 */
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
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r28) {
                /*
                    Method dump skipped, instruction units count: 2016
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: k50.t1.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final int i6 = 21;
        d3(f3().f1526h.getInputView().b0(), new Function1(this) { // from class: k50.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessagesScreen f181246b;

            {
                this.f181246b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x04e9  */
            /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.coroutines.Continuation] */
            /* JADX WARN: Type inference failed for: r15v14 */
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
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r28) {
                /*
                    Method dump skipped, instruction units count: 2016
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: k50.t1.invoke(java.lang.Object):java.lang.Object");
            }
        });
        d3(f3().f1526h.getInputView().M, new u1(this, 2));
        d3(f3().f1526h.getInputView().J, new u1(this, 9));
        d3(f3().f1526h.getInputView().L, new u1(this, 11));
        d3(f3().f1526h.getInputView().R, new u1(this, 13));
        d3(f3().f1526h.getInputView().Q, new u1(this, 14));
        d3(f3().f1526h.inputView.P, new u1(this, 15));
        d3(f3().f1526h.statusMessageView.f129116c, new u1(this, 16));
        final int i21 = 0;
        d3(this.O.f53218h, new Function1(this) { // from class: k50.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessagesScreen f181246b;

            {
                this.f181246b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x04e9  */
            /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.coroutines.Continuation] */
            /* JADX WARN: Type inference failed for: r15v14 */
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
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r28) {
                /*
                    Method dump skipped, instruction units count: 2016
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: k50.t1.invoke(java.lang.Object):java.lang.Object");
            }
        });
        ChatBubbleDelegate chatBubbleDelegate = this.Q;
        final int i22 = 2;
        d3(chatBubbleDelegate.d.f121375b, new Function1(this) { // from class: k50.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessagesScreen f181246b;

            {
                this.f181246b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x04e9  */
            /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.coroutines.Continuation] */
            /* JADX WARN: Type inference failed for: r15v14 */
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
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r28) {
                /*
                    Method dump skipped, instruction units count: 2016
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: k50.t1.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final int i32 = 3;
        d3(chatBubbleDelegate.f53806c, new Function1(this) { // from class: k50.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessagesScreen f181246b;

            {
                this.f181246b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x04e9  */
            /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.coroutines.Continuation] */
            /* JADX WARN: Type inference failed for: r15v14 */
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
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r28) {
                /*
                    Method dump skipped, instruction units count: 2016
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: k50.t1.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final int i33 = 4;
        d3(chatBubbleDelegate.f53809j, new Function1(this) { // from class: k50.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessagesScreen f181246b;

            {
                this.f181246b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x04e9  */
            /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.coroutines.Continuation] */
            /* JADX WARN: Type inference failed for: r15v14 */
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
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r28) {
                /*
                    Method dump skipped, instruction units count: 2016
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: k50.t1.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final int i43 = 5;
        d3(chatBubbleDelegate.k, new Function1(this) { // from class: k50.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessagesScreen f181246b;

            {
                this.f181246b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x04e9  */
            /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.coroutines.Continuation] */
            /* JADX WARN: Type inference failed for: r15v14 */
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
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r28) {
                /*
                    Method dump skipped, instruction units count: 2016
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: k50.t1.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final int i59 = 6;
        d3(chatBubbleDelegate.f53811m, new Function1(this) { // from class: k50.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessagesScreen f181246b;

            {
                this.f181246b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x04e9  */
            /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.coroutines.Continuation] */
            /* JADX WARN: Type inference failed for: r15v14 */
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
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r28) {
                /*
                    Method dump skipped, instruction units count: 2016
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: k50.t1.invoke(java.lang.Object):java.lang.Object");
            }
        });
        ChatUncontainedMessageDelegate chatUncontainedMessageDelegate = this.R;
        final int i66 = 7;
        d3(chatUncontainedMessageDelegate.f53915c, new Function1(this) { // from class: k50.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessagesScreen f181246b;

            {
                this.f181246b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x04e9  */
            /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.coroutines.Continuation] */
            /* JADX WARN: Type inference failed for: r15v14 */
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
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r28) {
                /*
                    Method dump skipped, instruction units count: 2016
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: k50.t1.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final int i74 = 8;
        d3(chatUncontainedMessageDelegate.d, new Function1(this) { // from class: k50.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessagesScreen f181246b;

            {
                this.f181246b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x04e9  */
            /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.coroutines.Continuation] */
            /* JADX WARN: Type inference failed for: r15v14 */
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
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r28) {
                /*
                    Method dump skipped, instruction units count: 2016
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: k50.t1.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final int i92 = 9;
        d3(this.W.f53852c, new Function1(this) { // from class: k50.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessagesScreen f181246b;

            {
                this.f181246b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x04e9  */
            /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.coroutines.Continuation] */
            /* JADX WARN: Type inference failed for: r15v14 */
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
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r28) {
                /*
                    Method dump skipped, instruction units count: 2016
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: k50.t1.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final int i96 = 11;
        d3(this.S.k, new Function1(this) { // from class: k50.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessagesScreen f181246b;

            {
                this.f181246b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x04e9  */
            /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.coroutines.Continuation] */
            /* JADX WARN: Type inference failed for: r15v14 */
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
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r28) {
                /*
                    Method dump skipped, instruction units count: 2016
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: k50.t1.invoke(java.lang.Object):java.lang.Object");
            }
        });
        ChatAttachmentGridBubbleDelegate chatAttachmentGridBubbleDelegate = this.T;
        final int i99 = 12;
        d3(chatAttachmentGridBubbleDelegate.k, new Function1(this) { // from class: k50.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessagesScreen f181246b;

            {
                this.f181246b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x04e9  */
            /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.coroutines.Continuation] */
            /* JADX WARN: Type inference failed for: r15v14 */
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
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r28) {
                /*
                    Method dump skipped, instruction units count: 2016
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: k50.t1.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final int i100 = 14;
        d3(chatAttachmentGridBubbleDelegate.f53776m, new Function1(this) { // from class: k50.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessagesScreen f181246b;

            {
                this.f181246b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x04e9  */
            /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.coroutines.Continuation] */
            /* JADX WARN: Type inference failed for: r15v14 */
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
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r28) {
                /*
                    Method dump skipped, instruction units count: 2016
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: k50.t1.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final int i101 = 15;
        d3(this.U.k.f53805c, new Function1(this) { // from class: k50.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessagesScreen f181246b;

            {
                this.f181246b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x04e9  */
            /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.coroutines.Continuation] */
            /* JADX WARN: Type inference failed for: r15v14 */
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
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r28) {
                /*
                    Method dump skipped, instruction units count: 2016
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: k50.t1.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final int i102 = 16;
        d3(this.f51182d0.d.f121375b, new Function1(this) { // from class: k50.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessagesScreen f181246b;

            {
                this.f181246b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x04e9  */
            /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.coroutines.Continuation] */
            /* JADX WARN: Type inference failed for: r15v14 */
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
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r28) {
                /*
                    Method dump skipped, instruction units count: 2016
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: k50.t1.invoke(java.lang.Object):java.lang.Object");
            }
        });
        RateEmojiDelegate rateEmojiDelegate = this.f51183e0;
        final int i103 = 17;
        d3(rateEmojiDelegate.f53143c, new Function1(this) { // from class: k50.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessagesScreen f181246b;

            {
                this.f181246b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x04e9  */
            /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.coroutines.Continuation] */
            /* JADX WARN: Type inference failed for: r15v14 */
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
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r28) {
                /*
                    Method dump skipped, instruction units count: 2016
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: k50.t1.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final int i104 = 18;
        d3(rateEmojiDelegate.e, new Function1(this) { // from class: k50.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessagesScreen f181246b;

            {
                this.f181246b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x04e9  */
            /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.coroutines.Continuation] */
            /* JADX WARN: Type inference failed for: r15v14 */
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
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r28) {
                /*
                    Method dump skipped, instruction units count: 2016
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: k50.t1.invoke(java.lang.Object):java.lang.Object");
            }
        });
        RateOneClickDelegate rateOneClickDelegate = this.f0;
        r rVarHide = rateOneClickDelegate.f53145c.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        final int i105 = 19;
        d3(rVarHide, new Function1(this) { // from class: k50.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessagesScreen f181246b;

            {
                this.f181246b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x04e9  */
            /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.coroutines.Continuation] */
            /* JADX WARN: Type inference failed for: r15v14 */
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
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r28) {
                /*
                    Method dump skipped, instruction units count: 2016
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: k50.t1.invoke(java.lang.Object):java.lang.Object");
            }
        });
        r rVarHide2 = rateOneClickDelegate.d.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide2, "hide(...)");
        final int i106 = 20;
        d3(rVarHide2, new Function1(this) { // from class: k50.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessagesScreen f181246b;

            {
                this.f181246b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x04e9  */
            /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.coroutines.Continuation] */
            /* JADX WARN: Type inference failed for: r15v14 */
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
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r28) {
                /*
                    Method dump skipped, instruction units count: 2016
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: k50.t1.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final int i107 = 22;
        d3(this.V.k, new Function1(this) { // from class: k50.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessagesScreen f181246b;

            {
                this.f181246b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x04e9  */
            /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.coroutines.Continuation] */
            /* JADX WARN: Type inference failed for: r15v14 */
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
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r28) {
                /*
                    Method dump skipped, instruction units count: 2016
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: k50.t1.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final int i108 = 23;
        d3(this.Z.k, new Function1(this) { // from class: k50.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessagesScreen f181246b;

            {
                this.f181246b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x04e9  */
            /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.coroutines.Continuation] */
            /* JADX WARN: Type inference failed for: r15v14 */
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
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r28) {
                /*
                    Method dump skipped, instruction units count: 2016
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: k50.t1.invoke(java.lang.Object):java.lang.Object");
            }
        });
        ChatPromptView chatPromptView = f3().k;
        ihm.f fVar = chatPromptView.f51544q.f8043a;
        RowDelegate rowDelegate = chatPromptView.o;
        r rVarMerge5 = r.merge(rowDelegate.f53218h, rowDelegate.f53220l);
        Intrinsics.checkNotNullExpressionValue(rVarMerge5, "merge(...)");
        r rVarMerge6 = r.merge(fVar, w.a0(rVarMerge5, new p(21)));
        Intrinsics.checkNotNullExpressionValue(rVarMerge6, "merge(...)");
        final int i109 = 24;
        d3(rVarMerge6, new Function1(this) { // from class: k50.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessagesScreen f181246b;

            {
                this.f181246b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x04e9  */
            /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.coroutines.Continuation] */
            /* JADX WARN: Type inference failed for: r15v14 */
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
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r28) {
                /*
                    Method dump skipped, instruction units count: 2016
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: k50.t1.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final int i110 = 26;
        d3(this.f51184h0.f51549c, new Function1(this) { // from class: k50.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessagesScreen f181246b;

            {
                this.f181246b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x04e9  */
            /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.coroutines.Continuation] */
            /* JADX WARN: Type inference failed for: r15v14 */
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
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r28) {
                /*
                    Method dump skipped, instruction units count: 2016
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: k50.t1.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final int i111 = 27;
        d3(((ChatVoiceMessageBubbleDelegate) this.Y.getValue()).f53928m, new Function1(this) { // from class: k50.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessagesScreen f181246b;

            {
                this.f181246b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x04e9  */
            /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.coroutines.Continuation] */
            /* JADX WARN: Type inference failed for: r15v14 */
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
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r28) {
                /*
                    Method dump skipped, instruction units count: 2016
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: k50.t1.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final int i112 = 28;
        d3(f3().f1526h.getInputView().O, new Function1(this) { // from class: k50.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessagesScreen f181246b;

            {
                this.f181246b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x04e9  */
            /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.coroutines.Continuation] */
            /* JADX WARN: Type inference failed for: r15v14 */
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
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r28) {
                /*
                    Method dump skipped, instruction units count: 2016
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: k50.t1.invoke(java.lang.Object):java.lang.Object");
            }
        });
        ChatTableDelegate chatTableDelegate = this.g0;
        final int i113 = 29;
        d3(chatTableDelegate.d, new Function1(this) { // from class: k50.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MessagesScreen f181246b;

            {
                this.f181246b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x04e9  */
            /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.coroutines.Continuation] */
            /* JADX WARN: Type inference failed for: r15v14 */
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
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r28) {
                /*
                    Method dump skipped, instruction units count: 2016
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: k50.t1.invoke(java.lang.Object):java.lang.Object");
            }
        });
        d3(chatTableDelegate.f, new u1(this, 0));
        d3(f3().f1526h.getInputView().c0, new u1(this, 1));
        d3(f3().f1526h.getInputView().f58450d0, new u1(this, 3));
        d dVar2 = this.D0;
        if (dVar2 != null) {
            u1 onClick = new u1(this, 4);
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            dVar2.o.setOnClickListener(new x(dVar2, onClick, 1));
        }
        ViewController.P2(this, ((j4) R2()).T.c3(), new c2(this, continuation, 4), 3);
    }

    public final void d3(r rVar, Function1 function1) {
        ViewController.P2(this, rd0.e.b(rVar), new b2(2, function1, kotlin.jvm.internal.s.class, "suspendConversion0", "bind$suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0), 3);
    }

    public final ap0.j e3() {
        int childCount = f3().f1528l.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView.ViewHolder childViewHolder = f3().f1528l.getChildViewHolder(f3().f1528l.getChildAt(i));
            if (childViewHolder instanceof ap0.j) {
                return (ap0.j) childViewHolder;
            }
        }
        return null;
    }

    public final a60.g f3() {
        ViewBinding value = this.N.getValue(this, F0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (a60.g) value;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final void g1(boolean z) {
        super.g1(z);
        if (z) {
            j3();
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final t R1() {
        return (t) this.f51192w0.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.f51191v0;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final w0 R2() {
        return (w0) this.f51193x0.getValue();
    }

    public final boolean i3() {
        ScreenContentRecyclerView recyclerView = f3().f1528l;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        return recyclerView.computeVerticalScrollRange() - (recyclerView.computeVerticalScrollOffset() + recyclerView.computeVerticalScrollExtent()) >= ((Number) this.E0.getValue()).intValue();
    }

    public final void j3() {
        ((j4) R2()).f181133r0.U(Unit.f186387a);
        s1 s1Var = this.C0;
        if (s1Var == null) {
            Intrinsics.r("paneCoordinator");
            throw null;
        }
        s1Var.f181236m = 3;
        o3();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.y0.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k3(java.lang.String r13) {
        /*
            r12 = this;
            k50.w0 r0 = r12.R2()
            k50.j4 r0 = (k50.j4) r0
            r0.getClass()
            java.lang.String r1 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
            k50.p r1 = r0.f181126h0
            r1.getClass()
            java.lang.String r2 = "link"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r2)
            k50.r r2 = r1.a(r13)
            r3 = -1
            if (r2 != 0) goto L21
            r2 = r3
            goto L29
        L21:
            int[] r4 = k50.o.f181191a
            int r2 = r2.ordinal()
            r2 = r4[r2]
        L29:
            r4 = 1
            r5 = 0
            if (r2 == r3) goto L4d
            if (r2 != r4) goto L47
            f80.a r1 = r1.f181203b     // Catch: java.lang.Exception -> L4d
            f80.b r1 = (f80.b) r1     // Catch: java.lang.Exception -> L4d
            android.net.Uri r1 = r1.f(r13)     // Catch: java.lang.Exception -> L4d
            java.lang.String r2 = "prompt"
            java.lang.String r1 = r1.getQueryParameter(r2)     // Catch: java.lang.Exception -> L4d
            if (r1 == 0) goto L4d
            k50.r r2 = k50.r.FOLLOW_UP     // Catch: java.lang.Exception -> L4d
            k50.q r3 = new k50.q     // Catch: java.lang.Exception -> L4d
            r3.<init>(r2, r1)     // Catch: java.lang.Exception -> L4d
            goto L4e
        L47:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L4d:
            r3 = r5
        L4e:
            r1 = 0
            if (r3 == 0) goto L86
            k50.r r13 = r3.f181210a
            int[] r2 = k50.t2.d
            int r13 = r13.ordinal()
            r13 = r2[r13]
            if (r13 != r4) goto L80
            java.lang.String r7 = r3.f181211b
            i90.b r13 = r0.R
            java.util.UUID r8 = r13.a()
            com.revolut.chat.domain.model.ChatMessageToPass r6 = new com.revolut.chat.domain.model.ChatMessageToPass
            r10 = 0
            r9 = 0
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            v20.z0 r13 = new v20.z0
            com.revolut.chat.domain.model.MessageType r2 = new com.revolut.chat.domain.model.MessageType
            java.lang.String r3 = "follow-up"
            r2.<init>(r3, r5)
            r3 = 29
            r13.<init>(r2, r3)
            r0.u3(r6, r5, r13)
            r13 = r4
            goto L97
        L80:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L86:
            k50.s3 r2 = new k50.s3
            r3 = 0
            r2.<init>(r0, r13, r5, r3)
            yi5.b r13 = new yi5.b
            r3 = 26
            r13.<init>(r3)
            r0.l2(r2, r13)
            r13 = r1
        L97:
            boolean r0 = r12.p0
            if (r0 != 0) goto L9f
            if (r13 == 0) goto L9e
            goto L9f
        L9e:
            r4 = r1
        L9f:
            r12.p0 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.chat.ui.messageslist.MessagesScreen.k3(java.lang.String):void");
    }

    public final ChatInputView l3() {
        FrameLayout bottomContainer = f3().d;
        Intrinsics.checkNotNullExpressionValue(bottomContainer, "bottomContainer");
        bottomContainer.setVisibility(8);
        ChatInputLayoutView inputLayout = f3().f1526h;
        Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
        inputLayout.setVisibility(0);
        return f3().f1526h.getInputView();
    }

    public final void m3(boolean z) {
        if (this.f51189s0 == 0) {
            return;
        }
        this.f51189s0 = 0;
        SmallActionButton fab2 = f3().f;
        Intrinsics.checkNotNullExpressionValue(fab2, "fab");
        fab2.animate().cancel();
        if (fab2.getVisibility() != 0) {
            Context context = f3().f1528l.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            fab2.setTranslationY(kli.a.l(context, 8.0f));
            fab2.setAlpha(BitmapDescriptorFactory.HUE_RED);
            fab2.setVisibility(0);
            Space fabAnchor = f3().f1525g;
            Intrinsics.checkNotNullExpressionValue(fabAnchor, "fabAnchor");
            fabAnchor.setVisibility(0);
        }
        fab2.animate().translationY(BitmapDescriptorFactory.HUE_RED).alpha(1.0f).setInterpolator(new DecelerateInterpolator(1.5f)).setDuration(z ? 0L : 350L).start();
    }

    public final void n3(boolean z) {
        if (this.f51189s0 == 1) {
            return;
        }
        this.f51189s0 = 1;
        SmallActionButton fab2 = f3().f;
        Intrinsics.checkNotNullExpressionValue(fab2, "fab");
        fab2.animate().cancel();
        ViewPropertyAnimator viewPropertyAnimatorAnimate = fab2.animate();
        Context context = fab2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        viewPropertyAnimatorAnimate.translationY(kli.a.l(context, 8.0f)).alpha(BitmapDescriptorFactory.HUE_RED).setInterpolator(new AccelerateInterpolator(1.5f)).setDuration(z ? 0L : 350L).withEndAction(new x1(this, 1)).start();
    }

    public final void o3() {
        if (this.f51186n0 == 1) {
            s1 s1Var = this.C0;
            if (s1Var == null) {
                Intrinsics.r("paneCoordinator");
                throw null;
            }
            if (s1Var.f181236m != 3) {
                return;
            }
            this.f51186n0 = 3;
            f3().f1526h.getInputView().c0();
        }
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: r2 */
    public final Boolean getN() {
        return Boolean.FALSE;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final void u(boolean z) {
        super.u(z);
        if (z) {
            s1 s1Var = this.C0;
            if (s1Var != null) {
                s1Var.f181236m = 2;
            } else {
                Intrinsics.r("paneCoordinator");
                throw null;
            }
        }
    }
}
