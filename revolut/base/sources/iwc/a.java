package iwc;

import fwc.n;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f169082a;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.JOINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n.ALL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f169082a = iArr;
    }
}
