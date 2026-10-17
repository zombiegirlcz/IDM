package bq5;

import com.revolut.feature.crypto.withdraw.api.models.CryptoAddressHostingCheckResult;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import le.u1;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class b1 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f17693w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f17694x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a f17695y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(int i, com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f17695y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                b1 b1Var = new b1(0, this.f17695y, continuation);
                b1Var.f17693w = flowCollector;
                b1Var.f17694x = obj3;
                return b1Var.invokeSuspend(Unit.f186387a);
            default:
                b1 b1Var2 = new b1(1, this.f17695y, continuation);
                b1Var2.f17693w = flowCollector;
                b1Var2.f17694x = obj3;
                return b1Var2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow gVar;
        int i = this.u;
        com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a aVar = this.f17695y;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f17693w;
                    vkm.d dVarB = rd0.e.b(aVar.f71235q.b((wk5.a) this.f17694x));
                    this.f17693w = null;
                    this.f17694x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, dVarB, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                cli.y yVar = aVar.C;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f17693w;
                    Pair pair = (Pair) this.f17694x;
                    wk5.a blockchain = (wk5.a) pair.f186385a;
                    String address = (String) pair.f186386b;
                    CryptoAddressHostingCheckResult.Found foundA = com.revolut.feature.crypto.withdraw.api.models.a.a((CryptoAddressHostingCheckResult) ((a0) ((j2) yVar.f22677a).getValue()).f17677h.getContent());
                    boolean z = false;
                    if (foundA != null && foundA.d) {
                        z = true;
                    }
                    boolean zContains = ((a0) ((j2) yVar.f22677a).getValue()).f17684r.contains(c0.HOSTING_DROPDOWN);
                    if (z || zContains || blockchain == null) {
                        gVar = new go.g(((a0) ((j2) yVar.f22677a).getValue()).f17677h, 2);
                    } else {
                        ap5.b bVar = aVar.f71237s;
                        bVar.getClass();
                        Intrinsics.checkNotNullParameter(address, "address");
                        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
                        no5.b bVar2 = bVar.f8094a;
                        no5.a aVar4 = no5.b.Companion;
                        hp5.o oVar = (hp5.o) bVar2;
                        oVar.getClass();
                        Intrinsics.checkNotNullParameter(address, "address");
                        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
                        w4l.h loadingStrategy = w4l.h.f294642c;
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        String strH = u1.h(blockchain, wk5.b.a());
                        if (strH == null) {
                            throw new IllegalArgumentException("Must provide valid Blockchain to verify Crypto Address Hosting!");
                        }
                        gVar = nim.a.A(rd0.e.b(oVar.f154490n.e(new hp5.d(address, strH), loadingStrategy)), e1.f17706a);
                    }
                    this.f17693w = null;
                    this.f17694x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, gVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
