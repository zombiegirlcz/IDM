package pu0;

import android.graphics.Paint;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f239786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rzl.c f239787b;

    public a(Paint paint) {
        rzl.c position = new rzl.c(0);
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(position, "position");
        this.f239786a = paint;
        this.f239787b = position;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f239786a.equals(aVar.f239786a) && this.f239787b.equals(aVar.f239787b) && Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0;
    }

    public final int hashCode() {
        return m72.b.b(BitmapDescriptorFactory.HUE_RED, (this.f239787b.hashCode() + (this.f239786a.hashCode() * 31)) * 31, 31);
    }
}
