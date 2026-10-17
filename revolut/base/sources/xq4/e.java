package xq4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vm4.a f308107a;

    public e(vm4.a details) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.f308107a = details;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f308107a, ((e) obj2).f308107a);
    }

    public final int hashCode() {
        return this.f308107a.hashCode();
    }
}
