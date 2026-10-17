package xnb;

import com.revolut.feature.shared.savings.models.product.OnboardingConfig;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import yhm.r;

/* JADX INFO: loaded from: classes6.dex */
public final class p implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f307361a;

    public p(q qVar) {
        this.f307361a = qVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        c cVar;
        r rVar = (r) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
        List list = (List) rVar.f314201a;
        od0.i iVar = (od0.i) rVar.f314202b;
        wi0.b bVar = (wi0.b) rVar.f314203c;
        q qVar = this.f307361a;
        qVar.getClass();
        if (list.isEmpty()) {
            throw new IllegalStateException("Invalid state: No products present");
        }
        List<SavingsProductData> list2 = list;
        boolean z = list2 instanceof Collection;
        if (z && list2.isEmpty()) {
            cVar = c.MMF;
        } else {
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                if (!vc.o.m((SavingsProductData) it8.next())) {
                    if (z && list2.isEmpty()) {
                        cVar = c.IAS;
                    } else {
                        for (SavingsProductData savingsProductData : list2) {
                            Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
                            if (!ocd.a.b(savingsProductData)) {
                                Intrinsics.checkNotNullParameter(list, "<this>");
                                if (!ocd.c.h(list)) {
                                    throw new IllegalStateException("Invalid state: unknown product type is has added");
                                }
                                cVar = c.MULTI_TYPES;
                            }
                        }
                        cVar = c.IAS;
                    }
                }
            }
            cVar = c.MMF;
        }
        qv0.i[] elements = {qVar.c(cVar, list, bVar), q.b(cVar, list), q.d(cVar, (OnboardingConfig) iVar.g())};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return listL;
    }
}
