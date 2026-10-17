package dx;

import android.graphics.Rect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f120502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f120503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e10.j f120504c;

    public j(Rect faceInPreviewRect, Rect faceInAnalysisRect, e10.j revolutVisionFace) {
        Intrinsics.checkNotNullParameter(faceInPreviewRect, "faceInPreviewRect");
        Intrinsics.checkNotNullParameter(faceInAnalysisRect, "faceInAnalysisRect");
        Intrinsics.checkNotNullParameter(revolutVisionFace, "revolutVisionFace");
        this.f120502a = faceInPreviewRect;
        this.f120503b = faceInAnalysisRect;
        this.f120504c = revolutVisionFace;
    }

    @Override // dx.k
    public final float a() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // dx.k
    public final Rect b() {
        return this.f120503b;
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
        return this.f120502a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f120502a.equals(jVar.f120502a) && this.f120503b.equals(jVar.f120503b) && Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0 && Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0 && Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0 && this.f120504c.equals(jVar.f120504c);
    }

    public final int hashCode() {
        return this.f120504c.hashCode() + m72.b.b(BitmapDescriptorFactory.HUE_RED, m72.b.b(BitmapDescriptorFactory.HUE_RED, m72.b.b(BitmapDescriptorFactory.HUE_RED, (this.f120503b.hashCode() + (this.f120502a.hashCode() * 31)) * 31, 31), 31), 31);
    }
}
