package o6g;

import m7g.j;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f222597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f222598b;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.ADULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.CHILD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j.INFANT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[j.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f222597a = iArr;
        int[] iArr2 = new int[p7g.b.values().length];
        try {
            iArr2[p7g.b.FIRST_NAME.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[p7g.b.LAST_NAME.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[p7g.b.GENDER.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[p7g.b.DATE_OF_BIRTH.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[p7g.b.PASSPORT_NUMBER.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[p7g.b.PASSPORT_ISSUING_COUNTRY.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[p7g.b.PASSPORT_ISSUING_DATE.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[p7g.b.PASSPORT_EXPIRY_DATE.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[p7g.b.PASSPORT_ISSUING_CITY.ordinal()] = 9;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[p7g.b.EMAIL.ordinal()] = 10;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[p7g.b.PHONE_NUMBER.ordinal()] = 11;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[p7g.b.EMERGENCY_CONTACT_LAST_NAME.ordinal()] = 12;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[p7g.b.EMERGENCY_CONTACT_PHONE_NUMBER.ordinal()] = 13;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[p7g.b.UNKNOWN.ordinal()] = 14;
        } catch (NoSuchFieldError unused18) {
        }
        f222598b = iArr2;
    }
}
