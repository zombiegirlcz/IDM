package a8a;

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
import efm.r;
import ez0.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import qv0.i;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c extends d {
    @Override // a8a.d
    public final List a(String filterQuery, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(filterQuery, "filterQuery");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = items.iterator();
        while (it8.hasNext()) {
            i iVar = (i) it8.next();
            RowDelegate.Model modelX = iVar instanceof RowDelegate.Model ? RowDelegate.Model.x((RowDelegate.Model) iVar, null, null, null, null, null, 0, null, false, null, null, 0, 0, 0, 0, null, -1, 15) : null;
            if (modelX != null) {
                arrayList.add(modelX);
            }
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    @Override // a8a.d
    public final boolean b(String query, i model) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(model, "model");
        RowDelegate.Model model2 = (RowDelegate.Model) model;
        Clause clause = model2.f53230c;
        Intrinsics.i(clause, "null cannot be cast to non-null type com.revolut.core.ui_kit.models.TextClause");
        return d0.J(((TextClause) clause).f57936a, query, true) || d0.J(model2.f53228a, query, true);
    }

    @Override // a8a.d
    public r e(Object obj2, Set selectedModelIds, List list) {
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        r rVarStartWith = r.zip(i(), j(), new a6b.a(new a(this, selectedModelIds, 0), 21)).startWith(new Data(null, null, true, 3, null));
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        return rVarStartWith;
    }

    public ff f() {
        return ff.DP_24;
    }

    public String g(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return null;
    }

    public abstract String h(wi0.b bVar);

    public abstract r i();

    public abstract r j();

    public final RowDelegate.Model k(Set set, wi0.b bVar) {
        boolean zContains = set.contains(bVar.f297794a);
        String str = bVar.f297794a;
        TextClause textClause = new TextClause(h(bVar), (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122);
        String strG = g(bVar);
        TextClause textClause2 = strG != null ? new TextClause(strG, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        return new RowDelegate.Model(str, new CountryImage(bVar.f297794a, (Integer) null, (e) null, 14), f(), null, textClause, textClause2, null, null, 0, null, false, zContains, zContains ? LayeredImage.Companion.f(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_check, R$attr.uikit_colorAccent, R$attr.uikit_colorWhite, Integer.valueOf(R$attr.uikit_colorPopoverBackground), 2.0f, BitmapDescriptorFactory.HUE_RED, null, 96) : null, null, null, null, null, null, null, 0, 0, 0, 0, 1073715048);
    }
}
