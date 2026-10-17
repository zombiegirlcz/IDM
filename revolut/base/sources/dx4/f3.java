package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120594c;

    public f3(String title, String description, String buttonTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.f120592a = title;
        this.f120593b = description;
        this.f120594c = buttonTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f3)) {
            return false;
        }
        f3 f3Var = (f3) obj2;
        return Intrinsics.f(this.f120592a, f3Var.f120592a) && Intrinsics.f(this.f120593b, f3Var.f120593b) && Intrinsics.f(this.f120594c, f3Var.f120594c);
    }

    public final int hashCode() {
        return this.f120594c.hashCode() + p.a.c(this.f120592a.hashCode() * 31, 31, this.f120593b);
    }
}
