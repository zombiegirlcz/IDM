package x33;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f302643a;

    public i(List pocketsInfo) {
        Intrinsics.checkNotNullParameter(pocketsInfo, "pocketsInfo");
        this.f302643a = pocketsInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f302643a, ((i) obj2).f302643a);
    }

    public final int hashCode() {
        return this.f302643a.hashCode();
    }
}
