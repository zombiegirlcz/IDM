package ip7;

import kl7.d1;
import kl7.f1;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f167676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f167677b;

    static {
        int[] iArr = new int[d1.values().length];
        try {
            iArr[d1.SIMPLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d1.SELECTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f167676a = iArr;
        int[] iArr2 = new int[f1.values().length];
        try {
            iArr2[f1.ANNUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[f1.MONTHLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f167677b = iArr2;
    }
}
