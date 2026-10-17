package v0f;

import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;

/* JADX INFO: loaded from: classes8.dex */
public final class l0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.screens.card_details.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.revolut.feature.topup_screen.impl.screens.card_details.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l0 l0Var = new l0(this.v, continuation);
        l0Var.u = obj2;
        return l0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (!(n1Var instanceof l1) && !(n1Var instanceof k1)) {
            if (n1Var instanceof j1) {
                if (Intrinsics.f(((j1) n1Var).f216180b.f275445a, "CARDHOLDER_VERIFICATION_FAILED_LEARN_MORE_ID")) {
                    this.v.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("question.card-deposit-limits-and-fees", 10), (SharedFaqDestination.PassthroughData) null, false, 14));
                }
            } else {
                if (!(n1Var instanceof m1)) {
                    throw new NoWhenBranchMatchedException();
                }
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unexpected result ".concat(n1Var.getClass().getSimpleName()));
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
            }
        }
        return Unit.f186387a;
    }
}
