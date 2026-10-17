package yn4;

import ip0.v7;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yn4.z;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\t\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\u0004R\u001a\u0010!\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010'\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010)\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b\u0005\u0010&R\u001a\u0010,\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b+\u0010&R\u001c\u0010-\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b\u001d\u0010&R\u001c\u0010.\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b\u0018\u0010&R\u001c\u00100\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010$\u001a\u0004\b/\u0010&R\u001a\u00105\u001a\u0002018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u00102\u001a\u0004\b3\u00104R\u001c\u00106\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b(\u0010\u0004R \u0010;\u001a\b\u0012\u0004\u0012\u00020\u0002078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u00108\u001a\u0004\b9\u0010:R\u001a\u0010?\u001a\u00020<8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010=\u001a\u0004\b\r\u0010>R \u0010A\u001a\b\u0012\u0004\u0012\u00020@078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00108\u001a\u0004\b#\u0010:R\u001c\u0010B\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b*\u0010\u0004R \u0010D\u001a\b\u0012\u0004\u0012\u00020C078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00108\u001a\u0004\b \u0010:¨\u0006E"}, d2 = {"Lyn4/g0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "l", "id", "b", "s", "state", "", "c", "J", "d", "()J", "createdAt", "", "I", "t", "()I", "term", "Ljava/time/LocalDate;", "e", "Ljava/time/LocalDate;", "o", "()Ljava/time/LocalDate;", "planSettleDate", "f", "n", "interestRate", "g", "apr", "Ljo3/a;", "h", "Ljo3/a;", "k", "()Ljo3/a;", "futureInterest", "i", "accruedInterest", "j", "p", "remainingTotalAmount", "customAmountRepaymentMin", "customAmountRepaymentMax", "m", "instalmentAmountMin", "Lyn4/g0$b;", "Lyn4/g0$b;", "r", "()Lyn4/g0$b;", "schedule", "downPaymentTxId", "", "Ljava/util/List;", "q", "()Ljava/util/List;", "repaymentMethods", "", "Z", "()Z", "cancellable", "Lyn4/z$b;", "documents", "footer", "Lio4/f;", "detailSections", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdAt")
    private final long createdAt;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("term")
    private final int term;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("planSettleDate")
    private final LocalDate planSettleDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("interestRate")
    @NotNull
    private final String interestRate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("apr")
    @NotNull
    private final String apr;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("futureInterest")
    private final jo3.a futureInterest;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("accruedInterest")
    private final jo3.a accruedInterest;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("remainingTotalAmount")
    @NotNull
    private final jo3.a remainingTotalAmount;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("customAmountRepaymentMin")
    private final jo3.a customAmountRepaymentMin;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("customAmountRepaymentMax")
    private final jo3.a customAmountRepaymentMax;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("instalmentAmountMin")
    private final jo3.a instalmentAmountMin;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("schedule")
    @NotNull
    private final b schedule;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("downPaymentTxId")
    private final String downPaymentTxId;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("repaymentMethods")
    @NotNull
    private final List<String> repaymentMethods;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("cancellable")
    private final boolean cancellable;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("documents")
    @NotNull
    private final List<z.b> documents;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("footer")
    private final String footer;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("detailSections")
    @NotNull
    private final List<io4.f> detailSections;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\tR\u001a\u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u000b\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0007\u001a\u0004\b\u001b\u0010\tR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u0012\u0010\tR\u001c\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\u000e\u0010!R\u001c\u0010#\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b\u0019\u0010!¨\u0006$"}, d2 = {"Lyn4/g0$a;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "j", "()Ljo3/a;", "totalPlanAmount", "b", "k", "totalPrincipalAmount", "c", "i", "totalInterestAmount", "", "d", "I", "h", "()I", "settledInstalmentsCount", "e", "currentInstalmentsCount", "f", "futureInstalmentsCount", "g", "settledInstalmentsAmount", "currentInstalmentsAmount", "futureInstalmentsAmount", "Ljava/time/LocalDate;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "currentInstalmentsDueDate", "lastInstalmentsDueDate", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("totalPlanAmount")
        @NotNull
        private final jo3.a totalPlanAmount;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("totalPrincipalAmount")
        @NotNull
        private final jo3.a totalPrincipalAmount;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("totalInterestAmount")
        @NotNull
        private final jo3.a totalInterestAmount;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("settledInstalmentsCount")
        private final int settledInstalmentsCount;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("currentInstalmentsCount")
        private final int currentInstalmentsCount;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("futureInstalmentsCount")
        private final int futureInstalmentsCount;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("settledInstalmentsAmount")
        private final jo3.a settledInstalmentsAmount;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("currentInstalmentsAmount")
        private final jo3.a currentInstalmentsAmount;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("futureInstalmentsAmount")
        private final jo3.a futureInstalmentsAmount;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @lg.b("currentInstalmentsDueDate")
        private final LocalDate currentInstalmentsDueDate;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @lg.b("lastInstalmentsDueDate")
        private final LocalDate lastInstalmentsDueDate;

        public a(jo3.a totalPlanAmount, jo3.a totalPrincipalAmount, jo3.a totalInterestAmount, int i, int i2, int i3, jo3.a aVar, jo3.a aVar2, jo3.a aVar3, LocalDate localDate, LocalDate localDate2) {
            Intrinsics.checkNotNullParameter(totalPlanAmount, "totalPlanAmount");
            Intrinsics.checkNotNullParameter(totalPrincipalAmount, "totalPrincipalAmount");
            Intrinsics.checkNotNullParameter(totalInterestAmount, "totalInterestAmount");
            this.totalPlanAmount = totalPlanAmount;
            this.totalPrincipalAmount = totalPrincipalAmount;
            this.totalInterestAmount = totalInterestAmount;
            this.settledInstalmentsCount = i;
            this.currentInstalmentsCount = i2;
            this.futureInstalmentsCount = i3;
            this.settledInstalmentsAmount = aVar;
            this.currentInstalmentsAmount = aVar2;
            this.futureInstalmentsAmount = aVar3;
            this.currentInstalmentsDueDate = localDate;
            this.lastInstalmentsDueDate = localDate2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.a getCurrentInstalmentsAmount() {
            return this.currentInstalmentsAmount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getCurrentInstalmentsCount() {
            return this.currentInstalmentsCount;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final LocalDate getCurrentInstalmentsDueDate() {
            return this.currentInstalmentsDueDate;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final jo3.a getFutureInstalmentsAmount() {
            return this.futureInstalmentsAmount;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getFutureInstalmentsCount() {
            return this.futureInstalmentsCount;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.totalPlanAmount, aVar.totalPlanAmount) && Intrinsics.f(this.totalPrincipalAmount, aVar.totalPrincipalAmount) && Intrinsics.f(this.totalInterestAmount, aVar.totalInterestAmount) && this.settledInstalmentsCount == aVar.settledInstalmentsCount && this.currentInstalmentsCount == aVar.currentInstalmentsCount && this.futureInstalmentsCount == aVar.futureInstalmentsCount && Intrinsics.f(this.settledInstalmentsAmount, aVar.settledInstalmentsAmount) && Intrinsics.f(this.currentInstalmentsAmount, aVar.currentInstalmentsAmount) && Intrinsics.f(this.futureInstalmentsAmount, aVar.futureInstalmentsAmount) && Intrinsics.f(this.currentInstalmentsDueDate, aVar.currentInstalmentsDueDate) && Intrinsics.f(this.lastInstalmentsDueDate, aVar.lastInstalmentsDueDate);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final LocalDate getLastInstalmentsDueDate() {
            return this.lastInstalmentsDueDate;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final jo3.a getSettledInstalmentsAmount() {
            return this.settledInstalmentsAmount;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final int getSettledInstalmentsCount() {
            return this.settledInstalmentsCount;
        }

        public final int hashCode() {
            int iB = j6.a.b(this.futureInstalmentsCount, j6.a.b(this.currentInstalmentsCount, j6.a.b(this.settledInstalmentsCount, v7.j(this.totalInterestAmount, v7.j(this.totalPrincipalAmount, this.totalPlanAmount.hashCode() * 31, 31), 31), 31), 31), 31);
            jo3.a aVar = this.settledInstalmentsAmount;
            int iHashCode = (iB + (aVar == null ? 0 : aVar.hashCode())) * 31;
            jo3.a aVar2 = this.currentInstalmentsAmount;
            int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
            jo3.a aVar3 = this.futureInstalmentsAmount;
            int iHashCode3 = (iHashCode2 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
            LocalDate localDate = this.currentInstalmentsDueDate;
            int iHashCode4 = (iHashCode3 + (localDate == null ? 0 : localDate.hashCode())) * 31;
            LocalDate localDate2 = this.lastInstalmentsDueDate;
            return iHashCode4 + (localDate2 != null ? localDate2.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final jo3.a getTotalInterestAmount() {
            return this.totalInterestAmount;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final jo3.a getTotalPlanAmount() {
            return this.totalPlanAmount;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final jo3.a getTotalPrincipalAmount() {
            return this.totalPrincipalAmount;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Lyn4/g0$b;", "", "", "toString", "()Ljava/lang/String;", "Lyn4/g0$a;", "a", "Lyn4/g0$a;", "b", "()Lyn4/g0$a;", "initial", "actual", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("initial")
        @NotNull
        private final a initial;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("actual")
        @NotNull
        private final a actual;

        public b(a initial, a actual) {
            Intrinsics.checkNotNullParameter(initial, "initial");
            Intrinsics.checkNotNullParameter(actual, "actual");
            this.initial = initial;
            this.actual = actual;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getActual() {
            return this.actual;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final a getInitial() {
            return this.initial;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.initial, bVar.initial) && Intrinsics.f(this.actual, bVar.actual);
        }

        public final int hashCode() {
            return this.actual.hashCode() + (this.initial.hashCode() * 31);
        }
    }

    public g0(String id10, String state, long j2, int i, LocalDate localDate, String interestRate, String apr, jo3.a aVar, jo3.a aVar2, jo3.a remainingTotalAmount, jo3.a aVar3, jo3.a aVar4, jo3.a aVar5, b schedule, String str, ArrayList repaymentMethods, boolean z, ArrayList documents, String str2, ArrayList detailSections) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(interestRate, "interestRate");
        Intrinsics.checkNotNullParameter(apr, "apr");
        Intrinsics.checkNotNullParameter(remainingTotalAmount, "remainingTotalAmount");
        Intrinsics.checkNotNullParameter(schedule, "schedule");
        Intrinsics.checkNotNullParameter(repaymentMethods, "repaymentMethods");
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(detailSections, "detailSections");
        this.id = id10;
        this.state = state;
        this.createdAt = j2;
        this.term = i;
        this.planSettleDate = localDate;
        this.interestRate = interestRate;
        this.apr = apr;
        this.futureInterest = aVar;
        this.accruedInterest = aVar2;
        this.remainingTotalAmount = remainingTotalAmount;
        this.customAmountRepaymentMin = aVar3;
        this.customAmountRepaymentMax = aVar4;
        this.instalmentAmountMin = aVar5;
        this.schedule = schedule;
        this.downPaymentTxId = str;
        this.repaymentMethods = repaymentMethods;
        this.cancellable = z;
        this.documents = documents;
        this.footer = str2;
        this.detailSections = detailSections;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAccruedInterest() {
        return this.accruedInterest;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getApr() {
        return this.apr;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getCancellable() {
        return this.cancellable;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getCustomAmountRepaymentMax() {
        return this.customAmountRepaymentMax;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.id, g0Var.id) && Intrinsics.f(this.state, g0Var.state) && this.createdAt == g0Var.createdAt && this.term == g0Var.term && Intrinsics.f(this.planSettleDate, g0Var.planSettleDate) && Intrinsics.f(this.interestRate, g0Var.interestRate) && Intrinsics.f(this.apr, g0Var.apr) && Intrinsics.f(this.futureInterest, g0Var.futureInterest) && Intrinsics.f(this.accruedInterest, g0Var.accruedInterest) && Intrinsics.f(this.remainingTotalAmount, g0Var.remainingTotalAmount) && Intrinsics.f(this.customAmountRepaymentMin, g0Var.customAmountRepaymentMin) && Intrinsics.f(this.customAmountRepaymentMax, g0Var.customAmountRepaymentMax) && Intrinsics.f(this.instalmentAmountMin, g0Var.instalmentAmountMin) && Intrinsics.f(this.schedule, g0Var.schedule) && Intrinsics.f(this.downPaymentTxId, g0Var.downPaymentTxId) && Intrinsics.f(this.repaymentMethods, g0Var.repaymentMethods) && this.cancellable == g0Var.cancellable && Intrinsics.f(this.documents, g0Var.documents) && Intrinsics.f(this.footer, g0Var.footer) && Intrinsics.f(this.detailSections, g0Var.detailSections);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final jo3.a getCustomAmountRepaymentMin() {
        return this.customAmountRepaymentMin;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final List getDetailSections() {
        return this.detailSections;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final List getDocuments() {
        return this.documents;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.term, a0.d.c(p.a.c(this.id.hashCode() * 31, 31, this.state), 31, this.createdAt), 31);
        LocalDate localDate = this.planSettleDate;
        int iC = p.a.c(p.a.c((iB + (localDate == null ? 0 : localDate.hashCode())) * 31, 31, this.interestRate), 31, this.apr);
        jo3.a aVar = this.futureInterest;
        int iHashCode = (iC + (aVar == null ? 0 : aVar.hashCode())) * 31;
        jo3.a aVar2 = this.accruedInterest;
        int iJ = v7.j(this.remainingTotalAmount, (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31, 31);
        jo3.a aVar3 = this.customAmountRepaymentMin;
        int iHashCode2 = (iJ + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        jo3.a aVar4 = this.customAmountRepaymentMax;
        int iHashCode3 = (iHashCode2 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        jo3.a aVar5 = this.instalmentAmountMin;
        int iHashCode4 = (this.schedule.hashCode() + ((iHashCode3 + (aVar5 == null ? 0 : aVar5.hashCode())) * 31)) * 31;
        String str = this.downPaymentTxId;
        int iD = p.a.d(j6.a.c(p.a.d((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31, 31, this.repaymentMethods), 31, this.cancellable), 31, this.documents);
        String str2 = this.footer;
        return this.detailSections.hashCode() + ((iD + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getDownPaymentTxId() {
        return this.downPaymentTxId;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final jo3.a getFutureInterest() {
        return this.futureInterest;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final jo3.a getInstalmentAmountMin() {
        return this.instalmentAmountMin;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getInterestRate() {
        return this.interestRate;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final LocalDate getPlanSettleDate() {
        return this.planSettleDate;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final jo3.a getRemainingTotalAmount() {
        return this.remainingTotalAmount;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final List getRepaymentMethods() {
        return this.repaymentMethods;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final b getSchedule() {
        return this.schedule;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getTerm() {
        return this.term;
    }
}
