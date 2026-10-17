package i13;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f157534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f157535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f157536c;
    public final wi0.b d;

    public i(String pinCode, wi0.b bVar, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(pinCode, "pinCode");
        this.f157534a = pinCode;
        this.f157535b = z;
        this.f157536c = z3;
        this.d = bVar;
    }

    public static i a(i iVar, boolean z, boolean z3, wi0.b bVar, int i) {
        String pinCode = iVar.f157534a;
        if ((i & 2) != 0) {
            z = iVar.f157535b;
        }
        if ((i & 4) != 0) {
            z3 = iVar.f157536c;
        }
        if ((i & 8) != 0) {
            bVar = iVar.d;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(pinCode, "pinCode");
        return new i(pinCode, bVar, z, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f157534a, iVar.f157534a) && this.f157535b == iVar.f157535b && this.f157536c == iVar.f157536c && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(this.f157534a.hashCode() * 31, 31, this.f157535b), 31, this.f157536c);
        wi0.b bVar = this.d;
        return iC + (bVar == null ? 0 : bVar.f297794a.hashCode());
    }
}
