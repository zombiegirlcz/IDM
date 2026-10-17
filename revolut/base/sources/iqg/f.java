package iqg;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.SpareChangeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ SpareChangeScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SpareChangeScreen spareChangeScreen, Continuation continuation) {
        super(2, continuation);
        this.u = spareChangeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.b) this.u.R2()).f94749r.a();
        return Unit.f186387a;
    }
}
