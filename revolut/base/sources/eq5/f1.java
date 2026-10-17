package eq5;

import com.revolut.feature.crypto.withdraw.impl.navigation.CryptoSendAmountInputScreenDestination$InputData;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class f1 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j f128268w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(int i, com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j jVar, Continuation continuation) {
        super(1, continuation);
        this.u = i;
        this.f128268w = jVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f1(0, this.f128268w, continuation);
            default:
                return new f1(1, this.f128268w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((f1) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j jVar = this.f128268w;
                CryptoSendAmountInputScreenDestination$InputData cryptoSendAmountInputScreenDestination$InputData = jVar.o;
                cli.y yVar = jVar.F;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    vkm.t0 t0Var = new vkm.t0(yVar.B(new ep2.l(24)), 1);
                    this.v = 1;
                    obj2 = vkm.q.x(t0Var, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        jVar.H2(yVar, new bcj.i((wk5.a) obj2, 7));
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                x0 x0Var = jVar.f71278q;
                wk5.k kVarA = wk5.m.a(cryptoSendAmountInputScreenDestination$InputData.getF71153a().f71063h);
                Set set = cryptoSendAmountInputScreenDestination$InputData.getF71153a().i;
                this.v = 2;
                obj2 = x0Var.k((xi0.b) obj2, kVarA, null, set, this);
                if (obj2 == aVar) {
                    return aVar;
                }
                jVar.H2(yVar, new bcj.i((wk5.a) obj2, 7));
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j jVar2 = this.f128268w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    x0 x0Var2 = jVar2.f71278q;
                    wk5.k kVarA2 = wk5.m.a(jVar2.o.getF71153a().f71063h);
                    this.v = 1;
                    obj2 = x0Var2.n(kVarA2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                jVar2.H2(jVar2.F, new dv5.p(7, (xi0.b) obj2));
                return Unit.f186387a;
        }
    }
}
