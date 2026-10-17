package dx;

import android.graphics.Rect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f120500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f120501b;

    public i(Rect faceInPreviewRect, Rect faceInAnalysisRect) {
        Intrinsics.checkNotNullParameter(faceInPreviewRect, "faceInPreviewRect");
        Intrinsics.checkNotNullParameter(faceInAnalysisRect, "faceInAnalysisRect");
        this.f120500a = faceInPreviewRect;
        this.f120501b = faceInAnalysisRect;
    }

    @Override // dx.k
    public final float a() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // dx.k
    public final Rect b() {
        return this.f120501b;
    }

    @Override // dx.k
    public final float c() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // dx.k
    public final float d() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // dx.k
    public final Rect e() {
        return this.f120500a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f120500a.equals(iVar.f120500a) && this.f120501b.equals(iVar.f120501b) && Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0 && Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0 && Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(BitmapDescriptorFactory.HUE_RED) + m72.b.b(BitmapDescriptorFactory.HUE_RED, m72.b.b(BitmapDescriptorFactory.HUE_RED, (this.f120501b.hashCode() + (this.f120500a.hashCode() * 31)) * 31, 31), 31);
    }
}
