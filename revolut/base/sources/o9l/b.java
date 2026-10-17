package o9l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0012"}, d2 = {"Lo9l/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "name", "b", "f", "type", "c", "e", "taxId", "bankName", "bankISPB", "bankCode", "feature_shared_recurring_payments_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    private final String name = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    private final String type = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("taxId")
    private final String taxId = null;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("bankName")
    private final String bankName = null;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("bankISPB")
    private final String bankISPB = null;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("bankCode")
    private final String bankCode = null;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBankCode() {
        return this.bankCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBankISPB() {
        return this.bankISPB;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBankName() {
        return this.bankName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTaxId() {
        return this.taxId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.name, bVar.name) && Intrinsics.f(this.type, bVar.type) && Intrinsics.f(this.taxId, bVar.taxId) && Intrinsics.f(this.bankName, bVar.bankName) && Intrinsics.f(this.bankISPB, bVar.bankISPB) && Intrinsics.f(this.bankCode, bVar.bankCode);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.taxId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bankName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.bankISPB;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.bankCode;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }
}
