package vc;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static t f287602j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ecm.c f287603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IntentFilter f287604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f287605c;
    public final HashSet d;
    public ex0.b e;
    public volatile boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f287606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f287607h;
    public final LinkedHashSet i;

    public t(Context context, p pVar) {
        ecm.c cVar = new ecm.c("SplitInstallListenerRegistry", 1);
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService");
        this.d = new HashSet();
        this.e = null;
        this.f = false;
        this.f287603a = cVar;
        this.f287604b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.f287605c = applicationContext != null ? applicationContext : context;
        this.f287606g = new Handler(Looper.getMainLooper());
        this.i = new LinkedHashSet();
        this.f287607h = pVar;
    }

    public static synchronized t b(Context context) {
        try {
            if (f287602j == null) {
                f287602j = new t(context, p.f287594zza);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return f287602j;
    }

    public final void a() {
        ex0.b bVar;
        if ((this.f || !this.d.isEmpty()) && this.e == null) {
            ex0.b bVar2 = new ex0.b(this, 1);
            this.e = bVar2;
            if (Build.VERSION.SDK_INT >= 33) {
                this.f287605c.registerReceiver(bVar2, this.f287604b, 2);
            } else {
                this.f287605c.registerReceiver(bVar2, this.f287604b);
            }
        }
        if (this.f || !this.d.isEmpty() || (bVar = this.e) == null) {
            return;
        }
        this.f287605c.unregisterReceiver(bVar);
        this.e = null;
    }

    public final synchronized void c(c cVar) {
        try {
            Iterator it8 = new LinkedHashSet(this.i).iterator();
            while (it8.hasNext()) {
                ((uh0.d) it8.next()).a(cVar);
            }
            synchronized (this) {
                Iterator it9 = new HashSet(this.d).iterator();
                while (it9.hasNext()) {
                    ((tc.a) it9.next()).a(cVar);
                }
            }
        } catch (Throwable th10) {
            throw th10;
        }
    }
}
