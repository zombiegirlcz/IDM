package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y70 f166616a;

    public u70(y70 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f166616a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u70) && Intrinsics.f(this.f166616a, ((u70) obj2).f166616a);
    }

    public final int hashCode() {
        return this.f166616a.hashCode();
    }
}
