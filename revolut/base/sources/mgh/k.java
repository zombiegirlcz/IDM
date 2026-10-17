package mgh;

import jel.q0;
import jel.w;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f205285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f205286b;

    static {
        int[] iArr = new int[q0.values().length];
        try {
            iArr[q0.FAVOURABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q0.MODERATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q0.UNFAVOURABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[q0.STRESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f205285a = iArr;
        int[] iArr2 = new int[w.values().length];
        try {
            iArr2[w.VENTURE_CAPITAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[w.PRIVATE_CREDIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[w.PRIVATE_EQUITY.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[w.MULTI_ASSET.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[w.INFRASTRUCTURE.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[w.REAL_ESTATE.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        f205286b = iArr2;
    }
}
