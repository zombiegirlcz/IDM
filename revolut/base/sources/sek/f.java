package sek;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.feature.pod_nominees.impl.model.PodNominee;
import com.revolut.retail.feature.pod_nominees.impl.pod_nominees_list.PodNomineesListScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PodNomineesListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PodNomineesListScreen podNomineesListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = podNomineesListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.R2();
        Intrinsics.h(model);
        r rVar = (r) mVarE3;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof PodNominee) {
            rVar.C2(new l(((PodNominee) obj3).f102617a));
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("onRowItemClicked - Could not handle listId = ", model.f53228a));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        }
        return Unit.f186387a;
    }
}
