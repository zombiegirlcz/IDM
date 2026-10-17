package aj3;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ff;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.chooser.ChooserConfiguration;
import com.revolut.feature.chooser.ChooserScreenContract$Model;
import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import qv0.p;
import y7a.w;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends a8a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChooserConfiguration f5384a;

    public f(ChooserConfiguration chooserConfiguration) {
        Intrinsics.checkNotNullParameter(chooserConfiguration, "chooserConfiguration");
        this.f5384a = chooserConfiguration;
    }

    @Override // a8a.d
    public final List a(String filterQuery, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(filterQuery, "filterQuery");
        if (!d0.W(filterQuery)) {
            yp0.b.k(items, 0, 0, 0, 0, 31);
            return items;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = items.iterator();
        while (it8.hasNext()) {
            qv0.i iVar = (qv0.i) it8.next();
            Intrinsics.i(iVar, "null cannot be cast to non-null type com.revolut.core.ui_kit.items.ParcelItem");
            Object f = ((p) iVar).getF55256g();
            ChooserScreenContract$Model chooserScreenContract$Model = f instanceof ChooserScreenContract$Model ? (ChooserScreenContract$Model) f : null;
            if ((chooserScreenContract$Model != null ? chooserScreenContract$Model.d : null) == qi3.p.HEADER) {
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                arrayList.addAll(arrayList2);
                arrayList2.clear();
                arrayList.add(iVar);
            } else {
                qv0.i iVar2 = iVar;
                yp0.b.r(iVar2, 0, 0, 0, 0, 15);
                arrayList2.add(iVar2);
            }
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    @Override // a8a.d
    public final boolean b(String query, qv0.i model) {
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(model, "model");
        if (d0.W(query)) {
            return true;
        }
        Object f = ((p) model).getF55256g();
        ChooserScreenContract$Model chooserScreenContract$Model = f instanceof ChooserScreenContract$Model ? (ChooserScreenContract$Model) f : null;
        if (chooserScreenContract$Model != null) {
            return (d0.J(chooserScreenContract$Model.f65904b, query, true) || (((str = chooserScreenContract$Model.f) != null && d0.J(str, query, true)) || (((str2 = chooserScreenContract$Model.e) != null && d0.J(str2, query, true)) || ((str3 = chooserScreenContract$Model.f65906g) != null && d0.J(str3, query, true))))) && (chooserScreenContract$Model.d != qi3.p.HEADER);
        }
        return true;
    }

    @Override // a8a.d
    public final w d(Set ids, Object obj2) {
        Object next;
        Intrinsics.checkNotNullParameter(ids, "ids");
        ChooserConfiguration chooserConfiguration = this.f5384a;
        Iterator it8 = chooserConfiguration.f65890a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((ChooserScreenContract$Model) next).f65903a, zhm.d0.a0(ids))) {
                break;
            }
        }
        ChooserScreenContract$Model chooserScreenContract$Model = (ChooserScreenContract$Model) next;
        if (chooserScreenContract$Model != null) {
            return new d(chooserScreenContract$Model);
        }
        Object objA0 = zhm.d0.a0(ids);
        List list = chooserConfiguration.f65890a;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            arrayList.add(((ChooserScreenContract$Model) it9.next()).f65903a);
        }
        throw new IllegalStateException("id=" + objA0 + " is not found in chooser items (availableIds=" + arrayList + ")");
    }

    @Override // a8a.d
    public final r e(Object obj2, Set selectedModelIds, List list) {
        gx0.a model;
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        List<ChooserScreenContract$Model> list2 = this.f5384a.f65890a;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (ChooserScreenContract$Model chooserScreenContract$Model : list2) {
            Clause clause = chooserScreenContract$Model.f65905c;
            Clause textClause = clause == null ? new TextClause(chooserScreenContract$Model.f65904b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : clause;
            String str = chooserScreenContract$Model.e;
            TextClause textClause2 = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
            int i = e.f5383a[chooserScreenContract$Model.d.ordinal()];
            if (i == 1) {
                model = new RowDelegate.Model(chooserScreenContract$Model.f65903a, chooserScreenContract$Model.f65907h, ff.DP_40, null, textClause, textClause2, null, null, 0, null, false, chooserScreenContract$Model.f65908j, chooserScreenContract$Model.f65908j ? new ResourceImage(R$drawable.uikit_icn_24_check_success, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246) : null, null, null, null, null, chooserScreenContract$Model, null, 0, 0, 0, 0, 1056939880);
            } else {
                if (i == 2) {
                    throw new IllegalArgumentException("Not supported in bridge");
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalArgumentException("Not supported in bridge");
                }
                model = new ListSubheaderDelegate.Model(chooserScreenContract$Model.f65903a, (Image) null, textClause, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) chooserScreenContract$Model, (Parcelable) null, 0, 0, 0, 0, 64506);
            }
            arrayList.add(model);
        }
        r rVarJust = r.just(new Data(arrayList, null, false, 6, null));
        Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
        return rVarJust;
    }
}
