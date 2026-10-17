package u8;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.engine.GlideException;
import e8.e0;
import e8.p;
import e8.s;
import e8.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import v8.l;

/* JADX INFO: loaded from: classes.dex */
public final class j implements c, v8.k {
    public static final boolean D = Log.isLoggable("GlideRequest", 2);
    public int A;
    public boolean B;
    public final RuntimeException C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f278004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z8.e f278005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f278006c;
    public final g d;
    public final e e;
    public final Context f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.bumptech.glide.f f278007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f278008h;
    public final Class i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f278009j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f278010l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.bumptech.glide.h f278011m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l f278012n;
    public final List o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w8.e f278013p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Executor f278014q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public e0 f278015r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public jpf.a f278016s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f278017t;
    public volatile s u;
    public i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Drawable f278018w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Drawable f278019x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Drawable f278020y;
    public int z;

    public j(Context context, com.bumptech.glide.f fVar, Object obj2, Object obj3, Class cls, a aVar, int i, int i2, com.bumptech.glide.h hVar, l lVar, g gVar, ArrayList arrayList, e eVar, s sVar, w8.e eVar2, Executor executor) {
        this.f278004a = D ? String.valueOf(hashCode()) : null;
        this.f278005b = new z8.e();
        this.f278006c = obj2;
        this.f = context;
        this.f278007g = fVar;
        this.f278008h = obj3;
        this.i = cls;
        this.f278009j = aVar;
        this.k = i;
        this.f278010l = i2;
        this.f278011m = hVar;
        this.f278012n = lVar;
        this.d = gVar;
        this.o = arrayList;
        this.e = eVar;
        this.u = sVar;
        this.f278013p = eVar2;
        this.f278014q = executor;
        this.v = i.PENDING;
        if (this.C == null && fVar.f26092h.f26094a.containsKey(com.bumptech.glide.d.class)) {
            this.C = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // u8.c
    public final boolean a() {
        boolean z;
        synchronized (this.f278006c) {
            z = this.v == i.COMPLETE;
        }
        return z;
    }

    public final void b() {
        if (this.B) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.f278005b.a();
        this.f278012n.e(this);
        jpf.a aVar = this.f278016s;
        if (aVar != null) {
            synchronized (((s) aVar.f177269c)) {
                ((v) aVar.f177267a).h((j) aVar.f177268b);
            }
            this.f278016s = null;
        }
    }

    @Override // u8.c
    public final boolean c() {
        boolean z;
        synchronized (this.f278006c) {
            z = this.v == i.CLEARED;
        }
        return z;
    }

    @Override // u8.c
    public final void clear() {
        synchronized (this.f278006c) {
            try {
                if (this.B) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f278005b.a();
                i iVar = this.v;
                i iVar2 = i.CLEARED;
                if (iVar == iVar2) {
                    return;
                }
                b();
                e0 e0Var = this.f278015r;
                if (e0Var != null) {
                    this.f278015r = null;
                } else {
                    e0Var = null;
                }
                e eVar = this.e;
                if (eVar == null || eVar.e(this)) {
                    this.f278012n.b(d());
                }
                this.v = iVar2;
                if (e0Var != null) {
                    this.u.getClass();
                    s.f(e0Var);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final Drawable d() {
        int i;
        if (this.f278019x == null) {
            a aVar = this.f278009j;
            Drawable drawable = aVar.f;
            this.f278019x = drawable;
            if (drawable == null && (i = aVar.f277986g) > 0) {
                Resources.Theme theme = aVar.f277994r;
                Context context = this.f;
                if (theme == null) {
                    theme = context.getTheme();
                }
                this.f278019x = ebm.a.p(context, i, theme);
            }
        }
        return this.f278019x;
    }

    public final void e(String str) {
        StringBuilder sbL = v0.a.l(str, " this: ");
        sbL.append(this.f278004a);
        sbL.toString();
    }

    @Override // u8.c
    public final boolean f(c cVar) {
        int i;
        int i2;
        Object obj2;
        Class cls;
        a aVar;
        com.bumptech.glide.h hVar;
        int size;
        int i3;
        int i5;
        Object obj3;
        Class cls2;
        a aVar2;
        com.bumptech.glide.h hVar2;
        int size2;
        if (!(cVar instanceof j)) {
            return false;
        }
        synchronized (this.f278006c) {
            try {
                i = this.k;
                i2 = this.f278010l;
                obj2 = this.f278008h;
                cls = this.i;
                aVar = this.f278009j;
                hVar = this.f278011m;
                List list = this.o;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        j jVar = (j) cVar;
        synchronized (jVar.f278006c) {
            try {
                i3 = jVar.k;
                i5 = jVar.f278010l;
                obj3 = jVar.f278008h;
                cls2 = jVar.i;
                aVar2 = jVar.f278009j;
                hVar2 = jVar.f278011m;
                List list2 = jVar.o;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        if (i == i3 && i2 == i5) {
            char[] cArr = y8.l.f311609a;
            if ((obj2 == null ? obj3 == null : obj2.equals(obj3)) && cls.equals(cls2)) {
                if ((aVar == null ? aVar2 == null : aVar.n(aVar2)) && hVar == hVar2 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(com.bumptech.glide.load.engine.GlideException r10, int r11) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u8.j.g(com.bumptech.glide.load.engine.GlideException, int):void");
    }

    public final void h(e0 e0Var, c8.a aVar, boolean z) {
        this.f278005b.a();
        e0 e0Var2 = null;
        try {
            synchronized (this.f278006c) {
                try {
                    this.f278016s = null;
                    if (e0Var == null) {
                        g(new GlideException("Expected to receive a Resource<R> with an object of " + this.i + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj2 = e0Var.get();
                    try {
                        if (obj2 == null || !this.i.isAssignableFrom(obj2.getClass())) {
                            this.f278015r = null;
                            StringBuilder sb6 = new StringBuilder("Expected to receive an object of ");
                            sb6.append(this.i);
                            sb6.append(" but instead got ");
                            sb6.append(obj2 != null ? obj2.getClass() : "");
                            sb6.append("{");
                            sb6.append(obj2);
                            sb6.append("} inside Resource{");
                            sb6.append(e0Var);
                            sb6.append("}.");
                            sb6.append(obj2 != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            g(new GlideException(sb6.toString()), 5);
                        } else {
                            e eVar = this.e;
                            if (eVar == null || eVar.b(this)) {
                                j(e0Var, obj2, aVar);
                                return;
                            } else {
                                this.f278015r = null;
                                this.v = i.COMPLETE;
                            }
                        }
                        this.u.getClass();
                        s.f(e0Var);
                    } catch (Throwable th10) {
                        e0Var2 = e0Var;
                        th = th10;
                        throw th;
                    }
                } catch (Throwable th11) {
                    th = th11;
                }
            }
        } catch (Throwable th12) {
            if (e0Var2 != null) {
                this.u.getClass();
                s.f(e0Var2);
            }
            throw th12;
        }
    }

    @Override // u8.c
    public final void i() {
        synchronized (this.f278006c) {
            try {
                if (this.B) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f278005b.a();
                int i = y8.h.f311602b;
                this.f278017t = SystemClock.elapsedRealtimeNanos();
                if (this.f278008h == null) {
                    if (y8.l.i(this.k, this.f278010l)) {
                        this.z = this.k;
                        this.A = this.f278010l;
                    }
                    if (this.f278020y == null) {
                        this.f278020y = this.f278009j.f277990m;
                    }
                    g(new GlideException("Received null model"), this.f278020y == null ? 5 : 3);
                    return;
                }
                i iVar = this.v;
                if (iVar == i.RUNNING) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (iVar == i.COMPLETE) {
                    h(this.f278015r, c8.a.MEMORY_CACHE, false);
                    return;
                }
                List<g> list = this.o;
                if (list != null) {
                    for (g gVar : list) {
                    }
                }
                i iVar2 = i.WAITING_FOR_SIZE;
                this.v = iVar2;
                if (y8.l.i(this.k, this.f278010l)) {
                    k(this.k, this.f278010l);
                } else {
                    this.f278012n.a(this);
                }
                i iVar3 = this.v;
                if (iVar3 == i.RUNNING || iVar3 == iVar2) {
                    e eVar = this.e;
                    if (eVar == null || eVar.h(this)) {
                        this.f278012n.f(d());
                    }
                }
                if (D) {
                    e("finished run method in " + y8.h.a(this.f278017t));
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // u8.c
    public final boolean isComplete() {
        boolean z;
        synchronized (this.f278006c) {
            z = this.v == i.COMPLETE;
        }
        return z;
    }

    @Override // u8.c
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f278006c) {
            try {
                i iVar = this.v;
                z = iVar == i.RUNNING || iVar == i.WAITING_FOR_SIZE;
            } finally {
            }
        }
        return z;
    }

    public final void j(e0 e0Var, Object obj2, c8.a aVar) {
        boolean zOnResourceReady;
        boolean z = true;
        e eVar = this.e;
        boolean z3 = eVar == null || !eVar.getRoot().a();
        this.v = i.COMPLETE;
        this.f278015r = e0Var;
        if (this.f278007g.i <= 3) {
            String str = "Finished loading " + obj2.getClass().getSimpleName() + " from " + aVar + " for " + this.f278008h + " with size [" + this.z + "x" + this.A + "] in " + y8.h.a(this.f278017t) + " ms";
        }
        if (eVar != null) {
            eVar.g(this);
        }
        this.B = true;
        try {
            List list = this.o;
            if (list != null) {
                Iterator it8 = list.iterator();
                zOnResourceReady = false;
                while (it8.hasNext()) {
                    Object obj3 = obj2;
                    c8.a aVar2 = aVar;
                    zOnResourceReady |= ((g) it8.next()).onResourceReady(obj3, this.f278008h, this.f278012n, aVar2, z3);
                    obj2 = obj3;
                    aVar = aVar2;
                }
            } else {
                zOnResourceReady = false;
            }
            Object obj4 = obj2;
            c8.a aVar3 = aVar;
            g gVar = this.d;
            if (gVar == null || !gVar.onResourceReady(obj4, this.f278008h, this.f278012n, aVar3, z3)) {
                z = false;
            }
            if (!(zOnResourceReady | z)) {
                this.f278012n.d(obj4, this.f278013p.a(aVar3));
            }
            this.B = false;
        } catch (Throwable th10) {
            this.B = false;
            throw th10;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void k(int i, int i2) {
        Object obj2;
        j jVar = this;
        int iRound = i;
        jVar.f278005b.a();
        Object obj3 = jVar.f278006c;
        synchronized (obj3) {
            try {
                try {
                    boolean z = D;
                    if (z) {
                        jVar.e("Got onSizeReady in " + y8.h.a(jVar.f278017t));
                    }
                    if (jVar.v == i.WAITING_FOR_SIZE) {
                        i iVar = i.RUNNING;
                        jVar.v = iVar;
                        jVar.f278009j.getClass();
                        if (iRound != Integer.MIN_VALUE) {
                            iRound = Math.round(iRound * 1.0f);
                        }
                        jVar.z = iRound;
                        jVar.A = i2 == Integer.MIN_VALUE ? i2 : Math.round(1.0f * i2);
                        if (z) {
                            jVar.e("finished setup for calling load in " + y8.h.a(jVar.f278017t));
                        }
                        s sVar = jVar.u;
                        com.bumptech.glide.f fVar = jVar.f278007g;
                        Object obj4 = jVar.f278008h;
                        a aVar = jVar.f278009j;
                        c8.g gVar = aVar.k;
                        try {
                            int i3 = jVar.z;
                            int i5 = jVar.A;
                            Class cls = aVar.f277992p;
                            try {
                                Class cls2 = jVar.i;
                                com.bumptech.glide.h hVar = jVar.f278011m;
                                p pVar = aVar.f277984b;
                                try {
                                    y8.c cVar = aVar.o;
                                    boolean z3 = aVar.f277989l;
                                    boolean z4 = aVar.u;
                                    try {
                                        c8.k kVar = aVar.f277991n;
                                        boolean z6 = aVar.f277987h;
                                        boolean z11 = aVar.v;
                                        boolean z12 = aVar.f277996t;
                                        Executor executor = jVar.f278014q;
                                        Object obj5 = obj3;
                                        try {
                                            jVar.f278016s = sVar.a(fVar, obj4, gVar, i3, i5, cls, cls2, hVar, pVar, cVar, z3, z4, kVar, z6, z11, z12, jVar, executor);
                                            if (jVar.v != iVar) {
                                                jVar.f278016s = null;
                                            }
                                            if (z) {
                                                jVar.e("finished onSizeReady in " + y8.h.a(jVar.f278017t));
                                            }
                                        } catch (Throwable th10) {
                                            th = th10;
                                            obj2 = obj5;
                                            throw th;
                                        }
                                    } catch (Throwable th11) {
                                        th = th11;
                                        obj2 = obj3;
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    obj2 = obj3;
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                obj2 = obj3;
                            }
                        } catch (Throwable th14) {
                            th = th14;
                            obj2 = obj3;
                        }
                    }
                } catch (Throwable th15) {
                    th = th15;
                    obj2 = jVar;
                }
            } catch (Throwable th16) {
                th = th16;
                obj2 = obj3;
            }
        }
    }

    @Override // u8.c
    public final void pause() {
        synchronized (this.f278006c) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final String toString() {
        Object obj2;
        Class cls;
        synchronized (this.f278006c) {
            obj2 = this.f278008h;
            cls = this.i;
        }
        return super.toString() + "[model=" + obj2 + ", transcodeClass=" + cls + "]";
    }
}
