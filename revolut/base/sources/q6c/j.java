package q6c;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f242548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f242549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f242550c;

    public j(String paymentToken, n paymentState, String str) {
        Intrinsics.checkNotNullParameter(paymentToken, "paymentToken");
        Intrinsics.checkNotNullParameter(paymentState, "paymentState");
        this.f242548a = paymentToken;
        this.f242549b = paymentState;
        this.f242550c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f242548a, jVar.f242548a) && this.f242549b == jVar.f242549b && Intrinsics.f(this.f242550c, jVar.f242550c);
    }

    public final int hashCode() {
        int iHashCode = (this.f242549b.hashCode() + (this.f242548a.hashCode() * 31)) * 31;
        String str = this.f242550c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
