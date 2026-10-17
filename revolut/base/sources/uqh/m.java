package uqh;

import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f282167w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(o oVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f282167w = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                m mVar = new m(this.f282167w, continuation, 0);
                mVar.v = obj2;
                return mVar;
            default:
                m mVar2 = new m(this.f282167w, continuation, 1);
                mVar2.v = obj2;
                return mVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((m) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((m) create((znh.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        o oVar = this.f282167w;
        switch (i) {
            case 0:
                String query = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l0 l0Var = oVar.d;
                Intrinsics.h(query);
                Intrinsics.checkNotNullParameter(query, "query");
                j2 j2Var = l0Var.v;
                if (kotlin.text.d0.W(query)) {
                    query = null;
                }
                j2Var.setValue(query);
                break;
            default:
                znh.a aVar2 = (znh.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l0 l0Var2 = oVar.d;
                String ref2 = aVar2.f323829b.f105162a;
                Intrinsics.checkNotNullParameter(ref2, "ref");
                l0Var2.A2(u0.c(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new AssetDetailsDestination(ref2, null, false, null, null, null, 62), false, (Integer) null, 0, 61)));
                break;
        }
        return Unit.f186387a;
    }
}
