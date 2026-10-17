package wh4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dz3.c f297394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x35.e f297395b;

    public a(dz3.c configuration, x35.e eVar) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f297394a = configuration;
        this.f297395b = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f297394a, aVar.f297394a) && Intrinsics.f(this.f297395b, aVar.f297395b);
    }

    public final int hashCode() {
        int iHashCode = this.f297394a.hashCode() * 31;
        x35.e eVar = this.f297395b;
        return iHashCode + (eVar == null ? 0 : eVar.hashCode());
    }
}
