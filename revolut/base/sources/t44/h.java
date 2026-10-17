package t44;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f267882a;

    public h(List addresses) {
        Intrinsics.checkNotNullParameter(addresses, "addresses");
        this.f267882a = addresses;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f267882a, ((h) obj2).f267882a);
    }

    public final int hashCode() {
        return this.f267882a.hashCode();
    }
}
