package g94;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pu3.d f141458a;

    public d(pu3.d debtType) {
        Intrinsics.checkNotNullParameter(debtType, "debtType");
        this.f141458a = debtType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f141458a == ((d) obj2).f141458a;
    }

    public final int hashCode() {
        return this.f141458a.hashCode();
    }
}
