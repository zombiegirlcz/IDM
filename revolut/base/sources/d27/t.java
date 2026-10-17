package d27;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f110769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f110770b;

    public t() {
        this(0);
    }

    public final boolean a() {
        Integer num = this.f110770b;
        int iIntValue = num != null ? num.intValue() : 0;
        return 1 <= iIntValue && iIntValue < 501;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f110769a == tVar.f110769a && Intrinsics.f(this.f110770b, tVar.f110770b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f110769a) * 31;
        Integer num = this.f110770b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public t(boolean z, Integer num) {
        this.f110769a = z;
        this.f110770b = num;
    }

    public /* synthetic */ t(int i) {
        this(false, 1);
    }
}
