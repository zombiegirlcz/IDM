package yb5;

import bk4.h;
import bk4.i;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f312191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f312192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f312193c;

    static {
        int[] iArr = new int[k1j.a.values().length];
        try {
            iArr[k1j.a.JOINT_ACCOUNT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k1j.a.POCKETS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f312191a = iArr;
        int[] iArr2 = new int[i.values().length];
        try {
            iArr2[i.RETAIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        f312192b = iArr2;
        int[] iArr3 = new int[h.values().length];
        try {
            iArr3[h.POCKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr3[h.JOINT_ACCOUNT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f312193c = iArr3;
    }
}
