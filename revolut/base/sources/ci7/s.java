package ci7;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class s implements t {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f24418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f24419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f24420c;

    public /* synthetic */ s(int i, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        if (7 != (i & 7)) {
            j1.f(q.f24417a.getDescriptor(), i, 7);
            throw null;
        }
        this.f24418a = bigDecimal;
        this.f24419b = bigDecimal2;
        this.f24420c = bigDecimal3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f24418a, sVar.f24418a) && Intrinsics.f(this.f24419b, sVar.f24419b) && Intrinsics.f(this.f24420c, sVar.f24420c);
    }

    public final int hashCode() {
        return this.f24420c.hashCode() + t61.a.d(this.f24419b, this.f24418a.hashCode() * 31, 31);
    }

    public s(BigDecimal totalShareholderReturn, BigDecimal sharpeRatio, BigDecimal volatility) {
        Intrinsics.checkNotNullParameter(totalShareholderReturn, "totalShareholderReturn");
        Intrinsics.checkNotNullParameter(sharpeRatio, "sharpeRatio");
        Intrinsics.checkNotNullParameter(volatility, "volatility");
        this.f24418a = totalShareholderReturn;
        this.f24419b = sharpeRatio;
        this.f24420c = volatility;
    }
}
