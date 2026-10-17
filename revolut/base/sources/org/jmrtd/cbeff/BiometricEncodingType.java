package org.jmrtd.cbeff;

/* JADX INFO: loaded from: classes14.dex */
public enum BiometricEncodingType {
    UNKNOWN,
    ISO_19794,
    ISO_39794;

    /* JADX INFO: renamed from: org.jmrtd.cbeff.BiometricEncodingType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$jmrtd$cbeff$BiometricEncodingType;

        static {
            int[] iArr = new int[BiometricEncodingType.values().length];
            $SwitchMap$org$jmrtd$cbeff$BiometricEncodingType = iArr;
            try {
                iArr[BiometricEncodingType.ISO_39794.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$jmrtd$cbeff$BiometricEncodingType[BiometricEncodingType.ISO_19794.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static BiometricEncodingType fromBDBTag(int i) {
        return i != 24366 ? i != 32558 ? UNKNOWN : ISO_39794 : ISO_19794;
    }

    public static int toBDBTag(BiometricEncodingType biometricEncodingType) {
        return AnonymousClass1.$SwitchMap$org$jmrtd$cbeff$BiometricEncodingType[biometricEncodingType.ordinal()] != 1 ? ISO781611.BIOMETRIC_DATA_BLOCK_TAG : ISO781611.BIOMETRIC_DATA_BLOCK_CONSTRUCTED_TAG;
    }
}
