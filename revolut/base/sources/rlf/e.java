package rlf;

import aw0.k7;
import aw0.o9;
import cmf.g;
import cmf.h;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.transactions.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import gim.i;
import java.util.List;
import k71.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oim.n;
import tof.a3;
import tof.o3;
import tof.r3;
import yhm.o;
import zhm.r0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends i implements n {
    public /* synthetic */ g u;
    public /* synthetic */ a3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ zk5.c f255043w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ou5.b f255044x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ou5.b bVar, Continuation continuation) {
        super(4, continuation);
        this.f255044x = bVar;
    }

    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        e eVar = new e(this.f255044x, (Continuation) obj5);
        eVar.u = (g) obj2;
        eVar.v = (a3) obj3;
        eVar.f255043w = (zk5.c) obj4;
        return eVar.invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        dj0.d dVarL;
        g gVar = this.u;
        a3 transaction = this.v;
        zk5.c cVar = this.f255043w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (!(gVar instanceof h)) {
            if (Intrinsics.f(gVar, g.b.f25230a)) {
                return gVar;
            }
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.h(cVar);
        r61.c transactionDataContainerAppDomain = ue8.c.O(cVar);
        ?? r2 = transactionDataContainerAppDomain.f251632a;
        ou5.b bVar = this.f255044x;
        rhf.d dVar = (rhf.d) bVar.e;
        boolean z = dVar == rhf.d.CRYPTO || dVar == rhf.d.PAYMENTS_CHAT;
        r3 r3Var = transaction.V;
        Clause textLocalisedClause = null;
        boolean z3 = (((r61.a) r2.get(r3Var != null ? r3Var.f273023a : null)) == null || ((rhf.d) bVar.e) == rhf.d.PAYMENTS_CHAT) ? false : true;
        int i = R$attr.uikit_colorForeground;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        o3 o3Var = transaction.J;
        dj0.d dVar2 = o3Var != null ? o3Var.f272965a : null;
        if (dVar2 != null) {
            dVarL = z ? pyd.c.O(dVar2.a(), pyd.c.K(transaction.f272599l, transaction.f272619w, dVar2.f115083b).a()).l() : xjf.e.c(transaction).l();
        } else {
            dVarL = xjf.e.c(transaction).l();
        }
        MoneyClause moneyClauseB = u5l.a.b(dVarL, null, k.h(transaction) ? k7.NEVER : k7.ALWAYS, new Custom(Integer.valueOf(i), k.h(transaction), null, false, null, Constants.TAG_FC_SPEED_MODE), 3);
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(transactionDataContainerAppDomain, "transactionDataContainerAppDomain");
        r3 r3Var2 = transaction.V;
        String str = r3Var2 != null ? r3Var2.f273023a : null;
        r61.a aVar2 = (r61.a) r2.get(str);
        if ((aVar2 != null ? aVar2.f251630b : null) != null && str != null) {
            textLocalisedClause = new TextLocalisedClause(R$string.transaction_cryptowithdrawal_subtitle, u.c(new TextClause(aVar2.f251630b, (Style) null, (Integer) null, false, (o9) null, (List) null, 124)), null, 12);
        }
        if (textLocalisedClause == null) {
            textLocalisedClause = ((h) gVar).f25232b;
        }
        d dVar3 = (d) bVar.d;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(transactionDataContainerAppDomain, "transactionDataContainerAppDomain");
        return h.a((h) gVar, moneyClauseB, textLocalisedClause, null, thf.d.a(dVar3.f255042a, transaction, r0.g(), null, transactionDataContainerAppDomain, null, null, null, null, null, null, null, 2036), null, z3, false, null, null, null, 2004);
    }
}
