package n33;

import com.revolut.feature.card_order_new.api.SelectedTab;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f211688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f211689b;

    static {
        int[] iArr = new int[e13.a.values().length];
        try {
            iArr[e13.a.PHYSICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e13.a.VIRTUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e13.a.DISPOSABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f211688a = iArr;
        int[] iArr2 = new int[SelectedTab.values().length];
        try {
            iArr2[SelectedTab.DEBIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[SelectedTab.JOINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[SelectedTab.CREDIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[SelectedTab.PAY_LATER.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[SelectedTab.FREELANCER.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[SelectedTab.JUNIOR.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[SelectedTab.CRYPTO.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        f211689b = iArr2;
    }
}
