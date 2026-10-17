package akl;

import com.revolut.RevolutApplication;
import com.revolut.feature.retail.legacy.login.impl.login.LoginFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KTypeProjection;
import vkm.b2;
import vkm.j2;
import voi.i;

/* JADX INFO: loaded from: classes13.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i, Continuation continuation) {
        super(i, continuation);
        this.u = 7;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new w((z) this.v, continuation, 0);
            case 1:
                return new w((dp4.o0) this.v, continuation, 1);
            case 2:
                return new w((l1b.l) this.v, continuation, 2);
            case 3:
                return new w((RevolutApplication) this.v, continuation, 3);
            case 4:
                return new w((pe0.q) this.v, continuation, 4);
            case 5:
                return new w((pfk.p0) this.v, continuation, 5);
            case 6:
                return new w((sjf.e) this.v, continuation, 6);
            case 7:
                w wVar = new w(2, continuation);
                wVar.v = obj2;
                return wVar;
            case 8:
                return new w((voi.i) this.v, continuation, 8);
            case 9:
                return new w((LoginFragment) this.v, continuation, 9);
            case 10:
                return new w((xce.f) this.v, continuation, 10);
            default:
                return new w((xr3.k) this.v, continuation, 11);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((w) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ArrayList arrayList = null;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return ((z) this.v).d.T2("CONFIG", gkl.o.class);
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list = (List) ((dp4.o0) this.v).f116673c.a(cp4.o.f107837a);
                if (list != null) {
                    List list2 = list;
                    arrayList = new ArrayList(zhm.w.t(list2, 10));
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(ngm.n.C((on4.f) it8.next()));
                    }
                }
                return arrayList;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l1b.l lVar = (l1b.l) this.v;
                Boolean bool = (Boolean) lVar.f191525a.T2("KEY_APPSFLYER_ENABLED", Boolean.TYPE);
                return Boolean.valueOf(bool != null ? bool.booleanValue() : ((Boolean) lVar.d.getValue()).booleanValue());
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                RevolutApplication.Companion aVar5 = RevolutApplication.INSTANCE;
                voi.i.f().b().getToken();
                return Unit.f186387a;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pe0.q qVar = (pe0.q) this.v;
                j2 j2Var = qVar.f235314h;
                Object obj3 = (List) p.a.j(pe0.f.class, KTypeProjection.INSTANCE, List.class, qVar.f235311b, "queue_id");
                if (obj3 == null) {
                    obj3 = zhm.f0.f322471a;
                }
                j2Var.setValue(obj3);
                return Unit.f186387a;
            case 5:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xe0.e eVar = ((pfk.p0) this.v).f235670c;
                pfk.p0.Companion.getClass();
                zek.n nVar = (zek.n) eVar.T2("STORAGE_KEY_PLAN_CAMPAIGNS", pfk.p0.f235667t);
                if (nVar != null) {
                    return io3.h.D(nVar);
                }
                return null;
            case 6:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sjf.e eVar2 = (sjf.e) this.v;
                j2 j2Var2 = eVar2.f;
                Integer num = (Integer) j6.a.k(Integer.TYPE, eVar2.d, "TRANSACTIONS_COUNT");
                Integer num2 = new Integer(num != null ? num.intValue() : -1);
                j2Var2.getClass();
                j2Var2.g(null, num2);
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.DEBUG, "TransactionsPerformanceTracker", a0.d.m(j2Var2.getValue(), "Transactions count from storage: "), null, null, 16);
                return Unit.f186387a;
            case 7:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Boolean.valueOf(((b2) this.v) != b2.START);
            case 8:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i.a aVar11 = voi.i.Companion;
                ((j41.a) ((g41.b) ((l41.a) ((ip.a) hf0.b.d.g()).b().f197975u3.get()).d.get())).a();
                return Unit.f186387a;
            case 9:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return ((ik3.g) ((LoginFragment) this.v).L().k()).f161888g.b();
            case 10:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return j6.a.k(k7d.d.class, ((xce.f) this.v).f304121c, "troubleshootingSuggestions");
            default:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                tr3.a aVar15 = (tr3.a) ((xr3.k) this.v).d.T2("credit-configuration", tr3.a.class);
                if (aVar15 != null) {
                    return yoj.b.H(aVar15);
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }
}
