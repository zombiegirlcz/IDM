package x5b;

import com.revolut.feature.hyper_text.model.ParameterisedHyperText;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsBenefit;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsBenefitInformation;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsBenefitInformationItem;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsCardConfiguration;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlan;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanCardFees;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanCardFeesBreakdown;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanDashboard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import w5b.a0;
import w5b.h1;
import w5b.k1;
import w5b.l;
import w5b.o;
import w5b.q1;
import w5b.t1;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f302926a = r0.k(new Pair("KEEP", r5b.i.KEEP), new Pair("SUBSCRIBE", r5b.i.SUBSCRIBE), new Pair("SUBSCRIBE_WITH_BENEFITS", r5b.i.SUBSCRIBE_WITH_BENEFITS), new Pair("DOWNGRADE", r5b.i.DOWNGRADE));

    public static final CobrandedCardsCardConfiguration a(a0 a0Var) {
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        return new CobrandedCardsCardConfiguration(a0Var.f294771a, a0Var.f294772b);
    }

    public static final CobrandedCardsPlanCardFees b(k1 k1Var) {
        Intrinsics.checkNotNullParameter(k1Var, "<this>");
        String str = k1Var.f294895a;
        String str2 = k1Var.f294896b;
        h1 h1Var = k1Var.f294897c;
        Intrinsics.checkNotNullParameter(h1Var, "<this>");
        return new CobrandedCardsPlanCardFees(str, str2, new CobrandedCardsPlanCardFeesBreakdown(h1Var.f294860a, h1Var.f294861b, h1Var.f294862c));
    }

    public static final CobrandedCardsPlanDashboard c(q1 q1Var) {
        r5b.i iVar;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        CobrandedCardsBenefitInformation cobrandedCardsBenefitInformation;
        String str7 = "<this>";
        Intrinsics.checkNotNullParameter(q1Var, "<this>");
        String str8 = q1Var.f294982a;
        String str9 = q1Var.f294983b;
        List list = q1Var.f294984c;
        int i = 10;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            t1 t1Var = (t1) it8.next();
            Intrinsics.checkNotNullParameter(t1Var, str7);
            String str10 = t1Var.f295013a;
            String str11 = t1Var.f295014b;
            String str12 = t1Var.f295015c;
            String str13 = t1Var.d;
            String str14 = t1Var.e;
            List list2 = t1Var.f;
            ArrayList arrayList2 = new ArrayList(w.t(list2, i));
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                w5b.i iVar2 = (w5b.i) it9.next();
                Intrinsics.checkNotNullParameter(iVar2, str7);
                String str15 = iVar2.f294870a;
                Iterator it10 = it8;
                String str16 = iVar2.f294871b;
                Iterator it11 = it9;
                l lVar = iVar2.f294872c;
                if (lVar != null) {
                    Intrinsics.checkNotNullParameter(lVar, str7);
                    str3 = str10;
                    String str17 = lVar.f294906a;
                    str4 = str11;
                    String str18 = lVar.f294907b;
                    List list3 = lVar.f294908c;
                    str5 = str12;
                    str2 = str8;
                    str6 = str13;
                    ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                    Iterator it12 = list3.iterator();
                    while (it12.hasNext()) {
                        o oVar = (o) it12.next();
                        Intrinsics.checkNotNullParameter(oVar, str7);
                        arrayList3.add(new CobrandedCardsBenefitInformationItem(oVar.f294958a, oVar.f294959b, oVar.f294960c));
                        it12 = it12;
                        str7 = str7;
                    }
                    str = str7;
                    cobrandedCardsBenefitInformation = new CobrandedCardsBenefitInformation(str17, str18, arrayList3);
                } else {
                    str = str7;
                    str2 = str8;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    str6 = str13;
                    cobrandedCardsBenefitInformation = null;
                }
                arrayList2.add(new CobrandedCardsBenefit(str15, str16, cobrandedCardsBenefitInformation, iVar2.d));
                it9 = it11;
                str10 = str3;
                str11 = str4;
                str12 = str5;
                str13 = str6;
                it8 = it10;
                str8 = str2;
                str7 = str;
            }
            Iterator it13 = it8;
            String str19 = str7;
            String str20 = str8;
            String str21 = str10;
            String str22 = str11;
            String str23 = str12;
            String str24 = str13;
            String str25 = t1Var.f295016g;
            CobrandedCardsCardConfiguration cobrandedCardsCardConfigurationA = a(t1Var.f295017h);
            a0 a0Var = t1Var.i;
            CobrandedCardsCardConfiguration cobrandedCardsCardConfigurationA2 = a0Var != null ? a(a0Var) : null;
            String str26 = t1Var.f295018j;
            if (str26 != null) {
                r5b.i[] iVarArrValues = r5b.i.values();
                int length = iVarArrValues.length;
                for (int i2 = 0; i2 < length; i2++) {
                    iVar = iVarArrValues[i2];
                    if (kotlin.text.a0.z(iVar.name(), str26, true)) {
                        break;
                    }
                }
                iVar = null;
            } else {
                iVar = null;
            }
            ld7.f fVar = t1Var.k;
            ParameterisedHyperText parameterisedHyperTextA = fVar != null ? md7.a.a(fVar) : null;
            k1 k1Var = t1Var.f295019l;
            arrayList.add(new CobrandedCardsPlan(str21, str22, str23, str24, str14, arrayList2, str25, cobrandedCardsCardConfigurationA, cobrandedCardsCardConfigurationA2, iVar, parameterisedHyperTextA, k1Var != null ? b(k1Var) : null));
            it8 = it13;
            str8 = str20;
            str7 = str19;
            i = 10;
        }
        return new CobrandedCardsPlanDashboard(str8, str9, arrayList);
    }
}
