package ss4;

import com.revolut.data.model.Data;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f265278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f265279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f265280c;
    public final Data d;
    public final j e;

    public i(dj0.d repaymentAmount, dj0.d mainPocketBalance, k repaymentLimits, Data quote, j jVar) {
        Intrinsics.checkNotNullParameter(repaymentAmount, "repaymentAmount");
        Intrinsics.checkNotNullParameter(mainPocketBalance, "mainPocketBalance");
        Intrinsics.checkNotNullParameter(repaymentLimits, "repaymentLimits");
        Intrinsics.checkNotNullParameter(quote, "quote");
        this.f265278a = repaymentAmount;
        this.f265279b = mainPocketBalance;
        this.f265280c = repaymentLimits;
        this.d = quote;
        this.e = jVar;
    }

    public static i a(i iVar, dj0.d dVar, Data data, j jVar, int i) {
        if ((i & 1) != 0) {
            dVar = iVar.f265278a;
        }
        dj0.d repaymentAmount = dVar;
        dj0.d mainPocketBalance = iVar.f265279b;
        k repaymentLimits = iVar.f265280c;
        if ((i & 8) != 0) {
            data = iVar.d;
        }
        Data quote = data;
        if ((i & 16) != 0) {
            jVar = iVar.e;
        }
        Intrinsics.checkNotNullParameter(repaymentAmount, "repaymentAmount");
        Intrinsics.checkNotNullParameter(mainPocketBalance, "mainPocketBalance");
        Intrinsics.checkNotNullParameter(repaymentLimits, "repaymentLimits");
        Intrinsics.checkNotNullParameter(quote, "quote");
        return new i(repaymentAmount, mainPocketBalance, repaymentLimits, quote, jVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f265278a, iVar.f265278a) && Intrinsics.f(this.f265279b, iVar.f265279b) && Intrinsics.f(this.f265280c, iVar.f265280c) && Intrinsics.f(this.d, iVar.d) && this.e == iVar.e;
    }

    public final int hashCode() {
        int iC = kii.e.c(this.d, (this.f265280c.hashCode() + v7.c(this.f265278a.hashCode() * 31, 31, this.f265279b)) * 31, 31);
        j jVar = this.e;
        return iC + (jVar == null ? 0 : jVar.hashCode());
    }
}
