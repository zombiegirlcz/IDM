package dk9;

import aw0.k7;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pay_later.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zh9.r0;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vi9.b f115468a;

    public b(vi9.b merchantIconMapper) {
        Intrinsics.checkNotNullParameter(merchantIconMapper, "merchantIconMapper");
        this.f115468a = merchantIconMapper;
    }

    public static final ActionsView.Item a(r0 r0Var, boolean z) {
        return new ActionsView.Item("ID_PAY_NOW_ACTION", null, false, null, null, new TextLocalisedClause(R$string.pay_later_home_actions_repay, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z ? new NewBadgeContent.Dot(null, null, 3) : null, null, r0Var, null, 11934);
    }

    public static final MoneyClause b(r0 r0Var, Custom custom) {
        return new MoneyClause(r0Var.f322331j, new MoneyClause.Format.Headers(k7.NEVER, new ScaleMode.SimpleLen(2, 2), null, false, false, 28), custom, null, 8);
    }
}
