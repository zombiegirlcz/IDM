package vt0;

import aw0.v1;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f291892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f291893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f291894c;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.LIST_SCREEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.FULL_SCREEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b.ANIMATING_TO_LIST_SCREEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f291892a = iArr;
        int[] iArr2 = new int[i.values().length];
        try {
            iArr2[i.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[i.LOADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[i.PLAYBACK.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[i.ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        f291893b = iArr2;
        int[] iArr3 = new int[v1.values().length];
        try {
            iArr3[v1.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[v1.DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        f291894c = iArr3;
    }
}
