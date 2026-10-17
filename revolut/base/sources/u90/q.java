package u90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.DayPickerItem;
import com.revolut.feature.backend_flow.domain.models.MonthPickerItem;
import com.revolut.feature.backend_flow.domain.models.YearPickerItem;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f278327a;

    public q(t90.j dateMapper, char c2) {
        Intrinsics.checkNotNullParameter(dateMapper, "dateMapper");
    }

    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        LocalDate localDateB;
        LocalDate localDateB2;
        LocalDate localDateB3;
        LocalDate localDateB4;
        String value;
        LocalDate localDateB5;
        switch (this.f278327a) {
            case 0:
                q90.e0 item = (q90.e0) vVar;
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(previousElements, "previousElements");
                String id10 = item.getId();
                boolean required = item.getRequired();
                q90.y0 value2 = item.getValue();
                if (value2 != null) {
                    Intrinsics.checkNotNullParameter(value2, "value");
                    localDateB = t90.j.b(value2.getValue());
                } else {
                    localDateB = null;
                }
                LocalDate localDateB6 = t90.j.b(item.getPresentedDate());
                String minSelectableDate = item.getMinSelectableDate();
                LocalDate localDateB7 = minSelectableDate != null ? t90.j.b(minSelectableDate) : null;
                String maxSelectableDate = item.getMaxSelectableDate();
                return new DayPickerItem(id10, required, localDateB6, localDateB, localDateB7, maxSelectableDate != null ? t90.j.b(maxSelectableDate) : null);
            case 1:
                q90.e0 item2 = (q90.e0) vVar;
                Intrinsics.checkNotNullParameter(item2, "item");
                Intrinsics.checkNotNullParameter(previousElements, "previousElements");
                String id11 = item2.getId();
                boolean required2 = item2.getRequired();
                q90.y0 value3 = item2.getValue();
                if (value3 != null) {
                    Intrinsics.checkNotNullParameter(value3, "value");
                    localDateB2 = t90.j.b(value3.getValue());
                } else {
                    localDateB2 = null;
                }
                int year = t90.j.b(item2.getPresentedDate()).getYear();
                String minSelectableDate2 = item2.getMinSelectableDate();
                LocalDate localDateB8 = minSelectableDate2 != null ? t90.j.b(minSelectableDate2) : null;
                String maxSelectableDate2 = item2.getMaxSelectableDate();
                return new MonthPickerItem(id11, required2, year, localDateB2, localDateB8, maxSelectableDate2 != null ? t90.j.b(maxSelectableDate2) : null);
            default:
                q90.e0 item3 = (q90.e0) vVar;
                Intrinsics.checkNotNullParameter(item3, "item");
                Intrinsics.checkNotNullParameter(previousElements, "previousElements");
                String id12 = item3.getId();
                boolean required3 = item3.getRequired();
                int year2 = t90.j.b(item3.getPresentedDate()).getYear();
                q90.y0 value4 = item3.getValue();
                Integer numValueOf = null;
                Integer numValueOf2 = (value4 == null || (value = value4.getValue()) == null || (localDateB5 = t90.j.b(value)) == null) ? null : Integer.valueOf(localDateB5.getYear());
                String minSelectableDate3 = item3.getMinSelectableDate();
                Integer numValueOf3 = (minSelectableDate3 == null || (localDateB4 = t90.j.b(minSelectableDate3)) == null) ? null : Integer.valueOf(localDateB4.getYear());
                String maxSelectableDate3 = item3.getMaxSelectableDate();
                if (maxSelectableDate3 != null && (localDateB3 = t90.j.b(maxSelectableDate3)) != null) {
                    numValueOf = Integer.valueOf(localDateB3.getYear());
                }
                return new YearPickerItem(id12, required3, year2, numValueOf2, numValueOf3, numValueOf);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    @Override // u90.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final q90.v b(com.revolut.feature.backend_flow.domain.models.BackendItem r10) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u90.q.b(com.revolut.feature.backend_flow.domain.models.BackendItem):q90.v");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(t90.j dateMapper, int i) {
        this(dateMapper, (char) 0);
        this.f278327a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(dateMapper, "dateMapper");
                this(dateMapper, (char) 0);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(dateMapper, "dateMapper");
                this(dateMapper, (char) 0);
                break;
            default:
                Intrinsics.checkNotNullParameter(dateMapper, "dateMapper");
                break;
        }
    }
}
