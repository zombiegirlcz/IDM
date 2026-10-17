package cll;

import com.revolut.sso.impl.ui.card_pin.card_pin.enter_card_number.EnterCardNumberScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EnterCardNumberScreen f25052w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(EnterCardNumberScreen enterCardNumberScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f25052w = enterCardNumberScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f25052w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f25052w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        EnterCardNumberScreen enterCardNumberScreen = this.f25052w;
        switch (i) {
            case 0:
                String value = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar = (l) enterCardNumberScreen.c0.getValue();
                lVar.getClass();
                Intrinsics.checkNotNullParameter(value, "value");
                lVar.x2(new c7e.i(lVar, value, 29));
                break;
            default:
                ty0.a aVar2 = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar2 = (l) enterCardNumberScreen.c0.getValue();
                lVar2.getClass();
                if (Intrinsics.f(aVar2 != null ? aVar2.f275445a : null, "CLICK_ID_FORGOT_CARD_NUMBER")) {
                    lVar2.v2(f.f25056a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
