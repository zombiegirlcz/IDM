package n93;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f213546a;

    public a(List colorsAttrs) {
        Intrinsics.checkNotNullParameter(colorsAttrs, "colorsAttrs");
        this.f213546a = colorsAttrs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f213546a, ((a) obj2).f213546a);
    }

    public final int hashCode() {
        return this.f213546a.hashCode();
    }
}
