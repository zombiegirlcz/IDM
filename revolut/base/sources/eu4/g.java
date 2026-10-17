package eu4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f129505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f129506b;

    public g(f balance, aim.e paymentOptions) {
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(paymentOptions, "paymentOptions");
        this.f129505a = balance;
        this.f129506b = paymentOptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f129505a, gVar.f129505a) && Intrinsics.f(this.f129506b, gVar.f129506b);
    }

    public final int hashCode() {
        return this.f129506b.hashCode() + (this.f129505a.hashCode() * 31);
    }
}
