package od3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class t implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f224306a;

    public t(String companyName) {
        Intrinsics.checkNotNullParameter(companyName, "companyName");
        this.f224306a = companyName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f224306a, ((t) obj2).f224306a);
    }

    public final int hashCode() {
        return this.f224306a.hashCode();
    }
}
