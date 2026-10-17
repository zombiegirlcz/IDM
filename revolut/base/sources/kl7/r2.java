package kl7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f185382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f185383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f185384c;
    public final boolean d;

    public r2(String title, String description, String imageUrl, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.f185382a = title;
        this.f185383b = description;
        this.f185384c = imageUrl;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj2;
        return Intrinsics.f(this.f185382a, r2Var.f185382a) && Intrinsics.f(this.f185383b, r2Var.f185383b) && Intrinsics.f(this.f185384c, r2Var.f185384c) && this.d == r2Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.c(p.a.c(this.f185382a.hashCode() * 31, 31, this.f185383b), 31, this.f185384c);
    }
}
