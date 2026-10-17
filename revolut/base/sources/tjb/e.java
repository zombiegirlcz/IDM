package tjb;

import com.revolut.feature.retail.savings.impl.challenge.data.SavingsChallengeService;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import ujb.e0;
import ujb.r;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ String f271619w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f271620x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g gVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f271620x = gVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        String str = (String) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                e eVar = new e(this.f271620x, continuation, 0);
                eVar.f271619w = str;
                return eVar.invokeSuspend(Unit.f186387a);
            default:
                e eVar2 = new e(this.f271620x, continuation, 1);
                eVar2.f271619w = str;
                return eVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                String str = this.f271619w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    SavingsChallengeService savingsChallengeService = this.f271620x.f271623a;
                    this.f271619w = null;
                    this.v = 1;
                    obj2 = savingsChallengeService.getChallengeAccount(str, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return d8l.d.D((r) obj2);
            default:
                String str2 = this.f271619w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    SavingsChallengeService savingsChallengeService2 = this.f271620x.f271623a;
                    this.f271619w = null;
                    this.v = 1;
                    obj2 = savingsChallengeService2.getChallenge(str2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return a.a((e0) obj2);
        }
    }
}
