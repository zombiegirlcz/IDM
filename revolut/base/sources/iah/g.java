package iah;

import com.revolut.feature.wealth.impl.ui.flows.add_money.composite.CompositeAddMoneyFlowContract$Step;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f160028a;

    static {
        int[] iArr = new int[CompositeAddMoneyFlowContract$Step.values().length];
        try {
            iArr[CompositeAddMoneyFlowContract$Step.COLLECT_DEPOSIT_INFO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f160028a = iArr;
    }
}
