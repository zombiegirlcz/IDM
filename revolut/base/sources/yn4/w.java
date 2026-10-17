package yn4;

import ip0.v7;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0006\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0017\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u000f¨\u0006\u0018"}, d2 = {"Lyn4/w;", "", "", "toString", "()Ljava/lang/String;", "Lyn4/w$a;", "a", "Lyn4/w$a;", "d", "()Lyn4/w$a;", "repaidInstalmentsDetails", "Ljo3/a;", "b", "Ljo3/a;", "e", "()Ljo3/a;", "savedInterest", "", "c", "I", "()I", "instalmentsLeft", "previousRegularAmount", "previousLastAmount", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("repaidInstalmentsDetails")
    private final a repaidInstalmentsDetails;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("savedInterest")
    private final jo3.a savedInterest;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("instalmentsLeft")
    private final int instalmentsLeft;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("previousRegularAmount")
    @NotNull
    private final jo3.a previousRegularAmount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("previousLastAmount")
    @NotNull
    private final jo3.a previousLastAmount;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u001a\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u0006\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001c"}, d2 = {"Lyn4/w$a;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "g", "()Ljo3/a;", "regularAmount", "b", "c", "lastAmount", "Ljava/time/LocalDate;", "Ljava/time/LocalDate;", "f", "()Ljava/time/LocalDate;", "nextMaturingDate", "d", "e", "lastMaturingDate", "instalmentAmountDifference", "Lyn4/m;", "Lyn4/m;", "()Lyn4/m;", "firstAmountBreakdown", "lastAmountBreakdown", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("regularAmount")
        @NotNull
        private final jo3.a regularAmount;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("lastAmount")
        @NotNull
        private final jo3.a lastAmount;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("nextMaturingDate")
        @NotNull
        private final LocalDate nextMaturingDate;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("lastMaturingDate")
        @NotNull
        private final LocalDate lastMaturingDate;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("instalmentAmountDifference")
        @NotNull
        private final jo3.a instalmentAmountDifference;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("firstAmountBreakdown")
        @NotNull
        private final m firstAmountBreakdown;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("lastAmountBreakdown")
        @NotNull
        private final m lastAmountBreakdown;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final m getFirstAmountBreakdown() {
            return this.firstAmountBreakdown;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final jo3.a getInstalmentAmountDifference() {
            return this.instalmentAmountDifference;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final jo3.a getLastAmount() {
            return this.lastAmount;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final m getLastAmountBreakdown() {
            return this.lastAmountBreakdown;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final LocalDate getLastMaturingDate() {
            return this.lastMaturingDate;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.regularAmount, aVar.regularAmount) && Intrinsics.f(this.lastAmount, aVar.lastAmount) && Intrinsics.f(this.nextMaturingDate, aVar.nextMaturingDate) && Intrinsics.f(this.lastMaturingDate, aVar.lastMaturingDate) && Intrinsics.f(this.instalmentAmountDifference, aVar.instalmentAmountDifference) && Intrinsics.f(this.firstAmountBreakdown, aVar.firstAmountBreakdown) && Intrinsics.f(this.lastAmountBreakdown, aVar.lastAmountBreakdown);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final LocalDate getNextMaturingDate() {
            return this.nextMaturingDate;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final jo3.a getRegularAmount() {
            return this.regularAmount;
        }

        public final int hashCode() {
            return this.lastAmountBreakdown.hashCode() + ((this.firstAmountBreakdown.hashCode() + v7.j(this.instalmentAmountDifference, wp5.y.a(wp5.y.a(v7.j(this.lastAmount, this.regularAmount.hashCode() * 31, 31), 31, this.nextMaturingDate), 31, this.lastMaturingDate), 31)) * 31);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getInstalmentsLeft() {
        return this.instalmentsLeft;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getPreviousLastAmount() {
        return this.previousLastAmount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getPreviousRegularAmount() {
        return this.previousRegularAmount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final a getRepaidInstalmentsDetails() {
        return this.repaidInstalmentsDetails;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getSavedInterest() {
        return this.savedInterest;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.repaidInstalmentsDetails, wVar.repaidInstalmentsDetails) && Intrinsics.f(this.savedInterest, wVar.savedInterest) && this.instalmentsLeft == wVar.instalmentsLeft && Intrinsics.f(this.previousRegularAmount, wVar.previousRegularAmount) && Intrinsics.f(this.previousLastAmount, wVar.previousLastAmount);
    }

    public final int hashCode() {
        a aVar = this.repaidInstalmentsDetails;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        jo3.a aVar2 = this.savedInterest;
        return this.previousLastAmount.hashCode() + v7.j(this.previousRegularAmount, j6.a.b(this.instalmentsLeft, (iHashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31, 31), 31);
    }
}
