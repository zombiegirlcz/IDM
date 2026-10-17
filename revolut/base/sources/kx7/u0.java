package kx7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.joda.time.LocalDate;
import zw7.i1;
import zw7.j1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u0 extends kotlin.jvm.internal.q implements Function1 {
    public static final u0 f = new u0();

    public u0() {
        super(1, hx7.j.class, "toDomain", "toDomain(Ljava/util/List;)Ljava/util/List;", 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Iterator it8;
        String str;
        i1 j1Var;
        ?? arrayList;
        List p0 = (List) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Object obj3 = hx7.j.f156402a;
        String str2 = "<this>";
        Intrinsics.checkNotNullParameter(p0, "<this>");
        List list = p0;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            ix7.o oVar = (ix7.o) it9.next();
            Intrinsics.checkNotNullParameter(oVar, str2);
            String id10 = oVar.getId();
            zw7.c0 c0Var = (zw7.c0) u1.t(oVar.getPetType(), zw7.c0.UNKNOWN, hx7.j.f156402a);
            String imageLink = oVar.getImageLink();
            String name = oVar.getName();
            zw7.z zVar = (zw7.z) u1.t(oVar.getGender(), zw7.z.UNKNOWN, hx7.j.f156403b);
            zw7.e eVarB = hx7.c.b(oVar.getBreedDetails());
            LocalDate localDate = LocalDate.parse(oVar.getDateOfBirth());
            Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
            String purchasePrice = oVar.getPurchasePrice();
            dj0.d dVarO = mo3.a.o(oVar.getPurchasePriceMoney());
            boolean sterilized = oVar.getSterilized();
            boolean editable = oVar.getEditable();
            ix7.d0 quoteRequest = oVar.getQuoteRequest();
            if (quoteRequest == null) {
                it8 = it9;
                str = str2;
                j1Var = i1.a.f325794a;
            } else {
                it8 = it9;
                String petId = quoteRequest.getPetId();
                str = str2;
                LocalDate localDate2 = LocalDate.parse(quoteRequest.getPolicyStartDate());
                Intrinsics.checkNotNullExpressionValue(localDate2, "parse(...)");
                j1Var = new j1(petId, localDate2);
            }
            List issues = oVar.getIssues();
            if (issues != null) {
                List list2 = issues;
                arrayList = new ArrayList(zhm.w.t(list2, 10));
                for (Iterator it10 = list2.iterator(); it10.hasNext(); it10 = it10) {
                    arrayList.add((zw7.t) u1.t((String) it10.next(), zw7.t.UNKNOWN, hx7.g.f156398a));
                }
            } else {
                arrayList = zhm.f0.f322471a;
            }
            ?? r182 = arrayList;
            arrayList2.add(new zw7.d0(id10, c0Var, imageLink, name, zVar, eVarB, localDate, sterilized, purchasePrice, dVarO, editable, j1Var, r182, (zw7.a0) u1.t(oVar.getPolicyStatus(), zw7.a0.UNKNOWN, hx7.r.f156410a), hx7.p.a(oVar.getPolicy())));
            it9 = it8;
            str2 = str;
        }
        return arrayList2;
    }
}
