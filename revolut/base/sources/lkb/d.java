package lkb;

import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.retail.savings.api.R$string;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    public static CellDetailsDelegate.Model a(int i) {
        return new CellDetailsDelegate.Model("HEADER_ITEM_ID", new t0((Clause) new TextLocalisedClause(R$string.savings_challenge_widget_title, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.savings_challenge_widget_time_left, u.c(new TextClause(String.valueOf(i), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
    }
}
