package h3k;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u0011\u0010\u001b¨\u0006\u001d"}, d2 = {"Lh3k/j;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "name", "b", "logo", "", "Ljava/lang/Double;", "g", "()Ljava/lang/Double;", "totalFxRate", "Ljo3/a;", "d", "Ljo3/a;", "()Ljo3/a;", "fixedFee", "e", "f", "senderAmount", "recipientAmount", "Lh3k/i;", "Lh3k/i;", "()Lh3k/i;", "plan", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("logo")
    @NotNull
    private final String logo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalFxRate")
    private final Double totalFxRate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("fixedFee")
    @NotNull
    private final jo3.a fixedFee;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("senderAmount")
    @NotNull
    private final jo3.a senderAmount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("recipientAmount")
    @NotNull
    private final jo3.a recipientAmount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("plan")
    private final i plan;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getFixedFee() {
        return this.fixedFee;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final i getPlan() {
        return this.plan;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getRecipientAmount() {
        return this.recipientAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.name, jVar.name) && Intrinsics.f(this.logo, jVar.logo) && Intrinsics.f(this.totalFxRate, jVar.totalFxRate) && Intrinsics.f(this.fixedFee, jVar.fixedFee) && Intrinsics.f(this.senderAmount, jVar.senderAmount) && Intrinsics.f(this.recipientAmount, jVar.recipientAmount) && Intrinsics.f(this.plan, jVar.plan);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final jo3.a getSenderAmount() {
        return this.senderAmount;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getTotalFxRate() {
        return this.totalFxRate;
    }

    public final int hashCode() {
        int iC = p.a.c(this.name.hashCode() * 31, 31, this.logo);
        Double d = this.totalFxRate;
        int iJ = v7.j(this.recipientAmount, v7.j(this.senderAmount, v7.j(this.fixedFee, (iC + (d == null ? 0 : d.hashCode())) * 31, 31), 31), 31);
        i iVar = this.plan;
        return iJ + (iVar != null ? iVar.hashCode() : 0);
    }
}
