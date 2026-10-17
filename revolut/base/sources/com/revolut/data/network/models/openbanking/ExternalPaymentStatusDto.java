package com.revolut.data.network.models.openbanking;

import jo3.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f¨\u0006 "}, d2 = {"Lcom/revolut/data/network/models/openbanking/ExternalPaymentStatusDto;", "", "", "paymentId", "type", "state", "Ljo3/a;", "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljo3/a;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljo3/a;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljo3/a;)Lcom/revolut/data/network/models/openbanking/ExternalPaymentStatusDto;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/lang/String;", "getPaymentId", "getType", "getState", "Ljo3/a;", "getAmount", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExternalPaymentStatusDto {

    @b("amount")
    private final a amount;

    @b("id")
    @NotNull
    private final String paymentId;

    @b("state")
    @NotNull
    private final String state;

    @b("type")
    private final String type;

    public ExternalPaymentStatusDto(@NotNull String paymentId, String str, @NotNull String state, a aVar) {
        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
        Intrinsics.checkNotNullParameter(state, "state");
        this.paymentId = paymentId;
        this.type = str;
        this.state = state;
        this.amount = aVar;
    }

    public static /* synthetic */ ExternalPaymentStatusDto copy$default(ExternalPaymentStatusDto externalPaymentStatusDto, String str, String str2, String str3, a aVar, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = externalPaymentStatusDto.paymentId;
        }
        if ((i & 2) != 0) {
            str2 = externalPaymentStatusDto.type;
        }
        if ((i & 4) != 0) {
            str3 = externalPaymentStatusDto.state;
        }
        if ((i & 8) != 0) {
            aVar = externalPaymentStatusDto.amount;
        }
        return externalPaymentStatusDto.copy(str, str2, str3, aVar);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPaymentId() {
        return this.paymentId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final a getAmount() {
        return this.amount;
    }

    @NotNull
    public final ExternalPaymentStatusDto copy(@NotNull String paymentId, String type, @NotNull String state, a amount) {
        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
        Intrinsics.checkNotNullParameter(state, "state");
        return new ExternalPaymentStatusDto(paymentId, type, state, amount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalPaymentStatusDto)) {
            return false;
        }
        ExternalPaymentStatusDto externalPaymentStatusDto = (ExternalPaymentStatusDto) other;
        return Intrinsics.f(this.paymentId, externalPaymentStatusDto.paymentId) && Intrinsics.f(this.type, externalPaymentStatusDto.type) && Intrinsics.f(this.state, externalPaymentStatusDto.state) && Intrinsics.f(this.amount, externalPaymentStatusDto.amount);
    }

    public final a getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getPaymentId() {
        return this.paymentId;
    }

    @NotNull
    public final String getState() {
        return this.state;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.paymentId.hashCode() * 31;
        String str = this.type;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.state);
        a aVar = this.amount;
        return iC + (aVar != null ? aVar.hashCode() : 0);
    }
}
