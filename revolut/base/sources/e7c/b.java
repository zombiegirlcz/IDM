package e7c;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Le7c/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "b", "getNumber", "number", "", "c", "I", "getExpiryMonth", "()I", "expiryMonth", "d", "getExpiryYear", "expiryYear", "e", "getCardholderName", "cardholderName", "Le7c/d;", "f", "Le7c/d;", "getBillingAddress", "()Le7c/d;", "billingAddress", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("number")
    @NotNull
    private final String number;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("expiryMonth")
    private final int expiryMonth;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("expiryYear")
    private final int expiryYear;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("cardholderName")
    private final String cardholderName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("billingAddress")
    private final d billingAddress;

    public b(String number, int i, int i2, String str, d dVar) {
        Intrinsics.checkNotNullParameter("CARD", "type");
        Intrinsics.checkNotNullParameter(number, "number");
        this.type = "CARD";
        this.number = number;
        this.expiryMonth = i;
        this.expiryYear = i2;
        this.cardholderName = str;
        this.billingAddress = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.type, bVar.type) && Intrinsics.f(this.number, bVar.number) && this.expiryMonth == bVar.expiryMonth && this.expiryYear == bVar.expiryYear && Intrinsics.f(this.cardholderName, bVar.cardholderName) && Intrinsics.f(this.billingAddress, bVar.billingAddress);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.expiryYear, j6.a.b(this.expiryMonth, p.a.c(this.type.hashCode() * 31, 31, this.number), 31), 31);
        String str = this.cardholderName;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        d dVar = this.billingAddress;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }
}
