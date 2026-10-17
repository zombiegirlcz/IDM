package s0m;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.wallet.WalletConstants;
import g1m.i;
import g1m.j;
import g1m.k;
import g1m.l;
import h7.d0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.t;
import kotlin.time.b;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import ulm.b1;
import ulm.e0;
import ulm.i1;
import ulm.j1;
import ulm.o1;
import ulm.p1;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes23.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();
    public final AtomicReference A;
    public final AtomicReference B;
    public Map C;
    public long D;
    public long E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f258999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f259000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f259001c;
    public final AtomicBoolean d;
    public final boolean e;
    public final Context f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f259002g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f259003h;
    public final TimeUnit i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e0 f259004j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public OkHttpClient f259005l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t0m.d f259006m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final EnumSet f259007n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f259008p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f259009q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f259010r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f259011s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public g1m.d f259012t;
    public d1m.b u;
    public j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Integer f259013w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f259014x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final AtomicReference f259015y;
    public boolean z;

    public c(t0m.d dVar, Context context, String collectorUri, Function1 function1) {
        i iVar;
        Intrinsics.checkNotNullParameter("com.fourthline.sdk", "namespace");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(collectorUri, "collectorUri");
        String TAG = c.class.getSimpleName();
        this.f258999a = TAG;
        this.f259001c = new AtomicBoolean(false);
        this.d = new AtomicBoolean(false);
        this.i = d.f259023m;
        this.k = d.k;
        this.f259006m = dVar == null ? new t0m.d(context) : dVar;
        EnumSet enumSet = d.d;
        this.f259007n = enumSet;
        this.o = d.f;
        this.f259008p = d.f259019g;
        this.f259009q = d.e;
        this.f259010r = d.f259020h;
        this.f259011s = d.i;
        this.f259012t = d.f259016a;
        this.u = d.f259017b;
        this.v = d.f259018c;
        this.f259013w = Integer.valueOf(d.f259021j);
        AtomicReference atomicReference = new AtomicReference();
        this.f259015y = atomicReference;
        this.z = false;
        this.A = new AtomicReference();
        this.B = new AtomicReference(Boolean.valueOf(d.f259022l));
        this.D = d.o;
        this.E = d.f259024n;
        this.f = context;
        ((d0) function1).invoke(this);
        if (((g1m.e) atomicReference.get()) == null) {
            this.e = false;
            if (!a0.H(collectorUri, "http", false)) {
                collectorUri = (this.v == j.HTTPS ? "https://" : "http://").concat(collectorUri);
            }
            this.f259002g = collectorUri;
            Integer num = this.f259013w;
            if (num != null) {
                int iIntValue = num.intValue();
                g1m.h hVar = new g1m.h(collectorUri, context);
                hVar.a(this.f259012t);
                hVar.b(enumSet);
                hVar.e = iIntValue;
                hVar.f139739h = this.f259014x;
                hVar.f = this.f259005l;
                hVar.f139738g = this.f259004j;
                hVar.i = this.z;
                hVar.f139740j = this.C;
                iVar = new i(hVar);
            } else {
                iVar = null;
            }
            d(iVar);
        } else {
            this.e = true;
        }
        int i = this.k;
        if (i > 2) {
            if (i >= 2) {
                f.f259028b = i;
            } else {
                ScheduledExecutorService scheduledExecutorService = f.f259027a;
            }
        }
        this.f259000b = true;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        z0m.j.e(TAG, "Emitter created successfully!", new Object[0]);
    }

    public final void a(g1m.e eVar) throws Throwable {
        long size;
        Object obj2;
        List<d1m.c> list;
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor;
        HashMap map;
        AtomicBoolean atomicBoolean;
        Context context;
        t0m.d dVar;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int iDelete;
        SQLiteDatabase sQLiteDatabase2;
        Iterator it8;
        boolean zBooleanValue;
        Integer num;
        g1m.d dVar2;
        j1 j1Var;
        c cVar = this;
        boolean z = cVar.d.get();
        AtomicBoolean atomicBoolean2 = cVar.f259001c;
        String TAG = cVar.f258999a;
        String str7 = "TAG";
        int i = 0;
        if (z) {
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z0m.j.a(TAG, "Emitter paused.", new Object[0]);
            atomicBoolean2.compareAndSet(true, false);
            return;
        }
        Context context2 = cVar.f;
        if (!a1m.e.y(context2)) {
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z0m.j.a(TAG, "Emitter loop stopping: emitter offline.", new Object[0]);
            atomicBoolean2.compareAndSet(true, false);
            return;
        }
        if (eVar == null) {
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z0m.j.a(TAG, "No networkConnection set.", new Object[0]);
            atomicBoolean2.compareAndSet(true, false);
            return;
        }
        t0m.d dVar3 = cVar.f259006m;
        String str8 = "events";
        if (dVar3.a()) {
            dVar3.c();
            size = DatabaseUtils.queryNumEntries(dVar3.f267054b, "events");
        } else {
            size = dVar3.f267053a.size();
        }
        if (size <= 0) {
            int i2 = cVar.f259003h;
            if (i2 >= cVar.f259008p) {
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                z0m.j.a(TAG, "Emitter loop stopping: empty limit reached.", new Object[0]);
                atomicBoolean2.compareAndSet(true, false);
                return;
            }
            cVar.f259003h = i2 + 1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            z0m.j.b(TAG, "Emitter database empty: " + cVar.f259003h, new Object[0]);
            try {
                cVar.i.sleep(cVar.o);
            } catch (InterruptedException e) {
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                z0m.j.b(TAG, "Emitter thread sleep interrupted: " + e, new Object[0]);
            }
            a(eVar);
            return;
        }
        cVar.f259003h = 0;
        int i3 = cVar.f259009q;
        if (dVar3.a()) {
            dVar3.c();
            ArrayList arrayList = new ArrayList();
            String str9 = "id DESC LIMIT " + i3;
            ArrayList<Map> arrayList2 = new ArrayList();
            String str10 = "eventData";
            if (!dVar3.a() || (sQLiteDatabase = dVar3.f267054b) == null) {
                obj2 = "id";
            } else {
                try {
                    obj2 = "id";
                    Cursor cursorQuery = sQLiteDatabase.query("events", dVar3.d, null, null, null, null, str9);
                    try {
                        cursorQuery.moveToFirst();
                        while (!cursorQuery.isAfterLast()) {
                            HashMap map2 = new HashMap();
                            map2.put(obj2, Long.valueOf(cursorQuery.getLong(i)));
                            byte[] bytes = cursorQuery.getBlob(1);
                            Intrinsics.checkNotNullExpressionValue(bytes, "cursor.getBlob(1)");
                            Intrinsics.checkNotNullParameter(bytes, "bytes");
                            try {
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
                                        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                                        Object object = objectInputStream.readObject();
                                        map = object instanceof HashMap ? (HashMap) object : null;
                                        objectInputStream.close();
                                        byteArrayInputStream.close();
                                    } catch (ClassNotFoundException e2) {
                                        e2.printStackTrace();
                                        map = null;
                                        map2.put("eventData", map);
                                        map2.put("dateCreated", cursorQuery.getString(2));
                                        cursorQuery.moveToNext();
                                        arrayList2.add(map2);
                                        i = 0;
                                    }
                                } catch (NullPointerException e4) {
                                    e4.printStackTrace();
                                    map = null;
                                    map2.put("eventData", map);
                                    map2.put("dateCreated", cursorQuery.getString(2));
                                    cursorQuery.moveToNext();
                                    arrayList2.add(map2);
                                    i = 0;
                                }
                            } catch (IOException e5) {
                                e5.printStackTrace();
                                map = null;
                                map2.put("eventData", map);
                                map2.put("dateCreated", cursorQuery.getString(2));
                                cursorQuery.moveToNext();
                                arrayList2.add(map2);
                                i = 0;
                            }
                            map2.put("eventData", map);
                            map2.put("dateCreated", cursorQuery.getString(2));
                            cursorQuery.moveToNext();
                            arrayList2.add(map2);
                            i = 0;
                        }
                        cursorQuery.close();
                    } catch (Throwable th10) {
                        th = th10;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (Throwable th11) {
                    th = th11;
                    cursor = null;
                }
            }
            for (Map map3 : arrayList2) {
                h1m.b bVar = new h1m.b();
                Object obj3 = map3.get(str10);
                Map map4 = obj3 instanceof Map ? (Map) obj3 : null;
                if (map4 != null) {
                    bVar.c(map4);
                }
                Object obj4 = map3.get(obj2);
                Long l2 = obj4 instanceof Long ? (Long) obj4 : null;
                if (l2 == null) {
                    Intrinsics.checkNotNullExpressionValue("d", "TAG");
                    z0m.j.b("d", "Unable to get ID of an event extracted from the database.", new Object[0]);
                } else {
                    arrayList.add(new d1m.c(bVar, l2.longValue()));
                    str10 = str10;
                }
            }
            list = arrayList;
        } else {
            list = f0.f322471a;
        }
        i iVar = (i) eVar;
        Uri.Builder builder = iVar.f139745h;
        g1m.d dVar4 = iVar.f139743c;
        ArrayList requests = new ArrayList();
        String strValueOf = String.valueOf(System.currentTimeMillis());
        if (dVar4 == g1m.d.GET) {
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                d1m.c cVar2 = (d1m.c) it9.next();
                Iterator it10 = it9;
                h1m.b bVar2 = cVar2 != null ? cVar2.f110672a : null;
                if (bVar2 != null) {
                    bVar2.a("stm", strValueOf);
                    requests.add(new k(bVar2, cVar2.f110673b, cVar.b(bVar2, new ArrayList(), dVar4)));
                    it9 = it10;
                    context2 = context2;
                    atomicBoolean2 = atomicBoolean2;
                    dVar3 = dVar3;
                    str8 = str8;
                } else {
                    it9 = it10;
                }
            }
            atomicBoolean = atomicBoolean2;
            context = context2;
            dVar = dVar3;
            str = str8;
            str2 = TAG;
            str3 = "TAG";
        } else {
            atomicBoolean = atomicBoolean2;
            context = context2;
            dVar = dVar3;
            str = "events";
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (d1m.c cVar3 : list) {
                if (cVar3 != null) {
                    h1m.b bVar3 = cVar3.f110672a;
                    str4 = TAG;
                    str5 = str7;
                    long j2 = cVar3.f110673b;
                    bVar3.a("stm", strValueOf);
                    if (cVar.b(bVar3, new ArrayList(), dVar4)) {
                        str6 = strValueOf;
                        requests.add(new k(bVar3, j2, true));
                    } else {
                        str6 = strValueOf;
                        if (cVar.b(bVar3, arrayList4, dVar4)) {
                            requests.add(new k(arrayList4, arrayList3));
                            arrayList4 = new ArrayList();
                            arrayList3 = new ArrayList();
                            arrayList4.add(bVar3);
                            arrayList3.add(Long.valueOf(j2));
                        } else {
                            arrayList4.add(bVar3);
                            arrayList3.add(Long.valueOf(j2));
                        }
                    }
                } else {
                    str4 = TAG;
                    str5 = str7;
                    str6 = strValueOf;
                }
                TAG = str4;
                str7 = str5;
                strValueOf = str6;
            }
            str2 = TAG;
            str3 = str7;
            if (!arrayList4.isEmpty()) {
                requests.add(new k(arrayList4, arrayList3));
            }
        }
        Map map5 = iVar.f;
        String str11 = iVar.f139741a;
        Intrinsics.checkNotNullParameter(requests, "requests");
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        Iterator it11 = requests.iterator();
        while (it11.hasNext()) {
            k kVar = (k) it11.next();
            String str12 = kVar.d;
            h1m.b bVar4 = kVar.f139746a;
            if (str12 == null) {
                str12 = i.i;
            }
            Map map6 = map5;
            Iterator it12 = it11;
            String str13 = str2;
            if (dVar4 == g1m.d.GET) {
                builder.clearQuery();
                HashMap map7 = bVar4.f148612b;
                Iterator it13 = map7.keySet().iterator();
                while (it13.hasNext()) {
                    g1m.d dVar5 = dVar4;
                    String str14 = (String) it13.next();
                    Iterator it14 = it13;
                    Object obj5 = map7.get(str14);
                    HashMap map8 = map7;
                    builder.appendQueryParameter(str14, obj5 instanceof String ? (String) obj5 : null);
                    it13 = it14;
                    dVar4 = dVar5;
                    map7 = map8;
                }
                dVar2 = dVar4;
                String string = builder.build().toString();
                Intrinsics.checkNotNullExpressionValue(string, "uriBuilder.build().toString()");
                i1 i1Var = new i1();
                i1Var.e(string);
                i1Var.b("User-Agent", str12);
                i1Var.c("GET", null);
                if (iVar.e) {
                    i1Var.b("SP-Anonymous", "*");
                }
                if (map6 != null) {
                    for (Map.Entry entry : map6.entrySet()) {
                        i1Var.b((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                j1Var = new j1(i1Var);
            } else {
                dVar2 = dVar4;
                String string2 = builder.build().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "uriBuilder.build().toString()");
                p1 p1Var = RequestBody.Companion;
                String string3 = bVar4.toString();
                b1 b1Var = iVar.f139742b;
                p1Var.getClass();
                o1 body = p1.b(string3, b1Var);
                i1 i1Var2 = new i1();
                i1Var2.e(string2);
                i1Var2.b("User-Agent", str12);
                Intrinsics.checkNotNullParameter(body, "body");
                i1Var2.c("POST", body);
                if (iVar.e) {
                    i1Var2.b("SP-Anonymous", "*");
                }
                if (map6 != null) {
                    for (Map.Entry entry2 : map6.entrySet()) {
                        i1Var2.b((String) entry2.getKey(), (String) entry2.getValue());
                    }
                }
                j1Var = new j1(i1Var2);
            }
            Future futureB = f.b(new g1m.f(iVar, j1Var, 0));
            if (futureB != null) {
                arrayList5.add(futureB);
            }
            map5 = map6;
            it11 = it12;
            str2 = str13;
            dVar4 = dVar2;
        }
        String str15 = str2;
        String str16 = str3;
        Intrinsics.checkNotNullExpressionValue(str11, str16);
        z0m.j.a(str11, "Request Futures: %s", Integer.valueOf(arrayList5.size()));
        int size2 = arrayList5.size();
        for (int i5 = 0; i5 < size2; i5++) {
            try {
                Object obj6 = ((Future) arrayList5.get(i5)).get(iVar.d, TimeUnit.SECONDS);
                num = obj6 instanceof Integer ? (Integer) obj6 : null;
            } catch (InterruptedException e6) {
                Intrinsics.checkNotNullExpressionValue(str11, str16);
                z0m.j.b(str11, "Request Future was interrupted: %s", e6.getMessage());
            } catch (ExecutionException e22) {
                Intrinsics.checkNotNullExpressionValue(str11, str16);
                z0m.j.b(str11, "Request Future failed: %s", e22.getMessage());
            } catch (TimeoutException e33) {
                Intrinsics.checkNotNullExpressionValue(str11, str16);
                z0m.j.b(str11, "Request Future had a timeout: %s", e33.getMessage());
            }
            int iIntValue = num != null ? num.intValue() : -1;
            k kVar2 = (k) requests.get(i5);
            ArrayList arrayList7 = kVar2.f139747b;
            boolean z3 = kVar2.f139748c;
            arrayList6.add(new l(iIntValue, arrayList7, z3));
            if (z3) {
                Intrinsics.checkNotNullExpressionValue(str11, str16);
                z0m.j.d(str11, "Request is oversized for emitter event IDs: %s", arrayList7.toString());
            }
        }
        Intrinsics.checkNotNullExpressionValue(str15, str16);
        z0m.j.e(str15, "Processing emitter results.", new Object[0]);
        ArrayList list2 = new ArrayList();
        Iterator it15 = arrayList6.iterator();
        int size3 = 0;
        int size4 = 0;
        int size5 = 0;
        while (it15.hasNext()) {
            l lVar = (l) it15.next();
            int i6 = lVar.f139749a;
            boolean z4 = 200 <= i6 && i6 < 300;
            List list3 = lVar.f139751c;
            if (z4) {
                list2.addAll(list3);
                size5 += list3.size();
            } else {
                Map map9 = (Map) cVar.A.get();
                Object obj7 = cVar.B.get();
                Intrinsics.checkNotNullExpressionValue(obj7, "_retryFailedRequests.get()");
                boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                int i21 = lVar.f139749a;
                if ((200 <= i21 && i21 < 300) || !zBooleanValue2 || lVar.f139750b) {
                    it8 = it15;
                    zBooleanValue = false;
                } else if (map9 == null || !map9.containsKey(Integer.valueOf(i6))) {
                    it8 = it15;
                    zBooleanValue = !new HashSet(v.k(400, 401, 403, Integer.valueOf(WalletConstants.ERROR_CODE_INVALID_TRANSACTION), 422)).contains(Integer.valueOf(i6));
                } else {
                    Object obj8 = map9.get(Integer.valueOf(i6));
                    Intrinsics.h(obj8);
                    zBooleanValue = ((Boolean) obj8).booleanValue();
                    it8 = it15;
                }
                if (zBooleanValue) {
                    size3 += list3.size();
                    Intrinsics.checkNotNullExpressionValue(str15, str16);
                    z0m.j.b(str15, "Request sending failed but we will retry later.", new Object[0]);
                } else {
                    size4 += list3.size();
                    list2.addAll(list3);
                    Intrinsics.checkNotNullExpressionValue(str15, str16);
                    String str17 = String.format("Sending events to Collector failed with status %d. Events will be dropped.", Arrays.copyOf(new Object[]{Integer.valueOf(i6)}, 1));
                    Intrinsics.checkNotNullExpressionValue(str17, "format(format, *args)");
                    z0m.j.b(str15, str17, new Object[0]);
                }
                cVar = this;
                it15 = it8;
            }
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(list2, "ids");
        if (!list2.isEmpty()) {
            if (!dVar.a() || (sQLiteDatabase2 = dVar.f267054b) == null) {
                iDelete = -1;
            } else {
                StringBuilder sb6 = new StringBuilder("id in (");
                Intrinsics.checkNotNullParameter(list2, "list");
                StringBuilder sb9 = new StringBuilder();
                int size6 = list2.size();
                for (int i22 = 0; i22 < size6; i22++) {
                    if (((Long) list2.get(i22)) != null) {
                        sb9.append(list2.get(i22));
                        if (i22 < list2.size() - 1) {
                            sb9.append(",");
                        }
                    }
                }
                String string4 = sb9.toString();
                Intrinsics.checkNotNullExpressionValue(string4, "s.toString()");
                if (a0.y(string4, ",", false)) {
                    sb9 = new StringBuilder(sb9.substring(0, sb9.length() - 1));
                }
                String string5 = sb9.toString();
                Intrinsics.checkNotNullExpressionValue(string5, "s.toString()");
                sb6.append(string5);
                sb6.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                iDelete = sQLiteDatabase2.delete(str, sb6.toString(), null);
            }
            Intrinsics.checkNotNullExpressionValue("d", str16);
            z0m.j.a("d", "Removed events from database: %s", Integer.valueOf(iDelete));
            list2.size();
        }
        Intrinsics.checkNotNullExpressionValue(str15, str16);
        z0m.j.a(str15, "Success Count: %s", Integer.valueOf(size5));
        Intrinsics.checkNotNullExpressionValue(str15, str16);
        z0m.j.a(str15, "Failure Count: %s", Integer.valueOf(size4 + size3));
        if (size3 <= 0 || size5 != 0) {
            a(eVar);
            return;
        }
        if (a1m.e.y(context)) {
            Intrinsics.checkNotNullExpressionValue(str15, str16);
            Uri uriBuild = builder.clearQuery().build();
            Intrinsics.checkNotNullExpressionValue(uriBuild, "uriBuilder.clearQuery().build()");
            z0m.j.b(str15, "Ensure collector path is valid: %s", uriBuild);
        }
        Intrinsics.checkNotNullExpressionValue(str15, str16);
        z0m.j.b(str15, "Emitter loop stopping: failures.", new Object[0]);
        atomicBoolean.compareAndSet(true, false);
    }

    public final boolean b(h1m.b bVar, ArrayList arrayList, g1m.d dVar) {
        long j2 = dVar == g1m.d.GET ? this.f259010r : this.f259011s;
        long jD = bVar.d();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            jD += ((h1m.b) it8.next()).d();
        }
        return jD + ((long) (!arrayList.isEmpty() ? arrayList.size() + 88 : 0)) > j2;
    }

    public final void c() {
        long j2 = this.D;
        long j3 = this.E;
        t0m.d dVar = this.f259006m;
        if (dVar.a()) {
            dVar.c();
            SQLiteDatabase sQLiteDatabase = dVar.f267054b;
            if (sQLiteDatabase != null) {
                StringBuilder sb6 = new StringBuilder("\n                DELETE FROM events\n                WHERE id NOT IN (\n                    SELECT id\n                    FROM events\n                    WHERE dateCreated >= datetime('now','-");
                b.Companion companion = kotlin.time.b.INSTANCE;
                sb6.append(kotlin.time.b.n(j3, pkm.e.SECONDS));
                sb6.append(" seconds')\n                    ORDER BY dateCreated DESC, id DESC\n                    LIMIT ");
                sb6.append(j2);
                sb6.append("\n                )\n                ");
                sQLiteDatabase.execSQL(t.e(sb6.toString()));
            }
        }
    }

    public final void d(g1m.e eVar) {
        this.f259015y.set(eVar);
    }

    public final void e() {
        String TAG = this.f258999a;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        z0m.j.a(TAG, "Shutting down emitter.", new Object[0]);
        this.f259001c.compareAndSet(true, false);
        ScheduledExecutorService scheduledExecutorService = f.f259027a;
        if (scheduledExecutorService != null) {
            try {
                scheduledExecutorService.shutdown();
            } catch (Exception e) {
                String message = e.getMessage();
                if (message == null) {
                    message = "Failed to shutdown";
                }
                z0m.j.b("Executor", message, new Object[0]);
            }
            f.f259027a = null;
        }
    }
}
