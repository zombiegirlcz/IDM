package com.revolut.data.database.models.recurringpayments.typeconverter;

import e4m.e;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes20.dex */
public final class RecurringPaymentMethodConverter_Factory implements e {
    private final e jsonProvider;

    private RecurringPaymentMethodConverter_Factory(e eVar) {
        this.jsonProvider = eVar;
    }

    public static RecurringPaymentMethodConverter_Factory create(e eVar) {
        return new RecurringPaymentMethodConverter_Factory(eVar);
    }

    public static RecurringPaymentMethodConverter newInstance(Json json) {
        return new RecurringPaymentMethodConverter(json);
    }

    @Override // phm.a
    public RecurringPaymentMethodConverter get() {
        return newInstance((Json) this.jsonProvider.get());
    }
}
