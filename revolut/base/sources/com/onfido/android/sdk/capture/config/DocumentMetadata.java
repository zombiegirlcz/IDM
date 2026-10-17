package com.onfido.android.sdk.capture.config;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/onfido/android/sdk/capture/config/DocumentMetadata;", "", "side", "", "type", "issuingCountry", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIssuingCountry", "()Ljava/lang/String;", "getSide", "getType", "equals", "", "other", "hashCode", "", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DocumentMetadata {
    private final String issuingCountry;

    @NotNull
    private final String side;

    @NotNull
    private final String type;

    public DocumentMetadata(@NotNull String side, @NotNull String type, String str) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(type, "type");
        this.side = side;
        this.type = type;
        this.issuingCountry = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!DocumentMetadata.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.i(other, "null cannot be cast to non-null type com.onfido.android.sdk.capture.config.DocumentMetadata");
        DocumentMetadata documentMetadata = (DocumentMetadata) other;
        return Intrinsics.f(this.side, documentMetadata.side) && Intrinsics.f(this.type, documentMetadata.type) && Intrinsics.f(this.issuingCountry, documentMetadata.issuingCountry);
    }

    public final String getIssuingCountry() {
        return this.issuingCountry;
    }

    @NotNull
    public final String getSide() {
        return this.side;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iC = a.c(this.side.hashCode() * 31, 31, this.type);
        String str = this.issuingCountry;
        return iC + (str != null ? str.hashCode() : 0);
    }
}
