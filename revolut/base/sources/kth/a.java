package kth;

import a0.d;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsListDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.o2;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Document;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.DocumentGroup;
import ez0.e;
import ip0.q7;
import ip0.qd0;
import ip0.vd0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.pc;
import zhm.d0;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static ArrayList a(DocumentGroup documentGroup, List documentGroups) {
        Iterator it8;
        List list;
        String str;
        Intrinsics.checkNotNullParameter(documentGroups, "documentGroups");
        List list2 = documentGroups;
        int i = 10;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it9 = list2.iterator();
        int i2 = 0;
        while (it9.hasNext()) {
            Object next = it9.next();
            int i3 = i2 + 1;
            Throwable th10 = null;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            DocumentGroup documentGroup2 = (DocumentGroup) next;
            qd0 qd0Var = Intrinsics.f(documentGroup2, documentGroup) ? qd0.SELECTED : qd0.UNSELECTED;
            String strN = d.n("DOCS_SELECTABLE_LIST_ITEM_", i2);
            String strN2 = d.n("DOCS_CELL_DETAILS_LIST_ITEM_", i2);
            ArrayList<Document> arrayList2 = documentGroup2.f105594a;
            List list3 = documentGroup2.f105595b;
            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, i));
            for (Document document : arrayList2) {
                arrayList3.add(new q7(new TextClause(document.f105593c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new CountryImage(document.f105591a.f297794a, (Integer) null, (e) null, 14)));
            }
            List list4 = list3.size() == 1 ? list3 : null;
            o2 o2Var = (list4 == null || (str = (String) d0.d0(list4)) == null) ? null : new o2(TagViewData.Companion.d(TagViewData.INSTANCE, str, R$attr.uikit_colorWhite_20, R$attr.uikit_colorWhite));
            if (list3.size() > 1) {
                List list5 = list3;
                ArrayList arrayList4 = new ArrayList(w.t(list5, 10));
                int i5 = 0;
                for (Object obj2 : list5) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        v.s();
                        throw th10;
                    }
                    th10 = null;
                    arrayList4.add(new pc(d.g(i2, i5, "DOCS_CELL_DETAILS_LIST_TAG_ID_", "_"), TagViewData.Companion.d(TagViewData.INSTANCE, (String) obj2, R$attr.uikit_colorWhite_20, R$attr.uikit_colorWhite), null));
                    i5 = i6;
                    i2 = i2;
                    it9 = it9;
                }
                it8 = it9;
                list = arrayList4;
            } else {
                it8 = it9;
                list = f0.f322471a;
            }
            arrayList.add(new SelectableDelegate.Model(strN, new CellDetailsListDelegate.Model(strN2, null, arrayList3, o2Var, list, documentGroup2, 1986), qd0Var, null, vd0.RADIO, true, null, documentGroup2, null, false, 32456));
            i2 = i3;
            it9 = it8;
            i = 10;
        }
        return arrayList;
    }
}
