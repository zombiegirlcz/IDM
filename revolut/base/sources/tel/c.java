package tel;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f270120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f270121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f270122c;
    public final BigDecimal d;
    public final BigDecimal e;

    public c(BigDecimal minus2Std, BigDecimal minus1Std, BigDecimal mean, BigDecimal plus1Std, BigDecimal plus2Std) {
        Intrinsics.checkNotNullParameter(minus2Std, "minus2Std");
        Intrinsics.checkNotNullParameter(minus1Std, "minus1Std");
        Intrinsics.checkNotNullParameter(mean, "mean");
        Intrinsics.checkNotNullParameter(plus1Std, "plus1Std");
        Intrinsics.checkNotNullParameter(plus2Std, "plus2Std");
        this.f270120a = minus2Std;
        this.f270121b = minus1Std;
        this.f270122c = mean;
        this.d = plus1Std;
        this.e = plus2Std;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f270120a, cVar.f270120a) && Intrinsics.f(this.f270121b, cVar.f270121b) && Intrinsics.f(this.f270122c, cVar.f270122c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + t61.a.d(this.d, t61.a.d(this.f270122c, t61.a.d(this.f270121b, this.f270120a.hashCode() * 31, 31), 31), 31);
    }
}
