package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum ea implements com.google.protobuf.a1 {
    transaction_unspecified(0),
    cit(1),
    mit(2),
    mit_zero_amount_auth(3),
    mit_non_zero_amount_auth(4),
    spm_consent(5),
    spm_challenge(6),
    UNRECOGNIZED(-1);

    public static final int cit_VALUE = 1;
    private static final com.google.protobuf.b1 internalValueMap = new da();
    public static final int mit_VALUE = 2;
    public static final int mit_non_zero_amount_auth_VALUE = 4;
    public static final int mit_zero_amount_auth_VALUE = 3;
    public static final int spm_challenge_VALUE = 6;
    public static final int spm_consent_VALUE = 5;
    public static final int transaction_unspecified_VALUE = 0;
    private final int value;

    ea(int i) {
        this.value = i;
    }

    public static ea a(int i) {
        switch (i) {
            case 0:
                return transaction_unspecified;
            case 1:
                return cit;
            case 2:
                return mit;
            case 3:
                return mit_zero_amount_auth;
            case 4:
                return mit_non_zero_amount_auth;
            case 5:
                return spm_consent;
            case 6:
                return spm_challenge;
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
