package hbf;

import ip0.c50;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f150656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f150657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f150658c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[u8f.e.values().length];
        try {
            iArr[u8f.e.IN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u8f.e.OUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f150656a = iArr;
        int[] iArr2 = new int[u8f.f.values().length];
        try {
            iArr2[u8f.f.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[u8f.f.SUBMITTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[u8f.f.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[u8f.f.CANCELLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[u8f.f.FAILED.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[u8f.f.COMPLETED.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        f150657b = iArr2;
        int[] iArr3 = new int[u8f.g.values().length];
        try {
            iArr3[u8f.g.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[u8f.g.COMPLETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[u8f.g.IN_PROGRESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[u8f.g.PENDING.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[u8f.g.FAILED.ordinal()] = 5;
        } catch (NoSuchFieldError unused13) {
        }
        f150658c = iArr3;
        int[] iArr4 = new int[c50.values().length];
        try {
            iArr4[c50.LAST.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        d = iArr4;
    }
}
