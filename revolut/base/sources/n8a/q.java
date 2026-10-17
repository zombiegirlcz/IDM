package n8a;

import com.revolut.feature.pix.impl.data.network.PixAuthorisationsService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import l8a.s0;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f213343w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f213344x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(s sVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f213343w = sVar;
        this.f213344x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(this.f213343w, this.f213344x, continuation, 0);
            case 1:
                return new q(this.f213343w, this.f213344x, continuation, 1);
            case 2:
                return new q(this.f213343w, this.f213344x, continuation, 2);
            default:
                return new q(this.f213343w, this.f213344x, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    PixAuthorisationsService pixAuthorisationsService = this.f213343w.f213348a;
                    this.v = 1;
                    obj2 = pixAuthorisationsService.approveAuthorisation(this.f213344x, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return edl.a.y((s0) obj2);
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    PixAuthorisationsService pixAuthorisationsService2 = this.f213343w.f213348a;
                    this.v = 1;
                    obj2 = pixAuthorisationsService2.cancelNextPayment(this.f213344x, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return edl.a.y((s0) obj2);
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    PixAuthorisationsService pixAuthorisationsService3 = this.f213343w.f213348a;
                    this.v = 1;
                    obj2 = pixAuthorisationsService3.deactivateAuthorisation(this.f213344x, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return edl.a.y((s0) obj2);
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    PixAuthorisationsService pixAuthorisationsService4 = this.f213343w.f213348a;
                    this.v = 1;
                    obj2 = pixAuthorisationsService4.deleteTransactionLimit(this.f213344x, this);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return edl.a.y((s0) obj2);
        }
    }
}
