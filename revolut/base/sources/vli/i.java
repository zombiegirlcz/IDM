package vli;

import com.revolut.domain.models.moneyrequest.MoneyRequestState;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f290465a;

    static {
        int[] iArr = new int[MoneyRequestState.values().length];
        try {
            iArr[MoneyRequestState.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MoneyRequestState.ACCEPTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MoneyRequestState.REJECTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MoneyRequestState.EXPIRED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[MoneyRequestState.CANCELLED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[MoneyRequestState.UNDEFINED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f290465a = iArr;
    }
}
