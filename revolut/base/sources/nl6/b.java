package nl6;

import com.revolut.domain.models.openbanking.AmendmentType;
import com.revolut.domain.models.openbanking.ConsentType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f217040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f217041b;

    static {
        int[] iArr = new int[AmendmentType.values().length];
        try {
            iArr[AmendmentType.DURATION_UPDATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AmendmentType.ACCOUNTS_UPDATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AmendmentType.DATA_CLUSTER_UPDATED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f217040a = iArr;
        int[] iArr2 = new int[ConsentType.values().length];
        try {
            iArr2[ConsentType.ACCOUNTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ConsentType.AU_READ_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ConsentType.PAYMENTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ConsentType.FUND_CONFIRMATIONS.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        f217041b = iArr2;
    }
}
