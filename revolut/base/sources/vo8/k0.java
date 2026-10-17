package vo8;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class k0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ LargeActionButtonDelegate.Model f290889w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(LargeActionButtonDelegate.Model model, com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f290889w = model;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k0(this.f290889w, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        LargeActionButtonDelegate.Model model = this.f290889w;
        String str = model.f52613a;
        com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b bVar = this.v;
        j0 j0Var = new j0(model, bVar, null);
        this.u = 1;
        Object objB = pu7.a.B(bVar.k, str, j0Var, this);
        return objB == aVar ? aVar : objB;
    }
}
