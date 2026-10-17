package xo1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f307568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f307569b;

    public e(String transactionId, String str) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f307568a = transactionId;
        this.f307569b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f307568a, eVar.f307568a) && Intrinsics.f(this.f307569b, eVar.f307569b);
    }

    public final int hashCode() {
        int iHashCode = this.f307568a.hashCode() * 31;
        String str = this.f307569b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
