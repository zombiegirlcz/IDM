package au6;

import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class i2 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ k2 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2(k2 k2Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = k2Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i2(this.v, continuation, 0);
            default:
                return new i2(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i2) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        k2 k2Var = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar = k2Var.d;
                Type type = l21.d.e;
                Intrinsics.checkNotNullExpressionValue(type, "<get-BOOLEAN_TYPE>(...)");
                return cVar.v0(Boolean.FALSE, "FreelancerCardProcessingBannerRepository:Storage:CardProcessingBannerDismissed", type);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, k2Var.d, "FreelancerCardProcessingBannerRepository:Storage:CardProcessingBannerDismissed", Boolean.TRUE);
                return Unit.f186387a;
        }
    }
}
