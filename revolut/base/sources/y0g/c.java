package y0g;

import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import rd0.d;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements xii.b {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hyf.a f310213a;

    public c(hyf.a experiencesFeatureInteractor) {
        Intrinsics.checkNotNullParameter(experiencesFeatureInteractor, "experiencesFeatureInteractor");
        this.f310213a = experiencesFeatureInteractor;
    }

    public static TravelExperienceDatesSelection b(a aVar) {
        DateTime dateTime;
        String strA = aVar.a("startDate");
        DateTime dateTime2 = null;
        if (strA != null) {
            try {
                dateTime = DateTime.parse(strA);
            } catch (IllegalArgumentException e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                d.a(rd0.c.ERROR, null, null, e, h0Var);
                dateTime = null;
            }
        } else {
            dateTime = null;
        }
        String strA2 = aVar.a("endDate");
        if (strA2 != null) {
            try {
                dateTime2 = DateTime.parse(strA2);
            } catch (IllegalArgumentException e2) {
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = d.f253311a;
                d.a(rd0.c.ERROR, null, null, e2, h0Var2);
            }
        }
        return (dateTime == null || dateTime2 == null) ? dateTime != null ? new TravelExperienceDatesSelection.SingleDateSelection(dateTime) : TravelExperienceDatesSelection.NoDatesSelection.f92906a : new TravelExperienceDatesSelection.RangeDateSelection(dateTime, dateTime2);
    }

    @Override // xii.b
    public final Set a() {
        String[] elements = {"experiences", "experiences/details/{experienceId}", "experiences/booking/{bookingId}", "experiences/search", "experiences/discovery"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6  */
    @Override // xii.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.kompot.common.ParcelableDestination e(lg0.e r7) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y0g.c.e(lg0.e):com.revolut.kompot.common.ParcelableDestination");
    }
}
