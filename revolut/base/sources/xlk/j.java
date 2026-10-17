package xlk;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanBenefitGroupItem;
import do3.n;
import hha.w;
import hha.x;
import hha.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jgk.b;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements jgk.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f307041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ckk.a f307042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f307043c;

    public j(ang.f userInteractor, zlk.b suggestedFeaturesProvider, ckk.a featureListResourceFactory, h featureListItemFactory, c benefitsComposer) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(suggestedFeaturesProvider, "suggestedFeaturesProvider");
        Intrinsics.checkNotNullParameter(featureListResourceFactory, "featureListResourceFactory");
        Intrinsics.checkNotNullParameter(featureListItemFactory, "featureListItemFactory");
        Intrinsics.checkNotNullParameter(benefitsComposer, "benefitsComposer");
        this.f307041a = userInteractor;
        this.f307042b = featureListResourceFactory;
        this.f307043c = featureListItemFactory;
    }

    public static Data a(j jVar, b bVar, hha.d selectedPlan, a expandedState, n user, List featureItems) {
        Intrinsics.checkNotNullParameter(featureItems, "featureItems");
        List<Data> list = featureItems;
        boolean z = list instanceof Collection;
        boolean z3 = false;
        if (!z || !list.isEmpty()) {
            for (Data data : list) {
                Intrinsics.h(data);
                if (!i2b.a.k(data)) {
                    h hVar = jVar.f307043c;
                    w groupName = bVar.f307030a;
                    Intrinsics.checkNotNullParameter(groupName, "groupName");
                    b.c groupStyle = b.c.f174067a;
                    Intrinsics.checkNotNullParameter(groupStyle, "groupStyle");
                    Intrinsics.checkNotNullParameter(selectedPlan, "selectedPlan");
                    Intrinsics.checkNotNullParameter(expandedState, "expandedState");
                    Intrinsics.checkNotNullParameter(user, "user");
                    return zi0.c.P(jVar.createFlatItemsList(null, featureItems), false, null, 3);
                }
            }
        }
        f0 f0Var = f0.f322471a;
        if (!z || !list.isEmpty()) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                if (((Data) it8.next()).getLoading()) {
                    z3 = true;
                    break;
                }
            }
        }
        return new Data(f0Var, null, z3, 2, null);
    }

    public static y b(PlanBenefitGroupItem.Combined combined) {
        ArrayList arrayList = combined.f102643b;
        if (!arrayList.isEmpty()) {
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                y yVar = ((x) it8.next()).f152370b;
                y yVar2 = y.ENABLED;
                if (yVar == yVar2) {
                    return yVar2;
                }
            }
        }
        return y.LOCKED;
    }

    private final List<qv0.i> createFlatItemsList(qv0.i iVar, List<? extends Data<? extends qv0.i>> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Data) obj2).getContent() != null) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            Object content = ((Data) it8.next()).getContent();
            Intrinsics.i(content, "null cannot be cast to non-null type com.revolut.core.ui_kit.items.BoxListItem");
            arrayList2.add((qv0.i) content);
        }
        if (iVar instanceof ListSubheaderDelegate.Model) {
            return yp0.b.g(arrayList2, (ListSubheaderDelegate.Model) iVar, null, 0, 0, 126);
        }
        if (iVar == null) {
            yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
            return arrayList2;
        }
        aim.e eVarB = u.b();
        eVarB.add(iVar);
        eVarB.addAll(arrayList2);
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return eVarA;
    }
}
