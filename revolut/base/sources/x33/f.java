package x33;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f302640a;

    public f(List pocketsWithSubaccount) {
        Intrinsics.checkNotNullParameter(pocketsWithSubaccount, "pocketsWithSubaccount");
        this.f302640a = pocketsWithSubaccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f302640a, ((f) obj2).f302640a);
    }

    public final int hashCode() {
        return this.f302640a.hashCode();
    }
}
