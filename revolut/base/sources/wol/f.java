package wol;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f298962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f298963b;

    public f(String title, String subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f298962a = title;
        this.f298963b = subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f298962a, fVar.f298962a) && Intrinsics.f(this.f298963b, fVar.f298963b);
    }

    public final int hashCode() {
        return this.f298963b.hashCode() + (this.f298962a.hashCode() * 31);
    }
}
