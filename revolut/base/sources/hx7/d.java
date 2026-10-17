package hx7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.joda.time.LocalDate;
import zhm.h0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f156395a = r0.k(new Pair("STATEMENT_OF_INSURANCE", zw7.n.STATEMENT_OF_INSURANCE), new Pair("IPID", zw7.n.IPID), new Pair("POLICY_WORDING", zw7.n.POLICY_WORDING), new Pair("TERMS_CONDITIONS", zw7.n.TERMS_CONDITIONS));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f156396b = r0.k(new Pair("RELATIVE", zw7.o.RELATIVE), new Pair("ABSOLUTE", zw7.o.ABSOLUTE));

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public static final ArrayList a(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<ix7.h> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (ix7.h hVar : list2) {
            Intrinsics.checkNotNullParameter(hVar, "<this>");
            zw7.n nVar = (zw7.n) u1.t(hVar.getCode(), zw7.n.UNKNOWN, f156395a);
            zw7.o oVar = (zw7.o) u1.t(hVar.getLinkType(), zw7.o.UNKNOWN, f156396b);
            String url2 = hVar.getUrl();
            String expirationDate = hVar.getExpirationDate();
            LocalDate localDate = null;
            if (expirationDate != null) {
                try {
                    localDate = LocalDate.parse(expirationDate);
                } catch (Exception e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                }
            }
            arrayList.add(new zw7.m(nVar, oVar, url2, null, localDate));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public static final ArrayList b(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<gx7.h> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (gx7.h hVar : list2) {
            Intrinsics.checkNotNullParameter(hVar, "<this>");
            zw7.n nVar = (zw7.n) u1.t(hVar.getCode(), zw7.n.UNKNOWN, f156395a);
            zw7.o oVar = (zw7.o) u1.t(hVar.getUrlType(), zw7.o.UNKNOWN, f156396b);
            String url2 = hVar.getUrl();
            String expirationDate = hVar.getExpirationDate();
            LocalDate localDate = null;
            if (expirationDate != null) {
                try {
                    localDate = LocalDate.parse(expirationDate);
                } catch (Exception e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                }
            }
            arrayList.add(new zw7.m(nVar, oVar, url2, null, localDate));
        }
        return arrayList;
    }

    public static final ArrayList c(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<zw7.m> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (zw7.m mVar : list2) {
            Intrinsics.checkNotNullParameter(mVar, "<this>");
            String strName = mVar.f325814a.name();
            String strName2 = mVar.f325815b.name();
            String str = mVar.f325816c;
            LocalDate localDate = mVar.e;
            arrayList.add(new gx7.h(strName, strName2, str, localDate != null ? ce9.m.K(localDate) : null));
        }
        return arrayList;
    }
}
