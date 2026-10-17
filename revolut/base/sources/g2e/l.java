package g2e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f140005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f140006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f140007c;

    /* JADX WARN: Multi-variable type inference failed */
    public l() {
        this(7, (String) null, (Integer) (0 == true ? 1 : 0));
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f140005a, lVar.f140005a) && Intrinsics.f(this.f140006b, lVar.f140006b) && Intrinsics.f(this.f140007c, lVar.f140007c);
    }

    public final int hashCode() {
        String str = this.f140005a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f140006b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f140007c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public /* synthetic */ l(int i, String str, Integer num) {
        this((String) null, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str);
    }

    public l(String str, Integer num, String str2) {
        this.f140005a = str;
        this.f140006b = num;
        this.f140007c = str2;
    }
}
