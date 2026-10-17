package v25;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.pockets.api.navigation.PocketDetailsDestination;
import com.revolut.feature.pockets.api.navigation.PocketDetailsFlowContract$InputData;
import com.revolut.feature.pockets.api.navigation.PocketDetailsInitialAction;
import efm.r;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import v20.s;
import v20.t;

/* JADX INFO: loaded from: classes22.dex */
public final class n extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f285662w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = oVar;
        this.f285662w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new n(this.v, this.f285662w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((n) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objC;
        io3.d dVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        String str = this.f285662w;
        o oVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            r map = m70.a.g(((y45.f) oVar.f285664m).k(str, w4l.j.f294644c), null, new g(5), 1).map(new t(new s(18), 19));
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            this.u = 1;
            objC = nim.a.c(map, this);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            objC = obj2;
        }
        q35.m mVar = (q35.m) objC;
        if (mVar != null && (dVar = mVar.f241831a) != null) {
            oVar.A2(new PocketDetailsDestination(new PocketDetailsFlowContract$InputData(dVar, (AccountId) AccountId.Personal.f51414a, true, true, (wi0.b) null, false, false, (CheckoutParams) null, (CheckoutOrder) null, (PocketDetailsInitialAction) null, false, 4080)));
            return Unit.f186387a;
        }
        String simpleName = oVar.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.WARNING, simpleName, p.a.p("External account Pocket must exist for loan: ", str, " but was missing"), null, null, 16);
        return Unit.f186387a;
    }
}
