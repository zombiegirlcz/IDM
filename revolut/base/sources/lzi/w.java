package lzi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class w implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f201007b;

    public w(dj0.d amount, String categoryId) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f201006a = categoryId;
        this.f201007b = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f201006a, wVar.f201006a) && Intrinsics.f(this.f201007b, wVar.f201007b);
    }

    public final int hashCode() {
        return this.f201007b.hashCode() + (this.f201006a.hashCode() * 31);
    }
}
