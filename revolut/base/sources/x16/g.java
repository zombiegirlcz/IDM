package x16;

import ag1.l;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.defi.accounts.api.model.DeFiBalance;
import com.revolut.feature.defi.trade.api.navigation.DefiTradeDestination;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.q;
import vkm.t0;
import vy5.d0;
import wf0.f0;
import x1.n;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.defi.accounts.impl.ui.extension.a f302313w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(com.revolut.feature.defi.accounts.impl.ui.extension.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f302313w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f302313w, continuation, 0);
            case 1:
                return new g(this.f302313w, continuation, 1);
            default:
                return new g(this.f302313w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.defi.accounts.impl.ui.extension.a aVar = this.f302313w;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    obj2 = q.x(new d0(aVar.u.B(new n(4)), 13), this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return yji.n.l2(aVar, q.Q(aVar.f71664t, new f0((Continuation) null, aVar, (xi0.b) obj2, 4)), null, new f(aVar, null, 0), 3);
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    o16.e eVar = aVar.f71661q;
                    this.v = 1;
                    obj2 = eVar.b(true, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                aVar.X2(aVar.u, new l((Clause) obj2, 9));
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    t0 t0Var = new t0(aVar.u.B(new n(7)), 1);
                    this.v = 1;
                    obj2 = q.x(t0Var, this);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                ArrayList arrayList = ((e16.b) obj2).f121888c;
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(((DeFiBalance) it8.next()).f71635a);
                }
                DefiTradeDestination defiTradeDestination = new DefiTradeDestination(zhm.d0.i1(arrayList2));
                d dVar = com.revolut.feature.defi.accounts.impl.ui.extension.a.Companion;
                return aVar.A2(defiTradeDestination);
        }
    }
}
