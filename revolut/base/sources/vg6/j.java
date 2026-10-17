package vg6;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ k v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.v, continuation, 0);
            default:
                return new j(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n1 n1Var = (n1) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(n1Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        k kVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.D2(kVar.u);
                kVar.f288771r.getClass();
                kVar.C1(u0.c(new MainScreenFeatureConfig.JustShow(s49.a.AS_TOP)));
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.D2(kVar.u);
                q qVar = kVar.f288771r;
                NaviCommand naviCommand = kVar.o.e;
                qVar.getClass();
                kVar.C1(q.b(naviCommand, null));
                break;
        }
        return Unit.f186387a;
    }
}
