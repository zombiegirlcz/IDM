package com.revolut.data.network.models.externalcards;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/revolut/data/network/models/externalcards/ExternalCardAddRequestDto;", "", "externalCardIssuerId", "", "entryMode", "postcode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getExternalCardIssuerId", "()Ljava/lang/String;", "getEntryMode", "getPostcode", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExternalCardAddRequestDto {

    @b("entryMode")
    @NotNull
    private final String entryMode;

    @b("externalCardIssuerId")
    @NotNull
    private final String externalCardIssuerId;

    @b("postcode")
    private final String postcode;

    public ExternalCardAddRequestDto(@NotNull String externalCardIssuerId, @NotNull String entryMode, String str) {
        Intrinsics.checkNotNullParameter(externalCardIssuerId, "externalCardIssuerId");
        Intrinsics.checkNotNullParameter(entryMode, "entryMode");
        this.externalCardIssuerId = externalCardIssuerId;
        this.entryMode = entryMode;
        this.postcode = str;
    }

    @NotNull
    public final String getEntryMode() {
        return this.entryMode;
    }

    @NotNull
    public final String getExternalCardIssuerId() {
        return this.externalCardIssuerId;
    }

    public final String getPostcode() {
        return this.postcode;
    }
}
