package w50;

import com.revolut.chat.domain.model.TranscriptDateRange;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.a0;
import zhm.d0;
import zhm.m0;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f294661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f294662b;

    public j(List availableDateRanges) {
        Intrinsics.checkNotNullParameter(availableDateRanges, "availableDateRanges");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = availableDateRanges.iterator();
        while (it8.hasNext()) {
            TranscriptDateRange transcriptDateRange = (TranscriptDateRange) it8.next();
            kotlin.ranges.e eVar = new kotlin.ranges.e(0L, ChronoUnit.DAYS.between(transcriptDateRange.f51076a, transcriptDateRange.f51077b));
            ArrayList arrayList2 = new ArrayList(w.t(eVar, 10));
            Iterator<Long> it9 = eVar.iterator();
            while (((vim.g) it9).f289628c) {
                arrayList2.add(transcriptDateRange.f51076a.plusDays(((m0) it9).nextLong()));
            }
            a0.x(arrayList2, arrayList);
        }
        List listO0 = d0.O0(d0.U(arrayList));
        this.f294661a = listO0;
        this.f294662b = d0.i1(listO0);
    }
}
