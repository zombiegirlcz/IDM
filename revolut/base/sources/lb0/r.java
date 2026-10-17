package lb0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r implements s7a.c0, w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f193552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f193553b;

    public r(String itemId, wi0.b code) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f193552a = itemId;
        this.f193553b = code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f193552a, rVar.f193552a) && Intrinsics.f(this.f193553b, rVar.f193553b);
    }

    @Override // lb0.w
    public final String getItemId() {
        return this.f193552a;
    }

    public final int hashCode() {
        return this.f193553b.f297794a.hashCode() + (this.f193552a.hashCode() * 31);
    }
}
