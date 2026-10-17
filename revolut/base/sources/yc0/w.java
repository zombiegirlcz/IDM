package yc0;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.backend_flow.domain.models.InfoMessageItem;
import com.revolut.feature.backend_flow.domain.models.InfoMessageItemDetails;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class w implements v {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // yc0.v
    public final rp0.y f(InfoMessageItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        InfoMessageItemDetails infoMessageItemDetails = item.f63510b;
        rp0.t tVar = new rp0.t(new TextClause(infoMessageItemDetails.f63511a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(infoMessageItemDetails.f63512b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 28);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextClause textClause = new TextClause(infoMessageItemDetails.f63513c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int i = R$attr.uikit_dp16;
        return new rp0.y(zhm.u.c(new LargeActionButtonDelegate.Model("INFO_MESSAGE_DIALOG_BUTTON_ID", defaultFilledButton, null, textClause, false, null, null, i, i, i, i, 496)), tVar, null, null, null, null, "BACKEND_SCREEN_DELEGATES_KEY", null, null, null, 3836);
    }
}
