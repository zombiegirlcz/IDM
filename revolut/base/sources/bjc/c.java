package bjc;

import aw0.p9;
import bkc.d;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CustomColors;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsConfigurations;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments;
import com.revolut.feature.rewards.impl.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import yic.q;
import yy0.i;
import yy0.l;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static RowDelegate.Model a(String str, TextLocalisedClause textLocalisedClause, int i, q qVar, ArrayList arrayList, RentAndBillsConfigurations.Configuration configuration) {
        TextLocalisedClause textLocalisedClause2;
        RowDelegate.Model.c pfVar;
        if (arrayList.isEmpty()) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.rent_and_bills_home_category_subtitle_unlinked, u.c(d.a(configuration.f84779a, p9.ONLY_NEGATIVE)), null, 12);
        } else {
            Iterator it8 = arrayList.iterator();
            double d = 0.0d;
            while (it8.hasNext()) {
                d += ((RentAndBillsLinkedPayments.Category.LinkedPayment) it8.next()).d;
            }
            double d5 = configuration.f84779a;
            if (d > d5) {
                d = d5;
            }
            textLocalisedClause2 = new TextLocalisedClause(R$string.rent_and_bills_home_category_subtitle_linked, u.c(d.a(d, p9.ALWAYS)), null, 12);
        }
        TextLocalisedClause textLocalisedClause3 = textLocalisedClause2;
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 7), new CustomColors(2, new Color.Solid(R$attr.uikit_colorAccentNeutral_10), null), gz0.b.Center, null, null, null, 113), (Clause) null, 190), !arrayList.isEmpty() ? new AccentCircleBadge(dw0.a.Checked) : null, null, false, null, false, 60);
        if (arrayList.isEmpty()) {
            pfVar = new pf(new TextLocalisedClause(R$string.rent_and_bills_home_perks_action_link, null, null, 14), null, null, false, null, null, 510);
        } else {
            i iVar = l.Companion;
            ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246);
            iVar.getClass();
            pfVar = new tf(i.a(resourceImage));
        }
        return new RowDelegate.Model(str, image40, textLocalisedClause, null, 0, textLocalisedClause3, null, null, 0, pfVar, !arrayList.isEmpty(), null, false, null, null, null, null, null, null, qVar, null, 0, 0, 0, 0, 532673496);
    }
}
