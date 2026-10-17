package d8h;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0005\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\rR\u001a\u0010\u0018\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\rR\u001a\u0010\u001b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\rR\u001a\u0010\u001c\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0019\u0010\rR\u001a\u0010\u001d\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u001e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u0016\u0010\rR\u001a\u0010\u001f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\n\u0010\r¨\u0006 "}, d2 = {"Ld8h/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "currentOnboardingStatus", "Ld8h/b$b;", "b", "Ld8h/b$b;", "g", "()Ld8h/b$b;", "nationality", "Ld8h/b$a;", "Ld8h/b$a;", "()Ld8h/b$a;", "accountPurpose", "d", "j", "occupation", "e", "h", "netIncome", "f", "i", "netWorth", "employmentStatus", "employer", "employerIndustry", "affiliated", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("currentOnboardingStatus")
    @NotNull
    private final String currentOnboardingStatus;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("nationality")
    @NotNull
    private final C0666b nationality;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("accountPurpose")
    @NotNull
    private final a accountPurpose;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("occupation")
    @NotNull
    private final C0666b occupation;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("netIncome")
    @NotNull
    private final C0666b netIncome;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("netWorth")
    @NotNull
    private final C0666b netWorth;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("employmentStatus")
    @NotNull
    private final C0666b employmentStatus;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("employer")
    @NotNull
    private final C0666b employer;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("employerIndustry")
    @NotNull
    private final C0666b employerIndustry;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("affiliated")
    @NotNull
    private final C0666b affiliated;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\f"}, d2 = {"Ld8h/b$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "label", "b", "value", "c", "valueLabel", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        @NotNull
        private final String label;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        private final String value;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("valueLabel")
        @NotNull
        private final String valueLabel;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getValueLabel() {
            return this.valueLabel;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.label, aVar.label) && Intrinsics.f(this.value, aVar.value) && Intrinsics.f(this.valueLabel, aVar.valueLabel);
        }

        public final int hashCode() {
            int iHashCode = this.label.hashCode() * 31;
            String str = this.value;
            return this.valueLabel.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }
    }

    /* JADX INFO: renamed from: d8h.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Ld8h/b$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "label", "b", "valueLabel", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C0666b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        @NotNull
        private final String label;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("valueLabel")
        @NotNull
        private final String valueLabel;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getValueLabel() {
            return this.valueLabel;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C0666b)) {
                return false;
            }
            C0666b c0666b = (C0666b) obj2;
            return Intrinsics.f(this.label, c0666b.label) && Intrinsics.f(this.valueLabel, c0666b.valueLabel);
        }

        public final int hashCode() {
            return this.valueLabel.hashCode() + (this.label.hashCode() * 31);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getAccountPurpose() {
        return this.accountPurpose;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C0666b getAffiliated() {
        return this.affiliated;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCurrentOnboardingStatus() {
        return this.currentOnboardingStatus;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C0666b getEmployer() {
        return this.employer;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C0666b getEmployerIndustry() {
        return this.employerIndustry;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.currentOnboardingStatus, bVar.currentOnboardingStatus) && Intrinsics.f(this.nationality, bVar.nationality) && Intrinsics.f(this.accountPurpose, bVar.accountPurpose) && Intrinsics.f(this.occupation, bVar.occupation) && Intrinsics.f(this.netIncome, bVar.netIncome) && Intrinsics.f(this.netWorth, bVar.netWorth) && Intrinsics.f(this.employmentStatus, bVar.employmentStatus) && Intrinsics.f(this.employer, bVar.employer) && Intrinsics.f(this.employerIndustry, bVar.employerIndustry) && Intrinsics.f(this.affiliated, bVar.affiliated);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C0666b getEmploymentStatus() {
        return this.employmentStatus;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C0666b getNationality() {
        return this.nationality;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C0666b getNetIncome() {
        return this.netIncome;
    }

    public final int hashCode() {
        return this.affiliated.hashCode() + ((this.employerIndustry.hashCode() + ((this.employer.hashCode() + ((this.employmentStatus.hashCode() + ((this.netWorth.hashCode() + ((this.netIncome.hashCode() + ((this.occupation.hashCode() + ((this.accountPurpose.hashCode() + ((this.nationality.hashCode() + (this.currentOnboardingStatus.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C0666b getNetWorth() {
        return this.netWorth;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C0666b getOccupation() {
        return this.occupation;
    }
}
