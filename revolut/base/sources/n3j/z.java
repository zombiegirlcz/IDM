package n3j;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$BackendDefinition;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class z extends gim.i implements Function1 {
    public final /* synthetic */ com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d u;
    public final /* synthetic */ InputTextDelegate.TextData v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d dVar, InputTextDelegate.TextData textData, Continuation continuation) {
        super(1, continuation);
        this.u = dVar;
        this.v = textData;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new z(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((z) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d dVar = this.u;
        a4j.a aVar2 = dVar.f99692y;
        BeneficiaryInfoState currentInfo = dVar.K2();
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(currentInfo, "currentInfo");
        InputTextDelegate.TextData textData = this.v;
        Intrinsics.checkNotNullParameter(textData, "textData");
        Field$BackendDefinition field$BackendDefinitionA = aVar2.a(currentInfo, textData.f52597a);
        String string = textData.f52598b.toString();
        return n4j.h.b(currentInfo, new Field$BackendDefinition.InputDefinition(field$BackendDefinitionA.getF99718a(), string, string, aVar2.f1286a.F(n4j.c.d(field$BackendDefinitionA.getF99718a(), string), field$BackendDefinitionA.getF99718a(), null)));
    }
}
