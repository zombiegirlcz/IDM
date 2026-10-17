package ts6;

import com.revolut.feature.revolut_shop.api.RevolutShopDestination$InputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.freelancer.revolut_shop.api.FreelancerRevolutShopDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s0 f274001w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ jf0.c f274002x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(s0 s0Var, jf0.c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f274001w = s0Var;
        this.f274002x = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e0(this.f274001w, this.f274002x, continuation, 0);
            default:
                return new e0(this.f274001w, this.f274002x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                s0 s0Var = this.f274001w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    gr6.e eVar = s0Var.d;
                    this.v = 1;
                    obj2 = ((et6.l0) eVar).h(this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            yhm.o.b(obj2);
                            return new BridgeDestination((NaviCommand) obj2);
                        }
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return new BridgeDestination((NaviCommand) obj2);
                    }
                    yhm.o.b(obj2);
                }
                if (!((Boolean) obj2).booleanValue()) {
                    return new BridgeDestination(s0Var.h());
                }
                String strE = this.f274002x.e(3);
                if (Intrinsics.f(strE, "create")) {
                    this.v = 2;
                    hr6.k[] elements = {hr6.k.PRO_REGULAR, hr6.k.PRO_TAX};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    obj2 = s0Var.o(kotlin.collections.d.y0(elements), this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                    return new BridgeDestination((NaviCommand) obj2);
                }
                if (!Intrinsics.f(strE, "tax")) {
                    return new BridgeDestination(s0Var.h());
                }
                this.v = 3;
                obj2 = s0.b(s0Var, this);
                if (obj2 == aVar) {
                    return aVar;
                }
                return new BridgeDestination((NaviCommand) obj2);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                s0 s0Var2 = this.f274001w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    gr6.e eVar2 = s0Var2.d;
                    this.v = 1;
                    obj2 = ((et6.l0) eVar2).d(this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return new BridgeDestination((NaviCommand) obj2);
                    }
                    yhm.o.b(obj2);
                }
                if (!((Boolean) obj2).booleanValue()) {
                    return new BridgeDestination(s0Var2.h());
                }
                jf0.c deeplink = this.f274002x;
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                String strE2 = deeplink.e(3);
                String strE3 = deeplink.e(4);
                int length = strE2.length();
                RevolutShopDestination$InputData.Catalog catalog = RevolutShopDestination$InputData.Catalog.f84188a;
                FeatureCommand featureCommandF = zh9.u0.f(length == 0 ? new FreelancerRevolutShopDestination(catalog) : (!strE2.equals("product") || strE3.length() <= 0) ? (strE2.equals("orders") && strE3.length() == 0) ? new FreelancerRevolutShopDestination(RevolutShopDestination$InputData.OrderHistory.f84190a) : (!strE2.equals("orders") || strE3.length() <= 0) ? new FreelancerRevolutShopDestination(catalog) : new FreelancerRevolutShopDestination(new RevolutShopDestination$InputData.OrderConfirmation(strE3)) : new FreelancerRevolutShopDestination(new RevolutShopDestination$InputData.Product(g3c.a.a(strE3))));
                this.v = 2;
                obj2 = s0Var2.g(null, featureCommandF, this);
                if (obj2 == aVar2) {
                    return aVar2;
                }
                return new BridgeDestination((NaviCommand) obj2);
        }
    }
}
