package jl7;

import com.revolut.feature.insurance_car.impl.data.model.Benefit;
import com.revolut.feature.insurance_car.impl.data.model.BenefitCategory;
import hl7.r;
import hl7.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d {
    public static final Benefit a(r rVar, String baseUrl, boolean z) {
        Benefit.Details details;
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        String str = rVar.f153278a;
        nr7.b bVarA = mr7.b.a(rVar.f153279b);
        String str2 = rVar.f153280c;
        String str3 = rVar.d;
        hl7.o oVar = rVar.e;
        if (oVar != null) {
            Intrinsics.checkNotNullParameter(oVar, "<this>");
            Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
            List<u> list = oVar.f153235a;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            for (u uVar : list) {
                Intrinsics.checkNotNullParameter(uVar, "<this>");
                arrayList.add(new Benefit.KeyParam(uVar.f153323b, uVar.f153324c, mr7.b.a(uVar.f153322a)));
            }
            List list2 = oVar.f153236b;
            List list3 = oVar.f153237c;
            Iterable iterable = oVar.d;
            if (iterable == null) {
                iterable = f0.f322471a;
            }
            Iterable iterable2 = iterable;
            ArrayList arrayList2 = new ArrayList(w.t(iterable2, 10));
            Iterator it8 = iterable2.iterator();
            while (it8.hasNext()) {
                arrayList2.add(mr7.a.a((kr7.a) it8.next(), baseUrl));
            }
            details = new Benefit.Details(arrayList, list2, list3, arrayList2);
        } else {
            details = null;
        }
        return new Benefit(str, bVarA, str2, str3, details, rVar.f153281g, z);
    }

    public static final BenefitCategory b(hl7.l lVar, String baseUrl) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        String str = lVar.f153179a;
        List<r> list = lVar.f153180b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (r rVar : list) {
            String str2 = rVar.f;
            if (str2 == null) {
                throw new IllegalStateException("state is mandatory for this parser");
            }
            arrayList.add(a(rVar, baseUrl, str2.equals("INCLUDED")));
        }
        return new BenefitCategory(str, arrayList);
    }
}
