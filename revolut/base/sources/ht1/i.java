package ht1;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import hg0.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f155211w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(k kVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f155211w = kVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f155211w, continuation, 0);
            case 1:
                return new i(this.f155211w, continuation, 1);
            default:
                return new i(this.f155211w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((i) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        k kVar = this.f155211w;
        Continuation continuation = null;
        switch (i) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    ps1.b bVar = kVar.f155213p;
                    this.v = 1;
                    n nVar = new n(bVar.f239387a, continuation, 19);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, nVar, this);
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                k kVar2 = this.f155211w;
                if (i3 == 0) {
                    o.b(obj2);
                    an1.d dVar = new an1.d(kVar2, 25);
                    i iVar = new i(kVar2, continuation, 0);
                    this.v = 1;
                    obj2 = n14.k.V(kVar2, null, null, dVar, iVar, this, 3);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                nii.h hVar = (nii.h) obj2;
                if (!(hVar instanceof nii.f)) {
                    if (!(hVar instanceof nii.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kVar2.C1(new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), new FeatureCommand(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP)))));
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                hib.n nVar2 = new hib.n(10, continuation, kVar);
                this.v = 1;
                Object objB = pu7.a.B(kVar.k, "onOnlineTransactionSwitch", nVar2, this);
                return objB == aVar2 ? aVar2 : objB;
        }
    }
}
