package g4b;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bfl.g f140449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f140450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f140451c;

    public m(bfl.g tradeSide, BigDecimal quantity, String str) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        this.f140449a = tradeSide;
        this.f140450b = quantity;
        this.f140451c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f140449a == mVar.f140449a && Intrinsics.f(this.f140450b, mVar.f140450b) && Intrinsics.f(this.f140451c, mVar.f140451c);
    }

    public final int hashCode() {
        int iD = t61.a.d(this.f140450b, this.f140449a.hashCode() * 31, 31);
        String str = this.f140451c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
