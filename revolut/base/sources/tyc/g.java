package tyc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f275545a;

    public g(String userDefinedType) {
        Intrinsics.checkNotNullParameter(userDefinedType, "userDefinedType");
        this.f275545a = userDefinedType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f275545a, ((g) obj2).f275545a);
    }

    public final int hashCode() {
        return this.f275545a.hashCode();
    }
}
