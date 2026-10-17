package vlk;

import ggk.m1;
import hha.w0;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f290482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f290483b;

    static {
        int[] iArr = new int[m1.values().length];
        try {
            iArr[m1.PLAN_THEMED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m1.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f290482a = iArr;
        int[] iArr2 = new int[w0.values().length];
        try {
            iArr2[w0.PREMIUM.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[w0.METAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[w0.ULTRA.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[w0.PRIVATE.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        f290483b = iArr2;
    }
}
