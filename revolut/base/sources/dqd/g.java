package dqd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f116943a;

    public g(List ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        this.f116943a = ids;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f116943a, ((g) obj2).f116943a);
    }

    public final int hashCode() {
        return this.f116943a.hashCode();
    }
}
