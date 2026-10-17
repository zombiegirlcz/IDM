package gl6;

import com.revolut.domain.models.openbanking.ConsentPermission;
import com.revolut.domain.models.openbanking.PermissionType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f144567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f144568b;

    static {
        int[] iArr = new int[PermissionType.values().length];
        try {
            iArr[PermissionType.READ_ACCOUNTS_BASIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PermissionType.READ_ACCOUNTS_DETAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PermissionType.READ_BALANCES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PermissionType.READ_TRANSACTIONS_BASIC.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PermissionType.READ_TRANSACTIONS_DETAIL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[PermissionType.READ_TRANSACTIONS_CREDITS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[PermissionType.READ_TRANSACTIONS_DEBITS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f144567a = iArr;
        int[] iArr2 = new int[ConsentPermission.values().length];
        try {
            iArr2[ConsentPermission.PROFILE.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[ConsentPermission.COMMON_CUSTOMER_BASIC_READ.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[ConsentPermission.COMMON_CUSTOMER_DETAIL_READ.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[ConsentPermission.BANK_ACCOUNTS_BASIC_READ.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[ConsentPermission.BANK_ACCOUNTS_DETAIL_READ.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[ConsentPermission.BANK_PAYEES_READ.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[ConsentPermission.BANK_REGULAR_PAYMENTS_READ.ordinal()] = 7;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[ConsentPermission.BANK_TRANSACTIONS_READ.ordinal()] = 8;
        } catch (NoSuchFieldError unused15) {
        }
        f144568b = iArr2;
    }
}
