package mgh;

import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import d9.e1;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static CellDetailsDelegate.Model a(c cVar, String str, int i, BigDecimal bigDecimal, Integer num, int i2) {
        BigDecimal bigDecimal2 = (i2 & 4) != 0 ? null : bigDecimal;
        Integer num2 = (i2 & 8) != 0 ? null : num;
        Clause percentageClause = bigDecimal2 != null ? new PercentageClause(e1.Z(bigDecimal2), (PercentageClause.Format) null, (Style) null, 6) : num2 != null ? new TextLocalisedClause(num2.intValue(), null, null, 14) : null;
        if (percentageClause != null) {
            return new CellDetailsDelegate.Model(str, new t0((Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, 0, false, 30), percentageClause, null, null, null, null, 0, null, false, false, null, null, 28664);
        }
        return null;
    }
}
