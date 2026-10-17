package x16;

import bke.m;
import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.api.model.PersistedBackground;
import com.revolut.feature.defi.accounts.api.model.DeFiBalance;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import yhm.r;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.defi.accounts.impl.ui.extension.a f302312w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(com.revolut.feature.defi.accounts.impl.ui.extension.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f302312w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f302312w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            case 1:
                f fVar2 = new f(this.f302312w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
            case 2:
                f fVar3 = new f(this.f302312w, continuation, 2);
                fVar3.v = obj2;
                return fVar3;
            case 3:
                f fVar4 = new f(this.f302312w, continuation, 3);
                fVar4.v = obj2;
                return fVar4;
            default:
                f fVar5 = new f(this.f302312w, continuation, 4);
                fVar5.v = obj2;
                return fVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((PersistedBackground) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((f) create((r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((f) create((xi0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        ej0.b bVar;
        int i = this.u;
        com.revolut.feature.defi.accounts.impl.ui.extension.a aVar = this.f302312w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.X2(aVar.u, new wug.i(data, 29));
                break;
            case 1:
                PersistedBackground persistedBackground = (PersistedBackground) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.X2(aVar.u, new m(persistedBackground, 1));
                break;
            case 2:
                r rVar = (r) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                e16.b bVar2 = (e16.b) rVar.f314201a;
                xi0.b preferredCurrency = (xi0.b) rVar.f314202b;
                List rates = (List) rVar.f314203c;
                onh.b bVar3 = aVar.f71662r;
                ArrayList balances = bVar2.f121888c;
                Object obj3 = bVar3.f226950b;
                Intrinsics.checkNotNullParameter(balances, "balances");
                Intrinsics.checkNotNullParameter(rates, "rates");
                Intrinsics.checkNotNullParameter(preferredCurrency, "preferredCurrency");
                List list = rates;
                int iB = q0.b(w.t(list, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj4 : list) {
                    linkedHashMap.put(((qta.c) obj4).f249046a.f306286a, obj4);
                }
                ArrayList<p16.a> arrayList = new ArrayList();
                Iterator it8 = balances.iterator();
                while (true) {
                    p16.a aVar5 = null;
                    if (!it8.hasNext()) {
                        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(((p16.a) it9.next()).f231876a);
                        }
                        Iterator it10 = arrayList2.iterator();
                        if (it10.hasNext()) {
                            next = it10.next();
                            while (it10.hasNext()) {
                                BigDecimal bigDecimalAdd = ((ej0.b) next).f126703a.add(((ej0.b) it10.next()).f126703a);
                                Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
                                next = new ej0.b(bigDecimalAdd, preferredCurrency);
                            }
                        } else {
                            next = null;
                        }
                        ej0.b bVar4 = (ej0.b) next;
                        if (bVar4 == null) {
                            BigDecimal ZERO = BigDecimal.ZERO;
                            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                            bVar4 = new ej0.b(ZERO, preferredCurrency);
                        }
                        ArrayList arrayList3 = new ArrayList(w.t(arrayList, 10));
                        Iterator it11 = arrayList.iterator();
                        while (it11.hasNext()) {
                            arrayList3.add(((p16.a) it11.next()).f231877b);
                        }
                        ej0.b bVarC = wt5.a.c(arrayList3);
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList, 10));
                        for (p16.a aVar6 : arrayList) {
                            arrayList4.add(new Pair(aVar6.f231878c, Double.valueOf(aVar6.d.doubleValue())));
                        }
                        aVar.X2(aVar.u, new x0b.c(new z16.b(bVar4, bVarC, wt5.a.a(null, null, arrayList3, arrayList4)), 6));
                        break;
                    } else {
                        DeFiBalance deFiBalance = (DeFiBalance) it8.next();
                        qta.c cVar = (qta.c) linkedHashMap.get(deFiBalance.getCurrency().f306286a);
                        if (cVar != null && (bVar = deFiBalance.d) != null) {
                            BigDecimal bigDecimal = cVar.f249048c;
                            ej0.b bVarD = wt5.a.d(new ej0.b(bigDecimal, preferredCurrency), bVar, deFiBalance.b().doubleValue());
                            BigDecimal bigDecimalMultiply = bigDecimal.multiply(deFiBalance.b());
                            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                            aVar5 = new p16.a(new ej0.b(bigDecimalMultiply, preferredCurrency), bVarD, bVar, deFiBalance.b());
                        }
                        if (aVar5 != null) {
                            arrayList.add(aVar5);
                        }
                    }
                }
                break;
            case 3:
                xi0.b bVar5 = (xi0.b) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.X2(aVar.u, new vgc.b(10, bVar5));
                break;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.X2(aVar.u, new h(data2, 0));
                break;
        }
        return Unit.f186387a;
    }
}
