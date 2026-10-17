package h93;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f150151b;

    public l(String pin, boolean z) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f150150a = pin;
        this.f150151b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f150150a, lVar.f150150a) && this.f150151b == lVar.f150151b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f150151b) + (this.f150150a.hashCode() * 31);
    }
}
