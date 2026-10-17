package mek;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.feature.pod_nominees.impl.edit.PodNomineeEditScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PodNomineeEditScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PodNomineeEditScreen podNomineeEditScreen, Continuation continuation) {
        super(2, continuation);
        this.v = podNomineeEditScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.retail.feature.pod_nominees.impl.edit.c cVar = (com.revolut.retail.feature.pod_nominees.impl.edit.c) jVarE3;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f53228a, "USE_MY_ADDRESS_ID")) {
            cVar.H2(cVar.f102602t, new md0.c(13));
        }
        return Unit.f186387a;
    }
}
