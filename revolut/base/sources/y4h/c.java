package y4h;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.wealth.assetdetails.ui.impl.ratings.credit_quality.CreditQualityScreen;
import com.revolut.feature.wealth.assetdetails.ui.impl.ratings.credit_quality.CreditQualityScreenContract$InputData;
import com.revolut.feature.wealth.assetdetails.ui.impl.ratings.credit_quality.CreditQualityScreenContract$RatingsContext;
import com.revolut.feature.wealth.assetdetails.ui.impl.ratings.details.RatingsDetailsScreen;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RatingsDetailsScreen f310937w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RatingsDetailsScreen ratingsDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.f310937w = ratingsDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.f310937w, continuation);
        cVar.v = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            e eVar = (e) this.f310937w.f95435d0.getValue();
            Intrinsics.h(model);
            this.v = null;
            this.u = 1;
            g gVar = (g) eVar;
            gVar.getClass();
            Object obj3 = model.o;
            if (obj3 instanceof CreditQualityScreenContract$RatingsContext) {
                l.j2(gVar, new CreditQualityScreen(new CreditQualityScreenContract$InputData((CreditQualityScreenContract$RatingsContext) obj3)), ModalDestination.Style.POPUP.f98311a, null, 2);
            }
            if (Unit.f186387a == aVar) {
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
