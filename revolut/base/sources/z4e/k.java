package z4e;

import android.os.Parcelable;
import aw0.c7;
import aw0.o9;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import d9.e1;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import jel.m2;
import jel.n2;
import jel.o2;
import jel.p2;
import jel.q2;
import jel.r2;
import jel.s2;
import jel.t2;
import jel.u2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.a0;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class k {
    public static TextClause a(u2 u2Var) {
        Custom custom;
        Parcelable textClause;
        Parcelable percentageClause;
        Custom custom2;
        String str = u2Var.f173572a;
        ArrayList arrayList = new ArrayList();
        String strD = str;
        int i = 0;
        for (Object obj2 : u2Var.f173573b) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            s2 s2Var = (s2) obj2;
            t2 t2VarB = s2Var.b();
            int i3 = t2VarB == null ? -1 : j.f319383a[t2VarB.ordinal()];
            if (i3 != -1) {
                if (i3 == 1) {
                    custom2 = new Custom(new Custom.Color.Solid(R$attr.uikit_colorPerformancePositive), false, false, 254);
                } else if (i3 == 2) {
                    custom2 = new Custom(new Custom.Color.Solid(R$attr.uikit_colorPerformanceNegative), false, false, 254);
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    custom2 = new Custom(new Custom.Color.Solid(R$attr.uikit_colorStatusWarning), false, false, 254);
                }
                custom = custom2;
            } else {
                custom = null;
            }
            if (s2Var instanceof m2) {
                com.revolut.core.ui_kit.models.j jVar = c7.Companion;
                LocalDate localDate = ((m2) s2Var).f173511c;
                LocalDateClause$DateFormat.INSTANCE.getClass();
                LocalDateClause$DateFormat.DateMedium dateMedium = LocalDateClause$DateFormat.Companion.f57815b;
                jVar.getClass();
                percentageClause = com.revolut.core.ui_kit.models.j.a(localDate, dateMedium, custom);
            } else {
                if (s2Var instanceof n2) {
                    textClause = new MoneyClause(((n2) s2Var).f173524c, new MoneyClause.Format.Defaults(null, null, false, false, 15), custom, null, 8);
                } else if (s2Var instanceof o2) {
                    textClause = new NumberClause(((o2) s2Var).f173529c, null, custom, null, 10);
                } else if (s2Var instanceof p2) {
                    percentageClause = new PercentageClause(e1.Z(((p2) s2Var).f173539c), (PercentageClause.Format) null, custom, 2);
                } else {
                    if (!(s2Var instanceof q2)) {
                        if (s2Var instanceof r2) {
                            return null;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    textClause = new TextClause(((q2) s2Var).f173550c, (Style) custom, (Integer) null, false, (o9) null, (List) null, 124);
                }
                percentageClause = textClause;
            }
            strD = a0.D(strD, s2Var.a(), j6.a.l(i2, "%", "$s"), false);
            arrayList.add(percentageClause);
            i = i2;
        }
        return new TextClause(strD, (Style) null, (Integer) null, false, (o9) null, (List) arrayList, 94);
    }
}
