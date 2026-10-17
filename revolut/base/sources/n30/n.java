package n30;

import com.revolut.chat.data.network.MetaInfoApi;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import k50.n2;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import v30.u0;

/* JADX INFO: loaded from: classes.dex */
public final class n implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v20.o f211647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MetaInfoApi f211648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lfm.c f211649c;
    public final d4m.a d;
    public final j30.c e;

    public n(v20.o chatRepository, MetaInfoApi metaInfoApi, lfm.c disposableContainer, d4m.a transactionAttributesProvider, j30.c chatFeatureToggles) {
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(metaInfoApi, "metaInfoApi");
        Intrinsics.checkNotNullParameter(disposableContainer, "disposableContainer");
        Intrinsics.checkNotNullParameter(transactionAttributesProvider, "transactionAttributesProvider");
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        this.f211647a = chatRepository;
        this.f211648b = metaInfoApi;
        this.f211649c = disposableContainer;
        this.d = transactionAttributesProvider;
        this.e = chatFeatureToggles;
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (zhm.v.k(u0.Chat, u0.Mass).contains(((v30.j) obj2).q())) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public final Object a(UUID ticketId, gim.c cVar) {
        v20.f0 f0Var = (v20.f0) this.f211647a;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        pfm.t tVarL = f0Var.f285384b.dismissTicket(ticketId).l(new v20.u(f0Var, 0));
        Intrinsics.checkNotNullExpressionValue(tVarL, "doOnComplete(...)");
        Object objA = nim.a.a(te0.w.g0(tVarL), cVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    public final efm.d0 c(UUID agentId, v30.j jVar) {
        v20.f0 f0Var = (v20.f0) this.f211647a;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        return m70.a.g(nim.a.w(f0Var.f285383a.c(agentId, false), new n2(this, jVar)), null, new n0c.v(18), 1).firstOrError();
    }

    public final efm.d0 d(UUID agentId) {
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        v20.f0 f0Var = (v20.f0) this.f211647a;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        return f0Var.f285383a.a(agentId);
    }

    public final efm.k e(boolean z, v30.c0 c0Var) {
        efm.k kVarFirstElement = te0.w.a0(mo3.a.n(rd0.e.c(((v20.f0) this.f211647a).m(z ? w4l.i.f294643c : w4l.h.f294642c), kotlin.coroutines.g.f186406a)), new l3d.f(z, c0Var, 9)).firstElement();
        Intrinsics.checkNotNullExpressionValue(kVarFirstElement, "firstElement(...)");
        return kVarFirstElement;
    }

    public final ufm.n f(UUID chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        v20.f0 f0Var = (v20.f0) this.f211647a;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        int i = 2;
        ufm.c cVar = new ufm.c(new v20.v(f0Var, chatId, i), 0);
        Intrinsics.checkNotNullExpressionValue(cVar, "defer(...)");
        int i2 = 3;
        ufm.f fVar = new ufm.f(f0Var.e(cVar, null), new v20.t(new v20.p(f0Var, 16), i2), i2);
        v20.s sVar = new v20.s(i2);
        int i3 = 4;
        ufm.i iVar = new ufm.i(fVar, new v20.t(sVar, i3), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        v20.s sVar2 = new v20.s(i3);
        zhm.h0 h0Var = zhm.h0.f322473a;
        pfm.z zVarI = ue0.e.I(iVar, h0Var, sVar2);
        efm.d0 d0VarJ = f0Var.g().h().J(chatId);
        v20.t tVar = new v20.t(new v20.p(f0Var, 17), 6);
        d0VarJ.getClass();
        ufm.i iVar2 = new ufm.i(new ufm.i(d0VarJ, tVar, 0), new v20.t(new v20.s(5), 7), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        efm.h0[] h0VarArr = {zVarI, ue0.e.I(v20.f0.k(iVar2), h0Var, new v20.s(i))};
        int i5 = efm.i.f125385a;
        qfm.l lVarH = efm.d0.h(new qfm.c(h0VarArr, 1));
        Intrinsics.checkNotNullExpressionValue(lVarH, "concat(...)");
        qfm.f0 f0Var2 = new qfm.f0(zi0.c.r(lVarH), null);
        Intrinsics.checkNotNullExpressionValue(f0Var2, "firstOrError(...)");
        return te0.w.i0(f0Var2);
    }

    public final pfm.r g(UUID chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        v20.f0 f0Var = (v20.f0) this.f211647a;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        pfm.h hVar = new pfm.h(new v20.v(f0Var, chatId, 1), 1);
        Intrinsics.checkNotNullExpressionValue(hVar, "defer(...)");
        return te0.w.g0(hVar);
    }

    public final efm.r h(UUID id10, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "chatId");
        v20.f0 f0Var = (v20.f0) this.f211647a;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        return f0Var.f285394r.f(id10, z);
    }

    public final jhi.k i(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.u(new mx5.g(this, null, 15), ((v20.f0) this.f211647a).m(loadingStrategy));
    }

    public final pfm.h j(UUID id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        v20.f0 f0Var = (v20.f0) this.f211647a;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        pfm.h hVar = new pfm.h(ue0.e.D(te0.w.i0(f0Var.e(f0Var.f285384b.resolveTicket(id10), null)), new v20.p(f0Var, 15)), 4);
        Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
        return hVar;
    }

    public final pfm.r k(String actionId, String str, UUID chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        v20.f0 f0Var = (v20.f0) this.f211647a;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        return te0.w.g0(f0Var.f285384b.submitTicketSuggestedAction(chatId, new d20.a(actionId, str)));
    }
}
