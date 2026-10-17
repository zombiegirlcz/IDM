package od3;

import com.revolut.core.ui_kit.views.ActionsView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class n0 extends gim.i implements Function2 {
    public s0 u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s0 f224287w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ActionsView.Item f224288x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(ActionsView.Item item, Continuation continuation, s0 s0Var) {
        super(2, continuation);
        this.f224287w = s0Var;
        this.f224288x = item;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n0(this.f224288x, continuation, this.f224287w);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        s0 s0Var;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            s0 s0Var2 = this.f224287w;
            nd3.j jVar = s0Var2.f224304x;
            xfa.b bVar = xfa.b.YOUR_CASHBACK;
            Object obj3 = this.f224288x.f58324n;
            hha.u uVar = obj3 instanceof hha.u ? (hha.u) obj3 : null;
            if (uVar == null) {
                throw new NullPointerException(a0.d.m(obj3, "parcel should be PricingPlanFeature but was "));
            }
            this.u = s0Var2;
            this.v = 1;
            Object objA = jVar.a(bVar, null, uVar, this);
            if (objA == aVar) {
                return aVar;
            }
            s0Var = s0Var2;
            obj2 = objA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s0Var = this.u;
            yhm.o.b(obj2);
        }
        return s0Var.C1((aii.u) obj2);
    }
}
