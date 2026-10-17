package v4h;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.wealth.assetdetails.ui.impl.ratings.credit_quality.CreditQualityScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CreditQualityScreen f286093w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CreditQualityScreen creditQualityScreen, Continuation continuation) {
        super(2, continuation);
        this.f286093w = creditQualityScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.f286093w, continuation);
        cVar.v = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            f fVar = (f) this.f286093w.Q.getValue();
            Intrinsics.h(model);
            this.v = null;
            this.u = 1;
            com.revolut.feature.wealth.assetdetails.ui.impl.ratings.credit_quality.b bVar = (com.revolut.feature.wealth.assetdetails.ui.impl.ratings.credit_quality.b) fVar;
            bVar.getClass();
            if (pu7.a.B(bVar.k, "onRowDelegateTitleBadgeClick", new com.revolut.feature.wealth.assetdetails.ui.impl.ratings.credit_quality.a(model, bVar, null), this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
