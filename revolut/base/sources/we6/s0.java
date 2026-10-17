package we6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f296675a;

    public s0(q0 inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f296675a = inputData;
    }

    public final q0 b() {
        return this.f296675a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s0) && Intrinsics.f(this.f296675a, ((s0) obj2).f296675a);
    }

    public final int hashCode() {
        return this.f296675a.hashCode();
    }
}
