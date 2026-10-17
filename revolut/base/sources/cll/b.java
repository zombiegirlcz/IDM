package cll;

import com.revolut.sso.impl.ui.card_pin.card_pin.enter_card_number.EnterCardNumberScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.a0;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EnterCardNumberScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(EnterCardNumberScreen enterCardNumberScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = enterCardNumberScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String strD;
        String str;
        int i = this.u;
        EnterCardNumberScreen enterCardNumberScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                enterCardNumberScreen.m2().onBackPressed();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar = (l) enterCardNumberScreen.c0.getValue();
                ell.a aVar3 = ((e) lVar.t2()).f25055b;
                if (aVar3 == null || (str = aVar3.f127526b) == null) {
                    strD = null;
                } else {
                    t0 t0Var = t0.f186434a;
                    m70.a.t(t0Var);
                    Intrinsics.checkNotNullParameter(t0Var, "<this>");
                    strD = a0.D(str, " ", "", false);
                }
                if (strD == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                lVar.v2(new g(strD));
                return Unit.f186387a;
        }
    }
}
