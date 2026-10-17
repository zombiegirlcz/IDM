package nxa;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.referrals.impl.personalized_tracking.PersonalizedTrackingController;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PersonalizedTrackingController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(PersonalizedTrackingController personalizedTrackingController, Continuation continuation) {
        super(2, continuation);
        this.v = personalizedTrackingController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.referrals.impl.personalized_tracking.a aVar2 = (com.revolut.feature.referrals.impl.personalized_tracking.a) pVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f51822a, "NEED_MORE_HELP_LIST_ID")) {
            pwa.n f81791b = aVar2.o.getF81791b();
            switch (f81791b == null ? -1 : x.f220538a[f81791b.ordinal()]) {
                case -1:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    aVar2.C1(aVar2.f81795r.a());
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    aVar2.C1(aVar2.f81796s.a());
                    break;
                case 2:
                    aVar2.f81797t.getClass();
                    aVar2.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("category.referrals", 14), (SharedFaqDestination.PassthroughData) null, false, 14));
                    break;
            }
        }
        return Unit.f186387a;
    }
}
