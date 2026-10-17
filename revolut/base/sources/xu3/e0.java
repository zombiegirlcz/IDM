package xu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f308890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f308891c;
    public final String d;

    public e0(String title, String description, String closeButtonTitle, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(closeButtonTitle, "closeButtonTitle");
        this.f308889a = title;
        this.f308890b = description;
        this.f308891c = closeButtonTitle;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f308889a, e0Var.f308889a) && Intrinsics.f(this.f308890b, e0Var.f308890b) && Intrinsics.f(this.f308891c, e0Var.f308891c) && Intrinsics.f(this.d, e0Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f308889a.hashCode() * 31, 31, this.f308890b), 31, this.f308891c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
