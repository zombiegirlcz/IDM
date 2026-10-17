package g4k;

import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.extensions.AvailableTypesErrorHandlerExtension$ErrorType;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f140542a;

    static {
        int[] iArr = new int[AvailableTypesErrorHandlerExtension$ErrorType.values().length];
        try {
            iArr[AvailableTypesErrorHandlerExtension$ErrorType.WITHDRAWAL_COOLDOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AvailableTypesErrorHandlerExtension$ErrorType.TRANSACTION_LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f140542a = iArr;
    }
}
