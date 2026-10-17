package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class za extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273207a;

    public za(String reasonCode) {
        Intrinsics.checkNotNullParameter(reasonCode, "reasonCode");
        this.f273207a = reasonCode;
    }

    public final String a() {
        return this.f273207a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof za) && Intrinsics.f(this.f273207a, ((za) obj2).f273207a);
    }

    public final int hashCode() {
        return this.f273207a.hashCode();
    }
}
