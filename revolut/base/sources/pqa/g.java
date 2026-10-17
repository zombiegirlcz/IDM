package pqa;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.push_to_card.api.model.TextFieldContent;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.AdditionalFieldsScreen;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.model.AdditionalFieldInput;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AdditionalFieldsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AdditionalFieldsScreen additionalFieldsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = additionalFieldsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        k kVarE3 = this.v.d();
        Intrinsics.h(textData);
        com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.a aVar2 = (com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.a) kVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(textData, "textData");
        y yVar = aVar2.f81557r;
        List currentFields = ((i) ((j2) yVar.f22677a).getValue()).f238709a;
        qqa.a aVar3 = aVar2.f81556q;
        aVar3.getClass();
        Intrinsics.checkNotNullParameter(currentFields, "currentFields");
        Intrinsics.checkNotNullParameter(textData, "textData");
        String str = textData.f52597a;
        if (aVar3.a(str, currentFields).f81563b.e == null) {
            List currentFields2 = ((i) ((j2) yVar.f22677a).getValue()).f238709a;
            Intrinsics.checkNotNullParameter(currentFields2, "currentFields");
            Intrinsics.checkNotNullParameter(textData, "textData");
            AdditionalFieldInput.TextInput textInputA = aVar3.a(str, currentFields2);
            String string = textData.f52598b.toString();
            TextFieldContent textFieldContent = textInputA.f81563b;
            aVar2.H2(yVar, new jeg.i(21, qqa.a.b(currentFields2, AdditionalFieldInput.TextInput.a(textInputA, string, string, vqa.a.a(tqa.c.a(string, textFieldContent.e), textFieldContent.f81521c, textFieldContent.f81519a, false)))));
        }
        return Unit.f186387a;
    }
}
