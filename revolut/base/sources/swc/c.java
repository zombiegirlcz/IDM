package swc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f266182b;

    public c(String ownerName, String ownerCode) {
        Intrinsics.checkNotNullParameter(ownerName, "ownerName");
        Intrinsics.checkNotNullParameter(ownerCode, "ownerCode");
        this.f266181a = ownerName;
        this.f266182b = ownerCode;
    }

    public final String a() {
        return this.f266182b;
    }

    public final String b() {
        return this.f266181a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f266181a, cVar.f266181a) && Intrinsics.f(this.f266182b, cVar.f266182b);
    }

    public final int hashCode() {
        return this.f266182b.hashCode() + (this.f266181a.hashCode() * 31);
    }
}
