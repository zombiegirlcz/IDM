package qx7;

import zw7.z;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f250029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f250030b;

    static {
        int[] iArr = new int[z.values().length];
        try {
            iArr[z.MALE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[z.FEMALE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[z.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f250029a = iArr;
        int[] iArr2 = new int[tz7.b.values().length];
        try {
            iArr2[tz7.b.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[tz7.b.FUTURE_DATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[tz7.b.INVALID_FORMAT.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[tz7.b.MAX_PAST_DATE.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        f250030b = iArr2;
    }
}
