package tg;

import android.content.Context;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import com.revolut.core.mobile_services.impl.map.GmsLatLngBounds;
import com.revolut.core.ui_kit.views.MapView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import mx0.s2;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
public final class d implements GoogleMap.OnMarkerClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f271003a;

    public d(m mVar) {
        this.f271003a = mVar;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
    public final boolean onMarkerClick(Marker marker) {
        m mVar = this.f271003a;
        aed.f fVar = mVar.o;
        if (fVar == null) {
            return false;
        }
        rg.a aVar = (rg.a) ((HashMap) mVar.f271034l.f264433b).get(marker);
        s2 s2Var = (s2) fVar.f3534b;
        Intrinsics.h(aVar);
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        i4b.f cluster = new i4b.f(aVar);
        MapView mapView = (MapView) s2Var.f209988b;
        int i = MapView.f58767w;
        Intrinsics.checkNotNullParameter(cluster, "cluster");
        th0.b bVar = mapView.f58768b;
        Collection items = aVar.getItems();
        Intrinsics.checkNotNullExpressionValue(items, "getItems(...)");
        Collection<ai0.d> collection = items;
        ArrayList arrayList = new ArrayList(w.t(collection, 10));
        for (ai0.d dVar : collection) {
            Intrinsics.h(dVar);
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            yv0.k kVar = dVar.f5146a;
            Intrinsics.i(kVar, "null cannot be cast to non-null type T of com.revolut.core.mobile_services.impl.map.GmsCluster");
            arrayList.add(kVar);
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((yv0.k) it8.next()).getPosition());
        }
        if (arrayList2.isEmpty()) {
            return true;
        }
        bVar.getClass();
        GmsLatLngBounds gmsLatLngBoundsB = new com.revolut.core.mobile_services.impl.map.a().b(arrayList2);
        Context context = mapView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        zjh.j jVarA = ai0.l.a(gmsLatLngBoundsB, kli.a.k(context, mapView.f58776q));
        ai0.k kVar2 = mapView.i.f299762a;
        if (kVar2 == null) {
            return true;
        }
        kVar2.a(jVarA);
        return true;
    }
}
