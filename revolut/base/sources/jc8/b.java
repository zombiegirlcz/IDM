package jc8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f172751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f172752b;

    public b(String base64Image, String imageUrl) {
        Intrinsics.checkNotNullParameter(base64Image, "base64Image");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.f172751a = base64Image;
        this.f172752b = imageUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f172751a, bVar.f172751a) && Intrinsics.f(this.f172752b, bVar.f172752b);
    }

    public final int hashCode() {
        return this.f172752b.hashCode() + (this.f172751a.hashCode() * 31);
    }
}
