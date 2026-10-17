package we6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a1 implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f296627a;

    public a1(y0 inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f296627a = inputData;
    }

    public final y0 b() {
        return this.f296627a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a1) && Intrinsics.f(this.f296627a, ((a1) obj2).f296627a);
    }

    public final int hashCode() {
        return this.f296627a.hashCode();
    }
}
