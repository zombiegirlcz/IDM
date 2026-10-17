package we6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f296652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f296653c;

    public l0(String institutionId, String str, String institutionName) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(institutionName, "institutionName");
        this.f296651a = institutionId;
        this.f296652b = str;
        this.f296653c = institutionName;
    }

    public final String b() {
        return this.f296652b;
    }

    public final String c() {
        return this.f296651a;
    }

    public final String d() {
        return this.f296653c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f296651a, l0Var.f296651a) && Intrinsics.f(this.f296652b, l0Var.f296652b) && Intrinsics.f(this.f296653c, l0Var.f296653c);
    }

    public final int hashCode() {
        int iHashCode = this.f296651a.hashCode() * 31;
        String str = this.f296652b;
        return this.f296653c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
