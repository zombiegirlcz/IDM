package h93;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f150129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f150130c;
    public final boolean d;

    public g0(String cardId, String pan, String cvv, boolean z) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(pan, "pan");
        Intrinsics.checkNotNullParameter(cvv, "cvv");
        this.f150128a = cardId;
        this.f150129b = pan;
        this.f150130c = cvv;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f150128a, g0Var.f150128a) && Intrinsics.f(this.f150129b, g0Var.f150129b) && Intrinsics.f(this.f150130c, g0Var.f150130c) && this.d == g0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.c(p.a.c(this.f150128a.hashCode() * 31, 31, this.f150129b), 31, this.f150130c);
    }
}
