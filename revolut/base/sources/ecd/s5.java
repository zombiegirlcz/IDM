package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class s5 {

    @NotNull
    public static final r5 Companion = new r5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f124671c;

    public /* synthetic */ s5(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(q5.f124655a.getDescriptor(), i, 7);
            throw null;
        }
        this.f124669a = str;
        this.f124670b = str2;
        this.f124671c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s5)) {
            return false;
        }
        s5 s5Var = (s5) obj2;
        return Intrinsics.f(this.f124669a, s5Var.f124669a) && Intrinsics.f(this.f124670b, s5Var.f124670b) && Intrinsics.f(this.f124671c, s5Var.f124671c);
    }

    public final int hashCode() {
        String str = this.f124669a;
        return this.f124671c.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f124670b);
    }

    public s5(String str, String accrual, String payout) {
        Intrinsics.checkNotNullParameter(accrual, "accrual");
        Intrinsics.checkNotNullParameter(payout, "payout");
        this.f124669a = str;
        this.f124670b = accrual;
        this.f124671c = payout;
    }
}
