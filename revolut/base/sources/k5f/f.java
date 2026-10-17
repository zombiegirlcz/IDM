package k5f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f181503a;

    public f(d inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f181503a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f181503a, ((f) obj2).f181503a);
    }

    public final int hashCode() {
        return this.f181503a.hashCode();
    }
}
