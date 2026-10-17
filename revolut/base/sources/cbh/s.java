package cbh;

import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f22843w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(y yVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f22843w = yVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                s sVar = new s(this.f22843w, continuation, 0);
                sVar.v = ((Boolean) obj2).booleanValue();
                return sVar;
            case 1:
                s sVar2 = new s(this.f22843w, continuation, 1);
                sVar2.v = ((Boolean) obj2).booleanValue();
                return sVar2;
            default:
                s sVar3 = new s(this.f22843w, continuation, 2);
                sVar3.v = ((Boolean) obj2).booleanValue();
                return sVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.u;
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        Continuation continuation = (Continuation) obj3;
        switch (i) {
        }
        return ((s) create(bool, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        boolean zEquals;
        int i = this.u;
        vkm.i iVar = vkm.i.f290039a;
        y yVar = this.f22843w;
        switch (i) {
            case 0:
                boolean z = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!((InvestTransactionsFilter.InvestTransactionsFilterImpl) yVar.I2()).f105341a.isEmpty()) {
                    Set set = ((InvestTransactionsFilter.InvestTransactionsFilterImpl) yVar.I2()).f105341a;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return iVar;
                    }
                    Iterator it8 = set.iterator();
                    while (it8.hasNext()) {
                        if (((WealthAccountType) it8.next()) != WealthAccountType.COMMODITIES) {
                        }
                    }
                    return iVar;
                }
                if (!((InvestTransactionsFilter.InvestTransactionsFilterImpl) yVar.I2()).f105342b.isEmpty()) {
                    Set set2 = ((InvestTransactionsFilter.InvestTransactionsFilterImpl) yVar.I2()).f105342b;
                    if ((set2 instanceof Collection) && set2.isEmpty()) {
                        return iVar;
                    }
                    Iterator it9 = set2.iterator();
                    while (it9.hasNext()) {
                        if (!cp5.d.y((xi0.b) it9.next())) {
                        }
                    }
                    return iVar;
                }
                return z ? yVar.f22853r.f2828l.w0() : iVar;
            case 1:
                boolean z3 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!((InvestTransactionsFilter.InvestTransactionsFilterImpl) yVar.I2()).f105341a.isEmpty()) {
                    Set set3 = ((InvestTransactionsFilter.InvestTransactionsFilterImpl) yVar.I2()).f105341a;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        Iterator it10 = set3.iterator();
                        while (it10.hasNext()) {
                            if (((WealthAccountType) it10.next()) == WealthAccountType.COMMODITIES) {
                                zEquals = true;
                            }
                        }
                    }
                    zEquals = false;
                } else if (((InvestTransactionsFilter.InvestTransactionsFilterImpl) yVar.I2()).f105342b.isEmpty()) {
                    InvestTransactionsFilter investTransactionsFilterI2 = yVar.I2();
                    investTransactionsFilterI2.getClass();
                    zEquals = investTransactionsFilterI2.equals(InvestTransactionsFilter.Companion.f105346b);
                } else {
                    Set set4 = ((InvestTransactionsFilter.InvestTransactionsFilterImpl) yVar.I2()).f105342b;
                    if (!(set4 instanceof Collection) || !set4.isEmpty()) {
                        Iterator it11 = set4.iterator();
                        while (it11.hasNext()) {
                            if (cp5.d.y((xi0.b) it11.next())) {
                                zEquals = true;
                            }
                        }
                    }
                    zEquals = false;
                }
                return (zEquals && z3) ? yVar.f22853r.f2828l.s1() : iVar;
            default:
                boolean z4 = this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yVar.H2(yVar.getState(), new a2g.p(z4, 27));
                return Unit.f186387a;
        }
    }
}
