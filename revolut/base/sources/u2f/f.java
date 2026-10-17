package u2f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f276634b;

    public f(String name, String imageUrl) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.f276633a = name;
        this.f276634b = imageUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f276633a, fVar.f276633a) && Intrinsics.f(this.f276634b, fVar.f276634b);
    }

    public final int hashCode() {
        return this.f276634b.hashCode() + (this.f276633a.hashCode() * 31);
    }
}
