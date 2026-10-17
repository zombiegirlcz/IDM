package yo4;

import ll4.b0;
import xo4.x;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f315557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f315558b;

    static {
        int[] iArr = new int[b0.values().length];
        try {
            iArr[b0.FULLY_SECURED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b0.PARTIALLY_SECURED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f315557a = iArr;
        int[] iArr2 = new int[x.values().length];
        try {
            iArr2[x.PARTIALLY_SECURED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[x.FULLY_SECURED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f315558b = iArr2;
    }
}
