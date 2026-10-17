package xjf;

import com.revolut.domain.models.moneyrequest.SplitBillState;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f306517a;

    static {
        int[] iArr = new int[SplitBillState.values().length];
        try {
            iArr[SplitBillState.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SplitBillState.DECLINED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SplitBillState.SETTLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f306517a = iArr;
    }
}
