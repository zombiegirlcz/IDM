package v6k;

import com.revolut.domain.models.moneyrequest.MoneyRequestDirection;
import com.revolut.domain.models.moneyrequest.MoneyRequestState;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f286409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f286410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f286411c;

    static {
        int[] iArr = new int[wv9.b.values().length];
        try {
            iArr[wv9.b.REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wv9.b.CIRCULAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f286409a = iArr;
        int[] iArr2 = new int[MoneyRequestState.values().length];
        try {
            iArr2[MoneyRequestState.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[MoneyRequestState.ACCEPTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[MoneyRequestState.REJECTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[MoneyRequestState.EXPIRED.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[MoneyRequestState.CANCELLED.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        f286410b = iArr2;
        int[] iArr3 = new int[MoneyRequestDirection.values().length];
        try {
            iArr3[MoneyRequestDirection.INCOMING.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[MoneyRequestDirection.OUTGOING.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        f286411c = iArr3;
    }
}
