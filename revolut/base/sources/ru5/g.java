package ru5;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.crypto_investments.impl.ui.screens.activity.ActivityScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ActivityScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ActivityScreen activityScreen, Continuation continuation) {
        super(2, continuation);
        this.v = activityScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarI3 = this.v.T2();
        Intrinsics.h(model);
        z zVar = (z) kVarI3;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        zVar.n2(new w(model, zVar, null), new whi.b(6));
        return Unit.f186387a;
    }
}
