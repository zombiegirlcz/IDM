package lmb;

import com.revolut.feature.retail.savings.api.challenge.model.SavingsChallengeCreationData;
import com.revolut.feature.retail.savings.impl.creation.navigation.SavingsAccountCreationStepDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import pcd.l0;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SavingsAccountCreationStepDestination.Bank f196912w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f196913x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, SavingsAccountCreationStepDestination.Bank bank, String str, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f196912w = bank;
        this.f196913x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f196912w, this.f196913x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
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
        rnb.w wVar = this.v.f196915l;
        SavingsAccountCreationStepDestination.Bank bank = this.f196912w;
        String str = bank.d;
        String str2 = bank.f83228b;
        xi0.a aVar2 = xi0.b.Companion;
        String str3 = bank.f83229c;
        aVar2.getClass();
        xi0.b bVarA = xi0.a.a(str3);
        l0 l0Var = l0.SAVINGS;
        SavingsChallengeCreationData savingsChallengeCreationData = bank.f;
        pcd.u uVar = new pcd.u(str, bVarA, str2, null, l0Var, this.f196913x, savingsChallengeCreationData != null ? new pcd.t(savingsChallengeCreationData.f83096a.f83099a.f83087a, savingsChallengeCreationData.f83097b.f115082a, savingsChallengeCreationData.f83098c) : null);
        this.u = 1;
        Object objB = ((eed.h) wVar.f255587a).b(uVar, this);
        return objB == aVar ? aVar : objB;
    }
}
