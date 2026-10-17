package x9m;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f303750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f303751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f303752c;

    public c(float f, float f4, float f5) {
        this.f303750a = f;
        this.f303751b = f4;
        this.f303752c = f5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Float.compare(this.f303750a, cVar.f303750a) == 0 && Float.compare(this.f303751b, cVar.f303751b) == 0 && Float.compare(this.f303752c, cVar.f303752c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f303752c) + m72.b.b(this.f303751b, Float.hashCode(this.f303750a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Float3(x=");
        sb6.append(this.f303750a);
        sb6.append(", y=");
        sb6.append(this.f303751b);
        sb6.append(", z=");
        return m72.b.s(sb6, this.f303752c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public /* synthetic */ c(float f, float f4, int i) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f4, (i & 4) == 0 ? 4.0f : BitmapDescriptorFactory.HUE_RED);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(c v) {
        this(v.f303750a, v.f303751b, v.f303752c);
        Intrinsics.checkNotNullParameter(v, "v");
    }
}
