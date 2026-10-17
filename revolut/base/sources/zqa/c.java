package zqa;

import fqa.l;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f324438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f324439b;

    static {
        int[] iArr = new int[dqa.a.values().length];
        try {
            iArr[dqa.a.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[dqa.a.LEGACY_RESULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[dqa.a.KOMPOT_RESULT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f324438a = iArr;
        int[] iArr2 = new int[l.values().length];
        try {
            iArr2[l.CARD_FRAUD.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        f324439b = iArr2;
    }
}
