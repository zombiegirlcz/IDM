package fpf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f137097b;

    public d(String requestId, c outputData) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        this.f137096a = requestId;
        this.f137097b = outputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f137096a, dVar.f137096a) && Intrinsics.f(this.f137097b, dVar.f137097b);
    }

    public final int hashCode() {
        return this.f137097b.hashCode() + (this.f137096a.hashCode() * 31);
    }
}
