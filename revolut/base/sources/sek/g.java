package sek;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.feature.pod_nominees.impl.pod_nominees_list.PodNomineesListScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import sek.k;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ PodNomineesListScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(PodNomineesListScreen podNomineesListScreen, Continuation continuation) {
        super(2, continuation);
        this.u = podNomineesListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((r) this.u.R2()).C2(k.b.f262210a);
        return Unit.f186387a;
    }
}
