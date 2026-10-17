package qhb;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.email_payroll.review_email.ReviewEmailBottomSheetController;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import qg7.v;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ ReviewEmailBottomSheetController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ReviewEmailBottomSheetController reviewEmailBottomSheetController, Continuation continuation) {
        super(2, continuation);
        this.u = reviewEmailBottomSheetController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.u.V.getValue();
        fVar.H2(fVar.f246597p, new v(3));
        fVar.l2(new e(fVar, null, 0), new qgf.o(fVar, 3));
        return Unit.f186387a;
    }
}
