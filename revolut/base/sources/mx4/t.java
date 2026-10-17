package mx4;

import dx4.l5;
import dx4.s5;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f210191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f210192b;

    static {
        int[] iArr = new int[l5.values().length];
        try {
            iArr[l5.ORIGINAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l5.CIRCLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f210191a = iArr;
        int[] iArr2 = new int[s5.values().length];
        try {
            iArr2[s5.NO_BACKGROUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[s5.WITH_BACKGROUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f210192b = iArr2;
    }
}
