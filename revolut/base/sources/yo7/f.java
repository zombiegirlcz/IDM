package yo7;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.driver.details.AdditionalDriverDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AdditionalDriverDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AdditionalDriverDetailsScreen additionalDriverDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = additionalDriverDetailsScreen;
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
        yhm.o.b(obj2);
        k kVarT2 = this.v.T2();
        String listId = textData.f52597a;
        String text = textData.f52598b.toString();
        s sVar = (s) kVarT2;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        if (Intrinsics.f(listId, "INPUT_FIRST_NAME")) {
            sVar.x2(new y9d.c(text, 14));
        } else if (Intrinsics.f(listId, "INPUT_LAST_NAME")) {
            sVar.x2(new y9d.c(text, 15));
        }
        return Unit.f186387a;
    }
}
