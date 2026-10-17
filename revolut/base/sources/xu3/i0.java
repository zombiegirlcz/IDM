package xu3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f308909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f308910c;
    public final String d;

    public i0(String title, String description, String backButtonTitle, String confirmButtonTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(backButtonTitle, "backButtonTitle");
        Intrinsics.checkNotNullParameter(confirmButtonTitle, "confirmButtonTitle");
        this.f308908a = title;
        this.f308909b = description;
        this.f308910c = backButtonTitle;
        this.d = confirmButtonTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f308908a, i0Var.f308908a) && Intrinsics.f(this.f308909b, i0Var.f308909b) && Intrinsics.f(this.f308910c, i0Var.f308910c) && Intrinsics.f(this.d, i0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f308908a.hashCode() * 31, 31, this.f308909b), 31, this.f308910c);
    }
}
