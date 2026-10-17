package j32;

import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.feature.apm.core.ui.impl.ui.pending_payments.consent.confirmed.ApmConfirmedScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ ApmConfirmedScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ApmConfirmedScreen apmConfirmedScreen, Continuation continuation) {
        super(2, continuation);
        this.u = apmConfirmedScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((PromptContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, ((g) ((e) this.u.O.getValue())).o);
        return Unit.f186387a;
    }
}
