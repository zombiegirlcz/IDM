package k3g;

import a1g.b;
import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.experiences.api.R$plurals;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.api.models.search.TravelSearchAttraction;
import com.revolut.feature.travel.experiences.api.models.search.TravelSearchDestination;
import com.revolut.feature.travel.experiences.api.models.search.TravelSearchExperience;
import com.revolut.feature.travel.experiences.models.TravelExperienceRatings;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k37.s;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import myf.x;
import org.jmrtd.cbeff.ISO781611;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements jki.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.a f180732a;

    public p(n8b.a countryInteractor) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f180732a = countryInteractor;
    }

    public static ArrayList b() {
        IntRange intRange = new IntRange(0, 3, 1);
        ArrayList arrayList = new ArrayList(w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            arrayList.add(new pb0(a0.d.n("EXPERIENCES_SEARCH_ITEM_ID", it8.nextInt())));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    public static List c() {
        RowDelegate.Model model = new RowDelegate.Model("NEAR_ME_ITEM_ID", new GlyphImage(R$drawable.uikit_icn_24_near_me, null, null, 6), null, null, new TextLocalisedClause(R$string.experiences_search_section_near_me_title, null, null, 14), null, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741804);
        yp0.b.l(model, R$attr.uikit_dp16, 0, 0, 0, null, false, 62);
        return u.c(model);
    }

    public static RowDelegate.Model e(TravelSearchAttraction travelSearchAttraction) {
        String strQ = j6.a.q("ATTRACTIONS_SEARCH_ITEM_ID", travelSearchAttraction.f92885a);
        GlyphImage glyphImage = new GlyphImage(R$drawable.uikit_icn_24_bank, null, null, 6);
        TextClause textClause = new TextClause(travelSearchAttraction.f92886b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = travelSearchAttraction.d;
        return new RowDelegate.Model(strQ, glyphImage, null, null, textClause, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, 0, null, false, false, null, null, null, null, null, travelSearchAttraction, null, 0, 0, 0, 0, 1056964460);
    }

    public static RowDelegate.Model g(TravelSearchExperience travelSearchExperience) {
        CompositeClause compositeClause;
        dj0.d dVar = travelSearchExperience.d;
        TextLocalisedClause textLocalisedClause = dVar != null ? new TextLocalisedClause(R$string.experiences_search_section_nearby_subtitle_price, u.c(new MoneyClause(dVar, new MoneyClause.Format.Shorts(false, 63), null, o9.NON_SENSITIVE, 4)), null, 12) : null;
        TravelExperienceRatings travelExperienceRatings = travelSearchExperience.e;
        if (travelExperienceRatings != null) {
            double d = travelExperienceRatings.f93192b;
            int i = travelExperienceRatings.f93191a;
            b.a style = b.a.f632a;
            Intrinsics.checkNotNullParameter(style, "style");
            compositeClause = new CompositeClause(v.k(a1g.c.b(d, style), new TextClause(" (", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedQuantityClause(R$plurals.experiences_common_reviews, Integer.valueOf(i), u.c(Integer.valueOf(i)), (Style) null, 24), new TextClause(")", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, null, null, 14);
        } else {
            compositeClause = null;
        }
        Object[] elements = {textLocalisedClause, compositeClause};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        return new RowDelegate.Model(j6.a.q("EXPERIENCES_SEARCH_ITEM_ID", travelSearchExperience.f92893a), new UrlImage(travelSearchExperience.f92895c, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902), null, null, new TextClause(travelSearchExperience.f92894b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), !listL.isEmpty() ? new CompositeClause(listL, new DotDividerClause((Integer) null), null, null, 12) : null, null, null, 0, null, false, false, null, null, null, null, null, travelSearchExperience, null, 0, 0, 0, 0, 1056964460);
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new m((List) iii.c.f(domainState.f180712a, new s(this, 10), new k1f.n(10), new joa.j(this, domainState, 15)));
    }

    public final List d(List list) {
        if (list.isEmpty()) {
            return f0.f322471a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(f(((x) it8.next()).f210494b, "POPULAR_DESTINATIONS_ITEM_ID"));
        }
        return yp0.b.g(arrayList, new ListSubheaderDelegate.Model("POPULAR_DESTINATIONS_SUBHEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.experiences_search_section_popular_destinations_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
    }

    public final RowDelegate.Model f(TravelSearchDestination travelSearchDestination, String str) {
        String strR = a0.d.r(str, travelSearchDestination.f92888a);
        GlyphImage glyphImage = new GlyphImage(R$drawable.uikit_icn_24_location_pin, null, null, 6);
        TextClause textClause = new TextClause(travelSearchDestination.f92889b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str2 = travelSearchDestination.e;
        TextClause[] elements = {str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, str2 != null ? new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, new TextClause(((o8b.c) this.f180732a).b(travelSearchDestination.d), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new RowDelegate.Model(strR, glyphImage, null, null, textClause, new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14), null, null, 0, null, false, false, null, null, null, null, null, travelSearchDestination, null, 0, 0, 0, 0, 1056964460);
    }
}
