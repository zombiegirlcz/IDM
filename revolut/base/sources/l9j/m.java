package l9j;

import aw0.q0;
import com.revolut.data.model.Data;
import com.revolut.feature.staking.api.model.StakingPocket;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import l7j.t;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.a f193267w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f193267w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                m mVar = new m(this.f193267w, continuation, 0);
                mVar.v = obj2;
                return mVar;
            case 1:
                m mVar2 = new m(this.f193267w, continuation, 1);
                mVar2.v = obj2;
                return mVar2;
            default:
                m mVar3 = new m(this.f193267w, continuation, 2);
                mVar3.v = obj2;
                return mVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((m) create((StakingPocket) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((m) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((m) create((q0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.a aVar = this.f193267w;
        switch (i) {
            case 0:
                StakingPocket stakingPocket = (StakingPocket) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.H2(aVar.f99996x, new l(stakingPocket, 0));
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.H2(aVar.f99996x, new t(data, 7));
                break;
            default:
                q0 q0Var = (q0) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.H2(aVar.f99996x, new cy5.g(q0Var, 2));
                break;
        }
        return Unit.f186387a;
    }
}
