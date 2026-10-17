package a15;

import com.revolut.feature.giro.impl.ui.form.domain.FormState;
import com.revolut.feature.masav.impl.model.DirectDebitData;
import com.revolut.shared.feature.user_declarations.api.models.DateOfBirthScreenConfig;
import java.time.Instant;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Iterator;
import java.util.List;
import jck.i0;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ms0.l0;
import org.jmrtd.PassportService;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocalDate f540b;

    public /* synthetic */ l(int i, LocalDate localDate) {
        this.f539a = i;
        this.f540b = localDate;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        LocalDate localDateWithYear;
        LocalDate localDate;
        int i = this.f539a;
        Object obj3 = null;
        LocalDate selectedDate = this.f540b;
        switch (i) {
            case 0:
                h update = (h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return h.a(update, selectedDate, null, 5);
            case 1:
                Instant it8 = (Instant) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(oi0.d.W(it8).compareTo((ChronoLocalDate) selectedDate) >= 0);
            case 2:
                b77.h update2 = (b77.h) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return b77.h.a(update2, FormState.a(update2.f12923b, null, null, null, this.f540b, null, 23), null, 5);
            case 3:
                b77.h update3 = (b77.h) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return b77.h.a(update3, FormState.a(update3.f12923b, null, null, this.f540b, null, null, 27), null, 5);
            case 4:
                DirectDebitData updateDirectDebitData = (DirectDebitData) obj2;
                Intrinsics.checkNotNullParameter(updateDirectDebitData, "$this$updateDirectDebitData");
                return DirectDebitData.a(updateDirectDebitData, null, null, this.f540b, null, 23);
            case 5:
                return djc.i.a((djc.i) obj2, null, null, null, null, this.f540b, null, false, PassportService.DEFAULT_MAX_BLOCKSIZE);
            case 6:
                ehg.d update4 = (ehg.d) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                update4.getClass();
                Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
                return new ehg.d(selectedDate);
            case 7:
                gvl.j update5 = (gvl.j) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return gvl.j.a(update5, selectedDate, null, 126);
            case 8:
                hk6.e update6 = (hk6.e) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return new hk6.e(selectedDate, update6.f152852a);
            case 9:
                hp2.f update7 = (hp2.f) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return hp2.f.a(update7, selectedDate, null, 5);
            case 10:
                hp3.m update8 = (hp3.m) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                return hp3.m.a(update8, this.f540b, null, null, false, null, null, null, null, false, false, null, null, 32254);
            case 11:
                hp3.l page = (hp3.l) obj2;
                Intrinsics.checkNotNullParameter(page, "page");
                List list = (List) page.f154412c.getContent();
                if (list == null) {
                    return null;
                }
                Iterator it9 = list.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        Object next = it9.next();
                        if (!((kp3.b) next).a().f().isBefore(selectedDate)) {
                            obj3 = next;
                        }
                    }
                }
                return (kp3.b) obj3;
            case 12:
                j68.e update9 = (j68.e) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                return j68.e.a(update9, selectedDate, null, null, 13);
            case 13:
                zm3.l contact = (zm3.l) obj2;
                Intrinsics.checkNotNullParameter(contact, "contact");
                Intrinsics.checkNotNullParameter(contact, "<this>");
                Intrinsics.checkNotNullParameter(selectedDate, "currentDate");
                LocalDate localDateC = contact.c();
                if (localDateC == null) {
                    localDateWithYear = null;
                } else {
                    int year = selectedDate.getYear();
                    int i2 = year + 1;
                    localDateWithYear = localDateC.withYear(year);
                    if (localDateWithYear.compareTo((ChronoLocalDate) selectedDate) < 0) {
                        localDateWithYear = localDateC.withYear(i2);
                    }
                }
                if (localDateWithYear != null) {
                    return new Pair(contact, localDateWithYear);
                }
                return null;
            case 14:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                zm3.l lVar = (zm3.l) pair.f186385a;
                LocalDate localDate2 = (LocalDate) pair.f186386b;
                return new i0(lVar, localDate2, (int) oc.c.h(selectedDate, localDate2));
            case 15:
                lzi.p snapshot = (lzi.p) obj2;
                Intrinsics.checkNotNullParameter(snapshot, "snapshot");
                if (!selectedDate.isBefore(snapshot.f200995a) && ((localDate = snapshot.f200996b) == null || selectedDate.isBefore(localDate))) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 16:
                jpd.a update10 = (jpd.a) obj2;
                Intrinsics.checkNotNullParameter(update10, "$this$update");
                LocalDate localDate3 = update10.f177260c;
                LocalDate localDate4 = update10.d;
                Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
                Intrinsics.checkNotNullParameter(selectedDate, "displayedMonth");
                return new jpd.a(selectedDate, selectedDate, localDate3, localDate4);
            case 17:
                LocalDate day = (LocalDate) obj2;
                int i3 = l0.E;
                Intrinsics.checkNotNullParameter(day, "day");
                LocalDate localDatePlusDays = day.plusDays(1L);
                if (localDatePlusDays.compareTo((ChronoLocalDate) selectedDate) <= 0) {
                    return localDatePlusDays;
                }
                return null;
            case 18:
                com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b update11 = (com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b) obj2;
                Intrinsics.checkNotNullParameter(update11, "$this$update");
                return com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b.a(update11, null, null, this.f540b, null, null, null, null, null, false, null, null, false, null, 8187);
            case 19:
                nn7.e update12 = (nn7.e) obj2;
                Intrinsics.checkNotNullParameter(update12, "$this$update");
                Comparable start = update12.f217474b.getStart();
                vim.d dVar = update12.f217474b;
                vim.e selectedDates = !Intrinsics.f(start, dVar.b()) ? vim.i.b(selectedDate, selectedDate) : selectedDate.compareTo((ChronoLocalDate) dVar.getStart()) > 0 ? vim.i.b(dVar.getStart(), selectedDate) : vim.i.b(selectedDate, dVar.getStart());
                vim.d availableDates = update12.f217473a;
                LocalDate currentDate = update12.f217475c;
                Intrinsics.checkNotNullParameter(availableDates, "availableDates");
                Intrinsics.checkNotNullParameter(selectedDates, "selectedDates");
                Intrinsics.checkNotNullParameter(currentDate, "currentDate");
                return new nn7.e(availableDates, selectedDates, currentDate);
            case 20:
                nv4.i update13 = (nv4.i) obj2;
                Intrinsics.checkNotNullParameter(update13, "$this$update");
                return nv4.i.a(update13, this.f540b, null, null, null, 30);
            case 21:
                LocalDate it10 = (LocalDate) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(!it10.isAfter(selectedDate));
            case 22:
                o74.f update14 = (o74.f) obj2;
                Intrinsics.checkNotNullParameter(update14, "$this$update");
                return o74.f.a(update14, selectedDate, null, 2);
            case 23:
                LocalDate date = (LocalDate) obj2;
                Intrinsics.checkNotNullParameter(date, "date");
                if (date.isBefore(selectedDate)) {
                    return date.plusDays(1L);
                }
                return null;
            case 24:
                LocalDate localDate5 = this.f540b;
                Intrinsics.h(localDate5);
                return pdg.m.a((pdg.m) obj2, null, null, null, null, null, null, localDate5, null, null, false, 8063);
            case 25:
                LocalDate localDate6 = this.f540b;
                Intrinsics.h(localDate6);
                return pdg.m.a((pdg.m) obj2, null, null, null, null, null, null, null, localDate6, null, false, 7935);
            case 26:
                ro2.h update15 = (ro2.h) obj2;
                Intrinsics.checkNotNullParameter(update15, "$this$update");
                return ro2.h.a(update15, selectedDate, null, 5);
            case 27:
                rwf.d update16 = (rwf.d) obj2;
                Intrinsics.checkNotNullParameter(update16, "$this$update");
                String title = update16.f257897a;
                Intrinsics.checkNotNullParameter(title, "title");
                return new rwf.d(title, selectedDate);
            case 28:
                s39.d update17 = (s39.d) obj2;
                Intrinsics.checkNotNullParameter(update17, "$this$update");
                String title2 = update17.f259477a;
                Intrinsics.checkNotNullParameter(title2, "title");
                return new s39.d(title2, selectedDate);
            default:
                sng.d update18 = (sng.d) obj2;
                Intrinsics.checkNotNullParameter(update18, "$this$update");
                DateOfBirthScreenConfig screenConfig = update18.f264609b;
                Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
                return new sng.d(selectedDate, screenConfig);
        }
    }
}
