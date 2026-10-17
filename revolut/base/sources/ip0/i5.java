package ip0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f164640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ms0.v f164641b;

    public i5(List labels, ms0.v style) {
        Intrinsics.checkNotNullParameter(labels, "labels");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f164640a = labels;
        this.f164641b = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i5)) {
            return false;
        }
        i5 i5Var = (i5) obj2;
        return Intrinsics.f(this.f164640a, i5Var.f164640a) && this.f164641b == i5Var.f164641b;
    }

    public final int hashCode() {
        return this.f164641b.hashCode() + (this.f164640a.hashCode() * 31);
    }
}
