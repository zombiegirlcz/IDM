package n33;

import com.revolut.feature.card_order_new.api.SelectedTab;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f211764a;

    static {
        int[] iArr = new int[SelectedTab.values().length];
        try {
            iArr[SelectedTab.JOINT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SelectedTab.CREDIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f211764a = iArr;
    }
}
