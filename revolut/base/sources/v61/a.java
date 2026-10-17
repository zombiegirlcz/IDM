package v61;

import com.revolut.domain.models.moneyrequest.MoneyRequestDirection;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f286264a;

    static {
        int[] iArr = new int[MoneyRequestDirection.values().length];
        try {
            iArr[MoneyRequestDirection.INCOMING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MoneyRequestDirection.OUTGOING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f286264a = iArr;
    }
}
