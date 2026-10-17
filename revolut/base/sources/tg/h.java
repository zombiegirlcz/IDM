package tg;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import smd.s;

/* JADX INFO: loaded from: classes17.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rg.a f271010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f271011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LatLng f271012c;
    public final /* synthetic */ m d;

    public h(m mVar, rg.a aVar, Set set, LatLng latLng) {
        this.d = mVar;
        this.f271010a = aVar;
        this.f271011b = set;
        this.f271012c = latLng;
    }

    public static void a(h hVar, i iVar) {
        j jVar;
        j jVar2;
        m mVar = iVar.i;
        LinkedList linkedList = iVar.f271016g;
        ReentrantLock reentrantLock = iVar.f271013a;
        Set set = hVar.f271011b;
        LatLng latLng = hVar.f271012c;
        m mVar2 = hVar.d;
        rg.a aVar = hVar.f271010a;
        boolean zH = mVar2.h(aVar);
        s sVar = mVar2.f271034l;
        rg.c cVar = mVar2.f271030c;
        s sVar2 = mVar2.i;
        if (zH) {
            Marker marker = (Marker) ((HashMap) sVar.f264432a).get(aVar);
            if (marker == null) {
                MarkerOptions markerOptionsPosition = new MarkerOptions().position(latLng == null ? aVar.getPosition() : latLng);
                mVar2.e(aVar, markerOptionsPosition);
                ug.b bVar = cVar.f253991c;
                Marker markerAddMarker = ((GoogleMap) bVar.f.f127555a).addMarker(markerOptionsPosition);
                bVar.f279911a.add(markerAddMarker);
                ((HashMap) bVar.f279912b.f127556b).put(markerAddMarker, bVar);
                ((HashMap) sVar.f264432a).put(aVar, markerAddMarker);
                ((HashMap) sVar.f264433b).put(markerAddMarker, aVar);
                jVar = new j(markerAddMarker);
                if (latLng != null) {
                    LatLng position = aVar.getPosition();
                    reentrantLock.lock();
                    linkedList.add(new g(mVar, jVar, latLng, position));
                    reentrantLock.unlock();
                }
            } else {
                j jVar3 = new j(marker);
                mVar2.g(aVar, marker);
                jVar = jVar3;
            }
            set.add(jVar);
            return;
        }
        for (ai0.d dVar : aVar.getItems()) {
            Marker marker2 = (Marker) ((HashMap) sVar2.f264432a).get(dVar);
            if (marker2 == null) {
                MarkerOptions markerOptions = new MarkerOptions();
                if (latLng != null) {
                    markerOptions.position(latLng);
                } else {
                    markerOptions.position(dVar.a());
                }
                mVar2.d(dVar, markerOptions);
                ug.b bVar2 = cVar.f253990b;
                Marker markerAddMarker2 = ((GoogleMap) bVar2.f.f127555a).addMarker(markerOptions);
                bVar2.f279911a.add(markerAddMarker2);
                ((HashMap) bVar2.f279912b.f127556b).put(markerAddMarker2, bVar2);
                jVar2 = new j(markerAddMarker2);
                ((HashMap) sVar2.f264432a).put(dVar, markerAddMarker2);
                ((HashMap) sVar2.f264433b).put(markerAddMarker2, dVar);
                if (latLng != null) {
                    LatLng latLngA = dVar.a();
                    reentrantLock.lock();
                    linkedList.add(new g(mVar, jVar2, latLng, latLngA));
                    reentrantLock.unlock();
                }
            } else {
                jVar2 = new j(marker2);
                mVar2.f(dVar, marker2);
            }
            set.add(jVar2);
        }
    }
}
