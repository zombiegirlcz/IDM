package eoe;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f127904a;

    public e(List taxResidencies) {
        Intrinsics.checkNotNullParameter(taxResidencies, "taxResidencies");
        this.f127904a = taxResidencies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f127904a, ((e) obj2).f127904a);
    }

    public final int hashCode() {
        return this.f127904a.hashCode();
    }
}
