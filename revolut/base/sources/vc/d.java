package vc;

import android.app.Activity;
import android.content.IntentSender;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f287576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f287577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f287578c;
    public final k d;
    public final Handler e = new Handler(Looper.getMainLooper());

    public d(i iVar, t tVar, r rVar, k kVar) {
        this.f287576a = iVar;
        this.f287577b = tVar;
        this.f287578c = rVar;
        this.d = kVar;
    }

    public static ArrayList h(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((Locale) it8.next()).toLanguageTag());
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    @Override // vc.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.tasks.Task a(tb4.t r12) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vc.d.a(tb4.t):com.google.android.gms.tasks.Task");
    }

    @Override // vc.b
    public final Task b(List list) {
        k kVar = this.d;
        kVar.getClass();
        synchronized (k.class) {
            HashSet hashSet = new HashSet(kVar.a());
            Iterator it8 = list.iterator();
            boolean zAdd = false;
            while (it8.hasNext()) {
                zAdd |= hashSet.add((String) it8.next());
            }
            if (zAdd) {
                try {
                    kVar.f287590a.getSharedPreferences("playcore_split_install_internal", 0).edit().putStringSet("modules_to_uninstall_if_emulated", hashSet).apply();
                } catch (Exception unused) {
                }
            }
        }
        i iVar = this.f287576a;
        wc.c cVar = iVar.f287588b;
        if (cVar == null) {
            return i.c();
        }
        i.f287586c.e("deferredUninstall(%s)", list);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        g gVar = new g(iVar, taskCompletionSource, list, taskCompletionSource, 0);
        cVar.a().post(new g(cVar, gVar.a(), taskCompletionSource, gVar));
        return taskCompletionSource.getTask();
    }

    @Override // vc.b
    public final Task c(List list) {
        i iVar = this.f287576a;
        wc.c cVar = iVar.f287588b;
        if (cVar == null) {
            return i.c();
        }
        i.f287586c.e("deferredInstall(%s)", list);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        g gVar = new g(iVar, taskCompletionSource, list, taskCompletionSource, 1);
        cVar.a().post(new g(cVar, gVar.a(), taskCompletionSource, gVar));
        return taskCompletionSource.getTask();
    }

    @Override // vc.b
    public final boolean d(c cVar, Activity activity, int i) throws IntentSender.SendIntentException {
        tji.e eVar = new tji.e(activity, 1);
        if (cVar.c() != 8 || cVar.b() == null) {
            return false;
        }
        eVar.a(cVar.b().getIntentSender(), i);
        return true;
    }

    @Override // vc.b
    public final synchronized void e(uh0.d dVar) {
        t tVar = this.f287577b;
        synchronized (tVar) {
            tVar.f287603a.e("registerListener", new Object[0]);
            tVar.d.add(dVar);
            tVar.a();
        }
    }

    @Override // vc.b
    public final Set f() {
        return this.f287578c.b();
    }

    @Override // vc.b
    public final synchronized void g(uh0.d dVar) {
        t tVar = this.f287577b;
        synchronized (tVar) {
            tVar.f287603a.e("unregisterListener", new Object[0]);
            tVar.d.remove(dVar);
            tVar.a();
        }
    }
}
