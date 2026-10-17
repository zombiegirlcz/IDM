package wd1;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import et6.a1;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nd1.i;
import s7a.c0;
import sfc.e;
import t70.b;
import x7a.d;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f296452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f296453b;

    public a(i currencyInteractor, b currenciesLocalization) {
        Intrinsics.checkNotNullParameter(currencyInteractor, "currencyInteractor");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        this.f296452a = currencyInteractor;
        this.f296453b = currenciesLocalization;
    }

    @Override // x7a.d
    public final c0 c(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        xi0.a aVar = xi0.b.Companion;
        String str = (String) d0.a0(ids);
        aVar.getClass();
        return new vd1.d(xi0.a.a(str));
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
            if (query.length() == 0 || kotlin.text.d0.J(bVar.f306286a, query, true)) {
                arrayList.add(obj3);
            } else {
                String strB = this.f296453b.b(bVar.f306286a);
                if (pd.b.j(strB != null ? Boolean.valueOf(kotlin.text.d0.J(strB, query, true)) : null)) {
                    arrayList.add(obj3);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (xi0.b bVar2 : arrayList) {
            String str = (String) d0.c0(selectedModelIds);
            String str2 = bVar2.f306286a;
            String str3 = bVar2.f306286a;
            arrayList2.add(new RowDelegate.Model(str3, new RowDelegate.Model.MainImage.Image40(new CurrencyImage(str3, (ImageTransformations) null, (TextLocalisedClause) null, 14), Intrinsics.f(str2, str) ? new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246) : null, null, false, 28), new TextClause(bVar2.f306286a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new CurrencyClause(bVar2, null, null, 6), null, null, 0, null, false, null, false, !Intrinsics.f(str3, str) ? RowDelegate.Model.b.c.f53268a : RowDelegate.Model.b.C0423b.f53267a, null, null, null, null, null, null, null, 0, 0, 0, 0, 536854488));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        return arrayList2;
    }

    @Override // x7a.d
    public final Flow e(String query, boolean z, Object obj2) {
        Intrinsics.checkNotNullParameter(query, "query");
        xi0.a aVar = xi0.b.Companion;
        String str = obj2 instanceof String ? (String) obj2 : null;
        if (str == null) {
            throw new IllegalArgumentException("params must be a non-null String");
        }
        aVar.getClass();
        xi0.b currentSelection = xi0.a.a(str);
        i iVar = this.f296452a;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(currentSelection, "currentSelection");
        e eVar = (e) iVar.f214293a;
        Intrinsics.checkNotNullParameter(currentSelection, "currentSelection");
        return nim.a.v(((a1) eVar.d).c(a1.d), new ou5.a(eVar, currentSelection, 20));
    }
}
