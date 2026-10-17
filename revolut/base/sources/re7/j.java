package re7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f253538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f253539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f253540c;
    public final String d;

    public j(String design, String designGroup, String brand, String thumbnailUrl) {
        Intrinsics.checkNotNullParameter(design, "design");
        Intrinsics.checkNotNullParameter(designGroup, "designGroup");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
        this.f253538a = design;
        this.f253539b = designGroup;
        this.f253540c = brand;
        this.d = thumbnailUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f253538a, jVar.f253538a) && Intrinsics.f(this.f253539b, jVar.f253539b) && Intrinsics.f(this.f253540c, jVar.f253540c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f253538a.hashCode() * 31, 31, this.f253539b), 31, this.f253540c);
    }
}
