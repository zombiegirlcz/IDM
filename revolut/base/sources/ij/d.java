package ij;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import ao.h;
import ce.v;
import com.bumptech.glide.g;
import com.google.firebase.messaging.t;
import com.ironz.binaryprefs.exception.PreferencesInitializationException;
import ecm.q;
import java.io.File;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final File i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f161648a = f.f161664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f161649b = f.f161665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f161650c = f.f;
    public final ConcurrentHashMap d = f.f161666c;
    public final ConcurrentHashMap e = f.d;
    public final ConcurrentHashMap f = f.e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q f161651g = new q(28);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l7.d f161652h = new l7.d();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f161653j = "default";
    public boolean k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f161654l = b.LAZY;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public lj.c f161655m = lj.c.f195581r1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public lj.e f161656n = lj.e.f195586u1;
    public final mj.a o = mj.a.f205892a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f161657p = c.NON_INTERRUPTIBLE;

    public d(Context context) {
        this.i = context.getFilesDir();
    }

    public final a a() {
        ExecutorService executorService;
        if (!this.k && Looper.myLooper() != Looper.getMainLooper()) {
            throw new PreferencesInitializationException();
        }
        String str = this.f161653j;
        jpf.a aVar = new jpf.a();
        File file = this.i;
        aVar.f177267a = jpf.a.k(str, file, "values");
        aVar.f177268b = jpf.a.k(str, file, "backup");
        aVar.f177269c = jpf.a.k(str, file, "lock");
        oj.a aVar2 = new oj.a(aVar);
        h hVar = new h(this.f161653j, aVar, this.f161648a, this.f161649b);
        t tVar = new t(aVar2, hVar, this.f161655m, this.f161656n);
        q qVar = new q(this.f161653j, this.e);
        g gVar = new g(this.f161653j, this.d);
        Object aVar3 = this.f161657p == c.INTERRUPTIBLE ? new qy5.a(8) : new ah.a(4);
        String str2 = this.f161653j;
        gpk.c cVar = new gpk.c();
        cVar.f145463a = this.o;
        ConcurrentHashMap concurrentHashMap = this.f161650c;
        if (concurrentHashMap.containsKey(str2)) {
            executorService = (ExecutorService) concurrentHashMap.get(str2);
        } else {
            ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1, new zj.a(cVar, str2));
            concurrentHashMap.put(str2, executorServiceNewFixedThreadPool);
            executorService = executorServiceNewFixedThreadPool;
        }
        cVar.f145464b = executorService;
        cVar.f145465c = aVar3;
        ie.a aVar4 = new ie.a(this.f161651g);
        a aVar5 = new a(tVar, new cpi.g(this.f161653j, this.f), qVar, gVar, cVar, aVar4, hVar, this.f161654l == b.LAZY ? new v(hVar, cVar, qVar, gVar, tVar, aVar4) : new a5h.g(hVar, cVar, qVar, gVar, tVar, aVar4));
        for (SharedPreferences sharedPreferences : this.f161652h.f192417a) {
            Map<String, ?> all2 = sharedPreferences.getAll();
            if (!all2.isEmpty()) {
                e eVarEdit = aVar5.edit();
                for (String str3 : all2.keySet()) {
                    Object obj2 = all2.get(str3);
                    if (obj2 instanceof String) {
                        eVarEdit.g(str3, (String) obj2);
                    }
                    if (obj2 instanceof Set) {
                        eVarEdit.h(str3, (Set) obj2);
                    }
                    if (obj2 instanceof Integer) {
                        eVarEdit.e(((Integer) obj2).intValue(), str3);
                    }
                    if (obj2 instanceof Long) {
                        eVarEdit.f(((Long) obj2).longValue(), str3);
                    }
                    if (obj2 instanceof Float) {
                        eVarEdit.d(((Float) obj2).floatValue(), str3);
                    }
                    if (obj2 instanceof Boolean) {
                        eVarEdit.c(str3, ((Boolean) obj2).booleanValue());
                    }
                }
                if (eVarEdit.commit()) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        }
        return aVar5;
    }
}
