package rnl;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f255726a;

    static {
        int[] iArr = new int[com.revolut.sso.api.models.c.values().length];
        try {
            iArr[com.revolut.sso.api.models.c.ADDRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.revolut.sso.api.models.c.BIRTH_DATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[com.revolut.sso.api.models.c.EMAIL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[com.revolut.sso.api.models.c.NAME.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[com.revolut.sso.api.models.c.PHONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[com.revolut.sso.api.models.c.CITIZENSHIP.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[com.revolut.sso.api.models.c.UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f255726a = iArr;
    }
}
