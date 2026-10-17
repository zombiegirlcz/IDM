package s69;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f260181b;

    public s(String userId, String fullName) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        this.f260180a = userId;
        this.f260181b = fullName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f260180a, sVar.f260180a) && Intrinsics.f(this.f260181b, sVar.f260181b);
    }

    public final int hashCode() {
        return this.f260181b.hashCode() + (this.f260180a.hashCode() * 31);
    }
}
