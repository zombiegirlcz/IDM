package sic;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.rewards.api.model.rewards.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public static CompositeClause a(ArrayList texts, List prefixClauses, boolean z) {
        Intrinsics.checkNotNullParameter(texts, "texts");
        Intrinsics.checkNotNullParameter(prefixClauses, "prefixClauses");
        aim.e eVarB = u.b();
        eVarB.addAll(prefixClauses);
        ArrayList arrayList = new ArrayList(w.t(texts, 10));
        Iterator it8 = texts.iterator();
        while (it8.hasNext()) {
            AttributedText attributedText = (AttributedText) it8.next();
            String str = attributedText.f84805a;
            boolean z3 = attributedText.f84806b;
            arrayList.add(new TextClause(str, !z ? null : z3 ? new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254) : new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, z3, (o9) null, (List) null, 116));
        }
        eVarB.addAll(arrayList);
        aim.e eVarA = u.a(eVarB);
        if (eVarA.isEmpty()) {
            return null;
        }
        m70.a.t(t0.f186434a);
        return new CompositeClause(eVarA, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public static CompositeClause b(int i, ArrayList arrayList) {
        return a(arrayList, f0.f322471a, (i & 4) == 0);
    }
}
