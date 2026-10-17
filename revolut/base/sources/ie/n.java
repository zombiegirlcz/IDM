package ie;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.revolut.ProtectedRevolutApplication;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import le.i1;
import le.j0;
import le.k0;
import le.l0;
import le.l1;
import le.m1;
import le.n0;
import le.n1;
import le.n2;
import le.o1;
import le.o2;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final h f160535r = new h(1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Charset f160536s = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f160537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f160538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cpi.g f160539c;
    public final oe.c d;
    public final je.d e;
    public final z f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final oe.c f160540g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f160541h;
    public final ke.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fe.a f160542j;
    public final ge.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k f160543l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final oe.c f160544m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public t f160545n;
    public final TaskCompletionSource o = new TaskCompletionSource();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TaskCompletionSource f160546p = new TaskCompletionSource();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TaskCompletionSource f160547q = new TaskCompletionSource();

    public n(Context context, z zVar, u uVar, oe.c cVar, cpi.g gVar, a aVar, oe.c cVar2, ke.f fVar, oe.c cVar3, fe.a aVar2, ge.a aVar3, k kVar, je.d dVar) {
        new AtomicBoolean(false);
        this.f160537a = context;
        this.f = zVar;
        this.f160538b = uVar;
        this.f160540g = cVar;
        this.f160539c = gVar;
        this.f160541h = aVar;
        this.d = cVar2;
        this.i = fVar;
        this.f160542j = aVar2;
        this.k = aVar3;
        this.f160543l = kVar;
        this.f160544m = cVar3;
        this.e = dVar;
    }

    public static Task a(n nVar) {
        Task taskCall;
        nVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : oe.c.m(((File) nVar.f160540g.f224499c).listFiles(f160535r))) {
            try {
                long j2 = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    taskCall = Tasks.forResult(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    }
                    taskCall = Tasks.call(new ScheduledThreadPoolExecutor(1), new m(nVar, j2));
                }
                arrayList.add(taskCall);
            } catch (NumberFormatException unused2) {
                String str = "Could not parse app exception timestamp from file " + file.getName();
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0544  */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19, types: [int] */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r31v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r31, fc.g r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 1800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ie.n.b(boolean, fc.g, boolean):void");
    }

    public final void c(String str, Boolean bool) {
        String str2;
        String str3;
        Integer num;
        Map mapUnmodifiableMap;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        j6.a.q("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
        }
        Locale locale = Locale.US;
        z zVar = this.f;
        a aVar = this.f160541h;
        m1 m1Var = new m1(zVar.f160586c, (String) aVar.e, (String) aVar.f, zVar.c().f160512a, (((String) aVar.f160501c) != null ? v.APP_STORE : v.DEVELOPER).a(), (ao.h) aVar.f160503h);
        String str4 = Build.VERSION.RELEASE;
        String str5 = Build.VERSION.CODENAME;
        o1 o1Var = new o1(g.g());
        Context context = this.f160537a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        int iOrdinal = f.a().ordinal();
        String str6 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jA = g.a(context);
        boolean zF = g.f();
        int iC = g.c();
        String str7 = Build.MANUFACTURER;
        String str8 = Build.PRODUCT;
        this.f160542j.d(str, jCurrentTimeMillis, new l1(m1Var, o1Var, new n1(iOrdinal, iAvailableProcessors, jA, blockCount, zF, iC)));
        if (!bool.booleanValue() || str == null) {
            str2 = str5;
            str3 = str8;
        } else {
            oe.c cVar = this.d;
            synchronized (((String) cVar.f224497a)) {
                cVar.f224497a = str;
                ke.e eVar = (ke.e) ((AtomicMarkableReference) ((ch.m) cVar.d).f24042b).getReference();
                synchronized (eVar) {
                    mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(eVar.f182929a));
                }
                str2 = str5;
                str3 = str8;
                ((je.d) cVar.f224499c).f173168b.b(new b0.e(cVar, str, mapUnmodifiableMap, ((ke.o) cVar.f).a(), 2));
            }
        }
        ke.f fVar = this.i;
        ((ke.d) fVar.f182934b).h();
        fVar.f182934b = ke.f.f182932c;
        if (str != null) {
            fVar.f182934b = new ke.m(((oe.c) fVar.f182933a).h(str, "userlog"));
        }
        this.f160543l.a(str);
        oe.c cVar2 = this.f160544m;
        s sVar = (s) cVar2.f224497a;
        Charset charset = o2.f194358a;
        le.b0 b0Var = new le.b0();
        b0Var.f194206a = "19.4.4";
        a aVar2 = sVar.f160567c;
        String str9 = (String) aVar2.f160499a;
        if (str9 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        b0Var.f194207b = str9;
        z zVar2 = sVar.f160566b;
        String str10 = zVar2.c().f160512a;
        if (str10 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        b0Var.d = str10;
        b0Var.e = zVar2.c().f160513b;
        b0Var.f = zVar2.c().f160514c;
        String str11 = (String) aVar2.e;
        if (str11 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        b0Var.f194210h = str11;
        String str12 = (String) aVar2.f;
        if (str12 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        b0Var.i = str12;
        b0Var.f194208c = 4;
        b0Var.f194213m = (byte) (b0Var.f194213m | 1);
        j0 j0Var = new j0();
        j0Var.f = false;
        byte b4 = (byte) (j0Var.f194305m | 2);
        j0Var.d = jCurrentTimeMillis;
        j0Var.f194305m = (byte) (b4 | 1);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        j0Var.f194299b = str;
        String str13 = s.f160564g;
        if (str13 == null) {
            throw new NullPointerException("Null generator");
        }
        j0Var.f194298a = str13;
        String str14 = zVar2.f160586c;
        if (str14 == null) {
            throw new NullPointerException("Null identifier");
        }
        String str15 = zVar2.c().f160512a;
        ao.h hVar = (ao.h) aVar2.f160503h;
        if (((cpi.g) hVar.f7848c) == null) {
            hVar.f7848c = new cpi.g(hVar);
        }
        cpi.g gVar = (cpi.g) hVar.f7848c;
        String str16 = (String) gVar.f107954b;
        if (gVar == null) {
            hVar.f7848c = new cpi.g(hVar);
        }
        j0Var.f194301g = new l0(str14, str11, str12, str15, str16, (String) ((cpi.g) hVar.f7848c).f107955c);
        i1 i1Var = new i1();
        i1Var.f194287a = 3;
        i1Var.e = (byte) (i1Var.e | 1);
        if (str4 == null) {
            throw new NullPointerException("Null version");
        }
        i1Var.f194288b = str4;
        String str17 = str2;
        if (str17 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        i1Var.f194289c = str17;
        i1Var.d = g.g();
        i1Var.e = (byte) (i1Var.e | 2);
        j0Var.i = i1Var.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        String str18 = Build.CPU_ABI;
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str18) && (num = (Integer) s.f.get(str18.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jA2 = g.a(sVar.f160565a);
        long blockCount2 = ((long) statFs2.getBlockCount()) * ((long) statFs2.getBlockSize());
        boolean zF2 = g.f();
        int iC2 = g.c();
        n0 n0Var = new n0();
        n0Var.f194340a = iIntValue;
        byte b5 = (byte) (n0Var.f194345j | 1);
        n0Var.f194345j = b5;
        if (str6 == null) {
            throw new NullPointerException("Null model");
        }
        n0Var.f194341b = str6;
        n0Var.f194342c = iAvailableProcessors2;
        n0Var.d = jA2;
        n0Var.e = blockCount2;
        n0Var.f = zF2;
        n0Var.f194343g = iC2;
        n0Var.f194345j = (byte) (((byte) (((byte) (((byte) (((byte) (b5 | 2)) | 4)) | 8)) | 16)) | 32);
        if (str7 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        n0Var.f194344h = str7;
        String str19 = str3;
        if (str19 == null) {
            throw new NullPointerException("Null modelClass");
        }
        n0Var.i = str19;
        j0Var.f194303j = n0Var.a();
        j0Var.f194304l = 3;
        j0Var.f194305m = (byte) (j0Var.f194305m | 4);
        b0Var.f194211j = j0Var.a();
        le.c0 c0VarA = b0Var.a();
        oe.c cVar3 = ((oe.a) cVar2.f224498b).f224494b;
        n2 n2Var = c0VarA.k;
        if (n2Var == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                return;
            } else {
                return;
            }
        }
        String str20 = ((k0) n2Var).f194315b;
        try {
            oe.a.f224491g.getClass();
            oe.a.f(cVar3.h(str20, "report"), me.b.f204589a.a(c0VarA));
            File fileH = cVar3.h(str20, "start-time");
            long j2 = ((k0) n2Var).d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileH), oe.a.e);
            try {
                outputStreamWriter.write("");
                fileH.setLastModified(j2 * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException e) {
            j6.a.q("Could not persist report for session ", str20);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            }
        }
    }

    public final boolean d(fc.g gVar) {
        je.d.a();
        t tVar = this.f160545n;
        if (tVar != null && tVar.e.get()) {
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
        }
        try {
            b(true, gVar, true);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public final String e() {
        NavigableSet navigableSetC = ((oe.a) this.f160544m.f224498b).c();
        if (navigableSetC.isEmpty()) {
            return null;
        }
        return (String) navigableSetC.first();
    }

    public final String f() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        Context context = this.f160537a;
        int iD = g.d(context, "com.google.firebase.crashlytics.version_control_info", "string");
        String string = iD == 0 ? null : context.getResources().getString(iD);
        if (string != null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            }
            return Base64.encodeToString(string.getBytes(f160536s), 0);
        }
        ClassLoader classLoader = n.class.getClassLoader();
        InputStream inputStreamA = classLoader == null ? null : ProtectedRevolutApplication.a(classLoader, "META-INF/version-control-info.textproto");
        if (inputStreamA == null) {
            if (inputStreamA != null) {
                inputStreamA.close();
            }
            return null;
        }
        try {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            }
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bArr = new byte[1024];
            } finally {
            }
        } catch (Throwable th10) {
            try {
                inputStreamA.close();
            } catch (Throwable th11) {
                th10.addSuppressed(th11);
            }
            throw th10;
        }
        while (true) {
            int i = inputStreamA.read(bArr);
            if (i == -1) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                String strEncodeToString = Base64.encodeToString(byteArray, 0);
                inputStreamA.close();
                return strEncodeToString;
            }
            byteArrayOutputStream.write(bArr, 0, i);
            inputStreamA.close();
            throw th10;
        }
    }

    public final void g() {
        try {
            String strF = f();
            if (strF != null) {
                try {
                    ((ch.m) this.d.e).d("com.crashlytics.version-control-info", strF);
                } catch (IllegalArgumentException e) {
                    Context context = this.f160537a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            throw e;
                        }
                    }
                }
            }
        } catch (IOException e2) {
        }
    }

    public final void h(Task task) {
        Task task2;
        Task taskA;
        TaskCompletionSource taskCompletionSource = this.o;
        oe.c cVar = ((oe.a) this.f160544m.f224498b).f224494b;
        if (oe.c.m(((File) cVar.e).listFiles()).isEmpty() && oe.c.m(((File) cVar.f).listFiles()).isEmpty() && oe.c.m(((File) cVar.f224500g).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return;
        }
        fe.c cVar2 = fe.c.f134428a;
        cVar2.e("Crash reports are available to be sent.");
        u uVar = this.f160538b;
        if (uVar.a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            taskA = Tasks.forResult(Boolean.TRUE);
        } else {
            cVar2.b("Automatic data collection is disabled.");
            cVar2.e("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (uVar.f160573c) {
                task2 = uVar.d.getTask();
            }
            Task taskOnSuccessTask = task2.onSuccessTask(new dcl.q());
            cVar2.b("Waiting for send/deleteUnsentReports to be called.");
            taskA = je.a.a(taskOnSuccessTask, this.f160546p.getTask());
        }
        taskA.onSuccessTask(this.e.f173167a, new ao.h(this, task, 14));
    }
}
