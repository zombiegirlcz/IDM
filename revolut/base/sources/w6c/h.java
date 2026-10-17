package w6c;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f295416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f295417c;

    public h(dj0.d balance, String paymentMethodId, String pocketId) {
        Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(balance, "balance");
        this.f295415a = paymentMethodId;
        this.f295416b = pocketId;
        this.f295417c = balance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f295415a, hVar.f295415a) && Intrinsics.f(this.f295416b, hVar.f295416b) && Intrinsics.f(this.f295417c, hVar.f295417c);
    }

    public final int hashCode() {
        return this.f295417c.hashCode() + p.a.c(this.f295415a.hashCode() * 31, 31, this.f295416b);
    }
}
