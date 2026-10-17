package r40;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.chat.data.repository.chat.ChatAgent;
import com.revolut.chat.data.repository.chat.MessageAuthor;
import com.revolut.chat.domain.model.ChatListFilter;
import com.revolut.chat.domain.model.LastMessage;
import com.revolut.chat.ui.chatlist.ChatListContract$InputData;
import com.revolut.chat_core.R$string;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.tickets.api.declaration.DetailedTicketsApi$Toggles$TicketorRevamp;
import com.youTransactor.uCube.rpc.Constants;
import ip0.xh0;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class c1 implements jki.p {

    @NotNull
    public static final a1 Companion = new a1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j30.c f251327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f251328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ChatListContract$InputData f251329c;
    public final e40.w d;
    public final ose.e e;
    public final ef3.b f;

    public c1(j30.c chatFeatureToggles, p chatMapper, ChatListContract$InputData inputData, e40.w ticketTilesFactory, ose.e ticketsUiMapper, ef3.b ticketsFeatureToggles) {
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        Intrinsics.checkNotNullParameter(chatMapper, "chatMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(ticketTilesFactory, "ticketTilesFactory");
        Intrinsics.checkNotNullParameter(ticketsUiMapper, "ticketsUiMapper");
        Intrinsics.checkNotNullParameter(ticketsFeatureToggles, "ticketsFeatureToggles");
        this.f251327a = chatFeatureToggles;
        this.f251328b = chatMapper;
        this.f251329c = inputData;
        this.d = ticketTilesFactory;
        this.e = ticketsUiMapper;
        this.f = ticketsFeatureToggles;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        List listE0;
        TextLocalisedClause textLocalisedClause;
        a domainState = (a) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean zC = ((jte.d) this.f.f125269a).c(DetailedTicketsApi$Toggles$TicketorRevamp.f90443c);
        ChatListContract$InputData chatListContract$InputData = this.f251329c;
        ChatListFilter chatListFilter = chatListContract$InputData.d;
        boolean z = chatListFilter instanceof ChatListFilter.PastRequests;
        Integer numValueOf = null;
        ChatListFilter.None none = ChatListFilter.None.f51036a;
        if (z) {
            listE0 = (List) iii.c.f(domainState.f251319a.f251337b, new r38.m(this, 5), new qz9.u(27), new z0(this, domainState, zC, 2));
        } else {
            if (!Intrinsics.f(chatListFilter, none) && !(chatListFilter instanceof ChatListFilter.Tickets)) {
                throw new NoWhenBranchMatchedException();
            }
            h hVar = domainState.f251319a;
            List listL = zhm.v.l((!hVar.d || chatListContract$InputData.f51142c) ? null : new RowDelegate.Model("LIST_ID_NEW_CHAT", new ResourceImage(R$drawable.uikit_icn_24_message, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new TextLocalisedClause(R$string.chat_new, null, null, 14), null, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741676));
            yp0.b.k(listL, 0, 0, 0, 0, 31);
            listE0 = zhm.d0.E0((List) iii.c.f(hVar.f251337b, new y0(1), new qz9.u(26), new z0(this, domainState, zC, 1)), zhm.d0.E0((List) iii.c.f(hVar.f251336a, new y0(0), new qz9.u(25), new z0(zC, this, domainState)), listL));
        }
        h hVar2 = domainState.f251319a;
        boolean zBooleanValue = ((Boolean) iii.c.f(t1.t(hVar2.f251336a, hVar2.f251337b), new y0(2), new qz9.u(24), new qbg.j(domainState, 18))).booleanValue();
        int i = b1.f251326a[((rf3.d) this.f251327a).b().ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ChatListFilter chatListFilter2 = chatListContract$InputData.d;
        if (chatListFilter2 instanceof ChatListFilter.PastRequests) {
            textLocalisedClause = new TextLocalisedClause(R$string.chat_list_past_requests_title, null, null, 14);
        } else {
            if (!Intrinsics.f(chatListFilter2, none) && !(chatListFilter2 instanceof ChatListFilter.Tickets)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.chat_all_requests, null, null, 14);
        }
        f fVar = domainState.f251321c;
        if (fVar != null && !(fVar instanceof e)) {
            if (!(fVar instanceof d)) {
                throw new NoWhenBranchMatchedException();
            }
            Iterator it8 = listE0.iterator();
            int i2 = 0;
            while (true) {
                if (!it8.hasNext()) {
                    i2 = -1;
                    break;
                }
                koi.j jVar = (koi.j) it8.next();
                if (kotlin.text.a0.H(jVar.getF55206b(), "TICKET_HEADER_", false)) {
                    qv0.p pVar = jVar instanceof qv0.p ? (qv0.p) jVar : null;
                    Object f55012h = pVar != null ? pVar.getF55191g() : null;
                    pse.a aVar = f55012h instanceof pse.a ? (pse.a) f55012h : null;
                    if (Intrinsics.f(aVar != null ? aVar.f239483a : null, ((d) fVar).f251330a)) {
                        break;
                    }
                }
                i2++;
            }
            numValueOf = Integer.valueOf(i2);
        }
        return new g(listE0, textLocalisedClause, zBooleanValue, numValueOf);
    }

    public final wh b(u40.b bVar) {
        Clause timeClause;
        com.revolut.core.ui_kit.delegates.m mVar;
        v30.j chat = bVar.f276959a;
        Intrinsics.checkNotNullParameter(chat, "chat");
        boolean zA = v30.r.a(chat);
        int i = chat.k;
        UUID uuid = chat.f285785a;
        MessageAuthor messageAuthor = chat.f285789h;
        messageAuthor.getClass();
        boolean z = messageAuthor instanceof ChatAgent.Live;
        ChatAgent.Live live = z ? (ChatAgent.Live) messageAuthor : null;
        String name = live != null ? live.getName() : null;
        TextLocalisedClause textLocalisedClause = (!z || name == null) ? new TextLocalisedClause(R$string.chat_title_chatbot, null, null, 14) : chat.f285799w != null ? new TextLocalisedClause(R$string.call_and_chat_title_assigned, zhm.u.c(name), null, 12) : new TextLocalisedClause(R$string.chat_title_assigned, zhm.u.c(name), null, 12);
        LastMessage lastMessage = chat.f285790j;
        p pVar = this.f251328b;
        if (zA && lastMessage != null) {
            timeClause = yoj.b.w(yoj.b.w(new TimeClause(lastMessage.getTime().getMillis(), new TimeClause.Format.Pretty(0), null, null, 12), new DotDividerClause((Integer) null)), new TextLocalisedClause(R$string.chat_subtitle_status_pending_rating, null, new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), 10));
        } else if (zA && lastMessage == null) {
            timeClause = new TextLocalisedClause(R$string.chat_subtitle_status_pending_rating, null, new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), 10);
        } else if (lastMessage == null || kotlin.text.d0.W(lastMessage.getText())) {
            timeClause = lastMessage != null ? new TimeClause(lastMessage.getTime().getMillis(), new TimeClause.Format.Pretty(0), null, null, 12) : new TimeClause(chat.f285793n.getMillis(), new TimeClause.Format.Pretty(0), null, null, 12);
        } else {
            Clause clauseW = yoj.b.w(new TimeClause(lastMessage.getTime().getMillis(), new TimeClause.Format.Pretty(0), null, null, 12), new DotDividerClause((Integer) null));
            k50.x xVar = pVar.f251358a;
            String message = lastMessage.getText();
            Intrinsics.checkNotNullParameter(message, "message");
            timeClause = yoj.b.w(clauseW, new HtmlClause(3, 28, (Integer) null, (Object) null, xVar.d(message, xVar.b(), k50.x.e).toString()));
        }
        l lVar = new l(chat.f285785a, chat.c(), v30.r.b(chat), chat.f285796r, i > 0, v30.r.a(chat), chat.f285798t);
        String strR = prk.o.r(uuid, "LIST_ID_CHAT_TO_AGENT");
        Image imageA = chat.e != v30.s0.CANCELED ? pVar.f251359b.a(messageAuthor) : null;
        if (imageA != null) {
            mVar = new com.revolut.core.ui_kit.delegates.m(imageA, i > 0 ? new NewBadgeContent.WithNumber(new NumberClause(i, (NumberClause.Format.Compact) null, (Custom) null, 6)) : null, (CircleBadgeModel) null, 8);
        } else {
            mVar = null;
        }
        ActionWidgetDelegate.Model model = new ActionWidgetDelegate.Model(strR, textLocalisedClause, timeClause, mVar, ActionWidgetDelegate.Model.b.C0394b.f51606a, ActionWidgetDelegate.Model.a.C0393a.f51604a, null, lVar, new AnalyticsContext(z50.a.a(AnalyticsContext.INSTANCE, uuid)), true, 4160);
        v30.j jVar = bVar.f276959a;
        SwipeToActionDelegate.SwipeAction[] elements = {new SwipeToActionDelegate.SwipeAction("ACTION_TRANSCRIPT_ID", new ResourceImage(R$drawable.uikit_icn_24_download, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.common_action_save, null, null, 14), null, null, jVar, null, 88), jVar.f285798t ? new SwipeToActionDelegate.SwipeAction("ACTION_END_CHAT_ID", new ResourceImage(R$drawable.uikit_icn_24_logout_door, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.chat_swipe_actions_end_chat, null, null, 14), xh0.NEUTRAL, null, jVar, null, 80) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new wh(strR, model, kotlin.collections.d.L(elements), null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList c(java.util.List r12, r40.a r13, boolean r14) {
        /*
            r11 = this;
            boolean r0 = r12.isEmpty()
            java.lang.String r1 = "<this>"
            if (r0 != 0) goto L45
            r40.h r0 = r13.f251319a
            boolean r0 = r0.f251338c
            if (r0 != 0) goto Lf
            goto L45
        Lf:
            int r0 = r12.size()
            java.util.ListIterator r0 = r12.listIterator(r0)
        L17:
            boolean r2 = r0.hasPrevious()
            r3 = -1
            if (r2 == 0) goto L34
            java.lang.Object r2 = r0.previous()
            u40.d r2 = (u40.d) r2
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            boolean r4 = r2 instanceof u40.b
            if (r4 != 0) goto L2f
            boolean r2 = r2 instanceof u40.a
            if (r2 == 0) goto L17
        L2f:
            int r0 = r0.nextIndex()
            goto L35
        L34:
            r0 = r3
        L35:
            if (r0 == r3) goto L40
            int r2 = zhm.v.j(r12)
            if (r0 >= r2) goto L40
            int r0 = r0 + 1
            goto L49
        L40:
            int r0 = r12.size()
            goto L49
        L45:
            int r0 = r12.size()
        L49:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
        L4f:
            if (r3 >= r0) goto Lbc
            java.lang.Object r4 = r12.get(r3)
            u40.d r4 = (u40.d) r4
            boolean r5 = r4 instanceof u40.b
            r6 = 0
            if (r5 == 0) goto L70
            u40.b r4 = (u40.b) r4
            v30.j r5 = r4.f276959a
            v30.s0 r5 = r5.e
            v30.s0 r7 = v30.s0.CANCELED
            if (r5 == r7) goto L6a
            com.revolut.core.ui_kit.delegates.wh r6 = r11.b(r4)
        L6a:
            java.util.List r4 = zhm.v.l(r6)
        L6e:
            r5 = r4
            goto La3
        L70:
            boolean r5 = r4 instanceof u40.a
            if (r5 == 0) goto L98
            u40.a r4 = (u40.a) r4
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            w30.n r4 = r4.f276956a
            w30.y r5 = r4.f294106h
            boolean r7 = r5 instanceof w30.v
            if (r7 == 0) goto L8b
            w30.v r5 = (w30.v) r5
            boolean r7 = r5.f294124c
            if (r7 == 0) goto L8b
            com.revolut.chat.domain.model.LastMessage r5 = r5.f294122a
            if (r5 == 0) goto L91
        L8b:
            e40.w r5 = r11.d
            java.util.List r6 = r5.f(r4)
        L91:
            if (r6 != 0) goto L96
            zhm.f0 r4 = zhm.f0.f322471a
            goto L6e
        L96:
            r5 = r6
            goto La3
        L98:
            boolean r5 = r4 instanceof u40.c
            if (r5 == 0) goto Lb6
            u40.c r4 = (u40.c) r4
            java.util.List r4 = r11.d(r4, r13, r14)
            goto L6e
        La3:
            if (r14 == 0) goto Lae
            r9 = 0
            r10 = 31
            r6 = 0
            r7 = 0
            r8 = 0
            yp0.b.k(r5, r6, r7, r8, r9, r10)
        Lae:
            java.util.Collection r5 = (java.util.Collection) r5
            r2.addAll(r5)
            int r3 = r3 + 1
            goto L4f
        Lb6:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        Lbc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: r40.c1.c(java.util.List, r40.a, boolean):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List d(u40.c r16, r40.a r17, boolean r18) {
        /*
            r15 = this;
            r0 = r17
            java.lang.String r1 = r0.d
            com.revolut.feature.feedback.api.domain.Feedback r2 = r0.e
            r3 = r16
            v30.z r4 = r3.f276962a
            kse.a r5 = r4.f285839a
            java.lang.String r5 = r5.f189436a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r5)
            ose.c r5 = new ose.c
            r6 = 1
            r5.<init>(r1, r6)
            java.util.Map r0 = r0.f
            java.lang.String r1 = r3.a()
            java.lang.Object r0 = r0.get(r1)
            r1 = r0
            com.revolut.data.model.Data r1 = (com.revolut.data.model.Data) r1
            r3 = 0
            if (r1 == 0) goto L5d
            java.lang.Object r0 = r1.getContent()     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L43
            u40.d r0 = (u40.d) r0     // Catch: java.lang.Throwable -> L37
            boolean r6 = r0 instanceof u40.c     // Catch: java.lang.Throwable -> L37
            if (r6 == 0) goto L39
            u40.c r0 = (u40.c) r0     // Catch: java.lang.Throwable -> L37
            goto L3a
        L37:
            r0 = move-exception
            goto L53
        L39:
            r0 = r3
        L3a:
            if (r0 == 0) goto L43
            v30.z r0 = r0.f276962a     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L43
            com.revolut.feature.tickets.api.models.TicketDetails r0 = r0.f285840b     // Catch: java.lang.Throwable -> L37
            goto L44
        L43:
            r0 = r3
        L44:
            java.lang.Throwable r6 = r1.getError()     // Catch: java.lang.Throwable -> L37
            boolean r7 = r1.getLoading()     // Catch: java.lang.Throwable -> L37
            com.revolut.data.model.Data r8 = new com.revolut.data.model.Data     // Catch: java.lang.Throwable -> L37
            r8.<init>(r0, r6, r7)     // Catch: java.lang.Throwable -> L37
            r3 = r8
            goto L5d
        L53:
            com.revolut.data.model.Data r6 = new com.revolut.data.model.Data
            boolean r1 = r1.getLoading()
            r6.<init>(r3, r0, r1)
            r3 = r6
        L5d:
            ose.e r0 = r15.e
            if (r3 == 0) goto L6b
            com.revolut.feature.tickets.api.models.TicketDetails r1 = r4.f285840b
            ose.a r6 = ose.e.Companion
            java.util.List r0 = r0.c(r3, r1, r2, r5)
        L69:
            r7 = r0
            goto L75
        L6b:
            com.revolut.feature.tickets.api.models.TicketDetails r1 = r4.f285840b
            ose.a r3 = ose.e.Companion
            r3 = 0
            java.util.List r0 = r0.b(r1, r2, r5, r3)
            goto L69
        L75:
            if (r18 == 0) goto L9a
            kse.a r0 = r4.f285839a
            java.lang.String r6 = r0.f189436a
            ip0.tc r9 = new ip0.tc
            ip0.oc r0 = ip0.oc.f165651a
            r9.<init>(r0)
            pse.a r10 = new pse.a
            kse.a r0 = r4.f285839a
            java.lang.String r0 = r0.f189436a
            r10.<init>(r0)
            ip0.xc r5 = new ip0.xc
            r13 = 0
            r14 = 972(0x3cc, float:1.362E-42)
            r8 = 0
            r11 = 0
            r12 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.util.List r7 = zhm.u.c(r5)
        L9a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r40.c1.d(u40.c, r40.a, boolean):java.util.List");
    }
}
