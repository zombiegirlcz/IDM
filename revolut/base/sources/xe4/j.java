package xe4;

import yy3.n;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f304536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f304537b;

    static {
        int[] iArr = new int[gh0.d.values().length];
        try {
            iArr[gh0.d.GOOGLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[gh0.d.HUAWEI.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f304536a = iArr;
        int[] iArr2 = new int[n.values().length];
        try {
            iArr2[n.SMART_ID.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        f304537b = iArr2;
    }
}
