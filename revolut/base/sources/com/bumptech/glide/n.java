package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import e8.p;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import r8.q;
import r8.r;

/* JADX INFO: loaded from: classes.dex */
public class n implements ComponentCallbacks2, r8.j {
    public static final u8.h k = (u8.h) ((u8.h) new u8.h().e(Bitmap.class)).p();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final u8.h f26133l = (u8.h) ((u8.h) new u8.h().e(GifDrawable.class)).p();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final u8.h f26134m = (u8.h) ((u8.h) ((u8.h) new u8.h().g(p.f123507c)).z(h.LOW)).F(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f26135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f26136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r8.h f26137c;
    public final q d;
    public final r8.n e;
    public final r f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f26138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r8.b f26139h;
    public final CopyOnWriteArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public u8.h f26140j;

    public n(b bVar, r8.h hVar, r8.n nVar, Context context) {
        u8.h hVar2;
        q qVar = new q();
        ah.a aVar = bVar.f26075g;
        this.f = new r();
        k kVar = new k(this, 0);
        this.f26138g = kVar;
        this.f26135a = bVar;
        this.f26137c = hVar;
        this.e = nVar;
        this.d = qVar;
        this.f26136b = context;
        Context applicationContext = context.getApplicationContext();
        m mVar = new m(this, qVar);
        aVar.getClass();
        boolean z = ContextCompat.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3) && !z) {
        }
        r8.b cVar = z ? new r8.c(applicationContext, mVar) : new r8.l();
        this.f26139h = cVar;
        synchronized (bVar.f26076h) {
            if (bVar.f26076h.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            bVar.f26076h.add(this);
        }
        char[] cArr = y8.l.f311609a;
        if ((Looper.myLooper() == Looper.getMainLooper() ? 1 : 0) == 0) {
            y8.l.f().post(kVar);
        } else {
            hVar.d(this);
        }
        hVar.d(cVar);
        this.i = new CopyOnWriteArrayList(bVar.d.e);
        f fVar = bVar.d;
        synchronized (fVar) {
            try {
                if (fVar.f26093j == null) {
                    fVar.d.getClass();
                    u8.h hVar3 = new u8.h();
                    hVar3.f277993q = true;
                    fVar.f26093j = hVar3;
                }
                hVar2 = fVar.f26093j;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        x(hVar2);
    }

    public j h(Class cls) {
        return new j(this.f26135a, this, cls, this.f26136b);
    }

    public j i() {
        return h(Bitmap.class).a(k);
    }

    public j j() {
        return h(Drawable.class);
    }

    public j k() {
        j jVarH = h(File.class);
        if (u8.h.f278003w == null) {
            u8.h.f278003w = (u8.h) ((u8.h) new u8.h().F(true)).b();
        }
        return jVarH.a(u8.h.f278003w);
    }

    public j l() {
        return h(GifDrawable.class).a(f26133l);
    }

    public final void m(v8.l lVar) {
        if (lVar == null) {
            return;
        }
        boolean zY = y(lVar);
        u8.c request = lVar.getRequest();
        if (zY) {
            return;
        }
        b bVar = this.f26135a;
        synchronized (bVar.f26076h) {
            try {
                Iterator it8 = bVar.f26076h.iterator();
                while (it8.hasNext()) {
                    if (((n) it8.next()).y(lVar)) {
                        return;
                    }
                }
                if (request != null) {
                    lVar.c(null);
                    request.clear();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final synchronized void n() {
        try {
            Iterator it8 = y8.l.e(this.f.f252299a).iterator();
            while (it8.hasNext()) {
                m((v8.l) it8.next());
            }
            this.f.f252299a.clear();
        } catch (Throwable th10) {
            throw th10;
        }
    }

    public j o() {
        return h(File.class).a(f26134m);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // r8.j
    public final synchronized void onDestroy() {
        this.f.onDestroy();
        n();
        q qVar = this.d;
        Iterator it8 = y8.l.e((Set) qVar.f252298c).iterator();
        while (it8.hasNext()) {
            qVar.b((u8.c) it8.next());
        }
        ((HashSet) qVar.d).clear();
        this.f26137c.c(this);
        this.f26137c.c(this.f26139h);
        y8.l.f().removeCallbacks(this.f26138g);
        b bVar = this.f26135a;
        synchronized (bVar.f26076h) {
            if (!bVar.f26076h.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            bVar.f26076h.remove(this);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // r8.j
    public final synchronized void onStart() {
        w();
        this.f.onStart();
    }

    @Override // r8.j
    public final synchronized void onStop() {
        this.f.onStop();
        v();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }

    public j p(Bitmap bitmap) {
        return j().U(bitmap);
    }

    public j q(Drawable drawable) {
        return j().V(drawable);
    }

    public j r(Uri uri2) {
        return j().W(uri2);
    }

    public j s(File file) {
        return j().X(file);
    }

    public j t(Object obj2) {
        return j().Z(obj2);
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.d + ", treeNode=" + this.e + "}";
    }

    public j u(String str) {
        return j().a0(str);
    }

    public final synchronized void v() {
        q qVar = this.d;
        qVar.f252297b = true;
        for (u8.c cVar : y8.l.e((Set) qVar.f252298c)) {
            if (cVar.isRunning()) {
                cVar.pause();
                ((HashSet) qVar.d).add(cVar);
            }
        }
    }

    public final synchronized void w() {
        q qVar = this.d;
        qVar.f252297b = false;
        for (u8.c cVar : y8.l.e((Set) qVar.f252298c)) {
            if (!cVar.isComplete() && !cVar.isRunning()) {
                cVar.i();
            }
        }
        ((HashSet) qVar.d).clear();
    }

    public synchronized void x(u8.h hVar) {
        this.f26140j = (u8.h) ((u8.h) hVar.clone()).b();
    }

    public final synchronized boolean y(v8.l lVar) {
        u8.c request = lVar.getRequest();
        if (request == null) {
            return true;
        }
        if (!this.d.b(request)) {
            return false;
        }
        this.f.f252299a.remove(lVar);
        lVar.c(null);
        return true;
    }
}
