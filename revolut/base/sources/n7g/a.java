package n7g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f213087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f213088b;

    public a(String receiptId, boolean z) {
        Intrinsics.checkNotNullParameter(receiptId, "receiptId");
        this.f213087a = receiptId;
        this.f213088b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f213087a, aVar.f213087a) && this.f213088b == aVar.f213088b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f213088b) + (this.f213087a.hashCode() * 31);
    }
}
