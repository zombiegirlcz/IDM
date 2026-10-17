package t6i;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.xe;
import com.revolut.core.ui_kit.delegates.ze;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.WhiteCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature_move_money.impl.amount.order_automations.OrderAutomationsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrderAutomationsScreenContract$InputData f268354a;

    public g(OrderAutomationsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f268354a = inputData;
    }

    public static RowDelegate.Model a(String str, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, int i, boolean z, a aVar) {
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, i, Integer.valueOf(R$attr.uikit_colorForeground), R$attr.uikit_colorForeground_10, 12.0f, Float.valueOf(40.0f), null, 32), z ? new WhiteCircleBadge(dw0.a.Checked) : null, null, false, null, false, 60), textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, 0, null, false, z ? ze.f55694a : xe.f55602a, null, null, null, null, null, null, null, aVar, null, null, null, null, null, 0, 0, 0, 0, null, -4198440, 15);
    }
}
