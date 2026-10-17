package q8k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f243149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qua.p f243150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f243151c;

    public k(dj0.d amount, qua.p result, boolean z) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(result, "result");
        this.f243149a = amount;
        this.f243150b = result;
        this.f243151c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f243149a, kVar.f243149a) && Intrinsics.f(this.f243150b, kVar.f243150b) && this.f243151c == kVar.f243151c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f243151c) + ((this.f243150b.hashCode() + (this.f243149a.hashCode() * 31)) * 31);
    }
}
