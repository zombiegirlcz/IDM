package ai0;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends gi0.b implements ah0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rg.c f5147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f5148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f5149c;

    public e(rg.c internal, k msMap, Context context) {
        Intrinsics.checkNotNullParameter(internal, "internal");
        Intrinsics.checkNotNullParameter(msMap, "msMap");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f5147a = internal;
        this.f5148b = msMap;
        this.f5149c = context;
    }

    public final void a(yv0.k item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(item, "<this>");
        d dVar = new d(item);
        sg.d dVar2 = this.f5147a.d;
        dVar2.t();
        try {
            sg.c cVar = dVar2.f262571b;
            if (cVar.f262569b.F(dVar)) {
                cVar.f262570c.evictAll();
            }
        } finally {
            dVar2.C();
        }
    }

    public final void b() {
        sg.d dVar = this.f5147a.d;
        dVar.t();
        try {
            dVar.F();
        } finally {
            dVar.C();
        }
    }

    public final void c() {
        this.f5147a.a();
    }

    public final void d(yv0.k item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(item, "<this>");
        d dVar = new d(item);
        sg.d dVar2 = this.f5147a.d;
        dVar2.t();
        try {
            dVar2.f262571b.G(dVar);
        } finally {
            dVar2.C();
        }
    }

    public final void e(vr0.d renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(renderer, "<this>");
        Context context = this.f5149c;
        Intrinsics.checkNotNullParameter(context, "context");
        k gmsMap = this.f5148b;
        Intrinsics.checkNotNullParameter(gmsMap, "gmsMap");
        Intrinsics.checkNotNullParameter(this, "clusterManager");
        g gVar = new g(context, gmsMap, this, renderer);
        rg.c cVar = this.f5147a;
        tg.m mVar = cVar.e;
        mVar.o = null;
        mVar.f271037p = null;
        cVar.f253991c.a();
        cVar.f253990b.a();
        rg.c cVar2 = cVar.e.f271030c;
        ug.b bVar = cVar2.f253990b;
        bVar.e = null;
        bVar.f279913c = null;
        bVar.d = null;
        ug.b bVar2 = cVar2.f253991c;
        bVar2.e = null;
        bVar2.f279913c = null;
        bVar2.d = null;
        cVar.e = gVar;
        gVar.c();
        tg.m mVar2 = cVar.e;
        mVar2.o = cVar.k;
        mVar2.getClass();
        cVar.e.getClass();
        tg.m mVar3 = cVar.e;
        mVar3.f271037p = cVar.f253994j;
        mVar3.getClass();
        cVar.e.getClass();
        cVar.a();
    }

    @Override // ah0.e
    public final void onCameraIdle() {
        this.f5147a.onCameraIdle();
    }
}
