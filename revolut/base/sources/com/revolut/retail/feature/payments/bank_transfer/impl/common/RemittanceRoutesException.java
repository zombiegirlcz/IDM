package com.revolut.retail.feature.payments.bank_transfer.impl.common;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/impl/common/RemittanceRoutesException;", "", "<init>", "()V", "NoRoutesAvailable", "CurrencyNotSupported1502", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/common/RemittanceRoutesException$CurrencyNotSupported1502;", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/common/RemittanceRoutesException$NoRoutesAvailable;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RemittanceRoutesException extends Throwable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/impl/common/RemittanceRoutesException$CurrencyNotSupported1502;", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/common/RemittanceRoutesException;", "<init>", "()V", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CurrencyNotSupported1502 extends RemittanceRoutesException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CurrencyNotSupported1502 f101990a = new CurrencyNotSupported1502();

        private CurrencyNotSupported1502() {
            super(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/impl/common/RemittanceRoutesException$NoRoutesAvailable;", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/common/RemittanceRoutesException;", "<init>", "()V", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NoRoutesAvailable extends RemittanceRoutesException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoRoutesAvailable f101991a = new NoRoutesAvailable();

        private NoRoutesAvailable() {
            super(0);
        }
    }

    public /* synthetic */ RemittanceRoutesException(int i) {
        this();
    }

    private RemittanceRoutesException() {
    }
}
