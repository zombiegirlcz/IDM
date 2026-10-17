package yoc;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static TextLocalisedClause a(xdh.a riskProfile) {
        Intrinsics.checkNotNullParameter(riskProfile, "riskProfile");
        return new TextLocalisedClause(R$string.wealth_robo_porfolio_risk_profile_format, v.k(new TextClause(String.valueOf(riskProfile.a()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause("5", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
    }
}
