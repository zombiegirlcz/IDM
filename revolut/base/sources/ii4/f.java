package ii4;

import com.revolut.feature.credit.application.plugins.api.models.config.SpinnerConfiguration;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.y0;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.spinner.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.credit.application.plugins.impl.ui.spinner.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((SpinnerConfiguration.Content.SpinnerContent) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SpinnerConfiguration.Content.SpinnerContent spinnerContent = (SpinnerConfiguration.Content.SpinnerContent) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        y0 y0VarP2 = com.revolut.feature.credit.application.plugins.impl.ui.spinner.a.P2(spinnerContent);
        com.revolut.feature.credit.application.plugins.impl.ui.spinner.a aVar2 = this.v;
        yji.l.a1(aVar2, aVar2.X1(y0VarP2), null, null, null, 7);
        return Unit.f186387a;
    }
}
