package ig0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f161070a;

    public c(List result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f161070a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f161070a, ((c) obj2).f161070a);
    }

    public final int hashCode() {
        return this.f161070a.hashCode();
    }
}
