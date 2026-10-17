package dei;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f113469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f113470c;

    public b(String sessionId, int i, boolean z) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f113468a = sessionId;
        this.f113469b = i;
        this.f113470c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f113468a, bVar.f113468a) && this.f113469b == bVar.f113469b && this.f113470c == bVar.f113470c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f113470c) + j6.a.b(this.f113469b, this.f113468a.hashCode() * 31, 31);
    }
}
