package toj;

import tgi.c;

/* JADX INFO: loaded from: classes13.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f273229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f273230b;

    static {
        int[] iArr = new int[tgi.b.values().length];
        try {
            iArr[tgi.b.WELCOME_BACK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[tgi.b.HEY_THERE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[tgi.b.NICE_TO_SEE_YOU.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[tgi.b.HI.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f273229a = iArr;
        int[] iArr2 = new int[c.values().length];
        try {
            iArr2[c.GOOD_MORNING.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[c.GOOD_AFTERNOON.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[c.GOOD_EVENING.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        f273230b = iArr2;
    }
}
