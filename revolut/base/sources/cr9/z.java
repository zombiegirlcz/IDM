package cr9;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010#\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcr9/z;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getRecipient", "recipient", "b", "getSender", "sender", "c", "getMethod", "method", "", "d", "J", "getAmount", "()J", "amount", "e", "getCurrency", "currency", "Lcr9/h0;", "f", "Lcr9/h0;", "getReason", "()Lcr9/h0;", "reason", "Libl/a;", "g", "Libl/a;", "getFundingSource", "()Libl/a;", "fundingSource", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("recipient")
    @NotNull
    private final String recipient;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("sender")
    @NotNull
    private final String sender;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("method")
    private final String method;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("amount")
    private final long amount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("reason")
    private final h0 reason;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("fundingSource")
    private final ibl.a fundingSource;

    public z(String recipient, String sender, String str, long j2, String currency, h0 h0Var, ibl.a aVar) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.recipient = recipient;
        this.sender = sender;
        this.method = str;
        this.amount = j2;
        this.currency = currency;
        this.reason = h0Var;
        this.fundingSource = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.recipient, zVar.recipient) && Intrinsics.f(this.sender, zVar.sender) && Intrinsics.f(this.method, zVar.method) && this.amount == zVar.amount && Intrinsics.f(this.currency, zVar.currency) && Intrinsics.f(this.reason, zVar.reason) && Intrinsics.f(this.fundingSource, zVar.fundingSource);
    }

    public final int hashCode() {
        int iC = p.a.c(this.recipient.hashCode() * 31, 31, this.sender);
        String str = this.method;
        int iC2 = p.a.c(a0.d.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.amount), 31, this.currency);
        h0 h0Var = this.reason;
        int iHashCode = (iC2 + (h0Var == null ? 0 : h0Var.hashCode())) * 31;
        ibl.a aVar = this.fundingSource;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }
}
