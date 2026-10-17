package u6k;

import com.revolut.domain.models.moneyrequest.MoneyRequestDirection;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f277623a;

    static {
        int[] iArr = new int[MoneyRequestDirection.values().length];
        try {
            iArr[MoneyRequestDirection.OUTGOING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MoneyRequestDirection.INCOMING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f277623a = iArr;
    }
}
