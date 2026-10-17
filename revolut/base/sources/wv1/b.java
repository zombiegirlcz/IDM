package wv1;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.breb.api.R$string;
import ip0.z;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sv1.a f300260a;

    public b(sv1.a aliasUiMapper) {
        Intrinsics.checkNotNullParameter(aliasUiMapper, "aliasUiMapper");
        this.f300260a = aliasUiMapper;
    }

    public static List a() {
        List listK = v.k(new RowDelegate.Model("BREB_KEY_EMPTY_KEY_TITLE_ID", null, new TextLocalisedClause(R$string.bre_b_area_key_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.bre_b_area_key_empty_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868826), new z("BREB_KEY_EMPTY_KEY_ACTIONS_ID", u.c(new ActionsView.Item("BREB_KEY_EMPTY_ADD_KEY_ID", mx0.d.ACCENT, false, null, null, new TextLocalisedClause(R$string.bre_b_area_key_empty_action_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_key, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, uv1.a.AddKey, null, 24476)), null, null, 0, 0, 124));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }
}
