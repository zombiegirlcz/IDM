package yca;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.pix.screens.transfer_input_key.PixTransferInputKeyScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PixTransferInputKeyScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PixTransferInputKeyScreen pixTransferInputKeyScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pixTransferInputKeyScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((TextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TextDelegate.Model model = (TextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (Intrinsics.f(model.f53531a, "INPUT_BANK_DETAILS_LIST_ID")) {
            ((t) this.v.R2()).J2();
        }
        return Unit.f186387a;
    }
}
