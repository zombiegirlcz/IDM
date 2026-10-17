package d3d;

import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import efm.r;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import te0.w;
import vkm.q;
import yhm.o;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends i implements Function3 {
    public final /* synthetic */ z3d.c A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ FavouritesAssetTypeKey C;
    public int u;
    public /* synthetic */ FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f111088w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f111089x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ u3d.b f111090y;
    public final /* synthetic */ List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Continuation continuation, g gVar, u3d.b bVar, List list, z3d.c cVar, boolean z, FavouritesAssetTypeKey favouritesAssetTypeKey) {
        super(3, continuation);
        this.f111089x = gVar;
        this.f111090y = bVar;
        this.z = list;
        this.A = cVar;
        this.B = z;
        this.C = favouritesAssetTypeKey;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        d dVar = new d((Continuation) obj4, this.f111089x, this.f111090y, this.z, this.A, this.B, this.C);
        dVar.v = (FlowCollector) obj2;
        dVar.f111088w = obj3;
        return dVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        r rVarH;
        r rVarH2;
        z3d.c cVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            FlowCollector flowCollector = this.v;
            boolean zBooleanValue = ((Boolean) this.f111088w).booleanValue();
            List list = this.z;
            u3d.b bVar = this.f111090y;
            if (zBooleanValue) {
                ArrayList arrayList = new ArrayList();
                Iterator it8 = list.iterator();
                while (true) {
                    boolean zHasNext = it8.hasNext();
                    cVar = this.A;
                    if (!zHasNext) {
                        break;
                    }
                    Object next = it8.next();
                    if (!Intrinsics.f(((z3d.c) next).f319249b.f115083b, cVar.f319249b.f115083b)) {
                        arrayList.add(next);
                    }
                }
                this.f111089x.getClass();
                if (arrayList.isEmpty()) {
                    rVarH = w.h(new Data(f0.f322471a, null, false, 6, null));
                } else {
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                    Iterator it9 = arrayList.iterator();
                    while (it9.hasNext()) {
                        arrayList2.add(new Pair(cVar.f319249b.f115083b.f306286a, ((z3d.c) it9.next()).f319249b.f115083b.f306286a));
                    }
                    rVarH = bVar.b(arrayList2, true);
                    if (!this.B) {
                        rVarH = mo3.a.n(rVarH);
                    }
                }
            } else {
                rVarH = w.h(new Data(null, null, false, 6, null));
            }
            if (zBooleanValue) {
                List list2 = list;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it10 = list2.iterator();
                while (it10.hasNext()) {
                    arrayList3.add(((z3d.c) it10.next()).f319249b.f115083b.f306286a);
                }
                rVarH2 = bVar.i(arrayList3);
            } else {
                rVarH2 = w.h(new Data(null, null, false, 6, null));
            }
            vkm.d dVarB = rd0.e.b(w.v(rVarH, rVarH2, new c(this.C, zBooleanValue)));
            this.v = null;
            this.f111088w = null;
            this.u = 1;
            if (q.u(flowCollector, dVarB, this) == aVar) {
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
