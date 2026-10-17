package d6g;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f111541a;

    public i(List fareOptions) {
        Intrinsics.checkNotNullParameter(fareOptions, "fareOptions");
        this.f111541a = fareOptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f111541a, ((i) obj2).f111541a);
    }

    public final int hashCode() {
        return this.f111541a.hashCode();
    }
}
