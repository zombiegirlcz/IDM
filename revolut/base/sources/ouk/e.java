package ouk;

import aw0.o9;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.m6;
import ip0.q6;
import ip0.s7;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import mel.h0;
import mel.q;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    @NotNull
    private static final c Companion = new c();

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            arrayList.add(new s7(p.a.o(str, i), 0, 0, 0, 0, false, null, 126));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    public static int c(q qVar) {
        int i = d.f229885a[qVar.ordinal()];
        if (i == 1) {
            return R$attr.uikit_colorPerformanceNegative;
        }
        if (i == 2) {
            return R$attr.uikit_colorDeepGrey;
        }
        if (i == 3) {
            return R$attr.uikit_colorPerformancePositive;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final ArrayList b(String str, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            h0 h0Var = (h0) obj2;
            double d = h0Var.f204754c;
            q qVar = h0Var.f204753b;
            arrayList2.add(new q6(p.a.o(str, i), new TextClause(h0Var.f204752a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new m6(new TagViewData(null, mif.a.Y(qVar, new Custom(Integer.valueOf(c(qVar)), false, null, false, null, 254)), new Color.Opaque(c(qVar), 0.1f), R$attr.uikit_colorTransparent, null, 1000), ytk.b.a(new BigDecimal(d), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254)))));
            i = i2;
        }
        return arrayList2;
    }
}
