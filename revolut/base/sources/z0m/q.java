package z0m;

import android.content.Context;
import androidx.core.util.Consumer;
import h7.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f318657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v f318658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s0m.c f318659c;
    public s d;
    public x e;
    public final Lazy f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f318660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f318661h;
    public final c1m.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c1m.e f318662j;
    public final c1m.h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c1m.b f318663l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c1m.g f318664m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c1m.c f318665n;
    public final ArrayList o;

    public q(Context context, c1m.e networkConfiguration, List configurations) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("com.fourthline.sdk", "namespace");
        Intrinsics.checkNotNullParameter(networkConfiguration, "networkConfiguration");
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        this.f = yhm.j.b(new p(this, 0));
        this.f318660g = yhm.j.b(new p(this, 2));
        this.f318661h = yhm.j.b(new p(this, 1));
        this.o = new ArrayList();
        this.f318657a = context;
        c1m.j jVar = new c1m.j();
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.i = jVar;
        c1m.e eVar = new c1m.e();
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f318662j = eVar;
        c1m.h hVar = new c1m.h();
        Intrinsics.checkNotNullParameter(hVar, "<set-?>");
        this.k = hVar;
        c1m.b bVar = new c1m.b();
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f318663l = bVar;
        c1m.g gVar = new c1m.g();
        Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        this.f318664m = gVar;
        c1m.c cVar = new c1m.c();
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f318665n = cVar;
        b().f20544a = networkConfiguration;
        f(configurations);
        c();
    }

    public final c1m.b a() {
        c1m.b bVar = this.f318663l;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("emitterConfiguration");
        throw null;
    }

    public final c1m.e b() {
        c1m.e eVar = this.f318662j;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.r("networkConfiguration");
        throw null;
    }

    public final v c() {
        s0m.c cVar;
        Consumer consumerD;
        v vVar = this.f318658b;
        if (vVar != null) {
            return vVar;
        }
        s0m.c cVar2 = this.f318659c;
        Context context = this.f318657a;
        if (cVar2 == null) {
            String strB = b().b();
            if (strB == null) {
                strB = "";
            }
            s0m.c cVar3 = new s0m.c(a().f(), context, strB, new d0(this, 1));
            if (a().o()) {
                cVar3.d.set(true);
            }
            this.f318659c = cVar3;
            cVar = cVar3;
        } else {
            cVar = cVar2;
        }
        s sVar = this.d;
        if (sVar == null) {
            c1m.h hVar = this.k;
            if (hVar == null) {
                Intrinsics.r("subjectConfiguration");
                throw null;
            }
            sVar = new s(context, hVar);
            this.d = sVar;
        }
        v vVar2 = new v(cVar, e().a(), e().p(), e().q(), this.f318657a, new c(sVar, this, 1));
        if (e().x() && vVar2.f.compareAndSet(true, false)) {
            vVar2.b();
            vVar2.f318673h.e();
        }
        if (d().e()) {
            vVar2.b();
        }
        x0m.f fVar = vVar2.f318674j;
        if (fVar != null && (consumerD = d().d()) != null) {
            fVar.o = consumerD;
        }
        this.f318658b = vVar2;
        return vVar2;
    }

    public final c1m.g d() {
        c1m.g gVar = this.f318664m;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.r("sessionConfiguration");
        throw null;
    }

    public final c1m.j e() {
        c1m.j jVar = this.i;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.r("trackerConfiguration");
        throw null;
    }

    public final void f(List list) {
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            c1m.a aVar = (c1m.a) it8.next();
            if (aVar instanceof c1m.e) {
                b().f20544a = (c1m.e) aVar;
            } else if (aVar instanceof c1m.j) {
                e().f20550b = (c1m.j) aVar;
            } else if (aVar instanceof c1m.h) {
                c1m.h hVar = this.k;
                if (hVar == null) {
                    Intrinsics.r("subjectConfiguration");
                    throw null;
                }
                hVar.f20548a = (c1m.h) aVar;
            } else if (aVar instanceof c1m.g) {
                d().f20547a = (c1m.g) aVar;
            } else if (aVar instanceof c1m.b) {
                a().f20541a = (c1m.b) aVar;
            } else if (aVar instanceof c1m.c) {
                c1m.c cVar = this.f318665n;
                if (cVar == null) {
                    Intrinsics.r("gdprConfiguration");
                    throw null;
                }
                cVar.f20543a = (c1m.c) aVar;
            } else {
                continue;
            }
        }
    }
}
