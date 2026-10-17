package wff;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.transaction.troubleshooter.impl.ui.flow.screen.detail.TroubleshooterDetailScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TroubleshooterDetailScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TroubleshooterDetailScreen troubleshooterDetailScreen, Continuation continuation) {
        super(2, continuation);
        this.v = troubleshooterDetailScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model clickData = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarI3 = this.v.T2();
        Intrinsics.h(clickData);
        x xVar = (x) oVarI3;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        xVar.f297107q.o1(clickData, new ep6.g());
        return Unit.f186387a;
    }
}
