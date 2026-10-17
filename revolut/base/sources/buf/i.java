package buf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k71.i f18807a;

    public i(k71.i result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f18807a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f18807a, ((i) obj2).f18807a);
    }

    public final int hashCode() {
        return this.f18807a.hashCode();
    }
}
