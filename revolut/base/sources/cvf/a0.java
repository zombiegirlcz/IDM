package cvf;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0016"}, d2 = {"Lcvf/a0;", "", "", "toString", "()Ljava/lang/String;", "", "Lcvf/x;", "a", "Ljava/util/List;", "getTicketsToPurchase", "()Ljava/util/List;", "ticketsToPurchase", "Lcvf/t;", "b", "Lcvf/t;", "getPaymentQuoteDto", "()Lcvf/t;", "paymentQuoteDto", "c", "Ljava/lang/String;", "getPocketId", "pocketId", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("ticketsToPurchase")
    @NotNull
    private final List<x> ticketsToPurchase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentQuote")
    private final t paymentQuoteDto;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("pocketId")
    private final String pocketId;

    public a0(ArrayList ticketsToPurchase, t tVar, String str) {
        Intrinsics.checkNotNullParameter(ticketsToPurchase, "ticketsToPurchase");
        this.ticketsToPurchase = ticketsToPurchase;
        this.paymentQuoteDto = tVar;
        this.pocketId = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.ticketsToPurchase, a0Var.ticketsToPurchase) && Intrinsics.f(this.paymentQuoteDto, a0Var.paymentQuoteDto) && Intrinsics.f(this.pocketId, a0Var.pocketId);
    }

    public final int hashCode() {
        int iHashCode = this.ticketsToPurchase.hashCode() * 31;
        t tVar = this.paymentQuoteDto;
        int iHashCode2 = (iHashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        String str = this.pocketId;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
