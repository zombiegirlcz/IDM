package pvg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iwg.a f240122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f240123c;
    public final String d;
    public final String e;
    public final jo3.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f240124g;

    public f(float f, iwg.a assetType, String accountTypesCombined, String currency, String asset, jo3.b value, boolean z) {
        Intrinsics.checkNotNullParameter(accountTypesCombined, "accountTypesCombined");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f240121a = accountTypesCombined;
        this.f240122b = assetType;
        this.f240123c = z;
        this.d = currency;
        this.e = asset;
        this.f = value;
        this.f240124g = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f240121a, fVar.f240121a) && this.f240122b == fVar.f240122b && this.f240123c == fVar.f240123c && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && Float.compare(this.f240124g, fVar.f240124g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f240124g) + wp5.y.e(this.f, p.a.c(p.a.c(j6.a.c((this.f240122b.hashCode() + (this.f240121a.hashCode() * 31)) * 31, 31, this.f240123c), 31, this.d), 31, this.e), 31);
    }
}
