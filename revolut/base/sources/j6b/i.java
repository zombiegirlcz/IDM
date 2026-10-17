package j6b;

import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.plan_hub.CobrandedCardsPlanHubFlowContract$PagerItem;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f171729a;

    static {
        int[] iArr = new int[CobrandedCardsPlanHubFlowContract$PagerItem.values().length];
        try {
            iArr[CobrandedCardsPlanHubFlowContract$PagerItem.OVERVIEW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CobrandedCardsPlanHubFlowContract$PagerItem.REWARDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CobrandedCardsPlanHubFlowContract$PagerItem.TRANSACTIONS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f171729a = iArr;
    }
}
