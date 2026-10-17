package zs9;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.payments.groups.impl.ui_new.customize.GroupCustomizationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ GroupCustomizationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(GroupCustomizationScreen groupCustomizationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = groupCustomizationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarI3 = this.v.T2();
        Intrinsics.h(model);
        z zVar = (z) rVarI3;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f53228a, "GROUP_SMART_SETTLEMENT_TOGGLE_LIST_ID")) {
            zVar.x2(new t(zVar, 0));
        }
        return Unit.f186387a;
    }
}
