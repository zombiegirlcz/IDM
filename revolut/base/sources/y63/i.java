package y63;

import h93.z;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f311134a;

    static {
        int[] iArr = new int[z.values().length];
        try {
            iArr[z.PROFANITY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[z.OFFENSIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[z.POLITICAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[z.TRADEMARK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[z.COPYRIGHT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[z.NOT_LATIN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[z.HARMING.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f311134a = iArr;
    }
}
