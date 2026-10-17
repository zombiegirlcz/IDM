package oy0;

import aw0.l3;
import aw0.n9;
import aw0.o9;
import aw0.s1;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f230869a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f230870b = new LinkedHashMap();

    private a() {
    }

    public static boolean a(Clause clause) {
        if (!(clause instanceof b) || ((b) clause).getF59887j() == null) {
            if (clause instanceof ImageClause) {
                if (f(((ImageClause) clause).f57785a) == null) {
                    return false;
                }
            } else {
                if (clause instanceof CompositeClause) {
                    CompositeClause compositeClause = (CompositeClause) clause;
                    Clause clause2 = compositeClause.f57748b;
                    boolean zA = clause2 != null ? a(clause2) : false;
                    List list = compositeClause.f57747a;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        zA = zA || a((Clause) list.get(i));
                    }
                    return zA;
                }
                if (clause instanceof l3) {
                    return a(((l3) clause).getF57984b());
                }
                if (!(clause instanceof n9) || ((n9) clause).getE() != o9.SENSITIVE) {
                    if (clause instanceof s1) {
                        List f57783b = ((s1) clause).getF57783b();
                        int size2 = f57783b.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            Object obj2 = f57783b.get(i2);
                            if (!(obj2 instanceof Clause) || !a((Clause) obj2)) {
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean b(Clause clause) {
        if (clause instanceof n9) {
            if (((n9) clause).getE() == o9.NON_SENSITIVE) {
                return true;
            }
        } else if (clause instanceof CompositeClause) {
            List list = ((CompositeClause) clause).f57747a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (b((Clause) list.get(i))) {
                    return true;
                }
            }
        } else {
            if (clause instanceof l3) {
                return b(((l3) clause).getF57984b());
            }
            if (!(clause instanceof s1)) {
                return true;
            }
            List f57783b = ((s1) clause).getF57783b();
            int size2 = f57783b.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Object obj2 = f57783b.get(i2);
                if ((obj2 instanceof Clause) && b((Clause) obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean c(Clause clause) {
        if (clause instanceof CompositeClause) {
            CompositeClause compositeClause = (CompositeClause) clause;
            List list = compositeClause.f57747a;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    Clause clause2 = compositeClause.f57748b;
                    if (clause2 == null || !c(clause2)) {
                    }
                } else {
                    if (c((Clause) list.get(i))) {
                        break;
                    }
                    i++;
                }
            }
        }
        if (clause instanceof l3) {
            return c(((l3) clause).getF57984b());
        }
        if (!(clause instanceof s1)) {
            return (clause instanceof n9) && ((n9) clause).getE() == o9.SENSITIVE;
        }
        List f57783b = ((s1) clause).getF57783b();
        int size2 = f57783b.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Object obj2 = f57783b.get(i2);
            if (!(obj2 instanceof Clause) || !c((Clause) obj2)) {
            }
        }
    }

    public static Clause d(int i) {
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = f230870b;
        Object textLocalisedClause = linkedHashMap.get(numValueOf);
        if (textLocalisedClause == null) {
            textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
            linkedHashMap.put(numValueOf, textLocalisedClause);
        }
        return (Clause) textLocalisedClause;
    }

    public static Clause e(Clause clause, boolean z) {
        if (z && c(clause) && b(clause)) {
            return new TextLocalisedClause(R$string.common_accessibility_label_partially_hidden_content, null, null, 14);
        }
        if (z && c(clause)) {
            return new TextLocalisedClause(R$string.common_accessibility_label_hidden_content, null, null, 14);
        }
        if (clause instanceof b) {
            b bVar = (b) clause;
            if (bVar.getF59887j() != null) {
                Clause f59887j = bVar.getF59887j();
                if (f59887j != null) {
                    return f59887j;
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        if (clause instanceof ImageClause) {
            Clause clauseF = f(((ImageClause) clause).f57785a);
            return clauseF == null ? clause : clauseF;
        }
        if (!(clause instanceof CompositeClause)) {
            if (!(clause instanceof l3)) {
                return clause;
            }
            l3 l3Var = (l3) clause;
            return l3Var.a(e(l3Var.getF57984b(), z));
        }
        CompositeClause compositeClause = (CompositeClause) clause;
        List list = compositeClause.f57747a;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(e((Clause) list.get(i), z));
        }
        Clause clause2 = compositeClause.f57748b;
        return new CompositeClause(arrayList, clause2 != null ? e(clause2, z) : null, compositeClause.f57749c, null, 8);
    }

    public static Clause f(int i) {
        if (i == R$drawable.uikit_icn_16_info_outline || i == R$drawable.uikit_icn_24_info_inverted || i == R$drawable.uikit_icn_24_info_outline || i == R$drawable.uikit_icn_24_info_sign || i == R$drawable.uikit_icn_24_info || i == R$drawable.uikit_icn_24_info_legacy) {
            return d(R$string.uikit_actions_info);
        }
        if (i == R$drawable.uikit_icn_24_more || i == R$drawable.uikit_icn_24_more_android || i == R$drawable.uikit_icn_24_more_dots || i == R$drawable.uikit_icn_24_more_ios) {
            return d(R$string.uikit_actions_more);
        }
        if (i == R$drawable.uikit_icn_16_plus || i == R$drawable.uikit_icn_16_plus_circle || i == R$drawable.uikit_icn_20_plus_badge || i == R$drawable.uikit_icn_24_plus || i == R$drawable.uikit_icn_24_plus_circle) {
            return d(R$string.common_action_plus);
        }
        if (i == R$drawable.uikit_icn_16_minus || i == R$drawable.uikit_icn_16_minus_circle || i == R$drawable.uikit_icn_20_minus_badge || i == R$drawable.uikit_icn_24_minus || i == R$drawable.uikit_icn_24_minus_circle) {
            return d(R$string.common_action_minus);
        }
        if (i == R$drawable.uikit_icn_16_chevron_down || i == R$drawable.uikit_icn_16_chevron_down_small || i == R$drawable.uikit_icn_24_chevron_down) {
            return d(R$string.common_accessibility_label_expand_content);
        }
        if (i == R$drawable.uikit_icn_16_chevron_up || i == R$drawable.uikit_icn_16_chevron_up_small || i == R$drawable.uikit_icn_24_chevron_up) {
            return d(R$string.common_accessibility_label_collapse_content);
        }
        if (i == R$drawable.uikit_icn_10_stocks_arrow_up || i == R$drawable.uikit_icn_24_arrow_thin_up || i == R$drawable.uikit_icn_24_arrow_up) {
            return d(R$string.common_accessibility_label_image_attachment_up);
        }
        if (i == R$drawable.uikit_icn_10_stocks_arrow_down || i == R$drawable.uikit_icn_24_arrow_thin_down || i == R$drawable.uikit_icn_24_arrow_down) {
            return d(R$string.common_accessibility_label_image_attachment_down);
        }
        if (i == R$drawable.uikit_icn_24_arrow_thin_right) {
            return d(R$string.common_accessibility_label_image_attachment_right);
        }
        return null;
    }

    public static Clause g(Clause clause, boolean z) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        if (a(clause)) {
            return e(clause, z);
        }
        return null;
    }
}
