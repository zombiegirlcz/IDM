package qnc;

import java.util.List;
import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f247933a;

    public b(List riskMetricsFields) {
        Intrinsics.checkNotNullParameter(riskMetricsFields, "riskMetricsFields");
        this.f247933a = riskMetricsFields;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f247933a, ((b) obj2).f247933a);
    }

    public final int hashCode() {
        return this.f247933a.hashCode();
    }
}
