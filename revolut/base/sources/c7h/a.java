package c7h;

import xzg.b0;
import xzg.x;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f21981b;

    static {
        int[] iArr = new int[b0.values().length];
        try {
            iArr[b0.ONE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b0.ONE_WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b0.ONE_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[b0.ONE_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f21980a = iArr;
        int[] iArr2 = new int[x.values().length];
        try {
            iArr2[x.CFD.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        f21981b = iArr2;
    }
}
