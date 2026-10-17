package mj6;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tx0.r3;
import tx0.s3;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f205931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f205932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s3 f205933c;
    public final String d;
    public final String e;
    public final String f;

    public i(List items, boolean z, r3 r3Var, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f205931a = items;
        this.f205932b = z;
        this.f205933c = r3Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // cli.p
    public final List c() {
        return this.f205931a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f205931a, iVar.f205931a) && this.f205932b == iVar.f205932b && Intrinsics.f(this.f205933c, iVar.f205933c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f205931a.hashCode() * 31, 31, this.f205932b);
        s3 s3Var = this.f205933c;
        int iHashCode = (iC + (s3Var == null ? 0 : s3Var.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
