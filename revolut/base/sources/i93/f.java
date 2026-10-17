package i93;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f159554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f159555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f159556c;
    public final Boolean d;
    public final Boolean e;
    public final Boolean f;

    public f() {
        this(null, null, null, null, null, null, 63);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f159554a, fVar.f159554a) && Intrinsics.f(this.f159555b, fVar.f159555b) && Intrinsics.f(this.f159556c, fVar.f159556c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f);
    }

    public final int hashCode() {
        Boolean bool = this.f159554a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f159555b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f159556c;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.d;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.e;
        int iHashCode5 = (iHashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.f;
        return iHashCode5 + (bool6 != null ? bool6.hashCode() : 0);
    }

    public f(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, int i) {
        bool = (i & 1) != 0 ? null : bool;
        bool2 = (i & 2) != 0 ? null : bool2;
        bool3 = (i & 4) != 0 ? null : bool3;
        bool4 = (i & 8) != 0 ? null : bool4;
        bool5 = (i & 16) != 0 ? null : bool5;
        bool6 = (i & 32) != 0 ? null : bool6;
        this.f159554a = bool;
        this.f159555b = bool2;
        this.f159556c = bool3;
        this.d = bool4;
        this.e = bool5;
        this.f = bool6;
    }
}
