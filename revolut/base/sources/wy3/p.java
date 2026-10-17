package wy3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f301086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f301087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f301088c;
    public final String d;
    public final boolean e;

    public p(String id10, String title, String description, String buttonTitle, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.f301086a = id10;
        this.f301087b = title;
        this.f301088c = description;
        this.d = buttonTitle;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f301086a, pVar.f301086a) && Intrinsics.f(this.f301087b, pVar.f301087b) && Intrinsics.f(this.f301088c, pVar.f301088c) && Intrinsics.f(this.d, pVar.d) && this.e == pVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + p.a.c(p.a.c(p.a.c(this.f301086a.hashCode() * 31, 31, this.f301087b), 31, this.f301088c), 31, this.d);
    }
}
