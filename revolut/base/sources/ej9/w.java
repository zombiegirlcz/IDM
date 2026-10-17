package ej9;

import dj9.c0;
import dj9.q;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zh9.a1;
import zh9.b1;
import zh9.q1;
import zh9.u1;
import zh9.z0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class w extends kotlin.jvm.internal.q implements Function1 {
    public static final w f = new w();

    public w() {
        super(1, cj9.b.class, "toDomain", "toDomain(Lcom/revolut/feature/pay_later/impl/network/models/PayLaterFeeSettingsDto;)Lcom/revolut/feature/pay_later/api/models/PayLaterFeeSettings;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        b1 b1Var;
        u1 u1Var;
        u1 u1Var2;
        b1 a1Var;
        dj9.d p0 = (dj9.d) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        dj9.q currentPromotion = p0.getCurrentPromotion();
        if (currentPromotion != null) {
            Intrinsics.checkNotNullParameter(currentPromotion, "<this>");
            if (currentPromotion instanceof q.a) {
                q.a aVar = (q.a) currentPromotion;
                LocalDate localDate = LocalDate.parse(aVar.getStartDate());
                Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
                LocalDate localDate2 = LocalDate.parse(aVar.getEndDate());
                Intrinsics.checkNotNullExpressionValue(localDate2, "parse(...)");
                a1Var = new z0(aVar.getTermsType(), localDate, localDate2);
            } else if (currentPromotion instanceof q.b) {
                q.b bVar = (q.b) currentPromotion;
                LocalDate localDate3 = LocalDate.parse(bVar.getStartDate());
                Intrinsics.checkNotNullExpressionValue(localDate3, "parse(...)");
                LocalDate localDate4 = LocalDate.parse(bVar.getEndDate());
                Intrinsics.checkNotNullExpressionValue(localDate4, "parse(...)");
                a1Var = new a1(localDate3, localDate4);
            } else {
                if (!(currentPromotion instanceof q.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p.a.p("Current promotion with type = ", ((q.c) currentPromotion).getType(), " is not declared"));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                a1Var = null;
            }
            b1Var = a1Var;
        } else {
            b1Var = null;
        }
        Iterator it8 = p0.getUpcomingPromotions().iterator();
        while (true) {
            if (!it8.hasNext()) {
                u1Var = null;
                break;
            }
            dj9.c0 c0Var = (dj9.c0) it8.next();
            Intrinsics.checkNotNullParameter(c0Var, "<this>");
            if (c0Var instanceof c0.a) {
                c0.a aVar2 = (c0.a) c0Var;
                LocalDate localDate5 = LocalDate.parse(aVar2.getEndDate());
                Intrinsics.checkNotNullExpressionValue(localDate5, "parse(...)");
                long leftToSpend = aVar2.getLeftToSpend();
                xi0.a aVar3 = xi0.b.Companion;
                String currency = aVar2.getCurrency();
                aVar3.getClass();
                u1Var2 = new u1(new dj0.d(leftToSpend, xi0.a.a(currency)), localDate5);
            } else {
                if (!(c0Var instanceof c0.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(p.a.p("Upcoming promotion with type = ", ((c0.b) c0Var).getType(), " is not declared"));
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2, h0Var2);
                u1Var2 = null;
            }
            if (u1Var2 != null) {
                u1Var = u1Var2;
                break;
            }
        }
        LocalDate localDate6 = LocalDate.parse(p0.getCurrentDate());
        Intrinsics.checkNotNullExpressionValue(localDate6, "parse(...)");
        wi0.a aVar4 = wi0.b.Companion;
        String countryCode = p0.getCountryCode();
        aVar4.getClass();
        wi0.b bVarA = wi0.a.a(countryCode);
        List<dj9.a0> termsDetails = p0.getTermsDetails();
        ArrayList arrayList = new ArrayList(zhm.w.t(termsDetails, 10));
        for (dj9.a0 a0Var : termsDetails) {
            Intrinsics.checkNotNullParameter(a0Var, "<this>");
            arrayList.add(new q1(a0Var.getTerm(), a0Var.getFeeRate()));
        }
        long minFeeAmount = p0.getMinFeeAmount();
        xi0.a aVar5 = xi0.b.Companion;
        String currency2 = p0.getCurrency();
        aVar5.getClass();
        return new zh9.n(b1Var, u1Var, localDate6, bVarA, arrayList, new dj0.d(minFeeAmount, xi0.a.a(currency2)));
    }
}
