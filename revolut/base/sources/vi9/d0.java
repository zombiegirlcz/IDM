package vi9;

import zh9.o0;
import zh9.p1;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f289536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f289537b;

    static {
        int[] iArr = new int[o0.values().length];
        try {
            iArr[o0.Default.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o0.Reduced.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[o0.Zero.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f289536a = iArr;
        int[] iArr2 = new int[p1.values().length];
        try {
            iArr2[p1.Cards.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[p1.Shopping.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f289537b = iArr2;
    }
}
