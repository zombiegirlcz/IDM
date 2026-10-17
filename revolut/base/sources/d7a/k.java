package d7a;

import ip0.t5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t5 f111904a;

    public k(t5 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f111904a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f111904a, ((k) obj2).f111904a);
    }

    public final int hashCode() {
        return this.f111904a.hashCode();
    }
}
