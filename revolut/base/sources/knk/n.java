package knk;

import ggk.f0;
import ggk.h0;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f186188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f186189b;

    static {
        int[] iArr = new int[f0.values().length];
        try {
            iArr[f0.IMAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f0.VIDEO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f186188a = iArr;
        int[] iArr2 = new int[h0.values().length];
        try {
            iArr2[h0.PRIMARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[h0.SECONDARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f186189b = iArr2;
    }
}
