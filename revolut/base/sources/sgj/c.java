package sgj;

import dej.m;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f262662a;

    static {
        int[] iArr = new int[m.values().length];
        try {
            iArr[m.DATA_PLAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m.MOBILE_PLAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f262662a = iArr;
    }
}
