package tcl;

import hcl.d3;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f269889a;

    static {
        int[] iArr = new int[d3.b.values().length];
        try {
            iArr[d3.b.FUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d3.b.ETP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d3.b.BOND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[d3.b.STRUCTURED_NOTE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f269889a = iArr;
    }
}
