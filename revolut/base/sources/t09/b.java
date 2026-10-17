package t09;

import u09.e0;
import u09.k;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f266957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f266958b;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.DISCOVER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f266957a = iArr;
        int[] iArr2 = new int[e0.values().length];
        try {
            iArr2[e0.VIDEO.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[e0.IMAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f266958b = iArr2;
    }
}
