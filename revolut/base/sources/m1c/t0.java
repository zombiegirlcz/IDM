package m1c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f201457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f201458c;

    public t0(String title, String subtitle, String ctaText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(ctaText, "ctaText");
        this.f201456a = title;
        this.f201457b = subtitle;
        this.f201458c = ctaText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return Intrinsics.f(this.f201456a, t0Var.f201456a) && Intrinsics.f(this.f201457b, t0Var.f201457b) && Intrinsics.f(this.f201458c, t0Var.f201458c);
    }

    public final int hashCode() {
        return this.f201458c.hashCode() + p.a.c(this.f201456a.hashCode() * 31, 31, this.f201457b);
    }
}
