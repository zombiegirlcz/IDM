package lk4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ak4.a f196210a;

    public d(ak4.a amountType) {
        Intrinsics.checkNotNullParameter(amountType, "amountType");
        this.f196210a = amountType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f196210a == ((d) obj2).f196210a;
    }

    public final int hashCode() {
        return this.f196210a.hashCode();
    }
}
