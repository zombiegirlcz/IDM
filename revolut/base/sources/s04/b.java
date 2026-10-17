package s04;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\t\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\r\u0010\u0014R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0012\u0010\u000fR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010 \u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u001c\u0010#\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u001c\u0010$\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b!\u0010\u001e¨\u0006%"}, d2 = {"Ls04/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "id", "b", "e", "debtType", "Ls04/b$b;", "c", "Ls04/b$b;", "()Ls04/b$b;", "creditProvider", "Ls04/b$a;", "d", "Ls04/b$a;", "()Ls04/b$a;", "amount", "g", "monthlyRepaymentAmount", "currentBalance", "debtShare", "", "h", "Ljava/lang/Boolean;", "i", "()Ljava/lang/Boolean;", "isInternal", "isDeletable", "j", "k", "isRepaid", "isReadOnly", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("debtType")
    @NotNull
    private final String debtType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("creditProvider")
    @NotNull
    private final C1432b creditProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("amount")
    private final a amount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("monthlyRepayment")
    private final a monthlyRepaymentAmount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("currentBalance")
    private final a currentBalance;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("debtShare")
    private final C1432b debtShare;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("isInternal")
    private final Boolean isInternal;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("isDeletable")
    private final Boolean isDeletable;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("isRepaid")
    private final Boolean isRepaid;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("isReadOnly")
    private final Boolean isReadOnly;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0011"}, d2 = {"Ls04/b$a;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "c", "()Ljo3/a;", "value", "", "b", "Z", "()Z", "editable", "mandatory", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        private final jo3.a value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("editable")
        private final boolean editable;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("mandatory")
        private final boolean mandatory;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getEditable() {
            return this.editable;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getMandatory() {
            return this.mandatory;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final jo3.a getValue() {
            return this.value;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.value, aVar.value) && this.editable == aVar.editable && this.mandatory == aVar.mandatory;
        }

        public final int hashCode() {
            jo3.a aVar = this.value;
            return Boolean.hashCode(this.mandatory) + j6.a.c((aVar == null ? 0 : aVar.hashCode()) * 31, 31, this.editable);
        }
    }

    /* JADX INFO: renamed from: s04.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u000f"}, d2 = {"Ls04/b$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "value", "", "b", "Z", "()Z", "editable", "mandatory", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1432b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        private final String value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("editable")
        private final boolean editable;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("mandatory")
        private final boolean mandatory;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getEditable() {
            return this.editable;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getMandatory() {
            return this.mandatory;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1432b)) {
                return false;
            }
            C1432b c1432b = (C1432b) obj2;
            return Intrinsics.f(this.value, c1432b.value) && this.editable == c1432b.editable && this.mandatory == c1432b.mandatory;
        }

        public final int hashCode() {
            String str = this.value;
            return Boolean.hashCode(this.mandatory) + j6.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.editable);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C1432b getCreditProvider() {
        return this.creditProvider;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getCurrentBalance() {
        return this.currentBalance;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C1432b getDebtShare() {
        return this.debtShare;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDebtType() {
        return this.debtType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.id, bVar.id) && Intrinsics.f(this.debtType, bVar.debtType) && Intrinsics.f(this.creditProvider, bVar.creditProvider) && Intrinsics.f(this.amount, bVar.amount) && Intrinsics.f(this.monthlyRepaymentAmount, bVar.monthlyRepaymentAmount) && Intrinsics.f(this.currentBalance, bVar.currentBalance) && Intrinsics.f(this.debtShare, bVar.debtShare) && Intrinsics.f(this.isInternal, bVar.isInternal) && Intrinsics.f(this.isDeletable, bVar.isDeletable) && Intrinsics.f(this.isRepaid, bVar.isRepaid) && Intrinsics.f(this.isReadOnly, bVar.isReadOnly);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final a getMonthlyRepaymentAmount() {
        return this.monthlyRepaymentAmount;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Boolean getIsDeletable() {
        return this.isDeletable;
    }

    public final int hashCode() {
        int iHashCode = (this.creditProvider.hashCode() + p.a.c(this.id.hashCode() * 31, 31, this.debtType)) * 31;
        a aVar = this.amount;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.monthlyRepaymentAmount;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        a aVar3 = this.currentBalance;
        int iHashCode4 = (iHashCode3 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        C1432b c1432b = this.debtShare;
        int iHashCode5 = (iHashCode4 + (c1432b == null ? 0 : c1432b.hashCode())) * 31;
        Boolean bool = this.isInternal;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isDeletable;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isRepaid;
        int iHashCode8 = (iHashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isReadOnly;
        return iHashCode8 + (bool4 != null ? bool4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Boolean getIsInternal() {
        return this.isInternal;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Boolean getIsReadOnly() {
        return this.isReadOnly;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Boolean getIsRepaid() {
        return this.isRepaid;
    }
}
