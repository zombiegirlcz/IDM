package ga1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0010R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001b\u0010\u0004¨\u0006\u001d"}, d2 = {"Lga1/r;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "b", "errorCode", "c", "emvTags", "", "d", "Z", "()Z", "signatureRequired", "e", "fetchDebugLogs", "f", "getCardLastFour", "cardLastFour", "g", "getContactless", "contactless", "h", "getApplicationName", "applicationName", "feature_acquiring_card_reader_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("error_code")
    private final String errorCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("tags")
    private final String emvTags;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("signature_required")
    private final boolean signatureRequired;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("fetch_debug_logs")
    private final boolean fetchDebugLogs;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("card_last_four")
    private final String cardLastFour;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("contactless")
    private final boolean contactless;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("application_name")
    private final String applicationName;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEmvTags() {
        return this.emvTags;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getFetchDebugLogs() {
        return this.fetchDebugLogs;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getSignatureRequired() {
        return this.signatureRequired;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.type, rVar.type) && Intrinsics.f(this.errorCode, rVar.errorCode) && Intrinsics.f(this.emvTags, rVar.emvTags) && this.signatureRequired == rVar.signatureRequired && this.fetchDebugLogs == rVar.fetchDebugLogs && Intrinsics.f(this.cardLastFour, rVar.cardLastFour) && this.contactless == rVar.contactless && Intrinsics.f(this.applicationName, rVar.applicationName);
    }

    public final int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.errorCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.emvTags;
        int iC = j6.a.c(j6.a.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.signatureRequired), 31, this.fetchDebugLogs);
        String str3 = this.cardLastFour;
        int iC2 = j6.a.c((iC + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.contactless);
        String str4 = this.applicationName;
        return iC2 + (str4 != null ? str4.hashCode() : 0);
    }
}
