package l10;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class t extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n10.b f191398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f191399b;

    public t(n10.b cardType, boolean z) {
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        this.f191398a = cardType;
        this.f191399b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f191398a == tVar.f191398a && this.f191399b == tVar.f191399b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f191399b) + (this.f191398a.hashCode() * 31);
    }
}
