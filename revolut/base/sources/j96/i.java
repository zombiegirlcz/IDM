package j96;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.direct_deposit.impl.ui_kompot.screen.setup.DirectDepositSetupScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DirectDepositSetupScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(DirectDepositSetupScreen directDepositSetupScreen, Continuation continuation) {
        super(2, continuation);
        this.v = directDepositSetupScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        c cVarE3 = this.v.R2();
        Intrinsics.h(textData);
        ((l) cVarE3).I2(textData);
        return Unit.f186387a;
    }
}
