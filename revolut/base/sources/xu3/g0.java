package xu3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f308899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f308900c;
    public final String d;

    public g0(String title, String description, String backButtonTitle, String confirmButtonTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(backButtonTitle, "backButtonTitle");
        Intrinsics.checkNotNullParameter(confirmButtonTitle, "confirmButtonTitle");
        this.f308898a = title;
        this.f308899b = description;
        this.f308900c = backButtonTitle;
        this.d = confirmButtonTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f308898a, g0Var.f308898a) && Intrinsics.f(this.f308899b, g0Var.f308899b) && Intrinsics.f(this.f308900c, g0Var.f308900c) && Intrinsics.f(this.d, g0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f308898a.hashCode() * 31, 31, this.f308899b), 31, this.f308900c);
    }
}
