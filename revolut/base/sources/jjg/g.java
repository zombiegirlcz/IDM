package jjg;

import com.revolut.feature.trusted_merchants.api.model.TrustedMerchant;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.r;
import te0.w;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.trusted_merchants.impl.ui.kompot.details.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TrustedMerchant.Approved f174948w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.trusted_merchants.impl.ui.kompot.details.a aVar, TrustedMerchant.Approved approved, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f174948w = approved;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.v, this.f174948w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            yig.a aVar2 = this.v.o;
            String merchantId = this.f174948w.f94405b;
            bjg.f fVar = (bjg.f) aVar2;
            fVar.getClass();
            Intrinsics.checkNotNullParameter(merchantId, "merchantId");
            r rVarG0 = w.g0(fVar.f15668a.disapproveMerchant(merchantId));
            this.u = 1;
            if (nim.a.a(rVarG0, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
