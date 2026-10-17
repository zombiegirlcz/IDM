package q50;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y50.b f242200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f242201b;

    public a(y50.b config, String str) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f242200a = config;
        this.f242201b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f242200a, aVar.f242200a) && Intrinsics.f(this.f242201b, aVar.f242201b);
    }

    public final int hashCode() {
        int iHashCode = this.f242200a.hashCode() * 31;
        String str = this.f242201b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
