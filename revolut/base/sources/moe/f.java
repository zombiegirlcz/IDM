package moe;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_resources.R$attr;
import efm.r;
import i26.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import mlk.a0;
import mlk.b0;
import o8b.g;
import org.jetbrains.annotations.NotNull;
import qv0.i;
import y7a.w;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends a8a.d {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.b f207649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fk3.a f207650b;

    public f(n8b.b countryUtils, fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(countryUtils, "countryUtils");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f207649a = countryUtils;
        this.f207650b = configurationInteractor;
    }

    public static ListSubheaderDelegate.Model f(int i, String str) {
        return new ListSubheaderDelegate.Model(str, (Image) null, (Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }

    @Override // a8a.d
    public final List a(String filterQuery, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(filterQuery, "filterQuery");
        if (!d0.W(filterQuery)) {
            yp0.b.k(items, 0, 0, 0, 0, 31);
            return items;
        }
        ArrayList arrayListS = t61.a.s("<this>", items);
        ArrayList arrayList = new ArrayList();
        Iterator it8 = items.iterator();
        ListSubheaderDelegate.Model model = null;
        int i = 0;
        while (it8.hasNext()) {
            int i2 = i + 1;
            i iVar = (i) it8.next();
            if (iVar instanceof ListSubheaderDelegate.Model) {
                if (!arrayList.isEmpty()) {
                    w7a.a.a(arrayListS, arrayList, model);
                    arrayList.clear();
                }
                model = (ListSubheaderDelegate.Model) iVar;
            } else {
                arrayList.add(iVar);
                if (i == v.j(items)) {
                    w7a.a.a(arrayListS, arrayList, model);
                }
            }
            i = i2;
        }
        return arrayListS;
    }

    @Override // a8a.d
    public final boolean b(String query, i model) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(model, "model");
        if (!(model instanceof RowDelegate.Model)) {
            return false;
        }
        RowDelegate.Model model2 = (RowDelegate.Model) model;
        Clause clause = model2.f53230c;
        Intrinsics.i(clause, "null cannot be cast to non-null type com.revolut.core.ui_kit.models.TextClause");
        return d0.J(((TextClause) clause).f57936a, query, true) || d0.J(model2.f53228a, query, true);
    }

    @Override // a8a.d
    public final w d(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.screens.picker.TaxResidencyPickerParams");
        List list = ((a) obj2).f207644c;
        wi0.a aVar = wi0.b.Companion;
        String str = (String) zhm.d0.a0(ids);
        aVar.getClass();
        return new b(l.k(list, wi0.a.a(str)));
    }

    @Override // a8a.d
    public final r e(Object obj2, Set selectedModelIds, List list) {
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.screens.picker.TaxResidencyPickerParams");
        a aVar = (a) obj2;
        List list2 = aVar.f207643b;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((zme.f) it8.next()).f323482a);
        }
        List list3 = aVar.f207644c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list3) {
            if (!arrayList.contains(((zme.l) obj3).f323500a)) {
                arrayList2.add(obj3);
            }
        }
        efm.d0 d0VarI = ((ik3.c) this.f207650b).i();
        b0 b0Var = new b0(new c(aVar, 0, arrayList2, this), 9);
        d0VarI.getClass();
        ufm.i iVar = new ufm.i(d0VarI, b0Var, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        sfm.b bVar = new sfm.b(iVar, new b0(new a0(17), 8), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        return bVar;
    }

    public final RowDelegate.Model g(zme.l lVar) {
        String str = lVar.f323500a.f297794a;
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(new CountryImage(lVar.f323500a.f297794a, (Integer) null, (ez0.e) null, 14), null, null, false, null, false, 62), new TextClause(((g) this.f207649a).a(str), (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, lVar, null, 0, 0, 0, 0, 532676600);
    }
}
