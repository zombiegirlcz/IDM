package n33;

import com.revolut.feature.card_order_new.api.SelectedTab;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f211721a;

    static {
        int[] iArr = new int[SelectedTab.values().length];
        try {
            iArr[SelectedTab.CREDIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SelectedTab.DEBIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SelectedTab.PAY_LATER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SelectedTab.FREELANCER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SelectedTab.JOINT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SelectedTab.JUNIOR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[SelectedTab.CRYPTO.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f211721a = iArr;
    }
}
