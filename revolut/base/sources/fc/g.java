package fc;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import hx7.q;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import jq9.k;
import jq9.p;
import kotlin.jvm.internal.Intrinsics;
import mp.r;
import org.json.JSONObject;
import sgm.e3;
import tsk.t;
import v3e.s;
import yb.a0;
import yb.b0;
import yb.c0;
import yb.d0;
import yb.e0;
import yb.h0;
import yb.i0;
import yb.k0;
import yb.n;
import yb.u;
import yb.w;
import yb.y;
import zb.j;
import zb.m;
import zb.o;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f133579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f133580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f133581c;
    public Object d;
    public Object e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f133582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f133583h;
    public Object i;

    public static boolean c(k kVar) {
        zm3.a aVarG;
        Boolean boolValueOf = null;
        p pVar = kVar instanceof p ? (p) kVar : null;
        if (pVar != null && (aVarG = pVar.g()) != null) {
            boolValueOf = Boolean.valueOf(q.M(aVarG));
        }
        return pd.b.j(boolValueOf);
    }

    public static void e(String str, JSONObject jSONObject) {
        StringBuilder sbS = p.a.s(str);
        sbS.append(jSONObject.toString());
        sbS.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
        }
    }

    public qe.b a(qe.c cVar) {
        qe.b bVar = null;
        try {
            if (!qe.c.SKIP_CACHE_LOOKUP.equals(cVar)) {
                JSONObject jSONObjectM = ((a31.a) this.e).m();
                if (jSONObjectM != null) {
                    qe.b bVarM = ((r) this.f133581c).m(jSONObjectM);
                    e("Loaded cached settings: ", jSONObjectM);
                    ((ch.b) this.d).getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (qe.c.IGNORE_CACHE_EXPIRATION.equals(cVar) || bVarM.f245006c >= jCurrentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            }
                            return bVarM;
                        } catch (Exception e) {
                            bVar = bVarM;
                            return bVar;
                        }
                    }
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        return null;
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                }
            }
            return null;
        } catch (Exception e2) {
        }
    }

    public qe.b b() {
        return (qe.b) ((AtomicReference) this.f133583h).get();
    }

    public void d(final j jVar, int i) {
        byte[] bArr;
        long j2;
        hc.b bVar;
        ac.h hVar;
        ac.a aVar;
        String str;
        xb.b bVarB;
        String str2;
        Integer numValueOf;
        String str3;
        Iterator it8;
        hc.b bVar2;
        ac.h hVar2;
        g gVar;
        final g gVar2 = this;
        final j jVar2 = jVar;
        byte[] bArr2 = jVar2.f320781b;
        hc.b bVar3 = (hc.b) gVar2.f;
        ac.h hVarA = ((ac.f) gVar2.f133580b).a(jVar2.f320780a);
        if (ac.c.OK == null) {
            throw new NullPointerException("Null status");
        }
        hc.b bVar4 = bVar3;
        ac.h hVar3 = hVarA;
        long jMax = 0;
        while (true) {
            final int i2 = 0;
            hc.a aVar2 = new hc.a(gVar2) { // from class: fc.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ g f133574b;

                {
                    this.f133574b = gVar2;
                }

                @Override // hc.a
                public final Object execute() {
                    Boolean bool;
                    switch (i2) {
                        case 0:
                            j jVar3 = jVar2;
                            gc.j jVar4 = (gc.j) ((gc.d) this.f133574b.f133581c);
                            SQLiteDatabase sQLiteDatabaseD = jVar4.d();
                            sQLiteDatabaseD.beginTransaction();
                            try {
                                Long lF = gc.j.f(sQLiteDatabaseD, jVar3);
                                if (lF == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = jVar4.d().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lF.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th10) {
                                        cursorRawQuery.close();
                                        throw th10;
                                    }
                                }
                                sQLiteDatabaseD.setTransactionSuccessful();
                                return bool;
                            } finally {
                                sQLiteDatabaseD.endTransaction();
                            }
                        default:
                            gc.j jVar5 = (gc.j) ((gc.d) this.f133574b.f133581c);
                            jVar5.getClass();
                            return (Iterable) jVar5.g(new ae.a(jVar5, jVar2, 9));
                    }
                }
            };
            gc.j jVar3 = (gc.j) bVar4;
            if (!((Boolean) jVar3.j(aVar2)).booleanValue()) {
                jVar3.j(new ag.h(gVar2, jVar2, jMax));
                return;
            }
            final int i3 = 1;
            final Iterable iterable = (Iterable) jVar3.j(new hc.a(gVar2) { // from class: fc.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ g f133574b;

                {
                    this.f133574b = gVar2;
                }

                @Override // hc.a
                public final Object execute() {
                    Boolean bool;
                    switch (i3) {
                        case 0:
                            j jVar32 = jVar2;
                            gc.j jVar4 = (gc.j) ((gc.d) this.f133574b.f133581c);
                            SQLiteDatabase sQLiteDatabaseD = jVar4.d();
                            sQLiteDatabaseD.beginTransaction();
                            try {
                                Long lF = gc.j.f(sQLiteDatabaseD, jVar32);
                                if (lF == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = jVar4.d().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lF.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th10) {
                                        cursorRawQuery.close();
                                        throw th10;
                                    }
                                }
                                sQLiteDatabaseD.setTransactionSuccessful();
                                return bool;
                            } finally {
                                sQLiteDatabaseD.endTransaction();
                            }
                        default:
                            gc.j jVar5 = (gc.j) ((gc.d) this.f133574b.f133581c);
                            jVar5.getClass();
                            return (Iterable) jVar5.g(new ae.a(jVar5, jVar2, 9));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (hVar3 == null) {
                nim.a.j(jVar2, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                aVar = new ac.a(ac.c.FATAL_ERROR, -1L);
                bArr = bArr2;
                j2 = jMax;
                bVar = bVar4;
                hVar = hVar3;
            } else {
                ArrayList<zb.i> arrayList = new ArrayList();
                Iterator it9 = iterable.iterator();
                while (it9.hasNext()) {
                    arrayList.add(((gc.b) it9.next()).f142281c);
                }
                String str4 = "proto";
                if (bArr2 != null) {
                    gc.c cVar = (gc.c) gVar2.i;
                    Objects.requireNonNull(cVar);
                    cc.a aVar3 = (cc.a) jVar3.j(new ag.j(cVar, 19));
                    zb.h hVar4 = new zb.h();
                    hVar4.f = new HashMap();
                    hVar4.d = Long.valueOf(((ic.a) gVar2.f133582g).b());
                    hVar4.e = Long.valueOf(((ic.a) gVar2.f133583h).b());
                    hVar4.f320768a = "GDT_CLIENT_METRICS";
                    wb.c cVar2 = new wb.c("proto");
                    aVar3.getClass();
                    jpf.a aVar4 = o.f320789a;
                    aVar4.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        aVar4.l(aVar3, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    hVar4.f320770c = new m(cVar2, byteArrayOutputStream.toByteArray());
                    arrayList.add(((xb.c) hVar3).a(hVar4.b()));
                }
                xb.c cVar3 = (xb.c) hVar3;
                HashMap map = new HashMap();
                for (zb.i iVar : arrayList) {
                    String str5 = iVar.f320774a;
                    if (map.containsKey(str5)) {
                        ((List) map.get(str5)).add(iVar);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(iVar);
                        map.put(str5, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it10 = map.entrySet().iterator();
                while (it10.hasNext()) {
                    Map.Entry entry = (Map.Entry) it10.next();
                    zb.i iVar2 = (zb.i) ((List) entry.getValue()).get(0);
                    k0 k0Var = k0.DEFAULT;
                    long jB = cVar3.f.b();
                    long jB2 = cVar3.e.b();
                    byte[] bArr3 = bArr2;
                    yb.o oVar = new yb.o(y.ANDROID_FIREBASE, new yb.m(Integer.valueOf(iVar2.b("sdk-version")), iVar2.a("model"), iVar2.a("hardware"), iVar2.a("device"), iVar2.a("product"), iVar2.a("os-uild"), iVar2.a("manufacturer"), iVar2.a("fingerprint"), iVar2.a("locale"), iVar2.a("country"), iVar2.a("mcc_mnc"), iVar2.a("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (zb.i iVar3 : (List) entry.getValue()) {
                        m mVar = iVar3.f320776c;
                        long j3 = jMax;
                        wb.c cVar4 = mVar.f320786a;
                        byte[] bArr4 = mVar.f320787b;
                        if (cVar4.equals(new wb.c(str4))) {
                            gVar = new g();
                            gVar.e = bArr4;
                            str3 = str4;
                        } else {
                            str3 = str4;
                            if (cVar4.equals(new wb.c("json"))) {
                                String str6 = new String(bArr4, Charset.forName("UTF-8"));
                                g gVar3 = new g();
                                gVar3.f = str6;
                                gVar = gVar3;
                            } else {
                                it8 = it10;
                                bVar2 = bVar4;
                                hVar2 = hVar3;
                                if (Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 5)) {
                                    String str7 = "Received event of unsupported encoding " + cVar4 + ". Skipping...";
                                }
                                jMax = j3;
                                str4 = str3;
                                bVar4 = bVar2;
                                it10 = it8;
                                hVar3 = hVar2;
                            }
                        }
                        byte[] bArr5 = iVar3.f320779j;
                        byte[] bArr6 = iVar3.i;
                        Integer num = iVar3.f320777g;
                        it8 = it10;
                        bVar2 = bVar4;
                        gVar.f133579a = Long.valueOf(iVar3.d);
                        gVar.d = Long.valueOf(iVar3.e);
                        String str8 = (String) iVar3.f.get("tz-offset");
                        gVar.f133582g = Long.valueOf(str8 == null ? 0L : Long.valueOf(str8).longValue());
                        hVar2 = hVar3;
                        gVar.f133583h = new w(i0.a(iVar3.b("net-type")), h0.a(iVar3.b("mobile-subtype")));
                        Integer num2 = iVar3.f320775b;
                        if (num2 != null) {
                            gVar.f133580b = num2;
                        }
                        if (num != null) {
                            ryc.a aVarA = b0.a();
                            vfg.p pVarA = e0.a();
                            t tVarA = d0.a();
                            tVarA.v(num);
                            pVarA.h(tVarA.b());
                            aVarA.l(pVarA.c());
                            aVarA.m(a0.EVENT_OVERRIDE);
                            gVar.f133581c = aVarA.b();
                        }
                        if (bArr6 != null || bArr5 != null) {
                            e3 e3VarA = c0.a();
                            if (bArr6 != null) {
                                e3VarA.l(bArr6);
                            }
                            if (bArr5 != null) {
                                e3VarA.m(bArr5);
                            }
                            gVar.i = e3VarA.c();
                        }
                        String strR = ((Long) gVar.f133579a) == null ? " eventTimeMs" : "";
                        if (((Long) gVar.d) == null) {
                            strR = strR.concat(" eventUptimeMs");
                        }
                        if (((Long) gVar.f133582g) == null) {
                            strR = a0.d.r(strR, " timezoneOffsetSeconds");
                        }
                        if (!strR.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(strR));
                        }
                        arrayList4.add(new yb.t(((Long) gVar.f133579a).longValue(), (Integer) gVar.f133580b, (yb.p) gVar.f133581c, ((Long) gVar.d).longValue(), (byte[]) gVar.e, (String) gVar.f, ((Long) gVar.f133582g).longValue(), (w) gVar.f133583h, (yb.q) gVar.i));
                        jMax = j3;
                        str4 = str3;
                        bVar4 = bVar2;
                        it10 = it8;
                        hVar3 = hVar2;
                    }
                    arrayList3.add(new u(jB, jB2, oVar, numValueOf, str2, arrayList4, k0Var));
                    bArr2 = bArr3;
                }
                bArr = bArr2;
                j2 = jMax;
                bVar = bVar4;
                hVar = hVar3;
                n nVar = new n(arrayList3);
                URL urlB = cVar3.d;
                if (bArr != null) {
                    try {
                        xb.a aVarA2 = xb.a.a(bArr);
                        str = aVarA2.f303917b;
                        if (str == null) {
                            str = null;
                        }
                        String str9 = aVarA2.f303916a;
                        if (str9 != null) {
                            urlB = xb.c.b(str9);
                        }
                    } catch (IllegalArgumentException unused3) {
                        aVar = new ac.a(ac.c.FATAL_ERROR, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    gpk.c cVar5 = new gpk.c(urlB, nVar, str);
                    s sVar = new s(cVar3, 20);
                    int i5 = 5;
                    do {
                        bVarB = sVar.b(cVar5);
                        URL url2 = bVarB.f303919b;
                        if (url2 != null) {
                            nim.a.j(url2, "CctTransportBackend", "Following redirect to: %s");
                            cVar5 = new gpk.c(url2, (n) cVar5.f145464b, (String) cVar5.f145465c);
                        } else {
                            cVar5 = null;
                        }
                        if (cVar5 == null) {
                            break;
                        } else {
                            i5--;
                        }
                    } while (i5 >= 1);
                    int i6 = bVarB.f303918a;
                    aVar = i6 == 200 ? new ac.a(ac.c.OK, bVarB.f303920c) : (i6 >= 500 || i6 == 404) ? new ac.a(ac.c.TRANSIENT_ERROR, -1L) : i6 == 400 ? new ac.a(ac.c.INVALID_PAYLOAD, -1L) : new ac.a(ac.c.FATAL_ERROR, -1L);
                } catch (IOException e) {
                    nim.a.k("CctTransportBackend", "Could not make request to the backend", e);
                    aVar = new ac.a(ac.c.TRANSIENT_ERROR, -1L);
                }
            }
            ac.c cVar6 = ac.c.TRANSIENT_ERROR;
            ac.c cVar7 = aVar.f3000a;
            if (cVar7 == cVar6) {
                final long j5 = j2;
                jVar3.j(new hc.a() { // from class: fc.f
                    @Override // hc.a
                    public final Object execute() {
                        g gVar4 = this.f133576a;
                        gc.j jVar4 = (gc.j) ((gc.d) gVar4.f133581c);
                        jVar4.getClass();
                        Iterable iterable2 = iterable;
                        if (iterable2.iterator().hasNext()) {
                            String str10 = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + gc.j.k(iterable2);
                            SQLiteDatabase sQLiteDatabaseD = jVar4.d();
                            sQLiteDatabaseD.beginTransaction();
                            try {
                                sQLiteDatabaseD.compileStatement(str10).execute();
                                Cursor cursorRawQuery = sQLiteDatabaseD.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                                while (cursorRawQuery.moveToNext()) {
                                    try {
                                        jVar4.i(cursorRawQuery.getInt(0), cc.d.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                                    } catch (Throwable th10) {
                                        cursorRawQuery.close();
                                        throw th10;
                                    }
                                }
                                cursorRawQuery.close();
                                sQLiteDatabaseD.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                                sQLiteDatabaseD.setTransactionSuccessful();
                            } finally {
                                sQLiteDatabaseD.endTransaction();
                            }
                        }
                        jVar4.g(new gc.f(((ic.a) gVar4.f133582g).b() + j5, jVar));
                        return null;
                    }
                });
                ((gpk.c) this.d).h(jVar, i + 1, true);
                return;
            }
            gVar2 = this;
            jVar2 = jVar;
            jMax = j2;
            jVar3.j(new ae.a(gVar2, iterable, 7));
            if (cVar7 == ac.c.OK) {
                jMax = Math.max(jMax, aVar.f3001b);
                if (bArr != null) {
                    jVar3.j(new ag.j(gVar2, 20));
                }
            } else if (cVar7 == ac.c.INVALID_PAYLOAD) {
                HashMap map2 = new HashMap();
                Iterator it11 = iterable.iterator();
                while (it11.hasNext()) {
                    String str10 = ((gc.b) it11.next()).f142281c.f320774a;
                    if (map2.containsKey(str10)) {
                        map2.put(str10, Integer.valueOf(((Integer) map2.get(str10)).intValue() + 1));
                    } else {
                        map2.put(str10, 1);
                    }
                }
                jVar3.j(new ae.a(gVar2, map2, 8));
            }
            bArr2 = bArr;
            bVar4 = bVar;
            hVar3 = hVar;
        }
    }

    public pfm.a f() {
        tx9.f fVar = (tx9.f) this.f133579a;
        ufm.c cVar = new ufm.c(new tx9.a(fVar.f275378a, 1), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        ufm.n nVarI0 = te0.w.i0(cVar);
        tx9.e eVar = fVar.f275378a;
        ufm.c cVar2 = new ufm.c(new tx9.a(eVar, 3), 2);
        Intrinsics.checkNotNullExpressionValue(cVar2, "fromCallable(...)");
        ufm.n nVarI02 = te0.w.i0(cVar2);
        ufm.c cVar3 = new ufm.c(new tx9.a(eVar, 4), 2);
        Intrinsics.checkNotNullExpressionValue(cVar3, "fromCallable(...)");
        ufm.i iVar = new ufm.i(te0.w.I0(nVarI0, nVarI02, te0.w.i0(cVar3)), new xx9.d(8, new xx9.n(this, 0)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        pfm.a aVar = new pfm.a(iVar, new xx9.d(19, new xx9.n(this, 5)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }
}
