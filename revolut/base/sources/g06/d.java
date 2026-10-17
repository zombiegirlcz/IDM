package g06;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.customer_present.tips.impl.screen.select_tip.SelectTipScreen;
import g06.f;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SelectTipScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SelectTipScreen selectTipScreen, Continuation continuation) {
        super(2, continuation);
        this.v = selectTipScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Object obj3 = model.i;
        boolean z = obj3 instanceof dj0.d;
        SelectTipScreen selectTipScreen = this.v;
        if (z) {
            dj0.d tipAmount = (dj0.d) obj3;
            l lVar = (l) selectTipScreen.R2();
            lVar.getClass();
            Intrinsics.checkNotNullParameter(tipAmount, "tipAmount");
            lVar.C2(new g(tipAmount));
        } else if (obj3 instanceof String) {
            ((l) selectTipScreen.R2()).C2(f.b.f139355a);
        }
        return Unit.f186387a;
    }
}
