package xgg;

import hfg.b0;
import hfg.t0;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f305758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f305759b;

    static {
        int[] iArr = new int[t0.values().length];
        try {
            iArr[t0.MILES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[t0.AVIOS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f305758a = iArr;
        int[] iArr2 = new int[b0.values().length];
        try {
            iArr2[b0.MILES.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[b0.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[b0.REV_PAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[b0.GIFT_CARDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        f305759b = iArr2;
    }
}
