package grl;

/* JADX INFO: loaded from: classes13.dex */
public enum wb implements com.google.protobuf.a1 {
    RootDetection(0),
    IntegrityCheck(1),
    CaptchaCheck(2),
    ManualInstall(3),
    CustomFirmware(4),
    ActivePhoneCall(5),
    InactivityLock(6),
    CustomOS(7),
    CustomKeys(8),
    UnlockedBootloader(9),
    DeveloperMode(10),
    KaTampered(11),
    KaInvalidCertChain(12),
    KaUntrustedRootKey(13),
    KaRevokedCert(14),
    UNRECOGNIZED(-1);

    public static final int ActivePhoneCall_VALUE = 5;
    public static final int CaptchaCheck_VALUE = 2;
    public static final int CustomFirmware_VALUE = 4;
    public static final int CustomKeys_VALUE = 8;
    public static final int CustomOS_VALUE = 7;
    public static final int DeveloperMode_VALUE = 10;
    public static final int InactivityLock_VALUE = 6;
    public static final int IntegrityCheck_VALUE = 1;
    public static final int KaInvalidCertChain_VALUE = 12;
    public static final int KaRevokedCert_VALUE = 14;
    public static final int KaTampered_VALUE = 11;
    public static final int KaUntrustedRootKey_VALUE = 13;
    public static final int ManualInstall_VALUE = 3;
    public static final int RootDetection_VALUE = 0;
    public static final int UnlockedBootloader_VALUE = 9;
    private static final com.google.protobuf.b1 internalValueMap = new vb();
    private final int value;

    wb(int i) {
        this.value = i;
    }

    public static wb a(int i) {
        switch (i) {
            case 0:
                return RootDetection;
            case 1:
                return IntegrityCheck;
            case 2:
                return CaptchaCheck;
            case 3:
                return ManualInstall;
            case 4:
                return CustomFirmware;
            case 5:
                return ActivePhoneCall;
            case 6:
                return InactivityLock;
            case 7:
                return CustomOS;
            case 8:
                return CustomKeys;
            case 9:
                return UnlockedBootloader;
            case 10:
                return DeveloperMode;
            case 11:
                return KaTampered;
            case 12:
                return KaInvalidCertChain;
            case 13:
                return KaUntrustedRootKey;
            case 14:
                return KaRevokedCert;
            default:
                return null;
        }
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
