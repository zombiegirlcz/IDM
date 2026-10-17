package nya;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.w1;

/* JADX INFO: loaded from: classes5.dex */
public final class f0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d f220731w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f220731w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f0(this.f220731w, continuation, 0);
            case 1:
                return new f0(this.f220731w, continuation, 1);
            default:
                return new f0(this.f220731w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d dVar = this.f220731w;
                    wwa.b bVar = dVar.f81857q;
                    pwa.n nVar = dVar.o.f81844c;
                    this.v = 1;
                    Object objE = ((uwa.q) bVar.f300637a).e(nVar, this);
                    if (objE != aVar) {
                        objE = Unit.f186387a;
                    }
                    if (objE == aVar) {
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
                    w1 w1Var = w1.f264016b;
                    f0 f0Var = new f0(this.f220731w, null, 0);
                    this.v = 1;
                    if (skm.e0.J(w1Var, f0Var, this) == aVar2) {
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
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d dVar2 = this.f220731w;
                com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.b bVar2 = new com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.b(dVar2, null);
                this.v = 1;
                Object objB = pu7.a.B(dVar2.k, "triggerInviteFriends", bVar2, this);
                return objB == aVar3 ? aVar3 : objB;
        }
    }
}
