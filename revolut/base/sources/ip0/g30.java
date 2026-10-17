package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g30 implements m30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n30 f164336a;

    public g30(n30 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f164336a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g30) && Intrinsics.f(this.f164336a, ((g30) obj2).f164336a);
    }

    public final int hashCode() {
        return this.f164336a.hashCode();
    }
}
