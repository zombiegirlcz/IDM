package njg;

import com.revolut.feature.trusted_merchants.api.model.TrustedMerchant;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.r;
import te0.w;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.trusted_merchants.impl.ui.kompot.list.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TrustedMerchant.ToReview f216515w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.feature.trusted_merchants.impl.ui.kompot.list.a aVar, TrustedMerchant.ToReview toReview, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f216515w = toReview;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new k(this.v, this.f216515w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((k) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            yig.a aVar2 = this.v.o;
            String merchantId = this.f216515w.f94411b;
            bjg.f fVar = (bjg.f) aVar2;
            fVar.getClass();
            Intrinsics.checkNotNullParameter(merchantId, "merchantId");
            r rVarG0 = w.g0(fVar.f15668a.approveMerchant(merchantId, null));
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
