package ypj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0003\u0012\u0006\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lypj/a;", "", "", "toString", "()Ljava/lang/String;", "Lypj/a$c;", "a", "Lypj/a$c;", "getWeekly", "()Lypj/a$c;", "weekly", "Lypj/a$a;", "b", "Lypj/a$a;", "getDayInMonth", "()Lypj/a$a;", "dayInMonth", "Lypj/a$b;", "c", "Lypj/a$b;", "getWeekDayInMonth", "()Lypj/a$b;", "weekDayInMonth", "feature_analytics_cycle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("weekly")
    private final c weekly;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("dayInMonth")
    private final C1762a dayInMonth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("weekDayInMonth")
    private final b weekDayInMonth;

    /* JADX INFO: renamed from: ypj.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004¨\u0006\u000f"}, d2 = {"Lypj/a$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Integer;", "getStartDay", "()Ljava/lang/Integer;", "startDay", "b", "Ljava/lang/String;", "getBehaviour", "behaviour", "feature_analytics_cycle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1762a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("startDay")
        private final Integer startDay;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("behaviour")
        private final String behaviour;

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1762a)) {
                return false;
            }
            C1762a c1762a = (C1762a) obj2;
            return Intrinsics.f(this.startDay, c1762a.startDay) && Intrinsics.f(this.behaviour, c1762a.behaviour);
        }

        public final int hashCode() {
            Integer num = this.startDay;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.behaviour;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\f"}, d2 = {"Lypj/a$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getWeekDay", "weekDay", "b", "getBehaviour", "behaviour", "feature_analytics_cycle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("weekDay")
        private final String weekDay;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("behaviour")
        private final String behaviour;

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
            String str = this.weekDay;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.behaviour;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004¨\u0006\t"}, d2 = {"Lypj/a$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getWeekDay", "weekDay", "feature_analytics_cycle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("weekDay")
        private final String weekDay;

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && Intrinsics.f(this.weekDay, ((c) obj2).weekDay);
        }

        public final int hashCode() {
            String str = this.weekDay;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.weekly, aVar.weekly) && Intrinsics.f(this.dayInMonth, aVar.dayInMonth) && Intrinsics.f(this.weekDayInMonth, aVar.weekDayInMonth);
    }

    public final int hashCode() {
        c cVar = this.weekly;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        C1762a c1762a = this.dayInMonth;
        int iHashCode2 = (iHashCode + (c1762a == null ? 0 : c1762a.hashCode())) * 31;
        b bVar = this.weekDayInMonth;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }
}
