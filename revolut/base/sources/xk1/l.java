package xk1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f306603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f306604b;

    public l(String name, String logoUrl) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        this.f306603a = name;
        this.f306604b = logoUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f306603a, lVar.f306603a) && Intrinsics.f(this.f306604b, lVar.f306604b);
    }

    public final int hashCode() {
        return this.f306604b.hashCode() + (this.f306603a.hashCode() * 31);
    }
}
