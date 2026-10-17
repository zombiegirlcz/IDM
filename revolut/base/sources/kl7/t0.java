package kl7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f185388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f185389b;

    public t0(String title, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f185388a = title;
        this.f185389b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return Intrinsics.f(this.f185388a, t0Var.f185388a) && Intrinsics.f(this.f185389b, t0Var.f185389b);
    }

    public final int hashCode() {
        return this.f185389b.hashCode() + (this.f185388a.hashCode() * 31);
    }
}
