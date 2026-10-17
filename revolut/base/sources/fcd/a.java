package fcd;

import com.revolut.feature.shared.savings.models.product.ProductGroup;
import ecd.a1;
import ecd.b2;
import ecd.c0;
import ecd.d1;
import ecd.e2;
import ecd.f0;
import ecd.g1;
import ecd.h2;
import ecd.i0;
import ecd.i2;
import ecd.j1;
import ecd.l0;
import ecd.m1;
import ecd.o0;
import ecd.p1;
import ecd.s;
import ecd.s0;
import ecd.s1;
import ecd.v;
import ecd.v0;
import ecd.v1;
import ecd.y1;
import ecd.z;
import ecd.z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ncd.k;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    public static final ProductGroup.RateConfig a(z0 z0Var) {
        return new ProductGroup.RateConfig(z0Var.f124718a, z0Var.f124719b, z0Var.f124720c, z0Var.d);
    }

    public static final ProductGroup.TextWithExplanation b(b2 b2Var) {
        Intrinsics.checkNotNullParameter(b2Var, "<this>");
        String str = b2Var.f124494a;
        i0 i0Var = b2Var.f124495b;
        return new ProductGroup.TextWithExplanation(str, i0Var != null ? new ProductGroup.ExplanationWithLabel(i0Var.f124569a, i0Var.f124570b, i0Var.f124571c) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.shared.savings.models.product.ProductGroup c(ecd.i2 r33) {
        /*
            Method dump skipped, instruction units count: 997
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fcd.a.c(ecd.i2):com.revolut.feature.shared.savings.models.product.ProductGroup");
    }

    public static final z0 d(ProductGroup.RateConfig rateConfig) {
        return new z0(rateConfig.f86570a, rateConfig.f86571b, rateConfig.f86572c, rateConfig.d);
    }

    public static final b2 e(ProductGroup.TextWithExplanation textWithExplanation) {
        Intrinsics.checkNotNullParameter(textWithExplanation, "<this>");
        String str = textWithExplanation.f86588a;
        ProductGroup.ExplanationWithLabel explanationWithLabel = textWithExplanation.f86589b;
        return new b2(str, explanationWithLabel != null ? new i0(explanationWithLabel.f86552a, explanationWithLabel.f86553b, explanationWithLabel.f86554c) : null);
    }

    public static final i2 f(ProductGroup productGroup) {
        a1 a1Var;
        String str;
        j1 j1Var;
        g1 g1Var;
        o0 o0Var;
        o0 o0Var2;
        o0 o0Var3;
        l0 l0Var;
        s sVar;
        v vVar;
        m1 m1Var;
        String strName;
        Intrinsics.checkNotNullParameter(productGroup, "<this>");
        String strName2 = productGroup.f86521a.name();
        String strName3 = productGroup.f86522b.name();
        String str2 = productGroup.f86523c.f306286a;
        ProductGroup.InterestRatesConfig interestRatesConfig = productGroup.d;
        ProductGroup.RateConfig rateConfig = interestRatesConfig.f86561a;
        z0 z0VarD = rateConfig != null ? d(rateConfig) : null;
        ProductGroup.RateConfig rateConfig2 = interestRatesConfig.f86562b;
        z0 z0VarD2 = rateConfig2 != null ? d(rateConfig2) : null;
        ProductGroup.RateConfig rateConfig3 = interestRatesConfig.f86563c;
        z0 z0VarD3 = rateConfig3 != null ? d(rateConfig3) : null;
        ProductGroup.RateConfig rateConfig4 = interestRatesConfig.d;
        z0 z0VarD4 = rateConfig4 != null ? d(rateConfig4) : null;
        ProductGroup.RateConfig rateConfig5 = interestRatesConfig.e;
        z0 z0VarD5 = rateConfig5 != null ? d(rateConfig5) : null;
        ProductGroup.BreakdownDisclaimer breakdownDisclaimer = interestRatesConfig.f;
        v0 v0Var = breakdownDisclaimer != null ? new v0(breakdownDisclaimer.f86539a, breakdownDisclaimer.f86540b) : null;
        k kVar = interestRatesConfig.f86564g;
        String strName4 = kVar != null ? kVar.name() : null;
        String strName5 = interestRatesConfig.f86565h.name();
        ProductGroup.BreakdownConfig breakdownConfig = interestRatesConfig.i;
        ProductGroup.BreakdownDisclaimer breakdownDisclaimer2 = breakdownConfig.f86537a;
        v0 v0Var2 = new v0(breakdownDisclaimer2.f86539a, breakdownDisclaimer2.f86540b);
        ArrayList<ProductGroup.BreakdownItem> arrayList = breakdownConfig.f86538b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (ProductGroup.BreakdownItem breakdownItem : arrayList) {
            if (breakdownItem instanceof ProductGroup.BreakdownItem.InterestRate) {
                strName = ((ProductGroup.BreakdownItem.InterestRate) breakdownItem).f86542a.name();
            } else if (breakdownItem instanceof ProductGroup.BreakdownItem.Fees) {
                strName = "FEES";
            } else {
                if (!(breakdownItem instanceof ProductGroup.BreakdownItem.Taxes)) {
                    throw new NoWhenBranchMatchedException();
                }
                strName = "TAXES";
            }
            arrayList2.add(strName);
        }
        a1 a1Var2 = new a1(z0VarD, z0VarD2, z0VarD3, z0VarD4, z0VarD5, v0Var, strName4, strName5, new s0(v0Var2, arrayList2), interestRatesConfig.f86566j, interestRatesConfig.k.name());
        String str3 = productGroup.e;
        String str4 = productGroup.f;
        String str5 = productGroup.f86524g;
        ProductGroup.UpsellConfig upsellConfig = productGroup.f86525h;
        ProductGroup.TextWithExplanation textWithExplanation = upsellConfig.f86592a;
        b2 b2VarE = textWithExplanation != null ? e(textWithExplanation) : null;
        ProductGroup.TextWithExplanation textWithExplanation2 = upsellConfig.f86593b;
        h2 h2Var = new h2(b2VarE, textWithExplanation2 != null ? e(textWithExplanation2) : null);
        ProductGroup.CurrencySelectionScreen currencySelectionScreen = productGroup.i;
        z zVar = new z(currencySelectionScreen.f86546a, currencySelectionScreen.f86547b);
        ProductGroup.RiskConfig riskConfig = productGroup.f86533s;
        if (riskConfig != null) {
            String str6 = riskConfig.f86573a;
            String str7 = riskConfig.f86574b;
            String str8 = riskConfig.f86575c;
            ProductGroup.CapitalAtRiskInformation capitalAtRiskInformation = riskConfig.d;
            String str9 = capitalAtRiskInformation.f86544a;
            ProductGroup.Action action = capitalAtRiskInformation.f86545b;
            if (action != null) {
                a1Var = a1Var2;
                sVar = new s(action.f86535a, action.f86536b);
            } else {
                a1Var = a1Var2;
                sVar = null;
            }
            v vVar2 = new v(str9, sVar);
            ProductGroup.SafetyInformation safetyInformation = riskConfig.e;
            String str10 = safetyInformation.f86579a;
            ProductGroup.RiskIndicator riskIndicator = safetyInformation.f86580b;
            if (riskIndicator != null) {
                vVar = vVar2;
                str = str3;
                m1Var = new m1(riskIndicator.f86576a, riskIndicator.f86577b, riskIndicator.f86578c, riskIndicator.d);
            } else {
                vVar = vVar2;
                str = str3;
                m1Var = null;
            }
            j1Var = new j1(str6, str7, str8, vVar, new p1(str10, m1Var));
        } else {
            a1Var = a1Var2;
            str = str3;
            j1Var = null;
        }
        ProductGroup.InfoItemConfig infoItemConfig = productGroup.f86534t;
        l0 l0Var2 = infoItemConfig != null ? new l0(infoItemConfig.f86555a, infoItemConfig.f86556b, infoItemConfig.f86557c) : null;
        ProductGroup.ProductArticle productArticle = productGroup.f86526j;
        if (productArticle != null) {
            String str11 = productArticle.f86567a;
            LinkedHashMap linkedHashMap = productArticle.f86568b;
            ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                arrayList3.add(new d1((String) entry.getKey(), (String) entry.getValue()));
            }
            g1Var = new g1(str11, arrayList3, Boolean.valueOf(productArticle.f86569c), productArticle.d);
        } else {
            g1Var = null;
        }
        List list = productGroup.k;
        ArrayList arrayList4 = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            ProductGroup.Tax tax = (ProductGroup.Tax) it8.next();
            String str12 = tax.f86582a;
            String str13 = tax.f86583b;
            List<ProductGroup.TaxBand> list2 = tax.f86584c;
            Iterator it9 = it8;
            ArrayList arrayList5 = new ArrayList(w.t(list2, 10));
            for (ProductGroup.TaxBand taxBand : list2) {
                arrayList5.add(new v1(taxBand.f86585a, taxBand.f86586b, taxBand.f86587c));
                str12 = str12;
                str13 = str13;
            }
            arrayList4.add(new y1(str12, str13, tax.d, tax.e, arrayList5));
            it8 = it9;
        }
        String strName6 = productGroup.f86527l.name();
        ProductGroup.TransfersConfig transfersConfig = productGroup.f86528m;
        e2 e2Var = transfersConfig != null ? new e2(transfersConfig.f86590a, transfersConfig.f86591b) : null;
        ProductGroup.InterestPayoutConfig interestPayoutConfig = productGroup.o;
        if (interestPayoutConfig != null) {
            String str14 = interestPayoutConfig.f86558a;
            String str15 = interestPayoutConfig.f86559b;
            String str16 = interestPayoutConfig.f86560c;
            ProductGroup.Explanation explanation = interestPayoutConfig.d;
            o0Var = new o0(str14, str16, str15, explanation != null ? new f0(explanation.f86550a, explanation.f86551b) : null);
        } else {
            o0Var = null;
        }
        ProductGroup.InterestPayoutConfig interestPayoutConfig2 = productGroup.f86529n;
        if (interestPayoutConfig2 != null) {
            String str17 = interestPayoutConfig2.f86558a;
            String str18 = interestPayoutConfig2.f86559b;
            String str19 = interestPayoutConfig2.f86560c;
            ProductGroup.Explanation explanation2 = interestPayoutConfig2.d;
            o0Var2 = new o0(str17, str19, str18, explanation2 != null ? new f0(explanation2.f86550a, explanation2.f86551b) : null);
        } else {
            o0Var2 = null;
        }
        ProductGroup.Action action2 = productGroup.f86530p;
        s sVar2 = action2 != null ? new s(action2.f86535a, action2.f86536b) : null;
        ProductGroup.DocumentsConfig documentsConfig = productGroup.f86531q;
        c0 c0Var = documentsConfig != null ? new c0(documentsConfig.f86548a, documentsConfig.f86549b) : null;
        ProductGroup.InfoItemConfig infoItemConfig2 = productGroup.u;
        if (infoItemConfig2 != null) {
            o0Var3 = o0Var;
            l0Var = new l0(infoItemConfig2.f86555a, infoItemConfig2.f86556b, infoItemConfig2.f86557c);
        } else {
            o0Var3 = o0Var;
            l0Var = null;
        }
        ProductGroup.Action action3 = productGroup.f86532r;
        s sVar3 = action3 != null ? new s(action3.f86535a, action3.f86536b) : null;
        ProductGroup.SelectionScreens selectionScreens = productGroup.v;
        return new i2(strName2, strName3, str2, a1Var, str, str4, str5, h2Var, zVar, j1Var, l0Var2, g1Var, arrayList4, strName6, e2Var, o0Var2, o0Var3, sVar2, c0Var, sVar3, l0Var, selectionScreens != null ? new s1(selectionScreens.f86581a) : null);
    }
}
