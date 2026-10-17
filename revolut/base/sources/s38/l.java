package s38;

import n38.s;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f259470a;

    static {
        int[] iArr = new int[s.values().length];
        try {
            iArr[s.ELIGIBLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s.MIGRATION_REQUIRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[s.ACCOUNTS_LIMIT_REACHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[s.INELIGIBLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[s.COMPANIES_NOT_MATCH.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[s.INVITEE_INELIGIBLE_COUNTRY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[s.INVITEE_MIGRATION_REQUIRED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f259470a = iArr;
    }
}
