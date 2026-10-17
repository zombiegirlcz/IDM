package bnj;

import dej.d2;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17232a;

    static {
        int[] iArr = new int[d2.values().length];
        try {
            iArr[d2.INSTALL_ESIM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d2.SHARE_ESIM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d2.ACTIVATION_INSTRUCTIONS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[d2.INSTALLATION_TROUBLESHOOTER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f17232a = iArr;
    }
}
