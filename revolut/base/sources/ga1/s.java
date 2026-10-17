package ga1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001b"}, d2 = {"Lga1/s;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getContactParamsHash", "contactParamsHash", "b", "getContactlessParamsHash", "contactlessParamsHash", "c", "getFirmwareHash", "firmwareHash", "d", "getBluetoothFirmwareHash", "bluetoothFirmwareHash", "e", "getPekHash", "pekHash", "f", "getDekHash", "dekHash", "g", "getTerminalParamsHash", "terminalParamsHash", "feature_acquiring_card_reader_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("contactParamsHash")
    private final String contactParamsHash;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("contactlessParamsHash")
    private final String contactlessParamsHash;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("firmwareHash")
    private final String firmwareHash;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("bluetoothFirmwareHash")
    private final String bluetoothFirmwareHash;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("pekHash")
    private final String pekHash;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("dekHash")
    private final String dekHash;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("terminalParamsHash")
    private final String terminalParamsHash;

    public s() {
        this(null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.contactParamsHash, sVar.contactParamsHash) && Intrinsics.f(this.contactlessParamsHash, sVar.contactlessParamsHash) && Intrinsics.f(this.firmwareHash, sVar.firmwareHash) && Intrinsics.f(this.bluetoothFirmwareHash, sVar.bluetoothFirmwareHash) && Intrinsics.f(this.pekHash, sVar.pekHash) && Intrinsics.f(this.dekHash, sVar.dekHash) && Intrinsics.f(this.terminalParamsHash, sVar.terminalParamsHash);
    }

    public final int hashCode() {
        String str = this.contactParamsHash;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.contactlessParamsHash;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.firmwareHash;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bluetoothFirmwareHash;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.pekHash;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.dekHash;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.terminalParamsHash;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public s(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.contactParamsHash = str;
        this.contactlessParamsHash = str2;
        this.firmwareHash = str3;
        this.bluetoothFirmwareHash = str4;
        this.pekHash = str5;
        this.dekHash = str6;
        this.terminalParamsHash = str7;
    }
}
