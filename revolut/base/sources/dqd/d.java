package dqd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f116941a;

    public d(List ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        this.f116941a = ids;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f116941a, ((d) obj2).f116941a);
    }

    public final int hashCode() {
        return this.f116941a.hashCode();
    }
}
