package sc6;

import ba6.g0;
import ba6.u;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f261638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f261639b;

    static {
        int[] iArr = new int[g0.values().length];
        try {
            iArr[g0.PROCESSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g0.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f261638a = iArr;
        int[] iArr2 = new int[u.values().length];
        try {
            iArr2[u.REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[u.MAJOR_EVENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f261639b = iArr2;
    }
}
