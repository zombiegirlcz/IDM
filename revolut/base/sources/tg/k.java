package tg;

import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import sgm.j1;

/* JADX INFO: loaded from: classes17.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f271020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j1 f271021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Projection f271022c;
    public wg.b d;
    public float e;
    public final /* synthetic */ m f;

    public k(m mVar, Set set) {
        this.f = mVar;
        this.f271020a = set;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LatLngBounds latLngBoundsBuild;
        ArrayList arrayList;
        ArrayList arrayList2;
        LatLngBounds latLngBounds;
        boolean z;
        m mVar = this.f;
        boolean z3 = mVar.d;
        Set set = mVar.k;
        Set setUnmodifiableSet = set != null ? Collections.unmodifiableSet(set) : Collections.EMPTY_SET;
        Set<rg.a> set2 = this.f271020a;
        if ((set2 != null ? Collections.unmodifiableSet(set2) : Collections.EMPTY_SET).equals(setUnmodifiableSet)) {
            this.f271021b.run();
            return;
        }
        i iVar = new i(mVar);
        float f = this.e;
        float f4 = mVar.f271035m;
        boolean z4 = f > f4;
        float f5 = f - f4;
        Set<j> set3 = mVar.f271031g;
        try {
            latLngBoundsBuild = this.f271022c.getVisibleRegion().latLngBounds;
        } catch (Exception e) {
            e.printStackTrace();
            latLngBoundsBuild = LatLngBounds.builder().include(new LatLng(0.0d, 0.0d)).build();
        }
        if (mVar.k == null || !z3) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (rg.a aVar : mVar.k) {
                if (mVar.h(aVar) && latLngBoundsBuild.contains(aVar.getPosition())) {
                    arrayList.add(this.d.b(aVar.getPosition()));
                }
            }
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        for (rg.a aVar2 : set2) {
            boolean zContains = latLngBoundsBuild.contains(aVar2.getPosition());
            if (z4 && zContains && z3) {
                wg.a aVarA = m.a(mVar, arrayList, this.d.b(aVar2.getPosition()));
                if (aVarA != null) {
                    iVar.a(true, new h(mVar, aVar2, setNewSetFromMap, this.d.a(aVarA)));
                    z = z3;
                } else {
                    z = z3;
                    iVar.a(true, new h(mVar, aVar2, setNewSetFromMap, null));
                }
            } else {
                z = z3;
                iVar.a(zContains, new h(mVar, aVar2, setNewSetFromMap, null));
            }
            z3 = z;
        }
        boolean z6 = z3;
        iVar.e();
        set3.removeAll(setNewSetFromMap);
        if (z6) {
            arrayList2 = new ArrayList();
            for (rg.a aVar3 : set2) {
                if (mVar.h(aVar3) && latLngBoundsBuild.contains(aVar3.getPosition())) {
                    arrayList2.add(this.d.b(aVar3.getPosition()));
                }
            }
        } else {
            arrayList2 = null;
        }
        for (j jVar : set3) {
            LatLng latLng = jVar.f271019b;
            Marker marker = jVar.f271018a;
            boolean zContains2 = latLngBoundsBuild.contains(latLng);
            if (z4 || f5 <= -3.0f || !zContains2 || !z6) {
                latLngBounds = latLngBoundsBuild;
                iVar.d(zContains2, marker);
            } else {
                wg.a aVarA2 = m.a(mVar, arrayList2, this.d.b(jVar.f271019b));
                if (aVarA2 != null) {
                    LatLng latLngA = this.d.a(aVarA2);
                    LatLng latLng2 = jVar.f271019b;
                    ReentrantLock reentrantLock = iVar.f271013a;
                    reentrantLock.lock();
                    latLngBounds = latLngBoundsBuild;
                    m mVar2 = iVar.i;
                    g gVar = new g(mVar2, jVar, latLng2, latLngA);
                    gVar.f = mVar2.f271030c.f253989a;
                    gVar.e = true;
                    iVar.f271016g.add(gVar);
                    reentrantLock.unlock();
                } else {
                    latLngBounds = latLngBoundsBuild;
                    iVar.d(true, marker);
                }
            }
            latLngBoundsBuild = latLngBounds;
        }
        iVar.e();
        mVar.f271031g = setNewSetFromMap;
        mVar.k = set2;
        mVar.f271035m = f;
        this.f271021b.run();
    }
}
