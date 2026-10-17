package ub5;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\f\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u000f¨\u0006\u0013"}, d2 = {"Lub5/f;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "()I", "changesAppliedDay", "", "Lub5/f$b;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "paymentSources", "Lub5/f$a;", "paymentRequests", "feature_credit_card_autopay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("changesAppliedDay")
    private final int changesAppliedDay;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentSources")
    @NotNull
    private final List<b> paymentSources;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentRequests")
    @NotNull
    private final List<a> paymentRequests;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004¨\u0006\u0011"}, d2 = {"Lub5/f$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "state", "", "b", "J", "()J", "collectionDate", "c", "amount", "sourceId", "feature_credit_card_autopay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("state")
        @NotNull
        private final String state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("collectionDate")
        private final long collectionDate;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("amount")
        private final long amount;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("sourceId")
        @NotNull
        private final String sourceId;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getAmount() {
            return this.amount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getCollectionDate() {
            return this.collectionDate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSourceId() {
            return this.sourceId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getState() {
            return this.state;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.state, aVar.state) && this.collectionDate == aVar.collectionDate && this.amount == aVar.amount && Intrinsics.f(this.sourceId, aVar.sourceId);
        }

        public final int hashCode() {
            return this.sourceId.hashCode() + a0.d.c(a0.d.c(this.state.hashCode() * 31, 31, this.collectionDate), 31, this.amount);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004¨\u0006\u0017"}, d2 = {"Lub5/f$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "", "b", "Z", "d", "()Z", "selected", "f", "state", "e", "sortCode", "accountNumber", "debtorName", "g", "usRoutingNumber", "feature_credit_card_autopay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("selected")
        private final boolean selected;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("state")
        @NotNull
        private final String state;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("sortCode")
        private final String sortCode;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("accountNumber")
        @NotNull
        private final String accountNumber;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("debtorName")
        @NotNull
        private final String debtorName;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("usRoutingNumber")
        private final String usRoutingNumber;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDebtorName() {
            return this.debtorName;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getSelected() {
            return this.selected;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getSortCode() {
            return this.sortCode;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.id, bVar.id) && this.selected == bVar.selected && Intrinsics.f(this.state, bVar.state) && Intrinsics.f(this.sortCode, bVar.sortCode) && Intrinsics.f(this.accountNumber, bVar.accountNumber) && Intrinsics.f(this.debtorName, bVar.debtorName) && Intrinsics.f(this.usRoutingNumber, bVar.usRoutingNumber);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getState() {
            return this.state;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getUsRoutingNumber() {
            return this.usRoutingNumber;
        }

        public final int hashCode() {
            int iC = p.a.c(j6.a.c(this.id.hashCode() * 31, 31, this.selected), 31, this.state);
            String str = this.sortCode;
            int iC2 = p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.accountNumber), 31, this.debtorName);
            String str2 = this.usRoutingNumber;
            return iC2 + (str2 != null ? str2.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getChangesAppliedDay() {
        return this.changesAppliedDay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getPaymentRequests() {
        return this.paymentRequests;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getPaymentSources() {
        return this.paymentSources;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.changesAppliedDay == fVar.changesAppliedDay && Intrinsics.f(this.paymentSources, fVar.paymentSources) && Intrinsics.f(this.paymentRequests, fVar.paymentRequests);
    }

    public final int hashCode() {
        return this.paymentRequests.hashCode() + p.a.d(Integer.hashCode(this.changesAppliedDay) * 31, 31, this.paymentSources);
    }
}
