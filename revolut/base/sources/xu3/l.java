package xu3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f308920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0 f308921c;
    public final k d;

    public l(String title, String description, o0 type, k icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f308919a = title;
        this.f308920b = description;
        this.f308921c = type;
        this.d = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f308919a, lVar.f308919a) && Intrinsics.f(this.f308920b, lVar.f308920b) && this.f308921c == lVar.f308921c && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f308921c.hashCode() + p.a.c(this.f308919a.hashCode() * 31, 31, this.f308920b)) * 31);
    }
}
