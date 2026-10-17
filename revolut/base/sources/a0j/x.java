package a0j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f422b;

    public x(String title, String subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f421a = title;
        this.f422b = subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f421a, xVar.f421a) && Intrinsics.f(this.f422b, xVar.f422b);
    }

    public final int hashCode() {
        return this.f422b.hashCode() + (this.f421a.hashCode() * 31);
    }
}
