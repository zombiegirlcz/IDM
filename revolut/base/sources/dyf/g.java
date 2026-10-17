package dyf;

import com.revolut.domain.models.user.UserCompanyRegion;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f121103a;

    static {
        int[] iArr = new int[UserCompanyRegion.values().length];
        try {
            iArr[UserCompanyRegion.EEA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UserCompanyRegion.GB.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UserCompanyRegion.LT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[UserCompanyRegion.ES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[UserCompanyRegion.FR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[UserCompanyRegion.NL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[UserCompanyRegion.PT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[UserCompanyRegion.BE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[UserCompanyRegion.DE.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[UserCompanyRegion.IE.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        f121103a = iArr;
    }
}
