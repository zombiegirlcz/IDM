package pqa;

import aw0.f4;
import cli.y;
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
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AdditionalFieldsScreen f238707w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(AdditionalFieldsScreen additionalFieldsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f238707w = additionalFieldsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f238707w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f238707w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((uqa.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((f4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AdditionalFieldsScreen additionalFieldsScreen = this.f238707w;
        switch (i) {
            case 0:
                uqa.a data = (uqa.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVarE3 = additionalFieldsScreen.d();
                Intrinsics.h(data);
                com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.a aVar2 = (com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.a) kVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                qqa.a aVar3 = aVar2.f81556q;
                y yVar = aVar2.f81557r;
                List currentFields = ((i) ((j2) yVar.f22677a).getValue()).f238709a;
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(currentFields, "currentFields");
                Intrinsics.checkNotNullParameter(data, "data");
                AdditionalFieldInput.TextInput textInputA = aVar3.a(data.f282114a, currentFields);
                String str = data.f282115b;
                String str2 = data.f282116c;
                TextFieldContent textFieldContent = textInputA.f81563b;
                aVar2.H2(yVar, new jeg.i(21, qqa.a.b(currentFields, AdditionalFieldInput.TextInput.a(textInputA, str, str2, vqa.a.a(tqa.c.a(str2, textFieldContent.e), textFieldContent.f81521c, textFieldContent.f81519a, data.d)))));
                break;
            default:
                f4 focusData = (f4) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVarE32 = additionalFieldsScreen.d();
                Intrinsics.h(focusData);
                com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.a aVar5 = (com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.a) kVarE32;
                aVar5.getClass();
                Intrinsics.checkNotNullParameter(focusData, "focusData");
                aVar5.f81555p.b(focusData);
                aVar5.H2(aVar5.f81557r, new pp5.d(aVar5, 7));
                break;
        }
        return Unit.f186387a;
    }
}
