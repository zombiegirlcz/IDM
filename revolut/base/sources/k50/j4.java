package k50;

import android.os.Parcelable;
import com.revolut.chat.ChatApi$Toggles;
import com.revolut.chat.data.repository.chat.ChatAgent;
import com.revolut.chat.data.repository.chat.User;
import com.revolut.chat.domain.model.ChatFeed;
import com.revolut.chat.domain.model.ChatMessageToPass;
import com.revolut.chat.domain.model.ChatMode;
import com.revolut.chat.domain.model.InitialMessage;
import com.revolut.chat.domain.model.LastMessage;
import com.revolut.chat.domain.model.MessageType;
import com.revolut.chat.domain.model.NewTicketContext;
import com.revolut.chat.domain.model.TicketCreationContext;
import com.revolut.chat.domain.model.TranscriptIdentifier;
import com.revolut.chat.ui.messageslist.MessagesContract$InputData;
import com.revolut.chat.ui.ratechatexpression.proxy.RateChatProxyScreen;
import com.revolut.chat_core.R$string;
import com.revolut.core.network.exceptions.NetworkConnectException;
import com.revolut.data.model.Data;
import com.revolut.kompot.common.ModalDestination;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;
import org.joda.time.ReadableInstant;
import p50.e;

/* JADX INFO: loaded from: classes19.dex */
public final class j4 extends oki.h implements w0 {
    public static final long A0;
    public static final UUID B0;

    @NotNull
    public static final p2 Companion = new p2();
    public final n30.z A;
    public final c70.a B;
    public final f0 C;
    public final a0 D;
    public final r70.c E;
    public final n0 F;
    public final v40.b G;
    public final n50.h H;
    public final r30.a I;
    public final q1 J;
    public final y20.g0 K;
    public final p50.e L;
    public final s30.b M;
    public final p1 N;
    public final d4m.a O;
    public final urg.a P;
    public final f01.a Q;
    public final i90.b R;
    public final m4 S;
    public final l40.a T;
    public final df0.b U;
    public final l80.e V;
    public final s50.e W;
    public final t30.f X;
    public final rp0.l0 Y;
    public final md0.b Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final l30.b f181122a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final q50.o f181123b0;
    public final b0 c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final n50.b f181124d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final j50.l f181125e0;
    public final i0 f0;
    public final p0 g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final p f181126h0;
    public final CoroutineScope i0;
    public final vkm.j2 j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final vkm.j2 f181127k0;
    public final oji.j l0;
    public final oji.j m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final vkm.z1 f181128n0;
    public final MessagesContract$InputData o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public skm.a2 f181129o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z70.a f181130p;
    public final hlm.c p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k30.a f181131q;
    public final LinkedHashSet q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final jpc.e f181132r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public volatile skm.r f181133r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j30.c f181134s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final InitialMessage f181135s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n30.n f181136t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public TicketCreationContext f181137t0;
    public final tf3.b u;
    public final Lazy u0;
    public final n30.v v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public List f181138v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final n30.x f181139w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final cli.y f181140w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final w50.k f181141x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Lazy f181142x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final be7.e f181143y;
    public final boolean y0;
    public final c40.b z;
    public final boolean z0;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        A0 = kotlin.time.c.g(300, pkm.e.MILLISECONDS);
        B0 = new UUID(0L, 0L);
    }

    public j4(MessagesContract$InputData inputData, z70.a contextProvider, k30.a agentInteractor, jpc.e callRequestTicketsInteractor, j30.c chatFeatureToggles, n30.n chatInteractor, tf3.b chatAuthorizationStatus, n30.v chatModeResolver, n30.x chatPricingPlanInteractor, w50.k chatTranscriptPresentationDelegate, be7.e chatVisibilityObserver, c40.b chatScreenVisibilityObserver, n30.z chatWebSocketInteractor, c70.a clipboard, f0 chatDeeplinkExtension, a0 eagerHistoryExtension, r70.c hapticEngine, n0 mediaExtension, v40.b messageTooLongHandler, n50.h messagesBottomSheetItemsFactory, r30.a messagesInteractor, q1 messagesMerger, y20.g0 messagesRepository, p50.e pagingSource, s30.b rateInteractor, p1 stateMapper, d4m.a submitChatSuggestedActionInteractor, urg.a recordAudioViewModelControllerModelExtension, f01.a uiKitResources, i90.b uuidGenerator, m4 typingCoordinator, l40.a chatVoiceCallExtension, df0.b syncedDateProvider, l80.e dateProvider, s50.e chatRatingShotDelegate, t30.f suggestionsInteractor, rp0.l0 popupMenuDialogDisplayer, md0.b chaosManagementInteractor, l30.b assistantChatUpdatesProvider, q50.o chatWidgetsExtension, b0 messageInGroupDataMapper, n50.b chatMessagePreviewExtractor, j50.l messageFeedbackExtension, i0 draftExtension, p0 messageSearchIndexingExtension, p revolutChatEntityInteractor, CoroutineScope appCoroutineScope) {
        InitialMessage initialMessage;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(agentInteractor, "agentInteractor");
        Intrinsics.checkNotNullParameter(callRequestTicketsInteractor, "callRequestTicketsInteractor");
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        Intrinsics.checkNotNullParameter(chatInteractor, "chatInteractor");
        Intrinsics.checkNotNullParameter(chatAuthorizationStatus, "chatAuthorizationStatus");
        Intrinsics.checkNotNullParameter(chatModeResolver, "chatModeResolver");
        Intrinsics.checkNotNullParameter(chatPricingPlanInteractor, "chatPricingPlanInteractor");
        Intrinsics.checkNotNullParameter(chatTranscriptPresentationDelegate, "chatTranscriptPresentationDelegate");
        Intrinsics.checkNotNullParameter(chatVisibilityObserver, "chatVisibilityObserver");
        Intrinsics.checkNotNullParameter(chatScreenVisibilityObserver, "chatScreenVisibilityObserver");
        Intrinsics.checkNotNullParameter(chatWebSocketInteractor, "chatWebSocketInteractor");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(chatDeeplinkExtension, "chatDeeplinkExtension");
        Intrinsics.checkNotNullParameter(eagerHistoryExtension, "eagerHistoryExtension");
        Intrinsics.checkNotNullParameter(hapticEngine, "hapticEngine");
        Intrinsics.checkNotNullParameter(mediaExtension, "mediaExtension");
        Intrinsics.checkNotNullParameter(messageTooLongHandler, "messageTooLongHandler");
        Intrinsics.checkNotNullParameter(messagesBottomSheetItemsFactory, "messagesBottomSheetItemsFactory");
        Intrinsics.checkNotNullParameter(messagesInteractor, "messagesInteractor");
        Intrinsics.checkNotNullParameter(messagesMerger, "messagesMerger");
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        Intrinsics.checkNotNullParameter(pagingSource, "pagingSource");
        Intrinsics.checkNotNullParameter(rateInteractor, "rateInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(submitChatSuggestedActionInteractor, "submitChatSuggestedActionInteractor");
        Intrinsics.checkNotNullParameter(recordAudioViewModelControllerModelExtension, "recordAudioViewModelControllerModelExtension");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        Intrinsics.checkNotNullParameter(typingCoordinator, "typingCoordinator");
        Intrinsics.checkNotNullParameter(chatVoiceCallExtension, "chatVoiceCallExtension");
        Intrinsics.checkNotNullParameter(syncedDateProvider, "syncedDateProvider");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(chatRatingShotDelegate, "chatRatingShotDelegate");
        Intrinsics.checkNotNullParameter(suggestionsInteractor, "suggestionsInteractor");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(chaosManagementInteractor, "chaosManagementInteractor");
        Intrinsics.checkNotNullParameter(assistantChatUpdatesProvider, "assistantChatUpdatesProvider");
        Intrinsics.checkNotNullParameter(chatWidgetsExtension, "chatWidgetsExtension");
        Intrinsics.checkNotNullParameter(messageInGroupDataMapper, "messageInGroupDataMapper");
        Intrinsics.checkNotNullParameter(chatMessagePreviewExtractor, "chatMessagePreviewExtractor");
        Intrinsics.checkNotNullParameter(messageFeedbackExtension, "messageFeedbackExtension");
        Intrinsics.checkNotNullParameter(draftExtension, "draftExtension");
        Intrinsics.checkNotNullParameter(messageSearchIndexingExtension, "messageSearchIndexingExtension");
        Intrinsics.checkNotNullParameter(revolutChatEntityInteractor, "revolutChatEntityInteractor");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        this.o = inputData;
        this.f181130p = contextProvider;
        this.f181131q = agentInteractor;
        this.f181132r = callRequestTicketsInteractor;
        this.f181134s = chatFeatureToggles;
        this.f181136t = chatInteractor;
        this.u = chatAuthorizationStatus;
        this.v = chatModeResolver;
        this.f181139w = chatPricingPlanInteractor;
        this.f181141x = chatTranscriptPresentationDelegate;
        this.f181143y = chatVisibilityObserver;
        this.z = chatScreenVisibilityObserver;
        this.A = chatWebSocketInteractor;
        this.B = clipboard;
        this.C = chatDeeplinkExtension;
        this.D = eagerHistoryExtension;
        this.E = hapticEngine;
        this.F = mediaExtension;
        this.G = messageTooLongHandler;
        this.H = messagesBottomSheetItemsFactory;
        this.I = messagesInteractor;
        this.J = messagesMerger;
        this.K = messagesRepository;
        this.L = pagingSource;
        this.M = rateInteractor;
        this.N = stateMapper;
        this.O = submitChatSuggestedActionInteractor;
        this.P = recordAudioViewModelControllerModelExtension;
        this.Q = uiKitResources;
        this.R = uuidGenerator;
        this.S = typingCoordinator;
        this.T = chatVoiceCallExtension;
        this.U = syncedDateProvider;
        this.V = dateProvider;
        this.W = chatRatingShotDelegate;
        this.X = suggestionsInteractor;
        this.Y = popupMenuDialogDisplayer;
        this.Z = chaosManagementInteractor;
        this.f181122a0 = assistantChatUpdatesProvider;
        this.f181123b0 = chatWidgetsExtension;
        this.c0 = messageInGroupDataMapper;
        this.f181124d0 = chatMessagePreviewExtractor;
        this.f181125e0 = messageFeedbackExtension;
        this.f0 = draftExtension;
        this.g0 = messageSearchIndexingExtension;
        this.f181126h0 = revolutChatEntityInteractor;
        this.i0 = appCoroutineScope;
        this.j0 = vkm.q.c(inputData.a());
        s2.Companion.getClass();
        this.f181127k0 = vkm.q.c(s2.f181237c);
        this.l0 = new oji.j();
        this.m0 = new oji.j();
        this.f181128n0 = vkm.q.b(100, 1, ukm.f.DROP_OLDEST);
        this.p0 = hlm.d.a();
        this.q0 = new LinkedHashSet();
        this.f181133r0 = skm.e0.b();
        ChatFeed chatFeed = inputData.f51174a;
        if (chatFeed instanceof ChatFeed.Assistant) {
            initialMessage = ((ChatFeed.Assistant) chatFeed).f51030b;
        } else {
            if (!(chatFeed instanceof ChatFeed.PrivateBanking) && !(chatFeed instanceof ChatFeed.Support)) {
                throw new NoWhenBranchMatchedException();
            }
            initialMessage = null;
        }
        this.f181135s0 = initialMessage;
        ChatFeed.Support support = chatFeed instanceof ChatFeed.Support ? (ChatFeed.Support) chatFeed : null;
        this.f181137t0 = support != null ? support.f51035c : null;
        this.u0 = yhm.j.b(new m2(this, 1));
        zhm.f0 f0Var = zhm.f0.f322471a;
        this.f181138v0 = f0Var;
        k4 k4Var = new k4();
        UUID uuidA = inputData.a();
        Data data = new Data(null, null, true, 3, null);
        Data data2 = new Data(null, null, true, 3, null);
        m1 m1Var = new m1(f0Var, f0Var, f0Var, f0Var, null, null, zhm.r0.g(), 0, zhm.r0.g());
        v30.i iVar = new v30.i(true, new Data(null, null, true, 3, null), false, new Data(null, null, true, 3, null), false);
        o0 o0Var = new o0(0);
        v30.c0 c0VarS0 = inputData.f51174a.s0();
        v30.c0 c0VarS02 = inputData.f51174a.s0();
        v30.c0 c0Var = v30.c0.ASSISTANT;
        boolean z = c0VarS02 == c0Var;
        rf3.d dVar = (rf3.d) chatFeatureToggles;
        boolean zC = dVar.c();
        boolean z3 = ((jte.d) dVar.f253679a).c(ChatApi$Toggles.AssistantSuggestionsV3.f50970c) && inputData.f51174a.s0() == c0Var;
        boolean zC2 = ((jte.d) dVar.f253679a).c(ChatApi$Toggles.FloatingDatePill.f50982c);
        v30.s sVar = v30.s.NONE;
        b1 b1Var = new b1(0);
        v0 v0Var = v0.MESSAGES;
        Map mapG = zhm.r0.g();
        a1.Companion.getClass();
        cli.y yVarA = mra.d.a(this, new h0(uuidA, data, data2, m1Var, o0Var, iVar, null, c0VarS0, null, sVar, false, false, zC, z, z3, null, null, b1Var, null, true, null, null, null, v0Var, null, mapG, a1.f, zC2), stateMapper, k4Var, true);
        this.f181140w0 = yVarA;
        this.f181142x0 = yhm.j.b(new m2(this, 2));
        this.y0 = ((h0) ((vkm.j2) yVarA.f22677a).getValue()).o;
        this.z0 = ((h0) ((vkm.j2) yVarA.f22677a).getValue()).B;
    }

    public static final void I2(j4 j4Var, List list) {
        q50.o oVar = j4Var.f181123b0;
        cli.y yVar = j4Var.f181140w0;
        if (list.isEmpty()) {
            return;
        }
        for (Object obj2 : list) {
            if ((obj2 instanceof v20.k1) && ((v20.k1) obj2).getSendingStatus() == v20.b1.FAILURE) {
                j4Var.H2(yVar, new k0d.c(obj2, 24));
            }
        }
        oVar.Z2();
        j4Var.H2(yVar, new j2(j4Var, list, 0));
        oVar.i3();
    }

    public static final h0 J2(j4 j4Var, h0 h0Var) {
        m1 m1Var = h0Var.d;
        v20.n nVar = m1Var.f;
        List list = m1Var.f181178a;
        Object obj2 = null;
        if (nVar != null) {
            v20.n nVar2 = (v20.n) zhm.d0.o0(list);
            if (nVar2 != null && nVar2.getTime().compareTo((ReadableInstant) nVar.getTime()) > 0) {
                int iJ = zhm.v.j(list);
                while (true) {
                    if (-1 >= iJ) {
                        break;
                    }
                    Object obj3 = list.get(iJ);
                    v20.n nVar3 = (v20.n) obj3;
                    if (!(nVar3.getAuthor() instanceof User) && d8l.d.p(nVar3)) {
                        obj2 = obj3;
                        break;
                    }
                    iJ--;
                }
                v20.n nVar4 = (v20.n) obj2;
                if (nVar4 != null && nVar4.getTime().compareTo((ReadableInstant) nVar.getTime()) > 0) {
                    return h0.a(h0Var, null, null, null, m1.a(h0Var.d, null, null, null, null, null, nVar4, null, 0, null, 959), null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, null, null, null, 268435447);
                }
            }
        } else {
            Data data = h0Var.f181080b;
            if (data.getLoading()) {
                data = null;
            }
            v30.j jVar = data != null ? (v30.j) data.getContent() : null;
            if (jVar != null) {
                LastMessage lastMessage = jVar.f285790j;
                UUID serverId = lastMessage != null ? lastMessage.getServerId() : null;
                if (serverId != null) {
                    for (int iJ2 = zhm.v.j(list); -1 < iJ2; iJ2--) {
                        Object obj4 = list.get(iJ2);
                        v20.n nVar5 = (v20.n) obj4;
                        if (Intrinsics.f(nVar5.getServerId(), serverId) || (!(nVar5.getAuthor() instanceof User) && d8l.d.p(nVar5))) {
                            obj2 = obj4;
                            break;
                        }
                    }
                    v20.n nVar6 = (v20.n) obj2;
                    if (nVar6 != null) {
                        return h0.a(h0Var, null, null, null, m1.a(h0Var.d, null, null, null, null, null, nVar6, null, 0, null, 959), null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, null, null, null, 268435447);
                    }
                }
            }
        }
        return h0Var;
    }

    public static final h0 K2(j4 j4Var, h0 h0Var) {
        v30.j jVar;
        t0 t0Var = h0Var.f181088p;
        Data data = h0Var.f181080b;
        if (t0Var == null && (jVar = (v30.j) data.getContent()) != null) {
            UUID uuid = jVar.f285791l;
            if (uuid != null) {
                return h0.a(h0Var, null, null, null, null, null, null, null, null, null, null, false, false, new s0(jVar.k, uuid), null, null, null, false, null, null, null, null, null, null, null, 268402687);
            }
            if (!data.getLoading()) {
                return h0.a(h0Var, null, null, null, null, null, null, null, null, null, null, false, false, r0.f181222a, null, null, null, false, null, null, null, null, null, null, null, 268402687);
            }
        }
        return h0Var;
    }

    public static final Object L2(j4 j4Var, y20.p pVar, List list, Function1 function1, gim.i iVar) {
        Object cVar;
        q50.o oVar = j4Var.f181123b0;
        List list2 = list;
        boolean z = false;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it8 = list2.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                if (((v20.n) it8.next()) instanceof v20.j0) {
                    z = true;
                    break;
                }
            }
        }
        boolean z3 = z;
        oVar.Z2();
        j4Var.H2(j4Var.f181140w0, new ard.t(j4Var, list, z3, function1, 12));
        oVar.i3();
        v20.n nVar = (v20.n) zhm.d0.b0(list);
        if (pVar instanceof y20.m) {
            cVar = new p50.a(((y20.m) pVar).f310523a, nVar.getTime());
        } else if (pVar instanceof y20.n) {
            cVar = new p50.b(((y20.n) pVar).f310525a, nVar.getServerId());
        } else {
            if (!(pVar instanceof y20.o)) {
                throw new NoWhenBranchMatchedException();
            }
            cVar = new p50.c(nVar.getServerId(), ((y20.o) pVar).f310529a);
        }
        Object objL = j4Var.L.l(cVar, iVar);
        return objL == fim.a.COROUTINE_SUSPENDED ? objL : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e5, code lost:
    
        if (r9.collect(r0, r1) == r2) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object M2(k50.j4 r8, gim.c r9) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.j4.M2(k50.j4, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
    
        if (r8.collect(r2, r0) != r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N2(k50.j4 r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof k50.i3
            if (r0 == 0) goto L13
            r0 = r8
            k50.i3 r0 = (k50.i3) r0
            int r1 = r0.f181110x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f181110x = r1
            goto L18
        L13:
            k50.i3 r0 = new k50.i3
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f181110x
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r8)
            goto La1
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            com.revolut.chat.domain.model.ChatMode r2 = r0.u
            yhm.o.b(r8)
            goto L65
        L3c:
            yhm.o.b(r8)
            goto L4c
        L40:
            yhm.o.b(r8)
            r0.f181110x = r5
            java.lang.Object r8 = r7.c3(r0)
            if (r8 != r1) goto L4c
            goto La0
        L4c:
            r2 = r8
            com.revolut.chat.domain.model.ChatMode r2 = (com.revolut.chat.domain.model.ChatMode) r2
            boolean r8 = r2 instanceof com.revolut.chat.domain.model.ChatMode.Default
            if (r8 == 0) goto L56
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L56:
            skm.a2 r8 = r7.f181129o0
            if (r8 == 0) goto L65
            r0.u = r2
            r0.f181110x = r4
            java.lang.Object r8 = r8.u(r0)
            if (r8 != r1) goto L65
            goto La0
        L65:
            boolean r8 = r2 instanceof com.revolut.chat.domain.model.ChatMode.Feed
            r4 = 0
            if (r8 == 0) goto L6d
            com.revolut.chat.domain.model.ChatMode$Feed r2 = (com.revolut.chat.domain.model.ChatMode.Feed) r2
            goto L6e
        L6d:
            r2 = r4
        L6e:
            if (r2 == 0) goto L73
            java.util.UUID r8 = r2.f51044a
            goto L74
        L73:
            r8 = r4
        L74:
            n30.n r2 = r7.f181136t
            r2.getClass()
            java.lang.String r5 = "loadingStrategy"
            w4l.i r6 = w4l.i.f294643c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r5)
            v20.o r2 = r2.f211647a
            v20.f0 r2 = (v20.f0) r2
            efm.r r8 = r2.n(r8, r6)
            vkm.d r8 = rd0.e.b(r8)
            vkm.v1 r8 = c8g.a.D(r8)
            k50.h3 r2 = new k50.h3
            r5 = 1
            r2.<init>(r7, r5)
            r0.u = r4
            r0.f181110x = r3
            java.lang.Object r7 = r8.collect(r2, r0)
            if (r7 != r1) goto La1
        La0:
            return r1
        La1:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.j4.N2(k50.j4, gim.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0070: MOVE (r11 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:29:0x0070 */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:70:0x0145, B:74:0x0151, B:75:0x0157, B:72:0x0149, B:58:0x010b, B:60:0x010f, B:62:0x0117, B:52:0x00de, B:54:0x00e6, B:66:0x0120, B:48:0x00c7, B:38:0x00a3, B:40:0x00a7), top: B:85:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:70:0x0145, B:74:0x0151, B:75:0x0157, B:72:0x0149, B:58:0x010b, B:60:0x010f, B:62:0x0117, B:52:0x00de, B:54:0x00e6, B:66:0x0120, B:48:0x00c7, B:38:0x00a3, B:40:0x00a7), top: B:85:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010f A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:70:0x0145, B:74:0x0151, B:75:0x0157, B:72:0x0149, B:58:0x010b, B:60:0x010f, B:62:0x0117, B:52:0x00de, B:54:0x00e6, B:66:0x0120, B:48:0x00c7, B:38:0x00a3, B:40:0x00a7), top: B:85:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011e A[PHI: r3 r4 r12 r13
      0x011e: PHI (r3v19 int) = (r3v15 int), (r3v15 int), (r3v15 int), (r3v20 int) binds: [B:59:0x010d, B:61:0x0115, B:63:0x011b, B:71:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x011e: PHI (r4v8 com.revolut.chat.domain.model.ChatMessageToPass) = 
      (r4v5 com.revolut.chat.domain.model.ChatMessageToPass)
      (r4v5 com.revolut.chat.domain.model.ChatMessageToPass)
      (r4v5 com.revolut.chat.domain.model.ChatMessageToPass)
      (r4v9 com.revolut.chat.domain.model.ChatMessageToPass)
     binds: [B:59:0x010d, B:61:0x0115, B:63:0x011b, B:71:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x011e: PHI (r12v20 int) = (r12v16 int), (r12v16 int), (r12v16 int), (r12v21 int) binds: [B:59:0x010d, B:61:0x0115, B:63:0x011b, B:71:0x0147] A[DONT_GENERATE, DONT_INLINE]
      0x011e: PHI (r13v13 hlm.a) = (r13v21 hlm.a), (r13v22 hlm.a), (r13v23 hlm.a), (r13v24 hlm.a) binds: [B:59:0x010d, B:61:0x0115, B:63:0x011b, B:71:0x0147] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0120 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:70:0x0145, B:74:0x0151, B:75:0x0157, B:72:0x0149, B:58:0x010b, B:60:0x010f, B:62:0x0117, B:52:0x00de, B:54:0x00e6, B:66:0x0120, B:48:0x00c7, B:38:0x00a3, B:40:0x00a7), top: B:85:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0149 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:70:0x0145, B:74:0x0151, B:75:0x0157, B:72:0x0149, B:58:0x010b, B:60:0x010f, B:62:0x0117, B:52:0x00de, B:54:0x00e6, B:66:0x0120, B:48:0x00c7, B:38:0x00a3, B:40:0x00a7), top: B:85:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0151 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:70:0x0145, B:74:0x0151, B:75:0x0157, B:72:0x0149, B:58:0x010b, B:60:0x010f, B:62:0x0117, B:52:0x00de, B:54:0x00e6, B:66:0x0120, B:48:0x00c7, B:38:0x00a3, B:40:0x00a7), top: B:85:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0157 A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #0 {all -> 0x00c1, blocks: (B:70:0x0145, B:74:0x0151, B:75:0x0157, B:72:0x0149, B:58:0x010b, B:60:0x010f, B:62:0x0117, B:52:0x00de, B:54:0x00e6, B:66:0x0120, B:48:0x00c7, B:38:0x00a3, B:40:0x00a7), top: B:85:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r11v0, types: [k50.j4] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v12, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r13v16, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O2(k50.j4 r11, com.revolut.chat.domain.model.ChatMessageToPass r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.j4.O2(k50.j4, com.revolut.chat.domain.model.ChatMessageToPass, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        if (nim.a.a(r5, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P2(k50.j4 r5, java.util.UUID r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof k50.l3
            if (r0 == 0) goto L13
            r0 = r7
            k50.l3 r0 = (k50.l3) r0
            int r1 = r0.f181168x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f181168x = r1
            goto L18
        L13:
            k50.l3 r0 = new k50.l3
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f181168x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L75
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            java.util.UUID r6 = r0.u
            yhm.o.b(r7)
            goto L46
        L38:
            yhm.o.b(r7)
            r0.u = r6
            r0.f181168x = r4
            java.lang.Object r7 = r5.g3(r0)
            if (r7 != r1) goto L46
            goto L74
        L46:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L78
            n30.n r5 = r5.f181136t
            r5.getClass()
            java.lang.String r7 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            v20.o r5 = r5.f211647a
            v20.f0 r5 = (v20.f0) r5
            r5.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            w4l.f r5 = r5.f285394r
            r7 = 0
            efm.b r5 = r5.g(r6, r7)
            r6 = 0
            r0.u = r6
            r0.f181168x = r3
            java.lang.Object r5 = nim.a.a(r5, r0)
            if (r5 != r1) goto L75
        L74:
            return r1
        L75:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L78:
            k50.u0 r6 = k50.u0.f181253a
            r5.C2(r6)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.j4.P2(k50.j4, java.util.UUID, gim.c):java.lang.Object");
    }

    public static final void Q2(j4 j4Var, v30.j jVar) {
        cli.y yVar = j4Var.f181140w0;
        UUID uuid = ((h0) ((vkm.j2) yVar.f22677a).getValue()).f181079a;
        if (uuid != null && jVar.f285793n.compareTo((ReadableInstant) Instant.ofEpochMilli(j4Var.U.a().toEpochMilli())) >= 0 && ((h0) ((vkm.j2) yVar.f22677a).getValue()).d.f181178a.isEmpty()) {
            j4Var.n2(new v2(j4Var, uuid, null), new whi.b(6));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object R2(k50.j4 r6, k50.s2 r7, gim.c r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.j4.R2(k50.j4, k50.s2, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object S2(k50.j4 r8, java.util.UUID r9, z30.e r10, int r11, z30.j r12, gim.c r13) throws java.lang.Throwable {
        /*
            s50.e r0 = r8.W
            boolean r1 = r13 instanceof k50.z3
            if (r1 == 0) goto L15
            r1 = r13
            k50.z3 r1 = (k50.z3) r1
            int r2 = r1.A
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.A = r2
            goto L1a
        L15:
            k50.z3 r1 = new k50.z3
            r1.<init>(r8, r13)
        L1a:
            java.lang.Object r13 = r1.f181313y
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.A
            r4 = 1
            if (r3 == 0) goto L39
            if (r3 != r4) goto L31
            int r11 = r1.f181312x
            z30.j r12 = r1.f181311w
            z30.e r10 = r1.v
            java.util.UUID r9 = r1.u
            yhm.o.b(r13)
            goto L64
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            yhm.o.b(r13)
            s30.b r13 = r8.M
            z30.n r3 = r10.f319112a
            java.lang.String r5 = r10.a()
            com.revolut.chat.domain.model.rate.RateChatExperienceData r6 = new com.revolut.chat.domain.model.rate.RateChatExperienceData
            r7 = 0
            r6.<init>(r5, r7, r7, r3)
            r1.u = r9
            r1.v = r10
            r1.f181311w = r12
            r1.f181312x = r11
            r1.A = r4
            v20.o r13 = r13.f259391a
            v20.f0 r13 = (v20.f0) r13
            java.lang.Object r13 = r13.q(r9, r6, r1)
            if (r13 != r2) goto L5f
            goto L61
        L5f:
            kotlin.Unit r13 = kotlin.Unit.f186387a
        L61:
            if (r13 != r2) goto L64
            return r2
        L64:
            cli.y r13 = r8.f181140w0
            k37.s r1 = new k37.s
            r2 = 29
            r1.<init>(r2)
            r8.H2(r13, r1)
            z30.l r10 = r10.b()
            int[] r13 = k50.t2.f
            int r10 = r10.ordinal()
            r10 = r13[r10]
            if (r10 == r4) goto L92
            r8 = 2
            if (r10 == r8) goto L8e
            r8 = 3
            if (r10 != r8) goto L88
            r0.b(r11, r9)
            goto La0
        L88:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L8e:
            r0.a(r11, r9)
            goto La0
        L92:
            t50.h r10 = new t50.h
            java.lang.Integer r13 = new java.lang.Integer
            r13.<init>(r11)
            r11 = 0
            r10.<init>(r9, r12, r11, r13)
            r8.w3(r9, r10, r4)
        La0:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.j4.S2(k50.j4, java.util.UUID, z30.e, int, z30.j, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object T2(k50.j4 r13, java.lang.String r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.j4.T2(k50.j4, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        if (r0.Z2(r7, r1) == r2) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object U2(k50.j4 r6, gim.c r7) {
        /*
            k50.a0 r0 = r6.D
            boolean r1 = r7 instanceof k50.d4
            if (r1 == 0) goto L15
            r1 = r7
            k50.d4 r1 = (k50.d4) r1
            int r2 = r1.f181053w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f181053w = r2
            goto L1a
        L15:
            k50.d4 r1 = new k50.d4
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f181053w
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L38
            if (r3 == r5) goto L34
            if (r3 != r4) goto L2c
            yhm.o.b(r7)
            goto L5b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r7)
            goto L4b
        L38:
            yhm.o.b(r7)
            boolean r7 = r0.f181019m
            if (r7 != 0) goto L42
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L42:
            r1.f181053w = r5
            java.lang.Object r7 = r6.h3(r1)
            if (r7 != r2) goto L4b
            goto L5a
        L4b:
            y20.p r7 = (y20.p) r7
            if (r7 != 0) goto L52
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L52:
            r1.f181053w = r4
            java.lang.Object r6 = r0.Z2(r7, r1)
            if (r6 != r2) goto L5b
        L5a:
            return r2
        L5b:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.j4.U2(k50.j4, gim.c):java.lang.Object");
    }

    public static final v20.o2 V2(j4 j4Var, v20.o2 o2Var, v30.j jVar) {
        return v20.o2.r(o2Var, null, null, null, jVar.f285785a, jVar.f285792m, null, null, 262119);
    }

    public static void j3(j4 j4Var, boolean z, Integer num, int i) {
        if ((i & 4) != 0) {
            num = null;
        }
        Integer num2 = num;
        UUID uuid = ((h0) ((vkm.j2) j4Var.f181140w0.f22677a).getValue()).f181079a;
        if (uuid == null) {
            return;
        }
        j4Var.n2(new ack.o(j4Var, uuid, num2, z, (Continuation) null, 11), new whi.b(6));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void t3(k50.j4 r9, java.util.List r10, v20.t0 r11, java.lang.String r12, int r13) {
        /*
            r0 = r13 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r11 = r1
        L6:
            r13 = r13 & 4
            if (r13 == 0) goto Lc
            r5 = r1
            goto Ld
        Lc:
            r5 = r12
        Ld:
            cli.y r12 = r9.f181140w0
            java.lang.Object r12 = r12.f22677a
            vkm.j2 r12 = (vkm.j2) r12
            java.lang.Object r12 = r12.getValue()
            k50.h0 r12 = (k50.h0) r12
            k50.o0 r12 = r12.e
            java.lang.String r12 = r12.d
            if (r12 == 0) goto L2f
            boolean r13 = kotlin.text.d0.W(r12)
            if (r13 != 0) goto L26
            goto L27
        L26:
            r12 = r1
        L27:
            if (r12 == 0) goto L2f
            com.revolut.chat.domain.model.ReplyToDetails r13 = new com.revolut.chat.domain.model.ReplyToDetails
            r13.<init>(r12)
            goto L30
        L2f:
            r13 = r1
        L30:
            com.revolut.chat.ui.messageslist.MessagesContract$InputData r12 = r9.o
            com.revolut.chat.domain.model.ChatEntryPoint r12 = r12.f51176c
            if (r12 == 0) goto L39
            java.lang.String r12 = r12.f51028a
            goto L3a
        L39:
            r12 = r1
        L3a:
            r0 = 63
            if (r13 == 0) goto L59
            if (r11 != 0) goto L46
            v20.t0 r2 = new v20.t0
            r2.<init>(r1, r1, r0)
            goto L47
        L46:
            r2 = r11
        L47:
            if (r11 == 0) goto L51
            java.lang.String r11 = r11.getEntryPoint()
            if (r11 != 0) goto L50
            goto L51
        L50:
            r12 = r11
        L51:
            r11 = 39
            v20.t0 r11 = v20.t0.a(r2, r12, r13, r11)
        L57:
            r6 = r11
            goto L69
        L59:
            if (r12 == 0) goto L57
            if (r11 != 0) goto L62
            v20.t0 r11 = new v20.t0
            r11.<init>(r1, r1, r0)
        L62:
            r13 = 55
            v20.t0 r11 = v20.t0.a(r11, r12, r1, r13)
            goto L57
        L69:
            fc0.e r2 = new fc0.e
            r7 = 0
            r8 = 16
            r3 = r9
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            yi5.b r9 = new yi5.b
            r10 = 26
            r9.<init>(r10)
            r3.l2(r2, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.j4.t3(k50.j4, java.util.List, v20.t0, java.lang.String, int):void");
    }

    @Override // yji.l
    public final void I1() {
        v0 v0Var;
        skm.a2 a2VarL2;
        cli.y yVar = this.f181140w0;
        vkm.j2 j2Var = (vkm.j2) yVar.f22677a;
        vkm.j2 j2Var2 = (vkm.j2) yVar.f22677a;
        Continuation continuation = null;
        if (((h0) j2Var.getValue()).i == null) {
            l2(new b4(this, null), new yi5.b(26));
        }
        yji.l.a1(this, this.L.j(0L), null, null, new c3(6, this, continuation), 3);
        this.l0.b(Unit.f186387a);
        int i = t2.f181247a[((l30.f) this.u0.getValue()).ordinal()];
        if (i == 1) {
            v0Var = v0.MESSAGES;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            v0Var = v0.PROMPT;
        }
        H2(yVar, new o2(v0Var, 1));
        v30.c0 c0Var = ((h0) j2Var2.getValue()).f181083h;
        v30.c0 c0Var2 = v30.c0.ASSISTANT;
        if (c0Var == c0Var2) {
            z50.c.f319401a = false;
            z50.c.f319402b = false;
            z50.c.f319403c = null;
        }
        int[] iArr = t2.f181248b;
        int i2 = iArr[c0Var.ordinal()];
        boolean z = (i2 == 1 || i2 == 2) ? false : true;
        p1 p1Var = this.N;
        n50.y yVar2 = p1Var.f181206c;
        yVar2.i = z;
        yVar2.f212523j = false;
        p1Var.f181206c.f212524l = ((h0) j2Var2.getValue()).f181083h;
        p1Var.f181206c.f212525m = ((h0) j2Var2.getValue()).f181086m;
        p1Var.f181206c.f212526n = ((h0) j2Var2.getValue()).f181087n;
        int i3 = iArr[((h0) j2Var2.getValue()).f181083h.ordinal()];
        int i5 = 3;
        if (i3 == 1 || i3 == 2) {
            a2VarL2 = null;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            TicketCreationContext ticketCreationContext = this.f181137t0;
            NewTicketContext newTicketContext = ticketCreationContext != null ? ticketCreationContext.d : null;
            if ((newTicketContext instanceof NewTicketContext.PrivateBankingEscalation) || (newTicketContext instanceof NewTicketContext.AssistantEscalation)) {
                a2VarL2 = l2(new b3(0, this, continuation), new yi5.b(26));
            } else {
                if (!(newTicketContext instanceof NewTicketContext.Transaction) && newTicketContext != null) {
                    throw new NoWhenBranchMatchedException();
                }
                a2VarL2 = null;
            }
        }
        this.f181129o0 = a2VarL2;
        yji.l.a1(this, vkm.q.Q(yVar.B(new l2(4)), new z2(0, this, continuation)), null, null, new a3(0, this, continuation), 3);
        yji.l.a1(this, rd0.e.b(this.f181139w.a()), null, null, new c3(1, this, continuation), 3);
        if (((h0) j2Var2.getValue()).f181083h == c0Var2) {
            l2(new cam.q(7, continuation, this), new yi5.b(26));
        }
        j30.c cVar = this.f181134s;
        cVar.getClass();
        if (((h0) j2Var2.getValue()).f181083h != v30.c0.SUPPORT) {
            H2(yVar, new l2(7));
        } else {
            yji.l.b1(this, nim.a.v(rd0.e.e(rd0.e.b(((md0.e) this.Z).a()), zhm.h0.f322473a, new im2.b(i5, 3, continuation)), new l2(8)), null, new c3(0, this, continuation), 3);
        }
        if (!((jte.d) ((rf3.d) cVar).f253679a).c(ChatApi$Toggles.ChatPersistentComposerDraft.f50977c)) {
            y20.b1 b1Var = (y20.b1) this.K;
            skm.e0.C(b1Var.f310461m, null, null, new y20.m0(b1Var, null, 1), 3);
        }
        h0 h0Var = (h0) j2Var2.getValue();
        int i6 = iArr[h0Var.f181083h.ordinal()];
        if (i6 != 1) {
            if (i6 != 2 && i6 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (h0Var.f181079a == null) {
                l2(new m3(this, null), new yi5.b(26));
            }
        }
        l2(new b3(1, this, continuation), new yi5.b(26));
        yji.l.a1(this, this.P.d3(), null, null, new c3(8, this, continuation), 3);
        yji.l.a1(this, this.T.b3(), null, null, new n3(0, this, null), 3);
        yji.l.a1(this, this.f181128n0, null, null, new i4g.d(this, continuation, 23), 3);
        yji.l.a1(this, this.f181123b0.e3(), null, null, new n3(1, this, null), 3);
        yji.l.a1(this, this.f181125e0.Z2(), null, null, new c3(9, this, continuation), 3);
        InitialMessage initialMessage = this.f181135s0;
        if (initialMessage != null) {
            String str = initialMessage.d;
            if (!((h0) j2Var2.getValue()).k) {
                H2(yVar, new l2(9));
                String str2 = initialMessage.e;
                if (str2 != null) {
                    l1().M0(new c(str2, str, initialMessage.f51054c));
                }
                u3(new ChatMessageToPass(this.R.a(), initialMessage.f51053b), null, new v20.z0(new MessageType(initialMessage.f51052a, str), 29));
            }
        }
        this.g0.Z2(((h0) j2Var2.getValue()).f181083h);
        l2(new k0g.b(this, continuation, 9), new yi5.b(26));
        l2(new b3(2, this, continuation), new yi5.b(26));
    }

    @Override // yji.l
    public final void K1() {
        cli.y yVar = this.f181140w0;
        vkm.j2 j2Var = (vkm.j2) yVar.f22677a;
        vkm.j2 j2Var2 = (vkm.j2) yVar.f22677a;
        this.f181143y.f14697a.remove(((h0) j2Var.getValue()).f181079a);
        z3();
        if (((jte.d) ((rf3.d) this.f181134s).f253679a).c(ChatApi$Toggles.ChatPersistentComposerDraft.f50977c)) {
            return;
        }
        List listD1 = zhm.d0.d1(((h0) j2Var2.getValue()).e.f);
        x30.c cVar = ((h0) j2Var2.getValue()).e.f181195g;
        Continuation continuation = null;
        File file = cVar != null ? new File(cVar.f302607a) : null;
        if (listD1.isEmpty() && file == null) {
            return;
        }
        skm.e0.C(this.i0, null, null, new jv.o(listD1, file, continuation, 19), 3);
    }

    @Override // yji.l
    public final void P1() throws Throwable {
        y20.t sVar;
        z3();
        h0 h0Var = (h0) ((vkm.j2) this.f181140w0.f22677a).getValue();
        ChatMode chatMode = h0Var.i;
        v30.c0 feedType = h0Var.f181083h;
        int i = t2.f181248b[feedType.ordinal()];
        y20.t qVar = null;
        if (i == 1) {
            if (chatMode instanceof ChatMode.Feed) {
                e.a aVar = p50.e.Companion;
                UUID feedId = ((ChatMode.Feed) chatMode).f51044a;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(feedId, "feedId");
                sVar = new y20.r(null, feedId);
            } else if (chatMode instanceof ChatMode.SingleFeed) {
                e.a aVar2 = p50.e.Companion;
                v30.c0 feedType2 = v30.c0.ASSISTANT;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(feedType2, "feedType");
                sVar = new y20.s(null, feedType2);
            } else if (!(chatMode instanceof ChatMode.Default) && chatMode != null) {
                throw new NoWhenBranchMatchedException();
            }
            qVar = sVar;
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (chatMode instanceof ChatMode.Feed) {
                e.a aVar3 = p50.e.Companion;
                UUID feedId2 = ((ChatMode.Feed) chatMode).f51044a;
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(feedId2, "feedId");
                sVar = new y20.r(null, feedId2);
            } else if (chatMode instanceof ChatMode.SingleFeed) {
                p50.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(feedType, "feedType");
                sVar = new y20.s(null, feedType);
            } else {
                if (!(chatMode instanceof ChatMode.Default) && chatMode != null) {
                    throw new NoWhenBranchMatchedException();
                }
                UUID ticketId = h0Var.f181079a;
                if (ticketId != null) {
                    p50.e.Companion.getClass();
                    Intrinsics.checkNotNullParameter(ticketId, "ticketId");
                    qVar = new y20.q(ticketId, null);
                }
            }
            qVar = sVar;
        }
        if (qVar != null) {
            ((y20.b1) this.K).k(qVar);
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        boolean z;
        z3();
        Continuation continuation = null;
        n2(new b3(6, this, continuation), new whi.b(6));
        int i = 7;
        n2(new b3(i, this, continuation), new whi.b(6));
        n2(new b3(8, this, continuation), new whi.b(6));
        int i2 = 1;
        yji.l.b1(this, vkm.q.q(new vkm.t0(this.j0, 1)), null, new i4g.d(new Ref$ObjectRef(), this, new Ref$ObjectRef(), continuation, 22), 3);
        yji.l.b1(this, rd0.e.b(this.F.Z2()), null, new f4(this, null), 3);
        cli.y yVar = this.f181140w0;
        if (((h0) ((vkm.j2) yVar.f22677a).getValue()).f181083h == v30.c0.ASSISTANT) {
            this.f181134s.getClass();
            z = true;
        } else {
            z = false;
        }
        b.Companion companion = kotlin.time.b.INSTANCE;
        pkm.e eVar = pkm.e.MINUTES;
        yji.l.b1(this, this.S.d3(yVar.B(new l2(15)), new l4(z, kotlin.time.c.g(3, eVar), kotlin.time.c.g(2, eVar), new l2(12))), null, new c3(i, this, continuation), 3);
        yji.l.b1(this, rd0.e.b(this.Y.f256113c), null, new c3(10, this, continuation), 3);
        n2(new u3(this, null), new whi.b(6));
        yji.l.b1(this, this.T.d3(), null, new a3(i2, this, continuation), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        if (r9 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        if (r8.invoke(r2, r0) != r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W2(kotlin.jvm.functions.Function2 r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof k50.u2
            if (r0 == 0) goto L13
            r0 = r9
            k50.u2 r0 = (k50.u2) r0
            int r1 = r0.f181257x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f181257x = r1
            goto L18
        L13:
            k50.u2 r0 = new k50.u2
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f181257x
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r9)
            goto L84
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            gim.i r8 = r0.u
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            yhm.o.b(r9)
            goto L76
        L3b:
            yhm.o.b(r9)
            cli.y r9 = r7.f181140w0
            java.lang.Object r2 = r9.f22677a
            vkm.j2 r2 = (vkm.j2) r2
            java.lang.Object r2 = r2.getValue()
            k50.h0 r2 = (k50.h0) r2
            java.util.UUID r2 = r2.f181079a
            if (r2 == 0) goto L55
            boolean r6 = r2.equals(r3)
            if (r6 != 0) goto L55
            goto L56
        L55:
            r2 = r3
        L56:
            if (r2 != 0) goto L79
            k50.l2 r2 = new k50.l2
            r6 = 2
            r2.<init>(r6)
            kotlinx.coroutines.flow.Flow r9 = r9.B(r2)
            vkm.t0 r2 = new vkm.t0
            r6 = 1
            r2.<init>(r9, r6)
            r9 = r8
            gim.i r9 = (gim.i) r9
            r0.u = r9
            r0.f181257x = r5
            java.lang.Object r9 = vkm.q.x(r2, r0)
            if (r9 != r1) goto L76
            goto L83
        L76:
            r2 = r9
            java.util.UUID r2 = (java.util.UUID) r2
        L79:
            r0.u = r3
            r0.f181257x = r4
            java.lang.Object r8 = r8.invoke(r2, r0)
            if (r8 != r1) goto L84
        L83:
            return r1
        L84:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.j4.W2(kotlin.jvm.functions.Function2, gim.c):java.lang.Object");
    }

    public final v20.n X2() {
        v20.n nVarA;
        int iJ = zhm.v.j(this.f181138v0);
        while (true) {
            if (-1 >= iJ) {
                nVarA = null;
                break;
            }
            koi.j jVar = (koi.j) this.f181138v0.get(iJ);
            qv0.p pVar = jVar instanceof qv0.p ? (qv0.p) jVar : null;
            Object f = pVar != null ? pVar.getE() : null;
            nVarA = f instanceof n50.v ? ((n50.v) f).a() : f instanceof v20.n ? (v20.n) f : null;
            if (nVarA == null && (jVar instanceof oq0.b)) {
                nVarA = this.f181123b0.c3(jVar.getF53837a());
            }
            if (nVarA != null && (nVarA.getAuthor() instanceof ChatAgent)) {
                break;
            }
            iJ--;
        }
        if (nVarA == null) {
            return null;
        }
        cli.y yVar = this.f181140w0;
        v20.n nVar = ((h0) ((vkm.j2) yVar.f22677a).getValue()).d.f;
        if (nVar == null || !Intrinsics.f(nVarA.getId(), nVar.getId())) {
            return nVarA;
        }
        this.m0.b(nVar);
        H2(yVar, new l2(6));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y2(com.revolut.chat.domain.model.ChatMessageToPass r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.j4.Y2(com.revolut.chat.domain.model.ChatMessageToPass, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009c, code lost:
    
        if (r2 == r9) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012a, code lost:
    
        if (r2 != r9) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ea, code lost:
    
        if (r2 == r9) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(com.revolut.chat.domain.model.ChatMode r26, com.revolut.chat.domain.model.ChatMessageToPass r27, gim.c r28) {
        /*
            Method dump skipped, instruction units count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.j4.Z2(com.revolut.chat.domain.model.ChatMode, com.revolut.chat.domain.model.ChatMessageToPass, gim.c):java.lang.Object");
    }

    public final v20.n a3(String str) {
        Object next;
        try {
            UUID uuidFromString = UUID.fromString(str);
            Iterator it8 = ((h0) ((vkm.j2) this.f181140w0.f22677a).getValue()).d.f181178a.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((v20.n) next).getId(), uuidFromString)) {
                    break;
                }
            }
            return (v20.n) next;
        } catch (Exception unused) {
            return null;
        }
    }

    public final Instant b3() {
        LastMessage lastMessage;
        Instant time;
        Instant time2;
        Comparable element = Instant.ofEpochMilli(this.U.a().toEpochMilli());
        cli.y yVar = this.f181140w0;
        v20.n nVar = (v20.n) zhm.d0.o0(((h0) ((vkm.j2) yVar.f22677a).getValue()).d.f181178a);
        if (nVar != null && (time2 = nVar.getTime()) != null) {
            Intrinsics.checkNotNullExpressionValue(element, "element");
            element = cim.c.k(element, time2);
        }
        v30.j jVar = (v30.j) ((h0) ((vkm.j2) yVar.f22677a).getValue()).f181080b.getContent();
        if (jVar != null && (lastMessage = jVar.f285790j) != null && (time = lastMessage.getTime()) != null) {
            Intrinsics.checkNotNullExpressionValue(element, "element");
            element = cim.c.k(element, time);
        }
        Intrinsics.checkNotNullExpressionValue(element, "element");
        return (Instant) element;
    }

    public final Object c3(gim.c cVar) {
        cli.y yVar = this.f181140w0;
        ChatMode chatMode = ((h0) ((vkm.j2) yVar.f22677a).getValue()).i;
        return chatMode == null ? vkm.q.x(new vkm.t0(yVar.B(new k37.s(27)), 1), cVar) : chatMode;
    }

    public final v20.n d3(koi.j item) {
        Intrinsics.checkNotNullParameter(item, "item");
        v20.n nVarA = null;
        qv0.p pVar = item instanceof qv0.p ? (qv0.p) item : null;
        Object f = pVar != null ? pVar.getE() : null;
        if (f instanceof n50.v) {
            nVarA = ((n50.v) f).a();
        } else if (f instanceof v20.n) {
            nVarA = (v20.n) f;
        }
        return (nVarA == null && (item instanceof oq0.b)) ? this.f181123b0.c3(item.getF53837a()) : nVarA;
    }

    public final v20.n e3() {
        cli.y yVar = this.f181140w0;
        if (((h0) ((vkm.j2) yVar.f22677a).getValue()).c(this.f181134s)) {
            return ((h0) ((vkm.j2) yVar.f22677a).getValue()).e.f181194c;
        }
        return null;
    }

    public final h0 f3(h0 h0Var, Data data) {
        UUID uuid;
        boolean z;
        boolean z3;
        Instant instantPlus;
        List list;
        v20.n nVar;
        Object obj2;
        m1 m1Var = h0Var.d;
        v30.j jVar = (v30.j) data.getContent();
        List list2 = m1Var.f181179b;
        int size = list2.size();
        int i = 0;
        while (true) {
            uuid = B0;
            z = true;
            if (i >= size) {
                z3 = false;
                break;
            }
            if (Intrinsics.f(((v20.n) list2.get(i)).getTicketId(), uuid)) {
                z3 = true;
                break;
            }
            i++;
        }
        List list3 = m1Var.d;
        int size2 = list3.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                z = false;
                break;
            }
            if (Intrinsics.f(((v20.n) list3.get(i2)).getTicketId(), uuid)) {
                break;
            }
            i2++;
        }
        if (jVar == null || !(z || z3)) {
            v30.j jVar2 = (v30.j) data.getContent();
            return h0.a(h0Var, jVar2 != null ? jVar2.f285785a : null, data, null, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, null, null, null, 268435452);
        }
        LastMessage lastMessage = jVar.f285790j;
        if (lastMessage == null || (instantPlus = lastMessage.getTime()) == null) {
            instantPlus = jVar.f285793n;
        }
        if (z) {
            ArrayList arrayList = new ArrayList(list3.size());
            int size3 = list3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                v20.n nVarR = (v20.n) list3.get(i3);
                if (Intrinsics.f(nVarR.getTicketId(), uuid) && (nVarR instanceof v20.o2)) {
                    v20.o2 o2Var = (v20.o2) nVarR;
                    nVarR = v20.o2.r(o2Var, null, (Instant) cim.c.k(o2Var.getTime(), instantPlus), null, jVar.f285785a, jVar.f285792m, null, null, 262117);
                    Instant instantPlus2 = nVarR.getTime().plus(1L);
                    Intrinsics.checkNotNullExpressionValue(instantPlus2, "plus(...)");
                    instantPlus = instantPlus2;
                }
                arrayList.add(nVarR);
            }
            list = arrayList;
        } else {
            list = list3;
        }
        if (!z) {
            instantPlus = instantPlus.plus(1L);
            Intrinsics.checkNotNullExpressionValue(instantPlus, "plus(...)");
        }
        List list4 = m1Var.f181179b;
        if (z3) {
            ArrayList arrayList2 = new ArrayList(list4.size());
            int size4 = list4.size();
            for (int i5 = 0; i5 < size4; i5++) {
                v20.n nVarR2 = (v20.n) list4.get(i5);
                if (Intrinsics.f(nVarR2.getTicketId(), uuid) && (nVarR2 instanceof v20.o2)) {
                    v20.o2 o2Var2 = (v20.o2) nVarR2;
                    nVarR2 = v20.o2.r(o2Var2, null, (Instant) cim.c.k(o2Var2.getTime(), instantPlus), null, jVar.f285785a, jVar.f285792m, null, null, 262117);
                    instantPlus = nVarR2.getTime().plus(1L);
                    Intrinsics.checkNotNullExpressionValue(instantPlus, "plus(...)");
                }
                arrayList2.add(nVarR2);
            }
            list4 = arrayList2;
        }
        List list5 = m1Var.f181178a;
        if (z) {
            ArrayList arrayList3 = new ArrayList(list5.size());
            int size5 = list5.size();
            for (int i6 = 0; i6 < size5; i6++) {
                v20.n nVar2 = (v20.n) list5.get(i6);
                if (Intrinsics.f(nVar2.getTicketId(), uuid)) {
                    int size6 = list.size();
                    int i21 = 0;
                    while (true) {
                        if (i21 >= size6) {
                            obj2 = null;
                            break;
                        }
                        obj2 = list.get(i21);
                        if (Intrinsics.f(((v20.n) obj2).getId(), nVar2.getId())) {
                            break;
                        }
                        i21++;
                    }
                    nVar = (v20.n) obj2;
                } else {
                    nVar = null;
                }
                if (nVar != null) {
                    nVar2 = nVar;
                }
                arrayList3.add(nVar2);
            }
            list5 = arrayList3;
        }
        return h0.a(h0Var, jVar.f285785a, data, null, m1.a(m1Var, i3(m1Var, list5, list4, list), list4, null, list, null, null, null, 0, null, 1012), null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, null, null, null, 268435444);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g3(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof k50.y2
            if (r0 == 0) goto L13
            r0 = r5
            k50.y2 r0 = (k50.y2) r0
            int r1 = r0.f181298w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f181298w = r1
            goto L18
        L13:
            k50.y2 r0 = new k50.y2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f181298w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f181298w = r3
            java.lang.Object r5 = r4.c3(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            com.revolut.chat.domain.model.ChatMode r5 = (com.revolut.chat.domain.model.ChatMode) r5
            boolean r0 = r5 instanceof com.revolut.chat.domain.model.ChatMode.Default
            if (r0 == 0) goto L43
            r3 = 0
            goto L52
        L43:
            boolean r0 = r5 instanceof com.revolut.chat.domain.model.ChatMode.Feed
            if (r0 != 0) goto L52
            boolean r5 = r5 instanceof com.revolut.chat.domain.model.ChatMode.SingleFeed
            if (r5 == 0) goto L4c
            goto L52
        L4c:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L52:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.j4.g3(gim.c):java.lang.Object");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f181140w0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h3(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof k50.d3
            if (r0 == 0) goto L13
            r0 = r5
            k50.d3 r0 = (k50.d3) r0
            int r1 = r0.f181052w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f181052w = r1
            goto L18
        L13:
            k50.d3 r0 = new k50.d3
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f181052w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f181052w = r3
            java.lang.Object r5 = r4.c3(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            com.revolut.chat.domain.model.ChatMode r5 = (com.revolut.chat.domain.model.ChatMode) r5
            boolean r0 = r5 instanceof com.revolut.chat.domain.model.ChatMode.Default
            cli.y r1 = r4.f181140w0
            if (r0 == 0) goto L59
            java.lang.Object r5 = r1.f22677a
            vkm.j2 r5 = (vkm.j2) r5
            java.lang.Object r5 = r5.getValue()
            k50.h0 r5 = (k50.h0) r5
            java.util.UUID r5 = r5.f181079a
            if (r5 != 0) goto L53
            r5 = 0
            return r5
        L53:
            y20.m r0 = new y20.m
            r0.<init>(r5)
            return r0
        L59:
            boolean r0 = r5 instanceof com.revolut.chat.domain.model.ChatMode.Feed
            if (r0 == 0) goto L67
            y20.n r0 = new y20.n
            com.revolut.chat.domain.model.ChatMode$Feed r5 = (com.revolut.chat.domain.model.ChatMode.Feed) r5
            java.util.UUID r5 = r5.f51044a
            r0.<init>(r5)
            return r0
        L67:
            boolean r5 = r5 instanceof com.revolut.chat.domain.model.ChatMode.SingleFeed
            if (r5 == 0) goto L7d
            y20.o r5 = new y20.o
            java.lang.Object r0 = r1.f22677a
            vkm.j2 r0 = (vkm.j2) r0
            java.lang.Object r0 = r0.getValue()
            k50.h0 r0 = (k50.h0) r0
            v30.c0 r0 = r0.f181083h
            r5.<init>(r0)
            return r5
        L7d:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.j4.h3(gim.c):java.lang.Object");
    }

    public final ArrayList i3(m1 m1Var, List list, Collection collection, List list2) {
        boolean zIsEmpty = m1Var.f181180c.isEmpty();
        q1 q1Var = this.J;
        return zIsEmpty ? q1Var.a(list, collection, list2) : q1Var.a(q1Var.a(list, m1Var.f181180c, zhm.f0.f322471a), collection, list2);
    }

    public final void k3(int i, String str) {
        m70.a.c(kotlin.jvm.internal.t0.f186434a);
        this.B.c("", str, false, new et0.k(this, i, 2));
    }

    public final void l3(Object obj2, String listId, String str) {
        v20.n nVarC3;
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (obj2 instanceof n50.v) {
            nVarC3 = ((n50.v) obj2).a();
        } else if (obj2 instanceof v20.n) {
            nVarC3 = (v20.n) obj2;
        } else {
            nVarC3 = this.f181123b0.c3(listId);
            if (nVarC3 == null) {
                return;
            }
        }
        s2.Companion.getClass();
        this.f181127k0.setValue(s2.f181237c);
        H2(this.f181140w0, new k1.a(nVarC3, str, 22));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3(mx0.b4 r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.j4.m3(mx0.b4):void");
    }

    public final void n3(Object obj2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        v20.n nVarA3 = a3(listId);
        if (!(nVarA3 instanceof v20.s0) || ((v20.s0) nVarA3).A()) {
            return;
        }
        n50.t tVar = obj2 instanceof n50.t ? (n50.t) obj2 : null;
        if (tVar == null) {
            return;
        }
        String str = tVar.d;
        UUID uuid = tVar.f212508a;
        this.F.d3(str, tVar.f212511g, tVar.f212509b, uuid, tVar.f212510c);
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (throwable instanceof NetworkConnectException) {
            return true;
        }
        super.o1(throwable);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
    public final void o3(v30.k0 k0Var, xo0.e source) {
        Intrinsics.checkNotNullParameter(source, "source");
        Continuation continuation = null;
        l2(new k3k.q0(this, k0Var, continuation, 10), new yi5.b(26));
        u3(new ChatMessageToPass(this.R.a(), this.Q.b(k0Var.f285803c).toString()), source, new v20.z0(new MessageType("suggestion", k0Var.f285801a), 29));
        if (((h0) ((vkm.j2) this.f181140w0.f22677a).getValue()).o) {
            return;
        }
        l2(new b3(10, this, continuation), new yi5.b(26));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void p3(Object obj2, String listId) {
        UUID uuid;
        Intrinsics.checkNotNullParameter(listId, "listId");
        switch (listId.hashCode()) {
            case 354851358:
                if (listId.equals("dialog_chat_transcript_request_message") && (uuid = ((h0) ((vkm.j2) this.f181140w0.f22677a).getValue()).f181079a) != null) {
                    TranscriptIdentifier.ChatId chatId = new TranscriptIdentifier.ChatId(uuid);
                    w50.k kVar = this.f181141x;
                    kVar.b3(chatId);
                    kVar.Z2(null);
                }
                break;
            case 591497546:
                if (listId.equals("dialog_delete_message")) {
                    Intrinsics.i(obj2, "null cannot be cast to non-null type java.util.UUID");
                    q3((UUID) obj2);
                    break;
                }
                break;
            case 1276793556:
                if (listId.equals("dialog_copy_message")) {
                    n50.u uVar = obj2 instanceof n50.u ? (n50.u) obj2 : null;
                    if (uVar != null) {
                        k3(R$string.chat_messages_copied, this.Q.b(uVar.f212512a).toString());
                        break;
                    }
                }
                break;
            case 1698758618:
                if (listId.equals("dialog_resend_message")) {
                    Intrinsics.i(obj2, "null cannot be cast to non-null type java.util.UUID");
                    r3((UUID) obj2);
                    break;
                }
                break;
        }
    }

    public final void q3(UUID uuid) {
        cli.y yVar = this.f181140w0;
        List list = ((h0) ((vkm.j2) yVar.f22677a).getValue()).d.f181178a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!Intrinsics.f(((v20.n) obj2).getId(), uuid)) {
                arrayList.add(obj2);
            }
        }
        H2(yVar, new jeg.i(4, arrayList));
    }

    public final void r3(UUID uuid) {
        v20.n nVar = (v20.n) ((h0) ((vkm.j2) this.f181140w0.f22677a).getValue()).d.i.get(uuid);
        if (nVar == null) {
            return;
        }
        l2(new k0g.b(nVar, this, uuid, (Continuation) null, 11), new yi5.b(26));
    }

    public final void s3(UUID uuid, Instant instant, Instant instant2) {
        cli.y yVar = this.f181140w0;
        List list = ((h0) ((vkm.j2) yVar.f22677a).getValue()).d.f181178a;
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                if (Intrinsics.f(((v20.n) it8.next()).getId(), uuid)) {
                    H2(yVar, new be7.l(5, uuid));
                    return;
                }
            }
        }
        v20.n nVar = (v20.n) zhm.d0.d0(list);
        if (nVar == null) {
            return;
        }
        l2(new fc0.e(15, instant2, this, nVar, instant, uuid, (Continuation) null), new yi5.b(26));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u3(com.revolut.chat.domain.model.ChatMessageToPass r29, xo0.e r30, v20.z0 r31) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.j4.u3(com.revolut.chat.domain.model.ChatMessageToPass, xo0.e, v20.z0):void");
    }

    public final void v3(Object obj2) {
        Object author;
        Continuation continuation = null;
        v20.n nVarA = obj2 instanceof v20.n ? (v20.n) obj2 : obj2 instanceof n50.v ? ((n50.v) obj2).a() : null;
        if (nVarA == null || (author = nVarA.getAuthor()) == null) {
            author = (Parcelable) ((h0) ((vkm.j2) this.f181140w0.f22677a).getValue()).f181081c.getContent();
        }
        if (author instanceof ChatAgent) {
            n2(new m3(this, ((ChatAgent) author).getId(), continuation, 1), new whi.b(6));
        }
    }

    public final void w3(UUID uuid, t50.h hVar, boolean z) {
        RateChatProxyScreen rateChatProxyScreen = new RateChatProxyScreen(hVar);
        rateChatProxyScreen.k2(new m2(this, 0));
        f2(rateChatProxyScreen, ModalDestination.Style.BOTTOM_DIALOG.f98301a, new g48.h(this, z, uuid, 21));
    }

    public final void x3(List list) {
        LinkedHashSet linkedHashSet;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (true) {
            boolean zHasNext = it8.hasNext();
            linkedHashSet = this.q0;
            if (!zHasNext) {
                break;
            }
            Object next = it8.next();
            v30.k0 k0Var = (v30.k0) next;
            if (k0Var.e != null && !linkedHashSet.contains(k0Var.f285801a)) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            linkedHashSet.add(((v30.k0) it9.next()).f285801a);
        }
        l2(new k3k.q0(this, arrayList, null, 13), new yi5.b(26));
    }

    public final m1 y3(m1 m1Var, List list) {
        Object obj2;
        List list2 = list;
        ArrayList arrayListI3 = i3(m1Var, m1Var.f181178a, list2, m1Var.d);
        ArrayList arrayListA = this.J.a(m1Var.f181179b, list2, zhm.f0.f322471a);
        int iJ = zhm.v.j(list);
        while (true) {
            if (-1 >= iJ) {
                obj2 = null;
                break;
            }
            obj2 = list.get(iJ);
            v20.n nVar = (v20.n) obj2;
            if (!(nVar.getAuthor() instanceof User) && d8l.d.p(nVar)) {
                break;
            }
            iJ--;
        }
        v20.n nVar2 = (v20.n) obj2;
        v20.n nVar3 = m1Var.f;
        if (nVar3 == null) {
            nVar2 = null;
        } else if (nVar2 == null) {
            nVar2 = nVar3;
        }
        LinkedHashMap linkedHashMapZ = zhm.r0.z(m1Var.f181181g);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            v20.n nVar4 = (v20.n) list.get(i);
            if (nVar4 instanceof v20.s0) {
                v20.s0 s0Var = (v20.s0) nVar4;
                if (linkedHashMapZ.containsKey(s0Var.getId())) {
                    v20.q2 transcriptState = s0Var.getTranscriptState();
                    if (transcriptState == null) {
                        transcriptState = v20.q2.PENDING;
                    }
                    linkedHashMapZ.put(s0Var.getId(), transcriptState);
                }
            }
        }
        return m1.a(m1Var, arrayListI3, arrayListA, null, null, null, nVar2, linkedHashMapZ, 0, null, 828);
    }

    public final void z3() {
        h0 h0Var = (h0) ((vkm.j2) this.f181140w0.f22677a).getValue();
        v30.j jVar = (v30.j) h0Var.f181080b.getContent();
        UUID uuid = jVar != null ? jVar.f285786b : null;
        v30.c0 c0Var = h0Var.f181083h;
        aii.s sVar = this.f314520h;
        hlm.c cVar = this.p0;
        a40.a session = new a40.a(cVar, uuid, c0Var, sVar);
        ConcurrentHashMap concurrentHashMap = this.z.f20971a;
        Intrinsics.checkNotNullParameter(session, "session");
        if ((sVar == null ? -1 : c40.a.f20970a[sVar.ordinal()]) == 1) {
            concurrentHashMap.remove(cVar);
        } else {
            concurrentHashMap.put(cVar, session);
        }
    }
}
