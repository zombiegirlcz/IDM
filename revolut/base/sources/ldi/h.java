package ldi;

import aw0.o9;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo;
import java.util.List;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements cdi.b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static CompositeClause a(TextLocalisedClause textLocalisedClause, RevPointsPocketInfo revPointsPocketInfo, List list) {
        Float fValueOf = Float.valueOf(12.0f);
        if (textLocalisedClause == null) {
            return null;
        }
        List listK = v.k(new ImageClause(R$drawable.uikit_icn_16_info_outline, Integer.valueOf(R$attr.uikit_colorAccent), fValueOf, fValueOf, 16), textLocalisedClause);
        m70.a.t(t0.f186434a);
        return new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new Click(12, Integer.valueOf(R$attr.uikit_colorAccent), (Object) new ddi.f(revPointsPocketInfo, list), "REV_POINTS_POCKET_FOOTER_ID", false), null, 8);
    }
}
