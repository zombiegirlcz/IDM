package yn4;

import ip0.v7;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0004\u0005\n\u0016\u0010J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u001a\u0010#\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010&\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"R\u001c\u0010,\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010.\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b-\u0010\"R\u001a\u00101\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010 \u001a\u0004\b0\u0010\"R\u001a\u00103\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010 \u001a\u0004\b\u0016\u0010\"R\u001c\u00106\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010 \u001a\u0004\b5\u0010\"R\u001c\u00108\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010 \u001a\u0004\b\u0010\u0010\"R\u001c\u0010;\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010)\u001a\u0004\b:\u0010+R\u001c\u0010=\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010)\u001a\u0004\b\n\u0010+R\u001c\u0010@\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010)\u001a\u0004\b?\u0010+R\u001a\u0010A\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b9\u0010+R\u001c\u0010C\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010 \u001a\u0004\b>\u0010\"R\u001c\u0010E\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010\u0006\u001a\u0004\bD\u0010\u0004R\u001c\u0010F\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\b\u001b\u0010\u0004R\u001a\u0010H\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\bG\u0010\u0004R\u001c\u0010L\u001a\u0004\u0018\u00010I8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010J\u001a\u0004\b(\u0010KR\u001c\u0010M\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010 \u001a\u0004\b\u0005\u0010\"R\u001a\u0010O\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\bN\u0010\"R\u001c\u0010P\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010 \u001a\u0004\b2\u0010\"R\u001c\u0010R\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010 \u001a\u0004\b/\u0010\"R\u001c\u0010T\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010 \u001a\u0004\bB\u0010\"R \u0010V\u001a\b\u0012\u0004\u0012\u00020U0\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b7\u0010\u0013R\u001c\u0010Z\u001a\u0004\u0018\u00010W8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010X\u001a\u0004\b\u001f\u0010YR \u0010\\\u001a\b\u0012\u0004\u0012\u00020[0\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b4\u0010\u0013R \u0010]\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\u0011\u001a\u0004\bQ\u0010\u0013R\u001a\u0010a\u001a\u00020^8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010_\u001a\u0004\bS\u0010`R\u001a\u0010e\u001a\u00020b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010c\u001a\u0004\b$\u0010dR\u001c\u0010f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b<\u0010\u0004¨\u0006g"}, d2 = {"Lyn4/z;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "q", "id", "", "b", "J", "i", "()J", "createdAt", "", "c", "Ljava/util/List;", "H", "()Ljava/util/List;", "transactionIds", "", "d", "I", "B", "()I", "settledInstalments", "e", "D", "term", "Ljo3/a;", "f", "Ljo3/a;", "x", "()Ljo3/a;", "principalAmount", "g", "u", "nextDueAmount", "Ljava/time/LocalDate;", "h", "Ljava/time/LocalDate;", "v", "()Ljava/time/LocalDate;", "nextDueDate", "F", "totalRepaid", "j", "G", "totalRepayable", "k", "actualTotalRepayable", "l", "E", "totalInterest", "m", "actualTotalInterest", "n", "t", "lastDueDate", "o", "actualLastDueDate", "p", "w", "planSettleDate", "firstMaturingDate", "r", "futureInterest", "s", "interestRate", "apr", "C", "state", "Lyn4/z$a;", "Lyn4/z$a;", "()Lyn4/z$a;", "cancellation", "accruedInterest", "y", "remainingTotalAmount", "customAmountRepaymentMin", "z", "customAmountRepaymentMax", "A", "instalmentAmountMin", "Lyn4/z$b;", "documents", "Lyn4/r;", "Lyn4/r;", "()Lyn4/r;", "aprInfo", "Lio4/f;", "detailSections", "repaymentMethods", "Lyn4/z$d;", "Lyn4/z$d;", "()Lyn4/z$d;", "schedule", "", "Z", "()Z", "cancellable", "footer", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class z {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @lg.b("instalmentAmountMin")
    private final jo3.a instalmentAmountMin;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @lg.b("documents")
    @NotNull
    private final List<b> documents;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @lg.b("aprInfo")
    private final r aprInfo;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @lg.b("detailSections")
    @NotNull
    private final List<io4.f> detailSections;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @lg.b("repaymentMethods")
    @NotNull
    private final List<String> repaymentMethods;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @lg.b("schedule")
    @NotNull
    private final d schedule;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @lg.b("cancellable")
    private final boolean cancellable;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @lg.b("footer")
    private final String footer;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdAt")
    private final long createdAt;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactionIds")
    @NotNull
    private final List<String> transactionIds;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("settledInstalments")
    private final int settledInstalments;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("term")
    private final int term;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("principalAmount")
    @NotNull
    private final jo3.a principalAmount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("nextDueAmount")
    private final jo3.a nextDueAmount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("nextDueDate")
    private final LocalDate nextDueDate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("totalRepaid")
    @NotNull
    private final jo3.a totalRepaid;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalRepayable")
    @NotNull
    private final jo3.a totalRepayable;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("actualTotalRepayable")
    @NotNull
    private final jo3.a actualTotalRepayable;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalInterest")
    private final jo3.a totalInterest;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("actualTotalInterest")
    private final jo3.a actualTotalInterest;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastDueDate")
    private final LocalDate lastDueDate;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("actualLastDueDate")
    private final LocalDate actualLastDueDate;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("planSettleDate")
    private final LocalDate planSettleDate;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("firstMaturingDate")
    @NotNull
    private final LocalDate firstMaturingDate;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("futureInterest")
    private final jo3.a futureInterest;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("interestRate")
    private final String interestRate;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("apr")
    private final String apr;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("cancellation")
    private final a cancellation;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("accruedInterest")
    private final jo3.a accruedInterest;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("remainingTotalAmount")
    @NotNull
    private final jo3.a remainingTotalAmount;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("customAmountRepaymentMin")
    private final jo3.a customAmountRepaymentMin;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @lg.b("customAmountRepaymentMax")
    private final jo3.a customAmountRepaymentMax;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lyn4/z$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "reason", "Ljava/time/LocalDate;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "date", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("reason")
        @NotNull
        private final String reason;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("date")
        @NotNull
        private final LocalDate date;

        public a(String reason, LocalDate date) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(date, "date");
            this.reason = reason;
            this.date = date;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDate getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.reason, aVar.reason) && Intrinsics.f(this.date, aVar.date);
        }

        public final int hashCode() {
            return this.date.hashCode() + (this.reason.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lyn4/z$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "type", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        public b(String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.type, ((b) obj2).type);
        }

        public final int hashCode() {
            return this.type.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\tR\u001a\u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u000b\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0007\u001a\u0004\b\u001b\u0010\tR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u0012\u0010\tR\u001c\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\u000e\u0010!R\u001c\u0010#\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b\u0019\u0010!¨\u0006$"}, d2 = {"Lyn4/z$c;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "j", "()Ljo3/a;", "totalPlanAmount", "b", "k", "totalPrincipalAmount", "c", "i", "totalInterestAmount", "", "d", "I", "h", "()I", "settledInstalmentsCount", "e", "currentInstalmentsCount", "f", "futureInstalmentsCount", "g", "settledInstalmentsAmount", "currentInstalmentsAmount", "futureInstalmentsAmount", "Ljava/time/LocalDate;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "currentInstalmentsDueDate", "lastInstalmentsDueDate", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

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

        public c(jo3.a totalPlanAmount, jo3.a totalPrincipalAmount, jo3.a totalInterestAmount, int i, int i2, int i3, jo3.a aVar, jo3.a aVar2, jo3.a aVar3, LocalDate localDate, LocalDate localDate2) {
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
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.totalPlanAmount, cVar.totalPlanAmount) && Intrinsics.f(this.totalPrincipalAmount, cVar.totalPrincipalAmount) && Intrinsics.f(this.totalInterestAmount, cVar.totalInterestAmount) && this.settledInstalmentsCount == cVar.settledInstalmentsCount && this.currentInstalmentsCount == cVar.currentInstalmentsCount && this.futureInstalmentsCount == cVar.futureInstalmentsCount && Intrinsics.f(this.settledInstalmentsAmount, cVar.settledInstalmentsAmount) && Intrinsics.f(this.currentInstalmentsAmount, cVar.currentInstalmentsAmount) && Intrinsics.f(this.futureInstalmentsAmount, cVar.futureInstalmentsAmount) && Intrinsics.f(this.currentInstalmentsDueDate, cVar.currentInstalmentsDueDate) && Intrinsics.f(this.lastInstalmentsDueDate, cVar.lastInstalmentsDueDate);
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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Lyn4/z$d;", "", "", "toString", "()Ljava/lang/String;", "Lyn4/z$c;", "a", "Lyn4/z$c;", "b", "()Lyn4/z$c;", "initial", "actual", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("initial")
        @NotNull
        private final c initial;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("actual")
        @NotNull
        private final c actual;

        public d(c initial, c actual) {
            Intrinsics.checkNotNullParameter(initial, "initial");
            Intrinsics.checkNotNullParameter(actual, "actual");
            this.initial = initial;
            this.actual = actual;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final c getActual() {
            return this.actual;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final c getInitial() {
            return this.initial;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.initial, dVar.initial) && Intrinsics.f(this.actual, dVar.actual);
        }

        public final int hashCode() {
            return this.actual.hashCode() + (this.initial.hashCode() * 31);
        }
    }

    public z(String id10, long j2, List transactionIds, int i, int i2, jo3.a principalAmount, jo3.a aVar, LocalDate localDate, jo3.a totalRepaid, jo3.a totalRepayable, jo3.a actualTotalRepayable, jo3.a aVar2, jo3.a aVar3, LocalDate localDate2, LocalDate localDate3, LocalDate localDate4, LocalDate firstMaturingDate, jo3.a aVar4, String str, String str2, String state, a aVar5, jo3.a aVar6, jo3.a remainingTotalAmount, jo3.a aVar7, jo3.a aVar8, jo3.a aVar9, ArrayList documents, r rVar, ArrayList detailSections, ArrayList repaymentMethods, d schedule, boolean z, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
        Intrinsics.checkNotNullParameter(principalAmount, "principalAmount");
        Intrinsics.checkNotNullParameter(totalRepaid, "totalRepaid");
        Intrinsics.checkNotNullParameter(totalRepayable, "totalRepayable");
        Intrinsics.checkNotNullParameter(actualTotalRepayable, "actualTotalRepayable");
        Intrinsics.checkNotNullParameter(firstMaturingDate, "firstMaturingDate");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(remainingTotalAmount, "remainingTotalAmount");
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(detailSections, "detailSections");
        Intrinsics.checkNotNullParameter(repaymentMethods, "repaymentMethods");
        Intrinsics.checkNotNullParameter(schedule, "schedule");
        this.id = id10;
        this.createdAt = j2;
        this.transactionIds = transactionIds;
        this.settledInstalments = i;
        this.term = i2;
        this.principalAmount = principalAmount;
        this.nextDueAmount = aVar;
        this.nextDueDate = localDate;
        this.totalRepaid = totalRepaid;
        this.totalRepayable = totalRepayable;
        this.actualTotalRepayable = actualTotalRepayable;
        this.totalInterest = aVar2;
        this.actualTotalInterest = aVar3;
        this.lastDueDate = localDate2;
        this.actualLastDueDate = localDate3;
        this.planSettleDate = localDate4;
        this.firstMaturingDate = firstMaturingDate;
        this.futureInterest = aVar4;
        this.interestRate = str;
        this.apr = str2;
        this.state = state;
        this.cancellation = aVar5;
        this.accruedInterest = aVar6;
        this.remainingTotalAmount = remainingTotalAmount;
        this.customAmountRepaymentMin = aVar7;
        this.customAmountRepaymentMax = aVar8;
        this.instalmentAmountMin = aVar9;
        this.documents = documents;
        this.aprInfo = rVar;
        this.detailSections = detailSections;
        this.repaymentMethods = repaymentMethods;
        this.schedule = schedule;
        this.cancellable = z;
        this.footer = str3;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final d getSchedule() {
        return this.schedule;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final int getSettledInstalments() {
        return this.settledInstalments;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final int getTerm() {
        return this.term;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final jo3.a getTotalInterest() {
        return this.totalInterest;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final jo3.a getTotalRepaid() {
        return this.totalRepaid;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final jo3.a getTotalRepayable() {
        return this.totalRepayable;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final List getTransactionIds() {
        return this.transactionIds;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAccruedInterest() {
        return this.accruedInterest;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getActualLastDueDate() {
        return this.actualLastDueDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getActualTotalInterest() {
        return this.actualTotalInterest;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getActualTotalRepayable() {
        return this.actualTotalRepayable;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getApr() {
        return this.apr;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.id, zVar.id) && this.createdAt == zVar.createdAt && Intrinsics.f(this.transactionIds, zVar.transactionIds) && this.settledInstalments == zVar.settledInstalments && this.term == zVar.term && Intrinsics.f(this.principalAmount, zVar.principalAmount) && Intrinsics.f(this.nextDueAmount, zVar.nextDueAmount) && Intrinsics.f(this.nextDueDate, zVar.nextDueDate) && Intrinsics.f(this.totalRepaid, zVar.totalRepaid) && Intrinsics.f(this.totalRepayable, zVar.totalRepayable) && Intrinsics.f(this.actualTotalRepayable, zVar.actualTotalRepayable) && Intrinsics.f(this.totalInterest, zVar.totalInterest) && Intrinsics.f(this.actualTotalInterest, zVar.actualTotalInterest) && Intrinsics.f(this.lastDueDate, zVar.lastDueDate) && Intrinsics.f(this.actualLastDueDate, zVar.actualLastDueDate) && Intrinsics.f(this.planSettleDate, zVar.planSettleDate) && Intrinsics.f(this.firstMaturingDate, zVar.firstMaturingDate) && Intrinsics.f(this.futureInterest, zVar.futureInterest) && Intrinsics.f(this.interestRate, zVar.interestRate) && Intrinsics.f(this.apr, zVar.apr) && Intrinsics.f(this.state, zVar.state) && Intrinsics.f(this.cancellation, zVar.cancellation) && Intrinsics.f(this.accruedInterest, zVar.accruedInterest) && Intrinsics.f(this.remainingTotalAmount, zVar.remainingTotalAmount) && Intrinsics.f(this.customAmountRepaymentMin, zVar.customAmountRepaymentMin) && Intrinsics.f(this.customAmountRepaymentMax, zVar.customAmountRepaymentMax) && Intrinsics.f(this.instalmentAmountMin, zVar.instalmentAmountMin) && Intrinsics.f(this.documents, zVar.documents) && Intrinsics.f(this.aprInfo, zVar.aprInfo) && Intrinsics.f(this.detailSections, zVar.detailSections) && Intrinsics.f(this.repaymentMethods, zVar.repaymentMethods) && Intrinsics.f(this.schedule, zVar.schedule) && this.cancellable == zVar.cancellable && Intrinsics.f(this.footer, zVar.footer);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final r getAprInfo() {
        return this.aprInfo;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getCancellable() {
        return this.cancellable;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final a getCancellation() {
        return this.cancellation;
    }

    public final int hashCode() {
        int iJ = v7.j(this.principalAmount, j6.a.b(this.term, j6.a.b(this.settledInstalments, p.a.d(a0.d.c(this.id.hashCode() * 31, 31, this.createdAt), 31, this.transactionIds), 31), 31), 31);
        jo3.a aVar = this.nextDueAmount;
        int iHashCode = (iJ + (aVar == null ? 0 : aVar.hashCode())) * 31;
        LocalDate localDate = this.nextDueDate;
        int iJ2 = v7.j(this.actualTotalRepayable, v7.j(this.totalRepayable, v7.j(this.totalRepaid, (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31, 31), 31), 31);
        jo3.a aVar2 = this.totalInterest;
        int iHashCode2 = (iJ2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        jo3.a aVar3 = this.actualTotalInterest;
        int iHashCode3 = (iHashCode2 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        LocalDate localDate2 = this.lastDueDate;
        int iHashCode4 = (iHashCode3 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        LocalDate localDate3 = this.actualLastDueDate;
        int iHashCode5 = (iHashCode4 + (localDate3 == null ? 0 : localDate3.hashCode())) * 31;
        LocalDate localDate4 = this.planSettleDate;
        int iA = wp5.y.a((iHashCode5 + (localDate4 == null ? 0 : localDate4.hashCode())) * 31, 31, this.firstMaturingDate);
        jo3.a aVar4 = this.futureInterest;
        int iHashCode6 = (iA + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        String str = this.interestRate;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.apr;
        int iC = p.a.c((iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.state);
        a aVar5 = this.cancellation;
        int iHashCode8 = (iC + (aVar5 == null ? 0 : aVar5.hashCode())) * 31;
        jo3.a aVar6 = this.accruedInterest;
        int iJ3 = v7.j(this.remainingTotalAmount, (iHashCode8 + (aVar6 == null ? 0 : aVar6.hashCode())) * 31, 31);
        jo3.a aVar7 = this.customAmountRepaymentMin;
        int iHashCode9 = (iJ3 + (aVar7 == null ? 0 : aVar7.hashCode())) * 31;
        jo3.a aVar8 = this.customAmountRepaymentMax;
        int iHashCode10 = (iHashCode9 + (aVar8 == null ? 0 : aVar8.hashCode())) * 31;
        jo3.a aVar9 = this.instalmentAmountMin;
        int iD = p.a.d((iHashCode10 + (aVar9 == null ? 0 : aVar9.hashCode())) * 31, 31, this.documents);
        r rVar = this.aprInfo;
        int iC2 = j6.a.c((this.schedule.hashCode() + p.a.d(p.a.d((iD + (rVar == null ? 0 : rVar.hashCode())) * 31, 31, this.detailSections), 31, this.repaymentMethods)) * 31, 31, this.cancellable);
        String str3 = this.footer;
        return iC2 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final jo3.a getCustomAmountRepaymentMax() {
        return this.customAmountRepaymentMax;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final jo3.a getCustomAmountRepaymentMin() {
        return this.customAmountRepaymentMin;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final List getDetailSections() {
        return this.detailSections;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final List getDocuments() {
        return this.documents;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final LocalDate getFirstMaturingDate() {
        return this.firstMaturingDate;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final jo3.a getFutureInterest() {
        return this.futureInterest;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final jo3.a getInstalmentAmountMin() {
        return this.instalmentAmountMin;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getInterestRate() {
        return this.interestRate;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final LocalDate getLastDueDate() {
        return this.lastDueDate;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final jo3.a getNextDueAmount() {
        return this.nextDueAmount;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final LocalDate getNextDueDate() {
        return this.nextDueDate;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final LocalDate getPlanSettleDate() {
        return this.planSettleDate;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final jo3.a getPrincipalAmount() {
        return this.principalAmount;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final jo3.a getRemainingTotalAmount() {
        return this.remainingTotalAmount;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final List getRepaymentMethods() {
        return this.repaymentMethods;
    }
}
