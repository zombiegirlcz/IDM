package t7h;

import ip0.v7;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f268695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f268696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo3.a f268697c;
    public final String d;

    public /* synthetic */ c(int i, BigDecimal bigDecimal, jo3.a aVar, jo3.a aVar2, String str) {
        if (15 != (i & 15)) {
            j1.f(a.f268694a.getDescriptor(), i, 15);
            throw null;
        }
        this.f268695a = bigDecimal;
        this.f268696b = aVar;
        this.f268697c = aVar2;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f268695a, cVar.f268695a) && Intrinsics.f(this.f268696b, cVar.f268696b) && Intrinsics.f(this.f268697c, cVar.f268697c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iJ = v7.j(this.f268697c, v7.j(this.f268696b, this.f268695a.hashCode() * 31, 31), 31);
        String str = this.d;
        return iJ + (str == null ? 0 : str.hashCode());
    }

    public c(BigDecimal yearlyInterestRate, jo3.a overnightFee, jo3.a monthlyAccruedFees, String str) {
        Intrinsics.checkNotNullParameter(yearlyInterestRate, "yearlyInterestRate");
        Intrinsics.checkNotNullParameter(overnightFee, "overnightFee");
        Intrinsics.checkNotNullParameter(monthlyAccruedFees, "monthlyAccruedFees");
        this.f268695a = yearlyInterestRate;
        this.f268696b = overnightFee;
        this.f268697c = monthlyAccruedFees;
        this.d = str;
    }
}
