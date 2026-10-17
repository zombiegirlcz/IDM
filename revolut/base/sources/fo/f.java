package fo;

import a82.r;
import akl.s;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import ao.j;
import com.google.protobuf.f3;
import com.google.protobuf.h3;
import com.google.protobuf.w0;
import com.revolut.analytics.db.AqueductDatabase;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.tracking.v3.AnalyticEvent;
import com.revolut.tracking.v3.DiagnosticContext;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f136724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4m.a f136725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f136726c;
    public boolean d;
    public final LinkedHashSet e;

    public f(a configuration, d4m.a database, g diagnosticEventsFactory, jo.c aqueductParamsProvider) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(diagnosticEventsFactory, "diagnosticEventsFactory");
        Intrinsics.checkNotNullParameter(aqueductParamsProvider, "aqueductParamsProvider");
        this.f136724a = configuration;
        this.f136725b = database;
        this.f136726c = diagnosticEventsFactory;
        this.d = true;
        this.e = new LinkedHashSet();
    }

    public final synchronized void a(i event) {
        Object obj2;
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            if (this.e.size() >= this.f136724a.f136720b) {
                Iterator it8 = this.e.iterator();
                if (it8.hasNext()) {
                    Object next = it8.next();
                    if (it8.hasNext()) {
                        long jB = ((i) next).b();
                        do {
                            Object next2 = it8.next();
                            long jB2 = ((i) next2).b();
                            if (jB > jB2) {
                                next = next2;
                                jB = jB2;
                            }
                        } while (it8.hasNext());
                    }
                    obj2 = next;
                } else {
                    obj2 = null;
                }
                i iVar = (i) obj2;
                if (iVar == null) {
                    this.d = true;
                    ao.h hVarC = c();
                    j jVarC = kli.a.C(event);
                    hVarC.getClass();
                    DBUtil.performBlocking((RoomDatabase) hVarC.f7847b, false, true, new amh.j(hVarC, jVarC, 10));
                } else {
                    this.d = true;
                    ao.h hVarC2 = c();
                    j jVarC2 = kli.a.C(iVar);
                    hVarC2.getClass();
                    DBUtil.performBlocking((RoomDatabase) hVarC2.f7847b, false, true, new amh.j(hVarC2, jVarC2, 10));
                    this.e.remove(iVar);
                    this.e.add(event);
                }
            } else {
                this.e.add(event);
            }
        } catch (Throwable th10) {
            throw th10;
        }
    }

    public final void b() {
        ao.h hVarC = c();
        ao.e eVar = (ao.e) DBUtil.performBlocking((RoomDatabase) hVarC.f7847b, true, false, new ao.f(hVarC, this.f136724a.f136721c));
        if (eVar != null && eVar.a() > 0) {
            if (eVar.c() != null) {
                eVar.b();
            }
            Instant instantB = eVar.b();
            if (instantB != null) {
                ((Integer) DBUtil.performBlocking((RoomDatabase) c().f7847b, false, true, new r(instantB.toEpochMilli(), 2))).getClass();
            }
            g(eVar);
        }
    }

    public final ao.h c() {
        return ((AqueductDatabase) this.f136725b.get()).g();
    }

    public final synchronized List d(int i) {
        if (!this.d) {
            return d0.V0(d0.P0(this.e, new c()), i);
        }
        b();
        AbstractList abstractListE = e(i - Math.min(i / 2, this.e.size()));
        return d0.E0(d0.V0(d0.P0(this.e, new d()), i - abstractListE.size()), abstractListE);
    }

    public final AbstractList e(int i) {
        Object next;
        List list = (List) DBUtil.performBlocking((RoomDatabase) c().f7847b, true, false, new ao.f(i));
        this.d = !list.isEmpty();
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (true) {
            i iVar = null;
            if (!it8.hasNext()) {
                break;
            }
            j jVar = (j) it8.next();
            try {
                String globalHost = jo.c.a();
                Intrinsics.checkNotNullParameter(jVar, "<this>");
                Intrinsics.checkNotNullParameter(globalHost, "globalHost");
                String strA = jVar.a();
                if (strA != null) {
                    globalHost = strA;
                }
                AnalyticEvent from = AnalyticEvent.parseFrom(jVar.c());
                Intrinsics.checkNotNullExpressionValue(from, "parseFrom(...)");
                iVar = new i(globalHost, from, jVar.c());
            } catch (Exception unused) {
            }
            if (iVar != null) {
                arrayList.add(iVar);
            }
        }
        if (list.size() - arrayList.size() == 0) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            j jVar2 = (j) obj2;
            Iterator it9 = arrayList.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    next = null;
                    break;
                }
                next = it9.next();
                if (Intrinsics.f(((i) next).a(), jVar2.b())) {
                    break;
                }
            }
            if (next == null) {
                arrayList2.add(obj2);
            }
        }
        List listP0 = d0.P0(arrayList2, new e());
        ao.h hVarC = c();
        List list2 = listP0;
        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
        Iterator it10 = list2.iterator();
        while (it10.hasNext()) {
            arrayList3.add(((j) it10.next()).b());
        }
        hVarC.getClass();
        StringBuilder sb6 = new StringBuilder();
        sb6.append("DELETE FROM events WHERE id in (");
        DBUtil.performBlocking((RoomDatabase) hVarC.f7847b, false, true, new a54.c(1, com.google.android.gms.internal.mlkit_vision_face.a.u(arrayList3, sb6, ")"), arrayList3));
        i iVarG = g(new ao.e(listP0.size(), Instant.ofEpochMilli(((j) d0.b0(listP0)).d()), Instant.ofEpochMilli(((j) d0.m0(listP0)).d())));
        aim.e eVarB = u.b();
        eVarB.add(iVarG);
        eVarB.addAll(arrayList);
        return u.a(eVarB);
    }

    public final synchronized void f(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        if (!this.e.removeIf(new b(0, new s(id10, 15)))) {
            DBUtil.performBlocking((RoomDatabase) c().f7847b, false, true, new ak7.g(id10, 8));
        }
    }

    public final i g(ao.e batch) {
        h hVar = i.Companion;
        String strA = jo.c.a();
        g gVar = this.f136726c;
        DateTimeFormatter dateTimeFormatter = gVar.f136729c;
        Intrinsics.checkNotNullParameter(batch, "batch");
        AnalyticsProduct.Shared.MobilePlatform mobilePlatform = AnalyticsProduct.Shared.MobilePlatform.f;
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        DiagnosticContext.a aVarNewBuilder = DiagnosticContext.newBuilder();
        aVarNewBuilder.h("at_off_batch_del");
        f3 f3VarNewBuilder = h3.newBuilder();
        Intrinsics.h(f3VarNewBuilder);
        com.bumptech.glide.c.w(f3VarNewBuilder, "count", Long.valueOf(batch.a()));
        Instant instantC = batch.c();
        if (instantC != null) {
            com.bumptech.glide.c.x(f3VarNewBuilder, "oldest", dateTimeFormatter.format(instantC.atZone(g0m.a.a())));
        }
        Instant instantB = batch.b();
        if (instantB != null) {
            com.bumptech.glide.c.x(f3VarNewBuilder, "latest", dateTimeFormatter.format(instantB.atZone(g0m.a.a())));
        }
        long jA = batch.a();
        ue0.c cVar = gVar.f136728b;
        Class cls = Long.TYPE;
        Long l2 = (Long) j6.a.k(cls, cVar, "cumulative_count");
        long jLongValue = (l2 != null ? l2.longValue() : 0L) + jA;
        com.google.android.gms.internal.mlkit_vision_face.a.B(cls, cVar, "cumulative_count", Long.valueOf(jLongValue));
        com.bumptech.glide.c.x(f3VarNewBuilder, "cumulative_count", String.valueOf(jLongValue));
        Unit unit = Unit.f186387a;
        aVarNewBuilder.i((h3) f3VarNewBuilder.a());
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        w0 w0VarA2 = AnalyticsContext.Companion.a(w0VarA);
        mo.e.Companion.getClass();
        i iVarJ = kli.a.j(hVar, strA, ((uo.h) gVar.f136727a).c(new ho.c(mobilePlatform, w0VarA2, mo.e.a())));
        a(iVarJ);
        return iVarJ;
    }
}
