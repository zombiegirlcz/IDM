package ai0;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.revolut.core.mobile_services.impl.map.GmsLatLngBounds;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l extends gi0.b {
    public static zjh.j a(ah0.b bounds, int i) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(bounds, "<this>");
        CameraUpdate cameraUpdateNewLatLngBounds = CameraUpdateFactory.newLatLngBounds(((GmsLatLngBounds) bounds).f51395a, i);
        Intrinsics.checkNotNullExpressionValue(cameraUpdateNewLatLngBounds, "newLatLngBounds(...)");
        return new zjh.j(cameraUpdateNewLatLngBounds);
    }

    public static zjh.j b(ah0.a position, float f) {
        Intrinsics.checkNotNullParameter(position, "position");
        CameraUpdate cameraUpdateNewLatLngZoom = CameraUpdateFactory.newLatLngZoom(jb3.l.M(position), f);
        Intrinsics.checkNotNullExpressionValue(cameraUpdateNewLatLngZoom, "newLatLngZoom(...)");
        return new zjh.j(cameraUpdateNewLatLngZoom);
    }
}
