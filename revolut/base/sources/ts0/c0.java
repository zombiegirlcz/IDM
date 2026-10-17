package ts0;

import aw0.h4;
import aw0.n4;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f273860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f273861b;

    static {
        int[] iArr = new int[n4.values().length];
        try {
            iArr[n4.ASCENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n4.DESCENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n4.NO_SORT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f273860a = iArr;
        int[] iArr2 = new int[h4.values().length];
        try {
            iArr2[h4.LABEL_THEN_PERCENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[h4.PERCENT_THEN_LABEL.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f273861b = iArr2;
    }
}
