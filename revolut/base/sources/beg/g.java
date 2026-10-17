package beg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14830a;

    public g(List selectedBeds) {
        Intrinsics.checkNotNullParameter(selectedBeds, "selectedBeds");
        this.f14830a = selectedBeds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f14830a, ((g) obj2).f14830a);
    }

    public final int hashCode() {
        return this.f14830a.hashCode();
    }
}
