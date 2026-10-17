package eg2;

import cli.y;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.apm.upi.impl.flow.screen.review.UpiTransferReviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ UpiTransferReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(UpiTransferReviewScreen upiTransferReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = upiTransferReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (Intrinsics.f(model.f51832a, "ID_TRANSFER_REVIEW_SCHEDULED_DATE")) {
            u uVar = (u) this.v.R2();
            zjh.c cVar = uVar.f125542r;
            y yVar = uVar.u;
            yji.l.g2(uVar, cVar.l(((g) ((j2) yVar.f22677a).getValue()).f125529g, ((g) ((j2) yVar.f22677a).getValue()).d), null, new e87.e(uVar, 22), 1);
        }
        return Unit.f186387a;
    }
}
