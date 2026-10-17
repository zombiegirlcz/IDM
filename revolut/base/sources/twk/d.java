package twk;

import aw0.o9;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;
import jb3.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class d {
    public static MoneyClause a(int i, Custom custom, MoneyClause.Format format, dj0.d dVar) {
        if ((i & 1) != 0) {
            custom = null;
        }
        if ((i & 2) != 0) {
            format = new MoneyClause.Format.Defaults(null, null, false, false, 7);
        }
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return new MoneyClause(dVar, format, custom, o9.NON_SENSITIVE);
    }

    public static final TextClause b(dj0.d dVar, dj0.d current) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(current, "current");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(dVar.f115082a);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(current.f115082a);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
        BigDecimal bigDecimalT = l.t(bigDecimalValueOf, bigDecimalValueOf2);
        Intrinsics.checkNotNullParameter(bigDecimalT, "<this>");
        Intrinsics.checkNotNullParameter("+", "positivePrefix");
        DecimalFormat decimalFormat = c.f275048a;
        decimalFormat.setPositivePrefix("+");
        return new TextClause(decimalFormat.format(bigDecimalT.setScale(2, RoundingMode.HALF_EVEN)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
