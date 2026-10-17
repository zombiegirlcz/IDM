package g12;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f139523a;

    public i(String qrValue) {
        Intrinsics.checkNotNullParameter(qrValue, "qrValue");
        this.f139523a = qrValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f139523a, ((i) obj2).f139523a);
    }

    public final int hashCode() {
        return this.f139523a.hashCode();
    }
}
