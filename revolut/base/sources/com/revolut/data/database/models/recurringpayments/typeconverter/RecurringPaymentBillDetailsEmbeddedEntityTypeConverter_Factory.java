package com.revolut.data.database.models.recurringpayments.typeconverter;

import e4m.e;

/* JADX INFO: loaded from: classes20.dex */
public final class RecurringPaymentBillDetailsEmbeddedEntityTypeConverter_Factory implements e {

    public static final class InstanceHolder {
        static final RecurringPaymentBillDetailsEmbeddedEntityTypeConverter_Factory INSTANCE = new RecurringPaymentBillDetailsEmbeddedEntityTypeConverter_Factory();

        private InstanceHolder() {
        }
    }

    public static RecurringPaymentBillDetailsEmbeddedEntityTypeConverter_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static RecurringPaymentBillDetailsEmbeddedEntityTypeConverter newInstance() {
        return new RecurringPaymentBillDetailsEmbeddedEntityTypeConverter();
    }

    @Override // phm.a
    public RecurringPaymentBillDetailsEmbeddedEntityTypeConverter get() {
        return newInstance();
    }
}
