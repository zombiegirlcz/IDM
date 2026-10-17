package pr4;

import bk4.h;
import bk4.i;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f238926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f238927b;

    static {
        int[] iArr = new int[i.values().length];
        try {
            iArr[i.RETAIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f238926a = iArr;
        int[] iArr2 = new int[h.values().length];
        try {
            iArr2[h.POCKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[h.JOINT_ACCOUNT.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        f238927b = iArr2;
    }
}
