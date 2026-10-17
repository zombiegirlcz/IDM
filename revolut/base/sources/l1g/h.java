package l1g;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceLocation;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceLogisticsLocation;
import ip0.yt;
import java.util.List;
import jki.i;
import jki.m;
import jki.p;
import kcg.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kye.l0;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements p {
    public static ListCellDelegate.Model b(Pair pair) {
        String strQ = j6.a.q("LOGISTICS_ITEM_ID", ((TravelExperienceLogisticsLocation) pair.f186385a).f92832a);
        j8 j8Var = new j8(new ResourceImage(R$drawable.uikit_icn_24_location_pin, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), yt.TOP);
        TextClause textClause = new TextClause(((TravelExperienceLocation) pair.f186386b).f92827b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TravelExperienceLogisticsLocation travelExperienceLogisticsLocation = (TravelExperienceLogisticsLocation) pair.f186385a;
        TextClause textClause2 = new TextClause(travelExperienceLogisticsLocation.f92833b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        if (travelExperienceLogisticsLocation.f92833b.length() <= 0) {
            textClause2 = null;
        }
        return new ListCellDelegate.Model(strQ, j8Var, textClause, textClause2, false, null, null, 0, 0, 0, 0, 4064);
    }

    @Override // jki.p
    public final m a(i iVar) {
        TextLocalisedClause textLocalisedClause;
        b domainState = (b) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f191532a, new l0g.a(13), new l0(15), new j(this, domainState, 21));
        c cVar = domainState.f191533b;
        int[] iArr = g.f191541a;
        int i = iArr[cVar.ordinal()];
        TextLocalisedClause textLocalisedClause2 = null;
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.experiences_details_additional_information, null, null, 14);
        } else if (i == 2) {
            textLocalisedClause = new TextLocalisedClause(R$string.experiences_details_whats_included, null, null, 14);
        } else if (i == 3) {
            textLocalisedClause = new TextLocalisedClause(R$string.experiences_details_about_title, null, null, 14);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.experiences_details_departure, null, null, 14);
        }
        int i2 = iArr[cVar.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                textLocalisedClause2 = new TextLocalisedClause(R$string.experiences_details_whats_included_description, null, null, 14);
            } else if (i2 != 3 && i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new d(textLocalisedClause, textLocalisedClause2, list);
    }
}
