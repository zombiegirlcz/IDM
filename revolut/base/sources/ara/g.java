package ara;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.push_to_card.api.navigation.creation.CardOwnerInfoState;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.CardOwnerMainInfoScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CardOwnerMainInfoScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CardOwnerMainInfoScreen cardOwnerMainInfoScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cardOwnerMainInfoScreen;
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
        yhm.o.b(obj2);
        q qVarE3 = this.v.d();
        Intrinsics.h(textData);
        com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.a aVar2 = (com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.a) qVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(textData, "textData");
        bra.g gVar = aVar2.f81580q;
        CardOwnerInfoState currentInfo = aVar2.I2();
        gVar.getClass();
        Intrinsics.checkNotNullParameter(currentInfo, "currentInfo");
        Intrinsics.checkNotNullParameter(textData, "textData");
        String str = textData.f52597a;
        CharSequence charSequence = textData.f52598b;
        if (Intrinsics.f(str, "FIELD_FIRST_NAME")) {
            currentInfo = CardOwnerInfoState.a(currentInfo, false, null, charSequence.toString(), null, null, 27);
        } else if (Intrinsics.f(str, "FIELD_LAST_NAME")) {
            currentInfo = CardOwnerInfoState.a(currentInfo, false, null, null, charSequence.toString(), null, 23);
        }
        aVar2.H2(aVar2.f81586y, new s(currentInfo, 1));
        return Unit.f186387a;
    }
}
