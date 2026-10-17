package j2g;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeRangeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class z implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lxf.i f170893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dyf.d f170894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dyf.k f170895c;
    public final m2g.d d;
    public final m2g.a e;
    public final zjh.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m2g.b f170896g;

    public z(lxf.i revPointsBannerMapper, dyf.d discoverMoreMapper, dyf.k upcomingBookingsListItemMapper, m2g.d recommendedCategoriesMapper, m2g.a recentlyViewedMapper, zjh.j legalEntityDisclaimerMapper, m2g.b experiencesLegalEntityDisclaimerMapper) {
        Intrinsics.checkNotNullParameter(revPointsBannerMapper, "revPointsBannerMapper");
        Intrinsics.checkNotNullParameter(discoverMoreMapper, "discoverMoreMapper");
        Intrinsics.checkNotNullParameter(upcomingBookingsListItemMapper, "upcomingBookingsListItemMapper");
        Intrinsics.checkNotNullParameter(recommendedCategoriesMapper, "recommendedCategoriesMapper");
        Intrinsics.checkNotNullParameter(recentlyViewedMapper, "recentlyViewedMapper");
        Intrinsics.checkNotNullParameter(legalEntityDisclaimerMapper, "legalEntityDisclaimerMapper");
        Intrinsics.checkNotNullParameter(experiencesLegalEntityDisclaimerMapper, "experiencesLegalEntityDisclaimerMapper");
        this.f170893a = revPointsBannerMapper;
        this.f170894b = discoverMoreMapper;
        this.f170895c = upcomingBookingsListItemMapper;
        this.d = recommendedCategoriesMapper;
        this.e = recentlyViewedMapper;
        this.f = legalEntityDisclaimerMapper;
        this.f170896g = experiencesLegalEntityDisclaimerMapper;
    }

    public static Clause a(TravelExperienceDatesSelection travelExperienceDatesSelection) {
        if (travelExperienceDatesSelection instanceof TravelExperienceDatesSelection.NoDatesSelection) {
            return new TextLocalisedClause(R$string.experiences_home_date_picker_placeholder, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
        }
        TimeRangeClause timeRangeClauseC = a1g.f.c(travelExperienceDatesSelection);
        return timeRangeClauseC == null ? a(TravelExperienceDatesSelection.NoDatesSelection.f92906a) : timeRangeClauseC;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r25) {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j2g.z.c(cli.j):cli.o");
    }
}
