package lpd;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.edit.EditCycleScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EditCycleScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EditCycleScreen editCycleScreen, Continuation continuation) {
        super(2, continuation);
        this.v = editCycleScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((SingleChoiceDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SingleChoiceDelegate.Model model = (SingleChoiceDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarG3 = this.v.T2();
        Intrinsics.h(model);
        r rVar = (r) nVarG3;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f;
        k iVar = null;
        if (obj3 instanceof d) {
            k kVar = ((l) rVar.t2()).f198977a;
            e eVar = kVar instanceof e ? (e) kVar : null;
            if (eVar != null) {
                iVar = e.a(eVar, 0, (d) obj3, 15);
            }
        } else if (obj3 instanceof h) {
            k kVar2 = ((l) rVar.t2()).f198977a;
            i iVar2 = kVar2 instanceof i ? (i) kVar2 : null;
            if (iVar2 != null) {
                h choice = (h) obj3;
                lzi.e cycle = iVar2.f198972a;
                boolean z = iVar2.f198974c;
                Intrinsics.checkNotNullParameter(cycle, "cycle");
                Intrinsics.checkNotNullParameter(choice, "choice");
                iVar = new i(cycle, choice, z);
            }
        }
        if (iVar != null) {
            rVar.x2(new p(iVar, 0));
        }
        return Unit.f186387a;
    }
}
