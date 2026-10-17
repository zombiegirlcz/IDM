package z5f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f319615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f319616b;

    public d(String label, String deeplink) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f319615a = label;
        this.f319616b = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f319615a, dVar.f319615a) && Intrinsics.f(this.f319616b, dVar.f319616b);
    }

    public final int hashCode() {
        return this.f319616b.hashCode() + (this.f319615a.hashCode() * 31);
    }
}
