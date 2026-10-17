package dda;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113185b;

    public l(String value, String str) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f113184a = value;
        this.f113185b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f113184a, lVar.f113184a) && Intrinsics.f(this.f113185b, lVar.f113185b);
    }

    public final int hashCode() {
        int iHashCode = this.f113184a.hashCode() * 31;
        String str = this.f113185b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
