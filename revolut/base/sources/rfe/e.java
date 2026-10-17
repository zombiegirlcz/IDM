package rfe;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f253764a;

    public e(List sources) {
        Intrinsics.checkNotNullParameter(sources, "sources");
        this.f253764a = sources;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f253764a, ((e) obj2).f253764a);
    }

    public final int hashCode() {
        return this.f253764a.hashCode();
    }
}
