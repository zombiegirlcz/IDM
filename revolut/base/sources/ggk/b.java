package ggk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f143702a;

    public b(f layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f143702a = layout;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f143702a, ((b) obj2).f143702a);
    }

    public final int hashCode() {
        return this.f143702a.hashCode();
    }
}
