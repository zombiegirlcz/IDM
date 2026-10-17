package lk9;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pay_later.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zh9.r0;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DotDividerClause f196308b = new DotDividerClause((Integer) null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vi9.b f196309a;

    public c(vi9.b merchantIconMapper) {
        Intrinsics.checkNotNullParameter(merchantIconMapper, "merchantIconMapper");
        this.f196309a = merchantIconMapper;
    }

    public static final ActionsView.Item a(r0 r0Var, zh9.p pVar, boolean z) {
        return new ActionsView.Item("ID_PAY_NOW_ACTION", null, false, null, null, new TextLocalisedClause(R$string.pay_later_home_actions_repay, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z ? new NewBadgeContent.Dot(null, null, 3) : null, null, new bi9.b(new zh9.y(pVar, r0Var)), null, 11934);
    }
}
