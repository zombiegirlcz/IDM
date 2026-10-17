package tr3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0010\u0010\tR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u000e\u0010\u0015¨\u0006\u0017"}, d2 = {"Ltr3/a;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/b;", "a", "Ljo3/b;", "d", "()Ljo3/b;", "loanMaxAmount", "b", "e", "loanMinAmount", "c", "creditLimit", "f", "unknownBankMaxLimit", "creditCardUnknownBankMaxLimit", "Ltr3/e;", "Ltr3/e;", "()Ltr3/e;", "entryPoints", "feature_credit_application_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("loanMaxAmount")
    @NotNull
    private final jo3.b loanMaxAmount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("loanMinAmount")
    @NotNull
    private final jo3.b loanMinAmount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("creditLimit")
    @NotNull
    private final jo3.b creditLimit;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("unknownBankMaxLimit")
    private final jo3.b unknownBankMaxLimit;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("creditCardUnknownBankMaxLimit")
    private final jo3.b creditCardUnknownBankMaxLimit;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("entryPoints")
    private final e entryPoints;

    public a(jo3.b loanMaxAmount, jo3.b loanMinAmount, jo3.b creditLimit, jo3.b bVar, jo3.b bVar2, e eVar) {
        Intrinsics.checkNotNullParameter(loanMaxAmount, "loanMaxAmount");
        Intrinsics.checkNotNullParameter(loanMinAmount, "loanMinAmount");
        Intrinsics.checkNotNullParameter(creditLimit, "creditLimit");
        this.loanMaxAmount = loanMaxAmount;
        this.loanMinAmount = loanMinAmount;
        this.creditLimit = creditLimit;
        this.unknownBankMaxLimit = bVar;
        this.creditCardUnknownBankMaxLimit = bVar2;
        this.entryPoints = eVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.b getCreditCardUnknownBankMaxLimit() {
        return this.creditCardUnknownBankMaxLimit;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.b getCreditLimit() {
        return this.creditLimit;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e getEntryPoints() {
        return this.entryPoints;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.b getLoanMaxAmount() {
        return this.loanMaxAmount;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.b getLoanMinAmount() {
        return this.loanMinAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.loanMaxAmount, aVar.loanMaxAmount) && Intrinsics.f(this.loanMinAmount, aVar.loanMinAmount) && Intrinsics.f(this.creditLimit, aVar.creditLimit) && Intrinsics.f(this.unknownBankMaxLimit, aVar.unknownBankMaxLimit) && Intrinsics.f(this.creditCardUnknownBankMaxLimit, aVar.creditCardUnknownBankMaxLimit) && Intrinsics.f(this.entryPoints, aVar.entryPoints);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final jo3.b getUnknownBankMaxLimit() {
        return this.unknownBankMaxLimit;
    }

    public final int hashCode() {
        int iE = y.e(this.creditLimit, y.e(this.loanMinAmount, this.loanMaxAmount.hashCode() * 31, 31), 31);
        jo3.b bVar = this.unknownBankMaxLimit;
        int iHashCode = (iE + (bVar == null ? 0 : bVar.hashCode())) * 31;
        jo3.b bVar2 = this.creditCardUnknownBankMaxLimit;
        int iHashCode2 = (iHashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        e eVar = this.entryPoints;
        return iHashCode2 + (eVar != null ? eVar.hashCode() : 0);
    }
}
