package e72;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0016"}, d2 = {"Le72/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "ids", "b", "f", "pin", "c", "e", "participantCode", "applicationCode", "bankHash", "codAct", "g", "revolutCardId", "h", "serviceCardNumber", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("serviceIdentifier")
    @NotNull
    private final String ids;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("pin")
    @NotNull
    private final String pin;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("participantCode")
    @NotNull
    private final String participantCode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("applicationCode")
    @NotNull
    private final String applicationCode;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("bankHash")
    @NotNull
    private final String bankHash;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("codAct")
    private final String codAct;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("revolutCardId")
    private final String revolutCardId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("serviceCardNumber")
    private final String serviceCardNumber;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getApplicationCode() {
        return this.applicationCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBankHash() {
        return this.bankHash;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCodAct() {
        return this.codAct;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getIds() {
        return this.ids;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getParticipantCode() {
        return this.participantCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.ids, fVar.ids) && Intrinsics.f(this.pin, fVar.pin) && Intrinsics.f(this.participantCode, fVar.participantCode) && Intrinsics.f(this.applicationCode, fVar.applicationCode) && Intrinsics.f(this.bankHash, fVar.bankHash) && Intrinsics.f(this.codAct, fVar.codAct) && Intrinsics.f(this.revolutCardId, fVar.revolutCardId) && Intrinsics.f(this.serviceCardNumber, fVar.serviceCardNumber);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPin() {
        return this.pin;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getRevolutCardId() {
        return this.revolutCardId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getServiceCardNumber() {
        return this.serviceCardNumber;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(this.ids.hashCode() * 31, 31, this.pin), 31, this.participantCode), 31, this.applicationCode), 31, this.bankHash);
        String str = this.codAct;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.revolutCardId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.serviceCardNumber;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
