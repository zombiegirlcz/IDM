package o27;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.freelancer.impl.ui.sales.refund.screen.FreelancerRefundScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerRefundScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(FreelancerRefundScreen freelancerRefundScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerRefundScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarE3 = this.v.R2();
        String listId = textData.f52597a;
        CharSequence text = textData.f52598b;
        com.revolut.feature.freelancer.impl.ui.sales.refund.screen.b bVar = (com.revolut.feature.freelancer.impl.ui.sales.refund.screen.b) pVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        if (Intrinsics.f(listId, "LIST_ID_REASON_INPUT")) {
            bVar.H2(bVar.z, new a2f.k(10, text));
        }
        return Unit.f186387a;
    }
}
