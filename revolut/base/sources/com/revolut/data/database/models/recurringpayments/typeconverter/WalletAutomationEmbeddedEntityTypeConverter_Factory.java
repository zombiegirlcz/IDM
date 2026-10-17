package com.revolut.data.database.models.recurringpayments.typeconverter;

import e4m.e;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes20.dex */
public final class WalletAutomationEmbeddedEntityTypeConverter_Factory implements e {
    private final e jsonProvider;

    private WalletAutomationEmbeddedEntityTypeConverter_Factory(e eVar) {
        this.jsonProvider = eVar;
    }

    public static WalletAutomationEmbeddedEntityTypeConverter_Factory create(e eVar) {
        return new WalletAutomationEmbeddedEntityTypeConverter_Factory(eVar);
    }

    public static WalletAutomationEmbeddedEntityTypeConverter newInstance(Json json) {
        return new WalletAutomationEmbeddedEntityTypeConverter(json);
    }

    @Override // phm.a
    public WalletAutomationEmbeddedEntityTypeConverter get() {
        return newInstance((Json) this.jsonProvider.get());
    }
}
