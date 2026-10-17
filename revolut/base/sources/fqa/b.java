package fqa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f137220b;

    public b(String type, String value) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f137219a = type;
        this.f137220b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f137219a, bVar.f137219a) && Intrinsics.f(this.f137220b, bVar.f137220b);
    }

    public final int hashCode() {
        return this.f137220b.hashCode() + (this.f137219a.hashCode() * 31);
    }
}
