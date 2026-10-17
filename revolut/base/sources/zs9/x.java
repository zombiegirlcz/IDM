package zs9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class x extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f324847w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(z zVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f324847w = zVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new x(this.f324847w, continuation, 0);
            case 1:
                return new x(this.f324847w, continuation, 1);
            default:
                return new x(this.f324847w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((x) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                z zVar = this.f324847w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    vkj.l lVar = new vkj.l(zVar, 10);
                    w wVar = new w(zVar, null, 0);
                    this.v = 1;
                    obj2 = n14.k.V(zVar, null, null, lVar, wVar, this, 3);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                nii.h hVar = (nii.h) obj2;
                if (hVar instanceof nii.g) {
                    zVar.v2(new q((PaymentGroup) ((nii.g) hVar).f216152a));
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    z zVar2 = this.f324847w;
                    w wVar2 = new w(zVar2, null, 1);
                    this.v = 1;
                    if (zVar2.p2(this, wVar2) == aVar2) {
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
                z zVar3 = this.f324847w;
                y yVar = new y(zVar3, null);
                this.v = 1;
                Object objP2 = zVar3.p2(this, yVar);
                return objP2 == aVar3 ? aVar3 : objP2;
        }
    }
}
