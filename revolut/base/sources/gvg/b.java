package gvg;

import e4m.e;
import kotlin.jvm.internal.Intrinsics;
import vc.s;
import xe0.f;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final an0.c f147158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ee0.a f147159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nj0.a f147160c;
    public final zdl.c d;
    public final b e = this;
    public final e f = e4m.b.b(new gp8.c(this, 8));

    public b(ee0.a aVar, nj0.a aVar2, an0.c cVar, zdl.c cVar2) {
        this.f147158a = cVar;
        this.f147159b = aVar;
        this.f147160c = aVar2;
        this.d = cVar2;
    }

    public final xe0.e a() {
        yk0.a databaseSessionProvider = this.f147158a.b();
        s.j(databaseSessionProvider);
        ee0.a aVar = this.f147159b;
        je0.d mapper = aVar.d();
        s.j(mapper);
        f storageFactory = aVar.f();
        s.j(storageFactory);
        jvg.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.f(storageFactory, databaseSessionProvider, "performance_benchmarks", mapper, 1, f0.f322471a, 32);
    }
}
