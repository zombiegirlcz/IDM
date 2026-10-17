package ml3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f206624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f206625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f206626c;
    public final long d;

    public u(String point, v type, int i, long j2) {
        Intrinsics.checkNotNullParameter(point, "point");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f206624a = point;
        this.f206625b = type;
        this.f206626c = i;
        this.d = j2;
    }

    public final String a() {
        return this.f206624a;
    }

    public final long b() {
        return this.d;
    }

    public final int c() {
        return this.f206626c;
    }

    public final v d() {
        return this.f206625b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f206624a, uVar.f206624a) && this.f206625b == uVar.f206625b && this.f206626c == uVar.f206626c && this.d == uVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + j6.a.b(this.f206626c, (this.f206625b.hashCode() + (this.f206624a.hashCode() * 31)) * 31, 31);
    }
}
