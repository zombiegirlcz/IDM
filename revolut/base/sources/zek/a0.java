package zek;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004¨\u0006\u0014"}, d2 = {"Lzek/a0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "code", "", "Z", "d", "()Z", "isBeneficial", "Ljo3/b;", "c", "Ljo3/b;", "()Ljo3/b;", "amountSaved", "percentageSaved", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("code")
    private final String code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("isBeneficial")
    private final boolean isBeneficial;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("amountSaved")
    private final jo3.b amountSaved;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("percentageSaved")
    private final String percentageSaved;

    public a0(String str, String str2, jo3.b bVar, boolean z) {
        this.code = str;
        this.isBeneficial = z;
        this.amountSaved = bVar;
        this.percentageSaved = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.b getAmountSaved() {
        return this.amountSaved;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPercentageSaved() {
        return this.percentageSaved;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsBeneficial() {
        return this.isBeneficial;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.code, a0Var.code) && this.isBeneficial == a0Var.isBeneficial && Intrinsics.f(this.amountSaved, a0Var.amountSaved) && Intrinsics.f(this.percentageSaved, a0Var.percentageSaved);
    }

    public final int hashCode() {
        String str = this.code;
        int iC = j6.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.isBeneficial);
        jo3.b bVar = this.amountSaved;
        int iHashCode = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str2 = this.percentageSaved;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
