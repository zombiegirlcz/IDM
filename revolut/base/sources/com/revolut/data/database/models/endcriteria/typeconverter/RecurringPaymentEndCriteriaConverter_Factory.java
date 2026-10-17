package com.revolut.data.database.models.endcriteria.typeconverter;

import e4m.e;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes20.dex */
public final class RecurringPaymentEndCriteriaConverter_Factory implements e {
    private final e jsonProvider;

    private RecurringPaymentEndCriteriaConverter_Factory(e eVar) {
        this.jsonProvider = eVar;
    }

    public static RecurringPaymentEndCriteriaConverter_Factory create(e eVar) {
        return new RecurringPaymentEndCriteriaConverter_Factory(eVar);
    }

    public static RecurringPaymentEndCriteriaConverter newInstance(Json json) {
        return new RecurringPaymentEndCriteriaConverter(json);
    }

    @Override // phm.a
    public RecurringPaymentEndCriteriaConverter get() {
        return newInstance((Json) this.jsonProvider.get());
    }
}
