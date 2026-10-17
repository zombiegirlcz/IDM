package ojk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f225845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f225846b;

    public x(String areaTitle, boolean z) {
        Intrinsics.checkNotNullParameter(areaTitle, "areaTitle");
        this.f225845a = areaTitle;
        this.f225846b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f225845a, xVar.f225845a) && this.f225846b == xVar.f225846b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f225846b) + (this.f225845a.hashCode() * 31);
    }
}
