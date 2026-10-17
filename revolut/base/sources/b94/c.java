package b94;

import android.view.View;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DebtDetailsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ View v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ DebtDetailsController f13643w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(View view, DebtDetailsController debtDetailsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = view;
        this.f13643w = debtDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, this.f13643w, continuation, 0);
            default:
                return new c(this.v, this.f13643w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        DebtDetailsController debtDetailsController = this.f13643w;
        View view = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                kli.c.c(view, false);
                ((com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.a) debtDetailsController.e3()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                kli.c.c(view, false);
                ((com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.a) debtDetailsController.e3()).J2();
                break;
        }
        return Unit.f186387a;
    }
}
