package com.revolut.data.network.models.topup;

import ip0.v7;
import java.util.List;
import jo3.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J>\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013¨\u0006&"}, d2 = {"Lcom/revolut/data/network/models/topup/McyBookTransactionRequest;", "", "Lcom/revolut/data/network/models/topup/McyExchangeRateDto;", "rate", "Ljo3/a;", "targetAmount", "", "", "declarations", "visitCountry", "<init>", "(Lcom/revolut/data/network/models/topup/McyExchangeRateDto;Ljo3/a;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Lcom/revolut/data/network/models/topup/McyExchangeRateDto;", "component2", "()Ljo3/a;", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/String;", "copy", "(Lcom/revolut/data/network/models/topup/McyExchangeRateDto;Ljo3/a;Ljava/util/List;Ljava/lang/String;)Lcom/revolut/data/network/models/topup/McyBookTransactionRequest;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Lcom/revolut/data/network/models/topup/McyExchangeRateDto;", "getRate", "Ljo3/a;", "getTargetAmount", "Ljava/util/List;", "getDeclarations", "Ljava/lang/String;", "getVisitCountry", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class McyBookTransactionRequest {

    @b("declarations")
    @NotNull
    private final List<String> declarations;

    @b("rate")
    @NotNull
    private final McyExchangeRateDto rate;

    @b("topupAmount")
    @NotNull
    private final a targetAmount;

    @b("visitCountry")
    @NotNull
    private final String visitCountry;

    public McyBookTransactionRequest(@NotNull McyExchangeRateDto rate, @NotNull a targetAmount, @NotNull List<String> declarations, @NotNull String visitCountry) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(targetAmount, "targetAmount");
        Intrinsics.checkNotNullParameter(declarations, "declarations");
        Intrinsics.checkNotNullParameter(visitCountry, "visitCountry");
        this.rate = rate;
        this.targetAmount = targetAmount;
        this.declarations = declarations;
        this.visitCountry = visitCountry;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ McyBookTransactionRequest copy$default(McyBookTransactionRequest mcyBookTransactionRequest, McyExchangeRateDto mcyExchangeRateDto, a aVar, List list, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            mcyExchangeRateDto = mcyBookTransactionRequest.rate;
        }
        if ((i & 2) != 0) {
            aVar = mcyBookTransactionRequest.targetAmount;
        }
        if ((i & 4) != 0) {
            list = mcyBookTransactionRequest.declarations;
        }
        if ((i & 8) != 0) {
            str = mcyBookTransactionRequest.visitCountry;
        }
        return mcyBookTransactionRequest.copy(mcyExchangeRateDto, aVar, list, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final McyExchangeRateDto getRate() {
        return this.rate;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final a getTargetAmount() {
        return this.targetAmount;
    }

    @NotNull
    public final List<String> component3() {
        return this.declarations;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVisitCountry() {
        return this.visitCountry;
    }

    @NotNull
    public final McyBookTransactionRequest copy(@NotNull McyExchangeRateDto rate, @NotNull a targetAmount, @NotNull List<String> declarations, @NotNull String visitCountry) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(targetAmount, "targetAmount");
        Intrinsics.checkNotNullParameter(declarations, "declarations");
        Intrinsics.checkNotNullParameter(visitCountry, "visitCountry");
        return new McyBookTransactionRequest(rate, targetAmount, declarations, visitCountry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof McyBookTransactionRequest)) {
            return false;
        }
        McyBookTransactionRequest mcyBookTransactionRequest = (McyBookTransactionRequest) other;
        return Intrinsics.f(this.rate, mcyBookTransactionRequest.rate) && Intrinsics.f(this.targetAmount, mcyBookTransactionRequest.targetAmount) && Intrinsics.f(this.declarations, mcyBookTransactionRequest.declarations) && Intrinsics.f(this.visitCountry, mcyBookTransactionRequest.visitCountry);
    }

    @NotNull
    public final List<String> getDeclarations() {
        return this.declarations;
    }

    @NotNull
    public final McyExchangeRateDto getRate() {
        return this.rate;
    }

    @NotNull
    public final a getTargetAmount() {
        return this.targetAmount;
    }

    @NotNull
    public final String getVisitCountry() {
        return this.visitCountry;
    }

    public int hashCode() {
        return this.visitCountry.hashCode() + p.a.d(v7.j(this.targetAmount, this.rate.hashCode() * 31, 31), 31, this.declarations);
    }
}
