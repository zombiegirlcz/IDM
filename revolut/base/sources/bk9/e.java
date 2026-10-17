package bk9;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.pay_later.impl.ui.paymentoptions.preferred_schedule.PreferredScheduleController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zh9.w;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PreferredScheduleController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PreferredScheduleController preferredScheduleController, Continuation continuation) {
        super(2, continuation);
        this.v = preferredScheduleController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model option = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVarE3 = this.v.d();
        Intrinsics.h(option);
        j jVar = (j) gVarE3;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(option, "option");
        Object obj3 = option.k;
        w wVar = obj3 instanceof w ? (w) obj3 : null;
        if (wVar != null) {
            jVar.H2(jVar.f16292q, new bhl.g(wVar, 2));
        }
        return Unit.f186387a;
    }
}
