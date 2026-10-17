package ko8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f186272a;

    public f(String qrData) {
        Intrinsics.checkNotNullParameter(qrData, "qrData");
        this.f186272a = qrData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f186272a, ((f) obj2).f186272a);
    }

    public final int hashCode() {
        return this.f186272a.hashCode();
    }
}
