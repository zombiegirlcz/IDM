package htf;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.transfer_reasons.impl.ui.reasons.TransferReasonsScreen;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonCategory;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransferReasonsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TransferReasonsScreen transferReasonsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transferReasonsScreen;
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
        o oVarE3 = this.v.d();
        Intrinsics.h(model);
        r rVar = (r) oVarE3;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52613a, "MAIN_REASON_SEE_ALL_ID")) {
            Object obj3 = model.i;
            TransferReasonCategory transferReasonCategory = obj3 instanceof TransferReasonCategory ? (TransferReasonCategory) obj3 : null;
            if (transferReasonCategory != null) {
                rVar.C2(new k(transferReasonCategory));
            }
        }
        return Unit.f186387a;
    }
}
