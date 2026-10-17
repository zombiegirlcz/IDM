package defpackage;

import com.youTransactor.uCube.mdm.TerminalIdType;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f259031a;

    static {
        int[] iArr = new int[TerminalIdType.values().length];
        f259031a = iArr;
        try {
            iArr[TerminalIdType.C2.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f259031a[TerminalIdType.C3.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f259031a[TerminalIdType.TERM_SN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f259031a[TerminalIdType.BT_MAC.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
