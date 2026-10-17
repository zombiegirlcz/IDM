package ffi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f134808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f134809b;

    public b(String locationId, a type) {
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f134808a = locationId;
        this.f134809b = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f134808a, bVar.f134808a) && this.f134809b == bVar.f134809b;
    }

    public final int hashCode() {
        return this.f134809b.hashCode() + (this.f134808a.hashCode() * 31);
    }
}
