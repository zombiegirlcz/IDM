package xu3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f308885b;

    public c0(String title, String icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f308884a = title;
        this.f308885b = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f308884a, c0Var.f308884a) && Intrinsics.f(this.f308885b, c0Var.f308885b);
    }

    public final int hashCode() {
        return this.f308885b.hashCode() + (this.f308884a.hashCode() * 31);
    }
}
