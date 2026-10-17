package gpf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f145451b;

    public b(String requestId, a outputData) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        this.f145450a = requestId;
        this.f145451b = outputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f145450a, bVar.f145450a) && Intrinsics.f(this.f145451b, bVar.f145451b);
    }

    public final int hashCode() {
        return this.f145451b.f145449a.hashCode() + (this.f145450a.hashCode() * 31);
    }
}
