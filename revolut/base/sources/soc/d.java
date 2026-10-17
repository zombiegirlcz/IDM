package soc;

import jlc.p;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f264812a;

    static {
        int[] iArr = new int[p.values().length];
        try {
            iArr[p.SIMULATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p.ACTUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f264812a = iArr;
    }
}
