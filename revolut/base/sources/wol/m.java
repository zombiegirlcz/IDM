package wol;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f298969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f298970b;

    public m(l qrCodeState, h operationBanner) {
        Intrinsics.checkNotNullParameter(qrCodeState, "qrCodeState");
        Intrinsics.checkNotNullParameter(operationBanner, "operationBanner");
        this.f298969a = qrCodeState;
        this.f298970b = operationBanner;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f298969a, mVar.f298969a) && Intrinsics.f(this.f298970b, mVar.f298970b);
    }

    public final int hashCode() {
        return this.f298970b.hashCode() + (this.f298969a.hashCode() * 31);
    }
}
