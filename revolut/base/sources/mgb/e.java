package mgb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f205234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f205235c;

    public e(String imageUrl, String title, String subtitle) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f205233a = imageUrl;
        this.f205234b = title;
        this.f205235c = subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f205233a, eVar.f205233a) && Intrinsics.f(this.f205234b, eVar.f205234b) && Intrinsics.f(this.f205235c, eVar.f205235c);
    }

    public final int hashCode() {
        return this.f205235c.hashCode() + p.a.c(this.f205233a.hashCode() * 31, 31, this.f205234b);
    }
}
