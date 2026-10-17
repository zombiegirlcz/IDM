package m7d;

import wf0.k0;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f203388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f203389b;

    static {
        int[] iArr = new int[k0.values().length];
        try {
            iArr[k0.Pigeon.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k0.Lightened.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f203388a = iArr;
        int[] iArr2 = new int[gj0.c.values().length];
        try {
            iArr2[gj0.c.BRANCH.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        f203389b = iArr2;
    }
}
