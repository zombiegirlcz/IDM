package iwi;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\t\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Liwi/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "type", "b", "text", "Liwi/e$b;", "Liwi/e$b;", "()Liwi/e$b;", "schedule", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("text")
    private final String text;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("schedule")
    private final b schedule;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Liwi/e$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "open", "close", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("open")
        @NotNull
        private final String open;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("close")
        @NotNull
        private final String close;

        public a(String open, String close) {
            Intrinsics.checkNotNullParameter(open, "open");
            Intrinsics.checkNotNullParameter(close, "close");
            this.open = open;
            this.close = close;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getClose() {
            return this.close;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getOpen() {
            return this.open;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.open, aVar.open) && Intrinsics.f(this.close, aVar.close);
        }

        public final int hashCode() {
            return this.close.hashCode() + (this.open.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\f\u0010\nR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\nR\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u0012\u0010\nR\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0007\u0010\nR\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\u000e\u0010\nR\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\u0011\u0010\n¨\u0006\u0017"}, d2 = {"Liwi/e$b;", "", "", "toString", "()Ljava/lang/String;", "", "Liwi/e$a;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "monday", "f", "tuesday", "c", "g", "wednesday", "d", "e", "thursday", "friday", "saturday", "sunday", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("monday")
        private final List<a> monday;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("tuesday")
        private final List<a> tuesday;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("wednesday")
        private final List<a> wednesday;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("thursday")
        private final List<a> thursday;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("friday")
        private final List<a> friday;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("saturday")
        private final List<a> saturday;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("sunday")
        private final List<a> sunday;

        public b(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7) {
            this.monday = arrayList;
            this.tuesday = arrayList2;
            this.wednesday = arrayList3;
            this.thursday = arrayList4;
            this.friday = arrayList5;
            this.saturday = arrayList6;
            this.sunday = arrayList7;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getFriday() {
            return this.friday;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final List getMonday() {
            return this.monday;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final List getSaturday() {
            return this.saturday;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final List getSunday() {
            return this.sunday;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final List getThursday() {
            return this.thursday;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.monday, bVar.monday) && Intrinsics.f(this.tuesday, bVar.tuesday) && Intrinsics.f(this.wednesday, bVar.wednesday) && Intrinsics.f(this.thursday, bVar.thursday) && Intrinsics.f(this.friday, bVar.friday) && Intrinsics.f(this.saturday, bVar.saturday) && Intrinsics.f(this.sunday, bVar.sunday);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final List getTuesday() {
            return this.tuesday;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final List getWednesday() {
            return this.wednesday;
        }

        public final int hashCode() {
            List<a> list = this.monday;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<a> list2 = this.tuesday;
            int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<a> list3 = this.wednesday;
            int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
            List<a> list4 = this.thursday;
            int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
            List<a> list5 = this.friday;
            int iHashCode5 = (iHashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
            List<a> list6 = this.saturday;
            int iHashCode6 = (iHashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
            List<a> list7 = this.sunday;
            return iHashCode6 + (list7 != null ? list7.hashCode() : 0);
        }
    }

    public e(String type, String str, b bVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.text = str;
        this.schedule = bVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getSchedule() {
        return this.schedule;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.type, eVar.type) && Intrinsics.f(this.text, eVar.text) && Intrinsics.f(this.schedule, eVar.schedule);
    }

    public final int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.text;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        b bVar = this.schedule;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }
}
