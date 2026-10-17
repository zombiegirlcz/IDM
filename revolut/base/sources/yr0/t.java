package yr0;

import aw0.a0;
import aw0.b0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f316094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f316095b;

    static {
        int[] iArr = new int[a0.values().length];
        try {
            iArr[a0.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a0.FULL_WIDTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f316094a = iArr;
        int[] iArr2 = new int[b0.values().length];
        try {
            iArr2[b0.ANCHOR_OFFSET.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[b0.CENTERED_ON_ANCHOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f316095b = iArr2;
    }
}
