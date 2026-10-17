package wng;

import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import go.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import s7a.c0;
import x7a.d;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.a f298842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final td0.b f298843b;

    public b(f01.a uiKitResources, td0.b currenciesProvider) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(currenciesProvider, "currenciesProvider");
        this.f298842a = uiKitResources;
        this.f298843b = currenciesProvider;
    }

    @Override // x7a.d
    public final c0 c(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        xi0.a aVar = xi0.b.Companion;
        String str = (String) d0.a0(ids);
        aVar.getClass();
        return new a(xi0.a.a(str));
    }

    @Override // x7a.d
    public final List d(Data data, Set selectedModelIds, List list, String query, Object obj2) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        Intrinsics.checkNotNullParameter(query, "query");
        Object content = data.getContent();
        List list2 = content instanceof List ? (List) content : null;
        if (list2 == null) {
            list2 = f0.f322471a;
        }
        ArrayList<xi0.b> arrayList = new ArrayList();
        for (Object obj3 : list2) {
            xi0.b bVar = (xi0.b) obj3;
            boolean zW = kotlin.text.d0.W(query);
            boolean zJ = kotlin.text.d0.J(bVar.f306286a, query, true);
            String string = this.f298842a.b(new CurrencyClause(bVar, null, null, 6)).toString();
            if (zW || zJ || kotlin.text.d0.J(string, query, true)) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (xi0.b bVar2 : arrayList) {
            String str = (String) d0.c0(selectedModelIds);
            boolean z = false;
            if (list != null && list.contains(bVar2.f306286a)) {
                z = true;
            }
            String str2 = bVar2.f306286a;
            arrayList2.add(new RowDelegate.Model(str2, new CurrencyImage(str2, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, null, new CurrencyClause(bVar2, null, null, 6), new TextClause(bVar2.f306286a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, false, str2.equals(str) ? LayeredImage.Companion.f(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_check, R$attr.uikit_colorAccent, R$attr.uikit_colorWhite, null, BitmapDescriptorFactory.HUE_RED, 2.0f, null, 72) : null, (str2.equals(str) || z) ? RowDelegate.Model.b.C0423b.f53267a : RowDelegate.Model.b.c.f53268a, null, null, null, null, null, 0, 0, 0, 0, 1073692524));
        }
        return arrayList2;
    }

    @Override // x7a.d
    public final Flow e(String query, boolean z, Object obj2) {
        Intrinsics.checkNotNullParameter(query, "query");
        Set setC = this.f298843b.c(td0.a.LISTED);
        xi0.a aVar = xi0.b.Companion;
        ArrayList arrayList = new ArrayList(w.t(setC, 10));
        Iterator it8 = setC.iterator();
        while (it8.hasNext()) {
            t61.a.A(aVar, (String) it8.next(), arrayList);
        }
        return new g(new Data(arrayList, null, false, 6, null), 2);
    }
}
