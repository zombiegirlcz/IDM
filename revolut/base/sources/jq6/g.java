package jq6;

import aw0.n6;
import com.revolut.feature.flexible.staking.consent.impl.screen.FlexibleStakingConsentScreenController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ FlexibleStakingConsentScreenController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(FlexibleStakingConsentScreenController flexibleStakingConsentScreenController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = flexibleStakingConsentScreenController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            case 1:
                return new g(this.v, continuation, 1);
            default:
                return new g(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((g) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        FlexibleStakingConsentScreenController flexibleStakingConsentScreenController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((k) flexibleStakingConsentScreenController.e3()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar = (k) flexibleStakingConsentScreenController.e3();
                kVar.getClass();
                kVar.A1(new j(kVar, null, 0), new yi5.b(25));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar2 = (k) flexibleStakingConsentScreenController.e3();
                kVar2.getClass();
                kVar2.A1(new j(kVar2, null, 1), new yi5.b(25));
                break;
        }
        return Unit.f186387a;
    }
}
