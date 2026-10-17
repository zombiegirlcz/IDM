package jyk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f179490a;

    public l(String rawProductCodes) {
        Intrinsics.checkNotNullParameter(rawProductCodes, "rawProductCodes");
        this.f179490a = rawProductCodes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f179490a, ((l) obj2).f179490a);
    }

    public final int hashCode() {
        return this.f179490a.hashCode();
    }
}
