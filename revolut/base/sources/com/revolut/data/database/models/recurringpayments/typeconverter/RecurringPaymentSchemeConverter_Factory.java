package com.revolut.data.database.models.recurringpayments.typeconverter;

import e4m.e;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes20.dex */
public final class RecurringPaymentSchemeConverter_Factory implements e {
    private final e jsonProvider;

    private RecurringPaymentSchemeConverter_Factory(e eVar) {
        this.jsonProvider = eVar;
    }

    public static RecurringPaymentSchemeConverter_Factory create(e eVar) {
        return new RecurringPaymentSchemeConverter_Factory(eVar);
    }

    public static RecurringPaymentSchemeConverter newInstance(Json json) {
        return new RecurringPaymentSchemeConverter(json);
    }

    @Override // phm.a
    public RecurringPaymentSchemeConverter get() {
        return newInstance((Json) this.jsonProvider.get());
    }
}
