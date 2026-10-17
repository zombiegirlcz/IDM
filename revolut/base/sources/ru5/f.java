package ru5;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.crypto_investments.impl.ui.screens.activity.ActivityScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ActivityScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ActivityScreen activityScreen, Continuation continuation) {
        super(2, continuation);
        this.v = activityScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ActivityScreen activityScreen = this.v;
        k kVarI3 = activityScreen.T2();
        Intrinsics.h(model);
        z zVar = (z) kVarI3;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.k;
        boolean zF = Intrinsics.f(obj3, pt5.d.f239615a);
        pt5.e eVar = pt5.e.f239616a;
        if (zF) {
            zVar.x2(new rsl.c(24));
        } else if (Intrinsics.f(obj3, eVar)) {
            zVar.x2(new rsl.c(26));
        }
        if (Intrinsics.f(obj3, eVar)) {
            activityScreen.h3().f168518c.i0();
        }
        return Unit.f186387a;
    }
}
