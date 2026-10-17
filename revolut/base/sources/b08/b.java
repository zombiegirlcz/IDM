package b08;

import zw7.g0;
import zw7.i0;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f11619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f11620b;

    static {
        int[] iArr = new int[g0.values().length];
        try {
            iArr[g0.BASIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g0.ADVANCED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g0.ULTIMATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f11619a = iArr;
        int[] iArr2 = new int[i0.values().length];
        try {
            iArr2[i0.COVERED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[i0.NOT_COVERED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f11620b = iArr2;
    }
}
