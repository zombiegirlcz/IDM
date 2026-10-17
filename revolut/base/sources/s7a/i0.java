package s7a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dii.a f260609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f260610b;

    public i0(dii.a inputData, String str) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f260609a = inputData;
        this.f260610b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f260609a, i0Var.f260609a) && Intrinsics.f(this.f260610b, i0Var.f260610b);
    }

    public final int hashCode() {
        int iHashCode = this.f260609a.hashCode() * 31;
        String str = this.f260610b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
