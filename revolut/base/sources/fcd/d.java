package fcd;

import com.revolut.feature.shared.savings.models.product.ProductGroupOptions;
import ecd.p2;
import ecd.s2;
import ecd.t2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.text.a0;
import ncd.g;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d {
    public static final ProductGroupOptions.GroupOption a(t2 t2Var, String str) {
        g gVar;
        ncd.b bVar;
        String str2 = t2Var.f124676a;
        p2 p2Var = t2Var.d;
        g[] gVarArrValues = g.values();
        int length = gVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                gVar = null;
                break;
            }
            gVar = gVarArrValues[i];
            if (a0.z(gVar.name(), str2, true)) {
                break;
            }
            i++;
        }
        if (gVar == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Unknown group type: ", t2Var.f124676a));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
            return null;
        }
        String str3 = str == null ? "" : str;
        String str4 = t2Var.f124678c;
        xi0.a aVar = xi0.b.Companion;
        String str5 = p2Var.f124644a;
        aVar.getClass();
        ProductGroupOptions.GroupOption.DisplayRate displayRate = new ProductGroupOptions.GroupOption.DisplayRate(p2Var.f124645b, xi0.a.a(str5));
        String str6 = t2Var.e;
        List<s2> list = t2Var.f;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (s2 s2Var : list) {
            String str7 = s2Var.f124665a;
            String str8 = s2Var.f124666b;
            ncd.b[] bVarArrValues = ncd.b.values();
            int length2 = bVarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    bVar = null;
                    break;
                }
                bVar = bVarArrValues[i2];
                if (a0.z(bVar.name(), str7, true)) {
                    break;
                }
                i2++;
            }
            if (bVar == null) {
                bVar = ncd.b.UNKNOWN;
            }
            arrayList.add(new ProductGroupOptions.GroupOption.Highlight(bVar, str8));
        }
        return new ProductGroupOptions.GroupOption(gVar, str3, str4, displayRate, str6, arrayList);
    }

    public static final t2 b(ProductGroupOptions.GroupOption groupOption, String str) {
        String strName = groupOption.f86597a.name();
        String str2 = groupOption.f86599c;
        ProductGroupOptions.GroupOption.DisplayRate displayRate = groupOption.d;
        p2 p2Var = new p2(displayRate.f86600a.f306286a, displayRate.f86601b);
        String str3 = groupOption.e;
        ArrayList<ProductGroupOptions.GroupOption.Highlight> arrayList = groupOption.f;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (ProductGroupOptions.GroupOption.Highlight highlight : arrayList) {
            ncd.b bVar = highlight.f86602a;
            arrayList2.add(new s2(bVar.name(), highlight.f86603b));
        }
        return new t2(strName, str, str2, p2Var, str3, arrayList2);
    }
}
