package cgh;

import jel.a0;
import jel.w;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f23984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f23985b;

    static {
        int[] iArr = new int[w.values().length];
        try {
            iArr[w.MULTI_ASSET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[w.PRIVATE_EQUITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[w.VENTURE_CAPITAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[w.PRIVATE_CREDIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[w.INFRASTRUCTURE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[w.REAL_ESTATE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f23984a = iArr;
        int[] iArr2 = new int[a0.values().length];
        try {
            iArr2[a0.SINGLE_MANAGER.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[a0.MULTI_MANAGER.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        f23985b = iArr2;
    }
}
