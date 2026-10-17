package yhl;

import iel.s;
import iel.t;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import phl.j;
import vim.i;
import zhm.a1;
import zhm.f0;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f314170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final phl.b f314171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ybl.b f314172c;
    public final df0.b d;
    public final gte.a e;

    public b(j corporateEventsRepository, phl.b corporateEventBannersRepository, ybl.b instrumentTickerInteractor, df0.b syncedDateProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(corporateEventsRepository, "corporateEventsRepository");
        Intrinsics.checkNotNullParameter(corporateEventBannersRepository, "corporateEventBannersRepository");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(syncedDateProvider, "syncedDateProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f314170a = corporateEventsRepository;
        this.f314171b = corporateEventBannersRepository;
        this.f314172c = instrumentTickerInteractor;
        this.d = syncedDateProvider;
        this.e = featureToggleInteractor;
    }

    public static vim.e a(LocalDate localDate) {
        LocalDate localDateMinusDays = localDate.minusDays(7L);
        Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "minusDays(...)");
        LocalDate localDatePlusDays = localDate.plusDays(7L);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        return i.b(localDateMinusDays, localDatePlusDays);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v6 */
    public static LinkedHashSet b(iel.a aVar) {
        List listA;
        Set setB = y0.b(aVar.i());
        ?? arrayList = 0;
        arrayList = 0;
        s sVar = aVar instanceof s ? (s) aVar : null;
        if (sVar != null && (listA = sVar.a()) != null) {
            List list = listA;
            arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(((t) it8.next()).f160815b);
            }
        }
        if (arrayList == 0) {
            arrayList = f0.f322471a;
        }
        return a1.l(setB, (Iterable) arrayList);
    }
}
