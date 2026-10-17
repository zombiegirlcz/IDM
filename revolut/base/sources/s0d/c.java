package s0d;

import aw0.n6;
import com.revolut.feature.semi_independent_activation.impl.ui.details.SemiIndependentActivationDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SemiIndependentActivationDetailsScreen f258940w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(SemiIndependentActivationDetailsScreen semiIndependentActivationDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f258940w = semiIndependentActivationDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f258940w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f258940w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n6 n6Var = (n6) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(n6Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        SemiIndependentActivationDetailsScreen semiIndependentActivationDetailsScreen = this.f258940w;
        switch (i) {
            case 0:
                n6 model = (n6) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVarE3 = semiIndependentActivationDetailsScreen.e3();
                Intrinsics.h(model);
                m mVar = (m) jVarE3;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                String strI2 = m.I2(model);
                if (strI2 != null) {
                    mVar.C2(new g(strI2));
                }
                break;
            default:
                n6 model2 = (n6) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVarE32 = semiIndependentActivationDetailsScreen.e3();
                Intrinsics.h(model2);
                m mVar2 = (m) jVarE32;
                mVar2.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                String strI22 = m.I2(model2);
                if (strI22 != null) {
                    mVar2.C2(new i(strI22));
                }
                break;
        }
        return Unit.f186387a;
    }
}
