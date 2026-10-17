package kfg;

import hfg.m0;
import hfg.n0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import xfg.i0;
import yfg.q;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public abstract class f {
    public static final ArrayList a(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<n0> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (n0 n0Var : list2) {
            Intrinsics.checkNotNullParameter(n0Var, "<this>");
            String str = n0Var.f151869a;
            String str2 = n0Var.f151870b;
            String str3 = n0Var.f151871c;
            String str4 = n0Var.d;
            String str5 = n0Var.e;
            String str6 = n0Var.f;
            m0 m0Var = n0Var.f151872g;
            Intrinsics.checkNotNullParameter(m0Var, "<this>");
            q.a aVar = new q.a(m0Var.f151866a, m0Var.f151867b);
            m0 m0Var2 = n0Var.f151873h;
            Intrinsics.checkNotNullParameter(m0Var2, "<this>");
            arrayList.add(new q(str, str2, str3, str4, str5, str6, aVar, new q.a(m0Var2.f151866a, m0Var2.f151867b)));
        }
        return arrayList;
    }

    public static final ArrayList b(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<i0> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (i0 i0Var : list2) {
            Intrinsics.checkNotNullParameter(i0Var, "<this>");
            String id10 = i0Var.getId();
            String title = i0Var.getTitle();
            String subtitle = i0Var.getSubtitle();
            String points = i0Var.getPoints();
            String assetUrl = i0Var.getAssetUrl();
            String icon = i0Var.getIcon();
            i0.a departureLocation = i0Var.getDepartureLocation();
            Intrinsics.checkNotNullParameter(departureLocation, "<this>");
            m0 m0Var = new m0(departureLocation.getCityName(), departureLocation.getCountryCode());
            i0.a arrivalLocation = i0Var.getArrivalLocation();
            Intrinsics.checkNotNullParameter(arrivalLocation, "<this>");
            arrayList.add(new n0(id10, title, subtitle, points, assetUrl, icon, m0Var, new m0(arrivalLocation.getCityName(), arrivalLocation.getCountryCode())));
        }
        return arrayList;
    }

    public static final ArrayList c(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<q> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (q qVar : list2) {
            Intrinsics.checkNotNullParameter(qVar, "<this>");
            String id10 = qVar.getId();
            String title = qVar.getTitle();
            String subtitle = qVar.getSubtitle();
            String points = qVar.getPoints();
            String assetUrl = qVar.getAssetUrl();
            String icon = qVar.getIcon();
            q.a departureLocation = qVar.getDepartureLocation();
            Intrinsics.checkNotNullParameter(departureLocation, "<this>");
            m0 m0Var = new m0(departureLocation.getCityName(), departureLocation.getCountryCode());
            q.a arrivalLocation = qVar.getArrivalLocation();
            Intrinsics.checkNotNullParameter(arrivalLocation, "<this>");
            arrayList.add(new n0(id10, title, subtitle, points, assetUrl, icon, m0Var, new m0(arrivalLocation.getCityName(), arrivalLocation.getCountryCode())));
        }
        return arrayList;
    }
}
