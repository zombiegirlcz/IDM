package iqg;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.SpareChangeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ SpareChangeScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SpareChangeScreen spareChangeScreen, Continuation continuation) {
        super(2, continuation);
        this.u = spareChangeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.b bVar = (com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.b) this.u.R2();
        bVar.getClass();
        bVar.n2(new n(bVar, null, 1), new whi.b(6));
        return Unit.f186387a;
    }
}
