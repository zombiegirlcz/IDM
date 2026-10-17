package vrf;

import com.revolut.feature.transfer.models.quotes.TransferQuoteSplitOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f291584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f291585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransferQuoteSplitOption f291586c;
    public final boolean d;

    public d(dj0.d amount, dj0.d dVar, TransferQuoteSplitOption transferQuoteSplitOption, boolean z) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f291584a = amount;
        this.f291585b = dVar;
        this.f291586c = transferQuoteSplitOption;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f291584a, dVar.f291584a) && Intrinsics.f(this.f291585b, dVar.f291585b) && Intrinsics.f(this.f291586c, dVar.f291586c) && this.d == dVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f291584a.hashCode() * 31;
        dj0.d dVar = this.f291585b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        TransferQuoteSplitOption transferQuoteSplitOption = this.f291586c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (transferQuoteSplitOption != null ? transferQuoteSplitOption.hashCode() : 0)) * 31);
    }
}
