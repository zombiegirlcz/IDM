package ou3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f229804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f229805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f229806c;

    public n(String title, String description, String buttonTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.f229804a = title;
        this.f229805b = description;
        this.f229806c = buttonTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f229804a, nVar.f229804a) && Intrinsics.f(this.f229805b, nVar.f229805b) && Intrinsics.f(this.f229806c, nVar.f229806c);
    }

    public final int hashCode() {
        return this.f229806c.hashCode() + p.a.c(this.f229804a.hashCode() * 31, 31, this.f229805b);
    }
}
