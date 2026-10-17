package xsf;

import com.revolut.feature.transfer_reasons.impl.ui.additional_info.TransferReasonsAdditionalInfoScreen;
import com.revolut.feature.transfer_reasons.impl.ui.additional_info.TransferReasonsAdditionalInfoScreenContract$ModalStep;
import com.revolut.feature.transfer_reasons.models.additional_info.AdditionalInfoFooter;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransferReasonsAdditionalInfoScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(TransferReasonsAdditionalInfoScreen transferReasonsAdditionalInfoScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transferReasonsAdditionalInfoScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((AdditionalInfoFooter.Parameter) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        AdditionalInfoFooter.Parameter parameter = (AdditionalInfoFooter.Parameter) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarE3 = this.v.R2();
        Intrinsics.h(parameter);
        com.revolut.feature.transfer_reasons.impl.ui.additional_info.a aVar2 = (com.revolut.feature.transfer_reasons.impl.ui.additional_info.a) pVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        oki.h.v2(aVar2.f92382r, new TransferReasonsAdditionalInfoScreenContract$ModalStep.AdditionalInfoDisclosure(parameter), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
        return Unit.f186387a;
    }
}
