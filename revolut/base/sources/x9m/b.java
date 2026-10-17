package x9m;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f303748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f303749b;

    public /* synthetic */ b() {
        this(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    public final void a(j index, float f) {
        Intrinsics.checkNotNullParameter(index, "index");
        switch (a.f303747a[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.f303748a = f;
                return;
            case 4:
            case 5:
            case 6:
                this.f303749b = f;
                return;
            default:
                throw new IllegalArgumentException("index must be X, Y, R, G, S or T");
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Float.compare(this.f303748a, bVar.f303748a) == 0 && Float.compare(this.f303749b, bVar.f303749b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f303749b) + (Float.hashCode(this.f303748a) * 31);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Float2(x=");
        sb6.append(this.f303748a);
        sb6.append(", y=");
        return m72.b.s(sb6, this.f303749b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public b(float f, float f4) {
        this.f303748a = f;
        this.f303749b = f4;
    }
}
