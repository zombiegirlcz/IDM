package ko8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f186270a;

    public d(String qrData) {
        Intrinsics.checkNotNullParameter(qrData, "qrData");
        this.f186270a = qrData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f186270a, ((d) obj2).f186270a);
    }

    public final int hashCode() {
        return this.f186270a.hashCode();
    }
}
