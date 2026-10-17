package com.revolut.feature.transfer.core.api.trust;

import com.revolut.feature.transfer.models.transfer.TransferTrustData;
import iy9.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/transfer/core/api/trust/RecipientTrustError;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "", "toString", "()Ljava/lang/String;", "feature_transfer_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecipientTrustError extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f92150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f92151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransferTrustData f92152c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecipientTrustError(Throwable reason, d type, TransferTrustData trustData) {
        super("Apply " + type + " recipient trust (appTrusted=" + trustData.f92304a + ", trustState=" + trustData.f92305b + ", isTrustedToggleEnabled=" + trustData.f92306c + ") error: " + reason, reason);
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(trustData, "trustData");
        this.f92150a = reason;
        this.f92151b = type;
        this.f92152c = trustData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RecipientTrustError)) {
            return false;
        }
        RecipientTrustError recipientTrustError = (RecipientTrustError) obj2;
        return Intrinsics.f(this.f92150a, recipientTrustError.f92150a) && this.f92151b == recipientTrustError.f92151b && Intrinsics.f(this.f92152c, recipientTrustError.f92152c);
    }

    public final int hashCode() {
        return this.f92152c.hashCode() + ((this.f92151b.hashCode() + (this.f92150a.hashCode() * 31)) * 31);
    }
}
