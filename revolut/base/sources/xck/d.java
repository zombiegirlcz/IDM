package xck;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f304149b;

    public d(String icon, String title) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f304148a = icon;
        this.f304149b = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f304148a, dVar.f304148a) && Intrinsics.f(this.f304149b, dVar.f304149b);
    }

    public final int hashCode() {
        return this.f304149b.hashCode() + (this.f304148a.hashCode() * 31);
    }
}
