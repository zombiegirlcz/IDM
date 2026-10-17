package u91;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f278362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f278363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f278364c;

    public j(String title, String subtitle, String logoUrl) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        this.f278362a = title;
        this.f278363b = subtitle;
        this.f278364c = logoUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f278362a, jVar.f278362a) && Intrinsics.f(this.f278363b, jVar.f278363b) && Intrinsics.f(this.f278364c, jVar.f278364c);
    }

    public final int hashCode() {
        return this.f278364c.hashCode() + p.a.c(this.f278362a.hashCode() * 31, 31, this.f278363b);
    }
}
