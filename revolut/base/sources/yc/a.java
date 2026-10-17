package yc;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import au0.x3;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.internal.zzbx;
import et0.w;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jmrtd.lds.LDSFile;
import tb4.t;
import tnb.g0;
import vc.p;
import vc.r;
import wc.l;

/* JADX INFO: loaded from: classes16.dex */
public final class a implements vc.b {
    public static final long o = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f312389p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f312390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f312391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f312392c;
    public final l d;
    public final uqi.b e;
    public final g0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g0 f312393g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ThreadPoolExecutor f312394h;
    public final p i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final File f312395j;
    public final AtomicReference k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Set f312396l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Set f312397m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f312398n;

    public a(Context context, File file, r rVar, l lVar) {
        ThreadPoolExecutor threadPoolExecutorY = pd.b.y();
        uqi.b bVar = new uqi.b(context, (byte) 0);
        this.f312390a = new Handler(Looper.getMainLooper());
        this.k = new AtomicReference();
        this.f312396l = Collections.synchronizedSet(new HashSet());
        this.f312397m = Collections.synchronizedSet(new HashSet());
        this.f312398n = new AtomicBoolean(false);
        this.f312391b = context;
        this.f312395j = file;
        this.f312392c = rVar;
        this.d = lVar;
        this.f312394h = threadPoolExecutorY;
        this.e = bVar;
        this.f312393g = new g0(14);
        this.f = new g0(14);
        this.i = p.f287594zza;
    }

    @Override // vc.b
    public final Task a(t tVar) {
        int iIndexOf;
        String strS;
        Integer num;
        ArrayList<Locale> arrayList;
        int i;
        File[] fileArr;
        ArrayList arrayList2 = (ArrayList) tVar.f269457c;
        int i2 = 2;
        try {
            vc.c cVarJ = j(new usc.a(tVar, 19));
            if (cVarJ == null) {
                return h(-100);
            }
            int i3 = cVarJ.f287571a;
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = (ArrayList) tVar.f269456b;
            Iterator it8 = arrayList2.iterator();
            while (it8.hasNext()) {
                arrayList3.add(((Locale) it8.next()).getLanguage());
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList5 = new ArrayList();
            File[] fileArrListFiles = this.f312395j.listFiles(e.f312408a);
            if (fileArrListFiles == null) {
                return h(-5);
            }
            int i5 = 0;
            long length = 0;
            while (i5 < fileArrListFiles.length) {
                File file = fileArrListFiles[i5];
                String strQ = hx7.a.Q(file);
                String str = strQ.split("\\.config\\.", i2)[0];
                hashSet.add(strQ);
                if (arrayList4.contains(str)) {
                    String str2 = strQ.split("\\.config\\.", i2)[0];
                    LocaleList locales = this.e.f282191a.getResources().getConfiguration().getLocales();
                    arrayList = arrayList2;
                    ArrayList arrayList6 = new ArrayList(locales.size());
                    i = i3;
                    int i6 = 0;
                    while (true) {
                        fileArr = fileArrListFiles;
                        if (i6 >= locales.size()) {
                            break;
                        }
                        Locale locale = locales.get(i6);
                        arrayList6.add(String.valueOf(locale.getLanguage()).concat(locale.getCountry().isEmpty() ? "" : "_".concat(String.valueOf(locale.getCountry()))));
                        i6++;
                        fileArrListFiles = fileArr;
                    }
                    HashSet<String> hashSet2 = new HashSet(arrayList6);
                    HashMap mapA = i().a(Arrays.asList(str2));
                    HashSet hashSet3 = new HashSet();
                    Iterator it9 = mapA.values().iterator();
                    while (it9.hasNext()) {
                        hashSet3.addAll((Set) it9.next());
                    }
                    HashSet hashSet4 = new HashSet();
                    for (String str3 : hashSet2) {
                        HashMap map = mapA;
                        if (str3.contains("_")) {
                            str3 = str3.split("_", -1)[0];
                        }
                        hashSet4.add(str3);
                        mapA = map;
                    }
                    HashMap map2 = mapA;
                    hashSet4.addAll(this.f312397m);
                    hashSet4.addAll(arrayList3);
                    HashSet hashSet5 = new HashSet();
                    for (Map.Entry entry : map2.entrySet()) {
                        if (hashSet4.contains(entry.getKey())) {
                            hashSet5.addAll((Collection) entry.getValue());
                        }
                    }
                    if (!hashSet3.contains(strQ) || hashSet5.contains(strQ)) {
                        length = file.length() + length;
                        arrayList5.add(file);
                        break;
                    }
                    i5++;
                    arrayList2 = arrayList;
                    i3 = i;
                    fileArrListFiles = fileArr;
                    i2 = 2;
                } else {
                    arrayList = arrayList2;
                    i = i3;
                    fileArr = fileArrListFiles;
                }
                ArrayList arrayList7 = new ArrayList(this.f312396l);
                arrayList7.addAll(Arrays.asList("", "base"));
                HashMap mapA2 = i().a(arrayList7);
                for (Locale locale2 : arrayList) {
                    if (mapA2.containsKey(locale2.getLanguage()) && ((Set) mapA2.get(locale2.getLanguage())).contains(strQ)) {
                        length = file.length() + length;
                        arrayList5.add(file);
                        break;
                        break;
                    }
                }
                i5++;
                arrayList2 = arrayList;
                i3 = i;
                fileArrListFiles = fileArr;
                i2 = 2;
            }
            int i21 = i3;
            String str4 = "availableSplits " + hashSet.toString() + " want " + String.valueOf(arrayList4);
            int size = arrayList4.size();
            l lVar = this.d;
            if (size != 1 || (num = (Integer) ((c) lVar.zza()).f312404b.get(arrayList4.get(0))) == null) {
                num = ((c) lVar.zza()).f312403a;
            }
            if (num != null) {
                return h(num.intValue());
            }
            if (!hashSet.containsAll(new HashSet(arrayList4))) {
                return h(-2);
            }
            Long lValueOf = Long.valueOf(length);
            Integer numValueOf = Integer.valueOf(i21);
            k(1, 0, 0L, lValueOf, arrayList4, numValueOf, arrayList3);
            this.f312394h.execute(new w(this, 13, arrayList5, arrayList3));
            return Tasks.forResult(numValueOf);
        } catch (zzbx e) {
            Class[] clsArr = {SplitInstallException.class};
            for (int i22 = 0; i22 <= 0; i22++) {
                Class cls = clsArr[i22];
                if (RuntimeException.class.isAssignableFrom(cls)) {
                    Object[] objArr = new Object[2];
                    objArr[0] = "getCause";
                    objArr[1] = cls;
                    int i32 = 0;
                    for (int i33 = 2; i32 < i33; i33 = 2) {
                        Object obj2 = objArr[i32];
                        if (obj2 == null) {
                            strS = "null";
                        } else {
                            try {
                                strS = obj2.toString();
                            } catch (Exception e2) {
                                String strO = com.google.android.gms.internal.mlkit_vision_face.a.o(obj2.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj2)));
                                Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strO), (Throwable) e2);
                                strS = j6.a.s("<", strO, " threw ", e2.getClass().getName(), ">");
                            }
                        }
                        objArr[i32] = strS;
                        i32++;
                    }
                    StringBuilder sb6 = new StringBuilder(LDSFile.EF_DG4_TAG);
                    int i43 = 0;
                    int i59 = 0;
                    while (i59 < 2 && (iIndexOf = "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s".indexOf("%s", i43)) != -1) {
                        sb6.append((CharSequence) "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", i43, iIndexOf);
                        sb6.append(objArr[i59]);
                        i59++;
                        i43 = iIndexOf + 2;
                    }
                    sb6.append((CharSequence) "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", i43, 86);
                    if (i59 < 2) {
                        sb6.append(" [");
                        sb6.append(objArr[i59]);
                        for (int i66 = i59 + 1; i66 < 2; i66++) {
                            sb6.append(", ");
                            sb6.append(objArr[i66]);
                        }
                        sb6.append(']');
                    }
                    throw new IllegalArgumentException(sb6.toString());
                }
            }
            if (SplitInstallException.class.isInstance(e.getCause())) {
                return h(((SplitInstallException) ((Exception) SplitInstallException.class.cast(e.getCause()))).a());
            }
            Exception cause = e.getCause();
            ClassCastException classCastException = new ClassCastException(a0.d.q("getCause(", SplitInstallException.class, ") doesn't match underlying exception"));
            classCastException.initCause(cause);
            throw classCastException;
        }
    }

    @Override // vc.b
    public final Task b(List list) {
        return Tasks.forException(new SplitInstallException(-5));
    }

    @Override // vc.b
    public final Task c(List list) {
        return Tasks.forException(new SplitInstallException(-5));
    }

    @Override // vc.b
    public final boolean d(vc.c cVar, Activity activity, int i) {
        return false;
    }

    @Override // vc.b
    public final void e(uh0.d dVar) {
        g0 g0Var = this.f312393g;
        synchronized (g0Var) {
            ((HashSet) g0Var.f272384b).add(dVar);
        }
    }

    @Override // vc.b
    public final Set f() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f312392c.b());
        hashSet.addAll(this.f312396l);
        return hashSet;
    }

    @Override // vc.b
    public final void g(uh0.d dVar) {
        g0 g0Var = this.f312393g;
        synchronized (g0Var) {
            ((HashSet) g0Var.f272384b).remove(dVar);
        }
    }

    public final Task h(int i) {
        j(new x3(i, 4));
        return Tasks.forException(new SplitInstallException(i));
    }

    public final hh3.c i() {
        Context context = this.f312391b;
        try {
            hh3.c cVarA = this.f312392c.a(context.getPackageManager().getPackageInfo(context.getPackageName(), 128).applicationInfo.metaData);
            if (cVarA != null) {
                return cVarA;
            }
            throw new IllegalStateException("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalStateException("App is not found in PackageManager", e);
        }
    }

    public final synchronized vc.c j(g gVar) {
        vc.c cVar = (vc.c) this.k.get();
        vc.c cVarE = gVar.e(cVar);
        AtomicReference atomicReference = this.k;
        while (!atomicReference.compareAndSet(cVar, cVarE)) {
            if (atomicReference.get() != cVar && atomicReference.get() != cVar) {
                return null;
            }
        }
        return cVarE;
    }

    public final boolean k(int i, int i2, Long l2, Long l3, ArrayList arrayList, Integer num, ArrayList arrayList2) {
        vc.c cVarJ = j(new so0.e(num, i, i2, l2, l3, arrayList, arrayList2));
        if (cVarJ == null) {
            return false;
        }
        this.f312390a.post(new r8.d(23, this, false, cVarJ));
        return true;
    }
}
