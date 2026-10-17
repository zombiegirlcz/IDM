package z01;

import c21.e;
import je0.d;
import kotlin.jvm.internal.Intrinsics;
import qgk.i3;
import vc.s;
import xe0.f;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final an0.c f318163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ee0.a f318164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ite.a f318165c;
    public final e d;
    public final i3 e;
    public final a f = this;

    public a(i11.a aVar, ee0.a aVar2, e eVar, ite.a aVar3, i3 i3Var, an0.c cVar) {
        this.f318163a = cVar;
        this.f318164b = aVar2;
        this.f318165c = aVar3;
        this.d = eVar;
        this.e = i3Var;
    }

    public final xe0.e a() {
        yk0.a databaseSessionProvider = this.f318163a.b();
        s.j(databaseSessionProvider);
        ee0.a aVar = this.f318164b;
        d mapper = aVar.b();
        s.j(mapper);
        f storageFactory = aVar.f();
        s.j(storageFactory);
        l11.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.f(storageFactory, databaseSessionProvider, "crypto_challenge_storage", mapper, 0, null, 56);
    }
}
