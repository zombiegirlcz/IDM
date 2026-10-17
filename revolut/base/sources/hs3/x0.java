package hs3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class x0 implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f154970c;
    public final String d;

    public x0(String title, String description, String primaryButtonTitle, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButtonTitle, "primaryButtonTitle");
        this.f154968a = title;
        this.f154969b = description;
        this.f154970c = primaryButtonTitle;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj2;
        return Intrinsics.f(this.f154968a, x0Var.f154968a) && Intrinsics.f(this.f154969b, x0Var.f154969b) && Intrinsics.f(this.f154970c, x0Var.f154970c) && Intrinsics.f(this.d, x0Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f154968a.hashCode() * 31, 31, this.f154969b), 31, this.f154970c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
