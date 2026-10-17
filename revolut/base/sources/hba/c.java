package hba;

import com.revolut.feature.pix.impl.flow.portability_details.screens.review.ReviewPortabilityInfoScreen;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ReviewPortabilityInfoScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ReviewPortabilityInfoScreen reviewPortabilityInfoScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = reviewPortabilityInfoScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        um0 um0Var = (um0) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(um0Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ReviewPortabilityInfoScreen reviewPortabilityInfoScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                reviewPortabilityInfoScreen.c3(d.DISMISS);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar = (l) reviewPortabilityInfoScreen.d3();
                lVar.getClass();
                lVar.I2(new gwc.h(1, lVar.f150635q, h.class, "providePortabilityDifferentOwnershipCancelErrorConfig", "providePortabilityDifferentOwnershipCancelErrorConfig(Ljava/lang/Throwable;)Lcom/revolut/kompot/common/dialog/status/StatusDialogConfiguration$Error;", 0, 26), new a76.c(0, lVar.f150635q, h.class, "providePortabilityDifferentOwnershipCancelSuccessConfig", "providePortabilityDifferentOwnershipCancelSuccessConfig()Lcom/revolut/kompot/common/dialog/status/StatusDialogConfiguration;", 0, 29), new j(lVar, null, 2));
                break;
        }
        return Unit.f186387a;
    }
}
