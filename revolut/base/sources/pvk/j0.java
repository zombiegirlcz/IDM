package pvk;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import zhm.q0;

/* JADX INFO: loaded from: classes12.dex */
public final class j0 {

    @NotNull
    private static final h0 Companion = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Regex f240286a = new Regex("\\{([a-zA-Z0-9_]+)\\}");

    public static Custom b(mel.d0 d0Var) {
        int i = i0.f240284a[d0Var.h().ordinal()];
        if (i == 1) {
            return new Custom(Integer.valueOf(R$attr.uikit_colorPerformancePositive), false, null, false, null, 254);
        }
        if (i == 2) {
            return new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254);
        }
        if (i != 3) {
            return null;
        }
        return new Custom(Integer.valueOf(R$attr.uikit_colorPerformanceNegative), false, null, false, null, 254);
    }

    public final TextClause a(mel.o insightDescription) throws Throwable {
        Parcelable textClause;
        Intrinsics.checkNotNullParameter(insightDescription, "insightDescription");
        String strD = kotlin.text.a0.D(insightDescription.f204767a, "%", "%%", false);
        List listJ = nkm.y.J(nkm.y.x(Regex.c(f240286a, strD), new pui.a(18)));
        ArrayList arrayList = insightDescription.f204768b;
        int iB = q0.b(zhm.w.t(arrayList, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj2 : arrayList) {
            linkedHashMap.put(((mel.d0) obj2).a(), obj2);
        }
        List<String> list = listJ;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
        String strD2 = strD;
        for (String str : list) {
            strD2 = kotlin.text.a0.D(strD2, str, "%s", false);
            mel.d0 d0Var = (mel.d0) linkedHashMap.get(str);
            if (d0Var == null) {
                textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            } else if (d0Var instanceof mel.z) {
                textClause = new MoneyClause(((mel.z) d0Var).f204784a, new MoneyClause.Format.Defaults(null, null, false, false, 15), b(d0Var), o9.NON_SENSITIVE);
            } else if (d0Var instanceof mel.b0) {
                textClause = ytk.c.a(((mel.b0) d0Var).f204731a, b(d0Var), ytk.d.ONE);
            } else {
                if (!(d0Var instanceof mel.x)) {
                    throw new NoWhenBranchMatchedException();
                }
                textClause = ytk.b.a(((mel.x) d0Var).f204781a, b(d0Var));
            }
            arrayList2.add(textClause);
        }
        try {
            return new TextClause(strD2, (Style) null, (Integer) null, false, (o9) null, (List) arrayList2, 94);
        } catch (Throwable th10) {
            hx7.e.n(th10);
            return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
    }
}
