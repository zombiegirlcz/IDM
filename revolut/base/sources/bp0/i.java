package bp0;

import aw0.p9;
import aw0.wa;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f17499b;

    static {
        int[] iArr = new int[wa.values().length];
        try {
            iArr[wa.SHOW_ALL_ZEROES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wa.STRIP_ONE_TRAILING_ZERO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[wa.STRIP_ALL_TRAILING_ZEROES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f17498a = iArr;
        int[] iArr2 = new int[p9.values().length];
        try {
            iArr2[p9.ALWAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[p9.ONLY_NEGATIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[p9.NEVER.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f17499b = iArr2;
    }
}
