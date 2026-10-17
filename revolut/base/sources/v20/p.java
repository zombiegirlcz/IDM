package v20;

import androidx.room.RoomDatabase;
import androidx.room.RxRoom;
import com.revolut.chat.domain.model.ResolveTicketError;
import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.joda.time.Instant;
import retrofit2.HttpException;
import retrofit2.Response;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f285514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f285515b;

    public /* synthetic */ p(f0 f0Var, int i) {
        this.f285514a = i;
        this.f285515b = f0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        efm.k kVarCreateMaybe;
        List list;
        Response<?> response;
        ResponseBody responseBodyErrorBody;
        int i = this.f285514a;
        int i2 = 22;
        int i3 = 13;
        int i5 = 0;
        f0 f0Var = this.f285515b;
        switch (i) {
            case 0:
                v30.c0 params = (v30.c0) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (List) f0Var.f285386g.get(params.d());
            case 1:
                UUID id10 = (UUID) obj2;
                Intrinsics.checkNotNullParameter(id10, "id");
                efm.d0 d0VarJ = f0Var.g().h().J(id10);
                uz7.f fVar = new uz7.f(12, new p(f0Var, 6));
                d0VarJ.getClass();
                ufm.i iVar = new ufm.i(new ufm.i(d0VarJ, fVar, 0), new uz7.f(i3, new v0k.g(19)), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return ue0.e.I(iVar, zhm.h0.f322473a, new v0k.g(20));
            case 2:
                f1 param = (f1) obj2;
                Intrinsics.checkNotNullParameter(param, "param");
                return (d1) f0Var.f285386g.get("next_ticket_" + param.a() + "_" + param.b());
            case 3:
                UUID chatId = (UUID) obj2;
                Intrinsics.checkNotNullParameter(chatId, "chatId");
                return (z30.j) f0Var.f285386g.get("experience_ratings_for_" + chatId);
            case 4:
                String key = (String) obj2;
                Intrinsics.checkNotNullParameter(key, "key");
                return (UUID) f0Var.f285386g.get(key);
            case 5:
                od0.i params2 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                return (v30.j) f0Var.f285386g.get("key_memory_cache_last_chat" + params2.f224257a);
            case 6:
                u10.f entity = (u10.f) obj2;
                Intrinsics.checkNotNullParameter(entity, "entity");
                return f0Var.c(zhm.u.c(entity));
            case 7:
                od0.i params3 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(params3, "params");
                UUID uuid = (UUID) params3.f224257a;
                if (uuid != null) {
                    r10.d dVarH = f0Var.g().h();
                    kVarCreateMaybe = RxRoom.createMaybe((RoomDatabase) dVarH.f250818a, true, false, new be7.l(dVarH, uuid, 10));
                } else {
                    r10.d dVarH2 = f0Var.g().h();
                    kVarCreateMaybe = RxRoom.createMaybe((RoomDatabase) dVarH2.f250818a, true, false, new r10.c(dVarH2, v30.c0.SUPPORT, i5));
                }
                uz7.f fVar2 = new uz7.f(15, new p(f0Var, 12));
                kVarCreateMaybe.getClass();
                rfm.f0 f0VarP = new rfm.m(kVarCreateMaybe, fVar2, 0).p(new Data(null, null, false, 6, null));
                Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                return ue0.e.I(f0VarP, zhm.h0.f322473a, new v0k.g(i2));
            case 8:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                return (List) f0Var.f285386g.get("key_memory_cache_feeds");
            case 9:
                v30.c0 params4 = (v30.c0) obj2;
                Intrinsics.checkNotNullParameter(params4, "params");
                r10.d dVarH3 = f0Var.g().h();
                Instant instantNow = Instant.now();
                Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
                efm.d0 d0VarM = dVarH3.M(instantNow);
                t tVar = new t(new r(f0Var, params4, 2), 5);
                d0VarM.getClass();
                ufm.i iVar2 = new ufm.i(new ufm.i(new ufm.i(d0VarM, tVar, 1), new t(new p(f0Var, 19), 13), 0), new uz7.f(11, new s(6)), 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                return f0.k(iVar2);
            case 10:
                m params5 = (m) obj2;
                Intrinsics.checkNotNullParameter(params5, "params");
                Instant instant = params5.f285468a;
                return (instant == null || (list = (List) f0Var.o.c(instant)) == null) ? (List) f0Var.f285386g.get("chats_history") : list;
            case 11:
                m params6 = (m) obj2;
                Intrinsics.checkNotNullParameter(params6, "params");
                r10.d dVarH4 = f0Var.g().h();
                Instant instantNow2 = params6.f285468a;
                if (instantNow2 == null) {
                    instantNow2 = Instant.now();
                }
                Intrinsics.h(instantNow2);
                efm.d0 d0VarM2 = dVarH4.M(instantNow2);
                uz7.f fVar3 = new uz7.f(21, new p(f0Var, i3));
                d0VarM2.getClass();
                ufm.i iVar3 = new ufm.i(new ufm.i(new ufm.i(d0VarM2, fVar3, 1), new uz7.f(i2, new p(f0Var, 14)), 0), new uz7.f(23, new v0k.g(26)), 1);
                Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                return f0.k(iVar3);
            case 12:
                u10.f entity2 = (u10.f) obj2;
                Intrinsics.checkNotNullParameter(entity2, "entity");
                return new ufm.i(f0Var.c(zhm.u.c(entity2)), new uz7.f(28, new s(i5)), 1).w();
            case 13:
                List entities = (List) obj2;
                Intrinsics.checkNotNullParameter(entities, "entities");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : entities) {
                    u10.f fVar4 = (u10.f) obj3;
                    if (!hx7.l.b(fVar4) && fVar4.f276273p == (!f0Var.d.b()) && fVar4.f276275r == v30.c0.SUPPORT) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 14:
                List filteredEntities = (List) obj2;
                Intrinsics.checkNotNullParameter(filteredEntities, "filteredEntities");
                return f0Var.c(filteredEntities);
            case 15:
                Throwable httpException = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(httpException, "throwable");
                y10.h hVar = f0Var.f;
                Intrinsics.checkNotNullParameter(httpException, "httpException");
                ResolveTicketError resolveTicketError = null;
                if ((httpException instanceof HttpException) && (response = ((HttpException) httpException).response()) != null && (responseBodyErrorBody = response.errorBody()) != null) {
                    try {
                        m20.j jVar = (m20.j) hVar.d.c(responseBodyErrorBody.string(), m20.j.class);
                        resolveTicketError = new ResolveTicketError(jVar.getCategory(), jVar.getCode(), jVar.getMessage());
                    } catch (Exception unused) {
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.b(rd0.c.WARNING, "CommonChatDataMapper", v1.c.u("Can't parse exception: ", httpException), null, null, 16);
                    }
                }
                if (resolveTicketError != null) {
                    httpException = resolveTicketError;
                }
                ufm.c cVarL = efm.d0.l(httpException);
                Intrinsics.checkNotNullExpressionValue(cVarL, "error(...)");
                return cVarL;
            case 16:
                v30.j jVar2 = (v30.j) obj2;
                r10.d dVarH5 = f0Var.g().h();
                y10.h hVar2 = f0Var.f;
                Intrinsics.h(jVar2);
                dVarH5.b0(hVar2.e(jVar2));
                f0Var.p(jVar2);
                return Unit.f186387a;
            case 17:
                u10.f entity3 = (u10.f) obj2;
                Intrinsics.checkNotNullParameter(entity3, "entity");
                return f0Var.c(zhm.u.c(entity3));
            case 18:
                v30.j jVar3 = (v30.j) obj2;
                w4l.f fVar5 = f0Var.f285399y;
                od0.h hVar3 = od0.i.Companion;
                UUID uuid2 = jVar3.f285786b;
                hVar3.getClass();
                fVar5.j(od0.h.a(uuid2), jVar3);
                return Unit.f186387a;
            case 19:
                List filteredEntities2 = (List) obj2;
                Intrinsics.checkNotNullParameter(filteredEntities2, "filteredEntities");
                return f0Var.c(filteredEntities2);
            case 20:
                v30.j jVar4 = (v30.j) obj2;
                w4l.f fVar6 = f0Var.f285399y;
                od0.h hVar4 = od0.i.Companion;
                UUID uuid3 = jVar4.f285786b;
                hVar4.getClass();
                fVar6.j(od0.h.a(uuid3), jVar4);
                return Unit.f186387a;
            case 21:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                f0Var.getClass();
                pfm.n nVarN = efm.b.n(f0.l(it8));
                Intrinsics.checkNotNullExpressionValue(nVarN, "error(...)");
                return nVarN;
            case 22:
                v30.j jVar5 = (v30.j) obj2;
                r10.d dVarH6 = f0Var.g().h();
                y10.h hVar5 = f0Var.f;
                Intrinsics.h(jVar5);
                dVarH6.b0(hVar5.e(jVar5));
                f0Var.p(jVar5);
                return Unit.f186387a;
            case 23:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return (Integer) f0Var.f285386g.get("unread_count");
            case 24:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                return (Integer) j6.a.k(Integer.TYPE, f0Var.f285387h, "unread_count");
            case 25:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return (l) f0Var.f285386g.get("clientInfo");
            default:
                UUID id11 = (UUID) obj2;
                Intrinsics.checkNotNullParameter(id11, "id");
                return f0Var.i(id11);
        }
    }
}
