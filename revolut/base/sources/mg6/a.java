package mg6;

import com.revolut.domain.models.openbanking.OpenBankingConsentsFilter;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f205159a;

    static {
        int[] iArr = new int[OpenBankingConsentsFilter.values().length];
        try {
            iArr[OpenBankingConsentsFilter.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OpenBankingConsentsFilter.ACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OpenBankingConsentsFilter.INACTIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f205159a = iArr;
    }
}
