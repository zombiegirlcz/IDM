package iek;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.feature.pod_nominees.impl.details.PodNomineeDetailsScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PodNomineeDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PodNomineeDetailsScreen podNomineeDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = podNomineeDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        n nVar = (n) ((i) this.v.Q.getValue());
        nVar.getClass();
        if (Intrinsics.f(model != null ? model.f53228a : null, "DELETE_ROW_ID")) {
            nVar.l2(new m(nVar, null), new yi5.b(26));
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Unknown ", model != null ? model.f53228a : null));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.WARNING, null, null, illegalArgumentException, h0Var);
        }
        return Unit.f186387a;
    }
}
