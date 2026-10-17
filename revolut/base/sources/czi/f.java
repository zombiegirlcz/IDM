package czi;

import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.WalletPassTarget;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f110264a;

    static {
        int[] iArr = new int[WalletPassTarget.values().length];
        try {
            iArr[WalletPassTarget.Recurring.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WalletPassTarget.Unlimited.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WalletPassTarget.Extra.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f110264a = iArr;
    }
}
