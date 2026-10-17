package wnj;

import aim.e;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.retail.feature.esim.api.model.EsimHyperText;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import kotlin.text.Regex;
import kotlin.text.d0;
import unj.b;
import wb3.k;
import wnc.x;
import zhm.q0;
import zhm.r0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public a(b clauseStyleApplier) {
        Intrinsics.checkNotNullParameter(clauseStyleApplier, "clauseStyleApplier");
    }

    public static Clause c(a aVar, EsimHyperText hyperText, Integer num, int i) {
        Map args = r0.g();
        if ((i & 4) != 0) {
            num = null;
        }
        Intrinsics.checkNotNullParameter(hyperText, "hyperText");
        Intrinsics.checkNotNullParameter(args, "args");
        return aVar.b(hyperText.f100276a, hyperText.f100277b, hyperText.f100278c, args, num);
    }

    public static /* synthetic */ Clause d(a aVar, String str, List list, Integer num, int i) {
        if ((i & 4) != 0) {
            num = null;
        }
        return aVar.a(str, list, num, new x(2));
    }

    public final Clause a(String text, List descriptors, Integer num, Function1 parcelMapper) {
        int i;
        int iT;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
        Intrinsics.checkNotNullParameter(parcelMapper, "parcelMapper");
        List<EsimHyperText.Descriptor> list = descriptors;
        int iB = q0.b(w.t(list, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap styles = new LinkedHashMap(iB);
        for (EsimHyperText.Descriptor descriptor : list) {
            String str = descriptor.f100279a;
            styles.put(str, new Click(28, (Integer) null, parcelMapper.invoke(descriptor.f100280b), str, false));
        }
        Custom custom = num != null ? new Custom(num, false, null, false, null, 254) : null;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(styles, "styles");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it8 = styles.entrySet().iterator();
        while (true) {
            i = 0;
            if (!it8.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it8.next();
            String str2 = (String) entry.getKey();
            IntRange intRangeO = (str2.length() != 0 && (iT = d0.T(text, str2, 0, false, 6)) >= 0) ? f.o(iT, str2.length() + iT) : null;
            if (intRangeO != null) {
                linkedHashMap.put(intRangeO, entry.getValue());
            }
        }
        TreeMap treeMapF = q0.f(linkedHashMap, new unj.a());
        e eVarB = u.b();
        for (Map.Entry entry2 : treeMapF.entrySet()) {
            IntRange intRange = (IntRange) entry2.getKey();
            Style style = (Style) entry2.getValue();
            int i2 = intRange.f186448a;
            if (i <= i2) {
                TextClause textClauseA = b.a(text, f.o(i, i2), custom);
                if (textClauseA != null) {
                    eVarB.add(textClauseA);
                }
                TextClause textClauseA2 = b.a(text, intRange, style);
                if (textClauseA2 != null) {
                    eVarB.add(textClauseA2);
                }
                i = intRange.f186449b + 1;
            }
        }
        TextClause textClauseA3 = b.a(text, f.o(i, text.length()), custom);
        if (textClauseA3 != null) {
            eVarB.add(textClauseA3);
        }
        e eVarA = u.a(eVarB);
        return eVarA.size() == 1 ? (Clause) zhm.d0.b0(eVarA) : new CompositeClause(eVarA, null, null, null, 14);
    }

    public final Clause b(String text, List descriptors, List parameters, Map args, Integer num) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(args, "args");
        Iterator it8 = parameters.iterator();
        while (it8.hasNext()) {
            Enum r06 = (Enum) it8.next();
            String str = (String) args.get(r06);
            if (str != null) {
                Regex.Companion companion = Regex.INSTANCE;
                String strName = r06.name();
                companion.getClass();
                text = new Regex(p.a.p("\\$?\\{", Regex.Companion.a(strName), "\\}")).h(text, new k(str, 16));
            }
        }
        return d(this, text, descriptors, num, 8);
    }
}
