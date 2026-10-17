package com.revolut.data.network.models.topup;

import com.revolut.domain.models.topup.methods.TopupMethodType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JC\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/revolut/data/network/models/topup/MultiCurrencyTransferReviewRequest;", "", "targetAmount", "", "targetCurrency", "", "sourceCurrency", "declarations", "", "topUpMethod", "Lcom/revolut/domain/models/topup/methods/TopupMethodType;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/revolut/domain/models/topup/methods/TopupMethodType;)V", "getTargetAmount", "()J", "getTargetCurrency", "()Ljava/lang/String;", "getSourceCurrency", "getDeclarations", "()Ljava/util/List;", "getTopUpMethod", "()Lcom/revolut/domain/models/topup/methods/TopupMethodType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MultiCurrencyTransferReviewRequest {

    @NotNull
    private final List<String> declarations;

    @NotNull
    private final String sourceCurrency;
    private final long targetAmount;

    @NotNull
    private final String targetCurrency;
    private final TopupMethodType topUpMethod;

    public MultiCurrencyTransferReviewRequest(long j2, @NotNull String targetCurrency, @NotNull String sourceCurrency, @NotNull List<String> declarations, TopupMethodType topupMethodType) {
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(declarations, "declarations");
        this.targetAmount = j2;
        this.targetCurrency = targetCurrency;
        this.sourceCurrency = sourceCurrency;
        this.declarations = declarations;
        this.topUpMethod = topupMethodType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultiCurrencyTransferReviewRequest copy$default(MultiCurrencyTransferReviewRequest multiCurrencyTransferReviewRequest, long j2, String str, String str2, List list, TopupMethodType topupMethodType, int i, Object obj2) {
        if ((i & 1) != 0) {
            j2 = multiCurrencyTransferReviewRequest.targetAmount;
        }
        long j3 = j2;
        if ((i & 2) != 0) {
            str = multiCurrencyTransferReviewRequest.targetCurrency;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = multiCurrencyTransferReviewRequest.sourceCurrency;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            list = multiCurrencyTransferReviewRequest.declarations;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            topupMethodType = multiCurrencyTransferReviewRequest.topUpMethod;
        }
        return multiCurrencyTransferReviewRequest.copy(j3, str3, str4, list2, topupMethodType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTargetAmount() {
        return this.targetAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTargetCurrency() {
        return this.targetCurrency;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSourceCurrency() {
        return this.sourceCurrency;
    }

    @NotNull
    public final List<String> component4() {
        return this.declarations;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TopupMethodType getTopUpMethod() {
        return this.topUpMethod;
    }

    @NotNull
    public final MultiCurrencyTransferReviewRequest copy(long targetAmount, @NotNull String targetCurrency, @NotNull String sourceCurrency, @NotNull List<String> declarations, TopupMethodType topUpMethod) {
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(declarations, "declarations");
        return new MultiCurrencyTransferReviewRequest(targetAmount, targetCurrency, sourceCurrency, declarations, topUpMethod);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiCurrencyTransferReviewRequest)) {
            return false;
        }
        MultiCurrencyTransferReviewRequest multiCurrencyTransferReviewRequest = (MultiCurrencyTransferReviewRequest) other;
        return this.targetAmount == multiCurrencyTransferReviewRequest.targetAmount && Intrinsics.f(this.targetCurrency, multiCurrencyTransferReviewRequest.targetCurrency) && Intrinsics.f(this.sourceCurrency, multiCurrencyTransferReviewRequest.sourceCurrency) && Intrinsics.f(this.declarations, multiCurrencyTransferReviewRequest.declarations) && this.topUpMethod == multiCurrencyTransferReviewRequest.topUpMethod;
    }

    @NotNull
    public final List<String> getDeclarations() {
        return this.declarations;
    }

    @NotNull
    public final String getSourceCurrency() {
        return this.sourceCurrency;
    }

    public final long getTargetAmount() {
        return this.targetAmount;
    }

    @NotNull
    public final String getTargetCurrency() {
        return this.targetCurrency;
    }

    public final TopupMethodType getTopUpMethod() {
        return this.topUpMethod;
    }

    public int hashCode() {
        int iD = a.d(a.c(a.c(Long.hashCode(this.targetAmount) * 31, 31, this.targetCurrency), 31, this.sourceCurrency), 31, this.declarations);
        TopupMethodType topupMethodType = this.topUpMethod;
        return iD + (topupMethodType == null ? 0 : topupMethodType.hashCode());
    }
}
