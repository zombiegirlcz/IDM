package aa7;

import a9d.p;
import com.revolut.data.model.Data;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o97.y;
import skm.e0;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends a97.k {
    public final /* synthetic */ i d;

    public g(i iVar) {
        this.d = iVar;
    }

    @Override // a97.k
    public final koi.j a() {
        return m.a();
    }

    @Override // a97.k
    public final Object b(y yVar, Continuation continuation) {
        h hVar = (h) this.f2376a.getValue();
        return (hVar != null && Intrinsics.f(yVar.f223137c, "SMART_TILE_ASSET_VIEW_ITEM_CLICK")) ? new o97.l(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new AssetDetailsDestination(hVar.f2771a, null, false, "GlobalSearch", null, null, 54), false, (Integer) null, 0, 61))) : o97.e.f223096a;
    }

    @Override // a97.k
    public final koi.j c(Object obj2, y searchPayload) {
        h state = (h) obj2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(searchPayload, "payload");
        m mVar = this.d.f2774a;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(searchPayload, "searchPayload");
        return (koi.j) iii.c.f(state.f2772b, new a9h.b(mVar, 8), new p(1), new a0i.a(mVar, 2, state, searchPayload));
    }

    @Override // a97.k
    public final Object d(a97.j jVar) {
        Object objO = e0.o(new e(this, null, 0), jVar);
        return objO == fim.a.COROUTINE_SUSPENDED ? objO : Unit.f186387a;
    }

    @Override // a97.k
    public final Object e(List list, Continuation continuation) {
        a97.a aVar;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                aVar = null;
                break;
            }
            a97.f fVar = (a97.f) it8.next();
            aVar = fVar instanceof a97.a ? (a97.a) fVar : null;
            if (aVar != null) {
                break;
            }
        }
        if (aVar == null) {
            throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
        }
        String str = aVar.f2364a;
        j2 j2Var = this.f2376a;
        h hVar = (h) j2Var.getValue();
        if (!Intrinsics.f(hVar != null ? hVar.f2771a : null, str)) {
            j2Var.setValue(new h(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), str));
        }
        return Unit.f186387a;
    }
}
