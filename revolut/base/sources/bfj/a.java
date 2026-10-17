package bfj;

import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanAttributes;
import dej.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a {
    public static final int a(EsimDataPlan esimDataPlan) {
        Integer num;
        Intrinsics.checkNotNullParameter(esimDataPlan, "<this>");
        EsimDataPlanAttributes esimDataPlanAttributes = esimDataPlan.f100225t;
        if (esimDataPlanAttributes == null || (num = esimDataPlanAttributes.f100229b) == null) {
            return 0;
        }
        return num.intValue();
    }

    public static final boolean b(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            if (((EsimDataPlan) it8.next()).f100214c == m.MOBILE_PLAN) {
                return true;
            }
        }
        return false;
    }

    public static final boolean c(EsimDataPlan esimDataPlan) {
        Intrinsics.checkNotNullParameter(esimDataPlan, "<this>");
        return esimDataPlan.f100214c == m.DATA_PLAN && esimDataPlan.f100217j;
    }
}
