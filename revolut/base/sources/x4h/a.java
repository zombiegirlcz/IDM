package x4h;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.mf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.assetdetails.ui.impl.ratings.common.InfoDialogFactory$DialogConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.pc;
import u4h.b;
import v4h.e;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f302878a;

    public a(u4h.a commonMapper, b fitchRatingMapper) {
        Intrinsics.checkNotNullParameter(commonMapper, "commonMapper");
        Intrinsics.checkNotNullParameter(fitchRatingMapper, "fitchRatingMapper");
        this.f302878a = fitchRatingMapper;
    }

    public final RowDelegate.Model a(String str, int i, int i2, yel.a aVar, List list) {
        Integer numValueOf;
        String listId = "CREDIT_QUALITY_CELL_".concat(str);
        TextLocalisedClause title = new TextLocalisedClause(i, null, null, 14);
        List<yel.a> list2 = list;
        ArrayList tags = new ArrayList(w.t(list2, 10));
        for (yel.a rating : list2) {
            String strQ = j6.a.q("CREDIT_QUALITY_CELL_TAG_", rating.name());
            String strA = this.f302878a.a(rating);
            if (rating == aVar) {
                Intrinsics.checkNotNullParameter(rating, "rating");
                numValueOf = Integer.valueOf(rating.ordinal() <= yel.a.BBB_MINUS.ordinal() ? R$attr.uikit_colorTeal : R$attr.uikit_colorOrange);
            } else {
                numValueOf = null;
            }
            tags.add(new pc(strQ, u4h.a.a(numValueOf, strA), null));
        }
        InfoDialogFactory$DialogConfig infoDialogFactory$DialogConfig = new InfoDialogFactory$DialogConfig(new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(i2, null, null, 14));
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tags, "tags");
        RowDelegate.Model model = new RowDelegate.Model(listId, null, title, null, 0, null, null, null, 0, null, false, null, false, null, tags, new mf(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true), null, null, null, infoDialogFactory$DialogConfig, null, 0, 0, 0, 0, 532576250);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }
}
