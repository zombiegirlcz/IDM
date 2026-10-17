package e7c;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0005\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004¨\u0006!"}, d2 = {"Le7c/w;", "Le7c/z;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "id", "b", "bin", "c", "h", "lastFour", "", "d", "I", "()I", "expiryMonth", "e", "expiryYear", "brand", "Le7c/d;", "g", "Le7c/d;", "()Le7c/d;", "billingAddress", "", "Z", "i", "()Z", "requiresCvvForPayment", "label", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class w implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("bin")
    @NotNull
    private final String bin;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastFour")
    @NotNull
    private final String lastFour;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("expiryMonth")
    private final int expiryMonth;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("expiryYear")
    private final int expiryYear;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("brand")
    private final String brand;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("billingAddress")
    private final d billingAddress;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("requiresCvvForPayment")
    private final boolean requiresCvvForPayment;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("label")
    private final String label;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final d getBillingAddress() {
        return this.billingAddress;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBin() {
        return this.bin;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getExpiryMonth() {
        return this.expiryMonth;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getExpiryYear() {
        return this.expiryYear;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.id, wVar.id) && Intrinsics.f(this.bin, wVar.bin) && Intrinsics.f(this.lastFour, wVar.lastFour) && this.expiryMonth == wVar.expiryMonth && this.expiryYear == wVar.expiryYear && Intrinsics.f(this.brand, wVar.brand) && Intrinsics.f(this.billingAddress, wVar.billingAddress) && this.requiresCvvForPayment == wVar.requiresCvvForPayment && Intrinsics.f(this.label, wVar.label);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getLastFour() {
        return this.lastFour;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.expiryYear, j6.a.b(this.expiryMonth, p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.bin), 31, this.lastFour), 31), 31);
        String str = this.brand;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        d dVar = this.billingAddress;
        int iC = j6.a.c((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.requiresCvvForPayment);
        String str2 = this.label;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getRequiresCvvForPayment() {
        return this.requiresCvvForPayment;
    }
}
