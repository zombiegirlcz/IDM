package ggk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143762a;

    public o(String icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f143762a = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f143762a, ((o) obj2).f143762a);
    }

    public final int hashCode() {
        return this.f143762a.hashCode();
    }
}
