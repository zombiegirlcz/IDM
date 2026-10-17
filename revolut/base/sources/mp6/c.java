package mp6;

import rp0.p;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f207742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f207743b;

    static {
        int[] iArr = new int[yo6.d.values().length];
        try {
            iArr[yo6.d.TICKETOR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yo6.d.FAQ.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[yo6.d.TROUBLESHOOTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[yo6.d.AI_SEARCH.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[yo6.d.AIR_MESSAGE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[yo6.d.WORKFLOW_STEP.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[yo6.d.CUSTOMER_RATING.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f207742a = iArr;
        int[] iArr2 = new int[p.values().length];
        try {
            iArr2[p.USER.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[p.PROGRAMMATICALLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        f207743b = iArr2;
    }
}
