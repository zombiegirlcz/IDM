package nmd;

import yld.c;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f217273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f217274b;

    static {
        int[] iArr = new int[c.values().length];
        try {
            iArr[c.BAR_CHART.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c.LINE_CHART.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c.PIE_CHART.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f217273a = iArr;
        int[] iArr2 = new int[kmd.a.values().length];
        try {
            iArr2[kmd.a.BAR_CHART.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[kmd.a.LINE_CHART.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[kmd.a.PIE_CHART.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f217274b = iArr2;
    }
}
