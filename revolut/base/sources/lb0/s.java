package lb0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s implements s7a.c0, w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f193559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f193560b;

    public s(String itemId, xi0.b currency) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f193559a = itemId;
        this.f193560b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f193559a, sVar.f193559a) && Intrinsics.f(this.f193560b, sVar.f193560b);
    }

    @Override // lb0.w
    public final String getItemId() {
        return this.f193559a;
    }

    public final int hashCode() {
        return this.f193560b.hashCode() + (this.f193559a.hashCode() * 31);
    }
}
