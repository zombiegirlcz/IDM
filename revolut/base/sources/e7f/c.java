package e7f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f123317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f123318b;

    public c(e domainState, String str) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        this.f123317a = domainState;
        this.f123318b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f123317a, cVar.f123317a) && Intrinsics.f(this.f123318b, cVar.f123318b);
    }

    public final int hashCode() {
        int iHashCode = this.f123317a.hashCode() * 31;
        String str = this.f123318b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
