package p6i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f233321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f233322b;

    public d(dj0.d topUpLimit, String productName) {
        Intrinsics.checkNotNullParameter(topUpLimit, "topUpLimit");
        Intrinsics.checkNotNullParameter(productName, "productName");
        this.f233321a = topUpLimit;
        this.f233322b = productName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f233321a, dVar.f233321a) && Intrinsics.f(this.f233322b, dVar.f233322b);
    }

    public final int hashCode() {
        return this.f233322b.hashCode() + (this.f233321a.hashCode() * 31);
    }
}
