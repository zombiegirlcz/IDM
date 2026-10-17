package xe4;

import kotlin.jvm.internal.Intrinsics;
import mx0.q5;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q5 f304530a;

    public c(q5 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f304530a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f304530a, ((c) obj2).f304530a);
    }

    public final int hashCode() {
        return this.f304530a.hashCode();
    }
}
