package hw1;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.apm.breb.impl.ui.new_contact.BrebNewContactScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BrebNewContactScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(BrebNewContactScreen brebNewContactScreen, Continuation continuation) {
        super(2, continuation);
        this.v = brebNewContactScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        s sVarE3 = this.v.d();
        Intrinsics.h(model);
        u uVar = (u) sVarE3;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52580a, "KEY_INPUT_ID")) {
            uVar.C2(q.f156046a);
        }
        return Unit.f186387a;
    }
}
