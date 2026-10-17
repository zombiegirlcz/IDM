package kv1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\n\u0010\rR\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u000f\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0012\u0010\u001eR\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R\u001c\u0010'\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lkv1/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getQrType", "qrType", "Ljo3/a;", "b", "Ljo3/a;", "getInitialAmount", "()Ljo3/a;", "initialAmount", "c", "amount", "Lkv1/a;", "d", "Lkv1/a;", "()Lkv1/a;", "alias", "Lkv1/c;", "e", "Lkv1/c;", "()Lkv1/c;", "creditor", "Lkv1/b;", "f", "Lkv1/b;", "()Lkv1/b;", "creditorAgent", "g", "transactionId", "Lkv1/d;", "h", "Lkv1/d;", "getFees", "()Lkv1/d;", "fees", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("qrType")
    @NotNull
    private final String qrType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("initialAmount")
    private final jo3.a initialAmount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final jo3.a amount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("alias")
    @NotNull
    private final a alias;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("creditor")
    @NotNull
    private final c creditor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("creditorAgent")
    @NotNull
    private final b creditorAgent;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactionId")
    private final String transactionId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("fees")
    private final d fees;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getAlias() {
        return this.alias;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getCreditor() {
        return this.creditor;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getCreditorAgent() {
        return this.creditorAgent;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.qrType, fVar.qrType) && Intrinsics.f(this.initialAmount, fVar.initialAmount) && Intrinsics.f(this.amount, fVar.amount) && Intrinsics.f(this.alias, fVar.alias) && Intrinsics.f(this.creditor, fVar.creditor) && Intrinsics.f(this.creditorAgent, fVar.creditorAgent) && Intrinsics.f(this.transactionId, fVar.transactionId) && Intrinsics.f(this.fees, fVar.fees);
    }

    public final int hashCode() {
        int iHashCode = this.qrType.hashCode() * 31;
        jo3.a aVar = this.initialAmount;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        jo3.a aVar2 = this.amount;
        int iHashCode3 = (this.creditorAgent.hashCode() + ((this.creditor.hashCode() + ((this.alias.hashCode() + ((iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31)) * 31)) * 31)) * 31;
        String str = this.transactionId;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        d dVar = this.fees;
        return iHashCode4 + (dVar != null ? dVar.hashCode() : 0);
    }
}
