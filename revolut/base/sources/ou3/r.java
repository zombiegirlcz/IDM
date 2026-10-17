package ou3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f229812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f229813b;

    public r(String title, q style) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f229812a = title;
        this.f229813b = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f229812a, rVar.f229812a) && this.f229813b == rVar.f229813b;
    }

    public final int hashCode() {
        return this.f229813b.hashCode() + (this.f229812a.hashCode() * 31);
    }
}
