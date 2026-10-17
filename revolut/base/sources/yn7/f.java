package yn7;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f315267a;

    public f(d carType) {
        Intrinsics.checkNotNullParameter(carType, "carType");
        this.f315267a = carType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f315267a == ((f) obj2).f315267a;
    }

    public final int hashCode() {
        return this.f315267a.hashCode();
    }
}
