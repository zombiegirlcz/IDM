package qwb;

import com.revolut.feature.rev_points.giftcards.api.navigation.RevPointsGiftcardsDestination;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f249848a;

    static {
        int[] iArr = new int[RevPointsGiftcardsDestination.PostPurchaseBackBehavior.values().length];
        try {
            iArr[RevPointsGiftcardsDestination.PostPurchaseBackBehavior.RETURN_TO_PREVIOUS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RevPointsGiftcardsDestination.PostPurchaseBackBehavior.OPEN_MY_CARDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f249848a = iArr;
    }
}
