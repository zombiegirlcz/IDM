package fv6;

import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentsQuery;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.b f138370w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AcquiringPaymentsQuery f138371x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.b bVar, AcquiringPaymentsQuery acquiringPaymentsQuery, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f138370w = bVar;
        this.f138371x = acquiringPaymentsQuery;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p(this.f138370w, this.f138371x, continuation, 0);
            case 1:
                return new p(this.f138370w, this.f138371x, continuation, 1);
            case 2:
                return new p(this.f138370w, this.f138371x, continuation, 2);
            default:
                return new p(this.f138370w, this.f138371x, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                    if (com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.b.I2(this.f138370w, this.f138371x, this) == aVar) {
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
                    this.v = 1;
                    if (com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.b.I2(this.f138370w, this.f138371x, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.b.I2(this.f138370w, this.f138371x, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.b.I2(this.f138370w, this.f138371x, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
