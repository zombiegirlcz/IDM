package lmb;

import com.revolut.feature.retail.savings.api.challenge.model.SavingsChallengeCreationData;
import com.revolut.feature.retail.savings.impl.creation.navigation.SavingsAccountCreationStepDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import pcd.l0;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SavingsAccountCreationStepDestination.Fund f196919w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, SavingsAccountCreationStepDestination.Fund fund, Continuation continuation) {
        super(1, continuation);
        this.v = gVar;
        this.f196919w = fund;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.v, this.f196919w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        this.u = 1;
        rnb.w wVar = this.v.f196921l;
        SavingsAccountCreationStepDestination.Fund fund = this.f196919w;
        String str = fund.d;
        String str2 = fund.f83232b;
        xi0.a aVar2 = xi0.b.Companion;
        String str3 = fund.f83233c;
        aVar2.getClass();
        xi0.b bVarA = xi0.a.a(str3);
        l0 l0Var = l0.MONEY_MARKET_FUND_SAVINGS;
        SavingsChallengeCreationData savingsChallengeCreationData = fund.f83234g;
        Object objB = ((eed.h) wVar.f255587a).b(new pcd.u(str, bVarA, str2, null, l0Var, null, savingsChallengeCreationData != null ? new pcd.t(savingsChallengeCreationData.f83096a.f83099a.f83087a, savingsChallengeCreationData.f83097b.f115082a, savingsChallengeCreationData.f83098c) : null, 32), this);
        return objB == aVar ? aVar : objB;
    }
}
