package p40;

import v30.c0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f232790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f232791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f232792c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[c0.values().length];
        try {
            iArr[c0.SUPPORT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c0.ASSISTANT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c0.PRIVATE_BANKING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f232790a = iArr;
        int[] iArr2 = new int[o40.a.values().length];
        try {
            iArr2[o40.a.MAKE_CALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[o40.a.SEARCH.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[o40.a.DOWNLOAD_TRANSCRIPT.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[o40.a.START_FEEDBACK_FLOW.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        f232791b = iArr2;
        int[] iArr3 = new int[v30.s.values().length];
        try {
            iArr3[v30.s.PREMIUM.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[v30.s.METAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[v30.s.ULTRA.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[v30.s.PRIVATE.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[v30.s.STANDARD.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[v30.s.NONE.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        f232792c = iArr3;
        int[] iArr4 = new int[k.values().length];
        try {
            iArr4[k.PHOTOS.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[k.FILES.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        d = iArr4;
    }
}
