package r17;

import xr6.r;
import xr6.t;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f250913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f250914b;

    static {
        int[] iArr = new int[r.values().length];
        try {
            iArr[r.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r.COMPLETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f250913a = iArr;
        int[] iArr2 = new int[t.values().length];
        try {
            iArr2[t.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[t.COMPLETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f250914b = iArr2;
    }
}
