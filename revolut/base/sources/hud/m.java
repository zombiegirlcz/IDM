package hud;

import afa.s;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import efm.d0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.staking.impl.confirmation.a f155637w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(com.revolut.feature.staking.impl.confirmation.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f155637w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.f155637w, continuation, 0);
            case 1:
                return new m(this.f155637w, continuation, 1);
            case 2:
                return new m(this.f155637w, continuation, 2);
            default:
                return new m(this.f155637w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        OrderQuote orderQuote;
        Amount amount;
        Asset asset;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.staking.impl.confirmation.a aVar2 = this.f155637w;
                xi0.b currency = 0;
                currency = 0;
                currency = 0;
                currency = 0;
                if (i == 0) {
                    yhm.o.b(obj2);
                    a3b.h hVar = new a3b.h(aVar2, 22);
                    an1.d dVar = new an1.d(aVar2, 27);
                    hib.n nVar = new hib.n(14, currency, aVar2);
                    this.v = 1;
                    obj2 = n14.k.V(aVar2, null, hVar, dVar, nVar, this, 1);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                nii.h hVar2 = (nii.h) obj2;
                if (hVar2 instanceof nii.g) {
                    Data data = ((i) ((j2) aVar2.D.f22677a).getValue()).d;
                    if (data != null && (orderQuote = (OrderQuote) data.getContent()) != null && (amount = orderQuote.f104754c) != null && (asset = amount.f104718b) != null) {
                        currency = asset.f104721c;
                    }
                    if (currency != 0) {
                        cwd.b bVar = aVar2.B;
                        bVar.getClass();
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        bVar.f109602a.G(currency.f306286a, "LAST_CURRENCY_KEY", String.class);
                    }
                    aVar2.C2(new ytd.b((StakingPocket) ((Pair) ((nii.g) hVar2).f216152a).f186386b));
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.staking.impl.confirmation.a aVar4 = this.f155637w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    d0 d0VarC = ((gi5.d) aVar4.f88122y).c(aVar4.o.d.d);
                    this.v = 1;
                    obj2 = nim.a.b(d0VarC, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar4.H2(aVar4.D, new bke.o((sh5.c) obj2, 7));
                return Unit.f186387a;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                com.revolut.feature.staking.impl.confirmation.a aVar6 = this.f155637w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    d0 d0VarZ = aVar6.f88117r.z(AccountId.Personal.f51414a, aVar6.o.f88107b);
                    this.v = 1;
                    obj2 = nim.a.b(d0VarZ, this);
                    if (obj2 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar6.H2(aVar6.D, new s((io3.d) obj2, 6));
                return Unit.f186387a;
            default:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                com.revolut.feature.staking.impl.confirmation.a aVar8 = this.f155637w;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    d0 d0VarF = aVar8.u.f(false);
                    this.v = 1;
                    obj2 = nim.a.b(d0VarF, this);
                    if (obj2 == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar8.H2(aVar8.D, new a2f.j((do3.n) obj2, 8));
                return Unit.f186387a;
        }
    }
}
