package ggk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f143774b;

    public r(String icon, s style) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f143773a = icon;
        this.f143774b = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f143773a, rVar.f143773a) && this.f143774b == rVar.f143774b;
    }

    public final int hashCode() {
        return this.f143774b.hashCode() + (this.f143773a.hashCode() * 31);
    }
}
