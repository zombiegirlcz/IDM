package btb;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f18525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f18526c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[sil.d.values().length];
        try {
            iArr[sil.d.ONBOARDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[sil.d.EDIT_BENEFICIARIES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f18524a = iArr;
        int[] iArr2 = new int[com.revolut.shared.feature.workflow.engine.api.workflow.a.values().length];
        try {
            iArr2[com.revolut.shared.feature.workflow.engine.api.workflow.a.OTP.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[com.revolut.shared.feature.workflow.engine.api.workflow.a.PASSCODE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f18525b = iArr2;
        int[] iArr3 = new int[ril.j.values().length];
        try {
            iArr3[ril.j.FRANCE_BANK_MIGRATION_AGREEMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[ril.j.FRANCE_BANK_AGREEMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[ril.j.GERMANY_BANK_AGREEMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[ril.j.GERMANY_BANK_MIGRATION_AGREEMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[ril.j.MEXICO_BANK_AGREEMENT.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[ril.j.ITALY_BANK_AGREEMENT.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[ril.j.ITALY_BANK_MIGRATION_AGREEMENT.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        f18526c = iArr3;
        int[] iArr4 = new int[sil.a.values().length];
        try {
            iArr4[sil.a.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[sil.a.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[sil.a.HIDDEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        d = iArr4;
    }
}
