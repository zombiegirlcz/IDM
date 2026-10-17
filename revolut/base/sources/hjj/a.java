package hjj;

import dej.d2;
import dej.m2;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f152827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f152828b;

    static {
        int[] iArr = new int[m2.values().length];
        try {
            iArr[m2.WARNING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m2.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[m2.INFO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[m2.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f152827a = iArr;
        int[] iArr2 = new int[d2.values().length];
        try {
            iArr2[d2.PLAN_WITHDRAWAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[d2.PLAN_CANCELLATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f152828b = iArr2;
    }
}
