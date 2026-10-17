package com.revolut.data.network.models.externalcards;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/revolut/data/network/models/externalcards/CardConfirmationRequestDto;", "", "code", "", "lastFour", "issuerId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getLastFour", "getIssuerId", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardConfirmationRequestDto {

    @b("code")
    @NotNull
    private final String code;

    @b("issuerId")
    @NotNull
    private final String issuerId;

    @b("lastFour")
    @NotNull
    private final String lastFour;

    public CardConfirmationRequestDto(@NotNull String code, @NotNull String lastFour, @NotNull String issuerId) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        Intrinsics.checkNotNullParameter(issuerId, "issuerId");
        this.code = code;
        this.lastFour = lastFour;
        this.issuerId = issuerId;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getIssuerId() {
        return this.issuerId;
    }

    @NotNull
    public final String getLastFour() {
        return this.lastFour;
    }
}
