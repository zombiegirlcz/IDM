package mx0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class t9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f210019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f210020b;

    public t9(List markers, boolean z) {
        Intrinsics.checkNotNullParameter(markers, "markers");
        this.f210019a = markers;
        this.f210020b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t9)) {
            return false;
        }
        t9 t9Var = (t9) obj2;
        return Intrinsics.f(this.f210019a, t9Var.f210019a) && this.f210020b == t9Var.f210020b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f210020b) + (this.f210019a.hashCode() * 31);
    }
}
