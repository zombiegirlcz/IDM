package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j30 implements m30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n30 f164788a;

    public j30(n30 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f164788a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j30) && Intrinsics.f(this.f164788a, ((j30) obj2).f164788a);
    }

    public final int hashCode() {
        return this.f164788a.hashCode();
    }
}
