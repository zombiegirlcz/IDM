package wbl;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f296267a;

    public i(Set set) {
        this.f296267a = set;
        if (set == null || !set.isEmpty()) {
            return;
        }
        r6.b.D("if displayInstrumentTypes is empty, nothing can be displayed");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f296267a, ((i) obj2).f296267a);
    }

    public final int hashCode() {
        Set set = this.f296267a;
        if (set == null) {
            return 0;
        }
        return set.hashCode();
    }
}
