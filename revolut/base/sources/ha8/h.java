package ha8;

import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import yhm.o;
import yhm.r;
import zh9.u0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f150465w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f150465w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f150465w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            default:
                h hVar2 = new h(this.f150465w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        cfl.b d;
        u98.a aVarA;
        int i = this.u;
        i iVar = this.f150465w;
        switch (i) {
            case 0:
                r rVar = (r) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                List<com.revolut.feature.junior_profile.api.models.a> list = (List) rVar.f314201a;
                TradingAccounts tradingAccounts = (TradingAccounts) rVar.f314202b;
                lf8.b bVar = (lf8.b) rVar.f314203c;
                if (list.isEmpty()) {
                    return new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
                }
                ArrayList arrayList = new ArrayList();
                for (com.revolut.feature.junior_profile.api.models.a aVar2 : list) {
                    p0 p0Var = o0.f186429a;
                    String strJ2 = i.J2(aVar2, p0Var.b(com.revolut.feature.junior_profile.api.models.e.class));
                    String strJ22 = i.J2(aVar2, p0Var.b(com.revolut.feature.junior_profile.api.models.h.class));
                    Object objI = null;
                    if (strJ2 == null && strJ22 == null) {
                        IllegalStateException illegalStateException = new IllegalStateException("We shouldn't have both Banking RI & Trading RI as null");
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    } else {
                        Iterator it8 = tradingAccounts.f105278a.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (Intrinsics.f(((TradingAccount) next).getF().f105175a.toString(), strJ22)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        TradingAccount tradingAccount = (TradingAccount) next;
                        if (tradingAccount == null || (d = tradingAccount.getD()) == null) {
                            d = cfl.b.CREATED;
                        }
                        lf8.j jVar = bVar.f194665b;
                        if (jVar == null || (aVarA = iVar.f150469s.a(aVar2.getI(), jVar, null, null)) == null) {
                            aVarA = u98.a.TOO_OLD;
                        }
                        objI = strJ2 == null ? zi0.c.i(new e(aVar2, true, d, aVarA)) : nim.a.v(rd0.e.b(osg.b.a(iVar.f150467q, strJ2, false, 4)), new g31.e(aVar2, 20, d, aVarA));
                    }
                    if (objI != null) {
                        arrayList.add(objI);
                    }
                }
                return arrayList.isEmpty() ? new go.g(new Data(f0.f322471a, null, false, 6, null), 2) : nim.a.v(u0.k(arrayList), new h56.a(iVar, 16));
            default:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                iVar.H2(iVar.f150470t, new h1k.k(data, 15));
                return Unit.f186387a;
        }
    }
}
