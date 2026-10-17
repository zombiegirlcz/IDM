package fua;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.IconSelectorDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rating.shared.impl.R$string;
import ip0.lp;
import ip0.np;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static IconSelectorDelegate.SelectableIconModel a(int i, int i2, String str) {
        return IconSelectorDelegate.SelectableIconModel.Companion.a(IconSelectorDelegate.SelectableIconModel.INSTANCE, str, new ResourceImage(i2, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, new ImageTransformations(null, null, null, gz0.b.CenterInside, null, 40, 41, 23), new TextLocalisedClause(i, null, null, 14), 54), false, new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new TextLocalisedClause(i, null, null, 14), null, 0, false, false, null, null, 4064);
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.rating_screen_title, null, null, 14), null, null, null, false, 30);
        IconSelectorDelegate.Model model = new IconSelectorDelegate.Model("app_rating_screen_actions", v.k(a(R$string.rating_option_negative, R$drawable.uikit_icn_24_social_dislike, "app_rating_screen_negative"), a(R$string.rating_option_positive, R$drawable.uikit_icn_24_social_like, "app_rating_screen_positive")), null, new np(lp.f165247a), null, 52);
        int i = R$attr.uikit_dp16;
        yp0.b.l(model, R$attr.uikit_dp8, R$attr.uikit_dp24, i, i, null, false, 48);
        return new cii.b(null, u.c(model), aVar);
    }
}
