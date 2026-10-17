package eq8;

import ip0.k10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k10 f128399a;

    public p(k10 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f128399a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f128399a, ((p) obj2).f128399a);
    }

    public final int hashCode() {
        return this.f128399a.hashCode();
    }
}
