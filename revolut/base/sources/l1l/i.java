package l1l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f191584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f191585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f191586c;

    public i(xi0.b sourceCurrency, xi0.b targetCurrency, boolean z) {
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        this.f191584a = sourceCurrency;
        this.f191585b = targetCurrency;
        this.f191586c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f191584a, iVar.f191584a) && Intrinsics.f(this.f191585b, iVar.f191585b) && this.f191586c == iVar.f191586c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f191586c) + h30.l.j(this.f191585b, this.f191584a.hashCode() * 31, 31);
    }
}
