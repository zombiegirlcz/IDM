package iek;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.retail.feature.pod_nominees.impl.details.PodNomineeDetailsScreen;
import com.revolut.retail.feature.pod_nominees.impl.model.PodNominee;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PodNomineeDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PodNomineeDetailsScreen podNomineeDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = podNomineeDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Object obj3 = model != null ? model.f52715m : null;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.retail.feature.pod_nominees.impl.model.PodNominee");
        PodNominee podNominee = (PodNominee) obj3;
        n nVar = (n) ((i) this.v.Q.getValue());
        nVar.getClass();
        Intrinsics.checkNotNullParameter(podNominee, "podNominee");
        nVar.C2(new g(podNominee));
        return Unit.f186387a;
    }
}
