package we6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f296637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f296638c;
    public final io3.b d;

    public f(io3.b bVar, String institutionId, String institutionName, String str) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(institutionName, "institutionName");
        this.f296636a = institutionId;
        this.f296637b = institutionName;
        this.f296638c = str;
        this.d = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f296636a, fVar.f296636a) && Intrinsics.f(this.f296637b, fVar.f296637b) && Intrinsics.f(this.f296638c, fVar.f296638c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f296636a.hashCode() * 31, 31, this.f296637b);
        String str = this.f296638c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        io3.b bVar = this.d;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }
}
