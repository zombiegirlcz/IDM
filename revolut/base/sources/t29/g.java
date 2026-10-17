package t29;

import com.revolut.feature.lifestyle.core.impl.network.LifestyleHomeService;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import o29.z;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f267490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f267491b;

    public g(h hVar, int i) {
        this.f267490a = hVar;
        this.f267491b = i;
    }

    @Override // phm.a
    public final Object get() {
        h hVar = this.f267490a;
        int i = this.f267491b;
        switch (i) {
            case 0:
                je0.d mapper = hVar.f267492a.b();
                vc.s.j(mapper);
                yk0.a databaseSecurityProvider = hVar.f267493b.b();
                vc.s.j(databaseSecurityProvider);
                xe0.f storageFactory = hVar.f267492a.f();
                vc.s.j(storageFactory);
                v.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSecurityProvider, "databaseSecurityProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSecurityProvider, "lifestyle_savings", mapper, 2, zhm.u.c(f29.c.d), 32);
            case 1:
                v.Companion.getClass();
                return new ne0.d();
            case 2:
                je0.d mapper2 = hVar.f267492a.d();
                vc.s.j(mapper2);
                yk0.a databaseSecurityProvider2 = hVar.f267493b.b();
                vc.s.j(databaseSecurityProvider2);
                xe0.f storageFactory2 = hVar.f267492a.f();
                vc.s.j(storageFactory2);
                x.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper2, "mapper");
                Intrinsics.checkNotNullParameter(databaseSecurityProvider2, "databaseSecurityProvider");
                Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                return xe0.f.f(storageFactory2, databaseSecurityProvider2, "lifestyle_wrapped", mapper2, 0, null, 56);
            case 3:
                x.Companion.getClass();
                return new ne0.d();
            case 4:
                o29.e eVar = (o29.e) hVar.f267498l.get();
                f39.c cVarA = hVar.d.a();
                vc.s.j(cVarA);
                return new u29.d(eVar, cVarA);
            case 5:
                return new o29.m((LifestyleHomeService) hVar.k.get(), (ne0.j) hVar.f.get(), (ue0.c) hVar.e.get());
            case 6:
                ik0.b bVarM = ((nj0.d) hVar.f267494c).m();
                vc.s.j(bVarM);
                return n.a(bVarM, (Converter.Factory) hVar.f267497j.get());
            case 7:
                return q.a((Json) hVar.i.get());
            case 8:
                ee0.a aVar = hVar.f267492a;
                return sg8.j.h(new w29.b(fe0.d.a(), 0));
            case 9:
                z zVar = (z) hVar.o.get();
                f39.c cVarA2 = hVar.d.a();
                vc.s.j(cVarA2);
                return new u29.q(zVar, cVarA2);
            case 10:
                return new z((LifestyleHomeService) hVar.k.get(), (ne0.j) hVar.f267496h.get(), (ue0.c) hVar.f267495g.get(), (o29.v) hVar.f267500n.get());
            case 11:
                return new o29.w();
            default:
                throw new AssertionError(i);
        }
    }
}
