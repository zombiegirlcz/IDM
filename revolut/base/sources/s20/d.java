package s20;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.chat.data.db.ChatDatabase;
import com.revolut.chat.data.network.TicketsInfoApi;
import com.revolut.chat.data.repository.chat.AgentInfo;
import com.revolut.chat.domain.model.AgentPresenceState;
import efm.d0;
import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import org.joda.time.Instant;
import org.joda.time.Period;
import rnb.u;
import s08.g;
import ufm.i;
import v30.e;
import w4l.f;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y10.b f259238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TicketsInfoApi f259239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d4m.a f259240c;
    public final j d;
    public final f e;

    public d(y10.b agentInfoMapper, TicketsInfoApi ticketInfoApi, d4m.a chatDatabaseLazy, j memoryCache) {
        Intrinsics.checkNotNullParameter(agentInfoMapper, "agentInfoMapper");
        Intrinsics.checkNotNullParameter(ticketInfoApi, "ticketInfoApi");
        Intrinsics.checkNotNullParameter(chatDatabaseLazy, "chatDatabaseLazy");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f259238a = agentInfoMapper;
        this.f259239b = ticketInfoApi;
        this.f259240c = chatDatabaseLazy;
        this.d = memoryCache;
        final int i = 1;
        Function2 function2 = new Function2(this) { // from class: s20.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f259234b;

            {
                this.f259234b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Period period;
                UUID uuid;
                ArrayList arrayList;
                e eVar;
                switch (i) {
                    case 0:
                        AgentInfo domain = (AgentInfo) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "agentInfo");
                        Object obj4 = this.f259234b.f259240c.get();
                        Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                        r10.a aVarG = ((ChatDatabase) obj4).g();
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        UUID uuid2 = domain.f50997a;
                        AgentPresenceState agentPresenceState = domain.f51009s;
                        String str = domain.f50998b;
                        String str2 = domain.f50999c;
                        String str3 = domain.f;
                        Float f = domain.i;
                        Long l2 = domain.f51002j;
                        Instant instant = domain.k;
                        Period period2 = domain.f51003l;
                        Period period3 = domain.f51004m;
                        Integer num = domain.f51005n;
                        Integer num2 = domain.o;
                        Period period4 = domain.f51006p;
                        List list = domain.f51007q;
                        if (list != null) {
                            List list2 = list;
                            period = period3;
                            uuid = uuid2;
                            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                            for (Iterator it8 = list2.iterator(); it8.hasNext(); it8 = it8) {
                                AgentInfo.Compliment compliment = (AgentInfo.Compliment) it8.next();
                                arrayList2.add(new u10.a(compliment.f51010a, compliment.f51011b, compliment.f51012c, compliment.d, compliment.e));
                            }
                            arrayList = arrayList2;
                        } else {
                            period = period3;
                            uuid = uuid2;
                            arrayList = null;
                        }
                        u10.b bVar = new u10.b(uuid, str, str2, str3, domain.f51000g, domain.f51001h, domain.e, f, l2, instant, period2, period, num, num2, period4, arrayList, domain.d, (agentPresenceState == null || (eVar = agentPresenceState.f51026a) == null) ? null : eVar.b(), agentPresenceState != null ? agentPresenceState.f51027b : null);
                        aVarG.getClass();
                        DBUtil.performBlocking((RoomDatabase) aVarG.f250811a, false, true, new qpb.a(aVarG, bVar, 29));
                        return Unit.f186387a;
                    case 1:
                        f DataObservableDelegate = (f) obj2;
                        UUID agentId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(agentId, "agentId");
                        d dVar = this.f259234b;
                        d0<m20.a> agent = dVar.f259239b.getAgent(agentId);
                        g gVar = new g(13, new u(1, dVar.f259238a, y10.a.class, "fromDto", "fromDto(Lcom/revolut/chat/data/network/model/ticket/AgentInfoDto;)Lcom/revolut/chat/data/repository/chat/AgentInfo;", 0, 17));
                        agent.getClass();
                        i iVar = new i(agent, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        UUID agentId2 = (UUID) obj2;
                        AgentInfo agentInfo = (AgentInfo) obj3;
                        Intrinsics.checkNotNullParameter(agentId2, "agentId");
                        Intrinsics.checkNotNullParameter(agentInfo, "agentInfo");
                        j jVar = this.f259234b.d;
                        String string = agentId2.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        jVar.f(string, agentInfo);
                        return Unit.f186387a;
                }
            }
        };
        b bVar = new b(this, i);
        final int i2 = 2;
        Function2 function22 = new Function2(this) { // from class: s20.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f259234b;

            {
                this.f259234b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Period period;
                UUID uuid;
                ArrayList arrayList;
                e eVar;
                switch (i2) {
                    case 0:
                        AgentInfo domain = (AgentInfo) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "agentInfo");
                        Object obj4 = this.f259234b.f259240c.get();
                        Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                        r10.a aVarG = ((ChatDatabase) obj4).g();
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        UUID uuid2 = domain.f50997a;
                        AgentPresenceState agentPresenceState = domain.f51009s;
                        String str = domain.f50998b;
                        String str2 = domain.f50999c;
                        String str3 = domain.f;
                        Float f = domain.i;
                        Long l2 = domain.f51002j;
                        Instant instant = domain.k;
                        Period period2 = domain.f51003l;
                        Period period3 = domain.f51004m;
                        Integer num = domain.f51005n;
                        Integer num2 = domain.o;
                        Period period4 = domain.f51006p;
                        List list = domain.f51007q;
                        if (list != null) {
                            List list2 = list;
                            period = period3;
                            uuid = uuid2;
                            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                            for (Iterator it8 = list2.iterator(); it8.hasNext(); it8 = it8) {
                                AgentInfo.Compliment compliment = (AgentInfo.Compliment) it8.next();
                                arrayList2.add(new u10.a(compliment.f51010a, compliment.f51011b, compliment.f51012c, compliment.d, compliment.e));
                            }
                            arrayList = arrayList2;
                        } else {
                            period = period3;
                            uuid = uuid2;
                            arrayList = null;
                        }
                        u10.b bVar2 = new u10.b(uuid, str, str2, str3, domain.f51000g, domain.f51001h, domain.e, f, l2, instant, period2, period, num, num2, period4, arrayList, domain.d, (agentPresenceState == null || (eVar = agentPresenceState.f51026a) == null) ? null : eVar.b(), agentPresenceState != null ? agentPresenceState.f51027b : null);
                        aVarG.getClass();
                        DBUtil.performBlocking((RoomDatabase) aVarG.f250811a, false, true, new qpb.a(aVarG, bVar2, 29));
                        return Unit.f186387a;
                    case 1:
                        f DataObservableDelegate = (f) obj2;
                        UUID agentId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(agentId, "agentId");
                        d dVar = this.f259234b;
                        d0<m20.a> agent = dVar.f259239b.getAgent(agentId);
                        g gVar = new g(13, new u(1, dVar.f259238a, y10.a.class, "fromDto", "fromDto(Lcom/revolut/chat/data/network/model/ticket/AgentInfoDto;)Lcom/revolut/chat/data/repository/chat/AgentInfo;", 0, 17));
                        agent.getClass();
                        i iVar = new i(agent, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        UUID agentId2 = (UUID) obj2;
                        AgentInfo agentInfo = (AgentInfo) obj3;
                        Intrinsics.checkNotNullParameter(agentId2, "agentId");
                        Intrinsics.checkNotNullParameter(agentInfo, "agentInfo");
                        j jVar = this.f259234b.d;
                        String string = agentId2.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        jVar.f(string, agentInfo);
                        return Unit.f186387a;
                }
            }
        };
        b bVar2 = new b(this, i2);
        final int i3 = 0;
        this.e = new f(function2, bVar, function22, bVar2, new Function2(this) { // from class: s20.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f259234b;

            {
                this.f259234b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Period period;
                UUID uuid;
                ArrayList arrayList;
                e eVar;
                switch (i3) {
                    case 0:
                        AgentInfo domain = (AgentInfo) obj3;
                        Intrinsics.checkNotNullParameter((UUID) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "agentInfo");
                        Object obj4 = this.f259234b.f259240c.get();
                        Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                        r10.a aVarG = ((ChatDatabase) obj4).g();
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        UUID uuid2 = domain.f50997a;
                        AgentPresenceState agentPresenceState = domain.f51009s;
                        String str = domain.f50998b;
                        String str2 = domain.f50999c;
                        String str3 = domain.f;
                        Float f = domain.i;
                        Long l2 = domain.f51002j;
                        Instant instant = domain.k;
                        Period period2 = domain.f51003l;
                        Period period3 = domain.f51004m;
                        Integer num = domain.f51005n;
                        Integer num2 = domain.o;
                        Period period4 = domain.f51006p;
                        List list = domain.f51007q;
                        if (list != null) {
                            List list2 = list;
                            period = period3;
                            uuid = uuid2;
                            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                            for (Iterator it8 = list2.iterator(); it8.hasNext(); it8 = it8) {
                                AgentInfo.Compliment compliment = (AgentInfo.Compliment) it8.next();
                                arrayList2.add(new u10.a(compliment.f51010a, compliment.f51011b, compliment.f51012c, compliment.d, compliment.e));
                            }
                            arrayList = arrayList2;
                        } else {
                            period = period3;
                            uuid = uuid2;
                            arrayList = null;
                        }
                        u10.b bVar22 = new u10.b(uuid, str, str2, str3, domain.f51000g, domain.f51001h, domain.e, f, l2, instant, period2, period, num, num2, period4, arrayList, domain.d, (agentPresenceState == null || (eVar = agentPresenceState.f51026a) == null) ? null : eVar.b(), agentPresenceState != null ? agentPresenceState.f51027b : null);
                        aVarG.getClass();
                        DBUtil.performBlocking((RoomDatabase) aVarG.f250811a, false, true, new qpb.a(aVarG, bVar22, 29));
                        return Unit.f186387a;
                    case 1:
                        f DataObservableDelegate = (f) obj2;
                        UUID agentId = (UUID) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(agentId, "agentId");
                        d dVar = this.f259234b;
                        d0<m20.a> agent = dVar.f259239b.getAgent(agentId);
                        g gVar = new g(13, new u(1, dVar.f259238a, y10.a.class, "fromDto", "fromDto(Lcom/revolut/chat/data/network/model/ticket/AgentInfoDto;)Lcom/revolut/chat/data/repository/chat/AgentInfo;", 0, 17));
                        agent.getClass();
                        i iVar = new i(agent, gVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        UUID agentId2 = (UUID) obj2;
                        AgentInfo agentInfo = (AgentInfo) obj3;
                        Intrinsics.checkNotNullParameter(agentId2, "agentId");
                        Intrinsics.checkNotNullParameter(agentInfo, "agentInfo");
                        j jVar = this.f259234b.d;
                        String string = agentId2.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        jVar.f(string, agentInfo);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public final d0 a(UUID agentId) {
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        d0 d0VarFirstOrError = m70.a.g(c(agentId, false), null, new c(0), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public final d0 b(Set agentIds) {
        Intrinsics.checkNotNullParameter(agentIds, "agentIds");
        if (agentIds.isEmpty()) {
            ufm.b bVarM = d0.m(r0.g());
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        d0 list = r.fromIterable(agentIds).flatMapMaybe(new g(14, new b(this, 0))).toList();
        g gVar = new g(15, new s1c.a(10));
        list.getClass();
        i iVar = new i(list, gVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final r c(UUID agentId, boolean z) {
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        return this.e.f(agentId, z);
    }
}
