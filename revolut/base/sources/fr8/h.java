package fr8;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.junior_transfer.impl.ui.screen.JuniorTransferAmountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorTransferAmountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(JuniorTransferAmountScreen juniorTransferAmountScreen, Continuation continuation) {
        super(2, continuation);
        this.v = juniorTransferAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarT2 = this.v.T2();
        String note = textData.f52598b.toString();
        rVarT2.getClass();
        Intrinsics.checkNotNullParameter(note, "note");
        rVarT2.x2(new f9g.l(note, 18));
        return Unit.f186387a;
    }
}
