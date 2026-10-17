package nxe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f220561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f220562b;

    public b(String cardId, boolean z) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f220561a = cardId;
        this.f220562b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f220561a, bVar.f220561a) && this.f220562b == bVar.f220562b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f220562b) + (this.f220561a.hashCode() * 31);
    }
}
