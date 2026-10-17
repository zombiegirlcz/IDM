package lmh;

import com.revolut.feature.wealth_discovery.api.declaration.AllAssetsListDestination;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f197084w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(k kVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f197084w = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f197084w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            case 1:
                i iVar2 = new i(this.f197084w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
            default:
                i iVar3 = new i(this.f197084w, continuation, 2);
                iVar3.v = obj2;
                return iVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((i) create((c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        k kVar = this.f197084w;
        switch (i) {
            case 0:
                znh.a aVar = (znh.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cnh.f fVar = kVar.d;
                String ref2 = aVar.f323829b.f105162a;
                Intrinsics.checkNotNullParameter(ref2, "ref");
                fVar.A2(new AssetDetailsDestination(ref2, null, false, null, null, null, 62));
                break;
            case 1:
                c cVar = (c) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cnh.f fVar2 = kVar.d;
                zel.f instrumentGroup = cVar.f197077a;
                Intrinsics.checkNotNullParameter(instrumentGroup, "instrumentGroup");
                fVar2.A2(new AllAssetsListDestination(instrumentGroup));
                break;
            default:
                c cVar2 = (c) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cnh.f fVar3 = kVar.d;
                zel.f instrumentGroup2 = cVar2.f197077a;
                Intrinsics.checkNotNullParameter(instrumentGroup2, "instrumentGroup");
                fVar3.A2(new AllAssetsListDestination(instrumentGroup2));
                break;
        }
        return Unit.f186387a;
    }
}
