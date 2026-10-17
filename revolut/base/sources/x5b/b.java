package x5b;

import com.revolut.feature.hyper_text.model.ParameterisedHyperText;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanAdditionalValue;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanAdditionalValueBottomSheet;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanAdditionalValueBottomSheetItem;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanAdditionalValueCta;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanAdditionalValueRow;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanAdditionalValueRowContent;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanAdditionalValueSection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import w5b.b1;
import w5b.e1;
import w5b.k1;
import w5b.m0;
import w5b.p0;
import w5b.s0;
import w5b.v0;
import w5b.y0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b {
    public static final CobrandedCardsPlanAdditionalValue a(v0 v0Var) {
        CobrandedCardsPlanAdditionalValueCta cobrandedCardsPlanAdditionalValueCta;
        ArrayList arrayList;
        CobrandedCardsPlanAdditionalValueBottomSheet cobrandedCardsPlanAdditionalValueBottomSheet;
        String str;
        CobrandedCardsPlanAdditionalValueRowContent icon;
        CobrandedCardsPlanAdditionalValueRowContent text;
        String str2;
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        String str3 = v0Var.f295043a;
        String str4 = v0Var.f295044b;
        s0 s0Var = v0Var.f295045c;
        if (s0Var != null) {
            Intrinsics.checkNotNullParameter(s0Var, "<this>");
            cobrandedCardsPlanAdditionalValueCta = new CobrandedCardsPlanAdditionalValueCta(s0Var.f295004a);
        } else {
            cobrandedCardsPlanAdditionalValueCta = null;
        }
        List list = v0Var.d;
        CobrandedCardsPlanAdditionalValueCta cobrandedCardsPlanAdditionalValueCta2 = cobrandedCardsPlanAdditionalValueCta;
        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            e1 e1Var = (e1) it8.next();
            Intrinsics.checkNotNullParameter(e1Var, "<this>");
            String str5 = e1Var.f294819a;
            String str6 = e1Var.f294820b;
            List<b1> list2 = e1Var.f294821c;
            ArrayList arrayList3 = new ArrayList();
            for (b1 b1Var : list2) {
                Intrinsics.checkNotNullParameter(b1Var, "<this>");
                y0 y0Var = b1Var.f294785b;
                Intrinsics.checkNotNullParameter(y0Var, "<this>");
                String str7 = y0Var.f295079a;
                String str8 = y0Var.f295080b;
                Iterator it9 = it8;
                int iHashCode = str7.hashCode();
                String str9 = str3;
                if (iHashCode != 2241657) {
                    if (iHashCode != 2336762) {
                        if (iHashCode == 2571565 && str7.equals("TEXT") && str8 != null) {
                            text = new CobrandedCardsPlanAdditionalValueRowContent.Text(str8);
                        }
                    } else if (str7.equals("LINK") && str8 != null && (str2 = y0Var.d) != null) {
                        icon = new CobrandedCardsPlanAdditionalValueRowContent.Link(str8, str2);
                        text = icon;
                    }
                    text = null;
                } else {
                    if (str7.equals("ICON") && (str = y0Var.f295081c) != null) {
                        icon = new CobrandedCardsPlanAdditionalValueRowContent.Icon(str);
                        text = icon;
                    }
                    text = null;
                }
                CobrandedCardsPlanAdditionalValueRow cobrandedCardsPlanAdditionalValueRow = text == null ? null : new CobrandedCardsPlanAdditionalValueRow(b1Var.f294784a, text);
                if (cobrandedCardsPlanAdditionalValueRow != null) {
                    arrayList3.add(cobrandedCardsPlanAdditionalValueRow);
                }
                it8 = it9;
                str3 = str9;
            }
            Iterator it10 = it8;
            String str10 = str3;
            m0 m0Var = e1Var.d;
            if (m0Var != null) {
                Intrinsics.checkNotNullParameter(m0Var, "<this>");
                String str11 = m0Var.f294918a;
                String str12 = m0Var.f294919b;
                List<p0> list3 = m0Var.f294920c;
                ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                for (p0 p0Var : list3) {
                    Intrinsics.checkNotNullParameter(p0Var, "<this>");
                    arrayList4.add(new CobrandedCardsPlanAdditionalValueBottomSheetItem(p0Var.f294971a, p0Var.f294972b, p0Var.f294973c));
                }
                cobrandedCardsPlanAdditionalValueBottomSheet = new CobrandedCardsPlanAdditionalValueBottomSheet(str11, str12, arrayList4);
            } else {
                cobrandedCardsPlanAdditionalValueBottomSheet = null;
            }
            arrayList2.add(new CobrandedCardsPlanAdditionalValueSection(str5, str6, arrayList3, cobrandedCardsPlanAdditionalValueBottomSheet));
            it8 = it10;
            str3 = str10;
        }
        String str13 = str3;
        ld7.f fVar = v0Var.e;
        ParameterisedHyperText parameterisedHyperTextA = fVar != null ? md7.a.a(fVar) : null;
        List list4 = v0Var.f;
        if (list4 != null) {
            List list5 = list4;
            ArrayList arrayList5 = new ArrayList(w.t(list5, 10));
            Iterator it11 = list5.iterator();
            while (it11.hasNext()) {
                arrayList5.add(c.b((k1) it11.next()));
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        return new CobrandedCardsPlanAdditionalValue(str13, str4, cobrandedCardsPlanAdditionalValueCta2, arrayList2, parameterisedHyperTextA, arrayList);
    }
}
