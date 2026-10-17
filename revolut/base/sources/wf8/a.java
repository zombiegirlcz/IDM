package wf8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vf8.b f297021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kc8.a f297022b;

    public a(vf8.b walletProfileExtended, kc8.a juniorCardType) {
        Intrinsics.checkNotNullParameter(walletProfileExtended, "walletProfileExtended");
        Intrinsics.checkNotNullParameter(juniorCardType, "juniorCardType");
        this.f297021a = walletProfileExtended;
        this.f297022b = juniorCardType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f297021a, aVar.f297021a) && this.f297022b == aVar.f297022b;
    }

    public final int hashCode() {
        return this.f297022b.hashCode() + (this.f297021a.hashCode() * 31);
    }
}
