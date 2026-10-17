package hyc;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f156784a;

    public g(List payers) {
        Intrinsics.checkNotNullParameter(payers, "payers");
        this.f156784a = payers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f156784a, ((g) obj2).f156784a);
    }

    public final int hashCode() {
        return this.f156784a.hashCode();
    }
}
