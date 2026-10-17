package pp4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f238263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f238264b;

    public l(String cardholderId, String userName) {
        Intrinsics.checkNotNullParameter(cardholderId, "cardholderId");
        Intrinsics.checkNotNullParameter(userName, "userName");
        this.f238263a = cardholderId;
        this.f238264b = userName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f238263a, lVar.f238263a) && Intrinsics.f(this.f238264b, lVar.f238264b);
    }

    public final int hashCode() {
        return this.f238264b.hashCode() + (this.f238263a.hashCode() * 31);
    }
}
