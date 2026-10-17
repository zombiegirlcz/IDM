package oog;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.user_declarations.shared.flows.place_of_birth.screen.PlaceOfBirthScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PlaceOfBirthScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PlaceOfBirthScreen placeOfBirthScreen, Continuation continuation) {
        super(2, continuation);
        this.v = placeOfBirthScreen;
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
        InputTextDelegate.TextData data = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVarE3 = this.v.R2();
        Intrinsics.h(data);
        com.revolut.feature.user_declarations.shared.flows.place_of_birth.screen.a aVar2 = (com.revolut.feature.user_declarations.shared.flows.place_of_birth.screen.a) iVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        if (Intrinsics.f(data.f52597a, "CITY_LIST_ID")) {
            aVar2.H2(aVar2.u, new ak8.i(data, 16));
        }
        return Unit.f186387a;
    }
}
