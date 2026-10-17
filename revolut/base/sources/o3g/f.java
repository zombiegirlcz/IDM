package o3g;

import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vim.e f221807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f221808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f221809c;
    public final DateTime d;
    public final TravelExperienceDatesSelection e;
    public final List f;

    public f(vim.e calendarDatesRange, DateTime firstSelectableDate, DateTime lastSelectableDate, DateTime currentDate, TravelExperienceDatesSelection datesSelection, List list) {
        Intrinsics.checkNotNullParameter(calendarDatesRange, "calendarDatesRange");
        Intrinsics.checkNotNullParameter(firstSelectableDate, "firstSelectableDate");
        Intrinsics.checkNotNullParameter(lastSelectableDate, "lastSelectableDate");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
        this.f221807a = calendarDatesRange;
        this.f221808b = firstSelectableDate;
        this.f221809c = lastSelectableDate;
        this.d = currentDate;
        this.e = datesSelection;
        this.f = list;
    }

    public static f a(f fVar, TravelExperienceDatesSelection datesSelection) {
        vim.e calendarDatesRange = fVar.f221807a;
        DateTime firstSelectableDate = fVar.f221808b;
        DateTime lastSelectableDate = fVar.f221809c;
        DateTime currentDate = fVar.d;
        List list = fVar.f;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(calendarDatesRange, "calendarDatesRange");
        Intrinsics.checkNotNullParameter(firstSelectableDate, "firstSelectableDate");
        Intrinsics.checkNotNullParameter(lastSelectableDate, "lastSelectableDate");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
        return new f(calendarDatesRange, firstSelectableDate, lastSelectableDate, currentDate, datesSelection, list);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f221807a.equals(fVar.f221807a) && Intrinsics.f(this.f221808b, fVar.f221808b) && Intrinsics.f(this.f221809c, fVar.f221809c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + m72.b.f(this.d, m72.b.f(this.f221809c, m72.b.f(this.f221808b, this.f221807a.hashCode() * 31, 31), 31), 31)) * 31;
        List list = this.f;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }
}
