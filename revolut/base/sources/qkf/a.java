package qkf;

import aw0.k7;
import aw0.o9;
import aw0.p9;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit_resources.R$attr;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import tof.h0;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    public static final AssetClause a(h0 h0Var, p9 signShowingPolicy, Style style) {
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        Intrinsics.checkNotNullParameter(signShowingPolicy, "signShowingPolicy");
        xi0.b bVar = new xi0.b(6, h0Var.f272778b, null);
        BigDecimal bigDecimal = h0Var.f272777a;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(signShowingPolicy, "signShowingPolicy");
        return new AssetClause(bigDecimal, new AssetClauseType.Stock(new NumberClause.Format.FixedDigitsAfterDot(bVar.b(), 6, signShowingPolicy, null, null)), cp5.d.J(bVar), style, null, 16);
    }

    public static final MoneyClause b(h0 h0Var) {
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        BigDecimal bigDecimal = h0Var.f272777a;
        xi0.a aVar = xi0.b.Companion;
        String str = h0Var.f272778b;
        aVar.getClass();
        return u5l.a.d(bigDecimal, xi0.a.a(str), k7.NEVER, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), o9.SENSITIVE, 2);
    }
}
