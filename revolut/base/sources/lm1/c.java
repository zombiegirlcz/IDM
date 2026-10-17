package lm1;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.apm.bills.billers.impl.ui.search.BillerSearchScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BillerSearchScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BillerSearchScreen billerSearchScreen, Continuation continuation) {
        super(2, continuation);
        this.v = billerSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        boolean zF = Intrinsics.f(model.f52373a, "ERROR_STATE_ID");
        BillerSearchScreen billerSearchScreen = this.v;
        if (zF) {
            j jVarE3 = billerSearchScreen.d();
            jVarE3.l2(new ll6.i(jVarE3, ((e) ((j2) jVarE3.f196862q.f22677a).getValue()).f196854b, null, 9), new yi5.b(26));
        } else {
            KProperty[] kPropertyArr = BillerSearchScreen.S;
            billerSearchScreen.d3().f174539b.i0();
        }
        return Unit.f186387a;
    }
}
