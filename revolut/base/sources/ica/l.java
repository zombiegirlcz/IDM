package ica;

import com.revolut.feature.pix.impl.flow.refund.screen.review.PixRefundReviewScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f160229w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(n nVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f160229w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.f160229w, continuation, 0);
            default:
                return new l(this.f160229w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((l) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                n nVar = this.f160229w;
                f8a.a aVar2 = nVar.f160231q;
                PixRefundReviewScreenContract$InputData pixRefundReviewScreenContract$InputData = nVar.o;
                String str = pixRefundReviewScreenContract$InputData.f80740b;
                dj0.d dVar = pixRefundReviewScreenContract$InputData.f80739a;
                String str2 = pixRefundReviewScreenContract$InputData.f;
                boolean z = pixRefundReviewScreenContract$InputData.f80742g;
                this.v = 1;
                Object objB = ((s8a.e) aVar2).b(str, dVar, str2, z, this);
                return objB == aVar ? aVar : objB;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                n nVar2 = this.f160229w;
                l lVar = new l(nVar2, null, 0);
                this.v = 1;
                Object objB0 = u0.b0(nVar2.X(), "SUBMIT_BUTTON_TAG", lVar, this);
                return objB0 == aVar3 ? aVar3 : objB0;
        }
    }
}
