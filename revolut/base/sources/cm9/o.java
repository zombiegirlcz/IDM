package cm9;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pay_with_smile.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class o implements cli.n {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f25177a;

    public o(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f25177a = featureToggleInteractor;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new i(new TextLocalisedClause(R$string.revolut_pay_pay_with_smile_settings_title, null, null, 14), new TextLocalisedClause(R$string.revolut_pay_pay_with_smile_settings_description, null, null, 14), (List) iii.c.f(domainState.f25169a, new ce9.a(this, 20), new clk.b(3), new cf1.h(this, 5)), u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "MORE_MENU_ID", new ResourceImage(R$drawable.uikit_icn_24_more, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124)));
    }
}
