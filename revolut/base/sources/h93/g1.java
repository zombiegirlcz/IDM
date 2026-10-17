package h93;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g1 implements h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150131a;

    public g1(String reasonCode) {
        Intrinsics.checkNotNullParameter(reasonCode, "reasonCode");
        this.f150131a = reasonCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g1) && Intrinsics.f(this.f150131a, ((g1) obj2).f150131a);
    }

    public final int hashCode() {
        return this.f150131a.hashCode();
    }
}
