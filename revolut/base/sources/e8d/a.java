package e8d;

import aw0.s0;
import aw0.t0;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.delegates.CellDetailsSingleButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.shared.help_centre.impl.R$string;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public static CellDetailsSingleButtonDelegate.Model a(s0 s0Var) {
        return new CellDetailsSingleButtonDelegate.Model("CHAT_BUTTON_ITEM_ID", new t0((Clause) new TextLocalisedClause(R$string.help_center_section_need_more_help_title, null, null, 14), (Image) null, 0, false, 30), s0Var, null, null, SyslogConstants.LOG_CLOCK);
    }
}
