package com.revolut.data.network.models.topup.qr.paynow;

import jo3.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/revolut/data/network/models/topup/qr/paynow/PayNowQrRequestDto;", "", "Ljo3/a;", "amount", "<init>", "(Ljo3/a;)V", "component1", "()Ljo3/a;", "copy", "(Ljo3/a;)Lcom/revolut/data/network/models/topup/qr/paynow/PayNowQrRequestDto;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "getAmount", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PayNowQrRequestDto {

    @b("amount")
    private final a amount;

    public PayNowQrRequestDto(a aVar) {
        this.amount = aVar;
    }

    public static /* synthetic */ PayNowQrRequestDto copy$default(PayNowQrRequestDto payNowQrRequestDto, a aVar, int i, Object obj2) {
        if ((i & 1) != 0) {
            aVar = payNowQrRequestDto.amount;
        }
        return payNowQrRequestDto.copy(aVar);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final a getAmount() {
        return this.amount;
    }

    @NotNull
    public final PayNowQrRequestDto copy(a amount) {
        return new PayNowQrRequestDto(amount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PayNowQrRequestDto) && Intrinsics.f(this.amount, ((PayNowQrRequestDto) other).amount);
    }

    public final a getAmount() {
        return this.amount;
    }

    public int hashCode() {
        a aVar = this.amount;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }
}
