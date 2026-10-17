package ro4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0006\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0006\u0010\u0017¨\u0006\u0019"}, d2 = {"Lro4/c;", "Lro4/d;", "", "toString", "()Ljava/lang/String;", "", "a", "I", "b", "()I", "day", "", "Lro4/c$a;", "Ljava/util/List;", "c", "()Ljava/util/List;", "dueDateSelections", "Lro4/c$b;", "Lro4/c$b;", "d", "()Lro4/c$b;", "ineligibilityReason", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "cooldownPeriodMonths", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("day")
    private final int day;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("dueDateSelections")
    @NotNull
    private final List<a> dueDateSelections;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("ineligibilityReason")
    private final b ineligibilityReason;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("cooldownPeriodMonths")
    private final Integer cooldownPeriodMonths;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\rR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000f\u0010\r¨\u0006\u0011"}, d2 = {"Lro4/c$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "b", "()I", "day", "Ljava/time/LocalDate;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "currentDueDate", "c", "nextDueDate", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("day")
        private final int day;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("currentDueDate")
        @NotNull
        private final LocalDate currentDueDate;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("nextDueDate")
        @NotNull
        private final LocalDate nextDueDate;

        public a(int i, LocalDate currentDueDate, LocalDate nextDueDate) {
            Intrinsics.checkNotNullParameter(currentDueDate, "currentDueDate");
            Intrinsics.checkNotNullParameter(nextDueDate, "nextDueDate");
            this.day = i;
            this.currentDueDate = currentDueDate;
            this.nextDueDate = nextDueDate;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDate getCurrentDueDate() {
            return this.currentDueDate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getDay() {
            return this.day;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final LocalDate getNextDueDate() {
            return this.nextDueDate;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return this.day == aVar.day && Intrinsics.f(this.currentDueDate, aVar.currentDueDate) && Intrinsics.f(this.nextDueDate, aVar.nextDueDate);
        }

        public final int hashCode() {
            return this.nextDueDate.hashCode() + y.a(Integer.hashCode(this.day) * 31, 31, this.currentDueDate);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lro4/c$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "title", "b", "description", "Lro4/b;", "Lro4/b;", "()Lro4/b;", "button", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("description")
        @NotNull
        private final String description;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("button")
        @NotNull
        private final ro4.b button;

        public b(String title, String description, ro4.b button) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(button, "button");
            this.title = title;
            this.description = description;
            this.button = button;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ro4.b getButton() {
            return this.button;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.title, bVar.title) && Intrinsics.f(this.description, bVar.description) && Intrinsics.f(this.button, bVar.button);
        }

        public final int hashCode() {
            return this.button.hashCode() + p.a.c(this.title.hashCode() * 31, 31, this.description);
        }
    }

    public c(int i, ArrayList dueDateSelections, b bVar, Integer num) {
        Intrinsics.checkNotNullParameter(dueDateSelections, "dueDateSelections");
        this.day = i;
        this.dueDateSelections = dueDateSelections;
        this.ineligibilityReason = bVar;
        this.cooldownPeriodMonths = num;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getCooldownPeriodMonths() {
        return this.cooldownPeriodMonths;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getDay() {
        return this.day;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getDueDateSelections() {
        return this.dueDateSelections;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getIneligibilityReason() {
        return this.ineligibilityReason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.day == cVar.day && Intrinsics.f(this.dueDateSelections, cVar.dueDateSelections) && Intrinsics.f(this.ineligibilityReason, cVar.ineligibilityReason) && Intrinsics.f(this.cooldownPeriodMonths, cVar.cooldownPeriodMonths);
    }

    public final int hashCode() {
        int iD = p.a.d(Integer.hashCode(this.day) * 31, 31, this.dueDateSelections);
        b bVar = this.ineligibilityReason;
        int iHashCode = (iD + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Integer num = this.cooldownPeriodMonths;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }
}
