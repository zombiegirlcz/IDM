package u3b;

import aw0.m6;
import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.retail.cfd.impl.R$string;
import ip0.hk;
import ip0.ik;
import ip0.jk;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements n {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static hk a(int i, dj0.d dVar, int i2, float f) {
        return new hk(new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 8), i2, f);
    }

    public static jk b(int i, Integer num, dj0.d dVar, ik ikVar) {
        return new jk(new PercentageClause(i, (PercentageClause.Format) null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 2), num != null ? new TextLocalisedClause(num.intValue(), null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10) : null, dVar != null ? new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 8) : null, ikVar, i / 100);
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new f(new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.wealth_margin_cfds_maintenance_margin_add_money, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, domainState.f276885a.getContent() != null, null, null, c.f276884a, 476), null, null, 55), new TextLocalisedClause(R$string.wealth_margin_cfds_maintenance_margin_title, null, null, 14), new TextLocalisedClause(R$string.wealth_margin_cfds_maintenance_margin_description, null, null, 14), (List) iii.c.f(domainState.f276885a, new u3a.g(16), new tw8.g(26), new h(this, 0)));
    }
}
