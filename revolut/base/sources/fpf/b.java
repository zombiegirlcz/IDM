package fpf;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f137095a;

    public b(Map info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.f137095a = info;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f137095a, ((b) obj2).f137095a);
    }

    public final int hashCode() {
        return this.f137095a.hashCode();
    }
}
