package xsf;

import com.revolut.feature.transfer_reasons.impl.ui.additional_info.TransferReasonsAdditionalInfoScreen;
import com.revolut.feature.transfer_reasons.models.additional_info.AdditionalInfoField;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TransferReasonsAdditionalInfoScreen f308468w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(TransferReasonsAdditionalInfoScreen transferReasonsAdditionalInfoScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f308468w = transferReasonsAdditionalInfoScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j(this.f308468w, continuation, 0);
                jVar.v = obj2;
                return jVar;
            default:
                j jVar2 = new j(this.f308468w, continuation, 1);
                jVar2.v = obj2;
                return jVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        AdditionalInfoField additionalInfoField = (AdditionalInfoField) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(additionalInfoField, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TransferReasonsAdditionalInfoScreen transferReasonsAdditionalInfoScreen = this.f308468w;
        switch (i) {
            case 0:
                AdditionalInfoField additionalInfoField = (AdditionalInfoField) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVarE3 = transferReasonsAdditionalInfoScreen.e3();
                Intrinsics.h(additionalInfoField);
                ((com.revolut.feature.transfer_reasons.impl.ui.additional_info.a) pVarE3).I2(additionalInfoField);
                break;
            default:
                AdditionalInfoField additionalInfoField2 = (AdditionalInfoField) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVarE32 = transferReasonsAdditionalInfoScreen.e3();
                Intrinsics.h(additionalInfoField2);
                ((com.revolut.feature.transfer_reasons.impl.ui.additional_info.a) pVarE32).I2(additionalInfoField2);
                break;
        }
        return Unit.f186387a;
    }
}
