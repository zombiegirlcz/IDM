package je8;

import android.os.Parcelable;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior_coparent.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements n {
    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        eVarB.add(new ListSubheaderDelegate.Model("ID_HEADER_COPARENT_FEATURES", (Image) null, (Clause) new TextLocalisedClause(R$string.junior_co_parent_resolve_invitation_sections_features_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp32, 0, 0, 0, 61434));
        List listK = v.k(new ListCellDelegate.Model("ID_FEATURE_1", new j8(new ResourceImage(R$drawable.uikit_icn_24_youth, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), null, new TextLocalisedClause(R$string.rev_u18_co_parent_resolve_invitation_feature_view, null, null, 14), false, null, null, 0, 0, 0, 0, 4068), new ListCellDelegate.Model("ID_FEATURE_2", new j8(new ResourceImage(R$drawable.uikit_icn_24_cards, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), null, new TextLocalisedClause(R$string.junior_co_parent_resolve_invitation_feature_topup, null, null, 14), false, null, null, 0, 0, 0, 0, 4068), new ListCellDelegate.Model("ID_FEATURE_3", new j8(new ResourceImage(R$drawable.uikit_icn_24_star_filled, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), null, new TextLocalisedClause(R$string.junior_co_parent_resolve_invitation_feature_premium_with_challenges, null, null, 14), false, null, null, 0, 0, 0, 0, 4068));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        return new g(u.a(eVarB));
    }
}
