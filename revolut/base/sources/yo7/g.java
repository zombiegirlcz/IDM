package yo7;

import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.driver.details.AdditionalDriverDetailsScreen;
import ip0.y;
import kl7.n1;
import kl7.p1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AdditionalDriverDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AdditionalDriverDetailsScreen additionalDriverDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = additionalDriverDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y yVar = (y) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarT2 = this.v.T2();
        Object obj3 = yVar.f167227c;
        Object obj4 = yVar.f167226b.f58324n;
        s sVar = (s) kVarT2;
        sVar.getClass();
        Intrinsics.i(obj4, "null cannot be cast to non-null type kotlin.Boolean");
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        if (obj3 == p1.PENALTY_BY_JUDGE) {
            sVar.x2(new xyh.n(zBooleanValue, 13));
        } else if (obj3 == p1.PENALTY_FOR_SPECIFIC_REASONS) {
            sVar.x2(new xyh.n(zBooleanValue, 14));
        } else {
            if (!(obj3 instanceof n1)) {
                throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.l(obj3, "unexpected question "));
            }
            p1 p1Var = ((n1) obj3).f185363b;
            int i = r.f315631a[p1Var.ordinal()];
            if (i == 3) {
                sVar.x2(new rhg.n(obj3, zBooleanValue, 2));
            } else {
                if (i != 4) {
                    throw new IllegalStateException(("unexpected question " + p1Var).toString());
                }
                sVar.x2(new rhg.n(obj3, zBooleanValue, 3));
            }
        }
        return Unit.f186387a;
    }
}
