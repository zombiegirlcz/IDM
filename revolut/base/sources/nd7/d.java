package nd7;

import aim.e;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.hyper_text.model.HyperTextDescriptor;
import com.revolut.feature.hyper_text.model.HyperTextTarget;
import com.revolut.feature.hyper_text.model.ParameterisedHyperTextContent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import n8i.q0;
import zhm.r0;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class d {
    public d(c clauseStyleApplier) {
        Intrinsics.checkNotNullParameter(clauseStyleApplier, "clauseStyleApplier");
    }

    public static Clause a(d dVar, ParameterisedHyperTextContent content) {
        int i;
        int iT;
        Map args = r0.g();
        dVar.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(args, "args");
        q0 parcelMapper = new q0(29);
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(parcelMapper, "parcelMapper");
        String text = content.f74759a;
        content.f74761c.isEmpty();
        ArrayList arrayList = content.f74760b;
        ArrayList styles = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (true) {
            b bVar = null;
            if (!it8.hasNext()) {
                break;
            }
            HyperTextDescriptor hyperTextDescriptor = (HyperTextDescriptor) it8.next();
            HyperTextTarget hyperTextTarget = hyperTextDescriptor.f74755b;
            if (hyperTextTarget != null) {
                String str = hyperTextDescriptor.f74754a;
                bVar = new b(str, new Click(28, (Integer) null, parcelMapper.invoke(hyperTextTarget), str, false));
            }
            if (bVar != null) {
                styles.add(bVar);
            }
        }
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(styles, "styles");
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : styles) {
            if (hashSet.add(((b) obj2).f214332a)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it9 = arrayList2.iterator();
        while (true) {
            i = 0;
            if (!it9.hasNext()) {
                break;
            }
            b bVar2 = (b) it9.next();
            String str2 = bVar2.f214332a;
            String str3 = bVar2.f214332a;
            a aVar = (str2.length() != 0 && (iT = d0.T(text, str3, 0, false, 6)) >= 0) ? new a(iT, str3.length() + iT, bVar2.f214333b) : null;
            if (aVar != null) {
                arrayList3.add(aVar);
            }
        }
        List<a> listP0 = zhm.d0.P0(arrayList3, cim.b.a(new q0(27), new q0(28)));
        e eVarB = u.b();
        int i2 = 0;
        for (a aVar2 : listP0) {
            if (aVar2.f214329a >= i2) {
                eVarB.add(aVar2);
                i2 = aVar2.f214330b;
            }
        }
        e eVarA = u.a(eVarB);
        e eVarB2 = u.b();
        ListIterator listIterator = eVarA.listIterator(0);
        while (true) {
            aim.b bVar3 = (aim.b) listIterator;
            if (!bVar3.hasNext()) {
                break;
            }
            a aVar3 = (a) bVar3.next();
            int i3 = aVar3.f214329a;
            int i5 = aVar3.f214330b;
            String strSubstring = text.substring(i, i3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            c.a(eVarB2, strSubstring, null);
            String strSubstring2 = text.substring(aVar3.f214329a, i5);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            c.a(eVarB2, strSubstring2, aVar3.f214331c);
            i = i5;
        }
        String strSubstring3 = text.substring(i);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
        c.a(eVarB2, strSubstring3, null);
        e eVarA2 = u.a(eVarB2);
        TextClause textClause = (TextClause) zhm.d0.M0(eVarA2);
        return textClause != null ? textClause : new CompositeClause(eVarA2, null, null, null, 14);
    }
}
