package com.revolut.core.mobile_services.impl.map;

import ah0.c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.revolut.core.mobile_services.impl.map.GmsLatLngBounds;
import java.util.ArrayList;
import java.util.Iterator;
import jb3.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements c {
    public final GmsLatLngBounds a(ah0.a southWest, ah0.a northEast) {
        Intrinsics.checkNotNullParameter(southWest, "southWest");
        Intrinsics.checkNotNullParameter(northEast, "northEast");
        LatLng southwest = l.M(southWest);
        LatLng northeast = l.M(northEast);
        Intrinsics.checkNotNullParameter(southwest, "southwest");
        Intrinsics.checkNotNullParameter(northeast, "northeast");
        return new GmsLatLngBounds(new LatLngBounds(southwest, northeast));
    }

    public final GmsLatLngBounds b(ArrayList points) {
        Intrinsics.checkNotNullParameter(points, "points");
        GmsLatLngBounds.a aVar = new GmsLatLngBounds.a();
        Iterator it8 = points.iterator();
        while (true) {
            boolean zHasNext = it8.hasNext();
            LatLngBounds.Builder builder = aVar.f51396a;
            if (!zHasNext) {
                LatLngBounds latLngBoundsBuild = builder.build();
                Intrinsics.checkNotNullExpressionValue(latLngBoundsBuild, "build(...)");
                return new GmsLatLngBounds(latLngBoundsBuild);
            }
            ah0.a point = (ah0.a) it8.next();
            Intrinsics.checkNotNullParameter(point, "point");
            builder.include(l.M(point));
        }
    }
}
