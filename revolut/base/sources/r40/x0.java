package r40;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.chat.domain.model.ChatListFilter;
import com.revolut.chat.ui.chatlist.ChatListContract$InputData;
import com.revolut.data.model.Data;
import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreenAction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import r40.b;
import skm.a2;
import vkm.z1;

/* JADX INFO: loaded from: classes19.dex */
public final class x0 extends jki.g implements c {

    @NotNull
    public static final o0 Companion = new o0();
    public final q A;
    public final ifm.b B;
    public final z1 C;
    public final Lazy D;
    public a2 E;
    public volatile Boolean F;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ChatListContract$InputData f251376p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n30.n f251377q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t40.a f251378r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final use.d f251379s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final w50.k f251380t;
    public final ep6.n u;
    public final m30.g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y9l.a f251381w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final tf3.b f251382x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a f251383y;
    public final v z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(ChatListContract$InputData inputData, n30.n chatInteractor, t40.a chatListFilterInteractor, use.d ticketsInteractor, w50.k chatTranscriptPresentationDelegate, ep6.n feedbackExtension, m30.g activeTicketsInteractor, y9l.a actionControllerExtension, tf3.b authorisationStatus, jki.p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(chatInteractor, "chatInteractor");
        Intrinsics.checkNotNullParameter(chatListFilterInteractor, "chatListFilterInteractor");
        Intrinsics.checkNotNullParameter(ticketsInteractor, "ticketsInteractor");
        Intrinsics.checkNotNullParameter(chatTranscriptPresentationDelegate, "chatTranscriptPresentationDelegate");
        Intrinsics.checkNotNullParameter(feedbackExtension, "feedbackExtension");
        Intrinsics.checkNotNullParameter(activeTicketsInteractor, "activeTicketsInteractor");
        Intrinsics.checkNotNullParameter(actionControllerExtension, "actionControllerExtension");
        Intrinsics.checkNotNullParameter(authorisationStatus, "authorisationStatus");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f251376p = inputData;
        this.f251377q = chatInteractor;
        this.f251378r = chatListFilterInteractor;
        this.f251379s = ticketsInteractor;
        this.f251380t = chatTranscriptPresentationDelegate;
        this.u = feedbackExtension;
        this.v = activeTicketsInteractor;
        this.f251381w = actionControllerExtension;
        this.f251382x = authorisationStatus;
        this.f251383y = new a(new h(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), !(inputData.d instanceof ChatListFilter.Tickets), false), false, inputData.f51141b != null ? e.f251331a : null, null, null, zhm.r0.g());
        this.z = new v();
        this.A = new q();
        this.B = new ifm.b();
        this.C = ta6.a.a(0);
        this.D = yhm.j.b(new m0(this, 0));
    }

    public static final Data y2(x0 x0Var, Data data, u40.d dVar) {
        ArrayList arrayList;
        List list = (List) data.getContent();
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(zhm.w.t(list2, 10));
            for (Object obj2 : list2) {
                if (Intrinsics.f(((u40.d) obj2).a(), dVar.a())) {
                    obj2 = dVar;
                }
                arrayList.add(obj2);
            }
        } else {
            arrayList = null;
        }
        return Data.copy$default(data, arrayList, null, false, 6, null);
    }

    public final void A2(Object obj2) {
        FincrimeHomeScreenAction fincrimeHomeScreenAction = obj2 instanceof FincrimeHomeScreenAction ? (FincrimeHomeScreenAction) obj2 : null;
        if (fincrimeHomeScreenAction == null) {
            return;
        }
        this.f251381w.Z2(fincrimeHomeScreenAction);
    }

    public final void B2(String str) {
        if (Intrinsics.f(((a) t2()).d, str)) {
            x2(new r2d.d(27));
            return;
        }
        x2(new n0(str, 0));
        l2(new qd8.e((Object) this, (Object) str, false, (Continuation) null, 23), new yi5.b(26));
        z2(str);
    }

    public final void C2(Object obj2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "LIST_ID_NEW_CHAT")) {
            v2(new b.C1386b(null, null, this.f251376p.f, 3));
            return;
        }
        if (obj2 instanceof l) {
            UUID uuid = ((l) obj2).f251345a;
            v2(new b.C1386b(uuid, uuid, null, 4));
            return;
        }
        if (!(obj2 instanceof k)) {
            if (obj2 instanceof pse.a) {
                B2(((pse.a) obj2).f239483a);
                return;
            }
            return;
        }
        k kVar = (k) obj2;
        i iVar = kVar.f;
        if (iVar == null) {
            iVar = kVar.f251341c;
            if (iVar == i.NONE) {
                iVar = null;
            }
            if (iVar == null) {
                iVar = kVar.d;
            }
        }
        switch (p0.f251360a[iVar.ordinal()]) {
            case 1:
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                UUID uuid2 = kVar.f251339a.f294102a;
                v2(new b.C1386b(uuid2, uuid2, null, 4));
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void D2(List newList) {
        List list = (List) ((a) t2()).f251319a.f251337b.getContent();
        this.A.getClass();
        Intrinsics.checkNotNullParameter(newList, "newList");
        if (list != null) {
            ArrayList arrayListF1 = zhm.d0.f1(list);
            List<u40.d> list2 = newList;
            for (u40.d dVar : list2) {
                ListIterator listIterator = arrayListF1.listIterator();
                while (listIterator.hasNext()) {
                    Object next = listIterator.next();
                    if (Intrinsics.f(((u40.d) next).a(), dVar.a())) {
                        next = dVar;
                    }
                    listIterator.set(next);
                }
            }
            newList = zhm.d0.d1(zhm.d0.i1(zhm.d0.E0(list2, arrayListF1)));
        }
        ChatListFilter chatListFilter = this.f251376p.d;
        this.f251378r.getClass();
        x2(new q2j.j(zhm.d0.P0(t40.a.a(newList, chatListFilter), new w0()), 21));
    }

    public final void E2(String str) {
        Continuation continuation;
        Object next;
        Collection collection = (List) ((a) t2()).f251319a.f251336a.getContent();
        if (collection == null) {
            collection = zhm.f0.f322471a;
        }
        Collection collection2 = collection;
        Iterable iterable = (List) ((a) t2()).f251319a.f251337b.getContent();
        if (iterable == null) {
            iterable = zhm.f0.f322471a;
        }
        Iterator it8 = zhm.d0.E0(iterable, collection2).iterator();
        while (true) {
            continuation = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (Intrinsics.f(((u40.d) next).a(), str)) {
                    break;
                }
            }
        }
        u40.c cVar = next instanceof u40.c ? (u40.c) next : null;
        if (cVar == null) {
            return;
        }
        yji.l.a1(this, nim.a.v(this.f251379s.a(str), new r38.m(cVar, 4)), null, null, new qqj.g(this, str, continuation, 2), 3);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, new vkm.t0(this.f251381w.b3(), 1), null, null, new q9c.v(2, this, x0.class, "reloadTicket", "reloadTicket(Ljava/lang/String;)V", 4, 10), 3);
        if (((a) t2()).f251320b) {
            return;
        }
        x2(new r2d.d(28));
        UUID uuid = this.f251376p.f51140a;
        if (uuid != null) {
            n2(new t0(this, uuid, null), new whi.b(6));
        }
    }

    @Override // yji.l
    public final void O1() {
        this.B.d();
    }

    @Override // yji.l
    public final void T1(long j2) {
        efm.r rVarE;
        efm.r rVarE2;
        Continuation continuation = null;
        yji.l.b1(this, t1.d(this.C, 100L), null, new s0(this, continuation, 2), 3);
        n30.n nVar = this.f251377q;
        v30.t source = this.f251376p.e;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(source, "source");
        ufm.i iVar = new ufm.i(((v20.f0) nVar.f211647a).j(null, v30.u0.Chat, source), new r25.c(28, new r2d.d(21)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        efm.r rVarX = new ufm.f(ue0.e.F(iVar, Boolean.FALSE), new r25.c(29, new l0(this, 1)), 3).x();
        Boolean bool = this.F;
        if (bool != null) {
            rVarX = rVarX.startWith(bool);
        }
        Intrinsics.h(rVarX);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        efm.r rVarPublish = rVarX.publish(new ogm.i(new fjm.j(10)));
        Intrinsics.checkNotNullExpressionValue(rVarPublish, "publish(...)");
        if (this.f251376p.d instanceof ChatListFilter.Tickets) {
            rVarE = efm.r.just(zhm.f0.f322471a);
            Intrinsics.h(rVarE);
        } else {
            n30.n nVar2 = this.f251377q;
            v20.o oVar = nVar2.f211647a;
            efm.r rVarW = nim.a.w(v20.o.L(oVar), new n30.b(nVar2, 1));
            zhm.h0 h0Var = zhm.h0.f322473a;
            efm.r rVarP = ue0.e.p(rVarW, h0Var);
            zhm.f0 f0Var = zhm.f0.f322471a;
            rVarE = ue0.e.E(m70.a.h(nim.a.w(kli.a.h(zi0.c.G(rVarP, f0Var), zi0.c.G(ue0.e.p(nim.a.w(((v20.f0) oVar).f285392p.f(new v20.m(null), true), new n30.b(nVar2, 2)), h0Var), f0Var)), new n1j.t(20)), new qk2.h(12), null, new qz9.u(21), 2), f0Var);
        }
        use.d dVar = this.f251379s;
        w4l.h loadingStrategy = w4l.h.f294642c;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        qse.i iVar2 = dVar.f282891a;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        efm.r rVarFilter = iVar2.f.e(Unit.f186387a, loadingStrategy).filter(new qsa.a(9, new qsa.p(5)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filterEmptyData(...)");
        Flow flowE = boh.f.e(rd0.e.b(rVarFilter), new l0(this, 3));
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
        efm.r rVarG = m70.a.g(rd0.e.c(flowE, gVar), null, new qz9.u(22), 1);
        zhm.f0 f0Var2 = zhm.f0.f322471a;
        efm.r rVarE3 = ue0.e.E(rVarG, f0Var2);
        if (this.f251376p.d instanceof ChatListFilter.Tickets) {
            rVarE2 = efm.r.just(f0Var2);
            Intrinsics.h(rVarE2);
        } else {
            rVarE2 = ue0.e.E(rd0.e.c(mo3.a.h(this.v.b(), new qk2.h(13), new qz9.u(23), 2), gVar), f0Var2);
        }
        yji.l.b1(this, vkm.q.q(rd0.e.b(te0.w.n(rVarPublish, rVarE, rVarE3, rVarE2))), new r0e.c(this, continuation, 6), new s0(this, continuation, 1), 2);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f251383y;
    }

    @Override // jki.g
    public final kki.a s2() {
        return this.z;
    }

    public final void z2(String str) {
        a2 a2Var = this.E;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.E = yji.l.b1(this, new ahe.i(new vkm.y(new qp7.g(this, str, continuation, 28), this.u.F1()), 13), null, new s0(this, continuation, 0), 3);
    }
}
