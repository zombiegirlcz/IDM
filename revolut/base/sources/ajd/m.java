package ajd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5549a;

    public m(List data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f5549a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f5549a, ((m) obj2).f5549a);
    }

    public final int hashCode() {
        return this.f5549a.hashCode();
    }
}
