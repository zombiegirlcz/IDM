package mp6;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import ep6.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mhd.p0;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ n u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(n nVar, Continuation continuation) {
        super(2, continuation);
        this.u = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVar = this.u;
        ep6.c cVar = (ep6.c) nVar.u.a();
        if (cVar instanceof ep6.d) {
            ep6.d dVar = (ep6.d) cVar;
            yo6.d referenceType = dVar.f128085b;
            String referenceId = dVar.f128084a;
            yo6.c cVar2 = dVar.f128086c;
            Intrinsics.checkNotNullParameter(referenceType, "referenceType");
            Intrinsics.checkNotNullParameter(referenceId, "referenceId");
            ep6.f feedbackParams = ep6.f.f128088a;
            Intrinsics.checkNotNullParameter(feedbackParams, "feedbackParams");
            nVar.T2(new p0(nVar, new jld.h(11, nVar, referenceType, referenceId, cVar2, null), (Continuation) null), new yi5.b(27));
        } else if (!(cVar instanceof c.a)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f186387a;
    }
}
