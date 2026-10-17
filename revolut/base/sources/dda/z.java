package dda;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f113210b;

    public z(String str, List tips) {
        Intrinsics.checkNotNullParameter(tips, "tips");
        this.f113209a = str;
        this.f113210b = tips;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f113209a, zVar.f113209a) && Intrinsics.f(this.f113210b, zVar.f113210b);
    }

    public final int hashCode() {
        String str = this.f113209a;
        return this.f113210b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
