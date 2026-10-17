package s96;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f261115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f261116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f261117c;

    public d(c scannerMode, Integer num, Set resultFormats) {
        Intrinsics.checkNotNullParameter(scannerMode, "scannerMode");
        Intrinsics.checkNotNullParameter(resultFormats, "resultFormats");
        this.f261115a = scannerMode;
        this.f261116b = num;
        this.f261117c = resultFormats;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f261115a == dVar.f261115a && Intrinsics.f(this.f261116b, dVar.f261116b) && Intrinsics.f(this.f261117c, dVar.f261117c);
    }

    public final int hashCode() {
        int iHashCode = (this.f261115a.hashCode() + (Boolean.hashCode(false) * 31)) * 31;
        Integer num = this.f261116b;
        return this.f261117c.hashCode() + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }

    public d() {
        this(c.SCANNER_MODE_BASE, null, y0.b(b.JPEG));
    }
}
