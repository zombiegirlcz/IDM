package n0f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f211022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f211023b;

    public d() {
        this(null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f211022a, dVar.f211022a) && Intrinsics.f(this.f211023b, dVar.f211023b);
    }

    public final int hashCode() {
        wi0.b bVar = this.f211022a;
        int iHashCode = (bVar == null ? 0 : bVar.f297794a.hashCode()) * 31;
        String str = this.f211023b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public d(wi0.b bVar, String str) {
        this.f211022a = bVar;
        this.f211023b = str;
    }
}
