package ggk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p0 extends u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143770a;

    public p0(String icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f143770a = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p0) && Intrinsics.f(this.f143770a, ((p0) obj2).f143770a);
    }

    public final int hashCode() {
        return this.f143770a.hashCode();
    }
}
