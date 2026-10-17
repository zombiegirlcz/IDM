package hud;

import cli.y;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.staking.impl.confirmation.StakingConfirmationControllerContract$InputData;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.market_data.models.domain.models.LegacyOrderQuoteParams;
import hu1.h0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f155638w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.staking.impl.confirmation.a f155639x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(com.revolut.feature.staking.impl.confirmation.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f155639x = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                n nVar = new n(this.f155639x, continuation, 0);
                nVar.f155638w = obj2;
                return nVar;
            default:
                n nVar2 = new n(this.f155639x, continuation, 1);
                nVar2.f155638w = obj2;
                return nVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((n) create((xi0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((n) create((io3.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object obj3;
        switch (this.u) {
            case 0:
                com.revolut.feature.staking.impl.confirmation.a aVar = this.f155639x;
                y yVar = aVar.D;
                xi0.b bVar = (xi0.b) this.f155638w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    if (Intrinsics.f(bVar, aVar.o.d.d)) {
                        aVar.H2(yVar, new h0(6));
                        return Unit.f186387a;
                    }
                    be5.e eVar = aVar.C;
                    this.f155638w = null;
                    this.v = 1;
                    eVar.getClass();
                    obj3 = f0.f322471a;
                    if (obj3 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    obj3 = obj2;
                }
                aVar.H2(yVar, new fvk.q((List) obj3, 26));
                return Unit.f186387a;
            default:
                com.revolut.feature.staking.impl.confirmation.a aVar3 = this.f155639x;
                StakingConfirmationControllerContract$InputData stakingConfirmationControllerContract$InputData = aVar3.o;
                io3.d dVar = (io3.d) this.f155638w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    xi0.b bVarL = z92.f.l(dVar);
                    if (bVarL.equals(stakingConfirmationControllerContract$InputData.d.d)) {
                        aVar3.H2(aVar3.D, new h0(7));
                    } else {
                        StakingProduct stakingProduct = stakingConfirmationControllerContract$InputData.d;
                        dj0.d dVar2 = stakingConfirmationControllerContract$InputData.f88106a;
                        xi0.b bVar2 = stakingProduct.d;
                        LegacyOrderQuoteParams legacyOrderQuoteParams = new LegacyOrderQuoteParams(new Asset(cp5.d.z(bVarL) ? f8l.c.CRYPTO : f8l.c.FIAT, bVarL.f306286a, bVarL), new Asset(cp5.d.z(bVar2) ? f8l.c.CRYPTO : f8l.c.FIAT, bVar2.f306286a, bVar2), f8l.e.MARKET, pyd.c.x(dVar2), Intrinsics.f(dVar2.f115083b, bVar2) ? f8l.b.TO : f8l.b.FROM, f8l.b.TO, null, false, null, null, null, null, null, null, 15360);
                        vkm.f fVarS = o7.b.s(aVar3.f88116q, legacyOrderQuoteParams);
                        f23.y yVar2 = new f23.y(aVar3, legacyOrderQuoteParams, (Continuation) null, 23);
                        this.f155638w = null;
                        this.v = 1;
                        if (vkm.q.o(fVarS, yVar2, this) == aVar4) {
                            return aVar4;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
