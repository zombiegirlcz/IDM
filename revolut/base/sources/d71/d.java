package d71;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f111753c;

    public d(String categoryKey, String name, String iconUrl) {
        Intrinsics.checkNotNullParameter(categoryKey, "categoryKey");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        this.f111751a = categoryKey;
        this.f111752b = name;
        this.f111753c = iconUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f111751a, dVar.f111751a) && Intrinsics.f(this.f111752b, dVar.f111752b) && Intrinsics.f(this.f111753c, dVar.f111753c);
    }

    public final int hashCode() {
        return this.f111753c.hashCode() + p.a.c(this.f111751a.hashCode() * 31, 31, this.f111752b);
    }
}
