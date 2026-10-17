package ga1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001a\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001a\u0010&\u001a\u00020!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010,\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010/\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010+¨\u00060"}, d2 = {"Lga1/q;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "b", "getTerminalId", "terminalId", "c", "getDataKeySerialNumber", "dataKeySerialNumber", "d", "getPinKeySerialNumber", "pinKeySerialNumber", "e", "getEncryptedPinBlock", "encryptedPinBlock", "f", "getPlainEmvTags", "plainEmvTags", "g", "getEncryptedEmvTags", "encryptedEmvTags", "h", "getTerminalType", "terminalType", "i", "getCardReaderInterface", "cardReaderInterface", "Lga1/a;", "j", "Lga1/a;", "getFirmwareVersions", "()Lga1/a;", "firmwareVersions", "", "k", "Z", "getOnlinePinChallengeReply", "()Z", "onlinePinChallengeReply", "l", "getUseExplicitScaState", "useExplicitScaState", "feature_acquiring_card_reader_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("terminal_id")
    @NotNull
    private final String terminalId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("ksn")
    @NotNull
    private final String dataKeySerialNumber;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("pin_ksn")
    private final String pinKeySerialNumber;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("encrypted_pin_block")
    private final String encryptedPinBlock;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("plain_tags")
    @NotNull
    private final String plainEmvTags;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("encrypted_tags")
    @NotNull
    private final String encryptedEmvTags;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("terminal_type")
    @NotNull
    private final String terminalType;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("interface")
    @NotNull
    private final String cardReaderInterface;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("terminal_firmware")
    @NotNull
    private final a firmwareVersions;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("online_pin_challenge_reply")
    private final boolean onlinePinChallengeReply;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("use_explicit_sca_state")
    private final boolean useExplicitScaState;

    public q(String terminalId, String dataKeySerialNumber, String str, String str2, String plainEmvTags, String encryptedEmvTags, String cardReaderInterface, a firmwareVersions, boolean z) {
        Intrinsics.checkNotNullParameter("terminal", "type");
        Intrinsics.checkNotNullParameter(terminalId, "terminalId");
        Intrinsics.checkNotNullParameter(dataKeySerialNumber, "dataKeySerialNumber");
        Intrinsics.checkNotNullParameter(plainEmvTags, "plainEmvTags");
        Intrinsics.checkNotNullParameter(encryptedEmvTags, "encryptedEmvTags");
        Intrinsics.checkNotNullParameter("YOUTRANSACTOR_UCUBE_TOUCH", "terminalType");
        Intrinsics.checkNotNullParameter(cardReaderInterface, "cardReaderInterface");
        Intrinsics.checkNotNullParameter(firmwareVersions, "firmwareVersions");
        this.type = "terminal";
        this.terminalId = terminalId;
        this.dataKeySerialNumber = dataKeySerialNumber;
        this.pinKeySerialNumber = str;
        this.encryptedPinBlock = str2;
        this.plainEmvTags = plainEmvTags;
        this.encryptedEmvTags = encryptedEmvTags;
        this.terminalType = "YOUTRANSACTOR_UCUBE_TOUCH";
        this.cardReaderInterface = cardReaderInterface;
        this.firmwareVersions = firmwareVersions;
        this.onlinePinChallengeReply = z;
        this.useExplicitScaState = true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.type, qVar.type) && Intrinsics.f(this.terminalId, qVar.terminalId) && Intrinsics.f(this.dataKeySerialNumber, qVar.dataKeySerialNumber) && Intrinsics.f(this.pinKeySerialNumber, qVar.pinKeySerialNumber) && Intrinsics.f(this.encryptedPinBlock, qVar.encryptedPinBlock) && Intrinsics.f(this.plainEmvTags, qVar.plainEmvTags) && Intrinsics.f(this.encryptedEmvTags, qVar.encryptedEmvTags) && Intrinsics.f(this.terminalType, qVar.terminalType) && Intrinsics.f(this.cardReaderInterface, qVar.cardReaderInterface) && Intrinsics.f(this.firmwareVersions, qVar.firmwareVersions) && this.onlinePinChallengeReply == qVar.onlinePinChallengeReply && this.useExplicitScaState == qVar.useExplicitScaState;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.type.hashCode() * 31, 31, this.terminalId), 31, this.dataKeySerialNumber);
        String str = this.pinKeySerialNumber;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.encryptedPinBlock;
        return Boolean.hashCode(this.useExplicitScaState) + j6.a.c((this.firmwareVersions.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.plainEmvTags), 31, this.encryptedEmvTags), 31, this.terminalType), 31, this.cardReaderInterface)) * 31, 31, this.onlinePinChallengeReply);
    }
}
