package r73;

import com.revolut.feature.card_screen.impl.kompot.cards_carousel.WalletTokenizationState;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f251980a;

    static {
        int[] iArr = new int[WalletTokenizationState.values().length];
        try {
            iArr[WalletTokenizationState.APPLE_ONLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WalletTokenizationState.GOOGLE_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WalletTokenizationState.APPLE_GOOGLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[WalletTokenizationState.APPLE_OTHER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[WalletTokenizationState.GOOGLE_OTHER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[WalletTokenizationState.APPLE_GOOGLE_OTHER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[WalletTokenizationState.NONE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f251980a = iArr;
    }
}
