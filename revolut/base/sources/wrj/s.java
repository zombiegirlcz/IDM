package wrj;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.goals.upcoming_payments.UpcomingPaymentsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import wp5.e0;
import wp5.x;

/* JADX INFO: loaded from: classes11.dex */
public final class s extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ UpcomingPaymentsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(UpcomingPaymentsScreen upcomingPaymentsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = upcomingPaymentsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        s sVar = new s(this.v, continuation);
        sVar.u = obj2;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.u;
        qua.p recurringPayment = obj3 instanceof qua.p ? (qua.p) obj3 : null;
        if (recurringPayment != null) {
            l lVar = (l) ((b) this.v.f101529a0.getValue());
            lVar.getClass();
            Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
            pfm.a aVar2 = new pfm.a(((rae.c) lVar.f299610t).c(recurringPayment, false), new x(new i(lVar, 0), 8), 4);
            Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
            pfm.a aVar3 = new pfm.a(aVar2, new tsk.t(new e0(new BreadcrumbException(), 29)), 2);
            Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
            Intrinsics.checkNotNullExpressionValue(aVar3.w(new o9h.d(25, k.f299605a), j.f299604a), "subscribe(...)");
        }
        return Unit.f186387a;
    }
}
