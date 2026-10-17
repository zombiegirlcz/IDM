package dnf;

import tof.c;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f116291a;

    static {
        int[] iArr = new int[c.values().length];
        try {
            iArr[c.INVEST_GIA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c.INVEST_GIA_JOINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c.INVEST_ISA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[c.INVEST_CUSTODIAN_JISA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[c.INVEST_PERSONAL_JISA.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f116291a = iArr;
    }
}
