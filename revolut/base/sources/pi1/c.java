package pi1;

import com.revolut.feature.address.models.Address;
import com.revolut.feature.address.models.AddressFormat;
import gi1.o;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ o A;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.address.common.impl.flow.validation_flow.c f236370w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Address f236371x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AddressFormat f236372y;
    public final /* synthetic */ o z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(com.revolut.feature.address.common.impl.flow.validation_flow.c cVar, Address address, AddressFormat addressFormat, o oVar, o oVar2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f236370w = cVar;
        this.f236371x = address;
        this.f236372y = addressFormat;
        this.z = oVar;
        this.A = oVar2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f236370w, this.f236371x, this.f236372y, this.z, this.A, continuation, 0);
            default:
                return new c(this.f236370w, this.f236371x, this.f236372y, this.z, this.A, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (com.revolut.feature.address.common.impl.flow.validation_flow.c.Z2(this.f236370w, this.f236371x, this.f236372y, this.z, this.A, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (com.revolut.feature.address.common.impl.flow.validation_flow.c.Z2(this.f236370w, this.f236371x, this.f236372y, this.z, this.A, this) == aVar2) {
                        return aVar2;
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
