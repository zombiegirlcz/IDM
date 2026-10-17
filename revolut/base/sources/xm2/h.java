package xm2;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.backgroundpicker.api.R$string;
import com.revolut.feature.uipersonalisation.api.AlexKDeclaration;
import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import java.util.List;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f307071a = R$attr.uikit_colorGreyTone20;

    public static Clause a(GlobalThemeDeclaration globalThemeDeclaration, int i) {
        Float fValueOf = Float.valueOf(16.0f);
        if (globalThemeDeclaration.e2() != null) {
            List listK = v.k(new TextLocalisedClause(R$string.appearance_seasonal_theme_action_title, null, null, 14), new ImageClause(R$drawable.uikit_icn_24_info_outline, new ImageClauseTint.Color(i), fValueOf, fValueOf, 16));
            m70.a.t(t0.f186434a);
            return new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new Click(14, Integer.valueOf(i), (Object) null, "ID_SEASONAL_STYLE_DISCLAIMER", false), null, 8);
        }
        if (globalThemeDeclaration instanceof AlexKDeclaration) {
            return new TextLocalisedClause(R$string.appearance_art_theme_action_title, null, new Custom(new Custom.Color.Solid(i), false, false, 254), 10);
        }
        return null;
    }
}
