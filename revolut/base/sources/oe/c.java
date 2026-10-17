package oe;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import ch.m;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.t;
import ecm.q;
import eoi.u;
import et0.w;
import fc.g;
import ie.a0;
import ie.i;
import ie.k;
import ie.s;
import ie.y;
import ie.z;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import je.d;
import ke.e;
import ke.f;
import ke.h;
import ke.n;
import ke.o;
import le.a1;
import le.b0;
import le.c0;
import le.d1;
import le.d2;
import le.e1;
import le.g0;
import le.g1;
import le.h1;
import le.k2;
import le.p0;
import le.q0;
import le.r0;
import le.s0;
import le.u0;
import le.v0;
import le.w0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements kz0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f224497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f224498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f224499c;
    public Object d = new m(this, false);
    public Object e = new m(this, true);
    public Object f = new o();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f224500g = new AtomicMarkableReference(null, false);

    public c(String str, c cVar, d dVar) {
        this.f224497a = str;
        this.f224498b = new h(cVar);
        this.f224499c = dVar;
    }

    public static q0 b(q0 q0Var, f fVar, c cVar, Map map) {
        Map mapUnmodifiableMap;
        Map mapUnmodifiableMap2;
        Map mapUnmodifiableMap3;
        p0 p0VarA = q0Var.a();
        String strJ = ((ke.d) fVar.f182934b).j();
        if (strJ != null) {
            p0VarA.e = new d1(strJ);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
        }
        m mVar = (m) cVar.d;
        if (map.isEmpty()) {
            e eVar = (e) ((AtomicMarkableReference) mVar.f24042b).getReference();
            synchronized (eVar) {
                mapUnmodifiableMap2 = Collections.unmodifiableMap(new HashMap(eVar.f182929a));
            }
        } else {
            e eVar2 = (e) ((AtomicMarkableReference) mVar.f24042b).getReference();
            synchronized (eVar2) {
                mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(eVar2.f182929a));
            }
            HashMap map2 = new HashMap(mapUnmodifiableMap);
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String strA = e.a(1024, (String) entry.getKey());
                if (map2.size() < 64 || map2.containsKey(strA)) {
                    map2.put(strA, e.a(1024, (String) entry.getValue()));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                String str = "Ignored " + i + " keys when adding event specific keys. Maximum allowable: 1024";
            }
            mapUnmodifiableMap2 = Collections.unmodifiableMap(map2);
        }
        List listI = i(mapUnmodifiableMap2);
        e eVar3 = (e) ((AtomicMarkableReference) ((m) cVar.e).f24042b).getReference();
        synchronized (eVar3) {
            mapUnmodifiableMap3 = Collections.unmodifiableMap(new HashMap(eVar3.f182929a));
        }
        List listI2 = i(mapUnmodifiableMap3);
        if (!listI.isEmpty() || !listI2.isEmpty()) {
            r0 r0Var = (r0) q0Var.f194371c;
            p0VarA.f194364c = new r0(r0Var.f194375a, listI, listI2, r0Var.d, r0Var.e, r0Var.f, r0Var.f194378g);
        }
        return p0VarA.a();
    }

    public static k2 c(q0 q0Var, c cVar) {
        List listA = ((o) cVar.f).a();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listA.size(); i++) {
            n nVar = (n) listA.get(i);
            nVar.getClass();
            e1 e1Var = new e1();
            ke.b bVar = (ke.b) nVar;
            String str = bVar.e;
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            String str2 = bVar.f182924b;
            if (str2 == null) {
                throw new NullPointerException("Null rolloutId");
            }
            e1Var.f194254a = new g1(str2, str);
            String str3 = bVar.f182925c;
            if (str3 == null) {
                throw new NullPointerException("Null parameterKey");
            }
            e1Var.f194255b = str3;
            String str4 = bVar.d;
            if (str4 == null) {
                throw new NullPointerException("Null parameterValue");
            }
            e1Var.f194256c = str4;
            e1Var.d = bVar.f;
            e1Var.e = (byte) (e1Var.e | 1);
            arrayList.add(e1Var.a());
        }
        if (arrayList.isEmpty()) {
            return q0Var;
        }
        p0 p0VarA = q0Var.a();
        p0VarA.f = new h1(arrayList);
        return p0VarA.a();
    }

    public static String f(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bArr = new byte[8192];
            } finally {
            }
        } catch (Throwable th10) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th11) {
                th10.addSuppressed(th11);
            }
            throw th10;
        }
        while (true) {
            int i = bufferedInputStream.read(bArr);
            if (i == -1) {
                String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                byteArrayOutputStream.close();
                bufferedInputStream.close();
                return string;
            }
            byteArrayOutputStream.write(bArr, 0, i);
            bufferedInputStream.close();
            throw th10;
        }
    }

    public static c g(Context context, z zVar, c cVar, ie.a aVar, f fVar, c cVar2, ao.h hVar, g gVar, ao.h hVar2, k kVar, d dVar) {
        s sVar = new s(context, zVar, aVar, hVar, gVar);
        a aVar2 = new a(cVar, gVar, kVar);
        me.b bVar = pe.a.f235268b;
        zb.s.b(context);
        pe.a aVar3 = new pe.a(new pe.c(zb.s.a().c(new xb.a(pe.a.f235269c, pe.a.d)).a("FIREBASE_CRASHLYTICS_REPORT", new wb.c("json"), pe.a.e), gVar.b(), hVar2));
        c cVar3 = new c();
        cVar3.f224497a = sVar;
        cVar3.f224498b = aVar2;
        cVar3.f224499c = aVar3;
        cVar3.d = fVar;
        cVar3.e = cVar2;
        cVar3.f = zVar;
        cVar3.f224500g = dVar;
        return cVar3;
    }

    public static List i(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                throw new NullPointerException("Null value");
            }
            arrayList.add(new g0(str, str2));
        }
        Collections.sort(arrayList, new i(1));
        return Collections.unmodifiableList(arrayList);
    }

    public static synchronized void k(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                }
                file.delete();
            }
            if (!file.mkdirs()) {
                String str2 = "Could not create Crashlytics-specific directory: " + file;
            }
        } catch (Throwable th10) {
            throw th10;
        }
    }

    public static boolean l(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                l(file2);
            }
        }
        return file.delete();
    }

    public static List m(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    @Override // kz0.b
    public kz0.a a(long j2) {
        return new eoi.s((Activity) this.f224497a, ((q) this.d).a(j2), (aoi.c) this.e, j2, (uo.b) this.f224498b, (uo.q0) this.f224499c, (eoi.c) this.f, (u) this.f224500g);
    }

    public ef.a d() {
        String strR = ((ef.c) this.f224498b) == null ? " registrationStatus" : "";
        if (((Long) this.e) == null) {
            strR = strR.concat(" expiresInSecs");
        }
        if (((Long) this.f) == null) {
            strR = a0.d.r(strR, " tokenCreationEpochInSecs");
        }
        if (strR.isEmpty()) {
            return new ef.a((String) this.f224497a, (ef.c) this.f224498b, (String) this.f224499c, (String) this.d, ((Long) this.e).longValue(), ((Long) this.f).longValue(), (String) this.f224500g);
        }
        throw new IllegalStateException("Missing required properties:".concat(strR));
    }

    public void e(String str) {
        File file = new File((File) this.f224498b, str);
        if (file.exists() && l(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            }
        }
    }

    public File h(String str, String str2) {
        File file = new File((File) this.d, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public void j(Throwable th10, Thread thread, String str, ke.c cVar, boolean z) {
        byte b4;
        ao.h hVar;
        boolean zEquals = str.equals("crash");
        s sVar = (s) this.f224497a;
        long jC = cVar.c();
        Context context = sVar.f160565a;
        int i = context.getResources().getConfiguration().orientation;
        ao.h hVar2 = sVar.d;
        Stack stack = new Stack();
        for (Throwable cause = th10; cause != null; cause = cause.getCause()) {
            stack.push(cause);
        }
        t tVar = null;
        while (!stack.isEmpty()) {
            Throwable th11 = (Throwable) stack.pop();
            tVar = new t(th11.getLocalizedMessage(), th11.getClass().getName(), hVar2.n(th11.getStackTrace()), tVar, 15);
        }
        t tVar2 = tVar;
        p0 p0Var = new p0();
        p0Var.f194363b = str;
        p0Var.f194362a = jC;
        p0Var.f194365g = (byte) (p0Var.f194365g | 1);
        d2 d2VarD = fe.c.f134429b.d(context);
        int i2 = ((a1) d2VarD).f194199c;
        Boolean boolValueOf = i2 > 0 ? Boolean.valueOf(i2 != 100) : null;
        ArrayList arrayListC = fe.c.c(context);
        byte b5 = (byte) 1;
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) tVar2.d;
        String name = thread.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        byte b7 = (byte) 1;
        List listD = s.d(stackTraceElementArr, 4);
        if (listD == null) {
            throw new NullPointerException("Null frames");
        }
        if (b7 != 1) {
            StringBuilder sb6 = new StringBuilder();
            if (b7 == 0) {
                sb6.append(" importance");
            }
            throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.q("Missing required properties:", sb6));
        }
        arrayList.add(new w0(4, name, listD));
        if (z) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (key.equals(thread)) {
                    b4 = b7;
                    hVar = hVar2;
                } else {
                    StackTraceElement[] stackTraceElementArrN = hVar2.n(entry.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        throw new NullPointerException("Null name");
                    }
                    hVar = hVar2;
                    List listD2 = s.d(stackTraceElementArrN, 0);
                    if (listD2 == null) {
                        throw new NullPointerException("Null frames");
                    }
                    if (b7 != 1) {
                        byte b13 = b7;
                        StringBuilder sb9 = new StringBuilder();
                        if (b13 == 0) {
                            sb9.append(" importance");
                        }
                        throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.q("Missing required properties:", sb9));
                    }
                    b4 = b7;
                    arrayList.add(new w0(0, name2, listD2));
                }
                hVar2 = hVar;
                b7 = b4;
            }
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        u0 u0VarC = s.c(tVar2, 0);
        v0 v0VarE = s.e();
        List listA = sVar.a();
        if (listA == null) {
            throw new NullPointerException("Null binaries");
        }
        s0 s0Var = new s0(listUnmodifiableList, u0VarC, null, v0VarE, listA);
        if (b5 != 1) {
            StringBuilder sb10 = new StringBuilder();
            if (b5 == 0) {
                sb10.append(" uiOrientation");
            }
            throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.q("Missing required properties:", sb10));
        }
        p0Var.f194364c = new r0(s0Var, null, null, boolValueOf, d2VarD, arrayListC, i);
        p0Var.d = sVar.b(i);
        q0 q0VarA = p0Var.a();
        Map mapA = cVar.a();
        f fVar = (f) this.d;
        c cVar2 = (c) this.e;
        k2 k2VarC = c(b(q0VarA, fVar, cVar2, mapA), cVar2);
        if (z) {
            ((a) this.f224498b).d(k2VarC, cVar.b(), zEquals);
        } else {
            ((d) this.f224500g).f173168b.b(new a0(this, k2VarC, cVar, zEquals, 0));
        }
    }

    public Task n(String str, Executor executor) {
        ie.b bVar;
        TaskCompletionSource taskCompletionSource;
        ArrayList<File> arrayListB = ((a) this.f224498b).b();
        ArrayList<ie.b> arrayList = new ArrayList();
        for (File file : arrayListB) {
            try {
                me.b bVar2 = a.f224491g;
                String strE = a.e(file);
                bVar2.getClass();
                arrayList.add(new ie.b(me.b.i(strE), file.getName(), file));
            } catch (IOException e) {
                String str2 = "Could not load report file " + file + "; deleting";
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (ie.b bVar3 : arrayList) {
            if (str == null || str.equals(bVar3.f160508b)) {
                pe.a aVar = (pe.a) this.f224499c;
                c0 c0Var = bVar3.f160507a;
                if (c0Var.f == null || c0Var.f194223g == null) {
                    y yVarB = ((z) this.f).b(true);
                    c0 c0Var2 = bVar3.f160507a;
                    String str3 = yVarB.f160580a;
                    b0 b0VarA = c0Var2.a();
                    b0VarA.e = str3;
                    c0 c0VarA = b0VarA.a();
                    String str4 = yVarB.f160581b;
                    b0 b0VarA2 = c0VarA.a();
                    b0VarA2.f = str4;
                    bVar = new ie.b(b0VarA2.a(), bVar3.f160508b, bVar3.f160509c);
                } else {
                    bVar = bVar3;
                }
                boolean z = str != null;
                pe.c cVar = aVar.f235270a;
                synchronized (cVar.f) {
                    try {
                        taskCompletionSource = new TaskCompletionSource();
                        if (z) {
                            ((AtomicInteger) cVar.i.f7847b).getAndIncrement();
                            if (cVar.f.size() < cVar.e) {
                                fe.c cVar2 = fe.c.f134428a;
                                cVar2.b("Enqueueing report: " + bVar.f160508b);
                                cVar2.b("Queue size: " + cVar.f.size());
                                cVar.f235277g.execute(new w((Object) cVar, (Object) bVar, (Object) taskCompletionSource, false, 8));
                                cVar2.b("Closing task for report: " + bVar.f160508b);
                                taskCompletionSource.trySetResult(bVar);
                            } else {
                                cVar.a();
                                String str5 = "Dropping report due to queue being full: " + bVar.f160508b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                }
                                ((AtomicInteger) cVar.i.f7848c).getAndIncrement();
                                taskCompletionSource.trySetResult(bVar);
                            }
                        } else {
                            cVar.b(bVar, taskCompletionSource);
                        }
                    } finally {
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new a5.a(this)));
            }
        }
        return Tasks.whenAll(arrayList2);
    }

    public void o(ef.c cVar) {
        if (cVar == null) {
            throw new NullPointerException("Null registrationStatus");
        }
        this.f224498b = cVar;
    }
}
