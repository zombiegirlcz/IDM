package rbc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f253010a;

    public f(String trackingNumber) {
        Intrinsics.checkNotNullParameter(trackingNumber, "trackingNumber");
        this.f253010a = trackingNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f253010a, ((f) obj2).f253010a);
    }

    public final int hashCode() {
        return this.f253010a.hashCode();
    }
}
