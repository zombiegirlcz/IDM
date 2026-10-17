package bl6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16483b;

    public i(String selectedMethodId, String bankName) {
        Intrinsics.checkNotNullParameter(selectedMethodId, "selectedMethodId");
        Intrinsics.checkNotNullParameter(bankName, "bankName");
        this.f16482a = selectedMethodId;
        this.f16483b = bankName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f16482a, iVar.f16482a) && Intrinsics.f(this.f16483b, iVar.f16483b);
    }

    public final int hashCode() {
        return this.f16483b.hashCode() + (this.f16482a.hashCode() * 31);
    }
}
