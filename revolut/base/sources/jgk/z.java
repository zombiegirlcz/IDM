package jgk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f174095a;

    public z() {
        y title = y.FEATURES_FOR_YOU;
        Intrinsics.checkNotNullParameter(title, "title");
        this.f174095a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && this.f174095a == ((z) obj2).f174095a;
    }

    public final int hashCode() {
        return this.f174095a.hashCode() + (Boolean.hashCode(false) * 31);
    }
}
