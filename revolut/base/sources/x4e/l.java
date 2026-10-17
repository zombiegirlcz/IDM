package x4e;

import aw0.bb;
import aw0.cb;
import aw0.p9;
import aw0.wa;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.structured_note.details.impl.R$string;
import ip0.ak0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import jel.c2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp4.j0;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class l {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PercentageClause.Format.Custom f302872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PercentageClause.Format.Custom f302873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BigDecimal f302874c;

    public static final class a {
        private a() {
        }
    }

    static {
        RoundingMode roundingMode = RoundingMode.HALF_EVEN;
        p9 p9Var = p9.ALWAYS;
        f302872a = new PercentageClause.Format.Custom(1, p9Var, wa.SHOW_ALL_ZEROES, roundingMode);
        f302873b = new PercentageClause.Format.Custom(0, 8, p9Var, null, roundingMode);
        f302874c = new BigDecimal(5);
    }

    public static TextDelegate.Model a() {
        TextDelegate.Model model = new TextDelegate.Model("chart_footer", new TextLocalisedClause(R$string.trading_structured_notes_chart_caption, null, null, 14), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        return model;
    }

    public static cb b(c2 c2Var) {
        int i = c2Var == null ? -1 : m.f302875a[c2Var.ordinal()];
        if (i != -1) {
            if (i == 1) {
                cb.Companion.getClass();
                return bb.b();
            }
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                cb.Companion.getClass();
                return bb.d();
            }
        }
        cb.Companion.getClass();
        return bb.c();
    }

    public static float d(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        if (bigDecimal2.compareTo(bigDecimal3) == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(bigDecimal2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        BigDecimal bigDecimalSubtract2 = bigDecimal3.subtract(bigDecimal2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
        return bigDecimalSubtract.divide(bigDecimalSubtract2, 10, RoundingMode.HALF_EVEN).floatValue();
    }

    public final List c(d domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f302863a;
        Data data2 = domainState.f302864b;
        List list = (data == null || data2 == null) ? null : (List) iii.c.f(t1.t(data, data2), new x29.a(this, 18), new x48.a(1), new j0(this, domainState, 17));
        return list == null ? f0.f322471a : list;
    }
}
