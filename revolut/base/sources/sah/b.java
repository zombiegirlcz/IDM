package sah;

import com.revolut.feature.wealth.impl.ui.flows.recurring_transfer_management.RecurringTransferManagementFlowContract$Step;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f261404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f261405b;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.ROBO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f261404a = iArr;
        int[] iArr2 = new int[RecurringTransferManagementFlowContract$Step.values().length];
        try {
            iArr2[RecurringTransferManagementFlowContract$Step.DETAILS.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        f261405b = iArr2;
    }
}
