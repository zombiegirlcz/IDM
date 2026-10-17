package x7a;

import a83.o0;
import akg.n;
import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ff;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlinx.coroutines.flow.Flow;
import t38.e;
import wsg.j;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c extends d {
    @Override // x7a.d
    public List d(Data data, Set selectedModelIds, List list, String query, Object obj2) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        Intrinsics.checkNotNullParameter(query, "query");
        Object content = data.getContent();
        if (content == null) {
            return f0.f322471a;
        }
        ArrayList arrayListL = l(content, selectedModelIds, query, obj2);
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : arrayListL) {
            RowDelegate.Model model = (RowDelegate.Model) obj3;
            Clause clause = model.f53230c;
            Intrinsics.i(clause, "null cannot be cast to non-null type com.revolut.core.ui_kit.models.TextClause");
            if (!d0.J(((TextClause) clause).f57936a, query, true)) {
                Clause clause2 = model.f;
                TextClause textClause = clause2 instanceof TextClause ? (TextClause) clause2 : null;
                String str = textClause != null ? textClause.f57936a : null;
                if ((str == null || !d0.J(str, query, true)) && !d0.J(model.f53228a, query, true)) {
                }
            }
            arrayList.add(obj3);
        }
        List listP0 = zhm.d0.P0(arrayList, cim.b.a(new j(16, query, this), new j(17, query, this)));
        yp0.b.k(listP0, 0, 0, 0, 0, 31);
        return listP0;
    }

    @Override // x7a.d
    public final Flow e(String query, boolean z, Object obj2) {
        Intrinsics.checkNotNullParameter(query, "query");
        return n(obj2);
    }

    public ff i() {
        return ff.DP_24;
    }

    public String j(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return null;
    }

    public abstract String k(wi0.b bVar);

    public ArrayList l(Object data, Set selectedModelIds, String query, Object obj2) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        Intrinsics.checkNotNullParameter(query, "query");
        a aVar = (a) data;
        ArrayList arrayList = aVar.f303175a;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(p(selectedModelIds, (wi0.b) it8.next()));
        }
        ArrayList arrayList3 = aVar.f303176b;
        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
        Iterator it9 = arrayList3.iterator();
        while (it9.hasNext()) {
            arrayList4.add(p(selectedModelIds, (wi0.b) it9.next()));
        }
        return zhm.d0.E0(zhm.d0.P0(arrayList4, new b()), arrayList2);
    }

    public abstract Flow m(Object obj2);

    public n n(Object obj2) {
        return nim.a.v(new e(m(obj2), 24, o(obj2), new o0(3, 23, null)), new x64.a(this, 11));
    }

    public abstract Flow o(Object obj2);

    public final RowDelegate.Model p(Set set, wi0.b bVar) {
        boolean zContains = set.contains(bVar.f297794a);
        String str = bVar.f297794a;
        TextClause textClause = new TextClause(k(bVar), (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122);
        String strJ = j(bVar);
        TextClause textClause2 = strJ != null ? new TextClause(strJ, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        return new RowDelegate.Model(str, !(this instanceof w54.d) ? new CountryImage(bVar.f297794a, (Integer) null, (ez0.e) null, 14) : null, i(), null, textClause, textClause2, null, null, 0, null, false, zContains, zContains ? LayeredImage.Companion.f(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_check, R$attr.uikit_colorAccent, R$attr.uikit_colorWhite, Integer.valueOf(R$attr.uikit_colorPopoverBackground), 2.0f, BitmapDescriptorFactory.HUE_RED, null, 96) : null, null, null, null, null, null, null, 0, 0, 0, 0, 1073715048);
    }
}
