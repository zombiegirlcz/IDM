package knd;

import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.retail.feature.api.AnalyticsAccount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AnalyticsAccount.Savings f186058w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, AnalyticsAccount.Savings savings, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
        this.f186058w = savings;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, this.f186058w, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Pair pair = (Pair) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        List list = (List) pair.f186385a;
        Set set = (Set) pair.f186386b;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (!set.contains(((SavingsAccountDetails) ((npg.a) obj3).f218206b).f86460a.f234881a)) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            dj0.d dVar = ((npg.a) it8.next()).f218205a;
            if (dVar != null) {
                arrayList2.add(dVar);
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            dj0.d.Companion.getClass();
            dj0.d dVarO = dj0.d.e;
            int i = 0;
            for (Object obj4 : arrayList2) {
                int i2 = i + 1;
                if (i < 0) {
                    zhm.v.s();
                    throw null;
                }
                dVarO = i == 0 ? (dj0.d) obj4 : pyd.c.O(dVarO, (dj0.d) obj4);
                i = i2;
            }
            if (dVarO != null) {
                return zi0.c.i(dVarO);
            }
        }
        return nim.a.v(this.v.f186063c.a(this.f186058w), new a(3));
    }
}
