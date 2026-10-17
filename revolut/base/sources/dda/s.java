package dda;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113196b;

    public s(String value, String icon) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f113195a = value;
        this.f113196b = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f113195a, sVar.f113195a) && Intrinsics.f(this.f113196b, sVar.f113196b);
    }

    public final int hashCode() {
        return this.f113196b.hashCode() + (this.f113195a.hashCode() * 31);
    }
}
