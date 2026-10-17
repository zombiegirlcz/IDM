package tx4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import oc.c;
import ux4.b;
import ux4.d;
import ux4.f;
import ux4.g;
import ux4.h;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f275328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f275329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f275330c;

    static {
        Pair pair = new Pair("ORIGINAL", h.ORIGINAL);
        h hVar = h.FORBEARANCE;
        f275328a = r0.k(pair, new Pair("FORBEARANCE", hVar), new Pair("PLC2FTC_FORB", hVar), new Pair("CC2FTC_FORB", hVar));
        f275329b = r0.k(new Pair("CREATED", g.CREATED), new Pair("EXPIRED", g.EXPIRED));
        f275330c = r0.k(new Pair("html", f.HTML), new Pair("pdf", f.PDF));
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map] */
    public static final b a(rx4.b bVar, Function2 buildUrl) {
        LocalDate localDate;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(buildUrl, "buildUrl");
        List<rx4.a> documents = bVar.getDocuments();
        ArrayList arrayList = new ArrayList(w.t(documents, 10));
        for (rx4.a aVar : documents) {
            h hVar = (h) u1.v(aVar.getType(), f275328a);
            if (hVar == null) {
                hVar = h.ORIGINAL;
            }
            h hVar2 = hVar;
            String id10 = aVar.getId();
            String name = aVar.getName();
            String displayName = aVar.getDisplayName();
            String str = (String) buildUrl.invoke(aVar, hVar2);
            g gVar = (g) u1.v(aVar.getState(), f275329b);
            if (gVar == null) {
                gVar = g.CREATED;
            }
            g gVar2 = gVar;
            LocalDate localDate2 = LocalDate.parse(aVar.getCreatedDate());
            Intrinsics.checkNotNullExpressionValue(localDate2, "parse(...)");
            long jF = c.F(localDate2);
            String signDate = aVar.getSignDate();
            Long lValueOf = (signDate == null || (localDate = LocalDate.parse(signDate)) == null) ? null : Long.valueOf(c.F(localDate));
            f fVar = (f) u1.v(aVar.getFileType(), f275330c);
            if (fVar == null) {
                fVar = f.PDF;
            }
            arrayList.add(new d(id10, name, displayName, str, false, hVar2, gVar2, jF, lValueOf, fVar));
        }
        return new b(arrayList);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
    public static final rx4.b b(b bVar) {
        LocalDate localDateN;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        List<d> list = bVar.f283864a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (d dVar : list) {
            String str = dVar.f283865a;
            String str2 = dVar.f283866b;
            String str3 = dVar.f283867c;
            String strG = u1.g(dVar.f, f275328a);
            String strG2 = u1.g(dVar.f283868g, f275329b);
            String strG3 = u1.g(dVar.f283870j, f275330c);
            String string = ebm.a.N(new Date(dVar.f283869h)).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            Long l2 = dVar.i;
            arrayList.add(new rx4.a(str, str2, str3, strG, strG2, string, strG3, (l2 == null || (localDateN = ebm.a.N(new Date(l2.longValue()))) == null) ? null : localDateN.toString()));
        }
        return new rx4.b(arrayList);
    }
}
