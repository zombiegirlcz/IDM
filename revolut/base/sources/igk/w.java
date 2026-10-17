package igk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class w implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f161274a;

    public w(x inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f161274a = inputData;
    }

    public final x b() {
        return this.f161274a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f161274a, ((w) obj2).f161274a);
    }

    public final int hashCode() {
        return this.f161274a.hashCode();
    }
}
