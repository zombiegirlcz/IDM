package gr1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import xo1.k;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004¨\u0006!"}, d2 = {"Lgr1/a;", "Lxo1/k;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getVoucherNumber", "voucherNumber", "b", "getDueDate", "dueDate", "c", "getCheckNote", "checkNote", "", "d", "Ljava/lang/Long;", "getDecodeId", "()Ljava/lang/Long;", "decodeId", "e", "getRawQrCode", "rawQrCode", "", "f", "Ljava/lang/Boolean;", "getForceCreate", "()Ljava/lang/Boolean;", "forceCreate", "g", "getIssuerName", "issuerName", "feature_apm_bills_postal_check_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("voucherNumber")
    private final String voucherNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("dueDate")
    private final String dueDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("checkNote")
    private final String checkNote;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("decodeId")
    private final Long decodeId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("rawQrCode")
    private final String rawQrCode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("forceCreate")
    private final Boolean forceCreate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("issuerName")
    private final String issuerName;

    public a(String str, String str2, String str3, Long l2, String str4, Boolean bool, String str5) {
        this.voucherNumber = str;
        this.dueDate = str2;
        this.checkNote = str3;
        this.decodeId = l2;
        this.rawQrCode = str4;
        this.forceCreate = bool;
        this.issuerName = str5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.voucherNumber, aVar.voucherNumber) && Intrinsics.f(this.dueDate, aVar.dueDate) && Intrinsics.f(this.checkNote, aVar.checkNote) && Intrinsics.f(this.decodeId, aVar.decodeId) && Intrinsics.f(this.rawQrCode, aVar.rawQrCode) && Intrinsics.f(this.forceCreate, aVar.forceCreate) && Intrinsics.f(this.issuerName, aVar.issuerName);
    }

    public final int hashCode() {
        String str = this.voucherNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dueDate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.checkNote;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.decodeId;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str4 = this.rawQrCode;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.forceCreate;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.issuerName;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }
}
