package c5j;

import a83.c0;
import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$BackendDefinition;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields.MissingFieldsScreen;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ MissingFieldsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(MissingFieldsScreen missingFieldsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = missingFieldsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        l lVarE3 = this.v.d();
        Intrinsics.h(textData);
        com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields.a aVar2 = (com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields.a) lVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(textData, "textData");
        d5j.a aVar3 = aVar2.f99769q;
        y yVar = aVar2.f99772t;
        List currentDefinitions = ((j) ((j2) yVar.f22677a).getValue()).f21568a;
        aVar3.getClass();
        Intrinsics.checkNotNullParameter(currentDefinitions, "currentDefinitions");
        Intrinsics.checkNotNullParameter(textData, "textData");
        String str = textData.f52597a;
        if (aVar3.a(str, currentDefinitions).getF99718a().f == null) {
            List currentDefinitions2 = ((j) ((j2) yVar.f22677a).getValue()).f21568a;
            Intrinsics.checkNotNullParameter(currentDefinitions2, "currentDefinitions");
            Intrinsics.checkNotNullParameter(textData, "textData");
            Field$BackendDefinition field$BackendDefinitionA = aVar3.a(str, currentDefinitions2);
            String string = textData.f52598b.toString();
            aVar2.H2(yVar, new c0(12, d5j.a.b(currentDefinitions2, new Field$BackendDefinition.InputDefinition(field$BackendDefinitionA.getF99718a(), string, string, aVar3.f111420a.F(n4j.c.d(field$BackendDefinitionA.getF99718a(), string), field$BackendDefinitionA.getF99718a(), null)))));
        }
        return Unit.f186387a;
    }
}
