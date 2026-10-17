package ij4;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.valuators.list.ValuatorsListScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ ValuatorsListScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ValuatorsListScreen valuatorsListScreen, Continuation continuation) {
        super(2, continuation);
        this.u = valuatorsListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVarR2 = this.u.R2();
        jVarR2.H2(jVarR2.f161707p, new igh.k(23));
        jVarR2.n2(new hy2.e(jVarR2, null, 27), new ii4.b(jVarR2, 5));
        return Unit.f186387a;
    }
}
