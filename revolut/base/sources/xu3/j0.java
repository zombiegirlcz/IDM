package xu3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f308913b;

    public j0(String title, p0 type) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f308912a = title;
        this.f308913b = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f308912a, j0Var.f308912a) && this.f308913b == j0Var.f308913b;
    }

    public final int hashCode() {
        return this.f308913b.hashCode() + (this.f308912a.hashCode() * 31);
    }
}
