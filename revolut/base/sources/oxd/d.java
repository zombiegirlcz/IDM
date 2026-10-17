package oxd;

import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.feature.standingordertopup.impl.ui.screen.auto_top_up_methods.AutoTopUpMethodsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AutoTopUpMethodsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AutoTopUpMethodsScreen autoTopUpMethodsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = autoTopUpMethodsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((TopupMethod.StoredMethod) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TopupMethod.StoredMethod method = (TopupMethod.StoredMethod) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVar = (o) ((k) this.v.N.getValue());
        oVar.getClass();
        Intrinsics.checkNotNullParameter(method, "method");
        oVar.C2(new i(method));
        oVar.B2();
        return Unit.f186387a;
    }
}
