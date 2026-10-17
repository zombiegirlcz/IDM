package gr1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lgr1/c;", "Lgr1/f;", "", "toString", "()Ljava/lang/String;", "Lgr1/c$a;", "a", "Lgr1/c$a;", "()Lgr1/c$a;", "details", "feature_apm_bills_postal_check_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("details")
    @NotNull
    private final a details;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0013\u0010\u000eR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010#\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010!\u001a\u0004\b\u0006\u0010\"R\u001c\u0010'\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b\u0019\u0010&¨\u0006("}, d2 = {"Lgr1/c$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "decodeId", "Ljo3/a;", "b", "Ljo3/a;", "()Ljo3/a;", "amount", "c", "j", "minAmount", "i", "maxAmount", "e", "Ljava/lang/String;", "h", "issuerName", "f", "g", "issuerAccountNumber", "k", "voucherNumber", "dueDate", "checkNote", "", "Z", "()Z", "alreadyPaid", "Lyo1/e;", "Lyo1/e;", "()Lyo1/e;", "formFields", "feature_apm_bills_postal_check_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("decodeId")
        private final Long decodeId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("amount")
        private final jo3.a amount;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("minAmount")
        private final jo3.a minAmount;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("maxAmount")
        private final jo3.a maxAmount;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("issuerName")
        private final String issuerName;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("issuerAccountNumber")
        private final String issuerAccountNumber;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("voucherNumber")
        private final String voucherNumber;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("dueDate")
        private final String dueDate;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("checkNote")
        private final String checkNote;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @lg.b("alreadyPaid")
        private final boolean alreadyPaid;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @lg.b("formFields")
        private final yo1.e formFields;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getAlreadyPaid() {
            return this.alreadyPaid;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final jo3.a getAmount() {
            return this.amount;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getCheckNote() {
            return this.checkNote;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Long getDecodeId() {
            return this.decodeId;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getDueDate() {
            return this.dueDate;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.decodeId, aVar.decodeId) && Intrinsics.f(this.amount, aVar.amount) && Intrinsics.f(this.minAmount, aVar.minAmount) && Intrinsics.f(this.maxAmount, aVar.maxAmount) && Intrinsics.f(this.issuerName, aVar.issuerName) && Intrinsics.f(this.issuerAccountNumber, aVar.issuerAccountNumber) && Intrinsics.f(this.voucherNumber, aVar.voucherNumber) && Intrinsics.f(this.dueDate, aVar.dueDate) && Intrinsics.f(this.checkNote, aVar.checkNote) && this.alreadyPaid == aVar.alreadyPaid && Intrinsics.f(this.formFields, aVar.formFields);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final yo1.e getFormFields() {
            return this.formFields;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getIssuerAccountNumber() {
            return this.issuerAccountNumber;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getIssuerName() {
            return this.issuerName;
        }

        public final int hashCode() {
            Long l2 = this.decodeId;
            int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
            jo3.a aVar = this.amount;
            int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            jo3.a aVar2 = this.minAmount;
            int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
            jo3.a aVar3 = this.maxAmount;
            int iHashCode4 = (iHashCode3 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
            String str = this.issuerName;
            int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.issuerAccountNumber;
            int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.voucherNumber;
            int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.dueDate;
            int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.checkNote;
            int iC = j6.a.c((iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.alreadyPaid);
            yo1.e eVar = this.formFields;
            return iC + (eVar != null ? eVar.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final jo3.a getMaxAmount() {
            return this.maxAmount;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final jo3.a getMinAmount() {
            return this.minAmount;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getVoucherNumber() {
            return this.voucherNumber;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getDetails() {
        return this.details;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.details, ((c) obj2).details);
    }

    public final int hashCode() {
        return this.details.hashCode();
    }
}
