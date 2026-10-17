package s4i;

import aii.u;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import w4i.a0;
import w4i.v;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.i implements Function1 {
    public final /* synthetic */ h u;
    public final /* synthetic */ a0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, a0 a0Var, Continuation continuation) {
        super(1, continuation);
        this.u = hVar;
        this.v = a0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        u uVarC;
        AssetDetailsDestination assetDetailsDestination;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        v vVar = (v) this.v;
        Asset fromAsset = vVar.f294592a;
        Asset toAsset = vVar.f294593b;
        h hVar = this.u;
        i iVar = hVar.f259886r;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(fromAsset, "fromAsset");
        Intrinsics.checkNotNullParameter(toAsset, "toAsset");
        boolean zL = boh.f.l(fromAsset);
        String str = fromAsset.f104720b;
        if (zL && boh.f.l(toAsset)) {
            qpk.b bVar = iVar.f259892a;
            xi0.b.Companion.getClass();
            uVarC = u0.c(dpk.a.a(bVar, xi0.a.a(str), xi0.a.a(toAsset.f104720b), false, false));
        } else {
            if (uc0.b.s(toAsset)) {
                assetDetailsDestination = new AssetDetailsDestination(toAsset.f104721c.f306286a, null, false, null, null, null, 62);
            } else if (uc0.b.s(fromAsset)) {
                assetDetailsDestination = new AssetDetailsDestination(fromAsset.f104721c.f306286a, null, false, null, null, null, 62);
            } else {
                hx7.e.h(new IllegalArgumentException(a0.d.s("Unsupported assets from=", str, ", to=", toAsset.f104720b)));
                uVarC = null;
            }
            uVarC = assetDetailsDestination;
        }
        if (uVarC != null) {
            hVar.C1(uVarC);
        }
        return Unit.f186387a;
    }
}
