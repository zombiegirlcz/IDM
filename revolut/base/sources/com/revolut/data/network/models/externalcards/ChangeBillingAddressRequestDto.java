package com.revolut.data.network.models.externalcards;

import kotlin.Metadata;
import lg.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/data/network/models/externalcards/ChangeBillingAddressRequestDto;", "", "postcode", "", "<init>", "(Ljava/lang/String;)V", "getPostcode", "()Ljava/lang/String;", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChangeBillingAddressRequestDto {

    @b("postcode")
    private final String postcode;

    public ChangeBillingAddressRequestDto(String str) {
        this.postcode = str;
    }

    public final String getPostcode() {
        return this.postcode;
    }
}
