package zrf;

import com.revolut.feature.transfer.models.quotes.TransferQuoteSplit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f324732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferQuoteSplit f324733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f324734c;

    public i(int i, TransferQuoteSplit quoteSplit, dj0.d fromAmountAfterCharges) {
        Intrinsics.checkNotNullParameter(quoteSplit, "quoteSplit");
        Intrinsics.checkNotNullParameter(fromAmountAfterCharges, "fromAmountAfterCharges");
        this.f324732a = i;
        this.f324733b = quoteSplit;
        this.f324734c = fromAmountAfterCharges;
    }

    public static i a(i iVar, int i) {
        TransferQuoteSplit quoteSplit = iVar.f324733b;
        dj0.d fromAmountAfterCharges = iVar.f324734c;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(quoteSplit, "quoteSplit");
        Intrinsics.checkNotNullParameter(fromAmountAfterCharges, "fromAmountAfterCharges");
        return new i(i, quoteSplit, fromAmountAfterCharges);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f324732a == iVar.f324732a && Intrinsics.f(this.f324733b, iVar.f324733b) && Intrinsics.f(this.f324734c, iVar.f324734c);
    }

    public final int hashCode() {
        return this.f324734c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f324733b.f92287a, Integer.hashCode(this.f324732a) * 31, 31);
    }
}
