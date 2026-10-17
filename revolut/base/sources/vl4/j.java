package vl4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f290268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f290269b;

    public j(k type, String text) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f290268a = type;
        this.f290269b = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f290268a == jVar.f290268a && Intrinsics.f(this.f290269b, jVar.f290269b);
    }

    public final int hashCode() {
        return this.f290269b.hashCode() + (this.f290268a.hashCode() * 31);
    }
}
