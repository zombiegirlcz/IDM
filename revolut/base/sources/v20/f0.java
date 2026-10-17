package v20;

import com.revolut.chat.data.db.ChatDatabase;
import com.revolut.chat.data.network.TicketsInfoApi;
import com.revolut.chat.domain.model.ChatMessageToPass;
import com.revolut.chat.domain.model.rate.ChatRateException;
import com.revolut.core.model.faq.FaqMetaData;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements o {

    @NotNull
    private static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s20.d f285383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TicketsInfoApi f285384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d4m.a f285385c;
    public final tf3.b d;
    public final e30.b e;
    public final y10.h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ne0.j f285386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ue0.c f285387h;
    public final d30.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j30.c f285388j;
    public final CoroutineScope k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final hlm.c f285389l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f285390m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w4l.f f285391n;
    public final fd0.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w4l.f f285392p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w4l.f f285393q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w4l.f f285394r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w4l.f f285395s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x4l.c f285396t;
    public final w4l.f u;
    public final ihm.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Lazy f285397w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Lazy f285398x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final w4l.f f285399y;
    public final x4l.c z;

    public f0(s20.d agentDataSource, TicketsInfoApi ticketInfoApi, d4m.a chatDatabaseLazy, tf3.b authorisationStatus, e30.b webSocketDelegate, y10.h mapper, ne0.j memoryCache, ue0.c storage, d30.c fileUrlDataSource, j30.c chatFeatureToggles, CoroutineScope appCoroutineScope, a40.b interceptor) {
        Intrinsics.checkNotNullParameter(agentDataSource, "agentDataSource");
        Intrinsics.checkNotNullParameter(ticketInfoApi, "ticketInfoApi");
        Intrinsics.checkNotNullParameter(chatDatabaseLazy, "chatDatabaseLazy");
        Intrinsics.checkNotNullParameter(authorisationStatus, "authorisationStatus");
        Intrinsics.checkNotNullParameter(webSocketDelegate, "webSocketDelegate");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(fileUrlDataSource, "fileUrlDataSource");
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        this.f285383a = agentDataSource;
        this.f285384b = ticketInfoApi;
        this.f285385c = chatDatabaseLazy;
        this.d = authorisationStatus;
        this.e = webSocketDelegate;
        this.f = mapper;
        this.f285386g = memoryCache;
        this.f285387h = storage;
        this.i = fileUrlDataSource;
        this.f285388j = chatFeatureToggles;
        this.k = appCoroutineScope;
        this.f285389l = hlm.d.a();
        this.f285390m = new AtomicBoolean(false);
        final int i = 18;
        final int i2 = 6;
        final int i3 = 13;
        this.f285391n = new w4l.f(new Function2(this) { // from class: v20.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f285525b;

            {
                this.f285525b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        v30.j ticket = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "id");
                        Intrinsics.checkNotNullParameter(ticket, "ticket");
                        this.f285525b.p(ticket);
                        return Unit.f186387a;
                    case 1:
                        v30.j ticket2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(ticket2, "ticket");
                        f0 f0Var = this.f285525b;
                        f0Var.g().h().b0(f0Var.f.e(ticket2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        f1 params = (f1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        return this.f285525b.j(params.f285400a, params.f285401b, v30.t.DEFAULT);
                    case 3:
                        f1 param = (f1) obj2;
                        d1 ticket3 = (d1) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(ticket3, "ticket");
                        this.f285525b.f285386g.f("next_ticket_" + param.a() + "_" + param.b(), ticket3);
                        return Unit.f186387a;
                    case 4:
                        UUID chatId = (UUID) obj2;
                        z30.j tags = (z30.j) obj3;
                        Intrinsics.checkNotNullParameter(chatId, "chatId");
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        this.f285525b.f285386g.f("experience_ratings_for_" + chatId, tags);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String key = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        ufm.c cVar = new ufm.c(new to7.f(this.f285525b, key, 8), 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        return cVar;
                    case 6:
                        List chats = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats, "chats");
                        List list = chats;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj4 : list) {
                            v30.c0 c0VarI = ((v30.j) obj4).i();
                            Object arrayList = linkedHashMap.get(c0VarI);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(c0VarI, arrayList);
                            }
                            ((List) arrayList).add(obj4);
                        }
                        Iterator it8 = linkedHashMap.entrySet().iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            f0 f0Var2 = this.f285525b;
                            if (!zHasNext) {
                                Iterator it9 = list.iterator();
                                while (it9.hasNext()) {
                                    f0Var2.p((v30.j) it9.next());
                                }
                                return Unit.f186387a;
                            }
                            Map.Entry entry = (Map.Entry) it8.next();
                            f0Var2.f285386g.f(((v30.c0) entry.getKey()).d(), (List) entry.getValue());
                        }
                        break;
                    case 7:
                        String key2 = (String) obj2;
                        UUID uuid = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(uuid, "uuid");
                        this.f285525b.f285386g.f(key2, uuid);
                        return Unit.f186387a;
                    case 8:
                        String key3 = (String) obj2;
                        UUID messageId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(messageId, "messageId");
                        this.f285525b.f285387h.G(messageId, key3, wim.z.d(kotlin.jvm.internal.o0.b(UUID.class)));
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        UUID ticketId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
                        efm.d0<m20.d> availability = this.f285525b.f285384b.getAvailability(ticketId);
                        uz7.f fVar = new uz7.f(14, new v0k.g(21));
                        availability.getClass();
                        ufm.i iVar = new ufm.i(availability, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 10:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        od0.i params2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        f0 f0Var3 = this.f285525b;
                        return f0Var3.e(f0Var3.f285384b.getLastTicket((UUID) params2.f224257a), null);
                    case 11:
                        od0.i params3 = (od0.i) obj2;
                        v30.j chat = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(chat, "chat");
                        f0 f0Var4 = this.f285525b;
                        f0Var4.f285386g.f("key_memory_cache_last_chat" + params3.f224257a, chat);
                        f0Var4.p(chat);
                        return Unit.f186387a;
                    case 12:
                        v30.j chat2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((od0.i) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chat2, "chat");
                        f0 f0Var5 = this.f285525b;
                        f0Var5.g().h().b0(f0Var5.f.e(chat2));
                        return Unit.f186387a;
                    case 13:
                        List chats2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats2, "chats");
                        f0 f0Var6 = this.f285525b;
                        r10.d dVarH = f0Var6.g().h();
                        List list2 = chats2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(f0Var6.f.e((v30.j) it10.next()));
                        }
                        dVarH.a0(arrayList2);
                        return Unit.f186387a;
                    case 14:
                        List feeds = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeds, "feeds");
                        f0 f0Var7 = this.f285525b;
                        f0Var7.f285386g.f("key_memory_cache_feeds", feeds);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it11 = feeds.iterator();
                        while (it11.hasNext()) {
                            v30.j jVarB = ((v30.y) it11.next()).b();
                            if (jVarB != null) {
                                arrayList3.add(jVarB);
                            }
                        }
                        Iterator it12 = arrayList3.iterator();
                        while (it12.hasNext()) {
                            f0Var7.p((v30.j) it12.next());
                        }
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        m params4 = (m) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        f0 f0Var8 = this.f285525b;
                        TicketsInfoApi ticketsInfoApi = f0Var8.f285384b;
                        Instant instantNow = params4.f285468a;
                        if (instantNow == null) {
                            instantNow = Instant.now();
                        }
                        Intrinsics.h(instantNow);
                        return f0Var8.d(ticketsInfoApi.getResolvedTickets(instantNow, 20), null);
                    case 16:
                        m params5 = (m) obj2;
                        List chats3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(chats3, "chats");
                        Instant instant = params5.f285468a;
                        f0 f0Var9 = this.f285525b;
                        if (instant != null) {
                            f0Var9.o.d(instant, chats3);
                        } else {
                            f0Var9.f285386g.f("chats_history", chats3);
                        }
                        return Unit.f186387a;
                    case 17:
                        List chats4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((m) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats4, "chats");
                        f0 f0Var10 = this.f285525b;
                        r10.d dVarH2 = f0Var10.g().h();
                        List list3 = chats4;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it13 = list3.iterator();
                        while (it13.hasNext()) {
                            arrayList4.add(f0Var10.f.e((v30.j) it13.next()));
                        }
                        dVarH2.a0(arrayList4);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        v30.c0 feedType = (v30.c0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(feedType, "feedType");
                        f0 f0Var11 = this.f285525b;
                        return f0Var11.d(f0Var11.f285384b.getTicketList(zhm.u.c(feedType.c())), feedType);
                    case 19:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<g20.b> inbox = this.f285525b.f285384b.getInbox();
                        uz7.f fVar2 = new uz7.f(18, new v0k.g(24));
                        inbox.getClass();
                        ufm.i iVar2 = new ufm.i(inbox, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 20:
                        Integer num = (Integer) obj3;
                        num.intValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285386g.f("unread_count", num);
                        return Unit.f186387a;
                    case 21:
                        Integer num2 = (Integer) obj3;
                        num2.getClass();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285387h.G(num2, "unread_count", wim.z.d(kotlin.jvm.internal.o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it15 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it15, "it");
                        f0 f0Var12 = this.f285525b;
                        efm.d0<g20.a> clientInfo = f0Var12.f285384b.getClientInfo();
                        uz7.f fVar3 = new uz7.f(19, new v0k.g(f0Var12));
                        clientInfo.getClass();
                        ufm.i iVar3 = new ufm.i(clientInfo, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 23:
                        l clientInfo2 = (l) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(clientInfo2, "clientInfo");
                        this.f285525b.f285386g.f("clientInfo", clientInfo2);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        UUID id10 = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        f0 f0Var13 = this.f285525b;
                        return f0Var13.e(f0Var13.f285384b.getTicket(id10), null);
                }
            }
        }, new p(this, 0), new Function2(this) { // from class: v20.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f285525b;

            {
                this.f285525b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        v30.j ticket = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "id");
                        Intrinsics.checkNotNullParameter(ticket, "ticket");
                        this.f285525b.p(ticket);
                        return Unit.f186387a;
                    case 1:
                        v30.j ticket2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(ticket2, "ticket");
                        f0 f0Var = this.f285525b;
                        f0Var.g().h().b0(f0Var.f.e(ticket2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        f1 params = (f1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        return this.f285525b.j(params.f285400a, params.f285401b, v30.t.DEFAULT);
                    case 3:
                        f1 param = (f1) obj2;
                        d1 ticket3 = (d1) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(ticket3, "ticket");
                        this.f285525b.f285386g.f("next_ticket_" + param.a() + "_" + param.b(), ticket3);
                        return Unit.f186387a;
                    case 4:
                        UUID chatId = (UUID) obj2;
                        z30.j tags = (z30.j) obj3;
                        Intrinsics.checkNotNullParameter(chatId, "chatId");
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        this.f285525b.f285386g.f("experience_ratings_for_" + chatId, tags);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String key = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        ufm.c cVar = new ufm.c(new to7.f(this.f285525b, key, 8), 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        return cVar;
                    case 6:
                        List chats = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats, "chats");
                        List list = chats;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj4 : list) {
                            v30.c0 c0VarI = ((v30.j) obj4).i();
                            Object arrayList = linkedHashMap.get(c0VarI);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(c0VarI, arrayList);
                            }
                            ((List) arrayList).add(obj4);
                        }
                        Iterator it8 = linkedHashMap.entrySet().iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            f0 f0Var2 = this.f285525b;
                            if (!zHasNext) {
                                Iterator it9 = list.iterator();
                                while (it9.hasNext()) {
                                    f0Var2.p((v30.j) it9.next());
                                }
                                return Unit.f186387a;
                            }
                            Map.Entry entry = (Map.Entry) it8.next();
                            f0Var2.f285386g.f(((v30.c0) entry.getKey()).d(), (List) entry.getValue());
                        }
                        break;
                    case 7:
                        String key2 = (String) obj2;
                        UUID uuid = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(uuid, "uuid");
                        this.f285525b.f285386g.f(key2, uuid);
                        return Unit.f186387a;
                    case 8:
                        String key3 = (String) obj2;
                        UUID messageId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(messageId, "messageId");
                        this.f285525b.f285387h.G(messageId, key3, wim.z.d(kotlin.jvm.internal.o0.b(UUID.class)));
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        UUID ticketId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
                        efm.d0<m20.d> availability = this.f285525b.f285384b.getAvailability(ticketId);
                        uz7.f fVar = new uz7.f(14, new v0k.g(21));
                        availability.getClass();
                        ufm.i iVar = new ufm.i(availability, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 10:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        od0.i params2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        f0 f0Var3 = this.f285525b;
                        return f0Var3.e(f0Var3.f285384b.getLastTicket((UUID) params2.f224257a), null);
                    case 11:
                        od0.i params3 = (od0.i) obj2;
                        v30.j chat = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(chat, "chat");
                        f0 f0Var4 = this.f285525b;
                        f0Var4.f285386g.f("key_memory_cache_last_chat" + params3.f224257a, chat);
                        f0Var4.p(chat);
                        return Unit.f186387a;
                    case 12:
                        v30.j chat2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((od0.i) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chat2, "chat");
                        f0 f0Var5 = this.f285525b;
                        f0Var5.g().h().b0(f0Var5.f.e(chat2));
                        return Unit.f186387a;
                    case 13:
                        List chats2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats2, "chats");
                        f0 f0Var6 = this.f285525b;
                        r10.d dVarH = f0Var6.g().h();
                        List list2 = chats2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(f0Var6.f.e((v30.j) it10.next()));
                        }
                        dVarH.a0(arrayList2);
                        return Unit.f186387a;
                    case 14:
                        List feeds = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeds, "feeds");
                        f0 f0Var7 = this.f285525b;
                        f0Var7.f285386g.f("key_memory_cache_feeds", feeds);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it11 = feeds.iterator();
                        while (it11.hasNext()) {
                            v30.j jVarB = ((v30.y) it11.next()).b();
                            if (jVarB != null) {
                                arrayList3.add(jVarB);
                            }
                        }
                        Iterator it12 = arrayList3.iterator();
                        while (it12.hasNext()) {
                            f0Var7.p((v30.j) it12.next());
                        }
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        m params4 = (m) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        f0 f0Var8 = this.f285525b;
                        TicketsInfoApi ticketsInfoApi = f0Var8.f285384b;
                        Instant instantNow = params4.f285468a;
                        if (instantNow == null) {
                            instantNow = Instant.now();
                        }
                        Intrinsics.h(instantNow);
                        return f0Var8.d(ticketsInfoApi.getResolvedTickets(instantNow, 20), null);
                    case 16:
                        m params5 = (m) obj2;
                        List chats3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(chats3, "chats");
                        Instant instant = params5.f285468a;
                        f0 f0Var9 = this.f285525b;
                        if (instant != null) {
                            f0Var9.o.d(instant, chats3);
                        } else {
                            f0Var9.f285386g.f("chats_history", chats3);
                        }
                        return Unit.f186387a;
                    case 17:
                        List chats4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((m) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats4, "chats");
                        f0 f0Var10 = this.f285525b;
                        r10.d dVarH2 = f0Var10.g().h();
                        List list3 = chats4;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it13 = list3.iterator();
                        while (it13.hasNext()) {
                            arrayList4.add(f0Var10.f.e((v30.j) it13.next()));
                        }
                        dVarH2.a0(arrayList4);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        v30.c0 feedType = (v30.c0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(feedType, "feedType");
                        f0 f0Var11 = this.f285525b;
                        return f0Var11.d(f0Var11.f285384b.getTicketList(zhm.u.c(feedType.c())), feedType);
                    case 19:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<g20.b> inbox = this.f285525b.f285384b.getInbox();
                        uz7.f fVar2 = new uz7.f(18, new v0k.g(24));
                        inbox.getClass();
                        ufm.i iVar2 = new ufm.i(inbox, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 20:
                        Integer num = (Integer) obj3;
                        num.intValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285386g.f("unread_count", num);
                        return Unit.f186387a;
                    case 21:
                        Integer num2 = (Integer) obj3;
                        num2.getClass();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285387h.G(num2, "unread_count", wim.z.d(kotlin.jvm.internal.o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it15 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it15, "it");
                        f0 f0Var12 = this.f285525b;
                        efm.d0<g20.a> clientInfo = f0Var12.f285384b.getClientInfo();
                        uz7.f fVar3 = new uz7.f(19, new v0k.g(f0Var12));
                        clientInfo.getClass();
                        ufm.i iVar3 = new ufm.i(clientInfo, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 23:
                        l clientInfo2 = (l) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(clientInfo2, "clientInfo");
                        this.f285525b.f285386g.f("clientInfo", clientInfo2);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        UUID id10 = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        f0 f0Var13 = this.f285525b;
                        return f0Var13.e(f0Var13.f285384b.getTicket(id10), null);
                }
            }
        }, null, new Function2(this) { // from class: v20.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f285525b;

            {
                this.f285525b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        v30.j ticket = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "id");
                        Intrinsics.checkNotNullParameter(ticket, "ticket");
                        this.f285525b.p(ticket);
                        return Unit.f186387a;
                    case 1:
                        v30.j ticket2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(ticket2, "ticket");
                        f0 f0Var = this.f285525b;
                        f0Var.g().h().b0(f0Var.f.e(ticket2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        f1 params = (f1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        return this.f285525b.j(params.f285400a, params.f285401b, v30.t.DEFAULT);
                    case 3:
                        f1 param = (f1) obj2;
                        d1 ticket3 = (d1) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(ticket3, "ticket");
                        this.f285525b.f285386g.f("next_ticket_" + param.a() + "_" + param.b(), ticket3);
                        return Unit.f186387a;
                    case 4:
                        UUID chatId = (UUID) obj2;
                        z30.j tags = (z30.j) obj3;
                        Intrinsics.checkNotNullParameter(chatId, "chatId");
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        this.f285525b.f285386g.f("experience_ratings_for_" + chatId, tags);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String key = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        ufm.c cVar = new ufm.c(new to7.f(this.f285525b, key, 8), 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        return cVar;
                    case 6:
                        List chats = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats, "chats");
                        List list = chats;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj4 : list) {
                            v30.c0 c0VarI = ((v30.j) obj4).i();
                            Object arrayList = linkedHashMap.get(c0VarI);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(c0VarI, arrayList);
                            }
                            ((List) arrayList).add(obj4);
                        }
                        Iterator it8 = linkedHashMap.entrySet().iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            f0 f0Var2 = this.f285525b;
                            if (!zHasNext) {
                                Iterator it9 = list.iterator();
                                while (it9.hasNext()) {
                                    f0Var2.p((v30.j) it9.next());
                                }
                                return Unit.f186387a;
                            }
                            Map.Entry entry = (Map.Entry) it8.next();
                            f0Var2.f285386g.f(((v30.c0) entry.getKey()).d(), (List) entry.getValue());
                        }
                        break;
                    case 7:
                        String key2 = (String) obj2;
                        UUID uuid = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(uuid, "uuid");
                        this.f285525b.f285386g.f(key2, uuid);
                        return Unit.f186387a;
                    case 8:
                        String key3 = (String) obj2;
                        UUID messageId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(messageId, "messageId");
                        this.f285525b.f285387h.G(messageId, key3, wim.z.d(kotlin.jvm.internal.o0.b(UUID.class)));
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        UUID ticketId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
                        efm.d0<m20.d> availability = this.f285525b.f285384b.getAvailability(ticketId);
                        uz7.f fVar = new uz7.f(14, new v0k.g(21));
                        availability.getClass();
                        ufm.i iVar = new ufm.i(availability, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 10:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        od0.i params2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        f0 f0Var3 = this.f285525b;
                        return f0Var3.e(f0Var3.f285384b.getLastTicket((UUID) params2.f224257a), null);
                    case 11:
                        od0.i params3 = (od0.i) obj2;
                        v30.j chat = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(chat, "chat");
                        f0 f0Var4 = this.f285525b;
                        f0Var4.f285386g.f("key_memory_cache_last_chat" + params3.f224257a, chat);
                        f0Var4.p(chat);
                        return Unit.f186387a;
                    case 12:
                        v30.j chat2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((od0.i) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chat2, "chat");
                        f0 f0Var5 = this.f285525b;
                        f0Var5.g().h().b0(f0Var5.f.e(chat2));
                        return Unit.f186387a;
                    case 13:
                        List chats2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats2, "chats");
                        f0 f0Var6 = this.f285525b;
                        r10.d dVarH = f0Var6.g().h();
                        List list2 = chats2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(f0Var6.f.e((v30.j) it10.next()));
                        }
                        dVarH.a0(arrayList2);
                        return Unit.f186387a;
                    case 14:
                        List feeds = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeds, "feeds");
                        f0 f0Var7 = this.f285525b;
                        f0Var7.f285386g.f("key_memory_cache_feeds", feeds);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it11 = feeds.iterator();
                        while (it11.hasNext()) {
                            v30.j jVarB = ((v30.y) it11.next()).b();
                            if (jVarB != null) {
                                arrayList3.add(jVarB);
                            }
                        }
                        Iterator it12 = arrayList3.iterator();
                        while (it12.hasNext()) {
                            f0Var7.p((v30.j) it12.next());
                        }
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        m params4 = (m) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        f0 f0Var8 = this.f285525b;
                        TicketsInfoApi ticketsInfoApi = f0Var8.f285384b;
                        Instant instantNow = params4.f285468a;
                        if (instantNow == null) {
                            instantNow = Instant.now();
                        }
                        Intrinsics.h(instantNow);
                        return f0Var8.d(ticketsInfoApi.getResolvedTickets(instantNow, 20), null);
                    case 16:
                        m params5 = (m) obj2;
                        List chats3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(chats3, "chats");
                        Instant instant = params5.f285468a;
                        f0 f0Var9 = this.f285525b;
                        if (instant != null) {
                            f0Var9.o.d(instant, chats3);
                        } else {
                            f0Var9.f285386g.f("chats_history", chats3);
                        }
                        return Unit.f186387a;
                    case 17:
                        List chats4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((m) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats4, "chats");
                        f0 f0Var10 = this.f285525b;
                        r10.d dVarH2 = f0Var10.g().h();
                        List list3 = chats4;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it13 = list3.iterator();
                        while (it13.hasNext()) {
                            arrayList4.add(f0Var10.f.e((v30.j) it13.next()));
                        }
                        dVarH2.a0(arrayList4);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        v30.c0 feedType = (v30.c0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(feedType, "feedType");
                        f0 f0Var11 = this.f285525b;
                        return f0Var11.d(f0Var11.f285384b.getTicketList(zhm.u.c(feedType.c())), feedType);
                    case 19:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<g20.b> inbox = this.f285525b.f285384b.getInbox();
                        uz7.f fVar2 = new uz7.f(18, new v0k.g(24));
                        inbox.getClass();
                        ufm.i iVar2 = new ufm.i(inbox, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 20:
                        Integer num = (Integer) obj3;
                        num.intValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285386g.f("unread_count", num);
                        return Unit.f186387a;
                    case 21:
                        Integer num2 = (Integer) obj3;
                        num2.getClass();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285387h.G(num2, "unread_count", wim.z.d(kotlin.jvm.internal.o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it15 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it15, "it");
                        f0 f0Var12 = this.f285525b;
                        efm.d0<g20.a> clientInfo = f0Var12.f285384b.getClientInfo();
                        uz7.f fVar3 = new uz7.f(19, new v0k.g(f0Var12));
                        clientInfo.getClass();
                        ufm.i iVar3 = new ufm.i(clientInfo, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 23:
                        l clientInfo2 = (l) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(clientInfo2, "clientInfo");
                        this.f285525b.f285386g.f("clientInfo", clientInfo2);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        UUID id10 = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        f0 f0Var13 = this.f285525b;
                        return f0Var13.e(f0Var13.f285384b.getTicket(id10), null);
                }
            }
        }, null, new p(this, 9), null, 168);
        this.o = new fd0.d(5);
        final int i5 = 15;
        final int i6 = 16;
        final int i21 = 17;
        this.f285392p = new w4l.f(new Function2(this) { // from class: v20.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f285525b;

            {
                this.f285525b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        v30.j ticket = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "id");
                        Intrinsics.checkNotNullParameter(ticket, "ticket");
                        this.f285525b.p(ticket);
                        return Unit.f186387a;
                    case 1:
                        v30.j ticket2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(ticket2, "ticket");
                        f0 f0Var = this.f285525b;
                        f0Var.g().h().b0(f0Var.f.e(ticket2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        f1 params = (f1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        return this.f285525b.j(params.f285400a, params.f285401b, v30.t.DEFAULT);
                    case 3:
                        f1 param = (f1) obj2;
                        d1 ticket3 = (d1) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(ticket3, "ticket");
                        this.f285525b.f285386g.f("next_ticket_" + param.a() + "_" + param.b(), ticket3);
                        return Unit.f186387a;
                    case 4:
                        UUID chatId = (UUID) obj2;
                        z30.j tags = (z30.j) obj3;
                        Intrinsics.checkNotNullParameter(chatId, "chatId");
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        this.f285525b.f285386g.f("experience_ratings_for_" + chatId, tags);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String key = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        ufm.c cVar = new ufm.c(new to7.f(this.f285525b, key, 8), 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        return cVar;
                    case 6:
                        List chats = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats, "chats");
                        List list = chats;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj4 : list) {
                            v30.c0 c0VarI = ((v30.j) obj4).i();
                            Object arrayList = linkedHashMap.get(c0VarI);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(c0VarI, arrayList);
                            }
                            ((List) arrayList).add(obj4);
                        }
                        Iterator it8 = linkedHashMap.entrySet().iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            f0 f0Var2 = this.f285525b;
                            if (!zHasNext) {
                                Iterator it9 = list.iterator();
                                while (it9.hasNext()) {
                                    f0Var2.p((v30.j) it9.next());
                                }
                                return Unit.f186387a;
                            }
                            Map.Entry entry = (Map.Entry) it8.next();
                            f0Var2.f285386g.f(((v30.c0) entry.getKey()).d(), (List) entry.getValue());
                        }
                        break;
                    case 7:
                        String key2 = (String) obj2;
                        UUID uuid = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(uuid, "uuid");
                        this.f285525b.f285386g.f(key2, uuid);
                        return Unit.f186387a;
                    case 8:
                        String key3 = (String) obj2;
                        UUID messageId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(messageId, "messageId");
                        this.f285525b.f285387h.G(messageId, key3, wim.z.d(kotlin.jvm.internal.o0.b(UUID.class)));
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        UUID ticketId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
                        efm.d0<m20.d> availability = this.f285525b.f285384b.getAvailability(ticketId);
                        uz7.f fVar = new uz7.f(14, new v0k.g(21));
                        availability.getClass();
                        ufm.i iVar = new ufm.i(availability, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 10:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        od0.i params2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        f0 f0Var3 = this.f285525b;
                        return f0Var3.e(f0Var3.f285384b.getLastTicket((UUID) params2.f224257a), null);
                    case 11:
                        od0.i params3 = (od0.i) obj2;
                        v30.j chat = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(chat, "chat");
                        f0 f0Var4 = this.f285525b;
                        f0Var4.f285386g.f("key_memory_cache_last_chat" + params3.f224257a, chat);
                        f0Var4.p(chat);
                        return Unit.f186387a;
                    case 12:
                        v30.j chat2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((od0.i) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chat2, "chat");
                        f0 f0Var5 = this.f285525b;
                        f0Var5.g().h().b0(f0Var5.f.e(chat2));
                        return Unit.f186387a;
                    case 13:
                        List chats2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats2, "chats");
                        f0 f0Var6 = this.f285525b;
                        r10.d dVarH = f0Var6.g().h();
                        List list2 = chats2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(f0Var6.f.e((v30.j) it10.next()));
                        }
                        dVarH.a0(arrayList2);
                        return Unit.f186387a;
                    case 14:
                        List feeds = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeds, "feeds");
                        f0 f0Var7 = this.f285525b;
                        f0Var7.f285386g.f("key_memory_cache_feeds", feeds);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it11 = feeds.iterator();
                        while (it11.hasNext()) {
                            v30.j jVarB = ((v30.y) it11.next()).b();
                            if (jVarB != null) {
                                arrayList3.add(jVarB);
                            }
                        }
                        Iterator it12 = arrayList3.iterator();
                        while (it12.hasNext()) {
                            f0Var7.p((v30.j) it12.next());
                        }
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        m params4 = (m) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        f0 f0Var8 = this.f285525b;
                        TicketsInfoApi ticketsInfoApi = f0Var8.f285384b;
                        Instant instantNow = params4.f285468a;
                        if (instantNow == null) {
                            instantNow = Instant.now();
                        }
                        Intrinsics.h(instantNow);
                        return f0Var8.d(ticketsInfoApi.getResolvedTickets(instantNow, 20), null);
                    case 16:
                        m params5 = (m) obj2;
                        List chats3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(chats3, "chats");
                        Instant instant = params5.f285468a;
                        f0 f0Var9 = this.f285525b;
                        if (instant != null) {
                            f0Var9.o.d(instant, chats3);
                        } else {
                            f0Var9.f285386g.f("chats_history", chats3);
                        }
                        return Unit.f186387a;
                    case 17:
                        List chats4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((m) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats4, "chats");
                        f0 f0Var10 = this.f285525b;
                        r10.d dVarH2 = f0Var10.g().h();
                        List list3 = chats4;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it13 = list3.iterator();
                        while (it13.hasNext()) {
                            arrayList4.add(f0Var10.f.e((v30.j) it13.next()));
                        }
                        dVarH2.a0(arrayList4);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        v30.c0 feedType = (v30.c0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(feedType, "feedType");
                        f0 f0Var11 = this.f285525b;
                        return f0Var11.d(f0Var11.f285384b.getTicketList(zhm.u.c(feedType.c())), feedType);
                    case 19:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<g20.b> inbox = this.f285525b.f285384b.getInbox();
                        uz7.f fVar2 = new uz7.f(18, new v0k.g(24));
                        inbox.getClass();
                        ufm.i iVar2 = new ufm.i(inbox, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 20:
                        Integer num = (Integer) obj3;
                        num.intValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285386g.f("unread_count", num);
                        return Unit.f186387a;
                    case 21:
                        Integer num2 = (Integer) obj3;
                        num2.getClass();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285387h.G(num2, "unread_count", wim.z.d(kotlin.jvm.internal.o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it15 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it15, "it");
                        f0 f0Var12 = this.f285525b;
                        efm.d0<g20.a> clientInfo = f0Var12.f285384b.getClientInfo();
                        uz7.f fVar3 = new uz7.f(19, new v0k.g(f0Var12));
                        clientInfo.getClass();
                        ufm.i iVar3 = new ufm.i(clientInfo, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 23:
                        l clientInfo2 = (l) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(clientInfo2, "clientInfo");
                        this.f285525b.f285386g.f("clientInfo", clientInfo2);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        UUID id10 = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        f0 f0Var13 = this.f285525b;
                        return f0Var13.e(f0Var13.f285384b.getTicket(id10), null);
                }
            }
        }, new p(this, 10), new Function2(this) { // from class: v20.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f285525b;

            {
                this.f285525b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        v30.j ticket = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "id");
                        Intrinsics.checkNotNullParameter(ticket, "ticket");
                        this.f285525b.p(ticket);
                        return Unit.f186387a;
                    case 1:
                        v30.j ticket2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(ticket2, "ticket");
                        f0 f0Var = this.f285525b;
                        f0Var.g().h().b0(f0Var.f.e(ticket2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        f1 params = (f1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        return this.f285525b.j(params.f285400a, params.f285401b, v30.t.DEFAULT);
                    case 3:
                        f1 param = (f1) obj2;
                        d1 ticket3 = (d1) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(ticket3, "ticket");
                        this.f285525b.f285386g.f("next_ticket_" + param.a() + "_" + param.b(), ticket3);
                        return Unit.f186387a;
                    case 4:
                        UUID chatId = (UUID) obj2;
                        z30.j tags = (z30.j) obj3;
                        Intrinsics.checkNotNullParameter(chatId, "chatId");
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        this.f285525b.f285386g.f("experience_ratings_for_" + chatId, tags);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String key = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        ufm.c cVar = new ufm.c(new to7.f(this.f285525b, key, 8), 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        return cVar;
                    case 6:
                        List chats = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats, "chats");
                        List list = chats;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj4 : list) {
                            v30.c0 c0VarI = ((v30.j) obj4).i();
                            Object arrayList = linkedHashMap.get(c0VarI);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(c0VarI, arrayList);
                            }
                            ((List) arrayList).add(obj4);
                        }
                        Iterator it8 = linkedHashMap.entrySet().iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            f0 f0Var2 = this.f285525b;
                            if (!zHasNext) {
                                Iterator it9 = list.iterator();
                                while (it9.hasNext()) {
                                    f0Var2.p((v30.j) it9.next());
                                }
                                return Unit.f186387a;
                            }
                            Map.Entry entry = (Map.Entry) it8.next();
                            f0Var2.f285386g.f(((v30.c0) entry.getKey()).d(), (List) entry.getValue());
                        }
                        break;
                    case 7:
                        String key2 = (String) obj2;
                        UUID uuid = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(uuid, "uuid");
                        this.f285525b.f285386g.f(key2, uuid);
                        return Unit.f186387a;
                    case 8:
                        String key3 = (String) obj2;
                        UUID messageId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(messageId, "messageId");
                        this.f285525b.f285387h.G(messageId, key3, wim.z.d(kotlin.jvm.internal.o0.b(UUID.class)));
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        UUID ticketId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
                        efm.d0<m20.d> availability = this.f285525b.f285384b.getAvailability(ticketId);
                        uz7.f fVar = new uz7.f(14, new v0k.g(21));
                        availability.getClass();
                        ufm.i iVar = new ufm.i(availability, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 10:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        od0.i params2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        f0 f0Var3 = this.f285525b;
                        return f0Var3.e(f0Var3.f285384b.getLastTicket((UUID) params2.f224257a), null);
                    case 11:
                        od0.i params3 = (od0.i) obj2;
                        v30.j chat = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(chat, "chat");
                        f0 f0Var4 = this.f285525b;
                        f0Var4.f285386g.f("key_memory_cache_last_chat" + params3.f224257a, chat);
                        f0Var4.p(chat);
                        return Unit.f186387a;
                    case 12:
                        v30.j chat2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((od0.i) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chat2, "chat");
                        f0 f0Var5 = this.f285525b;
                        f0Var5.g().h().b0(f0Var5.f.e(chat2));
                        return Unit.f186387a;
                    case 13:
                        List chats2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats2, "chats");
                        f0 f0Var6 = this.f285525b;
                        r10.d dVarH = f0Var6.g().h();
                        List list2 = chats2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(f0Var6.f.e((v30.j) it10.next()));
                        }
                        dVarH.a0(arrayList2);
                        return Unit.f186387a;
                    case 14:
                        List feeds = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeds, "feeds");
                        f0 f0Var7 = this.f285525b;
                        f0Var7.f285386g.f("key_memory_cache_feeds", feeds);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it11 = feeds.iterator();
                        while (it11.hasNext()) {
                            v30.j jVarB = ((v30.y) it11.next()).b();
                            if (jVarB != null) {
                                arrayList3.add(jVarB);
                            }
                        }
                        Iterator it12 = arrayList3.iterator();
                        while (it12.hasNext()) {
                            f0Var7.p((v30.j) it12.next());
                        }
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        m params4 = (m) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        f0 f0Var8 = this.f285525b;
                        TicketsInfoApi ticketsInfoApi = f0Var8.f285384b;
                        Instant instantNow = params4.f285468a;
                        if (instantNow == null) {
                            instantNow = Instant.now();
                        }
                        Intrinsics.h(instantNow);
                        return f0Var8.d(ticketsInfoApi.getResolvedTickets(instantNow, 20), null);
                    case 16:
                        m params5 = (m) obj2;
                        List chats3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(chats3, "chats");
                        Instant instant = params5.f285468a;
                        f0 f0Var9 = this.f285525b;
                        if (instant != null) {
                            f0Var9.o.d(instant, chats3);
                        } else {
                            f0Var9.f285386g.f("chats_history", chats3);
                        }
                        return Unit.f186387a;
                    case 17:
                        List chats4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((m) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats4, "chats");
                        f0 f0Var10 = this.f285525b;
                        r10.d dVarH2 = f0Var10.g().h();
                        List list3 = chats4;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it13 = list3.iterator();
                        while (it13.hasNext()) {
                            arrayList4.add(f0Var10.f.e((v30.j) it13.next()));
                        }
                        dVarH2.a0(arrayList4);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        v30.c0 feedType = (v30.c0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(feedType, "feedType");
                        f0 f0Var11 = this.f285525b;
                        return f0Var11.d(f0Var11.f285384b.getTicketList(zhm.u.c(feedType.c())), feedType);
                    case 19:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<g20.b> inbox = this.f285525b.f285384b.getInbox();
                        uz7.f fVar2 = new uz7.f(18, new v0k.g(24));
                        inbox.getClass();
                        ufm.i iVar2 = new ufm.i(inbox, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 20:
                        Integer num = (Integer) obj3;
                        num.intValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285386g.f("unread_count", num);
                        return Unit.f186387a;
                    case 21:
                        Integer num2 = (Integer) obj3;
                        num2.getClass();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285387h.G(num2, "unread_count", wim.z.d(kotlin.jvm.internal.o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it15 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it15, "it");
                        f0 f0Var12 = this.f285525b;
                        efm.d0<g20.a> clientInfo = f0Var12.f285384b.getClientInfo();
                        uz7.f fVar3 = new uz7.f(19, new v0k.g(f0Var12));
                        clientInfo.getClass();
                        ufm.i iVar3 = new ufm.i(clientInfo, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 23:
                        l clientInfo2 = (l) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(clientInfo2, "clientInfo");
                        this.f285525b.f285386g.f("clientInfo", clientInfo2);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        UUID id10 = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        f0 f0Var13 = this.f285525b;
                        return f0Var13.e(f0Var13.f285384b.getTicket(id10), null);
                }
            }
        }, null, new Function2(this) { // from class: v20.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f285525b;

            {
                this.f285525b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        v30.j ticket = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "id");
                        Intrinsics.checkNotNullParameter(ticket, "ticket");
                        this.f285525b.p(ticket);
                        return Unit.f186387a;
                    case 1:
                        v30.j ticket2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(ticket2, "ticket");
                        f0 f0Var = this.f285525b;
                        f0Var.g().h().b0(f0Var.f.e(ticket2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        f1 params = (f1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        return this.f285525b.j(params.f285400a, params.f285401b, v30.t.DEFAULT);
                    case 3:
                        f1 param = (f1) obj2;
                        d1 ticket3 = (d1) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(ticket3, "ticket");
                        this.f285525b.f285386g.f("next_ticket_" + param.a() + "_" + param.b(), ticket3);
                        return Unit.f186387a;
                    case 4:
                        UUID chatId = (UUID) obj2;
                        z30.j tags = (z30.j) obj3;
                        Intrinsics.checkNotNullParameter(chatId, "chatId");
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        this.f285525b.f285386g.f("experience_ratings_for_" + chatId, tags);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String key = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        ufm.c cVar = new ufm.c(new to7.f(this.f285525b, key, 8), 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        return cVar;
                    case 6:
                        List chats = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats, "chats");
                        List list = chats;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj4 : list) {
                            v30.c0 c0VarI = ((v30.j) obj4).i();
                            Object arrayList = linkedHashMap.get(c0VarI);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(c0VarI, arrayList);
                            }
                            ((List) arrayList).add(obj4);
                        }
                        Iterator it8 = linkedHashMap.entrySet().iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            f0 f0Var2 = this.f285525b;
                            if (!zHasNext) {
                                Iterator it9 = list.iterator();
                                while (it9.hasNext()) {
                                    f0Var2.p((v30.j) it9.next());
                                }
                                return Unit.f186387a;
                            }
                            Map.Entry entry = (Map.Entry) it8.next();
                            f0Var2.f285386g.f(((v30.c0) entry.getKey()).d(), (List) entry.getValue());
                        }
                        break;
                    case 7:
                        String key2 = (String) obj2;
                        UUID uuid = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(uuid, "uuid");
                        this.f285525b.f285386g.f(key2, uuid);
                        return Unit.f186387a;
                    case 8:
                        String key3 = (String) obj2;
                        UUID messageId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(messageId, "messageId");
                        this.f285525b.f285387h.G(messageId, key3, wim.z.d(kotlin.jvm.internal.o0.b(UUID.class)));
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        UUID ticketId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
                        efm.d0<m20.d> availability = this.f285525b.f285384b.getAvailability(ticketId);
                        uz7.f fVar = new uz7.f(14, new v0k.g(21));
                        availability.getClass();
                        ufm.i iVar = new ufm.i(availability, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 10:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        od0.i params2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        f0 f0Var3 = this.f285525b;
                        return f0Var3.e(f0Var3.f285384b.getLastTicket((UUID) params2.f224257a), null);
                    case 11:
                        od0.i params3 = (od0.i) obj2;
                        v30.j chat = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(chat, "chat");
                        f0 f0Var4 = this.f285525b;
                        f0Var4.f285386g.f("key_memory_cache_last_chat" + params3.f224257a, chat);
                        f0Var4.p(chat);
                        return Unit.f186387a;
                    case 12:
                        v30.j chat2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((od0.i) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chat2, "chat");
                        f0 f0Var5 = this.f285525b;
                        f0Var5.g().h().b0(f0Var5.f.e(chat2));
                        return Unit.f186387a;
                    case 13:
                        List chats2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats2, "chats");
                        f0 f0Var6 = this.f285525b;
                        r10.d dVarH = f0Var6.g().h();
                        List list2 = chats2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(f0Var6.f.e((v30.j) it10.next()));
                        }
                        dVarH.a0(arrayList2);
                        return Unit.f186387a;
                    case 14:
                        List feeds = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeds, "feeds");
                        f0 f0Var7 = this.f285525b;
                        f0Var7.f285386g.f("key_memory_cache_feeds", feeds);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it11 = feeds.iterator();
                        while (it11.hasNext()) {
                            v30.j jVarB = ((v30.y) it11.next()).b();
                            if (jVarB != null) {
                                arrayList3.add(jVarB);
                            }
                        }
                        Iterator it12 = arrayList3.iterator();
                        while (it12.hasNext()) {
                            f0Var7.p((v30.j) it12.next());
                        }
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        m params4 = (m) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        f0 f0Var8 = this.f285525b;
                        TicketsInfoApi ticketsInfoApi = f0Var8.f285384b;
                        Instant instantNow = params4.f285468a;
                        if (instantNow == null) {
                            instantNow = Instant.now();
                        }
                        Intrinsics.h(instantNow);
                        return f0Var8.d(ticketsInfoApi.getResolvedTickets(instantNow, 20), null);
                    case 16:
                        m params5 = (m) obj2;
                        List chats3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(chats3, "chats");
                        Instant instant = params5.f285468a;
                        f0 f0Var9 = this.f285525b;
                        if (instant != null) {
                            f0Var9.o.d(instant, chats3);
                        } else {
                            f0Var9.f285386g.f("chats_history", chats3);
                        }
                        return Unit.f186387a;
                    case 17:
                        List chats4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((m) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats4, "chats");
                        f0 f0Var10 = this.f285525b;
                        r10.d dVarH2 = f0Var10.g().h();
                        List list3 = chats4;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it13 = list3.iterator();
                        while (it13.hasNext()) {
                            arrayList4.add(f0Var10.f.e((v30.j) it13.next()));
                        }
                        dVarH2.a0(arrayList4);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        v30.c0 feedType = (v30.c0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(feedType, "feedType");
                        f0 f0Var11 = this.f285525b;
                        return f0Var11.d(f0Var11.f285384b.getTicketList(zhm.u.c(feedType.c())), feedType);
                    case 19:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<g20.b> inbox = this.f285525b.f285384b.getInbox();
                        uz7.f fVar2 = new uz7.f(18, new v0k.g(24));
                        inbox.getClass();
                        ufm.i iVar2 = new ufm.i(inbox, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 20:
                        Integer num = (Integer) obj3;
                        num.intValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285386g.f("unread_count", num);
                        return Unit.f186387a;
                    case 21:
                        Integer num2 = (Integer) obj3;
                        num2.getClass();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285387h.G(num2, "unread_count", wim.z.d(kotlin.jvm.internal.o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it15 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it15, "it");
                        f0 f0Var12 = this.f285525b;
                        efm.d0<g20.a> clientInfo = f0Var12.f285384b.getClientInfo();
                        uz7.f fVar3 = new uz7.f(19, new v0k.g(f0Var12));
                        clientInfo.getClass();
                        ufm.i iVar3 = new ufm.i(clientInfo, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 23:
                        l clientInfo2 = (l) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(clientInfo2, "clientInfo");
                        this.f285525b.f285386g.f("clientInfo", clientInfo2);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        UUID id10 = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        f0 f0Var13 = this.f285525b;
                        return f0Var13.e(f0Var13.f285384b.getTicket(id10), null);
                }
            }
        }, null, new p(this, 11), null, 168);
        final int i22 = 19;
        final int i32 = 20;
        final int i33 = 21;
        new w4l.f(new Function2(this) { // from class: v20.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f285525b;

            {
                this.f285525b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i22) {
                    case 0:
                        v30.j ticket = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "id");
                        Intrinsics.checkNotNullParameter(ticket, "ticket");
                        this.f285525b.p(ticket);
                        return Unit.f186387a;
                    case 1:
                        v30.j ticket2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(ticket2, "ticket");
                        f0 f0Var = this.f285525b;
                        f0Var.g().h().b0(f0Var.f.e(ticket2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        f1 params = (f1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        return this.f285525b.j(params.f285400a, params.f285401b, v30.t.DEFAULT);
                    case 3:
                        f1 param = (f1) obj2;
                        d1 ticket3 = (d1) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(ticket3, "ticket");
                        this.f285525b.f285386g.f("next_ticket_" + param.a() + "_" + param.b(), ticket3);
                        return Unit.f186387a;
                    case 4:
                        UUID chatId = (UUID) obj2;
                        z30.j tags = (z30.j) obj3;
                        Intrinsics.checkNotNullParameter(chatId, "chatId");
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        this.f285525b.f285386g.f("experience_ratings_for_" + chatId, tags);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String key = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        ufm.c cVar = new ufm.c(new to7.f(this.f285525b, key, 8), 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        return cVar;
                    case 6:
                        List chats = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats, "chats");
                        List list = chats;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj4 : list) {
                            v30.c0 c0VarI = ((v30.j) obj4).i();
                            Object arrayList = linkedHashMap.get(c0VarI);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(c0VarI, arrayList);
                            }
                            ((List) arrayList).add(obj4);
                        }
                        Iterator it8 = linkedHashMap.entrySet().iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            f0 f0Var2 = this.f285525b;
                            if (!zHasNext) {
                                Iterator it9 = list.iterator();
                                while (it9.hasNext()) {
                                    f0Var2.p((v30.j) it9.next());
                                }
                                return Unit.f186387a;
                            }
                            Map.Entry entry = (Map.Entry) it8.next();
                            f0Var2.f285386g.f(((v30.c0) entry.getKey()).d(), (List) entry.getValue());
                        }
                        break;
                    case 7:
                        String key2 = (String) obj2;
                        UUID uuid = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(uuid, "uuid");
                        this.f285525b.f285386g.f(key2, uuid);
                        return Unit.f186387a;
                    case 8:
                        String key3 = (String) obj2;
                        UUID messageId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(messageId, "messageId");
                        this.f285525b.f285387h.G(messageId, key3, wim.z.d(kotlin.jvm.internal.o0.b(UUID.class)));
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        UUID ticketId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
                        efm.d0<m20.d> availability = this.f285525b.f285384b.getAvailability(ticketId);
                        uz7.f fVar = new uz7.f(14, new v0k.g(21));
                        availability.getClass();
                        ufm.i iVar = new ufm.i(availability, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 10:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        od0.i params2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        f0 f0Var3 = this.f285525b;
                        return f0Var3.e(f0Var3.f285384b.getLastTicket((UUID) params2.f224257a), null);
                    case 11:
                        od0.i params3 = (od0.i) obj2;
                        v30.j chat = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(chat, "chat");
                        f0 f0Var4 = this.f285525b;
                        f0Var4.f285386g.f("key_memory_cache_last_chat" + params3.f224257a, chat);
                        f0Var4.p(chat);
                        return Unit.f186387a;
                    case 12:
                        v30.j chat2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((od0.i) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chat2, "chat");
                        f0 f0Var5 = this.f285525b;
                        f0Var5.g().h().b0(f0Var5.f.e(chat2));
                        return Unit.f186387a;
                    case 13:
                        List chats2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats2, "chats");
                        f0 f0Var6 = this.f285525b;
                        r10.d dVarH = f0Var6.g().h();
                        List list2 = chats2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(f0Var6.f.e((v30.j) it10.next()));
                        }
                        dVarH.a0(arrayList2);
                        return Unit.f186387a;
                    case 14:
                        List feeds = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeds, "feeds");
                        f0 f0Var7 = this.f285525b;
                        f0Var7.f285386g.f("key_memory_cache_feeds", feeds);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it11 = feeds.iterator();
                        while (it11.hasNext()) {
                            v30.j jVarB = ((v30.y) it11.next()).b();
                            if (jVarB != null) {
                                arrayList3.add(jVarB);
                            }
                        }
                        Iterator it12 = arrayList3.iterator();
                        while (it12.hasNext()) {
                            f0Var7.p((v30.j) it12.next());
                        }
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        m params4 = (m) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        f0 f0Var8 = this.f285525b;
                        TicketsInfoApi ticketsInfoApi = f0Var8.f285384b;
                        Instant instantNow = params4.f285468a;
                        if (instantNow == null) {
                            instantNow = Instant.now();
                        }
                        Intrinsics.h(instantNow);
                        return f0Var8.d(ticketsInfoApi.getResolvedTickets(instantNow, 20), null);
                    case 16:
                        m params5 = (m) obj2;
                        List chats3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(chats3, "chats");
                        Instant instant = params5.f285468a;
                        f0 f0Var9 = this.f285525b;
                        if (instant != null) {
                            f0Var9.o.d(instant, chats3);
                        } else {
                            f0Var9.f285386g.f("chats_history", chats3);
                        }
                        return Unit.f186387a;
                    case 17:
                        List chats4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((m) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats4, "chats");
                        f0 f0Var10 = this.f285525b;
                        r10.d dVarH2 = f0Var10.g().h();
                        List list3 = chats4;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it13 = list3.iterator();
                        while (it13.hasNext()) {
                            arrayList4.add(f0Var10.f.e((v30.j) it13.next()));
                        }
                        dVarH2.a0(arrayList4);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        v30.c0 feedType = (v30.c0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(feedType, "feedType");
                        f0 f0Var11 = this.f285525b;
                        return f0Var11.d(f0Var11.f285384b.getTicketList(zhm.u.c(feedType.c())), feedType);
                    case 19:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<g20.b> inbox = this.f285525b.f285384b.getInbox();
                        uz7.f fVar2 = new uz7.f(18, new v0k.g(24));
                        inbox.getClass();
                        ufm.i iVar2 = new ufm.i(inbox, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 20:
                        Integer num = (Integer) obj3;
                        num.intValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285386g.f("unread_count", num);
                        return Unit.f186387a;
                    case 21:
                        Integer num2 = (Integer) obj3;
                        num2.getClass();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285387h.G(num2, "unread_count", wim.z.d(kotlin.jvm.internal.o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it15 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it15, "it");
                        f0 f0Var12 = this.f285525b;
                        efm.d0<g20.a> clientInfo = f0Var12.f285384b.getClientInfo();
                        uz7.f fVar3 = new uz7.f(19, new v0k.g(f0Var12));
                        clientInfo.getClass();
                        ufm.i iVar3 = new ufm.i(clientInfo, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 23:
                        l clientInfo2 = (l) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(clientInfo2, "clientInfo");
                        this.f285525b.f285386g.f("clientInfo", clientInfo2);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        UUID id10 = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        f0 f0Var13 = this.f285525b;
                        return f0Var13.e(f0Var13.f285384b.getTicket(id10), null);
                }
            }
        }, new p(this, 23), new Function2(this) { // from class: v20.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f285525b;

            {
                this.f285525b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i32) {
                    case 0:
                        v30.j ticket = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "id");
                        Intrinsics.checkNotNullParameter(ticket, "ticket");
                        this.f285525b.p(ticket);
                        return Unit.f186387a;
                    case 1:
                        v30.j ticket2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(ticket2, "ticket");
                        f0 f0Var = this.f285525b;
                        f0Var.g().h().b0(f0Var.f.e(ticket2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        f1 params = (f1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        return this.f285525b.j(params.f285400a, params.f285401b, v30.t.DEFAULT);
                    case 3:
                        f1 param = (f1) obj2;
                        d1 ticket3 = (d1) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(ticket3, "ticket");
                        this.f285525b.f285386g.f("next_ticket_" + param.a() + "_" + param.b(), ticket3);
                        return Unit.f186387a;
                    case 4:
                        UUID chatId = (UUID) obj2;
                        z30.j tags = (z30.j) obj3;
                        Intrinsics.checkNotNullParameter(chatId, "chatId");
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        this.f285525b.f285386g.f("experience_ratings_for_" + chatId, tags);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String key = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        ufm.c cVar = new ufm.c(new to7.f(this.f285525b, key, 8), 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        return cVar;
                    case 6:
                        List chats = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats, "chats");
                        List list = chats;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj4 : list) {
                            v30.c0 c0VarI = ((v30.j) obj4).i();
                            Object arrayList = linkedHashMap.get(c0VarI);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(c0VarI, arrayList);
                            }
                            ((List) arrayList).add(obj4);
                        }
                        Iterator it8 = linkedHashMap.entrySet().iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            f0 f0Var2 = this.f285525b;
                            if (!zHasNext) {
                                Iterator it9 = list.iterator();
                                while (it9.hasNext()) {
                                    f0Var2.p((v30.j) it9.next());
                                }
                                return Unit.f186387a;
                            }
                            Map.Entry entry = (Map.Entry) it8.next();
                            f0Var2.f285386g.f(((v30.c0) entry.getKey()).d(), (List) entry.getValue());
                        }
                        break;
                    case 7:
                        String key2 = (String) obj2;
                        UUID uuid = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(uuid, "uuid");
                        this.f285525b.f285386g.f(key2, uuid);
                        return Unit.f186387a;
                    case 8:
                        String key3 = (String) obj2;
                        UUID messageId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(messageId, "messageId");
                        this.f285525b.f285387h.G(messageId, key3, wim.z.d(kotlin.jvm.internal.o0.b(UUID.class)));
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        UUID ticketId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
                        efm.d0<m20.d> availability = this.f285525b.f285384b.getAvailability(ticketId);
                        uz7.f fVar = new uz7.f(14, new v0k.g(21));
                        availability.getClass();
                        ufm.i iVar = new ufm.i(availability, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 10:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        od0.i params2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        f0 f0Var3 = this.f285525b;
                        return f0Var3.e(f0Var3.f285384b.getLastTicket((UUID) params2.f224257a), null);
                    case 11:
                        od0.i params3 = (od0.i) obj2;
                        v30.j chat = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(chat, "chat");
                        f0 f0Var4 = this.f285525b;
                        f0Var4.f285386g.f("key_memory_cache_last_chat" + params3.f224257a, chat);
                        f0Var4.p(chat);
                        return Unit.f186387a;
                    case 12:
                        v30.j chat2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((od0.i) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chat2, "chat");
                        f0 f0Var5 = this.f285525b;
                        f0Var5.g().h().b0(f0Var5.f.e(chat2));
                        return Unit.f186387a;
                    case 13:
                        List chats2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats2, "chats");
                        f0 f0Var6 = this.f285525b;
                        r10.d dVarH = f0Var6.g().h();
                        List list2 = chats2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(f0Var6.f.e((v30.j) it10.next()));
                        }
                        dVarH.a0(arrayList2);
                        return Unit.f186387a;
                    case 14:
                        List feeds = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeds, "feeds");
                        f0 f0Var7 = this.f285525b;
                        f0Var7.f285386g.f("key_memory_cache_feeds", feeds);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it11 = feeds.iterator();
                        while (it11.hasNext()) {
                            v30.j jVarB = ((v30.y) it11.next()).b();
                            if (jVarB != null) {
                                arrayList3.add(jVarB);
                            }
                        }
                        Iterator it12 = arrayList3.iterator();
                        while (it12.hasNext()) {
                            f0Var7.p((v30.j) it12.next());
                        }
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        m params4 = (m) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        f0 f0Var8 = this.f285525b;
                        TicketsInfoApi ticketsInfoApi = f0Var8.f285384b;
                        Instant instantNow = params4.f285468a;
                        if (instantNow == null) {
                            instantNow = Instant.now();
                        }
                        Intrinsics.h(instantNow);
                        return f0Var8.d(ticketsInfoApi.getResolvedTickets(instantNow, 20), null);
                    case 16:
                        m params5 = (m) obj2;
                        List chats3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(chats3, "chats");
                        Instant instant = params5.f285468a;
                        f0 f0Var9 = this.f285525b;
                        if (instant != null) {
                            f0Var9.o.d(instant, chats3);
                        } else {
                            f0Var9.f285386g.f("chats_history", chats3);
                        }
                        return Unit.f186387a;
                    case 17:
                        List chats4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((m) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats4, "chats");
                        f0 f0Var10 = this.f285525b;
                        r10.d dVarH2 = f0Var10.g().h();
                        List list3 = chats4;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it13 = list3.iterator();
                        while (it13.hasNext()) {
                            arrayList4.add(f0Var10.f.e((v30.j) it13.next()));
                        }
                        dVarH2.a0(arrayList4);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        v30.c0 feedType = (v30.c0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(feedType, "feedType");
                        f0 f0Var11 = this.f285525b;
                        return f0Var11.d(f0Var11.f285384b.getTicketList(zhm.u.c(feedType.c())), feedType);
                    case 19:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<g20.b> inbox = this.f285525b.f285384b.getInbox();
                        uz7.f fVar2 = new uz7.f(18, new v0k.g(24));
                        inbox.getClass();
                        ufm.i iVar2 = new ufm.i(inbox, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 20:
                        Integer num = (Integer) obj3;
                        num.intValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285386g.f("unread_count", num);
                        return Unit.f186387a;
                    case 21:
                        Integer num2 = (Integer) obj3;
                        num2.getClass();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285387h.G(num2, "unread_count", wim.z.d(kotlin.jvm.internal.o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it15 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it15, "it");
                        f0 f0Var12 = this.f285525b;
                        efm.d0<g20.a> clientInfo = f0Var12.f285384b.getClientInfo();
                        uz7.f fVar3 = new uz7.f(19, new v0k.g(f0Var12));
                        clientInfo.getClass();
                        ufm.i iVar3 = new ufm.i(clientInfo, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 23:
                        l clientInfo2 = (l) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(clientInfo2, "clientInfo");
                        this.f285525b.f285386g.f("clientInfo", clientInfo2);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        UUID id10 = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        f0 f0Var13 = this.f285525b;
                        return f0Var13.e(f0Var13.f285384b.getTicket(id10), null);
                }
            }
        }, new p(this, 24), new Function2(this) { // from class: v20.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f285525b;

            {
                this.f285525b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i33) {
                    case 0:
                        v30.j ticket = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "id");
                        Intrinsics.checkNotNullParameter(ticket, "ticket");
                        this.f285525b.p(ticket);
                        return Unit.f186387a;
                    case 1:
                        v30.j ticket2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(ticket2, "ticket");
                        f0 f0Var = this.f285525b;
                        f0Var.g().h().b0(f0Var.f.e(ticket2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        f1 params = (f1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        return this.f285525b.j(params.f285400a, params.f285401b, v30.t.DEFAULT);
                    case 3:
                        f1 param = (f1) obj2;
                        d1 ticket3 = (d1) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(ticket3, "ticket");
                        this.f285525b.f285386g.f("next_ticket_" + param.a() + "_" + param.b(), ticket3);
                        return Unit.f186387a;
                    case 4:
                        UUID chatId = (UUID) obj2;
                        z30.j tags = (z30.j) obj3;
                        Intrinsics.checkNotNullParameter(chatId, "chatId");
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        this.f285525b.f285386g.f("experience_ratings_for_" + chatId, tags);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String key = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        ufm.c cVar = new ufm.c(new to7.f(this.f285525b, key, 8), 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        return cVar;
                    case 6:
                        List chats = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats, "chats");
                        List list = chats;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj4 : list) {
                            v30.c0 c0VarI = ((v30.j) obj4).i();
                            Object arrayList = linkedHashMap.get(c0VarI);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(c0VarI, arrayList);
                            }
                            ((List) arrayList).add(obj4);
                        }
                        Iterator it8 = linkedHashMap.entrySet().iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            f0 f0Var2 = this.f285525b;
                            if (!zHasNext) {
                                Iterator it9 = list.iterator();
                                while (it9.hasNext()) {
                                    f0Var2.p((v30.j) it9.next());
                                }
                                return Unit.f186387a;
                            }
                            Map.Entry entry = (Map.Entry) it8.next();
                            f0Var2.f285386g.f(((v30.c0) entry.getKey()).d(), (List) entry.getValue());
                        }
                        break;
                    case 7:
                        String key2 = (String) obj2;
                        UUID uuid = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(uuid, "uuid");
                        this.f285525b.f285386g.f(key2, uuid);
                        return Unit.f186387a;
                    case 8:
                        String key3 = (String) obj2;
                        UUID messageId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(messageId, "messageId");
                        this.f285525b.f285387h.G(messageId, key3, wim.z.d(kotlin.jvm.internal.o0.b(UUID.class)));
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        UUID ticketId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
                        efm.d0<m20.d> availability = this.f285525b.f285384b.getAvailability(ticketId);
                        uz7.f fVar = new uz7.f(14, new v0k.g(21));
                        availability.getClass();
                        ufm.i iVar = new ufm.i(availability, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 10:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        od0.i params2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        f0 f0Var3 = this.f285525b;
                        return f0Var3.e(f0Var3.f285384b.getLastTicket((UUID) params2.f224257a), null);
                    case 11:
                        od0.i params3 = (od0.i) obj2;
                        v30.j chat = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(chat, "chat");
                        f0 f0Var4 = this.f285525b;
                        f0Var4.f285386g.f("key_memory_cache_last_chat" + params3.f224257a, chat);
                        f0Var4.p(chat);
                        return Unit.f186387a;
                    case 12:
                        v30.j chat2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((od0.i) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chat2, "chat");
                        f0 f0Var5 = this.f285525b;
                        f0Var5.g().h().b0(f0Var5.f.e(chat2));
                        return Unit.f186387a;
                    case 13:
                        List chats2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats2, "chats");
                        f0 f0Var6 = this.f285525b;
                        r10.d dVarH = f0Var6.g().h();
                        List list2 = chats2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(f0Var6.f.e((v30.j) it10.next()));
                        }
                        dVarH.a0(arrayList2);
                        return Unit.f186387a;
                    case 14:
                        List feeds = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeds, "feeds");
                        f0 f0Var7 = this.f285525b;
                        f0Var7.f285386g.f("key_memory_cache_feeds", feeds);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it11 = feeds.iterator();
                        while (it11.hasNext()) {
                            v30.j jVarB = ((v30.y) it11.next()).b();
                            if (jVarB != null) {
                                arrayList3.add(jVarB);
                            }
                        }
                        Iterator it12 = arrayList3.iterator();
                        while (it12.hasNext()) {
                            f0Var7.p((v30.j) it12.next());
                        }
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        m params4 = (m) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        f0 f0Var8 = this.f285525b;
                        TicketsInfoApi ticketsInfoApi = f0Var8.f285384b;
                        Instant instantNow = params4.f285468a;
                        if (instantNow == null) {
                            instantNow = Instant.now();
                        }
                        Intrinsics.h(instantNow);
                        return f0Var8.d(ticketsInfoApi.getResolvedTickets(instantNow, 20), null);
                    case 16:
                        m params5 = (m) obj2;
                        List chats3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(chats3, "chats");
                        Instant instant = params5.f285468a;
                        f0 f0Var9 = this.f285525b;
                        if (instant != null) {
                            f0Var9.o.d(instant, chats3);
                        } else {
                            f0Var9.f285386g.f("chats_history", chats3);
                        }
                        return Unit.f186387a;
                    case 17:
                        List chats4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((m) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats4, "chats");
                        f0 f0Var10 = this.f285525b;
                        r10.d dVarH2 = f0Var10.g().h();
                        List list3 = chats4;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it13 = list3.iterator();
                        while (it13.hasNext()) {
                            arrayList4.add(f0Var10.f.e((v30.j) it13.next()));
                        }
                        dVarH2.a0(arrayList4);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        v30.c0 feedType = (v30.c0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(feedType, "feedType");
                        f0 f0Var11 = this.f285525b;
                        return f0Var11.d(f0Var11.f285384b.getTicketList(zhm.u.c(feedType.c())), feedType);
                    case 19:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<g20.b> inbox = this.f285525b.f285384b.getInbox();
                        uz7.f fVar2 = new uz7.f(18, new v0k.g(24));
                        inbox.getClass();
                        ufm.i iVar2 = new ufm.i(inbox, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 20:
                        Integer num = (Integer) obj3;
                        num.intValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285386g.f("unread_count", num);
                        return Unit.f186387a;
                    case 21:
                        Integer num2 = (Integer) obj3;
                        num2.getClass();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285387h.G(num2, "unread_count", wim.z.d(kotlin.jvm.internal.o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it15 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it15, "it");
                        f0 f0Var12 = this.f285525b;
                        efm.d0<g20.a> clientInfo = f0Var12.f285384b.getClientInfo();
                        uz7.f fVar3 = new uz7.f(19, new v0k.g(f0Var12));
                        clientInfo.getClass();
                        ufm.i iVar3 = new ufm.i(clientInfo, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 23:
                        l clientInfo2 = (l) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(clientInfo2, "clientInfo");
                        this.f285525b.f285386g.f("clientInfo", clientInfo2);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        UUID id10 = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        f0 f0Var13 = this.f285525b;
                        return f0Var13.e(f0Var13.f285384b.getTicket(id10), null);
                }
            }
        }, null, null, null, BERTags.FLAGS);
        final int i43 = 22;
        final int i59 = 23;
        this.f285393q = new w4l.f(new Function2(this) { // from class: v20.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f285525b;

            {
                this.f285525b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i43) {
                    case 0:
                        v30.j ticket = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "id");
                        Intrinsics.checkNotNullParameter(ticket, "ticket");
                        this.f285525b.p(ticket);
                        return Unit.f186387a;
                    case 1:
                        v30.j ticket2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(ticket2, "ticket");
                        f0 f0Var = this.f285525b;
                        f0Var.g().h().b0(f0Var.f.e(ticket2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        f1 params = (f1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        return this.f285525b.j(params.f285400a, params.f285401b, v30.t.DEFAULT);
                    case 3:
                        f1 param = (f1) obj2;
                        d1 ticket3 = (d1) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(ticket3, "ticket");
                        this.f285525b.f285386g.f("next_ticket_" + param.a() + "_" + param.b(), ticket3);
                        return Unit.f186387a;
                    case 4:
                        UUID chatId = (UUID) obj2;
                        z30.j tags = (z30.j) obj3;
                        Intrinsics.checkNotNullParameter(chatId, "chatId");
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        this.f285525b.f285386g.f("experience_ratings_for_" + chatId, tags);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String key = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        ufm.c cVar = new ufm.c(new to7.f(this.f285525b, key, 8), 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        return cVar;
                    case 6:
                        List chats = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats, "chats");
                        List list = chats;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj4 : list) {
                            v30.c0 c0VarI = ((v30.j) obj4).i();
                            Object arrayList = linkedHashMap.get(c0VarI);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(c0VarI, arrayList);
                            }
                            ((List) arrayList).add(obj4);
                        }
                        Iterator it8 = linkedHashMap.entrySet().iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            f0 f0Var2 = this.f285525b;
                            if (!zHasNext) {
                                Iterator it9 = list.iterator();
                                while (it9.hasNext()) {
                                    f0Var2.p((v30.j) it9.next());
                                }
                                return Unit.f186387a;
                            }
                            Map.Entry entry = (Map.Entry) it8.next();
                            f0Var2.f285386g.f(((v30.c0) entry.getKey()).d(), (List) entry.getValue());
                        }
                        break;
                    case 7:
                        String key2 = (String) obj2;
                        UUID uuid = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(uuid, "uuid");
                        this.f285525b.f285386g.f(key2, uuid);
                        return Unit.f186387a;
                    case 8:
                        String key3 = (String) obj2;
                        UUID messageId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(messageId, "messageId");
                        this.f285525b.f285387h.G(messageId, key3, wim.z.d(kotlin.jvm.internal.o0.b(UUID.class)));
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        UUID ticketId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
                        efm.d0<m20.d> availability = this.f285525b.f285384b.getAvailability(ticketId);
                        uz7.f fVar = new uz7.f(14, new v0k.g(21));
                        availability.getClass();
                        ufm.i iVar = new ufm.i(availability, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 10:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        od0.i params2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        f0 f0Var3 = this.f285525b;
                        return f0Var3.e(f0Var3.f285384b.getLastTicket((UUID) params2.f224257a), null);
                    case 11:
                        od0.i params3 = (od0.i) obj2;
                        v30.j chat = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(chat, "chat");
                        f0 f0Var4 = this.f285525b;
                        f0Var4.f285386g.f("key_memory_cache_last_chat" + params3.f224257a, chat);
                        f0Var4.p(chat);
                        return Unit.f186387a;
                    case 12:
                        v30.j chat2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((od0.i) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chat2, "chat");
                        f0 f0Var5 = this.f285525b;
                        f0Var5.g().h().b0(f0Var5.f.e(chat2));
                        return Unit.f186387a;
                    case 13:
                        List chats2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats2, "chats");
                        f0 f0Var6 = this.f285525b;
                        r10.d dVarH = f0Var6.g().h();
                        List list2 = chats2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(f0Var6.f.e((v30.j) it10.next()));
                        }
                        dVarH.a0(arrayList2);
                        return Unit.f186387a;
                    case 14:
                        List feeds = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeds, "feeds");
                        f0 f0Var7 = this.f285525b;
                        f0Var7.f285386g.f("key_memory_cache_feeds", feeds);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it11 = feeds.iterator();
                        while (it11.hasNext()) {
                            v30.j jVarB = ((v30.y) it11.next()).b();
                            if (jVarB != null) {
                                arrayList3.add(jVarB);
                            }
                        }
                        Iterator it12 = arrayList3.iterator();
                        while (it12.hasNext()) {
                            f0Var7.p((v30.j) it12.next());
                        }
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        m params4 = (m) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        f0 f0Var8 = this.f285525b;
                        TicketsInfoApi ticketsInfoApi = f0Var8.f285384b;
                        Instant instantNow = params4.f285468a;
                        if (instantNow == null) {
                            instantNow = Instant.now();
                        }
                        Intrinsics.h(instantNow);
                        return f0Var8.d(ticketsInfoApi.getResolvedTickets(instantNow, 20), null);
                    case 16:
                        m params5 = (m) obj2;
                        List chats3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(chats3, "chats");
                        Instant instant = params5.f285468a;
                        f0 f0Var9 = this.f285525b;
                        if (instant != null) {
                            f0Var9.o.d(instant, chats3);
                        } else {
                            f0Var9.f285386g.f("chats_history", chats3);
                        }
                        return Unit.f186387a;
                    case 17:
                        List chats4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((m) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats4, "chats");
                        f0 f0Var10 = this.f285525b;
                        r10.d dVarH2 = f0Var10.g().h();
                        List list3 = chats4;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it13 = list3.iterator();
                        while (it13.hasNext()) {
                            arrayList4.add(f0Var10.f.e((v30.j) it13.next()));
                        }
                        dVarH2.a0(arrayList4);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        v30.c0 feedType = (v30.c0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(feedType, "feedType");
                        f0 f0Var11 = this.f285525b;
                        return f0Var11.d(f0Var11.f285384b.getTicketList(zhm.u.c(feedType.c())), feedType);
                    case 19:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<g20.b> inbox = this.f285525b.f285384b.getInbox();
                        uz7.f fVar2 = new uz7.f(18, new v0k.g(24));
                        inbox.getClass();
                        ufm.i iVar2 = new ufm.i(inbox, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 20:
                        Integer num = (Integer) obj3;
                        num.intValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285386g.f("unread_count", num);
                        return Unit.f186387a;
                    case 21:
                        Integer num2 = (Integer) obj3;
                        num2.getClass();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285387h.G(num2, "unread_count", wim.z.d(kotlin.jvm.internal.o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it15 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it15, "it");
                        f0 f0Var12 = this.f285525b;
                        efm.d0<g20.a> clientInfo = f0Var12.f285384b.getClientInfo();
                        uz7.f fVar3 = new uz7.f(19, new v0k.g(f0Var12));
                        clientInfo.getClass();
                        ufm.i iVar3 = new ufm.i(clientInfo, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 23:
                        l clientInfo2 = (l) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(clientInfo2, "clientInfo");
                        this.f285525b.f285386g.f("clientInfo", clientInfo2);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        UUID id10 = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        f0 f0Var13 = this.f285525b;
                        return f0Var13.e(f0Var13.f285384b.getTicket(id10), null);
                }
            }
        }, new p(this, 25), new Function2(this) { // from class: v20.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f285525b;

            {
                this.f285525b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i59) {
                    case 0:
                        v30.j ticket = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "id");
                        Intrinsics.checkNotNullParameter(ticket, "ticket");
                        this.f285525b.p(ticket);
                        return Unit.f186387a;
                    case 1:
                        v30.j ticket2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(ticket2, "ticket");
                        f0 f0Var = this.f285525b;
                        f0Var.g().h().b0(f0Var.f.e(ticket2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        f1 params = (f1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        return this.f285525b.j(params.f285400a, params.f285401b, v30.t.DEFAULT);
                    case 3:
                        f1 param = (f1) obj2;
                        d1 ticket3 = (d1) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(ticket3, "ticket");
                        this.f285525b.f285386g.f("next_ticket_" + param.a() + "_" + param.b(), ticket3);
                        return Unit.f186387a;
                    case 4:
                        UUID chatId = (UUID) obj2;
                        z30.j tags = (z30.j) obj3;
                        Intrinsics.checkNotNullParameter(chatId, "chatId");
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        this.f285525b.f285386g.f("experience_ratings_for_" + chatId, tags);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String key = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        ufm.c cVar = new ufm.c(new to7.f(this.f285525b, key, 8), 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        return cVar;
                    case 6:
                        List chats = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats, "chats");
                        List list = chats;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj4 : list) {
                            v30.c0 c0VarI = ((v30.j) obj4).i();
                            Object arrayList = linkedHashMap.get(c0VarI);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(c0VarI, arrayList);
                            }
                            ((List) arrayList).add(obj4);
                        }
                        Iterator it8 = linkedHashMap.entrySet().iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            f0 f0Var2 = this.f285525b;
                            if (!zHasNext) {
                                Iterator it9 = list.iterator();
                                while (it9.hasNext()) {
                                    f0Var2.p((v30.j) it9.next());
                                }
                                return Unit.f186387a;
                            }
                            Map.Entry entry = (Map.Entry) it8.next();
                            f0Var2.f285386g.f(((v30.c0) entry.getKey()).d(), (List) entry.getValue());
                        }
                        break;
                    case 7:
                        String key2 = (String) obj2;
                        UUID uuid = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(uuid, "uuid");
                        this.f285525b.f285386g.f(key2, uuid);
                        return Unit.f186387a;
                    case 8:
                        String key3 = (String) obj2;
                        UUID messageId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(messageId, "messageId");
                        this.f285525b.f285387h.G(messageId, key3, wim.z.d(kotlin.jvm.internal.o0.b(UUID.class)));
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        UUID ticketId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
                        efm.d0<m20.d> availability = this.f285525b.f285384b.getAvailability(ticketId);
                        uz7.f fVar = new uz7.f(14, new v0k.g(21));
                        availability.getClass();
                        ufm.i iVar = new ufm.i(availability, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 10:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        od0.i params2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        f0 f0Var3 = this.f285525b;
                        return f0Var3.e(f0Var3.f285384b.getLastTicket((UUID) params2.f224257a), null);
                    case 11:
                        od0.i params3 = (od0.i) obj2;
                        v30.j chat = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(chat, "chat");
                        f0 f0Var4 = this.f285525b;
                        f0Var4.f285386g.f("key_memory_cache_last_chat" + params3.f224257a, chat);
                        f0Var4.p(chat);
                        return Unit.f186387a;
                    case 12:
                        v30.j chat2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((od0.i) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chat2, "chat");
                        f0 f0Var5 = this.f285525b;
                        f0Var5.g().h().b0(f0Var5.f.e(chat2));
                        return Unit.f186387a;
                    case 13:
                        List chats2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats2, "chats");
                        f0 f0Var6 = this.f285525b;
                        r10.d dVarH = f0Var6.g().h();
                        List list2 = chats2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(f0Var6.f.e((v30.j) it10.next()));
                        }
                        dVarH.a0(arrayList2);
                        return Unit.f186387a;
                    case 14:
                        List feeds = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeds, "feeds");
                        f0 f0Var7 = this.f285525b;
                        f0Var7.f285386g.f("key_memory_cache_feeds", feeds);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it11 = feeds.iterator();
                        while (it11.hasNext()) {
                            v30.j jVarB = ((v30.y) it11.next()).b();
                            if (jVarB != null) {
                                arrayList3.add(jVarB);
                            }
                        }
                        Iterator it12 = arrayList3.iterator();
                        while (it12.hasNext()) {
                            f0Var7.p((v30.j) it12.next());
                        }
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        m params4 = (m) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        f0 f0Var8 = this.f285525b;
                        TicketsInfoApi ticketsInfoApi = f0Var8.f285384b;
                        Instant instantNow = params4.f285468a;
                        if (instantNow == null) {
                            instantNow = Instant.now();
                        }
                        Intrinsics.h(instantNow);
                        return f0Var8.d(ticketsInfoApi.getResolvedTickets(instantNow, 20), null);
                    case 16:
                        m params5 = (m) obj2;
                        List chats3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(chats3, "chats");
                        Instant instant = params5.f285468a;
                        f0 f0Var9 = this.f285525b;
                        if (instant != null) {
                            f0Var9.o.d(instant, chats3);
                        } else {
                            f0Var9.f285386g.f("chats_history", chats3);
                        }
                        return Unit.f186387a;
                    case 17:
                        List chats4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((m) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats4, "chats");
                        f0 f0Var10 = this.f285525b;
                        r10.d dVarH2 = f0Var10.g().h();
                        List list3 = chats4;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it13 = list3.iterator();
                        while (it13.hasNext()) {
                            arrayList4.add(f0Var10.f.e((v30.j) it13.next()));
                        }
                        dVarH2.a0(arrayList4);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        v30.c0 feedType = (v30.c0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(feedType, "feedType");
                        f0 f0Var11 = this.f285525b;
                        return f0Var11.d(f0Var11.f285384b.getTicketList(zhm.u.c(feedType.c())), feedType);
                    case 19:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<g20.b> inbox = this.f285525b.f285384b.getInbox();
                        uz7.f fVar2 = new uz7.f(18, new v0k.g(24));
                        inbox.getClass();
                        ufm.i iVar2 = new ufm.i(inbox, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 20:
                        Integer num = (Integer) obj3;
                        num.intValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285386g.f("unread_count", num);
                        return Unit.f186387a;
                    case 21:
                        Integer num2 = (Integer) obj3;
                        num2.getClass();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285387h.G(num2, "unread_count", wim.z.d(kotlin.jvm.internal.o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it15 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it15, "it");
                        f0 f0Var12 = this.f285525b;
                        efm.d0<g20.a> clientInfo = f0Var12.f285384b.getClientInfo();
                        uz7.f fVar3 = new uz7.f(19, new v0k.g(f0Var12));
                        clientInfo.getClass();
                        ufm.i iVar3 = new ufm.i(clientInfo, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 23:
                        l clientInfo2 = (l) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(clientInfo2, "clientInfo");
                        this.f285525b.f285386g.f("clientInfo", clientInfo2);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        UUID id10 = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        f0 f0Var13 = this.f285525b;
                        return f0Var13.e(f0Var13.f285384b.getTicket(id10), null);
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        final int i66 = 24;
        final int i74 = 0;
        final int i92 = 1;
        this.f285394r = new w4l.f(new Function2(this) { // from class: v20.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f285525b;

            {
                this.f285525b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i66) {
                    case 0:
                        v30.j ticket = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "id");
                        Intrinsics.checkNotNullParameter(ticket, "ticket");
                        this.f285525b.p(ticket);
                        return Unit.f186387a;
                    case 1:
                        v30.j ticket2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(ticket2, "ticket");
                        f0 f0Var = this.f285525b;
                        f0Var.g().h().b0(f0Var.f.e(ticket2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        f1 params = (f1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        return this.f285525b.j(params.f285400a, params.f285401b, v30.t.DEFAULT);
                    case 3:
                        f1 param = (f1) obj2;
                        d1 ticket3 = (d1) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(ticket3, "ticket");
                        this.f285525b.f285386g.f("next_ticket_" + param.a() + "_" + param.b(), ticket3);
                        return Unit.f186387a;
                    case 4:
                        UUID chatId = (UUID) obj2;
                        z30.j tags = (z30.j) obj3;
                        Intrinsics.checkNotNullParameter(chatId, "chatId");
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        this.f285525b.f285386g.f("experience_ratings_for_" + chatId, tags);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String key = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        ufm.c cVar = new ufm.c(new to7.f(this.f285525b, key, 8), 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        return cVar;
                    case 6:
                        List chats = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats, "chats");
                        List list = chats;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj4 : list) {
                            v30.c0 c0VarI = ((v30.j) obj4).i();
                            Object arrayList = linkedHashMap.get(c0VarI);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(c0VarI, arrayList);
                            }
                            ((List) arrayList).add(obj4);
                        }
                        Iterator it8 = linkedHashMap.entrySet().iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            f0 f0Var2 = this.f285525b;
                            if (!zHasNext) {
                                Iterator it9 = list.iterator();
                                while (it9.hasNext()) {
                                    f0Var2.p((v30.j) it9.next());
                                }
                                return Unit.f186387a;
                            }
                            Map.Entry entry = (Map.Entry) it8.next();
                            f0Var2.f285386g.f(((v30.c0) entry.getKey()).d(), (List) entry.getValue());
                        }
                        break;
                    case 7:
                        String key2 = (String) obj2;
                        UUID uuid = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(uuid, "uuid");
                        this.f285525b.f285386g.f(key2, uuid);
                        return Unit.f186387a;
                    case 8:
                        String key3 = (String) obj2;
                        UUID messageId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(messageId, "messageId");
                        this.f285525b.f285387h.G(messageId, key3, wim.z.d(kotlin.jvm.internal.o0.b(UUID.class)));
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        UUID ticketId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
                        efm.d0<m20.d> availability = this.f285525b.f285384b.getAvailability(ticketId);
                        uz7.f fVar = new uz7.f(14, new v0k.g(21));
                        availability.getClass();
                        ufm.i iVar = new ufm.i(availability, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 10:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        od0.i params2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        f0 f0Var3 = this.f285525b;
                        return f0Var3.e(f0Var3.f285384b.getLastTicket((UUID) params2.f224257a), null);
                    case 11:
                        od0.i params3 = (od0.i) obj2;
                        v30.j chat = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(chat, "chat");
                        f0 f0Var4 = this.f285525b;
                        f0Var4.f285386g.f("key_memory_cache_last_chat" + params3.f224257a, chat);
                        f0Var4.p(chat);
                        return Unit.f186387a;
                    case 12:
                        v30.j chat2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((od0.i) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chat2, "chat");
                        f0 f0Var5 = this.f285525b;
                        f0Var5.g().h().b0(f0Var5.f.e(chat2));
                        return Unit.f186387a;
                    case 13:
                        List chats2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats2, "chats");
                        f0 f0Var6 = this.f285525b;
                        r10.d dVarH = f0Var6.g().h();
                        List list2 = chats2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(f0Var6.f.e((v30.j) it10.next()));
                        }
                        dVarH.a0(arrayList2);
                        return Unit.f186387a;
                    case 14:
                        List feeds = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeds, "feeds");
                        f0 f0Var7 = this.f285525b;
                        f0Var7.f285386g.f("key_memory_cache_feeds", feeds);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it11 = feeds.iterator();
                        while (it11.hasNext()) {
                            v30.j jVarB = ((v30.y) it11.next()).b();
                            if (jVarB != null) {
                                arrayList3.add(jVarB);
                            }
                        }
                        Iterator it12 = arrayList3.iterator();
                        while (it12.hasNext()) {
                            f0Var7.p((v30.j) it12.next());
                        }
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        m params4 = (m) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        f0 f0Var8 = this.f285525b;
                        TicketsInfoApi ticketsInfoApi = f0Var8.f285384b;
                        Instant instantNow = params4.f285468a;
                        if (instantNow == null) {
                            instantNow = Instant.now();
                        }
                        Intrinsics.h(instantNow);
                        return f0Var8.d(ticketsInfoApi.getResolvedTickets(instantNow, 20), null);
                    case 16:
                        m params5 = (m) obj2;
                        List chats3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(chats3, "chats");
                        Instant instant = params5.f285468a;
                        f0 f0Var9 = this.f285525b;
                        if (instant != null) {
                            f0Var9.o.d(instant, chats3);
                        } else {
                            f0Var9.f285386g.f("chats_history", chats3);
                        }
                        return Unit.f186387a;
                    case 17:
                        List chats4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((m) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats4, "chats");
                        f0 f0Var10 = this.f285525b;
                        r10.d dVarH2 = f0Var10.g().h();
                        List list3 = chats4;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it13 = list3.iterator();
                        while (it13.hasNext()) {
                            arrayList4.add(f0Var10.f.e((v30.j) it13.next()));
                        }
                        dVarH2.a0(arrayList4);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        v30.c0 feedType = (v30.c0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(feedType, "feedType");
                        f0 f0Var11 = this.f285525b;
                        return f0Var11.d(f0Var11.f285384b.getTicketList(zhm.u.c(feedType.c())), feedType);
                    case 19:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<g20.b> inbox = this.f285525b.f285384b.getInbox();
                        uz7.f fVar2 = new uz7.f(18, new v0k.g(24));
                        inbox.getClass();
                        ufm.i iVar2 = new ufm.i(inbox, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 20:
                        Integer num = (Integer) obj3;
                        num.intValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285386g.f("unread_count", num);
                        return Unit.f186387a;
                    case 21:
                        Integer num2 = (Integer) obj3;
                        num2.getClass();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285387h.G(num2, "unread_count", wim.z.d(kotlin.jvm.internal.o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it15 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it15, "it");
                        f0 f0Var12 = this.f285525b;
                        efm.d0<g20.a> clientInfo = f0Var12.f285384b.getClientInfo();
                        uz7.f fVar3 = new uz7.f(19, new v0k.g(f0Var12));
                        clientInfo.getClass();
                        ufm.i iVar3 = new ufm.i(clientInfo, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 23:
                        l clientInfo2 = (l) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(clientInfo2, "clientInfo");
                        this.f285525b.f285386g.f("clientInfo", clientInfo2);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        UUID id10 = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        f0 f0Var13 = this.f285525b;
                        return f0Var13.e(f0Var13.f285384b.getTicket(id10), null);
                }
            }
        }, new p(this, 26), new Function2(this) { // from class: v20.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f285525b;

            {
                this.f285525b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i74) {
                    case 0:
                        v30.j ticket = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "id");
                        Intrinsics.checkNotNullParameter(ticket, "ticket");
                        this.f285525b.p(ticket);
                        return Unit.f186387a;
                    case 1:
                        v30.j ticket2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(ticket2, "ticket");
                        f0 f0Var = this.f285525b;
                        f0Var.g().h().b0(f0Var.f.e(ticket2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        f1 params = (f1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        return this.f285525b.j(params.f285400a, params.f285401b, v30.t.DEFAULT);
                    case 3:
                        f1 param = (f1) obj2;
                        d1 ticket3 = (d1) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(ticket3, "ticket");
                        this.f285525b.f285386g.f("next_ticket_" + param.a() + "_" + param.b(), ticket3);
                        return Unit.f186387a;
                    case 4:
                        UUID chatId = (UUID) obj2;
                        z30.j tags = (z30.j) obj3;
                        Intrinsics.checkNotNullParameter(chatId, "chatId");
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        this.f285525b.f285386g.f("experience_ratings_for_" + chatId, tags);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String key = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        ufm.c cVar = new ufm.c(new to7.f(this.f285525b, key, 8), 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        return cVar;
                    case 6:
                        List chats = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats, "chats");
                        List list = chats;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj4 : list) {
                            v30.c0 c0VarI = ((v30.j) obj4).i();
                            Object arrayList = linkedHashMap.get(c0VarI);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(c0VarI, arrayList);
                            }
                            ((List) arrayList).add(obj4);
                        }
                        Iterator it8 = linkedHashMap.entrySet().iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            f0 f0Var2 = this.f285525b;
                            if (!zHasNext) {
                                Iterator it9 = list.iterator();
                                while (it9.hasNext()) {
                                    f0Var2.p((v30.j) it9.next());
                                }
                                return Unit.f186387a;
                            }
                            Map.Entry entry = (Map.Entry) it8.next();
                            f0Var2.f285386g.f(((v30.c0) entry.getKey()).d(), (List) entry.getValue());
                        }
                        break;
                    case 7:
                        String key2 = (String) obj2;
                        UUID uuid = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(uuid, "uuid");
                        this.f285525b.f285386g.f(key2, uuid);
                        return Unit.f186387a;
                    case 8:
                        String key3 = (String) obj2;
                        UUID messageId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(messageId, "messageId");
                        this.f285525b.f285387h.G(messageId, key3, wim.z.d(kotlin.jvm.internal.o0.b(UUID.class)));
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        UUID ticketId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
                        efm.d0<m20.d> availability = this.f285525b.f285384b.getAvailability(ticketId);
                        uz7.f fVar = new uz7.f(14, new v0k.g(21));
                        availability.getClass();
                        ufm.i iVar = new ufm.i(availability, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 10:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        od0.i params2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        f0 f0Var3 = this.f285525b;
                        return f0Var3.e(f0Var3.f285384b.getLastTicket((UUID) params2.f224257a), null);
                    case 11:
                        od0.i params3 = (od0.i) obj2;
                        v30.j chat = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(chat, "chat");
                        f0 f0Var4 = this.f285525b;
                        f0Var4.f285386g.f("key_memory_cache_last_chat" + params3.f224257a, chat);
                        f0Var4.p(chat);
                        return Unit.f186387a;
                    case 12:
                        v30.j chat2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((od0.i) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chat2, "chat");
                        f0 f0Var5 = this.f285525b;
                        f0Var5.g().h().b0(f0Var5.f.e(chat2));
                        return Unit.f186387a;
                    case 13:
                        List chats2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats2, "chats");
                        f0 f0Var6 = this.f285525b;
                        r10.d dVarH = f0Var6.g().h();
                        List list2 = chats2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(f0Var6.f.e((v30.j) it10.next()));
                        }
                        dVarH.a0(arrayList2);
                        return Unit.f186387a;
                    case 14:
                        List feeds = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeds, "feeds");
                        f0 f0Var7 = this.f285525b;
                        f0Var7.f285386g.f("key_memory_cache_feeds", feeds);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it11 = feeds.iterator();
                        while (it11.hasNext()) {
                            v30.j jVarB = ((v30.y) it11.next()).b();
                            if (jVarB != null) {
                                arrayList3.add(jVarB);
                            }
                        }
                        Iterator it12 = arrayList3.iterator();
                        while (it12.hasNext()) {
                            f0Var7.p((v30.j) it12.next());
                        }
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        m params4 = (m) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        f0 f0Var8 = this.f285525b;
                        TicketsInfoApi ticketsInfoApi = f0Var8.f285384b;
                        Instant instantNow = params4.f285468a;
                        if (instantNow == null) {
                            instantNow = Instant.now();
                        }
                        Intrinsics.h(instantNow);
                        return f0Var8.d(ticketsInfoApi.getResolvedTickets(instantNow, 20), null);
                    case 16:
                        m params5 = (m) obj2;
                        List chats3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(chats3, "chats");
                        Instant instant = params5.f285468a;
                        f0 f0Var9 = this.f285525b;
                        if (instant != null) {
                            f0Var9.o.d(instant, chats3);
                        } else {
                            f0Var9.f285386g.f("chats_history", chats3);
                        }
                        return Unit.f186387a;
                    case 17:
                        List chats4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((m) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats4, "chats");
                        f0 f0Var10 = this.f285525b;
                        r10.d dVarH2 = f0Var10.g().h();
                        List list3 = chats4;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it13 = list3.iterator();
                        while (it13.hasNext()) {
                            arrayList4.add(f0Var10.f.e((v30.j) it13.next()));
                        }
                        dVarH2.a0(arrayList4);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        v30.c0 feedType = (v30.c0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(feedType, "feedType");
                        f0 f0Var11 = this.f285525b;
                        return f0Var11.d(f0Var11.f285384b.getTicketList(zhm.u.c(feedType.c())), feedType);
                    case 19:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<g20.b> inbox = this.f285525b.f285384b.getInbox();
                        uz7.f fVar2 = new uz7.f(18, new v0k.g(24));
                        inbox.getClass();
                        ufm.i iVar2 = new ufm.i(inbox, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 20:
                        Integer num = (Integer) obj3;
                        num.intValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285386g.f("unread_count", num);
                        return Unit.f186387a;
                    case 21:
                        Integer num2 = (Integer) obj3;
                        num2.getClass();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285387h.G(num2, "unread_count", wim.z.d(kotlin.jvm.internal.o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it15 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it15, "it");
                        f0 f0Var12 = this.f285525b;
                        efm.d0<g20.a> clientInfo = f0Var12.f285384b.getClientInfo();
                        uz7.f fVar3 = new uz7.f(19, new v0k.g(f0Var12));
                        clientInfo.getClass();
                        ufm.i iVar3 = new ufm.i(clientInfo, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 23:
                        l clientInfo2 = (l) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(clientInfo2, "clientInfo");
                        this.f285525b.f285386g.f("clientInfo", clientInfo2);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        UUID id10 = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        f0 f0Var13 = this.f285525b;
                        return f0Var13.e(f0Var13.f285384b.getTicket(id10), null);
                }
            }
        }, null, new Function2(this) { // from class: v20.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f285525b;

            {
                this.f285525b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i92) {
                    case 0:
                        v30.j ticket = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "id");
                        Intrinsics.checkNotNullParameter(ticket, "ticket");
                        this.f285525b.p(ticket);
                        return Unit.f186387a;
                    case 1:
                        v30.j ticket2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(ticket2, "ticket");
                        f0 f0Var = this.f285525b;
                        f0Var.g().h().b0(f0Var.f.e(ticket2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        f1 params = (f1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        return this.f285525b.j(params.f285400a, params.f285401b, v30.t.DEFAULT);
                    case 3:
                        f1 param = (f1) obj2;
                        d1 ticket3 = (d1) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(ticket3, "ticket");
                        this.f285525b.f285386g.f("next_ticket_" + param.a() + "_" + param.b(), ticket3);
                        return Unit.f186387a;
                    case 4:
                        UUID chatId = (UUID) obj2;
                        z30.j tags = (z30.j) obj3;
                        Intrinsics.checkNotNullParameter(chatId, "chatId");
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        this.f285525b.f285386g.f("experience_ratings_for_" + chatId, tags);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String key = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        ufm.c cVar = new ufm.c(new to7.f(this.f285525b, key, 8), 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        return cVar;
                    case 6:
                        List chats = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats, "chats");
                        List list = chats;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj4 : list) {
                            v30.c0 c0VarI = ((v30.j) obj4).i();
                            Object arrayList = linkedHashMap.get(c0VarI);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(c0VarI, arrayList);
                            }
                            ((List) arrayList).add(obj4);
                        }
                        Iterator it8 = linkedHashMap.entrySet().iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            f0 f0Var2 = this.f285525b;
                            if (!zHasNext) {
                                Iterator it9 = list.iterator();
                                while (it9.hasNext()) {
                                    f0Var2.p((v30.j) it9.next());
                                }
                                return Unit.f186387a;
                            }
                            Map.Entry entry = (Map.Entry) it8.next();
                            f0Var2.f285386g.f(((v30.c0) entry.getKey()).d(), (List) entry.getValue());
                        }
                        break;
                    case 7:
                        String key2 = (String) obj2;
                        UUID uuid = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(uuid, "uuid");
                        this.f285525b.f285386g.f(key2, uuid);
                        return Unit.f186387a;
                    case 8:
                        String key3 = (String) obj2;
                        UUID messageId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(messageId, "messageId");
                        this.f285525b.f285387h.G(messageId, key3, wim.z.d(kotlin.jvm.internal.o0.b(UUID.class)));
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        UUID ticketId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
                        efm.d0<m20.d> availability = this.f285525b.f285384b.getAvailability(ticketId);
                        uz7.f fVar = new uz7.f(14, new v0k.g(21));
                        availability.getClass();
                        ufm.i iVar = new ufm.i(availability, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 10:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        od0.i params2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        f0 f0Var3 = this.f285525b;
                        return f0Var3.e(f0Var3.f285384b.getLastTicket((UUID) params2.f224257a), null);
                    case 11:
                        od0.i params3 = (od0.i) obj2;
                        v30.j chat = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(chat, "chat");
                        f0 f0Var4 = this.f285525b;
                        f0Var4.f285386g.f("key_memory_cache_last_chat" + params3.f224257a, chat);
                        f0Var4.p(chat);
                        return Unit.f186387a;
                    case 12:
                        v30.j chat2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((od0.i) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chat2, "chat");
                        f0 f0Var5 = this.f285525b;
                        f0Var5.g().h().b0(f0Var5.f.e(chat2));
                        return Unit.f186387a;
                    case 13:
                        List chats2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats2, "chats");
                        f0 f0Var6 = this.f285525b;
                        r10.d dVarH = f0Var6.g().h();
                        List list2 = chats2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(f0Var6.f.e((v30.j) it10.next()));
                        }
                        dVarH.a0(arrayList2);
                        return Unit.f186387a;
                    case 14:
                        List feeds = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeds, "feeds");
                        f0 f0Var7 = this.f285525b;
                        f0Var7.f285386g.f("key_memory_cache_feeds", feeds);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it11 = feeds.iterator();
                        while (it11.hasNext()) {
                            v30.j jVarB = ((v30.y) it11.next()).b();
                            if (jVarB != null) {
                                arrayList3.add(jVarB);
                            }
                        }
                        Iterator it12 = arrayList3.iterator();
                        while (it12.hasNext()) {
                            f0Var7.p((v30.j) it12.next());
                        }
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        m params4 = (m) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        f0 f0Var8 = this.f285525b;
                        TicketsInfoApi ticketsInfoApi = f0Var8.f285384b;
                        Instant instantNow = params4.f285468a;
                        if (instantNow == null) {
                            instantNow = Instant.now();
                        }
                        Intrinsics.h(instantNow);
                        return f0Var8.d(ticketsInfoApi.getResolvedTickets(instantNow, 20), null);
                    case 16:
                        m params5 = (m) obj2;
                        List chats3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(chats3, "chats");
                        Instant instant = params5.f285468a;
                        f0 f0Var9 = this.f285525b;
                        if (instant != null) {
                            f0Var9.o.d(instant, chats3);
                        } else {
                            f0Var9.f285386g.f("chats_history", chats3);
                        }
                        return Unit.f186387a;
                    case 17:
                        List chats4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((m) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats4, "chats");
                        f0 f0Var10 = this.f285525b;
                        r10.d dVarH2 = f0Var10.g().h();
                        List list3 = chats4;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it13 = list3.iterator();
                        while (it13.hasNext()) {
                            arrayList4.add(f0Var10.f.e((v30.j) it13.next()));
                        }
                        dVarH2.a0(arrayList4);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        v30.c0 feedType = (v30.c0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(feedType, "feedType");
                        f0 f0Var11 = this.f285525b;
                        return f0Var11.d(f0Var11.f285384b.getTicketList(zhm.u.c(feedType.c())), feedType);
                    case 19:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<g20.b> inbox = this.f285525b.f285384b.getInbox();
                        uz7.f fVar2 = new uz7.f(18, new v0k.g(24));
                        inbox.getClass();
                        ufm.i iVar2 = new ufm.i(inbox, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 20:
                        Integer num = (Integer) obj3;
                        num.intValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285386g.f("unread_count", num);
                        return Unit.f186387a;
                    case 21:
                        Integer num2 = (Integer) obj3;
                        num2.getClass();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285387h.G(num2, "unread_count", wim.z.d(kotlin.jvm.internal.o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it15 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it15, "it");
                        f0 f0Var12 = this.f285525b;
                        efm.d0<g20.a> clientInfo = f0Var12.f285384b.getClientInfo();
                        uz7.f fVar3 = new uz7.f(19, new v0k.g(f0Var12));
                        clientInfo.getClass();
                        ufm.i iVar3 = new ufm.i(clientInfo, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 23:
                        l clientInfo2 = (l) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(clientInfo2, "clientInfo");
                        this.f285525b.f285386g.f("clientInfo", clientInfo2);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        UUID id10 = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        f0 f0Var13 = this.f285525b;
                        return f0Var13.e(f0Var13.f285384b.getTicket(id10), null);
                }
            }
        }, null, new p(this, 1), null, 168);
        final int i96 = 2;
        final int i99 = 3;
        this.f285395s = new w4l.f(new Function2(this) { // from class: v20.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f285525b;

            {
                this.f285525b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i96) {
                    case 0:
                        v30.j ticket = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "id");
                        Intrinsics.checkNotNullParameter(ticket, "ticket");
                        this.f285525b.p(ticket);
                        return Unit.f186387a;
                    case 1:
                        v30.j ticket2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(ticket2, "ticket");
                        f0 f0Var = this.f285525b;
                        f0Var.g().h().b0(f0Var.f.e(ticket2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        f1 params = (f1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        return this.f285525b.j(params.f285400a, params.f285401b, v30.t.DEFAULT);
                    case 3:
                        f1 param = (f1) obj2;
                        d1 ticket3 = (d1) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(ticket3, "ticket");
                        this.f285525b.f285386g.f("next_ticket_" + param.a() + "_" + param.b(), ticket3);
                        return Unit.f186387a;
                    case 4:
                        UUID chatId = (UUID) obj2;
                        z30.j tags = (z30.j) obj3;
                        Intrinsics.checkNotNullParameter(chatId, "chatId");
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        this.f285525b.f285386g.f("experience_ratings_for_" + chatId, tags);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String key = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        ufm.c cVar = new ufm.c(new to7.f(this.f285525b, key, 8), 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        return cVar;
                    case 6:
                        List chats = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats, "chats");
                        List list = chats;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj4 : list) {
                            v30.c0 c0VarI = ((v30.j) obj4).i();
                            Object arrayList = linkedHashMap.get(c0VarI);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(c0VarI, arrayList);
                            }
                            ((List) arrayList).add(obj4);
                        }
                        Iterator it8 = linkedHashMap.entrySet().iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            f0 f0Var2 = this.f285525b;
                            if (!zHasNext) {
                                Iterator it9 = list.iterator();
                                while (it9.hasNext()) {
                                    f0Var2.p((v30.j) it9.next());
                                }
                                return Unit.f186387a;
                            }
                            Map.Entry entry = (Map.Entry) it8.next();
                            f0Var2.f285386g.f(((v30.c0) entry.getKey()).d(), (List) entry.getValue());
                        }
                        break;
                    case 7:
                        String key2 = (String) obj2;
                        UUID uuid = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(uuid, "uuid");
                        this.f285525b.f285386g.f(key2, uuid);
                        return Unit.f186387a;
                    case 8:
                        String key3 = (String) obj2;
                        UUID messageId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(messageId, "messageId");
                        this.f285525b.f285387h.G(messageId, key3, wim.z.d(kotlin.jvm.internal.o0.b(UUID.class)));
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        UUID ticketId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
                        efm.d0<m20.d> availability = this.f285525b.f285384b.getAvailability(ticketId);
                        uz7.f fVar = new uz7.f(14, new v0k.g(21));
                        availability.getClass();
                        ufm.i iVar = new ufm.i(availability, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 10:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        od0.i params2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        f0 f0Var3 = this.f285525b;
                        return f0Var3.e(f0Var3.f285384b.getLastTicket((UUID) params2.f224257a), null);
                    case 11:
                        od0.i params3 = (od0.i) obj2;
                        v30.j chat = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(chat, "chat");
                        f0 f0Var4 = this.f285525b;
                        f0Var4.f285386g.f("key_memory_cache_last_chat" + params3.f224257a, chat);
                        f0Var4.p(chat);
                        return Unit.f186387a;
                    case 12:
                        v30.j chat2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((od0.i) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chat2, "chat");
                        f0 f0Var5 = this.f285525b;
                        f0Var5.g().h().b0(f0Var5.f.e(chat2));
                        return Unit.f186387a;
                    case 13:
                        List chats2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats2, "chats");
                        f0 f0Var6 = this.f285525b;
                        r10.d dVarH = f0Var6.g().h();
                        List list2 = chats2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(f0Var6.f.e((v30.j) it10.next()));
                        }
                        dVarH.a0(arrayList2);
                        return Unit.f186387a;
                    case 14:
                        List feeds = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeds, "feeds");
                        f0 f0Var7 = this.f285525b;
                        f0Var7.f285386g.f("key_memory_cache_feeds", feeds);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it11 = feeds.iterator();
                        while (it11.hasNext()) {
                            v30.j jVarB = ((v30.y) it11.next()).b();
                            if (jVarB != null) {
                                arrayList3.add(jVarB);
                            }
                        }
                        Iterator it12 = arrayList3.iterator();
                        while (it12.hasNext()) {
                            f0Var7.p((v30.j) it12.next());
                        }
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        m params4 = (m) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        f0 f0Var8 = this.f285525b;
                        TicketsInfoApi ticketsInfoApi = f0Var8.f285384b;
                        Instant instantNow = params4.f285468a;
                        if (instantNow == null) {
                            instantNow = Instant.now();
                        }
                        Intrinsics.h(instantNow);
                        return f0Var8.d(ticketsInfoApi.getResolvedTickets(instantNow, 20), null);
                    case 16:
                        m params5 = (m) obj2;
                        List chats3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(chats3, "chats");
                        Instant instant = params5.f285468a;
                        f0 f0Var9 = this.f285525b;
                        if (instant != null) {
                            f0Var9.o.d(instant, chats3);
                        } else {
                            f0Var9.f285386g.f("chats_history", chats3);
                        }
                        return Unit.f186387a;
                    case 17:
                        List chats4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((m) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats4, "chats");
                        f0 f0Var10 = this.f285525b;
                        r10.d dVarH2 = f0Var10.g().h();
                        List list3 = chats4;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it13 = list3.iterator();
                        while (it13.hasNext()) {
                            arrayList4.add(f0Var10.f.e((v30.j) it13.next()));
                        }
                        dVarH2.a0(arrayList4);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        v30.c0 feedType = (v30.c0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(feedType, "feedType");
                        f0 f0Var11 = this.f285525b;
                        return f0Var11.d(f0Var11.f285384b.getTicketList(zhm.u.c(feedType.c())), feedType);
                    case 19:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<g20.b> inbox = this.f285525b.f285384b.getInbox();
                        uz7.f fVar2 = new uz7.f(18, new v0k.g(24));
                        inbox.getClass();
                        ufm.i iVar2 = new ufm.i(inbox, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 20:
                        Integer num = (Integer) obj3;
                        num.intValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285386g.f("unread_count", num);
                        return Unit.f186387a;
                    case 21:
                        Integer num2 = (Integer) obj3;
                        num2.getClass();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285387h.G(num2, "unread_count", wim.z.d(kotlin.jvm.internal.o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it15 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it15, "it");
                        f0 f0Var12 = this.f285525b;
                        efm.d0<g20.a> clientInfo = f0Var12.f285384b.getClientInfo();
                        uz7.f fVar3 = new uz7.f(19, new v0k.g(f0Var12));
                        clientInfo.getClass();
                        ufm.i iVar3 = new ufm.i(clientInfo, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 23:
                        l clientInfo2 = (l) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(clientInfo2, "clientInfo");
                        this.f285525b.f285386g.f("clientInfo", clientInfo2);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        UUID id10 = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        f0 f0Var13 = this.f285525b;
                        return f0Var13.e(f0Var13.f285384b.getTicket(id10), null);
                }
            }
        }, new p(this, 2), new Function2(this) { // from class: v20.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f285525b;

            {
                this.f285525b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i99) {
                    case 0:
                        v30.j ticket = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "id");
                        Intrinsics.checkNotNullParameter(ticket, "ticket");
                        this.f285525b.p(ticket);
                        return Unit.f186387a;
                    case 1:
                        v30.j ticket2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(ticket2, "ticket");
                        f0 f0Var = this.f285525b;
                        f0Var.g().h().b0(f0Var.f.e(ticket2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        f1 params = (f1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        return this.f285525b.j(params.f285400a, params.f285401b, v30.t.DEFAULT);
                    case 3:
                        f1 param = (f1) obj2;
                        d1 ticket3 = (d1) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(ticket3, "ticket");
                        this.f285525b.f285386g.f("next_ticket_" + param.a() + "_" + param.b(), ticket3);
                        return Unit.f186387a;
                    case 4:
                        UUID chatId = (UUID) obj2;
                        z30.j tags = (z30.j) obj3;
                        Intrinsics.checkNotNullParameter(chatId, "chatId");
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        this.f285525b.f285386g.f("experience_ratings_for_" + chatId, tags);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String key = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        ufm.c cVar = new ufm.c(new to7.f(this.f285525b, key, 8), 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        return cVar;
                    case 6:
                        List chats = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats, "chats");
                        List list = chats;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj4 : list) {
                            v30.c0 c0VarI = ((v30.j) obj4).i();
                            Object arrayList = linkedHashMap.get(c0VarI);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(c0VarI, arrayList);
                            }
                            ((List) arrayList).add(obj4);
                        }
                        Iterator it8 = linkedHashMap.entrySet().iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            f0 f0Var2 = this.f285525b;
                            if (!zHasNext) {
                                Iterator it9 = list.iterator();
                                while (it9.hasNext()) {
                                    f0Var2.p((v30.j) it9.next());
                                }
                                return Unit.f186387a;
                            }
                            Map.Entry entry = (Map.Entry) it8.next();
                            f0Var2.f285386g.f(((v30.c0) entry.getKey()).d(), (List) entry.getValue());
                        }
                        break;
                    case 7:
                        String key2 = (String) obj2;
                        UUID uuid = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(uuid, "uuid");
                        this.f285525b.f285386g.f(key2, uuid);
                        return Unit.f186387a;
                    case 8:
                        String key3 = (String) obj2;
                        UUID messageId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(messageId, "messageId");
                        this.f285525b.f285387h.G(messageId, key3, wim.z.d(kotlin.jvm.internal.o0.b(UUID.class)));
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        UUID ticketId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
                        efm.d0<m20.d> availability = this.f285525b.f285384b.getAvailability(ticketId);
                        uz7.f fVar = new uz7.f(14, new v0k.g(21));
                        availability.getClass();
                        ufm.i iVar = new ufm.i(availability, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 10:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        od0.i params2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        f0 f0Var3 = this.f285525b;
                        return f0Var3.e(f0Var3.f285384b.getLastTicket((UUID) params2.f224257a), null);
                    case 11:
                        od0.i params3 = (od0.i) obj2;
                        v30.j chat = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(chat, "chat");
                        f0 f0Var4 = this.f285525b;
                        f0Var4.f285386g.f("key_memory_cache_last_chat" + params3.f224257a, chat);
                        f0Var4.p(chat);
                        return Unit.f186387a;
                    case 12:
                        v30.j chat2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((od0.i) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chat2, "chat");
                        f0 f0Var5 = this.f285525b;
                        f0Var5.g().h().b0(f0Var5.f.e(chat2));
                        return Unit.f186387a;
                    case 13:
                        List chats2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats2, "chats");
                        f0 f0Var6 = this.f285525b;
                        r10.d dVarH = f0Var6.g().h();
                        List list2 = chats2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(f0Var6.f.e((v30.j) it10.next()));
                        }
                        dVarH.a0(arrayList2);
                        return Unit.f186387a;
                    case 14:
                        List feeds = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeds, "feeds");
                        f0 f0Var7 = this.f285525b;
                        f0Var7.f285386g.f("key_memory_cache_feeds", feeds);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it11 = feeds.iterator();
                        while (it11.hasNext()) {
                            v30.j jVarB = ((v30.y) it11.next()).b();
                            if (jVarB != null) {
                                arrayList3.add(jVarB);
                            }
                        }
                        Iterator it12 = arrayList3.iterator();
                        while (it12.hasNext()) {
                            f0Var7.p((v30.j) it12.next());
                        }
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        m params4 = (m) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        f0 f0Var8 = this.f285525b;
                        TicketsInfoApi ticketsInfoApi = f0Var8.f285384b;
                        Instant instantNow = params4.f285468a;
                        if (instantNow == null) {
                            instantNow = Instant.now();
                        }
                        Intrinsics.h(instantNow);
                        return f0Var8.d(ticketsInfoApi.getResolvedTickets(instantNow, 20), null);
                    case 16:
                        m params5 = (m) obj2;
                        List chats3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(chats3, "chats");
                        Instant instant = params5.f285468a;
                        f0 f0Var9 = this.f285525b;
                        if (instant != null) {
                            f0Var9.o.d(instant, chats3);
                        } else {
                            f0Var9.f285386g.f("chats_history", chats3);
                        }
                        return Unit.f186387a;
                    case 17:
                        List chats4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((m) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats4, "chats");
                        f0 f0Var10 = this.f285525b;
                        r10.d dVarH2 = f0Var10.g().h();
                        List list3 = chats4;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it13 = list3.iterator();
                        while (it13.hasNext()) {
                            arrayList4.add(f0Var10.f.e((v30.j) it13.next()));
                        }
                        dVarH2.a0(arrayList4);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        v30.c0 feedType = (v30.c0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(feedType, "feedType");
                        f0 f0Var11 = this.f285525b;
                        return f0Var11.d(f0Var11.f285384b.getTicketList(zhm.u.c(feedType.c())), feedType);
                    case 19:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<g20.b> inbox = this.f285525b.f285384b.getInbox();
                        uz7.f fVar2 = new uz7.f(18, new v0k.g(24));
                        inbox.getClass();
                        ufm.i iVar2 = new ufm.i(inbox, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 20:
                        Integer num = (Integer) obj3;
                        num.intValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285386g.f("unread_count", num);
                        return Unit.f186387a;
                    case 21:
                        Integer num2 = (Integer) obj3;
                        num2.getClass();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285387h.G(num2, "unread_count", wim.z.d(kotlin.jvm.internal.o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it15 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it15, "it");
                        f0 f0Var12 = this.f285525b;
                        efm.d0<g20.a> clientInfo = f0Var12.f285384b.getClientInfo();
                        uz7.f fVar3 = new uz7.f(19, new v0k.g(f0Var12));
                        clientInfo.getClass();
                        ufm.i iVar3 = new ufm.i(clientInfo, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 23:
                        l clientInfo2 = (l) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(clientInfo2, "clientInfo");
                        this.f285525b.f285386g.f("clientInfo", clientInfo2);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        UUID id10 = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        f0 f0Var13 = this.f285525b;
                        return f0Var13.e(f0Var13.f285384b.getTicket(id10), null);
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        Continuation continuation = null;
        final int i100 = 4;
        this.f285396t = new x4l.c(new th6.p(this, continuation, 14), new p(this, 3), new Function2(this) { // from class: v20.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f285525b;

            {
                this.f285525b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i100) {
                    case 0:
                        v30.j ticket = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "id");
                        Intrinsics.checkNotNullParameter(ticket, "ticket");
                        this.f285525b.p(ticket);
                        return Unit.f186387a;
                    case 1:
                        v30.j ticket2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(ticket2, "ticket");
                        f0 f0Var = this.f285525b;
                        f0Var.g().h().b0(f0Var.f.e(ticket2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        f1 params = (f1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        return this.f285525b.j(params.f285400a, params.f285401b, v30.t.DEFAULT);
                    case 3:
                        f1 param = (f1) obj2;
                        d1 ticket3 = (d1) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(ticket3, "ticket");
                        this.f285525b.f285386g.f("next_ticket_" + param.a() + "_" + param.b(), ticket3);
                        return Unit.f186387a;
                    case 4:
                        UUID chatId = (UUID) obj2;
                        z30.j tags = (z30.j) obj3;
                        Intrinsics.checkNotNullParameter(chatId, "chatId");
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        this.f285525b.f285386g.f("experience_ratings_for_" + chatId, tags);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String key = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        ufm.c cVar = new ufm.c(new to7.f(this.f285525b, key, 8), 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        return cVar;
                    case 6:
                        List chats = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats, "chats");
                        List list = chats;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj4 : list) {
                            v30.c0 c0VarI = ((v30.j) obj4).i();
                            Object arrayList = linkedHashMap.get(c0VarI);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(c0VarI, arrayList);
                            }
                            ((List) arrayList).add(obj4);
                        }
                        Iterator it8 = linkedHashMap.entrySet().iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            f0 f0Var2 = this.f285525b;
                            if (!zHasNext) {
                                Iterator it9 = list.iterator();
                                while (it9.hasNext()) {
                                    f0Var2.p((v30.j) it9.next());
                                }
                                return Unit.f186387a;
                            }
                            Map.Entry entry = (Map.Entry) it8.next();
                            f0Var2.f285386g.f(((v30.c0) entry.getKey()).d(), (List) entry.getValue());
                        }
                        break;
                    case 7:
                        String key2 = (String) obj2;
                        UUID uuid = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(uuid, "uuid");
                        this.f285525b.f285386g.f(key2, uuid);
                        return Unit.f186387a;
                    case 8:
                        String key3 = (String) obj2;
                        UUID messageId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(messageId, "messageId");
                        this.f285525b.f285387h.G(messageId, key3, wim.z.d(kotlin.jvm.internal.o0.b(UUID.class)));
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        UUID ticketId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
                        efm.d0<m20.d> availability = this.f285525b.f285384b.getAvailability(ticketId);
                        uz7.f fVar = new uz7.f(14, new v0k.g(21));
                        availability.getClass();
                        ufm.i iVar = new ufm.i(availability, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 10:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        od0.i params2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        f0 f0Var3 = this.f285525b;
                        return f0Var3.e(f0Var3.f285384b.getLastTicket((UUID) params2.f224257a), null);
                    case 11:
                        od0.i params3 = (od0.i) obj2;
                        v30.j chat = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(chat, "chat");
                        f0 f0Var4 = this.f285525b;
                        f0Var4.f285386g.f("key_memory_cache_last_chat" + params3.f224257a, chat);
                        f0Var4.p(chat);
                        return Unit.f186387a;
                    case 12:
                        v30.j chat2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((od0.i) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chat2, "chat");
                        f0 f0Var5 = this.f285525b;
                        f0Var5.g().h().b0(f0Var5.f.e(chat2));
                        return Unit.f186387a;
                    case 13:
                        List chats2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats2, "chats");
                        f0 f0Var6 = this.f285525b;
                        r10.d dVarH = f0Var6.g().h();
                        List list2 = chats2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(f0Var6.f.e((v30.j) it10.next()));
                        }
                        dVarH.a0(arrayList2);
                        return Unit.f186387a;
                    case 14:
                        List feeds = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeds, "feeds");
                        f0 f0Var7 = this.f285525b;
                        f0Var7.f285386g.f("key_memory_cache_feeds", feeds);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it11 = feeds.iterator();
                        while (it11.hasNext()) {
                            v30.j jVarB = ((v30.y) it11.next()).b();
                            if (jVarB != null) {
                                arrayList3.add(jVarB);
                            }
                        }
                        Iterator it12 = arrayList3.iterator();
                        while (it12.hasNext()) {
                            f0Var7.p((v30.j) it12.next());
                        }
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        m params4 = (m) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        f0 f0Var8 = this.f285525b;
                        TicketsInfoApi ticketsInfoApi = f0Var8.f285384b;
                        Instant instantNow = params4.f285468a;
                        if (instantNow == null) {
                            instantNow = Instant.now();
                        }
                        Intrinsics.h(instantNow);
                        return f0Var8.d(ticketsInfoApi.getResolvedTickets(instantNow, 20), null);
                    case 16:
                        m params5 = (m) obj2;
                        List chats3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(chats3, "chats");
                        Instant instant = params5.f285468a;
                        f0 f0Var9 = this.f285525b;
                        if (instant != null) {
                            f0Var9.o.d(instant, chats3);
                        } else {
                            f0Var9.f285386g.f("chats_history", chats3);
                        }
                        return Unit.f186387a;
                    case 17:
                        List chats4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((m) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats4, "chats");
                        f0 f0Var10 = this.f285525b;
                        r10.d dVarH2 = f0Var10.g().h();
                        List list3 = chats4;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it13 = list3.iterator();
                        while (it13.hasNext()) {
                            arrayList4.add(f0Var10.f.e((v30.j) it13.next()));
                        }
                        dVarH2.a0(arrayList4);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        v30.c0 feedType = (v30.c0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(feedType, "feedType");
                        f0 f0Var11 = this.f285525b;
                        return f0Var11.d(f0Var11.f285384b.getTicketList(zhm.u.c(feedType.c())), feedType);
                    case 19:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<g20.b> inbox = this.f285525b.f285384b.getInbox();
                        uz7.f fVar2 = new uz7.f(18, new v0k.g(24));
                        inbox.getClass();
                        ufm.i iVar2 = new ufm.i(inbox, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 20:
                        Integer num = (Integer) obj3;
                        num.intValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285386g.f("unread_count", num);
                        return Unit.f186387a;
                    case 21:
                        Integer num2 = (Integer) obj3;
                        num2.getClass();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285387h.G(num2, "unread_count", wim.z.d(kotlin.jvm.internal.o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it15 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it15, "it");
                        f0 f0Var12 = this.f285525b;
                        efm.d0<g20.a> clientInfo = f0Var12.f285384b.getClientInfo();
                        uz7.f fVar3 = new uz7.f(19, new v0k.g(f0Var12));
                        clientInfo.getClass();
                        ufm.i iVar3 = new ufm.i(clientInfo, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 23:
                        l clientInfo2 = (l) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(clientInfo2, "clientInfo");
                        this.f285525b.f285386g.f("clientInfo", clientInfo2);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        UUID id10 = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        f0 f0Var13 = this.f285525b;
                        return f0Var13.e(f0Var13.f285384b.getTicket(id10), null);
                }
            }
        }, new rp1.c(), new uyd.e0(1));
        final int i101 = 5;
        final int i102 = 7;
        final int i103 = 8;
        this.u = new w4l.f(new Function2(this) { // from class: v20.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f285525b;

            {
                this.f285525b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i101) {
                    case 0:
                        v30.j ticket = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "id");
                        Intrinsics.checkNotNullParameter(ticket, "ticket");
                        this.f285525b.p(ticket);
                        return Unit.f186387a;
                    case 1:
                        v30.j ticket2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(ticket2, "ticket");
                        f0 f0Var = this.f285525b;
                        f0Var.g().h().b0(f0Var.f.e(ticket2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        f1 params = (f1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        return this.f285525b.j(params.f285400a, params.f285401b, v30.t.DEFAULT);
                    case 3:
                        f1 param = (f1) obj2;
                        d1 ticket3 = (d1) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(ticket3, "ticket");
                        this.f285525b.f285386g.f("next_ticket_" + param.a() + "_" + param.b(), ticket3);
                        return Unit.f186387a;
                    case 4:
                        UUID chatId = (UUID) obj2;
                        z30.j tags = (z30.j) obj3;
                        Intrinsics.checkNotNullParameter(chatId, "chatId");
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        this.f285525b.f285386g.f("experience_ratings_for_" + chatId, tags);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String key = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        ufm.c cVar = new ufm.c(new to7.f(this.f285525b, key, 8), 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        return cVar;
                    case 6:
                        List chats = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats, "chats");
                        List list = chats;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj4 : list) {
                            v30.c0 c0VarI = ((v30.j) obj4).i();
                            Object arrayList = linkedHashMap.get(c0VarI);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(c0VarI, arrayList);
                            }
                            ((List) arrayList).add(obj4);
                        }
                        Iterator it8 = linkedHashMap.entrySet().iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            f0 f0Var2 = this.f285525b;
                            if (!zHasNext) {
                                Iterator it9 = list.iterator();
                                while (it9.hasNext()) {
                                    f0Var2.p((v30.j) it9.next());
                                }
                                return Unit.f186387a;
                            }
                            Map.Entry entry = (Map.Entry) it8.next();
                            f0Var2.f285386g.f(((v30.c0) entry.getKey()).d(), (List) entry.getValue());
                        }
                        break;
                    case 7:
                        String key2 = (String) obj2;
                        UUID uuid = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(uuid, "uuid");
                        this.f285525b.f285386g.f(key2, uuid);
                        return Unit.f186387a;
                    case 8:
                        String key3 = (String) obj2;
                        UUID messageId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(messageId, "messageId");
                        this.f285525b.f285387h.G(messageId, key3, wim.z.d(kotlin.jvm.internal.o0.b(UUID.class)));
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        UUID ticketId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
                        efm.d0<m20.d> availability = this.f285525b.f285384b.getAvailability(ticketId);
                        uz7.f fVar = new uz7.f(14, new v0k.g(21));
                        availability.getClass();
                        ufm.i iVar = new ufm.i(availability, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 10:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        od0.i params2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        f0 f0Var3 = this.f285525b;
                        return f0Var3.e(f0Var3.f285384b.getLastTicket((UUID) params2.f224257a), null);
                    case 11:
                        od0.i params3 = (od0.i) obj2;
                        v30.j chat = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(chat, "chat");
                        f0 f0Var4 = this.f285525b;
                        f0Var4.f285386g.f("key_memory_cache_last_chat" + params3.f224257a, chat);
                        f0Var4.p(chat);
                        return Unit.f186387a;
                    case 12:
                        v30.j chat2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((od0.i) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chat2, "chat");
                        f0 f0Var5 = this.f285525b;
                        f0Var5.g().h().b0(f0Var5.f.e(chat2));
                        return Unit.f186387a;
                    case 13:
                        List chats2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats2, "chats");
                        f0 f0Var6 = this.f285525b;
                        r10.d dVarH = f0Var6.g().h();
                        List list2 = chats2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(f0Var6.f.e((v30.j) it10.next()));
                        }
                        dVarH.a0(arrayList2);
                        return Unit.f186387a;
                    case 14:
                        List feeds = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeds, "feeds");
                        f0 f0Var7 = this.f285525b;
                        f0Var7.f285386g.f("key_memory_cache_feeds", feeds);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it11 = feeds.iterator();
                        while (it11.hasNext()) {
                            v30.j jVarB = ((v30.y) it11.next()).b();
                            if (jVarB != null) {
                                arrayList3.add(jVarB);
                            }
                        }
                        Iterator it12 = arrayList3.iterator();
                        while (it12.hasNext()) {
                            f0Var7.p((v30.j) it12.next());
                        }
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        m params4 = (m) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        f0 f0Var8 = this.f285525b;
                        TicketsInfoApi ticketsInfoApi = f0Var8.f285384b;
                        Instant instantNow = params4.f285468a;
                        if (instantNow == null) {
                            instantNow = Instant.now();
                        }
                        Intrinsics.h(instantNow);
                        return f0Var8.d(ticketsInfoApi.getResolvedTickets(instantNow, 20), null);
                    case 16:
                        m params5 = (m) obj2;
                        List chats3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(chats3, "chats");
                        Instant instant = params5.f285468a;
                        f0 f0Var9 = this.f285525b;
                        if (instant != null) {
                            f0Var9.o.d(instant, chats3);
                        } else {
                            f0Var9.f285386g.f("chats_history", chats3);
                        }
                        return Unit.f186387a;
                    case 17:
                        List chats4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((m) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats4, "chats");
                        f0 f0Var10 = this.f285525b;
                        r10.d dVarH2 = f0Var10.g().h();
                        List list3 = chats4;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it13 = list3.iterator();
                        while (it13.hasNext()) {
                            arrayList4.add(f0Var10.f.e((v30.j) it13.next()));
                        }
                        dVarH2.a0(arrayList4);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        v30.c0 feedType = (v30.c0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(feedType, "feedType");
                        f0 f0Var11 = this.f285525b;
                        return f0Var11.d(f0Var11.f285384b.getTicketList(zhm.u.c(feedType.c())), feedType);
                    case 19:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<g20.b> inbox = this.f285525b.f285384b.getInbox();
                        uz7.f fVar2 = new uz7.f(18, new v0k.g(24));
                        inbox.getClass();
                        ufm.i iVar2 = new ufm.i(inbox, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 20:
                        Integer num = (Integer) obj3;
                        num.intValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285386g.f("unread_count", num);
                        return Unit.f186387a;
                    case 21:
                        Integer num2 = (Integer) obj3;
                        num2.getClass();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285387h.G(num2, "unread_count", wim.z.d(kotlin.jvm.internal.o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it15 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it15, "it");
                        f0 f0Var12 = this.f285525b;
                        efm.d0<g20.a> clientInfo = f0Var12.f285384b.getClientInfo();
                        uz7.f fVar3 = new uz7.f(19, new v0k.g(f0Var12));
                        clientInfo.getClass();
                        ufm.i iVar3 = new ufm.i(clientInfo, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 23:
                        l clientInfo2 = (l) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(clientInfo2, "clientInfo");
                        this.f285525b.f285386g.f("clientInfo", clientInfo2);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        UUID id10 = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        f0 f0Var13 = this.f285525b;
                        return f0Var13.e(f0Var13.f285384b.getTicket(id10), null);
                }
            }
        }, new p(this, 4), new Function2(this) { // from class: v20.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f285525b;

            {
                this.f285525b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i102) {
                    case 0:
                        v30.j ticket = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "id");
                        Intrinsics.checkNotNullParameter(ticket, "ticket");
                        this.f285525b.p(ticket);
                        return Unit.f186387a;
                    case 1:
                        v30.j ticket2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(ticket2, "ticket");
                        f0 f0Var = this.f285525b;
                        f0Var.g().h().b0(f0Var.f.e(ticket2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        f1 params = (f1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        return this.f285525b.j(params.f285400a, params.f285401b, v30.t.DEFAULT);
                    case 3:
                        f1 param = (f1) obj2;
                        d1 ticket3 = (d1) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(ticket3, "ticket");
                        this.f285525b.f285386g.f("next_ticket_" + param.a() + "_" + param.b(), ticket3);
                        return Unit.f186387a;
                    case 4:
                        UUID chatId = (UUID) obj2;
                        z30.j tags = (z30.j) obj3;
                        Intrinsics.checkNotNullParameter(chatId, "chatId");
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        this.f285525b.f285386g.f("experience_ratings_for_" + chatId, tags);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String key = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        ufm.c cVar = new ufm.c(new to7.f(this.f285525b, key, 8), 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        return cVar;
                    case 6:
                        List chats = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats, "chats");
                        List list = chats;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj4 : list) {
                            v30.c0 c0VarI = ((v30.j) obj4).i();
                            Object arrayList = linkedHashMap.get(c0VarI);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(c0VarI, arrayList);
                            }
                            ((List) arrayList).add(obj4);
                        }
                        Iterator it8 = linkedHashMap.entrySet().iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            f0 f0Var2 = this.f285525b;
                            if (!zHasNext) {
                                Iterator it9 = list.iterator();
                                while (it9.hasNext()) {
                                    f0Var2.p((v30.j) it9.next());
                                }
                                return Unit.f186387a;
                            }
                            Map.Entry entry = (Map.Entry) it8.next();
                            f0Var2.f285386g.f(((v30.c0) entry.getKey()).d(), (List) entry.getValue());
                        }
                        break;
                    case 7:
                        String key2 = (String) obj2;
                        UUID uuid = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(uuid, "uuid");
                        this.f285525b.f285386g.f(key2, uuid);
                        return Unit.f186387a;
                    case 8:
                        String key3 = (String) obj2;
                        UUID messageId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(messageId, "messageId");
                        this.f285525b.f285387h.G(messageId, key3, wim.z.d(kotlin.jvm.internal.o0.b(UUID.class)));
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        UUID ticketId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
                        efm.d0<m20.d> availability = this.f285525b.f285384b.getAvailability(ticketId);
                        uz7.f fVar = new uz7.f(14, new v0k.g(21));
                        availability.getClass();
                        ufm.i iVar = new ufm.i(availability, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 10:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        od0.i params2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        f0 f0Var3 = this.f285525b;
                        return f0Var3.e(f0Var3.f285384b.getLastTicket((UUID) params2.f224257a), null);
                    case 11:
                        od0.i params3 = (od0.i) obj2;
                        v30.j chat = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(chat, "chat");
                        f0 f0Var4 = this.f285525b;
                        f0Var4.f285386g.f("key_memory_cache_last_chat" + params3.f224257a, chat);
                        f0Var4.p(chat);
                        return Unit.f186387a;
                    case 12:
                        v30.j chat2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((od0.i) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chat2, "chat");
                        f0 f0Var5 = this.f285525b;
                        f0Var5.g().h().b0(f0Var5.f.e(chat2));
                        return Unit.f186387a;
                    case 13:
                        List chats2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats2, "chats");
                        f0 f0Var6 = this.f285525b;
                        r10.d dVarH = f0Var6.g().h();
                        List list2 = chats2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(f0Var6.f.e((v30.j) it10.next()));
                        }
                        dVarH.a0(arrayList2);
                        return Unit.f186387a;
                    case 14:
                        List feeds = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeds, "feeds");
                        f0 f0Var7 = this.f285525b;
                        f0Var7.f285386g.f("key_memory_cache_feeds", feeds);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it11 = feeds.iterator();
                        while (it11.hasNext()) {
                            v30.j jVarB = ((v30.y) it11.next()).b();
                            if (jVarB != null) {
                                arrayList3.add(jVarB);
                            }
                        }
                        Iterator it12 = arrayList3.iterator();
                        while (it12.hasNext()) {
                            f0Var7.p((v30.j) it12.next());
                        }
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        m params4 = (m) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        f0 f0Var8 = this.f285525b;
                        TicketsInfoApi ticketsInfoApi = f0Var8.f285384b;
                        Instant instantNow = params4.f285468a;
                        if (instantNow == null) {
                            instantNow = Instant.now();
                        }
                        Intrinsics.h(instantNow);
                        return f0Var8.d(ticketsInfoApi.getResolvedTickets(instantNow, 20), null);
                    case 16:
                        m params5 = (m) obj2;
                        List chats3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(chats3, "chats");
                        Instant instant = params5.f285468a;
                        f0 f0Var9 = this.f285525b;
                        if (instant != null) {
                            f0Var9.o.d(instant, chats3);
                        } else {
                            f0Var9.f285386g.f("chats_history", chats3);
                        }
                        return Unit.f186387a;
                    case 17:
                        List chats4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((m) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats4, "chats");
                        f0 f0Var10 = this.f285525b;
                        r10.d dVarH2 = f0Var10.g().h();
                        List list3 = chats4;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it13 = list3.iterator();
                        while (it13.hasNext()) {
                            arrayList4.add(f0Var10.f.e((v30.j) it13.next()));
                        }
                        dVarH2.a0(arrayList4);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        v30.c0 feedType = (v30.c0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(feedType, "feedType");
                        f0 f0Var11 = this.f285525b;
                        return f0Var11.d(f0Var11.f285384b.getTicketList(zhm.u.c(feedType.c())), feedType);
                    case 19:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<g20.b> inbox = this.f285525b.f285384b.getInbox();
                        uz7.f fVar2 = new uz7.f(18, new v0k.g(24));
                        inbox.getClass();
                        ufm.i iVar2 = new ufm.i(inbox, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 20:
                        Integer num = (Integer) obj3;
                        num.intValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285386g.f("unread_count", num);
                        return Unit.f186387a;
                    case 21:
                        Integer num2 = (Integer) obj3;
                        num2.getClass();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285387h.G(num2, "unread_count", wim.z.d(kotlin.jvm.internal.o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it15 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it15, "it");
                        f0 f0Var12 = this.f285525b;
                        efm.d0<g20.a> clientInfo = f0Var12.f285384b.getClientInfo();
                        uz7.f fVar3 = new uz7.f(19, new v0k.g(f0Var12));
                        clientInfo.getClass();
                        ufm.i iVar3 = new ufm.i(clientInfo, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 23:
                        l clientInfo2 = (l) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(clientInfo2, "clientInfo");
                        this.f285525b.f285386g.f("clientInfo", clientInfo2);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        UUID id10 = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        f0 f0Var13 = this.f285525b;
                        return f0Var13.e(f0Var13.f285384b.getTicket(id10), null);
                }
            }
        }, new v0k.g(18), new Function2(this) { // from class: v20.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f285525b;

            {
                this.f285525b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i103) {
                    case 0:
                        v30.j ticket = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "id");
                        Intrinsics.checkNotNullParameter(ticket, "ticket");
                        this.f285525b.p(ticket);
                        return Unit.f186387a;
                    case 1:
                        v30.j ticket2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(ticket2, "ticket");
                        f0 f0Var = this.f285525b;
                        f0Var.g().h().b0(f0Var.f.e(ticket2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        f1 params = (f1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        return this.f285525b.j(params.f285400a, params.f285401b, v30.t.DEFAULT);
                    case 3:
                        f1 param = (f1) obj2;
                        d1 ticket3 = (d1) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(ticket3, "ticket");
                        this.f285525b.f285386g.f("next_ticket_" + param.a() + "_" + param.b(), ticket3);
                        return Unit.f186387a;
                    case 4:
                        UUID chatId = (UUID) obj2;
                        z30.j tags = (z30.j) obj3;
                        Intrinsics.checkNotNullParameter(chatId, "chatId");
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        this.f285525b.f285386g.f("experience_ratings_for_" + chatId, tags);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String key = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        ufm.c cVar = new ufm.c(new to7.f(this.f285525b, key, 8), 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        return cVar;
                    case 6:
                        List chats = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats, "chats");
                        List list = chats;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj4 : list) {
                            v30.c0 c0VarI = ((v30.j) obj4).i();
                            Object arrayList = linkedHashMap.get(c0VarI);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(c0VarI, arrayList);
                            }
                            ((List) arrayList).add(obj4);
                        }
                        Iterator it8 = linkedHashMap.entrySet().iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            f0 f0Var2 = this.f285525b;
                            if (!zHasNext) {
                                Iterator it9 = list.iterator();
                                while (it9.hasNext()) {
                                    f0Var2.p((v30.j) it9.next());
                                }
                                return Unit.f186387a;
                            }
                            Map.Entry entry = (Map.Entry) it8.next();
                            f0Var2.f285386g.f(((v30.c0) entry.getKey()).d(), (List) entry.getValue());
                        }
                        break;
                    case 7:
                        String key2 = (String) obj2;
                        UUID uuid = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(uuid, "uuid");
                        this.f285525b.f285386g.f(key2, uuid);
                        return Unit.f186387a;
                    case 8:
                        String key3 = (String) obj2;
                        UUID messageId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(messageId, "messageId");
                        this.f285525b.f285387h.G(messageId, key3, wim.z.d(kotlin.jvm.internal.o0.b(UUID.class)));
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        UUID ticketId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
                        efm.d0<m20.d> availability = this.f285525b.f285384b.getAvailability(ticketId);
                        uz7.f fVar = new uz7.f(14, new v0k.g(21));
                        availability.getClass();
                        ufm.i iVar = new ufm.i(availability, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 10:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        od0.i params2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        f0 f0Var3 = this.f285525b;
                        return f0Var3.e(f0Var3.f285384b.getLastTicket((UUID) params2.f224257a), null);
                    case 11:
                        od0.i params3 = (od0.i) obj2;
                        v30.j chat = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(chat, "chat");
                        f0 f0Var4 = this.f285525b;
                        f0Var4.f285386g.f("key_memory_cache_last_chat" + params3.f224257a, chat);
                        f0Var4.p(chat);
                        return Unit.f186387a;
                    case 12:
                        v30.j chat2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((od0.i) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chat2, "chat");
                        f0 f0Var5 = this.f285525b;
                        f0Var5.g().h().b0(f0Var5.f.e(chat2));
                        return Unit.f186387a;
                    case 13:
                        List chats2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats2, "chats");
                        f0 f0Var6 = this.f285525b;
                        r10.d dVarH = f0Var6.g().h();
                        List list2 = chats2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(f0Var6.f.e((v30.j) it10.next()));
                        }
                        dVarH.a0(arrayList2);
                        return Unit.f186387a;
                    case 14:
                        List feeds = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeds, "feeds");
                        f0 f0Var7 = this.f285525b;
                        f0Var7.f285386g.f("key_memory_cache_feeds", feeds);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it11 = feeds.iterator();
                        while (it11.hasNext()) {
                            v30.j jVarB = ((v30.y) it11.next()).b();
                            if (jVarB != null) {
                                arrayList3.add(jVarB);
                            }
                        }
                        Iterator it12 = arrayList3.iterator();
                        while (it12.hasNext()) {
                            f0Var7.p((v30.j) it12.next());
                        }
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        m params4 = (m) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        f0 f0Var8 = this.f285525b;
                        TicketsInfoApi ticketsInfoApi = f0Var8.f285384b;
                        Instant instantNow = params4.f285468a;
                        if (instantNow == null) {
                            instantNow = Instant.now();
                        }
                        Intrinsics.h(instantNow);
                        return f0Var8.d(ticketsInfoApi.getResolvedTickets(instantNow, 20), null);
                    case 16:
                        m params5 = (m) obj2;
                        List chats3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(chats3, "chats");
                        Instant instant = params5.f285468a;
                        f0 f0Var9 = this.f285525b;
                        if (instant != null) {
                            f0Var9.o.d(instant, chats3);
                        } else {
                            f0Var9.f285386g.f("chats_history", chats3);
                        }
                        return Unit.f186387a;
                    case 17:
                        List chats4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((m) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats4, "chats");
                        f0 f0Var10 = this.f285525b;
                        r10.d dVarH2 = f0Var10.g().h();
                        List list3 = chats4;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it13 = list3.iterator();
                        while (it13.hasNext()) {
                            arrayList4.add(f0Var10.f.e((v30.j) it13.next()));
                        }
                        dVarH2.a0(arrayList4);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        v30.c0 feedType = (v30.c0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(feedType, "feedType");
                        f0 f0Var11 = this.f285525b;
                        return f0Var11.d(f0Var11.f285384b.getTicketList(zhm.u.c(feedType.c())), feedType);
                    case 19:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<g20.b> inbox = this.f285525b.f285384b.getInbox();
                        uz7.f fVar2 = new uz7.f(18, new v0k.g(24));
                        inbox.getClass();
                        ufm.i iVar2 = new ufm.i(inbox, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 20:
                        Integer num = (Integer) obj3;
                        num.intValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285386g.f("unread_count", num);
                        return Unit.f186387a;
                    case 21:
                        Integer num2 = (Integer) obj3;
                        num2.getClass();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285387h.G(num2, "unread_count", wim.z.d(kotlin.jvm.internal.o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it15 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it15, "it");
                        f0 f0Var12 = this.f285525b;
                        efm.d0<g20.a> clientInfo = f0Var12.f285384b.getClientInfo();
                        uz7.f fVar3 = new uz7.f(19, new v0k.g(f0Var12));
                        clientInfo.getClass();
                        ufm.i iVar3 = new ufm.i(clientInfo, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 23:
                        l clientInfo2 = (l) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(clientInfo2, "clientInfo");
                        this.f285525b.f285386g.f("clientInfo", clientInfo2);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        UUID id10 = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        f0 f0Var13 = this.f285525b;
                        return f0Var13.e(f0Var13.f285384b.getTicket(id10), null);
                }
            }
        }, null, null, null, BERTags.FLAGS);
        this.v = v0.a.d("create(...)");
        this.f285397w = yhm.j.b(new ur2.a(interceptor, 15));
        this.f285398x = yhm.j.b(new ur2.a(this, 16));
        final int i104 = 9;
        new w4l.f(new Function2(this) { // from class: v20.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f285525b;

            {
                this.f285525b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i104) {
                    case 0:
                        v30.j ticket = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "id");
                        Intrinsics.checkNotNullParameter(ticket, "ticket");
                        this.f285525b.p(ticket);
                        return Unit.f186387a;
                    case 1:
                        v30.j ticket2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(ticket2, "ticket");
                        f0 f0Var = this.f285525b;
                        f0Var.g().h().b0(f0Var.f.e(ticket2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        f1 params = (f1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        return this.f285525b.j(params.f285400a, params.f285401b, v30.t.DEFAULT);
                    case 3:
                        f1 param = (f1) obj2;
                        d1 ticket3 = (d1) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(ticket3, "ticket");
                        this.f285525b.f285386g.f("next_ticket_" + param.a() + "_" + param.b(), ticket3);
                        return Unit.f186387a;
                    case 4:
                        UUID chatId = (UUID) obj2;
                        z30.j tags = (z30.j) obj3;
                        Intrinsics.checkNotNullParameter(chatId, "chatId");
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        this.f285525b.f285386g.f("experience_ratings_for_" + chatId, tags);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String key = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        ufm.c cVar = new ufm.c(new to7.f(this.f285525b, key, 8), 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        return cVar;
                    case 6:
                        List chats = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats, "chats");
                        List list = chats;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj4 : list) {
                            v30.c0 c0VarI = ((v30.j) obj4).i();
                            Object arrayList = linkedHashMap.get(c0VarI);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(c0VarI, arrayList);
                            }
                            ((List) arrayList).add(obj4);
                        }
                        Iterator it8 = linkedHashMap.entrySet().iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            f0 f0Var2 = this.f285525b;
                            if (!zHasNext) {
                                Iterator it9 = list.iterator();
                                while (it9.hasNext()) {
                                    f0Var2.p((v30.j) it9.next());
                                }
                                return Unit.f186387a;
                            }
                            Map.Entry entry = (Map.Entry) it8.next();
                            f0Var2.f285386g.f(((v30.c0) entry.getKey()).d(), (List) entry.getValue());
                        }
                        break;
                    case 7:
                        String key2 = (String) obj2;
                        UUID uuid = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(uuid, "uuid");
                        this.f285525b.f285386g.f(key2, uuid);
                        return Unit.f186387a;
                    case 8:
                        String key3 = (String) obj2;
                        UUID messageId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(messageId, "messageId");
                        this.f285525b.f285387h.G(messageId, key3, wim.z.d(kotlin.jvm.internal.o0.b(UUID.class)));
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        UUID ticketId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
                        efm.d0<m20.d> availability = this.f285525b.f285384b.getAvailability(ticketId);
                        uz7.f fVar = new uz7.f(14, new v0k.g(21));
                        availability.getClass();
                        ufm.i iVar = new ufm.i(availability, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 10:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        od0.i params2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        f0 f0Var3 = this.f285525b;
                        return f0Var3.e(f0Var3.f285384b.getLastTicket((UUID) params2.f224257a), null);
                    case 11:
                        od0.i params3 = (od0.i) obj2;
                        v30.j chat = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(chat, "chat");
                        f0 f0Var4 = this.f285525b;
                        f0Var4.f285386g.f("key_memory_cache_last_chat" + params3.f224257a, chat);
                        f0Var4.p(chat);
                        return Unit.f186387a;
                    case 12:
                        v30.j chat2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((od0.i) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chat2, "chat");
                        f0 f0Var5 = this.f285525b;
                        f0Var5.g().h().b0(f0Var5.f.e(chat2));
                        return Unit.f186387a;
                    case 13:
                        List chats2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats2, "chats");
                        f0 f0Var6 = this.f285525b;
                        r10.d dVarH = f0Var6.g().h();
                        List list2 = chats2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(f0Var6.f.e((v30.j) it10.next()));
                        }
                        dVarH.a0(arrayList2);
                        return Unit.f186387a;
                    case 14:
                        List feeds = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeds, "feeds");
                        f0 f0Var7 = this.f285525b;
                        f0Var7.f285386g.f("key_memory_cache_feeds", feeds);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it11 = feeds.iterator();
                        while (it11.hasNext()) {
                            v30.j jVarB = ((v30.y) it11.next()).b();
                            if (jVarB != null) {
                                arrayList3.add(jVarB);
                            }
                        }
                        Iterator it12 = arrayList3.iterator();
                        while (it12.hasNext()) {
                            f0Var7.p((v30.j) it12.next());
                        }
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        m params4 = (m) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        f0 f0Var8 = this.f285525b;
                        TicketsInfoApi ticketsInfoApi = f0Var8.f285384b;
                        Instant instantNow = params4.f285468a;
                        if (instantNow == null) {
                            instantNow = Instant.now();
                        }
                        Intrinsics.h(instantNow);
                        return f0Var8.d(ticketsInfoApi.getResolvedTickets(instantNow, 20), null);
                    case 16:
                        m params5 = (m) obj2;
                        List chats3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(chats3, "chats");
                        Instant instant = params5.f285468a;
                        f0 f0Var9 = this.f285525b;
                        if (instant != null) {
                            f0Var9.o.d(instant, chats3);
                        } else {
                            f0Var9.f285386g.f("chats_history", chats3);
                        }
                        return Unit.f186387a;
                    case 17:
                        List chats4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((m) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats4, "chats");
                        f0 f0Var10 = this.f285525b;
                        r10.d dVarH2 = f0Var10.g().h();
                        List list3 = chats4;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it13 = list3.iterator();
                        while (it13.hasNext()) {
                            arrayList4.add(f0Var10.f.e((v30.j) it13.next()));
                        }
                        dVarH2.a0(arrayList4);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        v30.c0 feedType = (v30.c0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(feedType, "feedType");
                        f0 f0Var11 = this.f285525b;
                        return f0Var11.d(f0Var11.f285384b.getTicketList(zhm.u.c(feedType.c())), feedType);
                    case 19:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<g20.b> inbox = this.f285525b.f285384b.getInbox();
                        uz7.f fVar2 = new uz7.f(18, new v0k.g(24));
                        inbox.getClass();
                        ufm.i iVar2 = new ufm.i(inbox, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 20:
                        Integer num = (Integer) obj3;
                        num.intValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285386g.f("unread_count", num);
                        return Unit.f186387a;
                    case 21:
                        Integer num2 = (Integer) obj3;
                        num2.getClass();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285387h.G(num2, "unread_count", wim.z.d(kotlin.jvm.internal.o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it15 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it15, "it");
                        f0 f0Var12 = this.f285525b;
                        efm.d0<g20.a> clientInfo = f0Var12.f285384b.getClientInfo();
                        uz7.f fVar3 = new uz7.f(19, new v0k.g(f0Var12));
                        clientInfo.getClass();
                        ufm.i iVar3 = new ufm.i(clientInfo, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 23:
                        l clientInfo2 = (l) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(clientInfo2, "clientInfo");
                        this.f285525b.f285386g.f("clientInfo", clientInfo2);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        UUID id10 = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        f0 f0Var13 = this.f285525b;
                        return f0Var13.e(f0Var13.f285384b.getTicket(id10), null);
                }
            }
        }, null, null, null, null, null, null, null, 254);
        final int i105 = 10;
        final int i106 = 11;
        final int i107 = 12;
        this.f285399y = new w4l.f(new Function2(this) { // from class: v20.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f285525b;

            {
                this.f285525b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i105) {
                    case 0:
                        v30.j ticket = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "id");
                        Intrinsics.checkNotNullParameter(ticket, "ticket");
                        this.f285525b.p(ticket);
                        return Unit.f186387a;
                    case 1:
                        v30.j ticket2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(ticket2, "ticket");
                        f0 f0Var = this.f285525b;
                        f0Var.g().h().b0(f0Var.f.e(ticket2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        f1 params = (f1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        return this.f285525b.j(params.f285400a, params.f285401b, v30.t.DEFAULT);
                    case 3:
                        f1 param = (f1) obj2;
                        d1 ticket3 = (d1) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(ticket3, "ticket");
                        this.f285525b.f285386g.f("next_ticket_" + param.a() + "_" + param.b(), ticket3);
                        return Unit.f186387a;
                    case 4:
                        UUID chatId = (UUID) obj2;
                        z30.j tags = (z30.j) obj3;
                        Intrinsics.checkNotNullParameter(chatId, "chatId");
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        this.f285525b.f285386g.f("experience_ratings_for_" + chatId, tags);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String key = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        ufm.c cVar = new ufm.c(new to7.f(this.f285525b, key, 8), 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        return cVar;
                    case 6:
                        List chats = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats, "chats");
                        List list = chats;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj4 : list) {
                            v30.c0 c0VarI = ((v30.j) obj4).i();
                            Object arrayList = linkedHashMap.get(c0VarI);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(c0VarI, arrayList);
                            }
                            ((List) arrayList).add(obj4);
                        }
                        Iterator it8 = linkedHashMap.entrySet().iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            f0 f0Var2 = this.f285525b;
                            if (!zHasNext) {
                                Iterator it9 = list.iterator();
                                while (it9.hasNext()) {
                                    f0Var2.p((v30.j) it9.next());
                                }
                                return Unit.f186387a;
                            }
                            Map.Entry entry = (Map.Entry) it8.next();
                            f0Var2.f285386g.f(((v30.c0) entry.getKey()).d(), (List) entry.getValue());
                        }
                        break;
                    case 7:
                        String key2 = (String) obj2;
                        UUID uuid = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(uuid, "uuid");
                        this.f285525b.f285386g.f(key2, uuid);
                        return Unit.f186387a;
                    case 8:
                        String key3 = (String) obj2;
                        UUID messageId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(messageId, "messageId");
                        this.f285525b.f285387h.G(messageId, key3, wim.z.d(kotlin.jvm.internal.o0.b(UUID.class)));
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        UUID ticketId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
                        efm.d0<m20.d> availability = this.f285525b.f285384b.getAvailability(ticketId);
                        uz7.f fVar = new uz7.f(14, new v0k.g(21));
                        availability.getClass();
                        ufm.i iVar = new ufm.i(availability, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 10:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        od0.i params2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        f0 f0Var3 = this.f285525b;
                        return f0Var3.e(f0Var3.f285384b.getLastTicket((UUID) params2.f224257a), null);
                    case 11:
                        od0.i params3 = (od0.i) obj2;
                        v30.j chat = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(chat, "chat");
                        f0 f0Var4 = this.f285525b;
                        f0Var4.f285386g.f("key_memory_cache_last_chat" + params3.f224257a, chat);
                        f0Var4.p(chat);
                        return Unit.f186387a;
                    case 12:
                        v30.j chat2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((od0.i) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chat2, "chat");
                        f0 f0Var5 = this.f285525b;
                        f0Var5.g().h().b0(f0Var5.f.e(chat2));
                        return Unit.f186387a;
                    case 13:
                        List chats2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats2, "chats");
                        f0 f0Var6 = this.f285525b;
                        r10.d dVarH = f0Var6.g().h();
                        List list2 = chats2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(f0Var6.f.e((v30.j) it10.next()));
                        }
                        dVarH.a0(arrayList2);
                        return Unit.f186387a;
                    case 14:
                        List feeds = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeds, "feeds");
                        f0 f0Var7 = this.f285525b;
                        f0Var7.f285386g.f("key_memory_cache_feeds", feeds);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it11 = feeds.iterator();
                        while (it11.hasNext()) {
                            v30.j jVarB = ((v30.y) it11.next()).b();
                            if (jVarB != null) {
                                arrayList3.add(jVarB);
                            }
                        }
                        Iterator it12 = arrayList3.iterator();
                        while (it12.hasNext()) {
                            f0Var7.p((v30.j) it12.next());
                        }
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        m params4 = (m) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        f0 f0Var8 = this.f285525b;
                        TicketsInfoApi ticketsInfoApi = f0Var8.f285384b;
                        Instant instantNow = params4.f285468a;
                        if (instantNow == null) {
                            instantNow = Instant.now();
                        }
                        Intrinsics.h(instantNow);
                        return f0Var8.d(ticketsInfoApi.getResolvedTickets(instantNow, 20), null);
                    case 16:
                        m params5 = (m) obj2;
                        List chats3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(chats3, "chats");
                        Instant instant = params5.f285468a;
                        f0 f0Var9 = this.f285525b;
                        if (instant != null) {
                            f0Var9.o.d(instant, chats3);
                        } else {
                            f0Var9.f285386g.f("chats_history", chats3);
                        }
                        return Unit.f186387a;
                    case 17:
                        List chats4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((m) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats4, "chats");
                        f0 f0Var10 = this.f285525b;
                        r10.d dVarH2 = f0Var10.g().h();
                        List list3 = chats4;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it13 = list3.iterator();
                        while (it13.hasNext()) {
                            arrayList4.add(f0Var10.f.e((v30.j) it13.next()));
                        }
                        dVarH2.a0(arrayList4);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        v30.c0 feedType = (v30.c0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(feedType, "feedType");
                        f0 f0Var11 = this.f285525b;
                        return f0Var11.d(f0Var11.f285384b.getTicketList(zhm.u.c(feedType.c())), feedType);
                    case 19:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<g20.b> inbox = this.f285525b.f285384b.getInbox();
                        uz7.f fVar2 = new uz7.f(18, new v0k.g(24));
                        inbox.getClass();
                        ufm.i iVar2 = new ufm.i(inbox, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 20:
                        Integer num = (Integer) obj3;
                        num.intValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285386g.f("unread_count", num);
                        return Unit.f186387a;
                    case 21:
                        Integer num2 = (Integer) obj3;
                        num2.getClass();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285387h.G(num2, "unread_count", wim.z.d(kotlin.jvm.internal.o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it15 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it15, "it");
                        f0 f0Var12 = this.f285525b;
                        efm.d0<g20.a> clientInfo = f0Var12.f285384b.getClientInfo();
                        uz7.f fVar3 = new uz7.f(19, new v0k.g(f0Var12));
                        clientInfo.getClass();
                        ufm.i iVar3 = new ufm.i(clientInfo, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 23:
                        l clientInfo2 = (l) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(clientInfo2, "clientInfo");
                        this.f285525b.f285386g.f("clientInfo", clientInfo2);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        UUID id10 = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        f0 f0Var13 = this.f285525b;
                        return f0Var13.e(f0Var13.f285384b.getTicket(id10), null);
                }
            }
        }, new p(this, 5), new Function2(this) { // from class: v20.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f285525b;

            {
                this.f285525b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i106) {
                    case 0:
                        v30.j ticket = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "id");
                        Intrinsics.checkNotNullParameter(ticket, "ticket");
                        this.f285525b.p(ticket);
                        return Unit.f186387a;
                    case 1:
                        v30.j ticket2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(ticket2, "ticket");
                        f0 f0Var = this.f285525b;
                        f0Var.g().h().b0(f0Var.f.e(ticket2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        f1 params = (f1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        return this.f285525b.j(params.f285400a, params.f285401b, v30.t.DEFAULT);
                    case 3:
                        f1 param = (f1) obj2;
                        d1 ticket3 = (d1) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(ticket3, "ticket");
                        this.f285525b.f285386g.f("next_ticket_" + param.a() + "_" + param.b(), ticket3);
                        return Unit.f186387a;
                    case 4:
                        UUID chatId = (UUID) obj2;
                        z30.j tags = (z30.j) obj3;
                        Intrinsics.checkNotNullParameter(chatId, "chatId");
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        this.f285525b.f285386g.f("experience_ratings_for_" + chatId, tags);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String key = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        ufm.c cVar = new ufm.c(new to7.f(this.f285525b, key, 8), 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        return cVar;
                    case 6:
                        List chats = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats, "chats");
                        List list = chats;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj4 : list) {
                            v30.c0 c0VarI = ((v30.j) obj4).i();
                            Object arrayList = linkedHashMap.get(c0VarI);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(c0VarI, arrayList);
                            }
                            ((List) arrayList).add(obj4);
                        }
                        Iterator it8 = linkedHashMap.entrySet().iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            f0 f0Var2 = this.f285525b;
                            if (!zHasNext) {
                                Iterator it9 = list.iterator();
                                while (it9.hasNext()) {
                                    f0Var2.p((v30.j) it9.next());
                                }
                                return Unit.f186387a;
                            }
                            Map.Entry entry = (Map.Entry) it8.next();
                            f0Var2.f285386g.f(((v30.c0) entry.getKey()).d(), (List) entry.getValue());
                        }
                        break;
                    case 7:
                        String key2 = (String) obj2;
                        UUID uuid = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(uuid, "uuid");
                        this.f285525b.f285386g.f(key2, uuid);
                        return Unit.f186387a;
                    case 8:
                        String key3 = (String) obj2;
                        UUID messageId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(messageId, "messageId");
                        this.f285525b.f285387h.G(messageId, key3, wim.z.d(kotlin.jvm.internal.o0.b(UUID.class)));
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        UUID ticketId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
                        efm.d0<m20.d> availability = this.f285525b.f285384b.getAvailability(ticketId);
                        uz7.f fVar = new uz7.f(14, new v0k.g(21));
                        availability.getClass();
                        ufm.i iVar = new ufm.i(availability, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 10:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        od0.i params2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        f0 f0Var3 = this.f285525b;
                        return f0Var3.e(f0Var3.f285384b.getLastTicket((UUID) params2.f224257a), null);
                    case 11:
                        od0.i params3 = (od0.i) obj2;
                        v30.j chat = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(chat, "chat");
                        f0 f0Var4 = this.f285525b;
                        f0Var4.f285386g.f("key_memory_cache_last_chat" + params3.f224257a, chat);
                        f0Var4.p(chat);
                        return Unit.f186387a;
                    case 12:
                        v30.j chat2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((od0.i) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chat2, "chat");
                        f0 f0Var5 = this.f285525b;
                        f0Var5.g().h().b0(f0Var5.f.e(chat2));
                        return Unit.f186387a;
                    case 13:
                        List chats2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats2, "chats");
                        f0 f0Var6 = this.f285525b;
                        r10.d dVarH = f0Var6.g().h();
                        List list2 = chats2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(f0Var6.f.e((v30.j) it10.next()));
                        }
                        dVarH.a0(arrayList2);
                        return Unit.f186387a;
                    case 14:
                        List feeds = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeds, "feeds");
                        f0 f0Var7 = this.f285525b;
                        f0Var7.f285386g.f("key_memory_cache_feeds", feeds);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it11 = feeds.iterator();
                        while (it11.hasNext()) {
                            v30.j jVarB = ((v30.y) it11.next()).b();
                            if (jVarB != null) {
                                arrayList3.add(jVarB);
                            }
                        }
                        Iterator it12 = arrayList3.iterator();
                        while (it12.hasNext()) {
                            f0Var7.p((v30.j) it12.next());
                        }
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        m params4 = (m) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        f0 f0Var8 = this.f285525b;
                        TicketsInfoApi ticketsInfoApi = f0Var8.f285384b;
                        Instant instantNow = params4.f285468a;
                        if (instantNow == null) {
                            instantNow = Instant.now();
                        }
                        Intrinsics.h(instantNow);
                        return f0Var8.d(ticketsInfoApi.getResolvedTickets(instantNow, 20), null);
                    case 16:
                        m params5 = (m) obj2;
                        List chats3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(chats3, "chats");
                        Instant instant = params5.f285468a;
                        f0 f0Var9 = this.f285525b;
                        if (instant != null) {
                            f0Var9.o.d(instant, chats3);
                        } else {
                            f0Var9.f285386g.f("chats_history", chats3);
                        }
                        return Unit.f186387a;
                    case 17:
                        List chats4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((m) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats4, "chats");
                        f0 f0Var10 = this.f285525b;
                        r10.d dVarH2 = f0Var10.g().h();
                        List list3 = chats4;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it13 = list3.iterator();
                        while (it13.hasNext()) {
                            arrayList4.add(f0Var10.f.e((v30.j) it13.next()));
                        }
                        dVarH2.a0(arrayList4);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        v30.c0 feedType = (v30.c0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(feedType, "feedType");
                        f0 f0Var11 = this.f285525b;
                        return f0Var11.d(f0Var11.f285384b.getTicketList(zhm.u.c(feedType.c())), feedType);
                    case 19:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<g20.b> inbox = this.f285525b.f285384b.getInbox();
                        uz7.f fVar2 = new uz7.f(18, new v0k.g(24));
                        inbox.getClass();
                        ufm.i iVar2 = new ufm.i(inbox, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 20:
                        Integer num = (Integer) obj3;
                        num.intValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285386g.f("unread_count", num);
                        return Unit.f186387a;
                    case 21:
                        Integer num2 = (Integer) obj3;
                        num2.getClass();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285387h.G(num2, "unread_count", wim.z.d(kotlin.jvm.internal.o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it15 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it15, "it");
                        f0 f0Var12 = this.f285525b;
                        efm.d0<g20.a> clientInfo = f0Var12.f285384b.getClientInfo();
                        uz7.f fVar3 = new uz7.f(19, new v0k.g(f0Var12));
                        clientInfo.getClass();
                        ufm.i iVar3 = new ufm.i(clientInfo, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 23:
                        l clientInfo2 = (l) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(clientInfo2, "clientInfo");
                        this.f285525b.f285386g.f("clientInfo", clientInfo2);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        UUID id10 = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        f0 f0Var13 = this.f285525b;
                        return f0Var13.e(f0Var13.f285384b.getTicket(id10), null);
                }
            }
        }, null, new Function2(this) { // from class: v20.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f285525b;

            {
                this.f285525b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i107) {
                    case 0:
                        v30.j ticket = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "id");
                        Intrinsics.checkNotNullParameter(ticket, "ticket");
                        this.f285525b.p(ticket);
                        return Unit.f186387a;
                    case 1:
                        v30.j ticket2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(ticket2, "ticket");
                        f0 f0Var = this.f285525b;
                        f0Var.g().h().b0(f0Var.f.e(ticket2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        f1 params = (f1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        return this.f285525b.j(params.f285400a, params.f285401b, v30.t.DEFAULT);
                    case 3:
                        f1 param = (f1) obj2;
                        d1 ticket3 = (d1) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(ticket3, "ticket");
                        this.f285525b.f285386g.f("next_ticket_" + param.a() + "_" + param.b(), ticket3);
                        return Unit.f186387a;
                    case 4:
                        UUID chatId = (UUID) obj2;
                        z30.j tags = (z30.j) obj3;
                        Intrinsics.checkNotNullParameter(chatId, "chatId");
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        this.f285525b.f285386g.f("experience_ratings_for_" + chatId, tags);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String key = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        ufm.c cVar = new ufm.c(new to7.f(this.f285525b, key, 8), 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        return cVar;
                    case 6:
                        List chats = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats, "chats");
                        List list = chats;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj4 : list) {
                            v30.c0 c0VarI = ((v30.j) obj4).i();
                            Object arrayList = linkedHashMap.get(c0VarI);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(c0VarI, arrayList);
                            }
                            ((List) arrayList).add(obj4);
                        }
                        Iterator it8 = linkedHashMap.entrySet().iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            f0 f0Var2 = this.f285525b;
                            if (!zHasNext) {
                                Iterator it9 = list.iterator();
                                while (it9.hasNext()) {
                                    f0Var2.p((v30.j) it9.next());
                                }
                                return Unit.f186387a;
                            }
                            Map.Entry entry = (Map.Entry) it8.next();
                            f0Var2.f285386g.f(((v30.c0) entry.getKey()).d(), (List) entry.getValue());
                        }
                        break;
                    case 7:
                        String key2 = (String) obj2;
                        UUID uuid = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(uuid, "uuid");
                        this.f285525b.f285386g.f(key2, uuid);
                        return Unit.f186387a;
                    case 8:
                        String key3 = (String) obj2;
                        UUID messageId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(messageId, "messageId");
                        this.f285525b.f285387h.G(messageId, key3, wim.z.d(kotlin.jvm.internal.o0.b(UUID.class)));
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        UUID ticketId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
                        efm.d0<m20.d> availability = this.f285525b.f285384b.getAvailability(ticketId);
                        uz7.f fVar = new uz7.f(14, new v0k.g(21));
                        availability.getClass();
                        ufm.i iVar = new ufm.i(availability, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 10:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        od0.i params2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        f0 f0Var3 = this.f285525b;
                        return f0Var3.e(f0Var3.f285384b.getLastTicket((UUID) params2.f224257a), null);
                    case 11:
                        od0.i params3 = (od0.i) obj2;
                        v30.j chat = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(chat, "chat");
                        f0 f0Var4 = this.f285525b;
                        f0Var4.f285386g.f("key_memory_cache_last_chat" + params3.f224257a, chat);
                        f0Var4.p(chat);
                        return Unit.f186387a;
                    case 12:
                        v30.j chat2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((od0.i) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chat2, "chat");
                        f0 f0Var5 = this.f285525b;
                        f0Var5.g().h().b0(f0Var5.f.e(chat2));
                        return Unit.f186387a;
                    case 13:
                        List chats2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats2, "chats");
                        f0 f0Var6 = this.f285525b;
                        r10.d dVarH = f0Var6.g().h();
                        List list2 = chats2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(f0Var6.f.e((v30.j) it10.next()));
                        }
                        dVarH.a0(arrayList2);
                        return Unit.f186387a;
                    case 14:
                        List feeds = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeds, "feeds");
                        f0 f0Var7 = this.f285525b;
                        f0Var7.f285386g.f("key_memory_cache_feeds", feeds);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it11 = feeds.iterator();
                        while (it11.hasNext()) {
                            v30.j jVarB = ((v30.y) it11.next()).b();
                            if (jVarB != null) {
                                arrayList3.add(jVarB);
                            }
                        }
                        Iterator it12 = arrayList3.iterator();
                        while (it12.hasNext()) {
                            f0Var7.p((v30.j) it12.next());
                        }
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        m params4 = (m) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        f0 f0Var8 = this.f285525b;
                        TicketsInfoApi ticketsInfoApi = f0Var8.f285384b;
                        Instant instantNow = params4.f285468a;
                        if (instantNow == null) {
                            instantNow = Instant.now();
                        }
                        Intrinsics.h(instantNow);
                        return f0Var8.d(ticketsInfoApi.getResolvedTickets(instantNow, 20), null);
                    case 16:
                        m params5 = (m) obj2;
                        List chats3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(chats3, "chats");
                        Instant instant = params5.f285468a;
                        f0 f0Var9 = this.f285525b;
                        if (instant != null) {
                            f0Var9.o.d(instant, chats3);
                        } else {
                            f0Var9.f285386g.f("chats_history", chats3);
                        }
                        return Unit.f186387a;
                    case 17:
                        List chats4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((m) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats4, "chats");
                        f0 f0Var10 = this.f285525b;
                        r10.d dVarH2 = f0Var10.g().h();
                        List list3 = chats4;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it13 = list3.iterator();
                        while (it13.hasNext()) {
                            arrayList4.add(f0Var10.f.e((v30.j) it13.next()));
                        }
                        dVarH2.a0(arrayList4);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        v30.c0 feedType = (v30.c0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(feedType, "feedType");
                        f0 f0Var11 = this.f285525b;
                        return f0Var11.d(f0Var11.f285384b.getTicketList(zhm.u.c(feedType.c())), feedType);
                    case 19:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<g20.b> inbox = this.f285525b.f285384b.getInbox();
                        uz7.f fVar2 = new uz7.f(18, new v0k.g(24));
                        inbox.getClass();
                        ufm.i iVar2 = new ufm.i(inbox, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 20:
                        Integer num = (Integer) obj3;
                        num.intValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285386g.f("unread_count", num);
                        return Unit.f186387a;
                    case 21:
                        Integer num2 = (Integer) obj3;
                        num2.getClass();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285387h.G(num2, "unread_count", wim.z.d(kotlin.jvm.internal.o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it15 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it15, "it");
                        f0 f0Var12 = this.f285525b;
                        efm.d0<g20.a> clientInfo = f0Var12.f285384b.getClientInfo();
                        uz7.f fVar3 = new uz7.f(19, new v0k.g(f0Var12));
                        clientInfo.getClass();
                        ufm.i iVar3 = new ufm.i(clientInfo, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 23:
                        l clientInfo2 = (l) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(clientInfo2, "clientInfo");
                        this.f285525b.f285386g.f("clientInfo", clientInfo2);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        UUID id10 = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        f0 f0Var13 = this.f285525b;
                        return f0Var13.e(f0Var13.f285384b.getTicket(id10), null);
                }
            }
        }, null, new p(this, 7), null, 168);
        final int i108 = 14;
        this.z = new x4l.c(new th6.p(this, continuation, 13), new p(this, 8), new Function2(this) { // from class: v20.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f285525b;

            {
                this.f285525b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i108) {
                    case 0:
                        v30.j ticket = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "id");
                        Intrinsics.checkNotNullParameter(ticket, "ticket");
                        this.f285525b.p(ticket);
                        return Unit.f186387a;
                    case 1:
                        v30.j ticket2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(ticket2, "ticket");
                        f0 f0Var = this.f285525b;
                        f0Var.g().h().b0(f0Var.f.e(ticket2));
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        f1 params = (f1) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        return this.f285525b.j(params.f285400a, params.f285401b, v30.t.DEFAULT);
                    case 3:
                        f1 param = (f1) obj2;
                        d1 ticket3 = (d1) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(ticket3, "ticket");
                        this.f285525b.f285386g.f("next_ticket_" + param.a() + "_" + param.b(), ticket3);
                        return Unit.f186387a;
                    case 4:
                        UUID chatId = (UUID) obj2;
                        z30.j tags = (z30.j) obj3;
                        Intrinsics.checkNotNullParameter(chatId, "chatId");
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        this.f285525b.f285386g.f("experience_ratings_for_" + chatId, tags);
                        return Unit.f186387a;
                    case 5:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String key = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(key, "key");
                        ufm.c cVar = new ufm.c(new to7.f(this.f285525b, key, 8), 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        return cVar;
                    case 6:
                        List chats = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats, "chats");
                        List list = chats;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj4 : list) {
                            v30.c0 c0VarI = ((v30.j) obj4).i();
                            Object arrayList = linkedHashMap.get(c0VarI);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(c0VarI, arrayList);
                            }
                            ((List) arrayList).add(obj4);
                        }
                        Iterator it8 = linkedHashMap.entrySet().iterator();
                        while (true) {
                            boolean zHasNext = it8.hasNext();
                            f0 f0Var2 = this.f285525b;
                            if (!zHasNext) {
                                Iterator it9 = list.iterator();
                                while (it9.hasNext()) {
                                    f0Var2.p((v30.j) it9.next());
                                }
                                return Unit.f186387a;
                            }
                            Map.Entry entry = (Map.Entry) it8.next();
                            f0Var2.f285386g.f(((v30.c0) entry.getKey()).d(), (List) entry.getValue());
                        }
                        break;
                    case 7:
                        String key2 = (String) obj2;
                        UUID uuid = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key2, "key");
                        Intrinsics.checkNotNullParameter(uuid, "uuid");
                        this.f285525b.f285386g.f(key2, uuid);
                        return Unit.f186387a;
                    case 8:
                        String key3 = (String) obj2;
                        UUID messageId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(key3, "key");
                        Intrinsics.checkNotNullParameter(messageId, "messageId");
                        this.f285525b.f285387h.G(messageId, key3, wim.z.d(kotlin.jvm.internal.o0.b(UUID.class)));
                        return Unit.f186387a;
                    case 9:
                        w4l.f DataObservableDelegate3 = (w4l.f) obj2;
                        UUID ticketId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate3, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
                        efm.d0<m20.d> availability = this.f285525b.f285384b.getAvailability(ticketId);
                        uz7.f fVar = new uz7.f(14, new v0k.g(21));
                        availability.getClass();
                        ufm.i iVar = new ufm.i(availability, fVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 10:
                        w4l.f DataObservableDelegate4 = (w4l.f) obj2;
                        od0.i params2 = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate4, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params2, "params");
                        f0 f0Var3 = this.f285525b;
                        return f0Var3.e(f0Var3.f285384b.getLastTicket((UUID) params2.f224257a), null);
                    case 11:
                        od0.i params3 = (od0.i) obj2;
                        v30.j chat = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(chat, "chat");
                        f0 f0Var4 = this.f285525b;
                        f0Var4.f285386g.f("key_memory_cache_last_chat" + params3.f224257a, chat);
                        f0Var4.p(chat);
                        return Unit.f186387a;
                    case 12:
                        v30.j chat2 = (v30.j) obj3;
                        Intrinsics.checkNotNullParameter((od0.i) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chat2, "chat");
                        f0 f0Var5 = this.f285525b;
                        f0Var5.g().h().b0(f0Var5.f.e(chat2));
                        return Unit.f186387a;
                    case 13:
                        List chats2 = (List) obj3;
                        Intrinsics.checkNotNullParameter((v30.c0) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats2, "chats");
                        f0 f0Var6 = this.f285525b;
                        r10.d dVarH = f0Var6.g().h();
                        List list2 = chats2;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(f0Var6.f.e((v30.j) it10.next()));
                        }
                        dVarH.a0(arrayList2);
                        return Unit.f186387a;
                    case 14:
                        List feeds = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(feeds, "feeds");
                        f0 f0Var7 = this.f285525b;
                        f0Var7.f285386g.f("key_memory_cache_feeds", feeds);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it11 = feeds.iterator();
                        while (it11.hasNext()) {
                            v30.j jVarB = ((v30.y) it11.next()).b();
                            if (jVarB != null) {
                                arrayList3.add(jVarB);
                            }
                        }
                        Iterator it12 = arrayList3.iterator();
                        while (it12.hasNext()) {
                            f0Var7.p((v30.j) it12.next());
                        }
                        return Unit.f186387a;
                    case 15:
                        w4l.f DataObservableDelegate5 = (w4l.f) obj2;
                        m params4 = (m) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate5, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params4, "params");
                        f0 f0Var8 = this.f285525b;
                        TicketsInfoApi ticketsInfoApi = f0Var8.f285384b;
                        Instant instantNow = params4.f285468a;
                        if (instantNow == null) {
                            instantNow = Instant.now();
                        }
                        Intrinsics.h(instantNow);
                        return f0Var8.d(ticketsInfoApi.getResolvedTickets(instantNow, 20), null);
                    case 16:
                        m params5 = (m) obj2;
                        List chats3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(chats3, "chats");
                        Instant instant = params5.f285468a;
                        f0 f0Var9 = this.f285525b;
                        if (instant != null) {
                            f0Var9.o.d(instant, chats3);
                        } else {
                            f0Var9.f285386g.f("chats_history", chats3);
                        }
                        return Unit.f186387a;
                    case 17:
                        List chats4 = (List) obj3;
                        Intrinsics.checkNotNullParameter((m) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(chats4, "chats");
                        f0 f0Var10 = this.f285525b;
                        r10.d dVarH2 = f0Var10.g().h();
                        List list3 = chats4;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it13 = list3.iterator();
                        while (it13.hasNext()) {
                            arrayList4.add(f0Var10.f.e((v30.j) it13.next()));
                        }
                        dVarH2.a0(arrayList4);
                        return Unit.f186387a;
                    case 18:
                        w4l.f DataObservableDelegate6 = (w4l.f) obj2;
                        v30.c0 feedType = (v30.c0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate6, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(feedType, "feedType");
                        f0 f0Var11 = this.f285525b;
                        return f0Var11.d(f0Var11.f285384b.getTicketList(zhm.u.c(feedType.c())), feedType);
                    case 19:
                        w4l.f DataObservableDelegate7 = (w4l.f) obj2;
                        Unit it14 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate7, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it14, "it");
                        efm.d0<g20.b> inbox = this.f285525b.f285384b.getInbox();
                        uz7.f fVar2 = new uz7.f(18, new v0k.g(24));
                        inbox.getClass();
                        ufm.i iVar2 = new ufm.i(inbox, fVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 20:
                        Integer num = (Integer) obj3;
                        num.intValue();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285386g.f("unread_count", num);
                        return Unit.f186387a;
                    case 21:
                        Integer num2 = (Integer) obj3;
                        num2.getClass();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f285525b.f285387h.G(num2, "unread_count", wim.z.d(kotlin.jvm.internal.o0.b(Integer.TYPE)));
                        return Unit.f186387a;
                    case 22:
                        w4l.f DataObservableDelegate8 = (w4l.f) obj2;
                        Unit it15 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate8, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it15, "it");
                        f0 f0Var12 = this.f285525b;
                        efm.d0<g20.a> clientInfo = f0Var12.f285384b.getClientInfo();
                        uz7.f fVar3 = new uz7.f(19, new v0k.g(f0Var12));
                        clientInfo.getClass();
                        ufm.i iVar3 = new ufm.i(clientInfo, fVar3, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        return iVar3;
                    case 23:
                        l clientInfo2 = (l) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(clientInfo2, "clientInfo");
                        this.f285525b.f285386g.f("clientInfo", clientInfo2);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate9 = (w4l.f) obj2;
                        UUID id10 = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate9, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        f0 f0Var13 = this.f285525b;
                        return f0Var13.e(f0Var13.f285384b.getTicket(id10), null);
                }
            }
        }, new uvf.b(this, continuation, 10), new ska.c(this, continuation, 21));
    }

    public static ufm.f k(ufm.i iVar) {
        ufm.f fVar = new ufm.f(iVar, new uz7.f(26, new v0k.g(29)), 1);
        Intrinsics.checkNotNullExpressionValue(fVar, "doOnError(...)");
        return fVar;
    }

    public static Throwable l(Throwable th10) {
        return ((th10 instanceof HttpException) && ((HttpException) th10).code() == 409) ? new ChatRateException.UnableToCloseInitiatedByAgentTicket() : th10;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(1:(7:13|73|50|(5:52|(4:55|(2:57|81)(1:80)|60|53)|79|61|(1:63))|64|65|66)(2:14|15))(5:16|71|17|43|44))(1:21))(3:22|(1:25)|48)|75|26|(4:28|(4:31|(2:33|84)(1:83)|36|29)|82|37)|38|39|77|40|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c7, code lost:
    
        if (r0.archiveFeed(r14, r2) == r3) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e8 A[Catch: all -> 0x0116, TryCatch #1 {all -> 0x0116, blocks: (B:50:0x00e0, B:52:0x00e8, B:53:0x00fa, B:55:0x0100, B:57:0x0110, B:60:0x0118, B:61:0x011c, B:63:0x0122, B:64:0x0127), top: B:73:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.UUID r17, gim.c r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v20.f0.a(java.util.UUID, gim.c):java.lang.Object");
    }

    public final ufm.n b(final v30.p0 ticketMetadata, final v30.t chatSource, final boolean z, final UUID uuid, final ChatMessageToPass chatMessageToPass) {
        Intrinsics.checkNotNullParameter(ticketMetadata, "ticketMetadata");
        Intrinsics.checkNotNullParameter(chatSource, "chatSource");
        ufm.c cVar = new ufm.c(new Callable() { // from class: v20.y
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List list;
                m20.m mVar;
                m20.e eVar;
                ArrayList arrayList;
                ArrayList arrayList2;
                String str;
                m20.e eVar2;
                String str2;
                m20.k kVar;
                String str3;
                m20.r rVar;
                v30.p0 ticketMetadata2 = ticketMetadata;
                List list2 = ticketMetadata2.f285813b;
                Intrinsics.checkNotNullParameter(ticketMetadata2, "ticketMetadata");
                v30.t chatSource2 = chatSource;
                Intrinsics.checkNotNullParameter(chatSource2, "chatSource");
                v30.q0 q0Var = ticketMetadata2.f285814c;
                if (q0Var != null) {
                    if (q0Var instanceof v30.g) {
                        str3 = "AnonymousSession";
                        list = list2;
                        kVar = null;
                        eVar2 = null;
                    } else if (q0Var instanceof v30.h) {
                        m20.c cVar2 = new m20.c(((v30.h) q0Var).f285776b);
                        eVar2 = new m20.e("assistant");
                        list = list2;
                        kVar = cVar2;
                        str3 = "Ticket";
                    } else {
                        if (q0Var instanceof v30.v0) {
                            bef.a aVar = ((v30.v0) q0Var).f285829b;
                            if (aVar != null) {
                                y10.h.Companion.getClass();
                                String str4 = aVar.f14813a;
                                String str5 = aVar.f14814b;
                                String str6 = aVar.f14815c;
                                dj0.d dVar = aVar.d;
                                list = list2;
                                rVar = new m20.r(str4, null, str5, str6, dVar != null ? new mf0.a(dVar.f115082a, dVar.f115083b.f306286a) : null, aVar.e, aVar.f, aVar.f14816g, aVar.f14817h, aVar.i, aVar.f14818j, aVar.k, aVar.f14819l, aVar.f14820m, aVar.f14821n, aVar.o, aVar.f14822p, null, aVar.f14823q, aVar.f14824r, aVar.f14825s, aVar.f14826t, aVar.u, aVar.v, aVar.f14827w);
                            } else {
                                list = list2;
                                rVar = null;
                            }
                            str2 = "Transaction";
                            kVar = rVar;
                            eVar2 = null;
                        } else {
                            list = list2;
                            if (!(q0Var instanceof v30.i0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            v30.i0 i0Var = (v30.i0) q0Var;
                            m20.h hVar = new m20.h(i0Var.f285783b);
                            eVar2 = new m20.e(i0Var.f285784c);
                            str2 = "Feed";
                            kVar = hVar;
                        }
                        str3 = str2;
                    }
                    mVar = new m20.m(new m20.o(str3, q0Var.a()), kVar);
                    eVar = eVar2;
                } else {
                    list = list2;
                    mVar = null;
                    eVar = null;
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                UUID uuid2 = uuid;
                Boolean bool = uuid2 == null ? boolValueOf : null;
                List list3 = ticketMetadata2.f285812a;
                List list4 = list3;
                List list5 = (list4 == null || list4.isEmpty()) ? null : list3;
                if (list != null) {
                    List list6 = list;
                    arrayList = new ArrayList(zhm.w.t(list6, 10));
                    Iterator it8 = list6.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(((FaqMetaData) it8.next()).f51419a);
                    }
                } else {
                    arrayList = null;
                }
                if (list != null) {
                    List list7 = list;
                    arrayList2 = new ArrayList(zhm.w.t(list7, 10));
                    Iterator it9 = list7.iterator();
                    while (it9.hasNext()) {
                        arrayList2.add(((FaqMetaData) it9.next()).f51420b);
                    }
                } else {
                    arrayList2 = null;
                }
                String strA = chatSource2.a();
                ChatMessageToPass chatMessageToPass2 = chatMessageToPass;
                return this.f285605a.f285384b.openTicket(new m20.q(mVar, null, list5, arrayList, arrayList2, eVar, strA, bool, uuid2, chatMessageToPass2 != null ? chatMessageToPass2.d : null, (chatMessageToPass2 == null || (str = chatMessageToPass2.f51040a) == null) ? null : new m20.p(str), chatMessageToPass2 != null ? chatMessageToPass2.f51041b : null));
            }
        }, 0);
        Intrinsics.checkNotNullExpressionValue(cVar, "defer(...)");
        ufm.f fVar = new ufm.f(e(cVar, null), new t(new p(this, 18), 9), 3);
        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
        return te0.w.i0(fVar);
    }

    public final efm.d0 c(List list) {
        UUID uuidA;
        UUID uuidG;
        if (list.isEmpty()) {
            ufm.b bVarM = efm.d0.m(zhm.f0.f322471a);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<u10.f> list2 = list;
        for (u10.f fVar : list2) {
            u10.k kVarK = fVar.k();
            if (kVarK != null && (uuidG = kVarK.g()) != null) {
                linkedHashSet.add(uuidG);
            }
            u10.c cVarJ = fVar.j();
            if (cVarJ != null && (uuidA = cVarJ.getAgentId()) != null) {
                linkedHashSet.add(uuidA);
            }
        }
        if (!linkedHashSet.isEmpty()) {
            ufm.i iVar = new ufm.i(this.f285383a.b(linkedHashSet), new uz7.f(29, new uyh.k0(list, this, 11)), 1);
            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
            return iVar;
        }
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(this.f.d((u10.f) it8.next(), null, null));
        }
        ufm.b bVarM2 = efm.d0.m(arrayList);
        Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
        return bVarM2;
    }

    @Override // od0.e
    public final void clear() {
        this.f285387h.clear();
        this.f285386g.clear();
    }

    public final ufm.i d(efm.d0 d0Var, v30.c0 c0Var) {
        int i = 0;
        t tVar = new t(new r(this, c0Var, i), i);
        d0Var.getClass();
        ufm.i iVar = new ufm.i(d0Var, tVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final ufm.i e(efm.d0 d0Var, v30.c0 c0Var) {
        uz7.f fVar = new uz7.f(24, new v0k.g(27));
        d0Var.getClass();
        ufm.i iVar = new ufm.i(d0Var, fVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        ufm.i iVar2 = new ufm.i(d(iVar, c0Var), new uz7.f(25, new v0k.g(28)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return iVar2;
    }

    public final ChatDatabase g() {
        Object obj2 = this.f285385c.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        return (ChatDatabase) obj2;
    }

    public final v30.j h(v30.c0 feedType) {
        v30.y yVar;
        Object next;
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        List list = (List) this.f285386g.get("key_memory_cache_feeds");
        if (list != null) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (((v30.y) next).c() == feedType) {
                    break;
                }
            }
            yVar = (v30.y) next;
        } else {
            yVar = null;
        }
        v30.j jVarB = yVar != null ? yVar.b() : null;
        if (jVarB == null) {
            return null;
        }
        v30.j jVarI = i(jVarB.o());
        return jVarI == null ? jVarB : jVarI;
    }

    public final v30.j i(UUID uuid) {
        return (v30.j) this.f285386g.get("ticket_" + uuid);
    }

    public final ufm.n j(String str, v30.u0 u0Var, v30.t source) {
        Intrinsics.checkNotNullParameter(source, "source");
        efm.d0<m20.g> nextTicket = this.f285384b.getNextTicket(str, source.a(), u0Var != null ? u0Var.b() : null);
        uz7.f fVar = new uz7.f(17, new ux7.i(this.f));
        nextTicket.getClass();
        ufm.i iVar = new ufm.i(nextTicket, fVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return te0.w.i0(iVar);
    }

    public final vkm.f m(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return vkm.q.m(new uvf.b((Object) loadingStrategy, (Object) this, false, (Continuation) null, 11));
    }

    public final efm.r n(UUID uuid, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        efm.r rVarA0 = te0.w.a0(this.e.a(false), new be7.l(26, uuid));
        Object value = this.f285397w.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        efm.b bVarSwitchMapCompletable = o(rVarA0, te0.w.a0((efm.r) value, new be7.l(27, uuid))).switchMapCompletable(new t(new uyh.k0(this, uuid, 12), 2));
        od0.i.Companion.getClass();
        efm.r rVarMergeWith = this.f285399y.e(od0.h.a(uuid), loadingStrategy).mergeWith(bVarSwitchMapCompletable);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        return rVarMergeWith;
    }

    public final efm.r o(efm.r rVar, efm.r rVar2) {
        Object value = this.f285398x.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        efm.r rVarMerge = efm.r.merge(efm.r.merge(rVar, ((efm.r) value).switchMap(new uz7.f(20, new pbi.h(rVar2, 5)))).debounce(500L, TimeUnit.MILLISECONDS), this.v);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        return rVarMerge;
    }

    public final void p(v30.j jVar) {
        this.f285386g.f("ticket_" + jVar.o(), jVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (nim.a.a(r6, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.util.UUID r6, com.revolut.chat.domain.model.rate.RateChatExperienceData r7, gim.c r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof v20.e0
            if (r0 == 0) goto L13
            r0 = r8
            v20.e0 r0 = (v20.e0) r0
            int r1 = r0.f285370x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f285370x = r1
            goto L18
        L13:
            v20.e0 r0 = new v20.e0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f285370x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L2a
            goto L66
        L2a:
            r6 = move-exception
            goto L69
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.util.UUID r6 = r0.u
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L2a
            goto L4e
        L3a:
            yhm.o.b(r8)
            com.revolut.chat.data.network.TicketsInfoApi r8 = r5.f285384b     // Catch: java.lang.Exception -> L2a
            k20.b r7 = md6.s.z(r7)     // Catch: java.lang.Exception -> L2a
            r0.u = r6     // Catch: java.lang.Exception -> L2a
            r0.f285370x = r4     // Catch: java.lang.Exception -> L2a
            java.lang.Object r7 = r8.rateTicketExperience(r6, r7, r0)     // Catch: java.lang.Exception -> L2a
            if (r7 != r1) goto L4e
            goto L65
        L4e:
            java.lang.String r7 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)     // Catch: java.lang.Exception -> L2a
            w4l.f r7 = r5.f285394r     // Catch: java.lang.Exception -> L2a
            r8 = 0
            efm.b r6 = r7.g(r6, r8)     // Catch: java.lang.Exception -> L2a
            r7 = 0
            r0.u = r7     // Catch: java.lang.Exception -> L2a
            r0.f285370x = r3     // Catch: java.lang.Exception -> L2a
            java.lang.Object r6 = nim.a.a(r6, r0)     // Catch: java.lang.Exception -> L2a
            if (r6 != r1) goto L66
        L65:
            return r1
        L66:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L69:
            java.lang.Throwable r6 = l(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v20.f0.q(java.util.UUID, com.revolut.chat.domain.model.rate.RateChatExperienceData, gim.c):java.lang.Object");
    }

    public final void r(UUID uuid, v30.j jVar) {
        this.f285394r.k(uuid, jVar);
        v30.j jVar2 = (v30.j) this.f285386g.get(prk.o.r(jVar.h(), "key_memory_cache_last_chat"));
        if (Intrinsics.f(jVar2 != null ? jVar2.o() : null, uuid)) {
            od0.h hVar = od0.i.Companion;
            UUID uuidH = jVar.h();
            hVar.getClass();
            this.f285399y.k(od0.h.a(uuidH), jVar);
        }
    }
}
