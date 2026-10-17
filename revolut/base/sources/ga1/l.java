package ga1;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0017\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u000f\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u001a\u0010\u001e\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R\u001a\u0010 \u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b\u0005\u0010\u0016R\u001a\u0010\"\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b!\u0010\u0016R\u001a\u0010#\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u001d\u0010\u0004R\u001a\u0010(\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010)\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010.\u001a\u00020*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u001a\u0010/\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004¨\u00060"}, d2 = {"Lga1/l;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "l", "terminalId", "", "b", "Ljava/util/List;", "k", "()Ljava/util/List;", "plainEmvTags", "c", "f", "encryptedEmvTags", "", "d", "Z", "e", "()Z", "dekUpdate", "j", "pekUpdate", "contactParamsUpdate", "g", "contactlessParamsUpdate", "h", "firmwareUpdate", "i", "bluetoothFirmwareUpdate", "m", "terminalParamsUpdate", "locale", "", "I", "o", "()I", "updateBinaryBlocksCount", "captureMode", "Lmf0/a;", "n", "Lmf0/a;", "()Lmf0/a;", "transactionLimit", "logLevel", "feature_acquiring_card_reader_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("terminal_id")
    @NotNull
    private final String terminalId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("plain_emv_tags")
    @NotNull
    private final List<String> plainEmvTags;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("encrypted_emv_tags")
    @NotNull
    private final List<String> encryptedEmvTags;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("dek_update")
    private final boolean dekUpdate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("pek_update")
    private final boolean pekUpdate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("contact_params_update")
    private final boolean contactParamsUpdate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("contactless_params_update")
    private final boolean contactlessParamsUpdate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("firmware_update")
    private final boolean firmwareUpdate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("bluetooth_firmware_update")
    private final boolean bluetoothFirmwareUpdate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("terminal_params_update")
    private final boolean terminalParamsUpdate;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("locale")
    @NotNull
    private final String locale;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("update_binary_blocks_count_estimate")
    private final int updateBinaryBlocksCount;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("capture_mode")
    @NotNull
    private final String captureMode;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("transaction_limit")
    @NotNull
    private final mf0.a transactionLimit;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("log_level")
    @NotNull
    private final String logLevel;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getBluetoothFirmwareUpdate() {
        return this.bluetoothFirmwareUpdate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCaptureMode() {
        return this.captureMode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getContactParamsUpdate() {
        return this.contactParamsUpdate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getContactlessParamsUpdate() {
        return this.contactlessParamsUpdate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getDekUpdate() {
        return this.dekUpdate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.terminalId, lVar.terminalId) && Intrinsics.f(this.plainEmvTags, lVar.plainEmvTags) && Intrinsics.f(this.encryptedEmvTags, lVar.encryptedEmvTags) && this.dekUpdate == lVar.dekUpdate && this.pekUpdate == lVar.pekUpdate && this.contactParamsUpdate == lVar.contactParamsUpdate && this.contactlessParamsUpdate == lVar.contactlessParamsUpdate && this.firmwareUpdate == lVar.firmwareUpdate && this.bluetoothFirmwareUpdate == lVar.bluetoothFirmwareUpdate && this.terminalParamsUpdate == lVar.terminalParamsUpdate && Intrinsics.f(this.locale, lVar.locale) && this.updateBinaryBlocksCount == lVar.updateBinaryBlocksCount && Intrinsics.f(this.captureMode, lVar.captureMode) && Intrinsics.f(this.transactionLimit, lVar.transactionLimit) && Intrinsics.f(this.logLevel, lVar.logLevel);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getEncryptedEmvTags() {
        return this.encryptedEmvTags;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getFirmwareUpdate() {
        return this.firmwareUpdate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    public final int hashCode() {
        return this.logLevel.hashCode() + ((this.transactionLimit.hashCode() + p.a.c(j6.a.b(this.updateBinaryBlocksCount, p.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(p.a.d(p.a.d(this.terminalId.hashCode() * 31, 31, this.plainEmvTags), 31, this.encryptedEmvTags), 31, this.dekUpdate), 31, this.pekUpdate), 31, this.contactParamsUpdate), 31, this.contactlessParamsUpdate), 31, this.firmwareUpdate), 31, this.bluetoothFirmwareUpdate), 31, this.terminalParamsUpdate), 31, this.locale), 31), 31, this.captureMode)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getLogLevel() {
        return this.logLevel;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getPekUpdate() {
        return this.pekUpdate;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final List getPlainEmvTags() {
        return this.plainEmvTags;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getTerminalId() {
        return this.terminalId;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getTerminalParamsUpdate() {
        return this.terminalParamsUpdate;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final mf0.a getTransactionLimit() {
        return this.transactionLimit;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getUpdateBinaryBlocksCount() {
        return this.updateBinaryBlocksCount;
    }
}
