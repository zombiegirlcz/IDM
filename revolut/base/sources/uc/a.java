package uc;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import com.google.android.play.core.splitinstall.internal.zzbh;
import com.google.firebase.messaging.t;
import ecm.q;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import nd.m;
import nd.n;
import vc.k;
import vc.p;
import vc.r;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final AtomicReference e = new AtomicReference(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f278944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f278945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f278946c = new HashSet();
    public final q d;

    public a(Context context) {
        try {
            c cVar = new c(context);
            this.f278944a = cVar;
            this.d = new q(cVar, 25);
            this.f278945b = new k(context);
        } catch (PackageManager.NameNotFoundException e2) {
            throw new zzbh(e2);
        }
    }

    public static void a(Activity activity) {
        HashSet<String> hashSet;
        StrictMode.ThreadPolicy threadPolicy;
        a aVar = (a) e.get();
        if (aVar == null) {
            if (activity.getApplicationContext() != null) {
                d(activity.getApplicationContext(), false);
            }
            d(activity, false);
            return;
        }
        q qVar = aVar.d;
        synchronized (aVar.f278946c) {
            hashSet = new HashSet(aVar.f278946c);
        }
        synchronized (qVar) {
            try {
                threadPolicy = StrictMode.getThreadPolicy();
            } catch (Exception e2) {
                threadPolicy = null;
            }
            try {
                StrictMode.allowThreadDiskReads();
                StrictMode.allowThreadDiskWrites();
            } catch (Exception e4) {
            }
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : hashSet) {
                    File file = new File(((c) qVar.f124861b).g(), "verified-splits");
                    c.e(file);
                    hashSet2.add(c.d(file, String.valueOf(str).concat(".apk")));
                }
                qVar.o(activity, hashSet2);
            } catch (Exception e5) {
                if (threadPolicy != null) {
                }
            } catch (Throwable th10) {
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                throw th10;
            }
            if (threadPolicy != null) {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        }
    }

    public static boolean d(Context context, boolean z) {
        AtomicReference atomicReference;
        boolean z3;
        a aVar = new a(context);
        while (true) {
            atomicReference = e;
            if (!atomicReference.compareAndSet(null, aVar)) {
                if (atomicReference.get() != null && atomicReference.get() != null) {
                    z3 = false;
                    break;
                }
            } else {
                z3 = true;
                break;
            }
        }
        a aVar2 = (a) atomicReference.get();
        if (z3) {
            p pVar = p.f287594zza;
            wc.d dVar = new wc.d(context, pd.b.y(), new t(context, aVar2.f278944a), aVar2.f278944a);
            pVar.getClass();
            p.b(dVar);
            i iVar = new i(aVar2);
            AtomicReference atomicReference2 = vc.q.f287597a;
            while (!atomicReference2.compareAndSet(null, iVar) && (atomicReference2.get() == null || atomicReference2.get() == null)) {
            }
            pd.b.y().execute(new com.bumptech.glide.k(context, 17));
        }
        try {
            aVar2.c(context, z);
            return true;
        } catch (Exception e2) {
            return false;
        }
    }

    public final void b(HashSet hashSet) throws IOException {
        Iterator it8 = hashSet.iterator();
        while (it8.hasNext()) {
            String str = (String) it8.next();
            c cVar = this.f278944a;
            cVar.getClass();
            File file = new File(cVar.g(), "verified-splits");
            c.e(file);
            c.c(c.d(file, String.valueOf(str).concat(".apk")));
        }
        k kVar = this.f278945b;
        kVar.getClass();
        synchronized (k.class) {
            kVar.f287590a.getSharedPreferences("playcore_split_install_internal", 0).edit().putStringSet("modules_to_uninstall_if_emulated", new HashSet()).apply();
        }
    }

    public final synchronized void c(Context context, boolean z) {
        IOException iOException;
        ZipFile zipFile;
        boolean z3;
        int i = 18;
        try {
            if (z) {
                this.f278944a.b();
            } else {
                pd.b.y().execute(new com.bumptech.glide.k(this, i));
            }
            String packageName = context.getPackageName();
            try {
                String[] strArr = context.getPackageManager().getPackageInfo(packageName, 0).splitNames;
                List<String> arrayList = strArr == null ? new ArrayList() : Arrays.asList(strArr);
                HashSet<b> hashSetA = this.f278944a.a();
                Set setA = this.f278945b.a();
                HashSet hashSet = new HashSet();
                Iterator it8 = hashSetA.iterator();
                while (it8.hasNext()) {
                    String strB = ((b) it8.next()).b();
                    if (!arrayList.contains(strB)) {
                        ecm.c cVar = r.f287598c;
                        if (setA.contains(strB.startsWith("config.") ? "" : strB.split("\\.config\\.", 2)[0])) {
                        }
                    }
                    hashSet.add(strB);
                    it8.remove();
                }
                if (z) {
                    b(hashSet);
                } else if (!hashSet.isEmpty()) {
                    pd.b.y().execute(new r8.d(this, hashSet, 13));
                }
                HashSet hashSet2 = new HashSet();
                Iterator it9 = hashSetA.iterator();
                while (it9.hasNext()) {
                    String strB2 = ((b) it9.next()).b();
                    if (!r.c(strB2)) {
                        hashSet2.add(strB2);
                    }
                }
                for (String str : arrayList) {
                    if (!r.c(str)) {
                        hashSet2.add(str);
                    }
                }
                HashSet<b> hashSet3 = new HashSet(hashSetA.size());
                for (b bVar : hashSetA) {
                    String strB3 = bVar.b();
                    ecm.c cVar2 = r.f287598c;
                    if (!strB3.startsWith("config.")) {
                        String strB4 = bVar.b();
                        if (hashSet2.contains(strB4.startsWith("config.") ? "" : strB4.split("\\.config\\.", 2)[0])) {
                        }
                    }
                    hashSet3.add(bVar);
                }
                h hVar = new h(this.f278944a);
                ClassLoader classLoader = context.getClassLoader();
                ZipFile zipFile2 = null;
                if (z) {
                    gj7.b.Y(classLoader, hVar.a());
                } else {
                    Iterator it10 = hashSet3.iterator();
                    while (it10.hasNext()) {
                        b bVar2 = (b) it10.next();
                        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                        HashSet hashSet4 = new HashSet();
                        h.b(bVar2, new prl.e(hVar, bVar2, hashSet4, atomicBoolean));
                        if (!atomicBoolean.get()) {
                            hashSet4 = null;
                        }
                        if (hashSet4 == null) {
                            it10.remove();
                        } else {
                            gj7.b.Y(classLoader, hashSet4);
                        }
                    }
                }
                HashSet hashSet5 = new HashSet();
                for (b bVar3 : hashSet3) {
                    try {
                        zipFile = new ZipFile(bVar3.a());
                    } catch (IOException e2) {
                        iOException = e2;
                    }
                    try {
                        ZipEntry entry = zipFile.getEntry("classes.dex");
                        zipFile.close();
                        if (entry != null) {
                            c cVar3 = this.f278944a;
                            String strB5 = bVar3.b();
                            cVar3.getClass();
                            File file = new File(cVar3.g(), "dex");
                            c.e(file);
                            File fileD = c.d(file, strB5);
                            c.e(fileD);
                            z3 = z;
                            if (!gc0.c.C(classLoader, fileD, bVar3.a(), z3, new m(i), "path", new n(i))) {
                                "split was not installed ".concat(bVar3.a().toString());
                                z = z3;
                            }
                        } else {
                            z3 = z;
                        }
                        hashSet5.add(bVar3.a());
                        z = z3;
                    } catch (IOException e4) {
                        iOException = e4;
                        zipFile2 = zipFile;
                        if (zipFile2 == null) {
                            throw iOException;
                        }
                        try {
                            zipFile2.close();
                            throw iOException;
                        } catch (IOException e5) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(iOException, e5);
                                throw iOException;
                            } catch (Exception unused) {
                                throw iOException;
                            }
                        }
                    }
                }
                this.d.o(context, hashSet5);
                HashSet hashSet6 = new HashSet();
                for (b bVar4 : hashSet3) {
                    if (hashSet5.contains(bVar4.a())) {
                        String str2 = "Split '" + bVar4.b() + "' installation emulated";
                        hashSet6.add(bVar4.b());
                    } else {
                        String str3 = "Split '" + bVar4.b() + "' installation not emulated.";
                    }
                }
                synchronized (this.f278946c) {
                    this.f278946c.addAll(hashSet6);
                }
            } catch (PackageManager.NameNotFoundException e6) {
                throw new IOException("Cannot load data for application '" + packageName + "'", e6);
            }
        } catch (Throwable th10) {
            throw th10;
        }
    }
}
