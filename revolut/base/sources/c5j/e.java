package c5j;

import a83.c0;
import aw0.f4;
import bzg.t;
import cli.y;
import com.revolut.domain.models.beneficiary.BankFieldDefinition;
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
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MissingFieldsScreen f21566w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(MissingFieldsScreen missingFieldsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f21566w = missingFieldsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f21566w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f21566w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((s4j.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((f4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        MissingFieldsScreen missingFieldsScreen = this.f21566w;
        switch (i) {
            case 0:
                s4j.d data = (s4j.d) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVarE3 = missingFieldsScreen.d();
                Intrinsics.h(data);
                com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields.a aVar2 = (com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields.a) lVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                d5j.a aVar3 = aVar2.f99769q;
                y yVar = aVar2.f99772t;
                List currentDefinitions = ((j) ((j2) yVar.f22677a).getValue()).f21568a;
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(currentDefinitions, "currentDefinitions");
                Intrinsics.checkNotNullParameter(data, "data");
                Field$BackendDefinition field$BackendDefinitionA = aVar3.a(data.f259893a, currentDefinitions);
                BankFieldDefinition f99718a = field$BackendDefinitionA.getF99718a();
                String str = data.f259894b;
                String str2 = data.f259895c;
                aVar2.H2(yVar, new c0(12, d5j.a.b(currentDefinitions, new Field$BackendDefinition.InputDefinition(f99718a, str, str2, aVar3.f111420a.F(n4j.c.d(field$BackendDefinitionA.getF99718a(), str2), field$BackendDefinitionA.getF99718a(), Boolean.valueOf(data.d))))));
                break;
            default:
                f4 focusData = (f4) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVarE32 = missingFieldsScreen.d();
                Intrinsics.h(focusData);
                com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields.a aVar5 = (com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields.a) lVarE32;
                aVar5.getClass();
                Intrinsics.checkNotNullParameter(focusData, "focusData");
                aVar5.f99768p.b(focusData);
                aVar5.H2(aVar5.f99772t, new t(aVar5, 27));
                break;
        }
        return Unit.f186387a;
    }
}
