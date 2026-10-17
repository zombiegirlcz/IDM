package com.revolut.data.database.models.recurringpayments.typeconverter;

import e4m.e;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes20.dex */
public final class RecurringPaymentFundsSourceEmbeddedEntityTypeConverter_Factory implements e {
    private final e jsonProvider;

    private RecurringPaymentFundsSourceEmbeddedEntityTypeConverter_Factory(e eVar) {
        this.jsonProvider = eVar;
    }

    public static RecurringPaymentFundsSourceEmbeddedEntityTypeConverter_Factory create(e eVar) {
        return new RecurringPaymentFundsSourceEmbeddedEntityTypeConverter_Factory(eVar);
    }

    public static RecurringPaymentFundsSourceEmbeddedEntityTypeConverter newInstance(Json json) {
        return new RecurringPaymentFundsSourceEmbeddedEntityTypeConverter(json);
    }

    @Override // phm.a
    public RecurringPaymentFundsSourceEmbeddedEntityTypeConverter get() {
        return newInstance((Json) this.jsonProvider.get());
    }
}
