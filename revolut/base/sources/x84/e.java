package x84;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.hub.DebtsHubScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DebtsHubScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(DebtsHubScreen debtsHubScreen, Continuation continuation) {
        super(2, continuation);
        this.v = debtsHubScreen;
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
        m mVarH3 = this.v.T2();
        Intrinsics.h(model);
        q qVar = (q) mVarH3;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (a0.H(model.f53228a, "ITEM_DEBT_PREFIX_", false) && (obj3 instanceof pu3.b)) {
            qVar.v2(new k((pu3.b) obj3));
        }
        return Unit.f186387a;
    }
}
