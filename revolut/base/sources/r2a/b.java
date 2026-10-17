package r2a;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.RectangularButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.transfers.personalisation.impl.R$string;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class b {
    public final RectangularButtonDelegate.Model a() {
        return new RectangularButtonDelegate.Model("ITEM_ID_CHANGE_BACKGROUND", new TextLocalisedClause(R$string.payments_recipient_profile_actions_background, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_image, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, SyslogConstants.LOG_CLOCK);
    }

    public final CellDetailsChevronDelegate.Model b() {
        return new CellDetailsChevronDelegate.Model("ITEM_ID_CHANGE_BACKGROUND", new TextLocalisedClause(R$string.payments_profile_chat_background, null, null, 14), 0, false, null, null, null, 2036);
    }
}
