package ht3;

import dx4.a1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class x implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f155316a;

    public x(a1 icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f155316a = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && this.f155316a == ((x) obj2).f155316a;
    }

    public final int hashCode() {
        return this.f155316a.hashCode();
    }
}
