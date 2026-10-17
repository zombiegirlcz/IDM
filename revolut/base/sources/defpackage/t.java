package defpackage;

import com.youTransactor.uCube.mdm.TerminalIdType;

/* JADX INFO: loaded from: classes15.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f266831a;

    static {
        int[] iArr = new int[TerminalIdType.values().length];
        f266831a = iArr;
        try {
            iArr[TerminalIdType.C2.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f266831a[TerminalIdType.C3.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f266831a[TerminalIdType.TERM_SN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f266831a[TerminalIdType.BT_MAC.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
