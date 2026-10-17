package com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates;

import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceAvailabilityDate;
import com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates.TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jki.g;
import kotlin.NoWhenBranchMatchedException;
import o3g.f;
import o3g.i;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends g implements i {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TravelExperiencesDatesSelectionScreenContract$InputData f93164p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f93165q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0081 A[PHI: r0
      0x0081: PHI (r0v7 ??) = (r0v4 ??), (r0v5 ??), (r0v6 ??), (r0v5 ??), (r0v11 ??) binds: [B:14:0x0085, B:22:0x00a2, B:32:0x00ca, B:17:0x0095, B:10:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection$RangeDateSelection] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection$SingleDateSelection] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(jki.p r11, com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates.TravelExperiencesDatesSelectionScreenContract$InputData r12, l80.e r13) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates.a.<init>(jki.p, com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates.TravelExperiencesDatesSelectionScreenContract$InputData, l80.e):void");
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f93165q;
    }

    public final ArrayList y2() {
        TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy travelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy = this.f93164p.f93163c;
        if (travelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy instanceof TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy.All) {
            return null;
        }
        if (!(travelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy instanceof TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy.OnlyAvailable)) {
            throw new NoWhenBranchMatchedException();
        }
        List list = ((TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy.OnlyAvailable) travelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy).f93160a;
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((TravelExperienceAvailabilityDate) it8.next()).f92786a);
        }
        return arrayList;
    }
}
