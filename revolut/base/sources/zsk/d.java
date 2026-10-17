package zsk;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    @NotNull
    public static final a Companion;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TextLocalisedClause f324945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ResourceImage f324946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TextLocalisedClause f324947c;
    public static final ResourceImage d;
    public static final TextLocalisedClause e;
    public static final ResourceImage f;

    public static final class a {
        private a() {
        }

        public static final ResourceImage a(a aVar, int i) {
            return new ResourceImage(i, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246);
        }
    }

    static {
        a aVar = new a();
        Companion = aVar;
        f324945a = new TextLocalisedClause(R$string.wealth_trading_spac_risk_warning_speculative_investments, null, null, 14);
        f324946b = a.a(aVar, R$drawable.uikit_icn_24_rates_circle);
        f324947c = new TextLocalisedClause(R$string.wealth_trading_spac_risk_warning_exposure_warning, null, null, 14);
        d = a.a(aVar, R$drawable.uikit_icn_24_coins);
        e = new TextLocalisedClause(R$string.wealth_trading_spac_risk_warning_learn_more, null, null, 14);
        f = a.a(aVar, R$drawable.uikit_icn_24_lightbulb);
    }
}
