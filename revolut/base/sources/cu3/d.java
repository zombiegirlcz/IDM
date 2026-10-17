package cu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f108809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f108810c;
    public final String d;
    public final String e;

    public d(String applicationId, int i, boolean z, String productType, String pluginName) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(pluginName, "pluginName");
        this.f108808a = applicationId;
        this.f108809b = i;
        this.f108810c = z;
        this.d = productType;
        this.e = pluginName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f108808a, dVar.f108808a) && this.f108809b == dVar.f108809b && this.f108810c == dVar.f108810c && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(j6.a.c(j6.a.b(this.f108809b, this.f108808a.hashCode() * 31, 31), 31, this.f108810c), 31, this.d);
    }
}
