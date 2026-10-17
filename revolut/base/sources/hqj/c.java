package hqj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0003\b\u0006\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\f\u0010\u0012¨\u0006\u0014"}, d2 = {"Lhqj/c;", "", "", "toString", "()Ljava/lang/String;", "Lhqj/c$c;", "a", "Lhqj/c$c;", "c", "()Lhqj/c$c;", "weekly", "Lhqj/c$a;", "b", "Lhqj/c$a;", "()Lhqj/c$a;", "dayInMonth", "Lhqj/c$b;", "Lhqj/c$b;", "()Lhqj/c$b;", "weekdayInMonth", "feature_analytics_cycle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("weekly")
    private final C0883c weekly;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("dayInMonth")
    private final a dayInMonth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("weekDayInMonth")
    private final b weekdayInMonth;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0006\u0010\u0004¨\u0006\r"}, d2 = {"Lhqj/c$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "b", "()I", "startDay", "Ljava/lang/String;", "behaviour", "feature_analytics_cycle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("startDay")
        private final int startDay;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("behaviour")
        @NotNull
        private final String behaviour;

        public a(int i, String behaviour) {
            Intrinsics.checkNotNullParameter(behaviour, "behaviour");
            this.startDay = i;
            this.behaviour = behaviour;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBehaviour() {
            return this.behaviour;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getStartDay() {
            return this.startDay;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return this.startDay == aVar.startDay && Intrinsics.f(this.behaviour, aVar.behaviour);
        }

        public final int hashCode() {
            return this.behaviour.hashCode() + (Integer.hashCode(this.startDay) * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lhqj/c$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "weekDay", "behaviour", "feature_analytics_cycle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("weekDay")
        @NotNull
        private final String weekDay;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("behaviour")
        @NotNull
        private final String behaviour;

        public b(String weekDay, String behaviour) {
            Intrinsics.checkNotNullParameter(weekDay, "weekDay");
            Intrinsics.checkNotNullParameter(behaviour, "behaviour");
            this.weekDay = weekDay;
            this.behaviour = behaviour;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBehaviour() {
            return this.behaviour;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getWeekDay() {
            return this.weekDay;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.weekDay, bVar.weekDay) && Intrinsics.f(this.behaviour, bVar.behaviour);
        }

        public final int hashCode() {
            return this.behaviour.hashCode() + (this.weekDay.hashCode() * 31);
        }
    }

    /* JADX INFO: renamed from: hqj.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lhqj/c$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "weekDay", "feature_analytics_cycle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C0883c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("weekDay")
        @NotNull
        private final String weekDay;

        public C0883c(String weekDay) {
            Intrinsics.checkNotNullParameter(weekDay, "weekDay");
            this.weekDay = weekDay;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getWeekDay() {
            return this.weekDay;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof C0883c) && Intrinsics.f(this.weekDay, ((C0883c) obj2).weekDay);
        }

        public final int hashCode() {
            return this.weekDay.hashCode();
        }
    }

    public c(C0883c c0883c, a aVar, b bVar) {
        this.weekly = c0883c;
        this.dayInMonth = aVar;
        this.weekdayInMonth = bVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getDayInMonth() {
        return this.dayInMonth;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getWeekdayInMonth() {
        return this.weekdayInMonth;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C0883c getWeekly() {
        return this.weekly;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.weekly, cVar.weekly) && Intrinsics.f(this.dayInMonth, cVar.dayInMonth) && Intrinsics.f(this.weekdayInMonth, cVar.weekdayInMonth);
    }

    public final int hashCode() {
        C0883c c0883c = this.weekly;
        int iHashCode = (c0883c == null ? 0 : c0883c.hashCode()) * 31;
        a aVar = this.dayInMonth;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.weekdayInMonth;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }
}
