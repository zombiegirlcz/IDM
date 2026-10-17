package mif;

import com.revolut.domain.interactors.transactions.TransactionsSort;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f205788a;

    static {
        int[] iArr = new int[TransactionsSort.values().length];
        try {
            iArr[TransactionsSort.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransactionsSort.STARTED_DATE_DESC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TransactionsSort.STARTED_DATE_ASC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TransactionsSort.CREATED_DATE_ASC.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TransactionsSort.COMPLETED_DATE_DESC.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[TransactionsSort.NO_SORT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f205788a = iArr;
    }
}
