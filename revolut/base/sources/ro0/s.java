package ro0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class s {

    @NotNull
    public static final r Companion = new r();
    public static final s e = new s(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f255771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f255772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f255773c;
    public final float d;

    public s(float f, float f4, float f5, float f6) {
        this.f255771a = f;
        this.f255772b = f4;
        this.f255773c = f5;
        this.d = f6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Float.compare(this.f255771a, sVar.f255771a) == 0 && Float.compare(this.f255772b, sVar.f255772b) == 0 && Float.compare(this.f255773c, sVar.f255773c) == 0 && Float.compare(this.d, sVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + m72.b.b(this.f255773c, m72.b.b(this.f255772b, Float.hashCode(this.f255771a) * 31, 31), 31);
    }
}
