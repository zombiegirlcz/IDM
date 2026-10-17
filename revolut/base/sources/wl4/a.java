package wl4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f298408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f298409b;

    public a(String title, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f298408a = title;
        this.f298409b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f298408a, aVar.f298408a) && Intrinsics.f(this.f298409b, aVar.f298409b);
    }

    public final int hashCode() {
        return this.f298409b.hashCode() + (this.f298408a.hashCode() * 31);
    }
}
