package zze;

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
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.google_pay.flow.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.feature.topup_screen.impl.google_pay.flow.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        boolean z = n1Var instanceof l1;
        com.revolut.feature.topup_screen.impl.google_pay.flow.b bVar = this.v;
        if (z || (n1Var instanceof k1)) {
            oki.h.D2(bVar.B);
        } else if (n1Var instanceof j1) {
            ty0.a aVar2 = ((j1) n1Var).f216180b;
            if (Intrinsics.f(aVar2.f275445a, "UNABLE_TO_CONFIRM_NAME_LEARN_MORE_ID")) {
                bVar.B2();
                bVar.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("question.card-deposit-limits-and-fees", 14), (SharedFaqDestination.PassthroughData) null, false, 14));
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Unexpected clause click id ", aVar2.f275445a));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
            }
        } else {
            if (!(n1Var instanceof m1)) {
                throw new NoWhenBranchMatchedException();
            }
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Unexpected result ".concat(n1Var.getClass().getSimpleName()));
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2, h0Var2);
        }
        return Unit.f186387a;
    }
}
