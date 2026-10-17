package as;

import ur.i;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f8734a;

    static {
        int[] iArr = new int[i.values().length];
        try {
            iArr[i.PASSPORT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i.DRIVING_LICENCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[i.RESIDENCE_PERMIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[i.IDENTITY_CARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[i.VISA.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[i.BIRTH_CERTIFICATE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f8734a = iArr;
    }
}
