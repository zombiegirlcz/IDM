package nk6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f216660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f216661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io3.b f216662c;
    public final List d;

    public g(String institutionId, String institutionName, io3.b bVar, List list) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(institutionName, "institutionName");
        this.f216660a = institutionId;
        this.f216661b = institutionName;
        this.f216662c = bVar;
        this.d = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f216660a, gVar.f216660a) && Intrinsics.f(this.f216661b, gVar.f216661b) && Intrinsics.f(this.f216662c, gVar.f216662c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f216660a.hashCode() * 31, 31, this.f216661b);
        io3.b bVar = this.f216662c;
        int iHashCode = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
        List list = this.d;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }
}
