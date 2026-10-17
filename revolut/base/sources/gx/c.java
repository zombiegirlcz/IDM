package gx;

import android.content.Context;
import b9.w2;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes16.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ri0.a f147607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f147608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sw.c f147609c;
    public final th0.a d;
    public final gff.a e;
    public final gff.a f;

    public c(th0.a aVar, ri0.a aVar2, sw.c cVar, Context context) {
        this.f147607a = aVar2;
        this.f147608b = context;
        this.f147609c = cVar;
        this.d = aVar;
        int i = 4;
        this.e = new gff.a(this, 0, i);
        this.f = new gff.a(this, 1, i);
    }

    public final w2 a() {
        d4m.a aVarA = e4m.b.a(this.e);
        d4m.a aVarA2 = e4m.b.a(this.f);
        ex.b bVar = new ex.b();
        fx.a aVar = new fx.a();
        sw.c cVar = this.f147609c;
        zw.e eVarD = cVar.d();
        s.j(eVarD);
        nw.c cVar2 = (nw.c) cVar.i.get();
        s.j(cVar2);
        w2 impl = new w2(aVarA, aVarA2, bVar, this.f147608b, aVar, eVarD, cVar2);
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(impl, "impl");
        return impl;
    }

    public final kdh.b b() {
        return new kdh.b(new ex.b(), this.d.e());
    }
}
