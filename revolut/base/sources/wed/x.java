package wed;

import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final class x extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f0 f296763w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i, Continuation continuation, f0 f0Var) {
        super(2, continuation);
        this.u = i;
        this.f296763w = f0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                x xVar = new x(0, continuation, this.f296763w);
                xVar.v = obj2;
                return xVar;
            case 1:
                x xVar2 = new x(1, continuation, this.f296763w);
                xVar2.v = obj2;
                return xVar2;
            case 2:
                x xVar3 = new x(2, continuation, this.f296763w);
                xVar3.v = obj2;
                return xVar3;
            case 3:
                x xVar4 = new x(3, continuation, this.f296763w);
                xVar4.v = obj2;
                return xVar4;
            default:
                x xVar5 = new x(4, continuation, this.f296763w);
                xVar5.v = obj2;
                return xVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((x) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((x) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((x) create((Map) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((x) create((rp0.p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((x) create((w4l.k) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 9;
        f0 f0Var = this.f296763w;
        switch (i) {
            case 0:
                List list = (List) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f0Var.x2(new w38.v(f0Var, list, 24));
                break;
            case 1:
                List list2 = (List) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f0Var.x2(new v77.a(list2, 9));
                break;
            case 2:
                Map map = (Map) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                LinkedHashMap linkedHashMapZ = r0.z(((l) f0Var.t2()).f);
                for (Map.Entry entry : map.entrySet()) {
                    FavouritesAssetTypeKey favouritesAssetTypeKey = (FavouritesAssetTypeKey) entry.getKey();
                    Map mapP = (Map) ((Data) entry.getValue()).getContent();
                    if (mapP != null) {
                        Map map2 = (Map) linkedHashMapZ.get(favouritesAssetTypeKey);
                        if (map2 != null) {
                            mapP = r0.p(map2, mapP);
                        }
                        linkedHashMapZ.put(favouritesAssetTypeKey, mapP);
                    }
                }
                f0Var.x2(new awk.j(linkedHashMapZ, 23));
                break;
            case 3:
                rp0.p pVar = (rp0.p) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (pVar == rp0.p.USER) {
                    f0Var.x2(new wd3.a(i2));
                }
                break;
            default:
                w4l.k kVar = (w4l.k) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w4l.i iVar = w4l.i.f294643c;
                if (!Intrinsics.f(kVar, iVar)) {
                    f0Var.f296732y.k(iVar);
                }
                break;
        }
        return Unit.f186387a;
    }
}
