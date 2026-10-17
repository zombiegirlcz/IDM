package s28;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f259256a;

    public b(List feed) {
        Intrinsics.checkNotNullParameter(feed, "feed");
        this.f259256a = feed;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f259256a, ((b) obj2).f259256a);
    }

    public final int hashCode() {
        return this.f259256a.hashCode();
    }
}
