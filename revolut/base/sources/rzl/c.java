package rzl;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f258699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f258700b;

    public c() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Float.compare(this.f258699a, cVar.f258699a) == 0 && Float.compare(this.f258700b, cVar.f258700b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f258700b) + (Float.hashCode(this.f258699a) * 31);
    }

    public c(float f, float f4) {
        this.f258699a = f;
        this.f258700b = f4;
    }

    public /* synthetic */ c(int i) {
        this(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }
}
