package mo4;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx4.d1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\f\u0010\u0014R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u0006\u0010\u001d¨\u0006\u001f"}, d2 = {"Lmo4/d;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "d", "()Ljo3/a;", "statementBalance", "Lmo4/e;", "b", "Lmo4/e;", "c", "()Lmo4/e;", "revpointsInfo", "", "Lmo4/b;", "Ljava/util/List;", "()Ljava/util/List;", "discounts", "Lnx4/d1;", "Lnx4/d1;", "e", "()Lnx4/d1;", "statementDetails", "Lmo4/a;", "Lmo4/a;", "()Lmo4/a;", "confirmationDialog", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("statementBalance")
    @NotNull
    private final jo3.a statementBalance;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("revpointsInfo")
    private final e revpointsInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("discounts")
    private final List<b> discounts;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("statementDetails")
    private final d1 statementDetails;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("confirmationDialog")
    private final a confirmationDialog;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getConfirmationDialog() {
        return this.confirmationDialog;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getDiscounts() {
        return this.discounts;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e getRevpointsInfo() {
        return this.revpointsInfo;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getStatementBalance() {
        return this.statementBalance;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final d1 getStatementDetails() {
        return this.statementDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.statementBalance, dVar.statementBalance) && Intrinsics.f(this.revpointsInfo, dVar.revpointsInfo) && Intrinsics.f(this.discounts, dVar.discounts) && Intrinsics.f(this.statementDetails, dVar.statementDetails) && Intrinsics.f(this.confirmationDialog, dVar.confirmationDialog);
    }

    public final int hashCode() {
        int iHashCode = this.statementBalance.hashCode() * 31;
        e eVar = this.revpointsInfo;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        List<b> list = this.discounts;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        d1 d1Var = this.statementDetails;
        int iHashCode4 = (iHashCode3 + (d1Var == null ? 0 : d1Var.hashCode())) * 31;
        a aVar = this.confirmationDialog;
        return iHashCode4 + (aVar != null ? aVar.hashCode() : 0);
    }
}
