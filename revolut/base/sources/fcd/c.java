package fcd;

import com.revolut.feature.shared.savings.models.product.SavingsDocument;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import ecd.a5;
import ecd.b4;
import ecd.b6;
import ecd.c6;
import ecd.d5;
import ecd.d6;
import ecd.e5;
import ecd.g4;
import ecd.h3;
import ecd.j4;
import ecd.j5;
import ecd.k4;
import ecd.l3;
import ecd.m4;
import ecd.m5;
import ecd.n5;
import ecd.o3;
import ecd.o4;
import ecd.p4;
import ecd.q4;
import ecd.r3;
import ecd.s3;
import ecd.s4;
import ecd.s5;
import ecd.t5;
import ecd.v3;
import ecd.v4;
import ecd.y3;
import ecd.y5;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0320 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5, types: [com.revolut.feature.shared.savings.models.product.b] */
    /* JADX WARN: Type inference failed for: r21v6, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1, types: [java.time.LocalDateTime] */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1, types: [java.time.LocalDateTime] */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r32v0, types: [com.revolut.feature.shared.savings.models.product.b] */
    /* JADX WARN: Type inference failed for: r6v8, types: [com.revolut.feature.shared.savings.models.product.b[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.shared.savings.models.product.SavingsProduct a(ecd.d6 r39) {
        /*
            Method dump skipped, instruction units count: 1169
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fcd.c.a(ecd.d6):com.revolut.feature.shared.savings.models.product.SavingsProduct");
    }

    public static final d6 b(SavingsProduct savingsProduct) {
        n5 n5Var;
        e5 e5Var;
        h3 h3Var;
        String str;
        String str2;
        c6 c6Var;
        y3 y3Var;
        s4 p4Var;
        d5 d5Var;
        d5 d5Var2;
        j5 j5Var;
        Intrinsics.checkNotNullParameter(savingsProduct, "<this>");
        String str3 = savingsProduct.f86617a;
        String str4 = savingsProduct.f86618b.f306286a;
        String strName = savingsProduct.f86619c.name();
        String strName2 = savingsProduct.d.name();
        SavingsProduct.Provider provider = savingsProduct.e;
        if (provider != null) {
            String str5 = provider.f86666a;
            String strName3 = provider.f86667b.name();
            String str6 = provider.f86668c;
            String str7 = provider.d;
            SavingsProduct.Explanation explanation = provider.f;
            b4 b4Var = explanation != null ? new b4(explanation.f86642a, explanation.f86643b) : null;
            String str8 = provider.e;
            SavingsProduct.Provider.LegalInfo legalInfo = provider.f86669g;
            if (legalInfo != null) {
                String str9 = legalInfo.f86670a;
                SavingsProduct.Provider.TradingEntity tradingEntity = legalInfo.f86671b;
                j5Var = new j5(str9, tradingEntity != null ? new m5(tradingEntity.f86672a) : null);
            } else {
                j5Var = null;
            }
            n5Var = new n5(str5, strName3, str6, str7, str8, b4Var, j5Var);
        } else {
            n5Var = null;
        }
        SavingsProduct.Protection protection = savingsProduct.f;
        if (protection != null) {
            String str10 = protection.f86661a;
            String str11 = protection.f86662b;
            String str12 = protection.d;
            String str13 = protection.f86663c;
            SavingsDocument savingsDocument = protection.e;
            if (savingsDocument != null) {
                if (savingsDocument instanceof SavingsDocument.Link) {
                    SavingsDocument.Link link = (SavingsDocument.Link) savingsDocument;
                    d5Var2 = new d5(null, link.f86610c, link.f86608a);
                } else {
                    if (!(savingsDocument instanceof SavingsDocument.Scope)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    d5Var2 = new d5(((SavingsDocument.Scope) savingsDocument).f86611a, null, null);
                }
                d5Var = d5Var2;
            } else {
                d5Var = null;
            }
            SavingsProduct.Protection.Details details = protection.f;
            e5Var = new e5(str10, str11, str13, str12, d5Var, details != null ? new a5(details.f86664a, details.f86665b) : null);
        } else {
            e5Var = null;
        }
        SavingsProduct.Schedules schedules = savingsProduct.f86620g;
        SavingsProduct.Schedules.Interest interest = schedules.f86673a;
        t5 t5Var = new t5(new s5(interest.f86674a, interest.f86675b.name(), schedules.f86673a.f86676c.name()));
        SavingsProduct.InterestRate interestRate = savingsProduct.f86621h;
        SavingsProduct.Explanation explanation2 = interestRate.e;
        b4 b4Var2 = new b4(explanation2.f86642a, explanation2.f86643b);
        SavingsProduct.Disclaimer disclaimer = interestRate.d;
        r3 r3Var = disclaimer != null ? new r3(disclaimer.f86639a, disclaimer.f86640b) : null;
        SavingsProduct.InterestRate.DisplayProperties displayProperties = interestRate.f86645b;
        v3 v3Var = new v3(displayProperties.f86647a.name(), displayProperties.f86648b);
        SavingsProduct.InterestRate.DisplayProperties displayProperties2 = interestRate.f86646c;
        v3 v3Var2 = displayProperties2 != null ? new v3(displayProperties2.f86647a.name(), displayProperties2.f86648b) : null;
        ArrayList arrayList = interestRate.f86644a;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            SavingsProduct.InterestRate.RateTier rateTier = (SavingsProduct.InterestRate.RateTier) it8.next();
            Iterator it9 = it8;
            long j2 = rateTier.f86652a;
            String str14 = strName;
            Long l2 = rateTier.f86653b;
            SavingsProduct.InterestRate.RatePercentages ratePercentages = rateTier.f86654c;
            arrayList2.add(new j4(j2, l2, new g4(ratePercentages.f86649a, ratePercentages.f86650b, ratePercentages.f86651c, ratePercentages.d, ratePercentages.e)));
            it8 = it9;
            str4 = str4;
            strName = str14;
            strName2 = strName2;
            n5Var = n5Var;
        }
        String str15 = str4;
        String str16 = strName;
        String str17 = strName2;
        n5 n5Var2 = n5Var;
        k4 k4Var = new k4(arrayList2, v3Var, v3Var2, r3Var, b4Var2, interestRate.f);
        String str18 = savingsProduct.i;
        ArrayList<SavingsProduct.Deduction> arrayList3 = savingsProduct.f86622j;
        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
        for (SavingsProduct.Deduction deduction : arrayList3) {
            arrayList4.add(new l3(deduction.f86635b, deduction.d, deduction.f86634a, deduction.f86636c, deduction.e));
        }
        ArrayList<SavingsProduct.Deduction> arrayList5 = savingsProduct.k;
        ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
        for (SavingsProduct.Deduction deduction2 : arrayList5) {
            arrayList6.add(new l3(deduction2.f86635b, deduction2.d, deduction2.f86634a, deduction2.f86636c, deduction2.e));
        }
        ArrayList<SavingsProduct.Limit> arrayList7 = savingsProduct.f86623l;
        ArrayList arrayList8 = new ArrayList(w.t(arrayList7, 10));
        for (SavingsProduct.Limit limit : arrayList7) {
            if (limit instanceof SavingsProduct.Limit.MaxCurrentUsagesLimit) {
                p4Var = new o4(((SavingsProduct.Limit.MaxCurrentUsagesLimit) limit).f86656a);
            } else if (limit instanceof SavingsProduct.Limit.MaxCurrentBalanceLimit) {
                p4Var = new m4(((SavingsProduct.Limit.MaxCurrentBalanceLimit) limit).f86655a);
            } else if (limit instanceof SavingsProduct.Limit.MinCurrentBalanceLimit) {
                p4Var = new q4(((SavingsProduct.Limit.MinCurrentBalanceLimit) limit).f86658a);
            } else {
                if (!(limit instanceof SavingsProduct.Limit.MaxTopUpsLimit)) {
                    throw new NoWhenBranchMatchedException();
                }
                p4Var = new p4(((SavingsProduct.Limit.MaxTopUpsLimit) limit).f86657a);
            }
            arrayList8.add(p4Var);
        }
        ArrayList<SavingsDocument> arrayList9 = savingsProduct.f86624m;
        ArrayList arrayList10 = new ArrayList(w.t(arrayList9, 10));
        for (SavingsDocument savingsDocument2 : arrayList9) {
            if (savingsDocument2 instanceof SavingsDocument.Link) {
                SavingsDocument.Link link2 = (SavingsDocument.Link) savingsDocument2;
                String str19 = link2.f86608a;
                SavingsDocument.DocumentType documentType = link2.f86609b;
                y3Var = new y3(documentType != null ? documentType.f86607a : null, null, link2.f86610c, str19, null);
            } else {
                if (!(savingsDocument2 instanceof SavingsDocument.Scope)) {
                    throw new NoWhenBranchMatchedException();
                }
                SavingsDocument.Scope scope = (SavingsDocument.Scope) savingsDocument2;
                y3Var = new y3(null, scope.f86611a, null, null, scope.f86612b);
            }
            arrayList10.add(y3Var);
        }
        LocalDateTime localDateTime = savingsProduct.f86625n;
        Long lValueOf = localDateTime != null ? Long.valueOf(oi0.d.R(localDateTime)) : null;
        SavingsProduct.Campaign campaign = savingsProduct.o;
        if (campaign != null) {
            String str20 = campaign.f86631a;
            LocalDateTime localDateTime2 = campaign.f86632b;
            Long lValueOf2 = localDateTime2 != null ? Long.valueOf(oi0.d.R(localDateTime2)) : null;
            LocalDateTime localDateTime3 = campaign.f86633c;
            h3Var = new h3(str20, lValueOf2, localDateTime3 != null ? Long.valueOf(oi0.d.R(localDateTime3)) : null, campaign.d, campaign.e.name(), campaign.f);
        } else {
            h3Var = null;
        }
        String str21 = savingsProduct.f86626p;
        String str22 = savingsProduct.f86627q;
        String strName4 = savingsProduct.f86628r.name();
        List<SavingsProduct.ProductRestriction> list = savingsProduct.f86629s;
        ArrayList arrayList11 = new ArrayList(w.t(list, 10));
        for (SavingsProduct.ProductRestriction productRestriction : list) {
            arrayList11.add(new v4(productRestriction.f86659a.name(), productRestriction.f86660b));
            str21 = str21;
        }
        String str23 = str21;
        SavingsProduct.DepositLimits depositLimits = savingsProduct.f86630t;
        o3 o3Var = depositLimits != null ? new o3(depositLimits.f86637a, depositLimits.f86638b) : null;
        SavingsProduct.Disclaimers disclaimers = savingsProduct.u;
        s3 s3Var = disclaimers != null ? new s3(disclaimers.f86641a) : null;
        SavingsProduct.Term term = savingsProduct.v;
        if (term != null) {
            String str24 = term.f86677a;
            str = str22;
            SavingsProduct.Term.Maturity maturity = term.f86678b;
            str2 = strName4;
            c6Var = new c6(str24, new b6(maturity.f86681a, maturity.f86682b), new y5(term.f86679c.f86680a));
        } else {
            str = str22;
            str2 = strName4;
            c6Var = null;
        }
        return new d6(str3, str15, str16, str17, n5Var2, e5Var, t5Var, k4Var, str18, arrayList4, arrayList6, arrayList8, arrayList10, lValueOf, h3Var, str23, str, str2, arrayList11, o3Var, s3Var, c6Var);
    }
}
