package nwc;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.security_hub.impl.ui.wealth_protection.WealthProtectionScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ WealthProtectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(WealthProtectionScreen wealthProtectionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = wealthProtectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarD3 = this.v.R2();
        String listId = model.f52613a;
        p pVar = (p) lVarD3;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "WEALTH_PROTECTION_LEARN_MORE_DIALOG_ACTION_ID")) {
            j60.a.v(pVar.f219832r, false, null, 3);
        }
        return Unit.f186387a;
    }
}
