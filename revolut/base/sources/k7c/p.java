package k7c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f181986a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof p) {
            return Intrinsics.f(this.f181986a, ((p) obj2).f181986a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f181986a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return p.a.p("DodPaymentMethodsParams(merchantPublicKey=", this.f181986a, ")");
    }
}
