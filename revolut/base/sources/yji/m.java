package yji;

import aii.s;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f314522a;

    static {
        int[] iArr = new int[s.values().length];
        try {
            iArr[s.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s.FINISHED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[s.HIDDEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[s.SHOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f314522a = iArr;
    }
}
