package lg8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f195086a;

    public e(a inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f195086a = inputData;
    }

    public final a b() {
        return this.f195086a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f195086a, ((e) obj2).f195086a);
    }

    public final int hashCode() {
        return this.f195086a.f195083a.hashCode();
    }
}
