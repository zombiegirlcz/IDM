package zw7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f325779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f325780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f325781c;

    public f0(e0 code, String title, String str) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f325779a = code;
        this.f325780b = title;
        this.f325781c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return this.f325779a == f0Var.f325779a && Intrinsics.f(this.f325780b, f0Var.f325780b) && Intrinsics.f(this.f325781c, f0Var.f325781c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f325779a.hashCode() * 31, 31, this.f325780b);
        String str = this.f325781c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
