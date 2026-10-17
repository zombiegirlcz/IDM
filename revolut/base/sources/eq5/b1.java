package eq5;

import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.models.FiatCryptoMoney;
import com.revolut.feature.transfer.core.models.FundingSource;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class b1 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f128253w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f128254x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j f128255y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(int i, com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j jVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f128255y = jVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                b1 b1Var = new b1(0, this.f128255y, continuation);
                b1Var.f128253w = flowCollector;
                b1Var.f128254x = obj3;
                return b1Var.invokeSuspend(Unit.f186387a);
            case 1:
                b1 b1Var2 = new b1(1, this.f128255y, continuation);
                b1Var2.f128253w = flowCollector;
                b1Var2.f128254x = obj3;
                return b1Var2.invokeSuspend(Unit.f186387a);
            case 2:
                b1 b1Var3 = new b1(2, this.f128255y, continuation);
                b1Var3.f128253w = flowCollector;
                b1Var3.f128254x = obj3;
                return b1Var3.invokeSuspend(Unit.f186387a);
            default:
                b1 b1Var4 = new b1(3, this.f128255y, continuation);
                b1Var4.f128253w = flowCollector;
                b1Var4.f128254x = obj3;
                return b1Var4.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f128253w;
                    vf0.h hVar = (vf0.h) this.f128254x;
                    CryptoAddress beneficiary = (CryptoAddress) hVar.f288433a;
                    List toBaseCurrencyExchangeRates = (List) hVar.f288434b;
                    FiatCryptoMoney withdrawAmount = (FiatCryptoMoney) hVar.f288435c;
                    dj0.d cryptoBalance = (dj0.d) hVar.d;
                    zjh.j jVar = this.f128255y.v;
                    jVar.getClass();
                    Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
                    Intrinsics.checkNotNullParameter(toBaseCurrencyExchangeRates, "toBaseCurrencyExchangeRates");
                    Intrinsics.checkNotNullParameter(withdrawAmount, "withdrawAmount");
                    Intrinsics.checkNotNullParameter(cryptoBalance, "cryptoBalance");
                    akg.n nVarV = nim.a.v(zh9.u0.m(jVar.l(beneficiary, toBaseCurrencyExchangeRates, withdrawAmount), jVar.m(withdrawAmount.f71113b, beneficiary.f71060b)), new eed.i(jVar, 9, withdrawAmount, cryptoBalance));
                    this.f128253w = null;
                    this.f128254x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, nVarV, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f128253w;
                    Pair pair = (Pair) this.f128254x;
                    Flow flowI = this.f128255y.f71278q.i((xi0.b) pair.f186385a, (xi0.b) pair.f186386b);
                    this.f128253w = null;
                    this.f128254x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, flowI, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f128253w;
                    xi0.b bVar = (xi0.b) this.f128254x;
                    go.g gVar = new go.g(zi0.c.P(bVar, false, null, 3), 2);
                    com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j jVar2 = this.f128255y;
                    akg.n nVarI = zh9.u0.i(gVar, rd0.e.b(jVar2.f71277p.i(bVar, false)), nim.a.v(jVar2.F.B(h1.f128274a), i1.f128276a));
                    this.f128253w = null;
                    this.f128254x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, nVarI, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f128253w;
                    FundingSource fundingSource = (FundingSource) this.f128254x;
                    vkm.y yVarD = rd0.e.d(((yt9.g) this.f128255y.C).g(fundingSource, fundingSource.getK()), zhm.h0.f322473a);
                    this.f128253w = null;
                    this.f128254x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, yVarD, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
