package d3c;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f111063b;

    public t(String title, List bulletPoints) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(bulletPoints, "bulletPoints");
        this.f111062a = title;
        this.f111063b = bulletPoints;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f111062a, tVar.f111062a) && Intrinsics.f(this.f111063b, tVar.f111063b);
    }

    public final int hashCode() {
        return this.f111063b.hashCode() + (this.f111062a.hashCode() * 31);
    }
}
