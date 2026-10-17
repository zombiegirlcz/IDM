package pwg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f240466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f240467c;

    public k(String title, String subtitle, String iconResKey) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(iconResKey, "iconResKey");
        this.f240465a = title;
        this.f240466b = subtitle;
        this.f240467c = iconResKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f240465a, kVar.f240465a) && Intrinsics.f(this.f240466b, kVar.f240466b) && Intrinsics.f(this.f240467c, kVar.f240467c);
    }

    public final int hashCode() {
        return this.f240467c.hashCode() + p.a.c(this.f240465a.hashCode() * 31, 31, this.f240466b);
    }
}
