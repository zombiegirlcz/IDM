package fa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f133005a;

    public e(String iconName) {
        Intrinsics.checkNotNullParameter(iconName, "iconName");
        this.f133005a = iconName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f133005a, ((e) obj2).f133005a);
    }

    public final int hashCode() {
        return this.f133005a.hashCode();
    }

    public final String toString() {
        return p.a.p("Image(iconName=", this.f133005a, ")");
    }
}
