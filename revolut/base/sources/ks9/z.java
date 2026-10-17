package ks9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class z extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f189392w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PaymentGroup f189393x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ List f189394y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(b0 b0Var, PaymentGroup paymentGroup, List list, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f189392w = b0Var;
        this.f189393x = paymentGroup;
        this.f189394y = list;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new z(this.f189392w, this.f189393x, this.f189394y, continuation, 0);
            default:
                return new z(this.f189392w, this.f189393x, this.f189394y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((z) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                b0 b0Var = this.f189392w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    pfm.r rVarB = b0Var.f189321l.b(this.f189393x, this.f189394y);
                    this.v = 1;
                    if (nim.a.a(rVarB, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Boolean.valueOf(b0Var.f189323n.k(Unit.f186387a));
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                b0 b0Var2 = this.f189392w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    pfm.r rVarC = b0Var2.f189321l.c(this.f189393x, this.f189394y, null);
                    this.v = 1;
                    if (nim.a.a(rVarC, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Boolean.valueOf(b0Var2.f189323n.k(Unit.f186387a));
        }
    }
}
