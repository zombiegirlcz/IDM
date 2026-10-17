package tyd;

import efm.d0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oyd.q;
import q06.k;
import rfm.f0;
import ryd.w;
import sri.m;
import tx0.p4;
import ux7.i;
import uyd.z;
import wp5.y;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements jf0.d, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f275564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zxd.c f275565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0e.b f275566c;

    public h(m navigator, zxd.c statementsInteractor, n0e.b statementsNaviCommandFactory) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(statementsNaviCommandFactory, "statementsNaviCommandFactory");
        this.f275564a = navigator;
        this.f275565b = statementsInteractor;
        this.f275566c = statementsNaviCommandFactory;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "transaction-confirmation");
    }

    public final efm.k b(jf0.c cVar) {
        String groupId = cVar.e(2);
        if (groupId.length() == 0) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("transactionId cannot be empty!");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
            rfm.h hVar = rfm.h.f253943a;
            Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
            return hVar;
        }
        w wVar = (w) this.f275565b;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        uyd.h0 h0Var2 = (uyd.h0) wVar.f258357a;
        h0Var2.getClass();
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        d0<q> transactionConfirmation = h0Var2.f284188a.getTransactionConfirmation(groupId, true);
        z zVar = new z(7, new i(1, h0Var2.f284189b, syd.a.class, "toDomain", "toDomain(Lcom/revolut/feature/statements/impl/dto/StatementUrlStateDto;)Lcom/revolut/feature/statements/api/models/StatementUrlState;", 0, 7));
        transactionConfirmation.getClass();
        ufm.i iVar = new ufm.i(transactionConfirmation, zVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        ufm.i iVar2 = new ufm.i(te0.w.i0(iVar), new rxb.f(22, new rxb.b(23)), 1);
        ryd.q qVar = ryd.q.f;
        ufm.i iVar3 = new ufm.i(iVar2, new q2j.k(25), 1);
        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
        efm.k kVarW = new ufm.i(mra.d.K(iVar3, 1000L, new ru5.m(26)), new ty1.c(new cia.d(1, this.f275566c, vxd.d.class, "openPdfUrl", "openPdfUrl(Ljava/lang/String;Lcom/revolut/core/ui_kit/models/Clause;)Lcom/revolut/retail/core/navigation/NaviCommand;", 0, 8), 18), 1).w();
        Intrinsics.checkNotNullExpressionValue(kVarW, "toMaybe(...)");
        return kVarW;
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        rfm.m mVar = new rfm.m(b(cVar), new ty1.c(new tx.f(25), 19), 1);
        Intrinsics.checkNotNullExpressionValue(mVar, "map(...)");
        return nim.a.i(ue0.e.x(mVar), continuation);
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        rfm.m mVar = new rfm.m(b(deeplink), new ty1.c(new p4(this, 6), 17), 1);
        Boolean bool = Boolean.FALSE;
        rfm.z zVarE = mVar.e(bool);
        Intrinsics.checkNotNullExpressionValue(zVarE, "defaultIfEmpty(...)");
        f0 f0VarO = ue0.e.G(zVarE, bool).o();
        Intrinsics.checkNotNullExpressionValue(f0VarO, "toSingle(...)");
        return f0VarO;
    }
}
