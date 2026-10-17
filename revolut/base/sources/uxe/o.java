package uxe;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tx0.r3;
import tx0.s3;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f283997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f283998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s3 f283999c;
    public final String d;
    public final String e;

    public o(List items, boolean z, r3 r3Var, String str, String str2) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f283997a = items;
        this.f283998b = z;
        this.f283999c = r3Var;
        this.d = str;
        this.e = str2;
    }

    @Override // cli.p
    public final List c() {
        return this.f283997a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f283997a, oVar.f283997a) && this.f283998b == oVar.f283998b && Intrinsics.f(this.f283999c, oVar.f283999c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f283997a.hashCode() * 31, 31, this.f283998b);
        s3 s3Var = this.f283999c;
        int iHashCode = (iC + (s3Var == null ? 0 : s3Var.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
