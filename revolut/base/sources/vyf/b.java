package vyf;

import com.revolut.feature.travel.experiences.models.TravelExperienceCancellationCondition;
import com.revolut.feature.travel.experiences.models.TravelExperienceCancellationPolicy;
import com.revolut.feature.travel.experiences.models.TravelExperienceCancellationWindow;
import java.util.ArrayList;
import java.util.List;
import jzf.c;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.joda.time.Period;
import org.joda.time.format.ISOPeriodFormat;
import qzf.r;
import qzf.s;
import rzf.i;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public abstract class b {
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Map] */
    public static final TravelExperienceCancellationPolicy.Experience a(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        boolean refundable = cVar.getRefundable();
        boolean freeCancellation = cVar.getFreeCancellation();
        List<jzf.a> cancellationConditions = cVar.getCancellationConditions();
        ArrayList arrayList = new ArrayList(w.t(cancellationConditions, 10));
        for (jzf.a aVar : cancellationConditions) {
            Object obj2 = a.f293317a;
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            arrayList.add(new TravelExperienceCancellationCondition((x3g.a) u1.u(aVar.getType(), a.f293317a), aVar.getDescription()));
        }
        List<i> cancellationWindows = cVar.getCancellationWindows();
        ArrayList arrayList2 = new ArrayList(w.t(cancellationWindows, 10));
        for (i iVar : cancellationWindows) {
            Intrinsics.checkNotNullParameter(iVar, "<this>");
            arrayList2.add(new TravelExperienceCancellationWindow.Experience(new Period(iVar.getFromTimeBefore()), new Period(iVar.getToTimeBefore()), iVar.getPercentageRefundable()));
        }
        return new TravelExperienceCancellationPolicy.Experience(refundable, freeCancellation, arrayList, arrayList2);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Map] */
    public static final TravelExperienceCancellationPolicy.Experience b(r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        boolean refundable = rVar.getRefundable();
        boolean freeCancellation = rVar.getFreeCancellation();
        List<izf.a> cancellationConditions = rVar.getCancellationConditions();
        ArrayList arrayList = new ArrayList(w.t(cancellationConditions, 10));
        for (izf.a aVar : cancellationConditions) {
            Object obj2 = a.f293317a;
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            arrayList.add(new TravelExperienceCancellationCondition((x3g.a) u1.u(aVar.getType(), a.f293317a), aVar.getDescription()));
        }
        List<s> cancellationWindows = rVar.getCancellationWindows();
        ArrayList arrayList2 = new ArrayList(w.t(cancellationWindows, 10));
        for (s sVar : cancellationWindows) {
            Intrinsics.checkNotNullParameter(sVar, "<this>");
            arrayList2.add(new TravelExperienceCancellationWindow.Experience(new Period(sVar.getFromTimeBefore()), new Period(sVar.getToTimeBefore()), sVar.getPercentageRefundable()));
        }
        return new TravelExperienceCancellationPolicy.Experience(refundable, freeCancellation, arrayList, arrayList2);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.Map] */
    public static final c c(TravelExperienceCancellationPolicy.Experience experience) {
        Intrinsics.checkNotNullParameter(experience, "<this>");
        boolean z = experience.f93182a;
        boolean z3 = experience.f93183b;
        ArrayList<TravelExperienceCancellationCondition> arrayList = experience.f93184c;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (TravelExperienceCancellationCondition travelExperienceCancellationCondition : arrayList) {
            Object obj2 = a.f293317a;
            Intrinsics.checkNotNullParameter(travelExperienceCancellationCondition, "<this>");
            arrayList2.add(new jzf.a(u1.g(travelExperienceCancellationCondition.f93177a, a.f293317a), travelExperienceCancellationCondition.f93178b));
        }
        ArrayList<TravelExperienceCancellationWindow.Experience> arrayList3 = experience.d;
        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
        for (TravelExperienceCancellationWindow.Experience experience2 : arrayList3) {
            Intrinsics.checkNotNullParameter(experience2, "<this>");
            Period period = experience2.f93188a;
            String string = period != null ? period.toString(ISOPeriodFormat.standard()) : null;
            String string2 = experience2.f93189b.toString(ISOPeriodFormat.standard());
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            arrayList4.add(new i(string, string2, experience2.f93190c));
        }
        return new c(z, z3, arrayList2, arrayList4);
    }
}
