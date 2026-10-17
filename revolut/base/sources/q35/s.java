package q35;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f241839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f241840b;

    public s(String loanId, boolean z) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        this.f241839a = loanId;
        this.f241840b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f241839a, sVar.f241839a) && this.f241840b == sVar.f241840b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f241840b) + (this.f241839a.hashCode() * 31);
    }
}
