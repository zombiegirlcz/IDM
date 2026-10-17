package xu3;

import dx4.a1;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f308895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f308896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f308897c;

    public g(a1 icon, String title, String description) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f308895a = icon;
        this.f308896b = title;
        this.f308897c = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f308895a == gVar.f308895a && Intrinsics.f(this.f308896b, gVar.f308896b) && Intrinsics.f(this.f308897c, gVar.f308897c);
    }

    public final int hashCode() {
        return this.f308897c.hashCode() + p.a.c(this.f308895a.hashCode() * 31, 31, this.f308896b);
    }
}
