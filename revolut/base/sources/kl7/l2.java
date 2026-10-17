package kl7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f185356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f185357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nr7.b f185358c;
    public final boolean d;

    public l2(String title, String description, nr7.b iconKey, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(iconKey, "iconKey");
        this.f185356a = title;
        this.f185357b = description;
        this.f185358c = iconKey;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj2;
        return Intrinsics.f(this.f185356a, l2Var.f185356a) && Intrinsics.f(this.f185357b, l2Var.f185357b) && this.f185358c == l2Var.f185358c && this.d == l2Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.f185358c.hashCode() + p.a.c(this.f185356a.hashCode() * 31, 31, this.f185357b)) * 31);
    }
}
