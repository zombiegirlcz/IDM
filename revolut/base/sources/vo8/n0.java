package vo8;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RowDelegate.Model f290897w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(RowDelegate.Model model, com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f290897w = model;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n0(this.f290897w, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
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
        RowDelegate.Model model = this.f290897w;
        String str = model.f53228a;
        com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b bVar = this.v;
        m0 m0Var = new m0(model, bVar, null);
        this.u = 1;
        Object objB = pu7.a.B(bVar.k, str, m0Var, this);
        return objB == aVar ? aVar : objB;
    }
}
