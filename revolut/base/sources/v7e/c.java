package v7e;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.subaccount.impl.ui.create.screen.info.SubaccountInfoPickerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SubaccountInfoPickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SubaccountInfoPickerScreen subaccountInfoPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = subaccountInfoPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarI3 = this.v.T2();
        String value = textData.f52598b.toString();
        String inputId = textData.f52597a;
        u uVar = (u) kVarI3;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(inputId, "inputId");
        if (Intrinsics.f(inputId, "NAME_EDIT_DELEGATE_MODEL_ID")) {
            uVar.x2(new uo7.k(value, 28));
        }
        return Unit.f186387a;
    }
}
