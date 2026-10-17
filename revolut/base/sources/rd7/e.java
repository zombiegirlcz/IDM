package rd7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f253363a;

    public e(j inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f253363a = inputData;
    }

    public final j b() {
        return this.f253363a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f253363a, ((e) obj2).f253363a);
    }

    public final int hashCode() {
        return this.f253363a.hashCode();
    }
}
