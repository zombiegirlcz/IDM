package n9c;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.revolutpay.impl.ui.shops.what_is.WhatIsRevolutPayScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ WhatIsRevolutPayScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(WhatIsRevolutPayScreen whatIsRevolutPayScreen, Continuation continuation) {
        super(2, continuation);
        this.u = whatIsRevolutPayScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        this.u.m2().onBackPressed();
        return Unit.f186387a;
    }
}
