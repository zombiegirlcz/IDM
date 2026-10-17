package h2j;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.feature.balance.picker.impl.new_picker.dual.DualChooserScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DualChooserScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(DualChooserScreen dualChooserScreen, Continuation continuation) {
        super(2, continuation);
        this.v = dualChooserScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarE3 = this.v.R2();
        Intrinsics.h(model);
        ((com.revolut.retail.feature.balance.picker.impl.new_picker.dual.a) kVarE3).I2(model);
        return Unit.f186387a;
    }
}
