package jwf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f178981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f178982b;

    public h(String key, String title) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f178981a = key;
        this.f178982b = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f178981a, hVar.f178981a) && Intrinsics.f(this.f178982b, hVar.f178982b);
    }

    public final int hashCode() {
        return this.f178982b.hashCode() + (this.f178981a.hashCode() * 31);
    }
}
