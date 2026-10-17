package vdl;

import androidx.room.util.DBUtil;
import com.revolut.shared.feature.wealth.domain.impl.data.network.TradingStatementsService;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class w1 {

    @NotNull
    public static final o1 Companion = new o1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingStatementsService f288055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f288056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ecl.b f288057c;
    public final ecl.d d;
    public final ue0.c e;
    public final twg.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4l.f f288058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4l.f f288059h;

    public w1(TradingStatementsService service, ne0.d memoryCache, ecl.b reportsDao, ecl.d usReportsDao, ue0.c storage, twg.c deprecatedDatabaseInteractor, b80.c networkStateRepository) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(reportsDao, "reportsDao");
        Intrinsics.checkNotNullParameter(usReportsDao, "usReportsDao");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(deprecatedDatabaseInteractor, "deprecatedDatabaseInteractor");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        this.f288055a = service;
        this.f288056b = memoryCache;
        this.f288057c = reportsDao;
        this.d = usReportsDao;
        this.e = storage;
        this.f = deprecatedDatabaseInteractor;
        final int i = 0;
        uj0.b bVarK0 = te0.w.k0(networkStateRepository, new Function1(this) { // from class: vdl.m1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w1 f288002b;

            {
                this.f288002b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String id10 = (String) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(id10, "id");
                        efm.d0<List<pdl.a>> reports = this.f288002b.f288055a.getReports(id10);
                        s sVar = new s(14, new vch.h0(27));
                        reports.getClass();
                        ufm.i iVar = new ufm.i(reports, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(id10, "id");
                        return (List) v1.c.s("REPORTS_MEMORY_KEY_", id10, this.f288002b.f288056b);
                    case 2:
                        Intrinsics.checkNotNullParameter(id10, "id");
                        w1 w1Var = this.f288002b;
                        w1Var.a();
                        List list = (List) DBUtil.performBlocking(w1Var.f288057c.f124768a, true, false, new e2j.i(id10, 6));
                        if (list == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<ncl.a> list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (ncl.a aVar : list2) {
                            LocalDate localDateOfEpochDay = LocalDate.ofEpochDay(aVar.f214236b);
                            Intrinsics.checkNotNullExpressionValue(localDateOfEpochDay, "ofEpochDay(...)");
                            LocalDate localDateOfEpochDay2 = LocalDate.ofEpochDay(aVar.f214237c);
                            Intrinsics.checkNotNullExpressionValue(localDateOfEpochDay2, "ofEpochDay(...)");
                            arrayList.add(new wbl.j(localDateOfEpochDay, localDateOfEpochDay2));
                        }
                        return arrayList;
                    case 3:
                        Intrinsics.checkNotNullParameter(id10, "id");
                        efm.d0<List<pdl.a>> usReports = this.f288002b.f288055a.getUsReports(id10);
                        s sVar2 = new s(13, new vch.h0(26));
                        usReports.getClass();
                        ufm.i iVar2 = new ufm.i(usReports, sVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        Intrinsics.checkNotNullParameter(id10, "id");
                        return (List) v1.c.s("US_REPORTS_MEMORY_KEY_", id10, this.f288002b.f288056b);
                    default:
                        Intrinsics.checkNotNullParameter(id10, "id");
                        w1 w1Var2 = this.f288002b;
                        w1Var2.a();
                        List list3 = (List) DBUtil.performBlocking(w1Var2.d.f124773a, true, false, new e2j.i(id10, 7));
                        if (list3 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list3, "<this>");
                        List<ncl.b> list4 = list3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                        for (ncl.b bVar : list4) {
                            LocalDate localDateOfEpochDay3 = LocalDate.ofEpochDay(bVar.f214239b);
                            Intrinsics.checkNotNullExpressionValue(localDateOfEpochDay3, "ofEpochDay(...)");
                            LocalDate localDateOfEpochDay4 = LocalDate.ofEpochDay(bVar.f214240c);
                            Intrinsics.checkNotNullExpressionValue(localDateOfEpochDay4, "ofEpochDay(...)");
                            arrayList2.add(new wbl.j(localDateOfEpochDay3, localDateOfEpochDay4));
                        }
                        return arrayList2;
                }
            }
        });
        final int i2 = 1;
        Function1 function1 = new Function1(this) { // from class: vdl.m1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w1 f288002b;

            {
                this.f288002b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String id10 = (String) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(id10, "id");
                        efm.d0<List<pdl.a>> reports = this.f288002b.f288055a.getReports(id10);
                        s sVar = new s(14, new vch.h0(27));
                        reports.getClass();
                        ufm.i iVar = new ufm.i(reports, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(id10, "id");
                        return (List) v1.c.s("REPORTS_MEMORY_KEY_", id10, this.f288002b.f288056b);
                    case 2:
                        Intrinsics.checkNotNullParameter(id10, "id");
                        w1 w1Var = this.f288002b;
                        w1Var.a();
                        List list = (List) DBUtil.performBlocking(w1Var.f288057c.f124768a, true, false, new e2j.i(id10, 6));
                        if (list == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<ncl.a> list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (ncl.a aVar : list2) {
                            LocalDate localDateOfEpochDay = LocalDate.ofEpochDay(aVar.f214236b);
                            Intrinsics.checkNotNullExpressionValue(localDateOfEpochDay, "ofEpochDay(...)");
                            LocalDate localDateOfEpochDay2 = LocalDate.ofEpochDay(aVar.f214237c);
                            Intrinsics.checkNotNullExpressionValue(localDateOfEpochDay2, "ofEpochDay(...)");
                            arrayList.add(new wbl.j(localDateOfEpochDay, localDateOfEpochDay2));
                        }
                        return arrayList;
                    case 3:
                        Intrinsics.checkNotNullParameter(id10, "id");
                        efm.d0<List<pdl.a>> usReports = this.f288002b.f288055a.getUsReports(id10);
                        s sVar2 = new s(13, new vch.h0(26));
                        usReports.getClass();
                        ufm.i iVar2 = new ufm.i(usReports, sVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        Intrinsics.checkNotNullParameter(id10, "id");
                        return (List) v1.c.s("US_REPORTS_MEMORY_KEY_", id10, this.f288002b.f288056b);
                    default:
                        Intrinsics.checkNotNullParameter(id10, "id");
                        w1 w1Var2 = this.f288002b;
                        w1Var2.a();
                        List list3 = (List) DBUtil.performBlocking(w1Var2.d.f124773a, true, false, new e2j.i(id10, 7));
                        if (list3 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list3, "<this>");
                        List<ncl.b> list4 = list3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                        for (ncl.b bVar : list4) {
                            LocalDate localDateOfEpochDay3 = LocalDate.ofEpochDay(bVar.f214239b);
                            Intrinsics.checkNotNullExpressionValue(localDateOfEpochDay3, "ofEpochDay(...)");
                            LocalDate localDateOfEpochDay4 = LocalDate.ofEpochDay(bVar.f214240c);
                            Intrinsics.checkNotNullExpressionValue(localDateOfEpochDay4, "ofEpochDay(...)");
                            arrayList2.add(new wbl.j(localDateOfEpochDay3, localDateOfEpochDay4));
                        }
                        return arrayList2;
                }
            }
        };
        final int i3 = 0;
        Function2 function2 = new Function2(this) { // from class: vdl.n1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w1 f288007b;

            {
                this.f288007b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        String id10 = (String) obj2;
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f288007b.f288056b.f("REPORTS_MEMORY_KEY_" + id10, data);
                        break;
                    case 1:
                        String id11 = (String) obj2;
                        List data2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        ecl.b bVar = this.f288007b.f288057c;
                        Intrinsics.checkNotNullParameter(data2, "<this>");
                        Intrinsics.checkNotNullParameter(id11, "id");
                        List<wbl.j> list = data2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (wbl.j jVar : list) {
                            arrayList.add(new ncl.a(id11, jVar.f296268a.toEpochDay(), jVar.f296269b.toEpochDay()));
                        }
                        DBUtil.performBlocking(bVar.f124768a, false, true, new ecl.a(bVar, arrayList, 0));
                        break;
                    case 2:
                        String id12 = (String) obj2;
                        List data3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(id12, "id");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        this.f288007b.f288056b.f("US_REPORTS_MEMORY_KEY_" + id12, data3);
                        break;
                    default:
                        String id13 = (String) obj2;
                        List data4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(id13, "id");
                        Intrinsics.checkNotNullParameter(data4, "data");
                        ecl.d dVar = this.f288007b.d;
                        Intrinsics.checkNotNullParameter(data4, "<this>");
                        Intrinsics.checkNotNullParameter(id13, "id");
                        List<wbl.j> list2 = data4;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (wbl.j jVar2 : list2) {
                            arrayList2.add(new ncl.b(id13, jVar2.f296268a.toEpochDay(), jVar2.f296269b.toEpochDay()));
                        }
                        DBUtil.performBlocking(dVar.f124773a, false, true, new ecl.c(dVar, arrayList2, 1));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i5 = 2;
        Function1 function12 = new Function1(this) { // from class: vdl.m1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w1 f288002b;

            {
                this.f288002b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String id10 = (String) obj2;
                switch (i5) {
                    case 0:
                        Intrinsics.checkNotNullParameter(id10, "id");
                        efm.d0<List<pdl.a>> reports = this.f288002b.f288055a.getReports(id10);
                        s sVar = new s(14, new vch.h0(27));
                        reports.getClass();
                        ufm.i iVar = new ufm.i(reports, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(id10, "id");
                        return (List) v1.c.s("REPORTS_MEMORY_KEY_", id10, this.f288002b.f288056b);
                    case 2:
                        Intrinsics.checkNotNullParameter(id10, "id");
                        w1 w1Var = this.f288002b;
                        w1Var.a();
                        List list = (List) DBUtil.performBlocking(w1Var.f288057c.f124768a, true, false, new e2j.i(id10, 6));
                        if (list == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<ncl.a> list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (ncl.a aVar : list2) {
                            LocalDate localDateOfEpochDay = LocalDate.ofEpochDay(aVar.f214236b);
                            Intrinsics.checkNotNullExpressionValue(localDateOfEpochDay, "ofEpochDay(...)");
                            LocalDate localDateOfEpochDay2 = LocalDate.ofEpochDay(aVar.f214237c);
                            Intrinsics.checkNotNullExpressionValue(localDateOfEpochDay2, "ofEpochDay(...)");
                            arrayList.add(new wbl.j(localDateOfEpochDay, localDateOfEpochDay2));
                        }
                        return arrayList;
                    case 3:
                        Intrinsics.checkNotNullParameter(id10, "id");
                        efm.d0<List<pdl.a>> usReports = this.f288002b.f288055a.getUsReports(id10);
                        s sVar2 = new s(13, new vch.h0(26));
                        usReports.getClass();
                        ufm.i iVar2 = new ufm.i(usReports, sVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        Intrinsics.checkNotNullParameter(id10, "id");
                        return (List) v1.c.s("US_REPORTS_MEMORY_KEY_", id10, this.f288002b.f288056b);
                    default:
                        Intrinsics.checkNotNullParameter(id10, "id");
                        w1 w1Var2 = this.f288002b;
                        w1Var2.a();
                        List list3 = (List) DBUtil.performBlocking(w1Var2.d.f124773a, true, false, new e2j.i(id10, 7));
                        if (list3 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list3, "<this>");
                        List<ncl.b> list4 = list3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                        for (ncl.b bVar : list4) {
                            LocalDate localDateOfEpochDay3 = LocalDate.ofEpochDay(bVar.f214239b);
                            Intrinsics.checkNotNullExpressionValue(localDateOfEpochDay3, "ofEpochDay(...)");
                            LocalDate localDateOfEpochDay4 = LocalDate.ofEpochDay(bVar.f214240c);
                            Intrinsics.checkNotNullExpressionValue(localDateOfEpochDay4, "ofEpochDay(...)");
                            arrayList2.add(new wbl.j(localDateOfEpochDay3, localDateOfEpochDay4));
                        }
                        return arrayList2;
                }
            }
        };
        final int i6 = 1;
        this.f288058g = new w4l.f(bVarK0, function1, function2, function12, new Function2(this) { // from class: vdl.n1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w1 f288007b;

            {
                this.f288007b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        String id10 = (String) obj2;
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f288007b.f288056b.f("REPORTS_MEMORY_KEY_" + id10, data);
                        break;
                    case 1:
                        String id11 = (String) obj2;
                        List data2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        ecl.b bVar = this.f288007b.f288057c;
                        Intrinsics.checkNotNullParameter(data2, "<this>");
                        Intrinsics.checkNotNullParameter(id11, "id");
                        List<wbl.j> list = data2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (wbl.j jVar : list) {
                            arrayList.add(new ncl.a(id11, jVar.f296268a.toEpochDay(), jVar.f296269b.toEpochDay()));
                        }
                        DBUtil.performBlocking(bVar.f124768a, false, true, new ecl.a(bVar, arrayList, 0));
                        break;
                    case 2:
                        String id12 = (String) obj2;
                        List data3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(id12, "id");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        this.f288007b.f288056b.f("US_REPORTS_MEMORY_KEY_" + id12, data3);
                        break;
                    default:
                        String id13 = (String) obj2;
                        List data4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(id13, "id");
                        Intrinsics.checkNotNullParameter(data4, "data");
                        ecl.d dVar = this.f288007b.d;
                        Intrinsics.checkNotNullParameter(data4, "<this>");
                        Intrinsics.checkNotNullParameter(id13, "id");
                        List<wbl.j> list2 = data4;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (wbl.j jVar2 : list2) {
                            arrayList2.add(new ncl.b(id13, jVar2.f296268a.toEpochDay(), jVar2.f296269b.toEpochDay()));
                        }
                        DBUtil.performBlocking(dVar.f124773a, false, true, new ecl.c(dVar, arrayList2, 1));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        final int i21 = 3;
        uj0.b bVarK02 = te0.w.k0(networkStateRepository, new Function1(this) { // from class: vdl.m1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w1 f288002b;

            {
                this.f288002b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String id10 = (String) obj2;
                switch (i21) {
                    case 0:
                        Intrinsics.checkNotNullParameter(id10, "id");
                        efm.d0<List<pdl.a>> reports = this.f288002b.f288055a.getReports(id10);
                        s sVar = new s(14, new vch.h0(27));
                        reports.getClass();
                        ufm.i iVar = new ufm.i(reports, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(id10, "id");
                        return (List) v1.c.s("REPORTS_MEMORY_KEY_", id10, this.f288002b.f288056b);
                    case 2:
                        Intrinsics.checkNotNullParameter(id10, "id");
                        w1 w1Var = this.f288002b;
                        w1Var.a();
                        List list = (List) DBUtil.performBlocking(w1Var.f288057c.f124768a, true, false, new e2j.i(id10, 6));
                        if (list == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<ncl.a> list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (ncl.a aVar : list2) {
                            LocalDate localDateOfEpochDay = LocalDate.ofEpochDay(aVar.f214236b);
                            Intrinsics.checkNotNullExpressionValue(localDateOfEpochDay, "ofEpochDay(...)");
                            LocalDate localDateOfEpochDay2 = LocalDate.ofEpochDay(aVar.f214237c);
                            Intrinsics.checkNotNullExpressionValue(localDateOfEpochDay2, "ofEpochDay(...)");
                            arrayList.add(new wbl.j(localDateOfEpochDay, localDateOfEpochDay2));
                        }
                        return arrayList;
                    case 3:
                        Intrinsics.checkNotNullParameter(id10, "id");
                        efm.d0<List<pdl.a>> usReports = this.f288002b.f288055a.getUsReports(id10);
                        s sVar2 = new s(13, new vch.h0(26));
                        usReports.getClass();
                        ufm.i iVar2 = new ufm.i(usReports, sVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        Intrinsics.checkNotNullParameter(id10, "id");
                        return (List) v1.c.s("US_REPORTS_MEMORY_KEY_", id10, this.f288002b.f288056b);
                    default:
                        Intrinsics.checkNotNullParameter(id10, "id");
                        w1 w1Var2 = this.f288002b;
                        w1Var2.a();
                        List list3 = (List) DBUtil.performBlocking(w1Var2.d.f124773a, true, false, new e2j.i(id10, 7));
                        if (list3 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list3, "<this>");
                        List<ncl.b> list4 = list3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                        for (ncl.b bVar : list4) {
                            LocalDate localDateOfEpochDay3 = LocalDate.ofEpochDay(bVar.f214239b);
                            Intrinsics.checkNotNullExpressionValue(localDateOfEpochDay3, "ofEpochDay(...)");
                            LocalDate localDateOfEpochDay4 = LocalDate.ofEpochDay(bVar.f214240c);
                            Intrinsics.checkNotNullExpressionValue(localDateOfEpochDay4, "ofEpochDay(...)");
                            arrayList2.add(new wbl.j(localDateOfEpochDay3, localDateOfEpochDay4));
                        }
                        return arrayList2;
                }
            }
        });
        final int i22 = 4;
        Function1 function13 = new Function1(this) { // from class: vdl.m1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w1 f288002b;

            {
                this.f288002b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String id10 = (String) obj2;
                switch (i22) {
                    case 0:
                        Intrinsics.checkNotNullParameter(id10, "id");
                        efm.d0<List<pdl.a>> reports = this.f288002b.f288055a.getReports(id10);
                        s sVar = new s(14, new vch.h0(27));
                        reports.getClass();
                        ufm.i iVar = new ufm.i(reports, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(id10, "id");
                        return (List) v1.c.s("REPORTS_MEMORY_KEY_", id10, this.f288002b.f288056b);
                    case 2:
                        Intrinsics.checkNotNullParameter(id10, "id");
                        w1 w1Var = this.f288002b;
                        w1Var.a();
                        List list = (List) DBUtil.performBlocking(w1Var.f288057c.f124768a, true, false, new e2j.i(id10, 6));
                        if (list == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<ncl.a> list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (ncl.a aVar : list2) {
                            LocalDate localDateOfEpochDay = LocalDate.ofEpochDay(aVar.f214236b);
                            Intrinsics.checkNotNullExpressionValue(localDateOfEpochDay, "ofEpochDay(...)");
                            LocalDate localDateOfEpochDay2 = LocalDate.ofEpochDay(aVar.f214237c);
                            Intrinsics.checkNotNullExpressionValue(localDateOfEpochDay2, "ofEpochDay(...)");
                            arrayList.add(new wbl.j(localDateOfEpochDay, localDateOfEpochDay2));
                        }
                        return arrayList;
                    case 3:
                        Intrinsics.checkNotNullParameter(id10, "id");
                        efm.d0<List<pdl.a>> usReports = this.f288002b.f288055a.getUsReports(id10);
                        s sVar2 = new s(13, new vch.h0(26));
                        usReports.getClass();
                        ufm.i iVar2 = new ufm.i(usReports, sVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        Intrinsics.checkNotNullParameter(id10, "id");
                        return (List) v1.c.s("US_REPORTS_MEMORY_KEY_", id10, this.f288002b.f288056b);
                    default:
                        Intrinsics.checkNotNullParameter(id10, "id");
                        w1 w1Var2 = this.f288002b;
                        w1Var2.a();
                        List list3 = (List) DBUtil.performBlocking(w1Var2.d.f124773a, true, false, new e2j.i(id10, 7));
                        if (list3 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list3, "<this>");
                        List<ncl.b> list4 = list3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                        for (ncl.b bVar : list4) {
                            LocalDate localDateOfEpochDay3 = LocalDate.ofEpochDay(bVar.f214239b);
                            Intrinsics.checkNotNullExpressionValue(localDateOfEpochDay3, "ofEpochDay(...)");
                            LocalDate localDateOfEpochDay4 = LocalDate.ofEpochDay(bVar.f214240c);
                            Intrinsics.checkNotNullExpressionValue(localDateOfEpochDay4, "ofEpochDay(...)");
                            arrayList2.add(new wbl.j(localDateOfEpochDay3, localDateOfEpochDay4));
                        }
                        return arrayList2;
                }
            }
        };
        final int i32 = 2;
        Function2 function22 = new Function2(this) { // from class: vdl.n1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w1 f288007b;

            {
                this.f288007b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i32) {
                    case 0:
                        String id10 = (String) obj2;
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f288007b.f288056b.f("REPORTS_MEMORY_KEY_" + id10, data);
                        break;
                    case 1:
                        String id11 = (String) obj2;
                        List data2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        ecl.b bVar = this.f288007b.f288057c;
                        Intrinsics.checkNotNullParameter(data2, "<this>");
                        Intrinsics.checkNotNullParameter(id11, "id");
                        List<wbl.j> list = data2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (wbl.j jVar : list) {
                            arrayList.add(new ncl.a(id11, jVar.f296268a.toEpochDay(), jVar.f296269b.toEpochDay()));
                        }
                        DBUtil.performBlocking(bVar.f124768a, false, true, new ecl.a(bVar, arrayList, 0));
                        break;
                    case 2:
                        String id12 = (String) obj2;
                        List data3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(id12, "id");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        this.f288007b.f288056b.f("US_REPORTS_MEMORY_KEY_" + id12, data3);
                        break;
                    default:
                        String id13 = (String) obj2;
                        List data4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(id13, "id");
                        Intrinsics.checkNotNullParameter(data4, "data");
                        ecl.d dVar = this.f288007b.d;
                        Intrinsics.checkNotNullParameter(data4, "<this>");
                        Intrinsics.checkNotNullParameter(id13, "id");
                        List<wbl.j> list2 = data4;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (wbl.j jVar2 : list2) {
                            arrayList2.add(new ncl.b(id13, jVar2.f296268a.toEpochDay(), jVar2.f296269b.toEpochDay()));
                        }
                        DBUtil.performBlocking(dVar.f124773a, false, true, new ecl.c(dVar, arrayList2, 1));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i33 = 5;
        Function1 function14 = new Function1(this) { // from class: vdl.m1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w1 f288002b;

            {
                this.f288002b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String id10 = (String) obj2;
                switch (i33) {
                    case 0:
                        Intrinsics.checkNotNullParameter(id10, "id");
                        efm.d0<List<pdl.a>> reports = this.f288002b.f288055a.getReports(id10);
                        s sVar = new s(14, new vch.h0(27));
                        reports.getClass();
                        ufm.i iVar = new ufm.i(reports, sVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(id10, "id");
                        return (List) v1.c.s("REPORTS_MEMORY_KEY_", id10, this.f288002b.f288056b);
                    case 2:
                        Intrinsics.checkNotNullParameter(id10, "id");
                        w1 w1Var = this.f288002b;
                        w1Var.a();
                        List list = (List) DBUtil.performBlocking(w1Var.f288057c.f124768a, true, false, new e2j.i(id10, 6));
                        if (list == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list, "<this>");
                        List<ncl.a> list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        for (ncl.a aVar : list2) {
                            LocalDate localDateOfEpochDay = LocalDate.ofEpochDay(aVar.f214236b);
                            Intrinsics.checkNotNullExpressionValue(localDateOfEpochDay, "ofEpochDay(...)");
                            LocalDate localDateOfEpochDay2 = LocalDate.ofEpochDay(aVar.f214237c);
                            Intrinsics.checkNotNullExpressionValue(localDateOfEpochDay2, "ofEpochDay(...)");
                            arrayList.add(new wbl.j(localDateOfEpochDay, localDateOfEpochDay2));
                        }
                        return arrayList;
                    case 3:
                        Intrinsics.checkNotNullParameter(id10, "id");
                        efm.d0<List<pdl.a>> usReports = this.f288002b.f288055a.getUsReports(id10);
                        s sVar2 = new s(13, new vch.h0(26));
                        usReports.getClass();
                        ufm.i iVar2 = new ufm.i(usReports, sVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    case 4:
                        Intrinsics.checkNotNullParameter(id10, "id");
                        return (List) v1.c.s("US_REPORTS_MEMORY_KEY_", id10, this.f288002b.f288056b);
                    default:
                        Intrinsics.checkNotNullParameter(id10, "id");
                        w1 w1Var2 = this.f288002b;
                        w1Var2.a();
                        List list3 = (List) DBUtil.performBlocking(w1Var2.d.f124773a, true, false, new e2j.i(id10, 7));
                        if (list3 == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(list3, "<this>");
                        List<ncl.b> list4 = list3;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                        for (ncl.b bVar : list4) {
                            LocalDate localDateOfEpochDay3 = LocalDate.ofEpochDay(bVar.f214239b);
                            Intrinsics.checkNotNullExpressionValue(localDateOfEpochDay3, "ofEpochDay(...)");
                            LocalDate localDateOfEpochDay4 = LocalDate.ofEpochDay(bVar.f214240c);
                            Intrinsics.checkNotNullExpressionValue(localDateOfEpochDay4, "ofEpochDay(...)");
                            arrayList2.add(new wbl.j(localDateOfEpochDay3, localDateOfEpochDay4));
                        }
                        return arrayList2;
                }
            }
        };
        final int i43 = 3;
        this.f288059h = new w4l.f(bVarK02, function13, function22, function14, new Function2(this) { // from class: vdl.n1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w1 f288007b;

            {
                this.f288007b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i43) {
                    case 0:
                        String id10 = (String) obj2;
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f288007b.f288056b.f("REPORTS_MEMORY_KEY_" + id10, data);
                        break;
                    case 1:
                        String id11 = (String) obj2;
                        List data2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        ecl.b bVar = this.f288007b.f288057c;
                        Intrinsics.checkNotNullParameter(data2, "<this>");
                        Intrinsics.checkNotNullParameter(id11, "id");
                        List<wbl.j> list = data2;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (wbl.j jVar : list) {
                            arrayList.add(new ncl.a(id11, jVar.f296268a.toEpochDay(), jVar.f296269b.toEpochDay()));
                        }
                        DBUtil.performBlocking(bVar.f124768a, false, true, new ecl.a(bVar, arrayList, 0));
                        break;
                    case 2:
                        String id12 = (String) obj2;
                        List data3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(id12, "id");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        this.f288007b.f288056b.f("US_REPORTS_MEMORY_KEY_" + id12, data3);
                        break;
                    default:
                        String id13 = (String) obj2;
                        List data4 = (List) obj3;
                        Intrinsics.checkNotNullParameter(id13, "id");
                        Intrinsics.checkNotNullParameter(data4, "data");
                        ecl.d dVar = this.f288007b.d;
                        Intrinsics.checkNotNullParameter(data4, "<this>");
                        Intrinsics.checkNotNullParameter(id13, "id");
                        List<wbl.j> list2 = data4;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        for (wbl.j jVar2 : list2) {
                            arrayList2.add(new ncl.b(id13, jVar2.f296268a.toEpochDay(), jVar2.f296269b.toEpochDay()));
                        }
                        DBUtil.performBlocking(dVar.f124773a, false, true, new ecl.c(dVar, arrayList2, 1));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c4 A[Catch: all -> 0x00c8, TRY_LEAVE, TryCatch #0 {, blocks: (B:23:0x00c4, B:22:0x00b3, B:3:0x0001, B:5:0x001b, B:6:0x0041, B:8:0x0047, B:11:0x005e, B:13:0x0066, B:14:0x0072, B:15:0x0085, B:17:0x008b, B:18:0x00a0, B:20:0x00a6), top: B:29:0x0001, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vdl.w1.a():void");
    }
}
