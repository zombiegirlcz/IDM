package y10;

import com.revolut.chat.data.repository.chat.AgentInfo;
import com.revolut.chat.data.repository.chat.ChatAgent;
import com.revolut.chat.data.repository.chat.ChatRating;
import com.revolut.chat.data.repository.chat.EmptyAuthor;
import com.revolut.chat.data.repository.chat.MessageAuthor;
import com.revolut.chat.data.repository.chat.User;
import com.revolut.chat.domain.model.LastMessage;
import com.revolut.chat.domain.model.call.Call;
import com.revolut.chat.domain.model.call.CallAgentInfo;
import com.revolut.chat.domain.model.call.LastCallRequest;
import i20.b0;
import i20.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import k50.x;
import kg.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;
import org.joda.time.Period;
import org.joda.time.ReadableInstant;
import p20.b;
import u10.p;
import u10.r;
import v20.i1;
import v20.j0;
import v20.j1;
import v20.m2;
import v20.n;
import v20.n2;
import v20.o2;
import v20.q2;
import v20.r2;
import v20.v0;
import v30.o0;
import v30.s0;
import v30.u0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
public final class h implements e {

    @NotNull
    public static final f Companion = new f();
    public static final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f310263j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a20.a f310264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f310265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f310266c;
    public final o d;
    public final v0 e;
    public final f01.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f310267g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b9k.f f310268h;

    static {
        Pair pair = new Pair("poor", v30.k.POOR);
        v30.k kVar = v30.k.GREAT;
        i = r0.k(pair, new Pair("great", kVar), new Pair("ok", kVar), new Pair("wow", v30.k.WOW), new Pair("postponed", v30.k.POSTPONED));
        f310263j = r0.k(new Pair("client", v20.h.CLIENT), new Pair("agent", v20.h.AGENT));
    }

    public h(a20.a authHeadersProvider, c callMapper, x chatMessageTextMapper, o gson, v0 imageRepository, f01.a resources, l structuredMessageMapper, b9k.f widgetRegistry) {
        Intrinsics.checkNotNullParameter(authHeadersProvider, "authHeadersProvider");
        Intrinsics.checkNotNullParameter(callMapper, "callMapper");
        Intrinsics.checkNotNullParameter(chatMessageTextMapper, "chatMessageTextMapper");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(imageRepository, "imageRepository");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(structuredMessageMapper, "structuredMessageMapper");
        Intrinsics.checkNotNullParameter(widgetRegistry, "widgetRegistry");
        this.f310264a = authHeadersProvider;
        this.f310265b = callMapper;
        this.f310266c = chatMessageTextMapper;
        this.d = gson;
        this.e = imageRepository;
        this.f = resources;
        this.f310267g = structuredMessageMapper;
        this.f310268h = widgetRegistry;
    }

    public static Pair a(h hVar, UUID uuid) {
        String strA = hVar.e.a(uuid);
        return new Pair(strA, strA != null ? hVar.f310264a.a(strA) : null);
    }

    public static Instant b(v30.j jVar) {
        Instant instantT;
        Instant e;
        Instant time;
        if (jVar != null) {
            switch (g.f310262a[jVar.p().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    Instant instantT2 = jVar.t();
                    LastMessage lastMessageM = jVar.m();
                    if (lastMessageM != null && (time = lastMessageM.getTime()) != null && time.compareTo((ReadableInstant) instantT2) > 0) {
                        instantT2 = time;
                    }
                    Call callK = jVar.k();
                    if (callK != null) {
                        Instant f51085g = callK.getF51085g();
                        if (f51085g != null && f51085g.compareTo((ReadableInstant) instantT2) > 0) {
                            instantT2 = f51085g;
                        }
                        Instant f = callK.getF();
                        if (f != null && f.compareTo((ReadableInstant) instantT2) > 0) {
                            instantT2 = f;
                        }
                        Instant e2 = callK.getE();
                        if (e2.compareTo((ReadableInstant) instantT2) > 0) {
                            instantT2 = e2;
                        }
                    }
                    LastCallRequest lastCallRequestL = jVar.l();
                    if (lastCallRequestL != null && (e = lastCallRequestL.getE()) != null && e.compareTo((ReadableInstant) instantT2) > 0) {
                        instantT2 = e;
                    }
                    instantT = instantT2;
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    instantT = jVar.t();
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            if (instantT != null) {
                return instantT;
            }
        }
        Instant EPOCH = Instant.EPOCH;
        Intrinsics.checkNotNullExpressionValue(EPOCH, "EPOCH");
        return EPOCH;
    }

    public static /* synthetic */ n k(h hVar, b0 b0Var, Map map, UUID uuid, Instant instant, int i2) {
        if ((i2 & 4) != 0) {
            uuid = null;
        }
        if ((i2 & 8) != 0) {
            instant = null;
        }
        return hVar.j(b0Var, map, uuid, instant, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final v30.j c(m20.n r49, java.util.Map r50, boolean r51, v30.c0 r52) {
        /*
            Method dump skipped, instruction units count: 1170
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y10.h.c(m20.n, java.util.Map, boolean, v30.c0):v30.j");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d6 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final v30.j d(u10.f r44, com.revolut.chat.data.repository.chat.AgentInfo r45, com.revolut.chat.data.repository.chat.AgentInfo r46) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y10.h.d(u10.f, com.revolut.chat.data.repository.chat.AgentInfo, com.revolut.chat.data.repository.chat.AgentInfo):v30.j");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final u10.f e(v30.j chat) {
        UUID uuid;
        String str;
        p pVar;
        UUID uuid2;
        u10.c cVar;
        u10.k kVar;
        Intrinsics.checkNotNullParameter(chat, "chat");
        UUID uuidO = chat.o();
        int iS = chat.s();
        UUID uuidJ = chat.j();
        LastMessage lastMessageM = chat.m();
        o oVar = this.d;
        String strL = lastMessageM != null ? oVar.l(lastMessageM, LastMessage.class) : null;
        String strR = chat.r();
        s0 s0VarP = chat.p();
        String strL2 = oVar.l(chat.b(), MessageAuthor.class);
        Intrinsics.checkNotNullExpressionValue(strL2, "toJson(...)");
        Instant instantE = chat.e();
        Instant instantT = chat.t();
        Instant instantF = chat.f();
        Instant instantG = chat.g();
        Boolean boolX = chat.x();
        boolean zY = chat.y();
        boolean zW = chat.w();
        boolean zV = chat.v();
        boolean zU = chat.u();
        u0 u0VarQ = chat.q();
        ChatRating chatRatingN = chat.n();
        String str2 = strL;
        if (chatRatingN instanceof ChatRating.NotRated) {
            uuid = uuidO;
            str = null;
            pVar = null;
        } else if (chatRatingN instanceof ChatRating.Postponed) {
            pVar = new p("Postponed", null, null);
            uuid = uuidO;
            str = null;
        } else if (chatRatingN instanceof ChatRating.Rated) {
            ChatRating.Rated rated = (ChatRating.Rated) chatRatingN;
            uuid = uuidO;
            pVar = new p(rated.getF51020a(), rated.getF51021b(), rated.getF51022c());
            str = null;
        } else {
            uuid = uuidO;
            if (!(chatRatingN instanceof ChatRating.Experience)) {
                throw new NoWhenBranchMatchedException();
            }
            str = null;
            pVar = new p(((ChatRating.Experience) chatRatingN).getF51017a(), null, null);
        }
        o0 o0VarD = chat.d();
        Object rVar = o0VarD != null ? new r(o0VarD.b(), o0VarD.a()) : str;
        Call call = chat.k();
        if (call != null) {
            Intrinsics.checkNotNullParameter(call, "call");
            UUID f51082a = call.getF51082a();
            String f51083b = call.getF51083b();
            w30.e f51084c = call.getF51084c();
            String key = f51084c != null ? f51084c.getKey() : str;
            CallAgentInfo d = call.getD();
            UUID f51088a = d != null ? d.getF51088a() : str;
            Instant e = call.getE();
            Instant f = call.getF();
            Instant f51085g = call.getF51085g();
            String key2 = call.getF51086h().getKey();
            String key3 = call.getI().getKey();
            w30.d f51087j = call.getF51087j();
            String key4 = f51087j != null ? f51087j.getKey() : str;
            uuid2 = uuid;
            cVar = new u10.c(f51082a, f51083b, key, f51088a, e, f, f51085g, key2, key3, key4, call.getK());
        } else {
            String str3 = str;
            uuid2 = uuid;
            cVar = str3;
        }
        LastCallRequest callRequest = chat.l();
        if (callRequest != null) {
            Intrinsics.checkNotNullParameter(callRequest, "callRequest");
            UUID f51091a = callRequest.getF51091a();
            String strB = callRequest.getF51092b().b();
            Instant d5 = callRequest.getD();
            CallAgentInfo f4 = callRequest.getF();
            kVar = new u10.k(f51091a, strB, d5, f4 != null ? f4.getF51088a() : null, callRequest.getE(), callRequest.getF51094g(), callRequest.getF51095h(), callRequest.getI().getKey(), callRequest.getF51096j().b());
        } else {
            kVar = null;
        }
        return new u10.f(uuid2, iS, uuidJ, str2, strR, s0VarP, instantE, instantT, instantF, instantG, boolX, strL2, zY, zW, zV, zU, u0VarQ, chat.i(), pVar, rVar, cVar, kVar, chat.h());
    }

    public final n f(b0 message, Map agents, b0 b0Var) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(agents, "agents");
        return j(message, agents, null, null, b0Var);
    }

    public final n g(p20.b wsEvent, Map agents) {
        UUID uuidRandomUUID;
        Period periodSeconds;
        Instant instantNow;
        UUID agentId;
        Intrinsics.checkNotNullParameter(wsEvent, "wsEvent");
        Intrinsics.checkNotNullParameter(agents, "agents");
        if (wsEvent instanceof b.j) {
            b.j jVar = (b.j) wsEvent;
            b.j.C1289b data = jVar.getData();
            if (data == null || (uuidRandomUUID = data.getTicketId()) == null) {
                uuidRandomUUID = UUID.randomUUID();
            }
            UUID uuid = uuidRandomUUID;
            Intrinsics.h(uuid);
            b.j.C1289b data2 = jVar.getData();
            if (data2 == null || (periodSeconds = data2.getDuration()) == null) {
                periodSeconds = Period.seconds(10);
            }
            Period period = periodSeconds;
            Intrinsics.h(period);
            b.j.C1289b data3 = jVar.getData();
            MessageAuthor bot = (data3 == null || (agentId = data3.getAgentId()) == null) ? EmptyAuthor.f51023a : Intrinsics.f(jVar.getData().getIsBot(), Boolean.TRUE) ? new ChatAgent.Bot(agentId) : new ChatAgent.Live(agentId, null, null, null, null);
            b.j.C1289b data4 = jVar.getData();
            if (data4 == null || (instantNow = data4.getEventTime()) == null) {
                instantNow = Instant.now();
            }
            Instant instant = instantNow;
            Intrinsics.h(instant);
            b.j.C1289b data5 = jVar.getData();
            UUID previousMessageId = data5 != null ? data5.getPreviousMessageId() : null;
            b.j.C1289b data6 = jVar.getData();
            return new r2(uuid, bot, instant, period, previousMessageId, data6 != null ? data6.getEventTime() : null, 458);
        }
        if (wsEvent instanceof b.e) {
            b.e eVar = (b.e) wsEvent;
            if (eVar.getData().getMessage().getPayload() instanceof x0) {
                return null;
            }
            return f(eVar.getData().getMessage(), agents, eVar.getData().getReplyTo());
        }
        if (!(wsEvent instanceof b.h)) {
            if ((wsEvent instanceof b.d) || (wsEvent instanceof b.g) || (wsEvent instanceof b.a) || (wsEvent instanceof b.c) || (wsEvent instanceof b.C1281b) || (wsEvent instanceof b.i) || (wsEvent instanceof b.k)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        b.h hVar = (b.h) wsEvent;
        UUID id10 = hVar.getId();
        if (id10 == null) {
            id10 = UUID.randomUUID();
        }
        UUID uuid2 = id10;
        Intrinsics.h(uuid2);
        UUID ticketId = hVar.getData().getTicketId();
        Instant timestamp = hVar.getData().getTimestamp();
        ChatAgent.Bot bot2 = new ChatAgent.Bot(hVar.getData().getAgentId());
        Instant timestamp2 = hVar.getData().getTimestamp();
        UUID previousMessageId2 = hVar.getData().getPreviousMessageId();
        long millis = hVar.getData().getDuration().toStandardDuration().getMillis();
        List thoughts = hVar.getData().getThoughts();
        ArrayList arrayList = new ArrayList(w.t(thoughts, 10));
        for (Iterator it8 = thoughts.iterator(); it8.hasNext(); it8 = it8) {
            b.h.c cVar = (b.h.c) it8.next();
            arrayList.add(new j1(cVar.getText(), cVar.getDuration().toStandardDuration().getMillis()));
        }
        return new i1(ticketId, uuid2, timestamp, bot2, timestamp2, previousMessageId2, arrayList, millis);
    }

    public final n h(u10.h message) {
        Intrinsics.checkNotNullParameter(message, "message");
        n nVar = (n) this.d.c(message.d(), n.class);
        boolean z = nVar instanceof j0;
        x xVar = this.f310266c;
        if (z) {
            j0 j0Var = (j0) nVar;
            j0Var.getWidget().c(this.f310268h.w(j0Var.getWidget().b(), j0Var.getWidget().a(), j0Var.getId()));
            j0Var.r(xVar);
        } else if (nVar instanceof o2) {
            ((o2) nVar).s(xVar);
        } else if (nVar instanceof m2) {
            ((m2) nVar).r(xVar);
        } else if (nVar instanceof n2) {
            ((n2) nVar).t(xVar);
        } else {
            Unit unit = Unit.f186387a;
        }
        Intrinsics.h(nVar);
        return nVar;
    }

    public final u10.h i(n message) {
        Intrinsics.checkNotNullParameter(message, "message");
        UUID id10 = message.getId();
        Instant time = message.getTime();
        UUID ticketId = message.getTicketId();
        String strL = this.d.l(message, n.class);
        Intrinsics.checkNotNullExpressionValue(strL, "toJson(...)");
        return new u10.h(id10, time, ticketId, strL, message.getFeedType(), message.getTicketCreatedAt(), message.getFeedId(), message.getServerId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:302:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x06aa  */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final v20.n j(i20.b0 r32, java.util.Map r33, java.util.UUID r34, org.joda.time.Instant r35, i20.b0 r36) {
        /*
            Method dump skipped, instruction units count: 2906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y10.h.j(i20.b0, java.util.Map, java.util.UUID, org.joda.time.Instant, i20.b0):v20.n");
    }

    public final u10.i l(n message) {
        String str;
        Intrinsics.checkNotNullParameter(message, "message");
        if (message instanceof v20.s0) {
            str = "upload";
        } else {
            if (!(message instanceof v20.c)) {
                return null;
            }
            str = "bulkUpload";
        }
        String str2 = str;
        u10.h hVarI = i(message);
        return new u10.i(hVarI.g(), hVarI.c(), hVarI.b(), hVarI.d(), hVarI.f(), hVarI.i(), hVarI.e(), hVarI.h(), str2);
    }

    public final ChatAgent m(AgentInfo agentInfo) {
        Intrinsics.checkNotNullParameter(agentInfo, "agentInfo");
        return agentInfo.getD() ? new ChatAgent.Bot(agentInfo.getF50997a()) : new ChatAgent.Live(agentInfo.getF50997a(), agentInfo.getF50998b(), agentInfo.getE(), agentInfo.getF(), agentInfo.getF51000g());
    }

    public final MessageAuthor n(boolean z, i20.b bVar, AgentInfo agentInfo) {
        if (z) {
            return User.f51024a;
        }
        if (bVar == null) {
            return EmptyAuthor.f51023a;
        }
        if (agentInfo != null && Intrinsics.f(bVar.getId(), agentInfo.getF50997a())) {
            return m(agentInfo);
        }
        UUID id10 = bVar.getId();
        return Intrinsics.f(bVar.getIsBot(), Boolean.TRUE) ? new ChatAgent.Bot(id10) : new ChatAgent.Live(id10, bVar.getName(), null, null, null);
    }

    public final q2 o(String str) {
        if (str == null) {
            return null;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 982065527) {
            if (iHashCode != 1002405936) {
                if (iHashCode == 1270065833 && str.equals("Available")) {
                    return q2.AVAILABLE;
                }
            } else if (str.equals("Unavailable")) {
                return q2.UNAVAILABLE;
            }
        } else if (str.equals("Pending")) {
            return q2.PENDING;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.WARNING, "CommonChatDataMapperImpl", "Unknown transcript state: ".concat(str), null, null, 16);
        return null;
    }
}
