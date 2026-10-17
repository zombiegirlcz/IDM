package apb;

import ncd.d;
import ncd.g;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f8136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f8137b;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.INTEREST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.RETURN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f8136a = iArr;
        int[] iArr2 = new int[g.values().length];
        try {
            iArr2[g.SAVINGS_DEPOSITS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[g.SAVINGS_FIXED_TERM.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[g.SAVINGS_MMF.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f8137b = iArr2;
    }
}
