package ti7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f271426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f271427b;

    public a(String title, String subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f271426a = title;
        this.f271427b = subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f271426a, aVar.f271426a) && Intrinsics.f(this.f271427b, aVar.f271427b);
    }

    public final int hashCode() {
        return this.f271427b.hashCode() + (this.f271426a.hashCode() * 31);
    }
}
