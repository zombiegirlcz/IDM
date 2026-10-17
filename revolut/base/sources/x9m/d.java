package x9m;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f303753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f303754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f303755c;
    public float d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(c v, float f) {
        this(v.f303750a, v.f303751b, v.f303752c, f);
        Intrinsics.checkNotNullParameter(v, "v");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Float.compare(this.f303753a, dVar.f303753a) == 0 && Float.compare(this.f303754b, dVar.f303754b) == 0 && Float.compare(this.f303755c, dVar.f303755c) == 0 && Float.compare(this.d, dVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + m72.b.b(this.f303755c, m72.b.b(this.f303754b, Float.hashCode(this.f303753a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Float4(x=");
        sb6.append(this.f303753a);
        sb6.append(", y=");
        sb6.append(this.f303754b);
        sb6.append(", z=");
        sb6.append(this.f303755c);
        sb6.append(", w=");
        return m72.b.s(sb6, this.d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public d(float f, float f4, float f5, float f6) {
        this.f303753a = f;
        this.f303754b = f4;
        this.f303755c = f5;
        this.d = f6;
    }

    public /* synthetic */ d(float f, float f4, float f5, int i) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f4, (i & 4) != 0 ? 0.0f : f5, (i & 8) == 0 ? 1.0f : BitmapDescriptorFactory.HUE_RED);
    }
}
